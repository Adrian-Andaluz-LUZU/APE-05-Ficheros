# APE 05 – Lectura de archivos y procesamiento de información

## Ejercicio 1: Agencia de detectives – Análisis de pistas
**Tema:** Lectura de archivos línea por línea.

### Enunciado
Una agencia de detectives almacena las pistas de una investigación en un archivo llamado pistas.txt. Desarrolla un programa en Java que permita leer todas las pistas línea por línea, mostrarlas en pantalla y contar cuántas pistas contiene el archivo.

### Descripción de la resolución
Para resolver este ejercicio, se utiliza un archivo de texto llamado pistas.txt que contiene diferentes pistas de una investigación. Se implementa un mecanismo de lectura que permite recorrer el archivo línea por línea, mostrando cada pista en la consola. Además, se utiliza una variable contador que aumenta cada vez que se lee una nueva línea, permitiendo conocer la cantidad total de pistas almacenadas. Finalmente, se muestra el número total de pistas encontradas en el archivo.

### Evidencia de ejecución
<img width="369" height="113" alt="image" src="https://github.com/user-attachments/assets/235a9ea1-3972-4e50-b00e-5fb9e4841f73" />

---

## Ejercicio 2: Estación espacial – Descifrado de mensajes
**Tema:** Lectura de archivos carácter por carácter.

### Enunciado
Una estación espacial recibe un mensaje de emergencia almacenado en mensaje.txt. Desarrolla un programa que lea el archivo carácter por carácter utilizando FileReader y el método read(), muestre su contenido y contabilice el número total de caracteres.

### Descripción de la resolución
Para resolver este ejercicio, se utiliza la clase FileReader para establecer un flujo de lectura desde el archivo mensaje.txt. Mediante el método read(), se obtiene cada carácter del archivo de manera individual. Se implementa una estructura repetitiva que permite recorrer todo el contenido hasta alcanzar el final del archivo. Durante el proceso, cada carácter se muestra en pantalla y se incrementa un contador para registrar la cantidad total de caracteres leídos. Finalmente, se presenta el contenido del mensaje y el número total de caracteres.

### Evidencia de ejecución
<img width="596" height="72" alt="image" src="https://github.com/user-attachments/assets/619c12b3-6d1f-49a0-8adb-fd3975bc9bae" />

---


## Ejercicio 3: Museo digital – Registro de obras
**Tema:** Lectura y clasificación de información.

### Enunciado
Un museo almacena información de sus obras de arte en un archivo llamado obras.txt.

Cada línea contiene el nombre de una obra y su categoría. Desarrolla un programa que lea los registros, muestre las obras y clasifique cuántas pertenecen a cada categoría.

### Descripción de la resolución
Para resolver este ejercicio, se utiliza el archivo obras.txt, que contiene los nombres de las obras de arte junto con sus respectivas categorías. Se implementa un mecanismo de lectura que permite recorrer los registros almacenados y mostrar la información de cada obra en pantalla. Posteriormente, se identifica la categoría correspondiente a cada registro y se utilizan variables contadoras para clasificar y contabilizar cuántas obras pertenecen a cada categoría. Finalmente, se muestran los resultados de la clasificación y la cantidad total de obras registradas por categoría.

### Evidencia de ejecución
<img width="586" height="174" alt="image" src="https://github.com/user-attachments/assets/8b91ec49-d576-473b-850c-fee9698b4ece" />

---

## Ejercicio 4: Parque de aventuras – Resultados de participantes
**Tema:** Lectura de archivos con BufferedReader y procesamiento de datos.

### Enunciado
Un parque de aventuras almacena los nombres y puntajes de sus participantes en un archivo llamado resultados.txt. Desarrolla un programa que lea la información utilizando BufferedReader, muestre los participantes, calcule el puntaje total e identifique el puntaje más alto.

### Descripción de la resolución
Para resolver este ejercicio, se utiliza la clase BufferedReader para leer la información almacenada en el archivo resultados.txt. Se recorren los registros para obtener los nombres y puntajes de los participantes, mostrando cada uno en la consola. Durante la lectura, se utiliza una variable acumuladora para calcular el puntaje total y otra variable para identificar el puntaje más alto registrado. Finalmente, se muestran los participantes, el puntaje acumulado y el puntaje máximo obtenido.

