var app = angular.module('app', ['ngResource']);

//NoticiaService
app.factory('NoticiaService', function($resource) {
	return $resource('/api/noticias/:id', {}, {});
});

//NoticiaListController
app.controller('NoticiaListController', function($scope, NoticiaService) {
	$scope.noticias = NoticiaService.query();	
});

