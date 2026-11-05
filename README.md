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




