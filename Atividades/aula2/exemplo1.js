//estou fazendo uma importação
const inpute = require("../input"); 
// cosnt == é uma variavel constante (ela não pode ser mudada)
//let é uma variavel que funciona apenas em certo contexo (parametro {})
(async() => {
   console.log("qual a sua idade");
    let idade = await inpute();
    console.log(idade);
})();