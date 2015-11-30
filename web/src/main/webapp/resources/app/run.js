/**
 * Created by vyakymiv on 30.11.15.
 */



var runModule = angular.module('runModule',[]);
angular.module("runModule").controller("def", function($scope){

     $scope.text = "0"

    if ($scope.input!='undefined'){
        $scope.text = $scope.input;
    }


});