

let notahtml
let i = 1
let promediohtml = 0
let promediocss = 0
let promediojs = 0
const nombre = prompt("Ingrese su nombre")
const carrera = prompt("Ingrese su carrera")
while( i <= 3){
     notahtml = prompt("Ingrese nota" + i +"[HTML]")
    notahtml = parseInt(notahtml)
    $("#notahtml"+i).html(notahtml)
    promediohtml +=  notahtml
    i++
}
promediohtml = promediohtml/3
$("#promedioHtml").html(promediohtml)

let notacss
 i = 1
while( i <= 3){
     notacss = prompt("Ingrese nota" + i +"[CSS]")
    notacss = parseInt(notacss)
    $("#notacss"+i).html(notacss)
    promediocss +=  notacss
    i++
}
promediocss = promediocss/3
$("#promediocss").html(promediocss)

i = 1
let notajs
while( i <= 3){
    notajs = prompt("Ingrese nota" + i +"[JAVASCRIPT]")
    notajs = parseInt(notajs)
    $("#notajs"+i).html(notajs)
    promediojs += notajs
    i++
}
promediojs = promediojs/3
$("#promediojs").html(promediojs)
$("#nombre").html(nombre)
$("#carrera").html(carrera)







/*
$("#notahtml1").html(notahtml1)
$("#notahtml2").html(notahtml2)
$("#notahtml3").html(notahtml3)*/