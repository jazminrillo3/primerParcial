# API REST con Base de Datos H2 y Swagger
Este proyecto es una API REST que utiliza una base de datos H2 para gestionar las entidades Autor, Libro, Localidad, Domicilio y Persona. La API está documentada utilizando Swagger, lo que te permite explorar y probar fácilmente los puntos finales de la API.

## Instalación

Para instalar la API, siga los siguientes pasos:

1. Clonar el repositorio de GitHub:
git clone https://github.com/jazminrillo3/Parcial1Prog 
2. Importar el proyecto en su IDE.
5.Ejecutar la aplicación.

## Documentación
La documentación de la API se genera con Swagger y se puede acceder a través de la siguiente URL:
http://localhost:8080/swagger-ui.html

## Base de datos H2
Se puede acceder a través de la siguiente URL:
http://localhost:8080/h2-console/

## Estructura del Proyecto
El proyecto está estructurado en varias carpetas:

### Carpeta entities
Contiene las clases que representan las entidades de la aplicación: `Autor`, `Libro`, `Localidad`, `Domicilio` y `Persona`.

### Carpeta repositories
Esta carpeta contiene los siguientes archivos:
#### BaseRepository
Interfaz genérica que extiende `JpaRepository`.
#### EntidadRepository
Para cada entidad, hay un repositorio correspondiente que extiende de `BaseRepository`.

### Carpeta services
Esta carpeta alberga:
#### BaseService 
Interfaz genérica que define las operaciones CRUD básicas: `findAll`, `findById`, `save`, `delete`, `update`.
#### BaseServiceImpl  
Clase abstracta que proporciona una implementación genérica de las operaciones declaradas en la interfaz `BaseService`.
#### EntidadService
Además, para cada entidad, hay un servicio específico(interfaz) que extiende de `BaseServiceImpl`. Estos servicios pueden declarar métodos adicionales específicos para sus entidades correspondientes.
#### EntidadServiceImpl
Clase que proporciona una implementación de las operaciones específicas de la interfaz `Service`.

Carpeta controllers
Esta carpeta contiene los siguientes archivos:
#### BaseController
Interfaz genérica que extiende define los métodos: `getAll`, `getOne`, `save`, `delete`, `update`, y les asigna un endpoint a cada uno para poder acceder mediante una petición HTTP.
#### BaseControllerImpl
Clase abstracta que implementa `BaseController` y proporciona una implementación genérica de las operaciones declaradas. 
#### EntidadController
Por último, tiene un archivo `Controller` para cada entidad, que extiende de `BaseControllerImpl` para agregar cualquier método específico para esa entidad.

## Uso
Para utilizar esta API:

1. Inicie la aplicación.
2. Abra Swagger UI en su navegador.
3. Realice peticiones a la API utilizando los endpoints detallados en los controladores.
4. Corra la base de datos H2 y observe los cambios producidos en las tablas.
