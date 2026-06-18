LlanquihueTourApp.

Descripción.
LlanquihueTourApp es una aplicación desarrollada en Java utilizando Programación Orientada a Objetos (POO). El sistema permite cargar información de tours turísticos desde un archivo de texto, almacenarlos en una colección ArrayList y realizar consultas según distintos criterios, como tipo de tour o precio.

Además, cada tour posee un guía turístico asociado, implementando composición entre clases mediante la relación entre Tour y Guia.

Estructura de Carpetas
```text
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
│   │   └── Guia.java
│   │
│   └── ui
│       └── Main.java
│
└── README.md
```


Descripción de carpetas.
- resources/: contiene los archivos de datos utilizados por la aplicación.
- data/: contiene las clases encargadas de la lectura y gestión de datos.
- model/: contiene las clases del modelo de negocio (Tour y Guia).
- ui/: contiene la clase principal de ejecución del programa.


Funcionalidades
- Lectura de tours desde un archivo TXT.
- Almacenamiento de datos en un ArrayList.
- Asociación de un guía turístico a cada tour.
- Consulta de tours por categoría.
- Consulta de tours económicos.
- Validación básica de datos.
- Manejo de excepciones mediante try-catch.


Instrucciones de Ejecución.
1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el archivo tours.txt se encuentre dentro de la carpeta resources.
3. Ejecutar la clase Main.java ubicada en:
src/ui/Main.java
4. El programa cargará los tours desde el archivo de texto y mostrará la información solicitada en consola.


Tecnologías Utilizadas.
- Java
- Programación Orientada a Objetos (POO)
- ArrayList
- Lectura de archivos TXT
- IntelliJ IDEA
