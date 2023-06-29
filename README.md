Instrucciones (Clase: CuentaBancaria)
1. Constructor. Codifique el constructor de tal forma que realice lo siguiente:
a. Se debe lanzar una excepción del tipo IllegalArgumentException si el balance 
inicial, recibido por parámetros, es negativo.
b. Se debe lanzar una excepción del tipo IllegalArgumentException si el número de 
Cuenta no es de 5 dígitos.
c. Realice la tarea propia de un constructor: inicializar las variables.
2. Método depositar. Codifique el método depositar para que abone la cantidad recibida 
como parámetro, considerando lo siguiente:
a. Se debe lanzar una excepción del tipo IllegalArgumentException si la cantidad 
recibida es negativa. Usar el constructor parametrizado de la clase
IllegalArgumentException con el mensaje: ¡Cantidad negativa, no es posible 
depositar! Proporcione un valor positivo.
3. Método retirar. Codifique el método retirar de tal forma que al recibir la cantidad por 
retirar, lo haga considerando lo siguiente:
a. El método debe lanzar una excepción IllegalArgumentException si la cantidad 
recibida es negativa. El objeto de dicha excepción se instancia utilizando el 
constructor parametrizado con el mensaje: ¡Cantidad negativa, no es posible 
retirar! Proporcione un valor positivo.
b. Además, se debe lanzar una excepción personalizada no comprobada, cuando se 
intente hacer un sobregiro. Mensaje de la excepción: ¡No hay fondos suficientes!
Instrucciones (Clase: Principal)
1. Método obtenerOpcionUsuario. El método debe capturar la excepción apropiada si el 
usuario provee un valor que no es de tipo entero.
2. Método obtenerCantidad. El método debe leer la opción del usuario y retornarla. Para 
ello, debe capturar la excepción apropiada si el usuario proporciona un dato que no es de 
tipo double. El método debe volver a leer la opción del usuario, si la excepción ocurrió.
3. Método obtenerNoCuenta. El método debe leer el número de cuenta y retornarlo al 
método principal. Considere que si el usuario proporciona un dato de un tipo inválido, una 
excepción ocurrirá y su método debe estar preparado para atraparla y volver a leer el 
valor proporcionado por el usuario.
4. Método main
a. case 1: Escriba el código para capturar las excepciones generadas si el usuario 
proporciona una cantidad negativa o un número de cuenta inválido. Imprima 
“ERROR” y el mensaje de la excepción mediante el método getMessage()
b. case 2: Escriba el código para capturar las excepciones si ocurren los siguientes 
problemas:
i. Se proporciona una cantidad negativa.
ii. No se ha elegido la cuenta a la que se depositará. Imprima el mensaje: 
ERROR: No existe la cuenta. Busque o cree una cuenta.
c. case 3: Capture las excepciones cuando alguno de los siguientes problemas ocurra.
i. La cantidad por retirar es negativa.
ii. No se ha seleccionado ninguna cuenta o no existe.
iii. La cantidad por retirar excede el balance de la cuenta
