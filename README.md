# LABORATORIO 2 - PATTERNS

## EJERCICIO DE LAS FIGURAS
### CREAR UN PROYECTO CON MAVEN
1. Buscar cómo se crea un proyecto maven con ayuda de los arquetipos (archetypes).

- Nos dirigimos a la página oficial de **Apache Maven** en el apartado de **Maven Plugins** y allí ubicamos el apartado de **Tools** y seleccionamos **archetype** allí encontramos un ejemplo de creacion de un proyecto **Maven** con la siguiente estructura.
  - mvn archetype:generate
  - mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.5
  - edu.eci.cvds
  - Patterns
  - edu.eci.cvds.patterns.archetype

[![0a3b650d-087a-4f38-91fa-c5126521cbd8.jpg](https://i.postimg.cc/BQpHvH5K/0a3b650d-087a-4f38-91fa-c5126521cbd8.jpg)](https://postimg.cc/nCsCRsPF)
-------------------------------------------------------------------------
[![imagen-2025-02-05-220928008.png](https://i.postimg.cc/ZRP0MzVd/imagen-2025-02-05-220928008.png)](https://postimg.cc/qhRkNSfJ)

## AJUSTAR ALGUNAS CONFIGURACIONES EN EL PROYECTO

[![6dd3545e-2808-4add-a9b5-4e9585c6fd39.jpg](https://i.postimg.cc/cJBSq1G0/6dd3545e-2808-4add-a9b5-4e9585c6fd39.jpg)](https://postimg.cc/R3h8KB0D)

## COMPILAR Y EJECUTAR

[![2b436f85-6fb8-4731-b9c8-daf9114d44b1.jpg](https://i.postimg.cc/2yMpdVhF/2b436f85-6fb8-4731-b9c8-daf9114d44b1.jpg)](https://postimg.cc/FkynNFP7)
-------------------------------------------------------------------------------

[![a.jpg](https://i.postimg.cc/0ypgm5QD/a.jpg)](https://postimg.cc/w1TbYpDj)

1. Busque cuál es el objetivo del parámetro "package" y qué otros parámetros se podrían enviar al comando `mvn`.

 - validate
 - compile
 - test
 - package
 - verify
 - install
 - deploy

2. Busque cómo ejecutar desde línea de comandos, un proyecto maven y verifique la salida cuando se ejecuta con la clase `App.java` como parámetro en "mainClass". Tip: https://www.mojohaus.org/exec-maven-plugin/usage.html

 - mvn compile exec:java

3. Realice el cambio en la clase `App.java` para crear un saludo personalizado, basado en los parámetros de entrada a la aplicación. 

[![aa.jpg](https://i.postimg.cc/vmfWbj0Q/aa.jpg)](https://postimg.cc/2qjqxHpJ)

4. Utilizar la primera posición del parámetro que llega al método "main" para realizar elsaludo personalizado, en caso que no sea posible, se debe mantener el saludo como se encuentra actualmente:

[![ss.jpg](https://i.postimg.cc/d19rTCMp/ss.jpg)](https://postimg.cc/34ddsdxF)

5. Buscar cómo enviar parámetros al plugin "exec".

 - **https://www.mojohaus.org/exec-maven-plugin/usage.html**

 [![tt.png](https://i.postimg.cc/hjMQGqTq/tt.png)](https://postimg.cc/622pHgMH)

6. Ejecutar nuevamente la clase desde línea de comandos y verificar la salida: Hello World!

[![ii.jpg](https://i.postimg.cc/4Nj7yP7n/ii.jpg)](https://postimg.cc/6yL51dhN)

7. Ejecutar la clase desde línea de comandos enviando su nombre como parámetro y verificar la salida. Ej: Hello Pepito!

[![rr.jpg](https://i.postimg.cc/BbYFmGnC/rr.jpg)](https://postimg.cc/64ZTQgR7)

8. Ejecutar la clase con su nombre y apellido como parámetro. ¿Qué sucedió?

 - Sigue saliendo solo el "Hellow" con solo el primer nombre, no sale lo requerido.

[![rr.jpg](https://i.postimg.cc/BbYFmGnC/rr.jpg)](https://postimg.cc/64ZTQgR7)

9. Verifique cómo enviar los parámetros de forma "compuesta" para que el saludo se realice con nombre y apellido.

 - exec.args

10. Ejecutar nuevamente y verificar la salida en consola. Ej: Hello Pepito Perez!

[![rty.jpg](https://i.postimg.cc/jSrxBFn6/rty.jpg)](https://postimg.cc/dL4cynBD)

## HACER EL ESQUELETO DE LA APLICACIÓN

1. Cree el paquete `edu.eci.cvds.patterns.shapes` y el paquete `edu.eci.cvds.patterns.shapes.concrete`.



2. Cree una interfaz llamada `Shape.java` en el directorio `src/main/java/edu/eci/cvds/patterns/shapes` de la siguiente manera:

[![tyytjhjg.png](https://i.postimg.cc/26V3C9dH/tyytjhjg.png)](https://postimg.cc/wyY9VVGJ) 

3. Cree una enumeración llamada `RegularShapeType.java` en el directorio `src/main/java/edu/eci/cvds/patterns/shapes` así:

[![mz.png](https://i.postimg.cc/NMHYN3kw/mz.png)](https://postimg.cc/S2kwRtPZ)

4. En el directorio `src/main/java/edu/eci/cvds/patterns/shapes/concrete` cree las diferentes clases (Triangle, Quadrilateral, Pentagon, Hexagon), que implementen la interfaz creada y retornen el número correspondiente de vértices que tiene la figura. 

[![xx.png](https://i.postimg.cc/MKs4Qs10/xx.png)](https://postimg.cc/hfdpF1yh)

5. Cree el archivo `ShapeMain.java` en el directorio `src/main/java/edu/eci/cvds/patterns/shapes` con el metodo main:

[![xc.png](https://i.postimg.cc/d1BnK1BR/xc.png)](https://postimg.cc/TLKnVTBh)

6. Analice y asegúrese de entender cada una de las instrucciones que se encuentran en todas las clases que se crearon anteriormente. Cree el archivo `ShapeFactory.java` en el directorio `src/main/java/edu/eci/cvds/patterns/shapes` implementando el patrón fábrica (Hint: https://refactoring.guru/design-patterns/catalog), haciendo uso de la instrucción switch-case de Java y usando las enumeraciones.

[![mm.png](https://i.postimg.cc/ZqmrKm0w/mm.png)](https://postimg.cc/K19KJdPT)

7. ¿Cuál fábrica hiciste? y ¿Cuál es mejor?

 - Factory Simple Method 
 - Con este modelo de refactorización podemos seguir en este caso una estructura Optima de construcción de acuerdo a lo misto en clase como el principio SOLID.

8. Ejecute múltiples veces la clase ShapeMain, usando el plugin exec de maven con los siguientes parámetros y verifique la salida en consola para cada una:
- Sin parámetros

[![sin-parametros.png](https://i.postimg.cc/2y71kJTM/sin-parametros.png)](https://postimg.cc/Lgh9vxc3)

- Parámetro: qwerty

[![mts.jpg](https://i.postimg.cc/s2Pbv3mx/mts.jpg)](https://postimg.cc/B86mz9df)

- Parámetro: pentagon

[![mtss.jpg](https://i.postimg.cc/prrSGzH5/mtss.jpg)](https://postimg.cc/7JvXbCbq)

- Parámetro: Hexagon

[![Hex.png](https://i.postimg.cc/Ssb5qzwj/Hex.png)](https://postimg.cc/B8NNBtZG)

¿Cuál(es) de las anteriores instrucciones se ejecutan y funcionan correctamente y por qué?

- Parámetro: qwerty
- Parámetro: Hexagon

Al ingresar estos parámetros y compilarlos se ejecutan correctamente ya que en la clase **ShapeFactory** la entrada de cada una de las figuras esta con mayúscula.

 
