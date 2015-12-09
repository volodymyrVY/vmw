 var app = angular.module('welcomeModule', ['ui.bootstrap', 'ui.directives', 'ui.router'])
        .config(function ($stateProvider, $urlRouterProvider, $locationProvider) {
            $locationProvider.html5Mode(true);
            $urlRouterProvider.otherwise("/");
            $stateProvider
                .state('about', {
                    url: "/about",
                    templateUrl: "/resources/app/welcome/view/about.html"

                })
                .state('welcome', {
                    url: "/",
                    templateUrl: "/resources/app/welcome/view/welcome.html"
                });


        });

    app.controller('MainCtrl', function ($scope) {
        $scope.name = 'World';
    });

    app.controller('DropdownCtrl', function ($scope, $log) {

        $scope.items = [
            'The first choice!',
            'And another choice for you.',
            'but wait! A third!'
        ];

        $scope.status = {
            isopen: false
        };

        $scope.toggled = function (open) {
            $log.log('Dropdown is now: ', open);
        };

        $scope.toggleDropdown = function ($event) {
            $event.preventDefault();
            $event.stopPropagation();
            $scope.status.isopen = !$scope.status.isopen;
        };
    });


