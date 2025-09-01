#Historias de uso

## HU1- Registro con cuenta de Gmail
Como usuario nuevo quiero registrarme e iniciar sesión usando mi cuenta de  Gmail  para  poder acceder rápidamente a la app sin crear una cuenta manualmente.
Criterios de aceptación:
El usuario puede autenticarse mediante su cuenta de Google (OAuth).
Si el correo no está registrado, se crea una cuenta automáticamente.
Si el correo ya está registrado, se inicia sesión directamente.
Se muestra un mensaje de error si la autenticación falla.

## HU2- Visualización de productos disponibles
Como usuario registrado  quiero ver el catálogo de productos disponibles para poder seleccionar los productos que deseo comprar.
Criterios de aceptación:
Se muestra una lista con nombre, precio, descripción y foto de cada producto.
Los productos se pueden filtrar por categoría.
El usuario puede ver el detalle de un producto.


## HU3- Agregar productos al carrito 
Como usuario registrado quiero agregar productos al carrito de compras para preparar mi pedido antes de realizar la compra.
Criterios de aceptación:
El usuario puede seleccionar cantidad por producto.
Los productos seleccionados se agregan a un carrito persistente.
Se muestra el total de la compra en tiempo real.


## HU4- Ingresar dirección y calcular costo de despacho.
Como usuario en proceso de compra quiero ingresar mi dirección de entrega para que la app calcule automáticamente el costo del despacho.
Criterios de aceptación:
El usuario puede ingresar su dirección.
La app calcula la distancia desde el centro de distribución.
Si la dirección supera los 20 km, se indica que no está disponible el servicio.
Si la dirección está dentro del radio permitido, se calcula el costo según las reglas de negocio:
- Compra >= $50.000 despacho gratis.
-Compra >= $ 25000 y <= $ 49999  despacho  $150/km.
- Compra < $25.000 despacho $300/km.


Se muestra el detalle del cálculo de despacho según la compra.


## HU5-Confirmar pedido y ver resumen 
Como usuario registrado quiero confirmar mi pedido y ver un resumen final para saber qué compré y  cuánto pagaré.
Criterios de aceptación:
Se muestra el resumen de productos, costo total, dirección y costo de despacho.
El usuario puede confirmar el pedido o volver a editarlo.
Se muestra el número de pedido al confirmar.


## HU6-  Historial de pedidos
Como usuario quiero ver mis pedidos anteriores para hacer seguimiento o repetir pedidos fácilmente.
Criterios de aceptación:
Se muestra una lista de pedidos anteriores con fecha, monto y estado.
El usuario puede ver el detalle de cada pedido.
El usuario puede volver a agregar productos de un pedido anterior al carrito.


