 angular
        .module('welcomeModule')
        .controller('WelcomePageController', ['$scope', function ($scope) {
            $scope.myInterval = 3000;
            $scope.slides = [];


            $scope.slides = [
                {
                    image: 'resources/app/welcome/assets/img/1.jpg'
                },
                {
                    image: 'resources/app/welcome/assets/img/2.jpg'
                },
                {
                    image: 'resources/app/welcome/assets/img/3.jpg'
                }
            ];
        }]
    );