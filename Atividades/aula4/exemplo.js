const input = require("../input");
var resposta = 1
var sim = 0
(async() => {
    while(resposta > sim){

        console.log("deseja continuar?")
             resposta = Number(await input())
             resposta = 1
             


    }
})();

