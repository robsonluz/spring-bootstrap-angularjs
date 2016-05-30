var app = angular.module('app', ['ngResource', 'ngRoute']);

/**
 * Configuração das Rotas (páginas do sistema)
 */
app.config(['$routeProvider', function($routerProvider){
	$routerProvider
		.when('/', {
			templateUrl: 'home.html'
		})
		
		.when('/noticias', {
			templateUrl: 'noticias-list.html',
			controller: 'NoticiaListController'
		})
	;
}]);


//NoticiaService
app.factory('NoticiaService', function($resource) {
	return $resource('/api/noticias/:id', {}, {});
});

//NoticiaListController
app.controller('NoticiaListController', function($scope, NoticiaService) {
	$scope.noticias = NoticiaService.query();	
});

