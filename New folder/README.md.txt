Gestión de Centros de Reciclaje
Proyecto “<pegá acá el nombre que elija tu grupo>”
Objetivo
Con la realización de este proyecto se cerrará la primera etapa de aprendizaje del programa PIL Globant.
Para ello se utilizarán todas las técnicas aprendidas, tanto de programación, análisis y diseño, como de gestión de proyecto.
Consideraciones
Se valorarán el uso de:
Correcta aplicación de los conceptos aprendidos
Correcto uso de buenas prácticas y estilo de codificación
Utilización correcta del versionado de código (git - gitflow)
Gestión de proyecto a través de un tablero (trello) aplicando Scrum
El correcto uso de scrum, ceremonias, etc.
La consulta regular a los profesores como guías para la realización del proyecto
La aplicación de técnicas (patrones de diseño, etc)
Testing con una cobertura del 80%
La utilización de diagramas para alcanzar los objetivos (esto no se evaluará ni se pedirá entrega de documentación de ningún tipo pero se recomienda su implementación)
No se pedirá técnicas de seguridad ni de autorización/autenticación (JWT, encriptación, etc.)

Se evaluará:
La participación tanto grupal como individual de cada integrante del equipo
El uso de trello (reportes)
El uso de github (cantidad de commits y Pull Requests)
La regularidad en las consultas que se efectúen dentro de los horarios y días de disponibilidad de los profes
El resultado final, código ejecutable, que tendrá que compilar y se podrá ejecutar en cualquier máquina para ser consultado mediante Postman.
Se deberá tener en cuenta la persistencia de los datos en una base de datos (puede ser una BD en memoria como H2)
Se evaluará tanto el resultado como el proceso
Requisito fundamental: Documentación del proyecto en un archivo README.md (markdown) en la raíz del proyecto en donde se describirán cada uno de los endpoints a ser consultados. Por ejemplo:
POST http://localhost/zona Body: { “nombre”: “...” }
GET http://localhost/zonas
Entrega
La fecha y la forma de entrega se notificará por classroom, en donde todos los integrantes del proyecto deberán adjuntar el link al repositorio (github). Con anterioridad se pedirá el link a trello para revisar los avances.
Enunciado
Una comuna importante de nuestra provincia solicita la realización de una aplicación para facilitar al mismo la administración de sus centros de reciclaje con la participación de la comunidad en general.
La idea principal es justamente descentralizar los lugares en donde uno arroja la basura separada por tipo.
Un estudio realizado por ACME sugiere que la co-participación tanto del estado como de la ciudadanía en general en cuanto al tratamiento previo de la basura posibilitará la concientización del ciudadano y disminuirá la cantidad de residuos que son desechados. Asimismo tendrá un directo impacto en el ambiente y en el costo del tratamiento de la basura.
Nota importante
El proyecto se realizará en dos etapas siendo la primera la realización de un sistema (back-end) que será el soporte para futuras aplicaciones tanto móviles como web para ser realizadas en una etapa posterior.
Casos de uso o épicas

Alta de zona de reciclaje
Baja de zona de reciclaje
Modificación de zona de reciclaje
Consulta de zona de reciclaje
Clasificaciones para cada zona de reciclaje
Desecho de pilas
Desecho de basura no reciclable
Desecho de vidrios
Desecho de papel
Desecho de orgánicos
Administración de supervisores de zona
Alta de supervisión
Estado de la zona de reciclaje
Capacidad de ocupación (nivel de capacidad - vacío, a medio llenar, lleno, supera capacidad)
Necesita reclasificación del material?
Ideas para trabajar material reciclado
Recetas para vidrio
Recetas para plastico
Recetas para papel
Recetas para compost
Ubicación geográfica de una zona de reciclaje
Ruta de recolección de un punto a otro (acá le mandamos un algoritmo o algo para que piensen en la solución)
Lista de coordenadas para plotear en un mapa con los colores de la clasificación de cada zona
Denúncia de
- zona inutilizada por mal uso
- por vandalismo
- otra razón
- Relevamiento de capacidad para ver cuando una zona se “llena” más rápido que otra por si se requiere poner otra zona

Glosario
Zona: Lugar en tu barrio en donde se puede arrojar la basura separada por tipo (los 3 recipientes de color, uno para cada tipo de basura)