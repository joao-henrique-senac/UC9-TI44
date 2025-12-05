const input = require("../input");


(async() => {
let agenda = []
let continuar 
do{
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
 
}while(agenda.length <=5 && continuar == "")
    console.log(agenda)
})();
