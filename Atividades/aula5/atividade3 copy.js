const input = require("../input");


(async() => {

for(let agenda = [], continuar; agenda.length <=5 && continuar == "sim";console.log(agenda)){
    console.log("digite o numero de telefone: ")
    let numero = await input()
    console.log("digite o nome: ")
    let nome = await input()
    
    agenda.push({
        nome,
        numero,
    })

    console.log(" deseja continuar?")
    continuar = await input()
 
}
})();
