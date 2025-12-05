const input = require("../input");


(async() => {
    console.log("digite o numero que deseja multiplicar por 2: ");
     let numero1 = Number(await input());
   
    resultado = numero1 * 2 
   
    console.log(`Esse é o seu resultado: ${resultado}`);

})();
