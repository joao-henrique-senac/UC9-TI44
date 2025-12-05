const input = require("../input");


(async() => {
    console.log("Qual o seu primeiro nome?"); let nome = await input();
   
    console.log("Qual o seu sobrenome? Digite:");let sobrenome = await input();
   
    console.log(`Esse é o seu nome: ${nome}` , `${sobrenome}`);
})();
