const input = require("../input");


(async() => {
    console.log("calculadora de soma")

    console.log("digite o numero que deseja somar: ");
     let numero1 = Number(await input());
   
    console.log("Digite o segundo numero que sedejha somar: ");
    let numero2 = Number(await input());

    resultado = numero1 + numero2;
   
    console.log(`Esse é o seu resultado: ${resultado}`);

})();
