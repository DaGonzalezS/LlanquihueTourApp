# LlanquihueTourApp
## Descripción

Proyecto desarrollado para la asignatura Desarrollo Orientado a Objetos I.

Esta versión del sistema incorpora conceptos fundamentales de la Programación Orientada a Objetos, como interfaces, herencia, polimorfismo, colecciones dinámicas e interfaz gráfica, permitiendo registrar y visualizar distintas entidades relacionadas con la agencia de turismo Llanquihue Tour.

El programa permite registrar guías, vehículos y colaboradores externos mediante una interfaz gráfica desarrollada con JOptionPane, almacenando la información en una colección dinámica y diferenciando los objetos mediante el operador instanceof.

## Funcionalidades
- Registro de guías turísticos.
- Registro de vehículos.
- Registro de colaboradores externos.
- Visualización de las entidades registradas.
- Gestión de entidades mediante una colección ArrayList.
- Aplicación de polimorfismo utilizando una interfaz común.
- Identificación de tipos de objetos con instanceof.
- Interfaz gráfica básica desarrollada con JOptionPane.

```
Estructura del proyecto
src
│
├── model
│   ├── Registrable.java
│   ├── Persona.java
│   ├── Guia.java
│   ├── Vehiculo.java
│   └── ColaboradorExterno.java
│
├── data
│   ├── GestorDatos.java
│   └── GestorEntidades.java
│
└── ui
    └── Main.java
```

## Clases e interfaces utilizadas

### Interface
- Registrable: define el método mostrarResumen(), implementado por las entidades del sistema.
  
### Clases
- Persona: superclase que contiene los atributos comunes de las personas.
- Guia: representa un guía turístico y hereda de Persona.
- ColaboradorExterno: representa un colaborador externo y hereda de Persona.
- Vehiculo: representa un vehículo de la agencia.
- GestorDatos: administra la lectura de datos desde el archivo correspondiente.
- GestorEntidades: administra una colección dinámica de entidades registrables.
- Main: contiene la interfaz gráfica y controla la ejecución del programa.
  
## Conceptos aplicados
- Programación Orientada a Objetos.
- Herencia.
- Interfaces.
- Polimorfismo.
- Sobrescritura de métodos (@Override).
- Colecciones dinámicas (ArrayList).
- Validación de tipos mediante instanceof.
- Interfaz gráfica con JOptionPane.

## Cómo ejecutar el proyecto
1. Abrir el proyecto en IntelliJ IDEA.
2. Ejecutar la clase Main ubicada en el paquete ui.
3. Utilizar el menú para registrar guías, vehículos y colaboradores externos.
4. Seleccionar la opción Mostrar Entidades para visualizar los registros ingresados.
