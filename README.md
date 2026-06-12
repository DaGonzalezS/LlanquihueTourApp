LlanquihueTourApp.

Descripción.
LlanquihueTourApp es una aplicación desarrollada en Java utilizando Programación Orientada a Objetos (POO). El sistema permite cargar información de tours turísticos desde un archivo de texto, almacenarlos en una colección ArrayList y realizar consultas según distintos criterios, como tipo de tour o precio.

Estructura de Carpetas
LlanquihueTourApp
│
├── resources
│   └── tours.txt
│
├── src
│   ├── data
│   │   └── GestorDatos.java
│   │
│   ├── model
│   │   └── Tour.java
│   │
│   └── ui
│       └── Main.java
│
└── README.md


Descripción de carpetas.
resources/: contiene los archivos de datos utilizados por la aplicación.
data/: contiene las clases encargadas de la lectura y gestión de datos.
model/: contiene las clases del modelo de negocio.
ui/: contiene la clase principal de ejecución del programa.


Instrucciones de Ejecución.
Abrir el proyecto en IntelliJ IDEA.
Verificar que el archivo tours.txt se encuentre dentro de la carpeta resources.
Ejecutar la clase Main.java ubicada en:
src/ui/Main.java
El programa cargará los tours desde el archivo de texto y mostrará la información solicitada en consola.


Tecnologías Utilizadas.
- Java
- Programación Orientada a Objetos (POO)
- ArrayList
- Lectura de archivos TXT
- IntelliJ IDEA
