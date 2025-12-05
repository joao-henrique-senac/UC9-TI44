const input = require("../input");


(async() => {
    console.log("deseja cadastrar o seu numero?");
     let num = Number(await input());
     
   
    console.log("Qual o seu sobrenome? Digite:");let sobrenome = await input();
   
    console.log(`Esse é o seu nome: ${nome}` , `${sobrenome}`);
})();
