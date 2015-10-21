(function (){
	var app = angular.module('salespusher', [
		'ngRoute',
		'salespusher.controllers'
	])
	.config(function($routeProvider, $httpProvider) {
		$routeProvider
		.when('/', {
			templateUrl : '/partials/_home.html',
			controller : 'HomeCtrl'
		})
		.when('/login', {
			templateUrl : '/partials/_login.html',
			controller : 'NavigationCtrl'
		})
		.when('/users',{
			templateUrl: '/partials/_users.html',
			controller: 'UsersCtrl',
			controllerAs: 'users'
		})
		.otherwise('/');
		$httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';	//disable basic http authentication dialog
	})
})();
