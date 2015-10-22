(function (){
	var app = angular.module('salespusher', [
		'ngRoute',
		'ngResource',
		'salespusher.controllers',
		'salespusher.resources'
	])
	.config(function($routeProvider, $httpProvider) {
		$routeProvider
		.when('/', {
			templateUrl : '/templates/partials/_home.html',
			controller : 'HomeCtrl'
		})
		.when('/login', {
			templateUrl : '/templates/partials/_login.html',
			controller : 'NavigationCtrl'
		})
		.when('/users',{
			templateUrl: '/templates/partials/_users.html',
			controller: 'UsersCtrl'
		})
		.when('/products',{
			templateUrl: '/templates/partials/_products.html',
			controller: 'ProductsCtrl'
		})
		.otherwise('/');
		
		/* disable basic http authentication dialog */
		$httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';	
	})
})();
