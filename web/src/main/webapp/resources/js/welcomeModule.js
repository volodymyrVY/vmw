(function() {
    angular
        .module(
        'welcomeModule',[]);
        angular
            .module('welcomeModule')
            .controller('NavigationController', ['$scope', '$location',
                function ($scope, $location) {
                    $scope.loaded = true;
                    $scope.isActive = function (viewLocation) {
                        return viewLocation === $location.path();
                    };
                }]);

        angular
            .module('welcomeModule')
            .controller('test', ['$scope',
                function ($scope) {

                        $scope.result = "ok!"



                }]);
    }
)();


