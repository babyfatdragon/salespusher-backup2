(function(){
	angular.module("salespusher.resources").factory("Product", function ProductFactory($resource) {  
		return $resource("/products/:id", {}, {});
	});
})();