(function(){
	angular.module('salespusher.controllers').controller('UsersCtrl',['$rootScope','$scope','$http', function($rootScope,$scope,$http){
		$scope.getUsers = function(){
			$http.get('/users').success(function(data){
				console.log("All Users' information:");
				var str = JSON.stringify(data, null, 2); 
				console.log(str);
			})
			.error(function(data){
			});
		}
	}]);
})();
