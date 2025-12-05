const input = require("../input");


(async() => {
    console.log("Digite o valor da compra");
     let compra = Number(await input());

    console.log("Digite a forma de pagamento:");
    console.log("1 DINHERO 10% de desconto")
    console.log("2 DEBITO 5% de desconto")
    console.log("3 CREDITO sem desconto ")
    console.log("4 PIX 8% de desconto")
    let pagamento = Number(await input());

    resultado = 0

    switch(pagamento){
        case 1:
            resultado = compra * (10 / 100)
            console.log(`Pagamento feito com sucesso esse é o valor do desconto ${resultado}`)
            break;
        case 2:
            resultado = compra * (5 / 100)
            console.log(`Pagamento feito com sucesso esse é o valor do desconto ${resultado}`)
            break;
        case 3:
            console.log(`Pagamento feito com sucesso Infelizmente não tem desconto ${resultado}`)
            break;
        case 4:
            resultado = compra * (8 / 100)
            console.log(`Pagamento feito com sucesso esse é o valor do desconto ${resultado}`)


    }
   

})();
