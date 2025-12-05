const validarCPF = require('./CPF');
const input = require("../input");



console.log("validador de CPF: digite o seu cpf");
(async() => {

    let cpf =  await input();
    const resultado = validarCPF(cpf)
    console.log(resultado)

})();

