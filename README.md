Aeronatica
Un proyecto donde se ejemplifica el uso del patrón PageObjec usando serenity  BDD con cucumber y gradle.

Las pruebas de este ejemplo se corren contra la página web https://www.aerocivil.gov.co/

Por defecto, los tests corren en Chrome, así que es necesario tener instalada la versión del chrome driver del equipo donde se correrá y tenerla agregada en la ruta del proyecto
\src\test\resources\webdriver
La estructura completa del proyecto es la siguiente:

+ model:
    Clases que usan el patrón Page object builder o relcionadas con el modelo de dominio
+ stepsDefinitions:
    Clase que representan tareas que realiza el actor a nivel de proceso de negocio
+ steps:
    Clase que permite la comunicacion entre los features de cucumbre y las clases del patron Page Object 
+ interacion: 
    Clases que representan las interacciones directas con la interfaz de usuario
+ validación de Resultados: (clases que  que contiene la palabra resultado)
    Clases que representan las validaciones de los resultados de los tests.  
+ user_interface:
    Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario
+ features:
    Archivo de cucumber con la definición de los casos de prueba de la aplicación Wappi
    
Requerimientos:
Para correr el proyecto se necesita Java JDK 1.8 y Gradle preferiblemente con la versión 4.7.

Para correr el proyecto:
clean test aggregate es el comando que correrá los tests y generará el reporte en la carpeta /target/site/serenity/

## repositorio 

Git:
    
   



## Use Maven:

Abrir el commando window y correr:

    mvn clean verify

## Use Gradle:

Abrir el commando window y correr:

    gradlew test 


## Visualizando los reportes:
Los comandos mencionados anteriormente generaran el reporte de Serenity test en el directorio `target/site/serenity` 


