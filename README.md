### Resumen de ejercicios sobre Excepciones

Este proyecto implementa ejercicios prácticos para manejar y lanzar excepciones personalizadas en Java, 
con el objetivo de validar entradas del usuario.
Los métodos y excepciones se diseñaron para diferentes tipos de datos y casos de uso.

---

### Funcionalidades principales

1. **Excepciones personalizadas:**
   - **`InvalidCharacterException`**: Lanza un error cuando el usuario no introduce un único carácter válido.
   - **`InvalidStringException`**: Lanza un error si un `String` no cumple con la longitud mínima requerida.
   - **`InvalidBooleanException`**: Valida respuestas tipo "y/n" y lanza un error si la entrada no es válida.

2. **Validación de datos:**
   - Métodos robustos para leer y validar diferentes tipos de entrada del usuario:
     - `leerChar`: Valida que el usuario introduzca un único carácter.
     - `leerString`: Valida cadenas con longitud mínima requerida.
     - `leerBoolean`: Maneja respuestas "y/n" o "s/n".
     - `leerDouble`: Valida números decimales grandes.

3. **Manejo de excepciones:**
   - Uso de bucles `while` con bloques `try-catch` para asegurar que los datos ingresados por el usuario sean válidos antes de continuar.

4. **Interacción dinámica:**
   - Mensajes claros para el usuario al introducir datos inválidos.
   - Bucle continuo hasta que los datos sean correctos.

---

### Objetivo
Este proyecto demuestra el uso de excepciones en Java para mejorar la validación de datos y la experiencia del usuario en aplicaciones de consola.
