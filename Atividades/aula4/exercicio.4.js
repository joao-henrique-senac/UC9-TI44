const input = require("../input");


(async() => {
    console.log("Digite o valor da compra"); 
    let valorcompra = Number(await input());

    let resultado = 0

    if(valorcompra >= 100){
        resultado = valorcompra * (20 / 100)
       console.log(`Parabens voc^recebeu um desconto de 20% esse é o valor da sua compra com desconto R$${resultado}`);
    
    }
    else if(valorcompra >= 50 && valorcompra < 100 ){
         resultado = valorcompra * (10 / 100)
       console.log(`Parabens você recebeu um desconto de 10% esse é o valor da sua compra com desconto R$${resultado}`);

    }
    else if(valorcompra >= 20 && valorcompra < 50 ){
         resultado = valorcompra * (5 / 100)
       console.log(`Parabens você recebeu um desconto de 5% esse é o valor da sua compra com desconto R$${resultado}`);

    }
    else{
        console.log("Você não tem um valor minimo para desconto ")
    }
       
    
    

   
})();
