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


