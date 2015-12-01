/*
 angular.module('runModule',['ui.bootstrap']).config(function($routeProvider){
 $routeProvider
 .when('/',{
 templateUrl:'app/index.html'
 })
 /!*.when('/home',{
 templateUrl:'app/index.html',
 controller: 'WelcomeController'
 })*!/
 .when('/about', {
 templateUrl: 'app/welcome/about.html'
 /!*controller: 'WelcomeController'*!/
 })
 .otherwise({ redirectTo: '/'});
 });*/
/*angular.module('runModule',['ui.bootstrap']);*/


var app = angular.module('runModule', ['ui.bootstrap', 'ui.directives']).config(function () {
   /* $routeProvider
        .when('/', {
            templateUrl: 'app/index.html'
        })
        .when('/about', {
            templateUrl: 'app/welcome/about.html'
                .otherwise({redirectTo: '/'})
        })*/
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

        $scope.toggled = function(open) {
            $log.log('Dropdown is now: ', open);
        };

        $scope.toggleDropdown = function($event) {
            $event.preventDefault();
            $event.stopPropagation();
            $scope.status.isopen = !$scope.status.isopen;
        };
    });
