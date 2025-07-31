# Proyecto-Bimestral
## Sistema Integral de Gestión de Talleres Artísticos Comunitarios – Loja 2025
El Ministerio de Cultura y Patrimonio, en coordinación con el Gobierno Autónomo Descentralizado de Loja, impulsa el desarrollo de talleres artísticos comunitarios permanentes como parte de su programa cultural para el año 2025. Estos talleres se enfocan en diversas áreas como danza, música, pintura, escultura, teatro y escritura creativa, y están dirigidos a distintos grupos etarios y sociales. Cada taller está dirigido por un facilitador certificado y cuenta con una planificación de sesiones, materiales requeridos, número máximo de participantes y nivel de dificultad.

Los participantes se registran en los talleres y pueden acceder a recursos pedagógicos, horarios, evaluaciones de progreso y actividades complementarias. Algunas actividades requieren evaluaciones prácticas con criterios definidos y puntajes ponderados. El sistema debe permitir además la gestión de inscripciones, seguimiento de participantes, asignación de facilitadores, programación de sesiones y generación de reportes de impacto cultural y social.

Para efectos de control institucional y de transparencia, toda la información debe persistirse en una base de datos relacional y además permitir la carga inicial de datos mediante archivos CSV. El sistema debe respetar una arquitectura basada en el patrón arquitectónico MVC, permitir consultas por nombre de participante, tipo de taller, nivel de avance y generar reportes organizados en consola. Se espera que el sistema aplique correctamente los pilares fundamentales de la Programación Orientada a Objetos: abstracción, encapsulamiento, herencia y polimorfismo, así como el uso adecuado de arreglos dinámicos, manejo de excepciones y principios SOLID para garantizar su escalabilidad.

Requerimientos funcionales:

1.	Permitir el registro y gestión de múltiples talleres artísticos, considerando tipo de taller, duración, materiales necesarios y nivel de dificultad.
2.	Registrar participantes y su asignación a talleres disponibles, considerando restricciones de edad y cupo.
3.	Asociar facilitadores a uno o varios talleres, con la posibilidad de evaluación periódica de su desempeño.
4.	Registrar las sesiones planificadas y realizar el seguimiento de la asistencia y avance de los participantes.
5.	Implementar evaluaciones prácticas con criterios y puntajes por taller, incluyendo cálculo de promedios y asignación de niveles de progreso.
6.	Importar información inicial desde archivos CSV para talleres, facilitadores y materiales.
7.	Almacenar todos los datos en una base de datos relacional.
8.	Aplicar excepciones para manejo de errores en el registro de datos, asignaciones, cargas de archivos y consultas.
9.	Mostrar reportes finales por consola que incluyan: listado de participantes por taller, talleres por facilitador, evaluaciones realizadas y ranking de avance.
10.	Seguir la arquitectura MVC y estructurar el sistema usando herencia, polimorfismo, encapsulamiento y abstracción.
11.	Aplicar relaciones de composición y agregación entre clases cuando sea necesario. 
12.	Diseñar el UML detallado, incluyendo nombres de clases, atributos, métodos, constructores, relaciones, cardinalidades, y tipos de clases.
