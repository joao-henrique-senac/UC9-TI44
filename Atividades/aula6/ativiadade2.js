const input = require("../input");


(async() => {
    function mutiplicar(numero, numero2){
    return numero * numero2
}


function div(num1, num2){
    return num1 / num2

}

function soma(num1, num2){
    return num1 + num2

}

function sub(num1, num2){
    return num1 - num2

}

console.log(`Calculadora deseja
             1 - MULTIPLICAR 
             2 - DIV
             3 - SOMA 
             4 - subtração `)
let resposta = Number( await input())
let func;
switch(resposta){
    case 1:
        func = mutiplicar
        break;
    case 2:
        func = div
        break;
    case 3:
        func = soma
        break;
    case 4:
        func = sub  
        default:
            console.log("infelizmente você não digitou um numero certo")
    
   


}

console.log("digite o numero para calcular")
cont1 = Number(await input())
console.log("digite o numero para calcular")
cont2 = Number(await input())

cont = func(cont1, cont2)

console.log(cont)


})();


