const input = require("../input");


(async() => {
    console.log("Digite os seus pontos"); 
    let pontos = Number(await input());

    let resultado = 0

    if(pontos < 100){
       console.log(` você é cliente iniciante ${pontos}`);
    
    }
    else if(pontos >= 100 && pontos < 300 ){
       console.log(`Parabens você é um cliente bronze ${pontos}`);

    }
    else if(pontos >= 300 && pontos < 700 ){
       console.log(`Parabens você é um cliente prata ${pontos}`);
       
    }
    else if(pontos >= 700){
        console.log(`Você é um cliente ouro ${pontos}`)
    }
    else{
        console.log("Você não tem pontos suficiente ")
    }
       
    
    

   
})();
