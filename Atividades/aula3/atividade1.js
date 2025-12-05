const input = require("../input");
//atividade bancaria 
(async() => {

    let saldo = 300

    console.log("Bem vido a pont.😊bank");
    console.log("Digite 1 para depositar ou 2 para sacar ");
    let resposta = parseInt(await input())

     console.log("Digite o valor")
     let valor = Number(await input())
    


    if(resposta == 1){
        if(valor >= 1){
            saldo += valor
        }
        else{
             console.log("o valor minimo é $1")
        }
     }

        else if(resposta == 2){
            if(valor <= 0)
                console.log("INfelizmenete você não tem saldo para sacar")
            else{
                 saldo -= valor
            }
       
        }

     console.log(`Esse é o seu saldo ${saldo}`)

})();
