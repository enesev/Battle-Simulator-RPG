1. Preguntar a los otros desarrolladores del equipo qué funcionalidades quieren obtener de Graveyard, y refactorizar 
cualquier método que no se cumpla estos requisitos.

2. Transladar el método auxiliar ifCharacterDied_addToGraveyard a una clase test sólo disponible en esta rama, incluyendo
todos sus directorios, dependencias y ficheros en .gitignore para asegurarme de que no provoquen ningún merge conflict.

3. Dividir el método auxiliar en varios tests, para facilitar posibles cambios y mejorar su legibilidad.

4. Implementar el código, que ahora está comentado al final de Graveyard.java, en los tests, para verificar que cada carácter 
es añadido al cementerio cuando muere, y que podemos acceder a sus propiedades usando showGraveyard.
