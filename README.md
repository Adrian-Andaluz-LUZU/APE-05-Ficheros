# APE-05-Ficheros
## Ejercicio 1: Crear un fichero en Java
**Tema:** Creación de archivos.

### Enunciado
Desarrollar un programa en Java que permita crear un archivo de texto llamado curso.txt.

**Indicaciones:**
1. Importar las clases necesarias para trabajar con archivos.
2. Crear un objeto de tipo File.
3. Utilizar el método createNewFile() para crear el archivo.
4. Comprobar si el archivo se creó correctamente o si ya existe.
5. Mostrar el nombre del archivo utilizando getName().
6. Utilizar try-catch para controlar posibles errores.

**Clases y métodos sugeridos:**
- File
- IOException
- createNewFile()
- getName()

### Descripción de la resolución
Para resolver este ejercicio, se utiliza la clase File para representar el archivo de texto llamado curso.txt. Se implementa el método createNewFile() para intentar crear el archivo y comprobar si se creó correctamente o si ya existía. Además, se utiliza getName() para mostrar el nombre del archivo. Finalmente, se implementa una estructura try-catch para controlar posibles excepciones durante el proceso de creación.

### Evidencia de ejecución
<img width="467" height="78" alt="image" src="https://github.com/user-attachments/assets/2b2de3a5-bf92-45e4-8dd4-31dc2982be1d" />

---

## Ejercicio 2: Escribir información en un fichero
**Tema:** Escritura de información en archivos.

### Enunciado
Desarrollar un programa en Java que permita ingresar un mensaje por teclado y almacenarlo en un archivo de texto existente llamado estudiantes.txt.

**Indicaciones:**
1. Importar las clases necesarias.
2. Crear un objeto Scanner para ingresar información por teclado.
3. Solicitar al usuario que escriba un mensaje.
4. Utilizar FileWriter para abrir el archivo estudiantes.txt.
5. Utilizar el parámetro true para conservar la información anterior y agregar el nuevo mensaje al final.
6. Utilizar el método write() para guardar el mensaje.
7. Cerrar el archivo utilizando close().
8. Mostrar un mensaje indicando que la información se guardó correctamente.
9. Controlar posibles errores mediante try-catch.

**Clases y métodos sugeridos:**
- Scanner
- FileWriter
- IOException
- write()
- close()

**Nota:** El archivo estudiantes.txt debe existir previamente.

### Descripción de la resolución
Para resolver este ejercicio, se utiliza la clase Scanner para ingresar un mensaje mediante el teclado. Posteriormente, se emplea FileWriter para abrir el archivo estudiantes.txt en modo de escritura, utilizando el parámetro true para conservar la información existente y agregar el nuevo contenido al final. Se utiliza el método write() para almacenar el mensaje y close() para cerrar el archivo. Finalmente, se muestra un mensaje de confirmación y se utiliza try-catch para controlar posibles errores durante la escritura.

### Evidencia de ejecución
<img width="706" height="98" alt="image" src="https://github.com/user-attachments/assets/478cd2c0-6544-4962-88de-a2c371ed7bd8" />

---

## Ejercicio 3: Eliminar un fichero en Java
**Tema:** Eliminación de archivos.

### Enunciado
Desarrollar un programa en Java que permita eliminar el archivo de texto estudiantes.txt.

**Indicaciones:**
1. Importar la clase necesaria para trabajar con archivos.
2. Crear un objeto de tipo File indicando el nombre del archivo que se desea eliminar.
3. Utilizar el método delete() para intentar eliminar el archivo.
4. Comprobar si la eliminación se realizó correctamente.
5. Si el archivo se eliminó, mostrar un mensaje de confirmación.
6. Si no se pudo eliminar, mostrar un mensaje indicando el problema.

**Clases y métodos sugeridos:**
- File
- delete()
- if-else
- System.out.println()

### Descripción de la resolución
Para resolver este ejercicio, se utiliza la clase File para representar el archivo estudiantes.txt que se desea eliminar. Se crea un objeto indicando el nombre del archivo y posteriormente se utiliza el método delete() para intentar eliminarlo. Mediante una estructura condicional if-else se comprueba el resultado de la operación: si el archivo se elimina correctamente, se muestra un mensaje de confirmación; de lo contrario, se informa que no fue posible realizar la eliminación.

