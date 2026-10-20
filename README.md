Este programa está diseñado para modelar un sistema de gestión de personal y liquidación de haberes mediante la aplicación de herencia, encapsulamiento y polimorfismo en programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase base Empleado: Agrupa los atributos comunes a todo el personal (nombre, dni y legajo) bajo un diseño encapsulado y provee un constructor y métodos de acceso seguros.

Implementa las subclases EmpleadoAsalariado y EmpleadoPorHora: Extienden de Empleado incorporando sus atributos particulares (sueldo mensual fijo para el asalariado; tarifa por hora y horas trabajadas para el temporario).

Aplica polimorfismo mediante la sobrescritura (@Override) del método calcularSalario(): Cada subclase implementa su propia regla de negocio para liquidar el estipendio económico de forma especializada.

Ejecuta la prueba en el main: Instancia objetos de ambas clases hijas polimórficamente, invoca el cálculo salarial y muestra la información consolidada por consola.
