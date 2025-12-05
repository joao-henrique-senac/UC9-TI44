const input = require("../input");

(async() => {
    console.log("Cardapio")
    console.log("100 X-Salada R$12,00")
    console.log("101 X-Buger R$10,00")
    console.log("102 Cachorro quente R$8,50")
    console.log("103 suco R$6,00")
    console.log("104 refrigernate R$5,00")
    console.log()
    console.log("digite o codigo do produto")

        codigo100 = 12.00
        codigo101 = 10.00
        codigo102 = 8.50
        codigo103 = 6.00
        codigo104 = 5.00

     let codigo = Number(await input());
     console.log("digita a quantidade")
     let quantidade = Number(await input());

     switch(codigo){
        case 100:
            resposta = codigo100 * quantidade
            console.log(`Você pediu ${quantidade}quantidade Esse é o valor final R$${resposta}`)
        break;
           case 101:
            resposta = codigo101 * quantidade
             console.log(`Você pediu ${quantidade}quantidade Esse é o valor final R$${resposta}`)
        break;
        case 102:
            resposta = codigo102 * quantidade
            console.log(`Você pediu ${quantidade}quantidade Esse é o valor final R$${resposta}`)
         break;
        case 103:
            resposta = codigo103 * quantidade
             console.log(`Você pediu ${quantidade}quantidade Esse é o valor final R$${resposta}`)
         break;
        case 104:
            resposta = codigo104 * quantidade
            console.log(`Você pediu ${quantidade}quantidade Esse é o valor final R$${resposta}`)
        break;
        default:
            console.log("digite um codigo valido")






     }


})();
