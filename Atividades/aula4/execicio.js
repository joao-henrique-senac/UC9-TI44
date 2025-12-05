
const input = require("../input");


(async() => {


 console.log("1 X-salada")
 console.log("2 X-Burger")
 console.log("3 Misto quente")
 console.log("4 Suco Natural ")
 console.log()
 console.log("digita o numero")
 let resposta = Number(await input())


switch(resposta){
    case 1:
        console.log("Parabens X-salada")
        break;
    case 2:
        console.log("Parabens X-Burger")
        break;
    case 3:
        console.log("Parabens Misto quente")
        break;
    case 4:
        console.log("Parabens Suco Natural")
        break;      
    default:
        console.log("você não digitou o nubero correto");
        

}       
})();