### Evidencia de ejecución
<img width="588" height="164" alt="image" src="https://github.com/user-attachments/assets/95d239f7-5bea-4d38-a18c-5f166d56e97a" />

---

## Ejercicio 5: Biblioteca inteligente – Administración de libros

**Tema:** Escritura y lectura de archivos con FileWriter, BufferedWriter y BufferedReader.

### Enunciado

Una biblioteca necesita administrar sus libros mediante un archivo llamado libros.txt. Desarrolla un programa en Java que permita registrar nuevos libros, agregar información sin eliminar los registros anteriores, leer los títulos almacenados y buscar un libro específico. Además, debe contar los libros registrados y validar que el archivo exista antes de realizar la lectura.

### Descripción de la resolución

Para resolver este ejercicio, se crea un programa con un menú de opciones que se repite hasta que el usuario elige salir. Para registrar un libro se utiliza la clase FileWriter en modo agregar (append = true) junto con BufferedWriter, de modo que cada nuevo título se escribe al final del archivo libros.txt sin eliminar los registros anteriores. Antes de listar, buscar o contar, se utiliza la clase File para validar que el archivo exista; si no existe, se muestra un mensaje al usuario. La lectura se realiza con BufferedReader, recorriendo el archivo línea por línea: para listar se muestran los títulos numerados, para buscar se compara cada título con el ingresado sin distinguir mayúsculas de minúsculas, y para contar se utiliza una variable acumuladora que suma los registros no vacíos. Los posibles errores de entrada y salida se controlan con try-catch (IOException).

### Evidencia de ejecución

<img width="471" height="351" alt="image" src="https://github.com/user-attachments/assets/65ddbfb0-cae6-4308-af44-40a8e5953474" />

---

## Ejercicio 6: Sistema de mensajes secretos

**Tema:** Escritura y lectura de archivos con FileWriter, BufferedWriter, FileReader y BufferedReader.

### Enunciado

Un grupo de investigadores almacena mensajes en un archivo llamado secreto.txt. Desarrolla un programa en Java que permita escribir mensajes utilizando FileWriter y BufferedWriter, agregar nuevos mensajes sin sobrescribir los anteriores y leer su contenido mediante FileReader y BufferedReader. El programa deberá mostrar los mensajes, contar las líneas registradas y controlar posibles errores de entrada y salida.

### Descripción de la resolución

Para resolver este ejercicio, se crea un programa con un menú de opciones que se repite hasta que el usuario elige salir. Para escribir un mensaje se utiliza la clase FileWriter en modo agregar (append = true) junto con BufferedWriter, de modo que cada nuevo mensaje se guarda al final del archivo secreto.txt sin sobrescribir los anteriores. Para leer, primero se utiliza la clase File para validar que el archivo exista; luego se recorre con FileReader y BufferedReader línea por línea, mostrando cada mensaje numerado en la consola. Durante la lectura se utiliza una variable contadora que aumenta con cada línea leída, y al final se muestra el total de líneas registradas. Los posibles errores de entrada y salida se controlan con bloques try-catch (IOException), mostrando un mensaje al usuario en lugar de detener el programa.

### Evidencia de ejecución

<img width="458" height="542" alt="image" src="https://github.com/user-attachments/assets/1aebc4e3-bb71-4bfa-b5cf-767aa520a37e" />

---

# EJERCICIO 7: Competencia de videojuegos

## Enunciado
Una competencia registra los nombres y puntuaciones de sus jugadores en un archivo llamado `jugadores.txt`. Cada línea contiene el nombre del jugador y su puntuación, separados por una coma. Desarrolla un programa que lea los registros, convierta las puntuaciones de texto a números, calcule el promedio, identifique al jugador con mayor puntaje y filtre a los participantes que obtuvieron una puntuación superior a 70. También deberá validar el formato de los registros.

## Descripción de la solución
Se desarrolló un programa en Java que utiliza `FileReader` y `BufferedReader` para leer los datos almacenados en el archivo `jugadores.txt` línea por línea. Mediante el método `split()` se separa el nombre del jugador de su puntuación y con `Integer.parseInt()` se convierte el puntaje de texto a número entero.

