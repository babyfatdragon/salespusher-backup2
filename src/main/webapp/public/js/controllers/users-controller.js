(function(){
	angular.module('salespusher.controllers').controller('UsersCtrl',['$rootScope','$scope','$http', function($rootScope,$scope,$http){
		var users = this;
		users.members = [];
		this.haha = [{username:"a"},{username:"b"}];
		$scope.getUsers = function(){
			$http.get('/users').success(function(data){
				console.log("All Users' information:");
				var str = JSON.stringify(data, null, 2); 
				users.members = data;
				console.log(str);
			})
			.error(function(data){
			});
		}
		
		$scope.getUser = function(){
			$http.get('/user').success(function(data){
				console.log("Current user information:");
				var str = JSON.stringify(data, null, 2);
				console.log(str);
			}).error(function(){
				
			});
		}
	}]);
})();
