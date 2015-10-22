(function(){
	angular.module('salespusher.controllers').controller('ProductsCtrl',['$scope','$http', '$routeParams','Product',function($scope,$http,$routeParams,Product){
		$scope.products = Product.query();
		
		$scope.getProduct = function(id){
			$http.get('/products/'+ $routeParams.id).success(function(data){
				var str = JSON.stringify(data, null, 2); 
				$scope.product = data;
				console.log(str);
			})
			.error(function(data){
				console.log(data);
			});
		}
	}]);
})();