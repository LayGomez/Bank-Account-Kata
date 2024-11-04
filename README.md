# Kata de Cuenta Bancaria

Este proyecto es una implementación de la Kata de Cuenta Bancaria, diseñada para practicar el desarrollo guiado por pruebas (TDD) en Java utilizando JUnit. El objetivo fue construir una aplicación simple que permita la creación de cuentas bancarias, realizar depósitos, retiros y consultar el saldo.
## 📝 Objetivo del Proyecto

El objetivo principal de esta kata fue profundizar en los principios de TDD y la programación orientada a objetos, asegurando que cada nueva funcionalidad estuviera respaldada por pruebas desde el principio.
## 🛠️ Funcionalidades

- Creación de Cuenta: Las cuentas se inicializan con un saldo inicial de 0 o uno especificado. 
- Depósitos y Retiros: Pueden realizarse siempre que se cumplan las condiciones (fondos suficientes para retiros). 
- Consulta de Saldo: Permite verificar el saldo actual de la cuenta.

## ⚙️ Proceso de Desarrollo

El proceso que seguí fue completamente guiado por pruebas, en el siguiente orden:

- **Escribir Pruebas en JUnit:** Empecé por escribir pruebas unitarias básicas en JUnit para validar cada funcionalidad.

- **Implementación de Funcionalidades:** A continuación, implementé el código necesario para que las pruebas pasaran. Esto incluyó crear métodos para el manejo de depósitos y retiros, y asegurar que los retiros no superaran el saldo disponible.

- Refactorización: Después de asegurarme de que todas las pruebas pasaran, realicé ajustes en el código para mejorar su estructura y legibilidad, sin modificar la funcionalidad.

##🚀 Ejemplo de Uso

- Crear una cuenta con un saldo inicial de $1000.
- Realizar un depósito de $500.
- Intentar un retiro de $200. 
- Intentar retirar un monto negativo (-500) y confirmar que el sistema lo rechaza.

## 🧪 Ejemplos de Pruebas en JUnit

Aquí algunos ejemplos de las pruebas que implementé:

- Test de Creación de Cuenta: Verifica que una cuenta nueva se crea con el saldo inicial especificado. 
- Test de Depósitos: Verifica que los depósitos aumenten el saldo de manera correcta. 
- Test de Retiros: Asegura que solo se realicen retiros si hay saldo suficiente, y que el saldo se actualice correctamente.

🚀 Cómo Ejecutar el Proyecto

- Clonar el repositorio.
  ``` git clone https://github.com/LayGomez/Bank-Account-Kata ```
- Instalar las dependencias que se encuentran pom.xml
- Ejecutar las pruebas con JUnit para verificar el funcionamiento de todas las funcionalidades.