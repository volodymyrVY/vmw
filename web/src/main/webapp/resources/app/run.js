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
angular.module('runModule',['ui.bootstrap']);