El programa calcula el promedio de las puntuaciones, identifica al jugador con el mayor puntaje y muestra únicamente los participantes que obtuvieron más de 70 puntos. Además, utiliza `try-catch` para controlar errores de lectura y `NumberFormatException` para validar los datos numéricos.

### Evidencia de ejecución

<img width="418" height="468" alt="WhatsApp Image 2026-11-16 at 10 11 18 PM" src="https://github.com/user-attachments/assets/0ad363bb-3344-40d0-8f7d-b71c12585133" />

---

# EJERCICIO 8: Control de temperatura

## Enunciado
Una estación meteorológica almacena las temperaturas registradas durante una semana en un archivo llamado `temperaturas.txt`. Desarrolla un programa que permita guardar nuevas temperaturas, leer los registros y convertir los datos almacenados a valores numéricos. El programa deberá calcular la temperatura promedio, identificar la temperatura más alta y determinar cuántos registros superan los 30 grados. Además, deberá controlar los errores cuando los datos no tengan un formato numérico válido.

## Descripción de la solución
Se desarrolló un programa en Java que utiliza `FileWriter` y `BufferedWriter` para guardar nuevas temperaturas en el archivo `temperaturas.txt`, agregando información sin eliminar los registros anteriores.

Para leer los datos se utilizan `FileReader` y `BufferedReader`, que permiten procesar las temperaturas línea por línea. Mediante `Double.parseDouble()` se convierten los valores almacenados en números decimales.

El programa calcula la temperatura promedio, identifica el valor más alto y cuenta cuántos registros superan los 30 grados. Finalmente, utiliza `try-catch` y `NumberFormatException` para controlar posibles errores durante la lectura, escritura y conversión de los datos.

### Evidencia de ejecución

<img width="482" height="483" alt="WhatsApp Image 2026-11-16 at 10 11 32 PM" src="https://github.com/user-attachments/assets/25fa0fc0-4d58-442f-8165-39a79018b433" />

---

## Ejercicio 9: Diario de exploradores – Escritura y lectura con append

**Tema:** Escritura, lectura y búsqueda en archivos de texto (modo *append*).

### Enunciado
Una agencia de exploración almacena los descubrimientos de sus expediciones en un archivo llamado `descubrimientos.txt`. Desarrolla un programa en Java que permita agregar nuevos descubrimientos al final del archivo sin borrar los anteriores, leer y contar todos los registros almacenados, y buscar coincidencias de texto dentro del archivo utilizando `BufferedReader` y `FileWriter`.

### Descripción de la resolución
Para resolver este ejercicio, se implementa un menú interactivo en bucle controlado por opciones. Se utiliza la clase `FileWriter` activando el parámetro booleano `true` para habilitar el modo *append*, lo que permite agregar líneas nuevas al final del archivo de texto `descubrimientos.txt`. Para la lectura y búsqueda, se emplea `BufferedReader` con un bucle `while` que recorre el archivo línea por línea contando los registros e identificando palabras clave mediante `contains()`.

### Evidencia de ejecución
<img width="267" height="142" alt="image" src="https://github.com/user-attachments/assets/81c088ae-d989-41b2-a4ca-26b6d3d41a97" />

---

## Ejercicio 10: Sistema de ventas – Procesamiento y análisis de datos

**Tema:** Procesamiento, análisis numérico y filtrado de registros desde archivos de texto.

### Enunciado
Un sistema de comercialización registra las transacciones de productos en un archivo llamado `ventas.txt`. Desarrolla un programa en Java que permita registrar nuevas ventas (producto y precio), leer el archivo completo calculando el total acumulado y detectando el producto más caro, y filtrar las ventas superiores a un valor mínimo ingresado por el usuario.

### Descripción de la resolución
Se utiliza la gestión de ficheros mediante `BufferedWriter` y `FileWriter` para almacenar de forma estructurada cada venta separada por comas (`producto,precio`). Al leer los datos, se utiliza `BufferedReader` procesando cada línea con el método `split(",")` para separar las cadenas de texto, convertir los precios a formato numérico (`double`), acumular el valor total de las ventas, determinar el valor máximo y aplicar filtros de búsqueda por precio.

### Evidencia de ejecución
<img width="456" height="301" alt="image" src="https://github.com/user-attachments/assets/1fa2caa7-90ce-4254-a2ba-7f21cf764b50" />
