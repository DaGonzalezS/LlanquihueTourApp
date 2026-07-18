# Llanquihue Tour - Prototipo de Gestión Modular

## Descripción
Proyecto desarrollado para la Evaluación Final Transversal (EFT) de la asignatura **Desarrollo Orientado a Objetos I**. Esta versión del sistema incorpora los conceptos fundamentales de la Programación Orientada a Objetos (POO) y añade una capa de persistencia en archivos planos locales, permitiendo registrar, administrar y almacenar de manera permanente las distintas entidades que interactúan en la agencia de turismo Llanquihue Tour.

El programa cuenta con un menú interactivo por consola que permite realizar el registro validado de Clientes, Guías y Proveedores, resguardando la información en una colección dinámica y asegurando su persistencia en el disco.

## Funcionalidades
* **Registro de Clientes:** Permite ingresar datos personales, dirección y correo electrónico.
* **Registro de Guías Turísticos:** Permite registrar guías asociando su especialidad dentro de la agencia.
* **Registro de Proveedores:** Permite la administración de operadores y empresas externas asociadas.
* **Validación de Datos de Negocio:** Control de integridad en la capa de negocio que valida la extensión mínima del RUT antes de confirmar cualquier registro.
* **Persistencia en Archivos Locales (.txt):** Escritura y lectura automatizada de datos a través de flujos de caracteres, permitiendo recuperar la información cada vez que se inicia la aplicación.
* **Visualización Unificada:** Reporte estructurado de todos los registros del sistema mediante el uso de polimorfismo.

## Estructura del Proyecto (Paquetes)
```text
src
│
├── interfaces
│   └── Registrable.java
│
├── model
│   ├── Persona.java
│   ├── Cliente.java
│   ├── Guia.java
│   ├── Proveedor.java
│   ├── Direccion.java
│   └── Rut.java
│
├── data
│   ├── GestorDatos.java
│   └── GestorPersonas.java
│
└── ui
    └── Main.java
```

## Clases e Interfaces Utilizadas
### Interfaces
- Registrable (paquete interfaces): Define el contrato con el método genérico mostrarResumen(), el cual es implementado por las entidades del sistema para habilitar el comportamiento polimórfico.
### Clases de Modelo (paquete model)
- Persona: Superclase abstracta/base que encapsula los atributos comunes (nombre, edad, rut y dirección).
- Cliente: Subclase que hereda de Persona y añade el atributo particular para el correo electrónico.
- Guia: Subclase que hereda de Persona e incorpora la especialidad del guía de turismo.
- Proveedor: Subclase que hereda de Persona y añade el campo correspondiente a la empresa externa.
- Direccion: Representa un objeto complejo que compone la localización (calle y ciudad) de una persona.
- Rut: Modela el identificador de la persona y centraliza el método booleano de validación de caracteres.
## Clases de Datos y Control (paquete data y ui)
- GestorPersonas: Administra una colección dinámica de tipo ArrayList<Registrable>, controlando los métodos para listar y limpiar datos en memoria.
- GestorDatos: Clase utilitaria encargada de la persistencia física. Utiliza BufferedWriter para escribir en los archivos planos y BufferedReader con .split() para deserializar los textos y cargarlos de vuelta como objetos.
- Main: Orquestador de la aplicación que interactúa con el usuario a través de menús por consola usando Scanner.

## Conceptos de POO Aplicados.
- Encapsulamiento: Ocultamiento de datos mediante atributos private y acceso controlado por métodos public (Getters, Setters y Constructores).
- Composición: Relación estructural donde la clase Persona se compone internamente de las clases Direccion y Rut.
- Herencia: Jerarquía de clases donde Cliente, Guia y Proveedor extienden de Persona para reutilizar código base.
- Polimorfismo: Capacidad de almacenar y recorrer de forma genérica múltiples subtipos dentro de una colección List<Registrable>.
- Persistencia de Datos: Manejo de excepciones e I/O de archivos en Java para evitar la pérdida de información entre ejecuciones del sistema.

## Cómo ejecutar el proyecto.
1. Abrir el proyecto en IntelliJ IDEA.
2. Asegurarse de que exista el directorio resources/ en la raíz del proyecto con los archivos clientes.txt, guias.txt y proveedores.txt (el sistema los creará automáticamente si no existen).
3. Ejecutar la clase Main ubicada en el paquete ui.
4. Utilizar el menú numérico de la consola para registrar personas o visualizar el consolidado persistido en los archivos de texto.  
