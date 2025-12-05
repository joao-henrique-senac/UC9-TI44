const input = require("../input");


(async() => {
    
    for(let premio=-1, numero, i=0;premio != numero && i<10;i++ ){
        
    premio = Math.floor(Math.random()*10)
    console.log("escolha um numero")    
    numero = Number(await input())

    }
})();
