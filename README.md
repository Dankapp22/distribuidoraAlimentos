# Listado de Requerimientos:

## Requerimientos Funcionales
1. Registrar  usuarios: El usuario podrá registrarse usando una cuenta Gmail mediante autenticación de Google.
2. Comprar  productos: El sistema permitirá al usuario comprar productos del stock.
3. Calcular despacho: Al momento de realizar la compra el sistema calculará el costo del despacho según las siguientes reglas:
- Si el total de la compra es mayor a $50.000, el despacho es gratis dentro de un radio de 20 km.
- Si el total está entre $25.000 y $49.999, el costo de despacho es $150 por kilómetro recorrido.
- Si el total es menor a $25.000, el costo es $300 por kilómetro recorrido.
4. Cobrar el total de la compra incluido el despacho: El sistema calculará el monto total de la compra incluyendo el costo del despacho 

## Requerimientos No Funcionales:
1. Compatibilidad de plataforma: La aplicación debe ser compatible con múltiples versiones de Android.
2. Seguridad: Las comunicaciones entre cliente y servidor deben estar cifradas (HTTPS). Los datos personales deben almacenarse cumpliendo estándares de seguridad (por ejemplo, cifrado en base de datos). Autenticación mediante OAuth segura
3. Mantenibilidad: El código debe estar documentado y seguir buenas prácticas de desarrollo para facilitar su mantenimiento.
4. Usabilidad: Interfaz intuitiva, accesible y fácil de usar incluso para usuarios sin conocimientos técnicos.

