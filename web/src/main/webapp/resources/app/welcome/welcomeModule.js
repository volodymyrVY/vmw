(function() {
    var app = angular.module('welcomeModule', ['ui.bootstrap', 'ui.directives', 'ui.router'])
        .config(function ($stateProvider, $urlRouterProvider, $locationProvider) {
            $locationProvider.html5Mode(true);
            /* $urlRouterProvider.otherwise("/");
             $stateProvider
             .state('about', {
             url: "/about",
             templateUrl: "/resources/app/welcome/routeTest.html"

             })
             .state('welcome', {
             url: "/",
             templateUrl: "/resources/app/welcome/test.html"
             });*/


        });
})