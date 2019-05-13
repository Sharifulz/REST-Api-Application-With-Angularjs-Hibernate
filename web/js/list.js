demoApp = angular.module("myApp", []);

demoApp.controller("myCtrl", function($scope){
        $scope.records = [
           "Kamal Pervez",
            "Isteauk Uddin Ahmed",
            "Rafi Ahmed",
            "Jakir Hossain"
        ];
    });

demoApp.controller("myRestApiCall", function($scope, $http){
  var response = $http.get('');
      response.success(function(data){
          $scope.name = 'AL HASIB';
                                                        // To Print on Console
          console.log("[main] # of items: " + data.length);
          angular.forEach (data, function(element){
              console.log("[main] actor : "+ element.name);
          });
      });
});





