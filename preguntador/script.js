//const nombre = 'Matias Vejar'
const edad = 27

const puede_votar = edad > 18

const numero = 125 == 5**3

//1 le pregunto al usuario como se llama
//const nombre = prompt('Hola, ¿cómo te llamas?')

//2. Creo un nuevo string con el saludo

//const saludo = "Hola, " + nombre + ", gusto conocerte"

//3. le mostramos el saludo al usuario
//alert( saludo)

//const numeroUsuario = prompt('Ingrese un numero')

//const numeroMio = parseInt(numeroUsuario) + 1

//const respuesta = "Yo gane, pusiste " + numeroUsuario + " y yo elijo " + numeroMio

//alert( respuesta)

let edadUsuario = prompt('Ingrese su edad')

edadUsuario = parseInt(edadUsuario)
//if(typeof edadUsuario == "string" && edadUsuario == null){
    //alert("debe ingresar un numero")

//}else{
    if(edadUsuario >= 18 && edadUsuario <= 66 ){
        alert("Usted tiene " + edadUsuario + " se encuentra habilitado para votar")
    }else{
        alert("Usted no puede votar")
    }

//}
