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



