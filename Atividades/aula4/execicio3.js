const input = require("../input");

(async() => {
    console.log("Tamanhos de roupas")
    console.log("P Combo pequeno escolhido R$15.00")
    console.log("M Combo grande escolhido R$20.00")
    console.log("G Combo GRande escolhido R$25.00")
    console.log()
    console.log("digite o Tamnho P,M ou G")

     let Tamanho = await input();
     tamanho = Tamanho.toUpperCase()

     switch(tamanho){
        case "P":
            console.log(`Você pediu tamnho P ese é o valor R$15.00`)
        break;
           case "M":
             console.log(`Você pdeiu tamnho M eese é o valor R20.00`)
        break;
          case "G":
            console.log(`Você pediu tamnho G esse é o valor 25.00`)
        break;
        default:
            console.log("digite um tamanho valido")






     }


})();
