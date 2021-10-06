# Curva hecho con líneas rectas

El programa fue escrito en el lenguaje de programación Java con ayuda del entorno de desarrollo NetBeans. En las siguientes líneas se presenta una descripción de cada captura de pantalla que fue tomada al código fuente, esto con el fin de que el lector pueda comprender el manejo de las funciones.
Finalmente se presenta los resultados del programa, en este caso un screenshot donde se puede aprecia la curva formada a partir de las intersecciones entre líneas rectas.

### Código Fuente

En la figura 1 se presentan las librerías importadas.

**Figura 1**

_Librerías importadas._

![image](https://user-images.githubusercontent.com/71055467/136229685-243ae58f-57fa-4eb3-9e9e-30b204f43688.png)

La clase principal se llama Lineas la cual hereda de JFrame, con esto nos permite dibujar la ventana. En esta clase se encuentra una declaración de variables, el constructor y unas clases que más adelante se explica.

**Figura 2**

_Clase principal._

![image](https://user-images.githubusercontent.com/71055467/136229866-683629fa-daac-4dfb-a820-1057431b8699.png)

En el constructor de la clase principal se determinan características de la ventana como son; alto, ancho, localización, título, entre otros.

**Figura 3**

_Constructor de la clase Lineas._

![image](https://user-images.githubusercontent.com/71055467/136229941-d30e5c8b-b427-442c-a67f-fb1a343c2f04.png)

La función main es una de las funciones principales en cualquier programa elaborado en Java, a continuación, se muestra una captura del código donde se puede ver que dentro de ella se instancia la clase Lineas y se determinan ciertas características.

**Figura 4**

_Función main._

![image](https://user-images.githubusercontent.com/71055467/136230041-1458a3a7-ce0c-4cce-8b5b-c375be57ce30.png)

La clase GraphicListener implementa la interfaz GLEventListener que a su vez contiene una serie de funciones que son útiles para pintar los puntos.
El primero de los métodos que podemos ver en el código es init. Este ayuda a definir las características que va a tener la ventana en donde se irán pintando en este caso los puntos. Una de las características con el color de fondo, dimensiones, así como el modo proyección.

**Figura 5**

_Clase GraphicListener con el método init._

![image](https://user-images.githubusercontent.com/71055467/136230136-e2858cce-a08d-4b44-b67f-971cab67869e.png)

La función siguiente (display) es una de las más importantes para este programa debido a que es en esta parte donde se definen las características para que las líneas sean pintadas de manera correcta en el lienzo.
A continuación, se muestra las características principales de las líneas como el color y altura y posteriormente se muestra una parte del código de cómo es que fue pintado en el lienzo. Si se desea ver el código fuente completo se recomienda ir a la carpeta correspondiente.

**Figura 6**

_Método display (sólo una parte)._

![image](https://user-images.githubusercontent.com/71055467/136230242-85198feb-b9ac-4053-9990-98fce3919df3.png)

Los últimas dos métodos son parte de la interfaz GLEventListener pero en esta ocasión no haremos uso de ella.

**Figura 7**

_Método reshape() y displayChanged()._

![image](https://user-images.githubusercontent.com/71055467/136230311-33e49f13-61d5-466d-a50d-8a241814d16b.png)

### Ejecución del programa

En la captura siguiente se muestra la ejecución del programa, podemos ver que efectivamente el programa realiza el objetivo planteado.

**Figura 8**

_Ventana en Java que muestra una curva a partir de las líneas que se intersecan._

![image](https://user-images.githubusercontent.com/71055467/136230408-90349d23-37b4-4c3d-9678-24e53158b2bd.png)
