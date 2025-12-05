const input = require("../input");

(async() => {
    console.log("Qual o seu nome? Digite:");
    let nome = await input();
    console.log("Qual o sua idade? Digite:");
    let idade = await input();
    console.log(`${nome} essa é a sua idade ${idade}`);
})();
