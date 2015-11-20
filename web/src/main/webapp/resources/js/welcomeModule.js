(function() {
    angular
        .module(
        'welcomeModule').config(
        [
            '$translateProvider',
            '$stateProvider',
            '$urlRouterProvider',
            'showErrorsConfigProvider',

            function($translateProvider, $stateProvider,
                     $urlRouterProvider,
                     showErrorsConfigProvider) {

                showErrorsConfigProvider.showSuccess(true);


                $translateProvider.useLocalStorage();
                $translateProvider
                    .useSanitizeValueStrategy('escaped');
                $translateProvider.preferredLanguage('ukr');
                /**
                 * Routing configuration.
                 */
                $urlRouterProvider.otherwise('/start');

                $stateProvider
                    .state(
                    'start',
                    {
                        url : '/start',
                        templateUrl : '/resources/app/welcome/views/start.html',
                        controller: 'WelcomePageController'

                    })
            } ]);
    define([
            'controllers/NavigationController'],
        function() {
        });
        angular
            .module('welcomeModule')
            .controller('NavigationController', ['$scope', '$location',
                function ($scope, $location) {
                    $scope.loaded = true;
                    $scope.isActive = function (viewLocation) {
                        return viewLocation === $location.path();
                    };
                }]);
    }
)();


