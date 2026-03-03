let prompt = require("prompt-sync")()

let resposta = 7 
let numero = 0
let tentativas = 0

resposta = Math.random()

while (resposta =! numero ) {
  
 numero = parseInt(prompt("Digite um numero: "))
    
    if(numero == resposta){
        console.log("😂✔")
        break;
    }
    else{
        console.log("infelizmente você errou")
        
    }
    
}