### Evidencia de ejecución
<img width="527" height="128" alt="image" src="https://github.com/user-attachments/assets/23f0b49e-7251-4405-b7b6-84dd14d47404" />

---
## Ejercicio 4: Registro de estudiantes y calificaciones
**Tema:** Escritura de datos en archivos.

### Enunciado
Desarrollar un programa en Java que permita registrar los datos de 3 estudiantes y guardar la información en un archivo llamado estudiantes.txt.

**El programa debe:**
1. Solicitar el nombre del estudiante.
2. Solicitar su calificación.
3. Guardar ambos datos en el archivo.
4. Cada estudiante debe ocupar dos líneas.
5. Utilizar Scanner, BufferedWriter y FileWriter.
6. Cerrar correctamente el archivo.

### Descripción de la resolución
Para resolver este ejercicio, se utiliza la clase Scanner para solicitar por teclado el nombre y la calificación de tres estudiantes. Posteriormente, se emplean las clases FileWriter y BufferedWriter para crear y escribir la información en el archivo estudiantes.txt. Cada estudiante se registra en dos líneas diferentes, almacenando su nombre y su respectiva calificación. Finalmente, se cierra correctamente el archivo para garantizar que la información quede guardada.

### Evidencia de ejecución
<img width="903" height="91" alt="image" src="https://github.com/user-attachments/assets/77789524-afa5-4fc8-ba28-bee3749a04fe" />

---
## Ejercicio 5: Registro de productos con modo Append
**Tema:** Escritura de archivos y modo Append.

### Enunciado
Desarrollar un programa que permita registrar productos en un archivo llamado productos.txt.

**El programa debe:**
1. Solicitar el nombre del producto.
2. Solicitar su precio.
3. Solicitar la cantidad disponible.
4. Calcular el valor total del producto (precio × cantidad).
5. Guardar los resultados en el archivo.
6. Permitir registrar nuevos productos sin borrar los registros anteriores.
7. Utilizar BufferedWriter y modo append.

### Descripción de la resolución
Para resolver este ejercicio, se utiliza la clase Scanner para ingresar el nombre, precio y cantidad disponible de cada producto. Luego, se calcula el valor total multiplicando el precio por la cantidad. Para almacenar la información, se emplean las clases FileWriter y BufferedWriter, utilizando el modo append para agregar nuevos registros al archivo productos.txt sin eliminar los datos existentes. Finalmente, se guarda la información de cada producto junto con su valor total.

### Evidencia de ejecución
<img width="890" height="108" alt="image" src="https://github.com/user-attachments/assets/ce50a735-702f-4e8b-90de-13ad92854397" />

---

## Ejercicio 6: Sistema de registro de ventas
**Tema:** Registro de ventas, cálculos y almacenamiento en archivos.

### Enunciado
Desarrollar un programa en Java que permita registrar las ventas de una tienda y guardar la información en un archivo llamado ventas.txt.

**El programa debe:**
1. Solicitar el nombre del producto.
2. Solicitar el precio y la cantidad vendida.
3. Calcular el subtotal de cada venta.
4. Si el subtotal es mayor o igual a $100, aplicar un descuento del 10%.
5. Mostrar el total a pagar.
6. Permitir registrar varios productos hasta que el usuario escriba fin.
7. Guardar cada venta en el archivo sin eliminar los registros anteriores.
8. Al finalizar, guardar el total acumulado de las ventas realizadas.

### Descripción de la resolución
Para resolver este ejercicio, se utiliza la clase Scanner para solicitar el nombre, precio y cantidad vendida de cada producto. Se calcula el subtotal multiplicando el precio por la cantidad y se aplica una estructura condicional para verificar si corresponde un descuento del 10%, cuando el subtotal sea mayor o igual a $100. El programa permite registrar varios productos mediante una estructura repetitiva hasta que el usuario escriba "fin". Cada venta se almacena en el archivo ventas.txt utilizando BufferedWriter y el modo append para conservar los registros anteriores. Finalmente, se calcula y guarda el total acumulado de las ventas realizadas.

### Evidencia de ejecución
<img width="899" height="136" alt="image" src="https://github.com/user-attachments/assets/73fcd1f9-b5a8-432c-8b80-dbc0be82528d" />






