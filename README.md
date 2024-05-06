<h1>Challenge Conversor de monedas Alura</h1>

Esta app permite a los usuarios realizar la conversión entre distintas monedas extrangeras, con las conversiones en tiempo real.
Para esto se utiliza la API: **ExchangeRate-API**

<h3>El programa tiene la siguiente estructura.</h3>

Clase principal: 
* Main

Clases secundarias:
* Interaccion con ususario: clase en la cual se le pregunta al usuario entre que monedas quiere hacer la conversion.
*  RequestConversionapi: clase que recibe las dos monedas a intercambiar y hace el HTTP request, recibe la respuesta, lee el json y devuelven el conversor rate.

Record:
* jsonConversion : record que lee el json entregado por la api, solo toma en cuenta los parametros result y conversion_rate.

Exceptions:
* ErrorMonedaSeleccionadaException: manejo de error de ingresar una moneda que no esta en el menu de monedas dsiponibles.


