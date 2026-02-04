const input = require("../input");


(async() => {
    console.log("Bem vindo a calculadora de hotdog, Digite o valor dos ingredientes");
    console.log()
    console.log("QUal o valor do pão?")
     let valorpao = Number(await input());

     console.log("QUal o valor do salsicha?")
     let valorsalsicha = Number(await input());
     

     console.log("QUal o valor do bacon?")
     let valorbacon = Number(await input());

     
     console.log("QUal o valor do pure de batata?")
     let valorpuredebatata = Number(await input());

     
     console.log("QUal o valor do salada?")
     let valorsalada = Number(await input());

     
     console.log("QUal o valor do valorbatatapalha?")
     let valorbatatapalha = Number(await input());
    





     console.log()
     console.log("Este é o cardápio do restaurant")
     console.log("1 - Hotdog simples Salsicha e pure")
     console.log("2 - Dog Salada Salsicha e salada")
     console.log("3 - Dog Duplo Especial Duas salsichas, purê e bacon")
     console.log("4 - Dog-Tudo Duas salsichas, purê em dobro, bacon, salada")

    console.log("Escolha o seu lanche")
    let pedido = Number(await input());

     if(pedido == 1){
        resultado = valorsalsicha + valorpuredebatata
        console.log(`esse é o valor de custo${resultado}Qual o valor final que deseja colocar?`)
        let valorfinal = Number(await input());
        console.log(`esse é valor do lanche para clienete final${valor}deseja adicionar um valor de desconto? sim/não `)
        let resposta = await input();
        if (resposta == "sim"){
               console.log("digite o valor do desconto")
               let desconto = Number(await input());
              valor = resultado * desconto / 100 
              console.log(`esse é o desconto do lanche hotdog simples${valor}`)
        }   
     }
S
    if(pedido == 2){
        resulatado = valorsalsicha + valorsalada
        console.log(`esse é o valor de custo${resultado}Qual o valor final que deseja colocar?`)
        let valorfinal = Number(await input());
        console.log(`esse é valor do lanche para clienete final${valor}deseja adicionar um valor de desconto? sim/não `)
        let resposta = await input();
        if (resposta == sim){
               console.log("digite o valor do desconto")
               let desconto = Number(await input());
              valor = resultado * desconto / 100 
              console.log(`esse é o desconto do lanche hotdog simples${valor}`)
        }   
     }






})();
