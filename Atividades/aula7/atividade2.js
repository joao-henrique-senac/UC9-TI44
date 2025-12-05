const input = require("../input");
const {validarEmail, validarTelefone } = require('./biblioteca.js');
(async() => {
    
    let agenda = [];
    let continuar = "sim ou não"; 
    do {
        console.log("Digite um nome:");
        let nomeE = await input();

        console.log("Digite um telefone:");
        let telE = await input();

       
        if (validarTelefone(telE)) {
            console.log(`✔ Telefone válido: ${telE}`);
        } else {
            console.log("Telefone inválido! Será salvo como inválido.");
        }

        console.log("Digite um email:");
        let emailE = await input();

        if (validarEmail(emailE)) {
            console.log(`✔ Email válido: ${emailE}`);
        } else {
            console.log("Email inválido! Será salvo como inválido.");
        }

        if(validarEmail(emailE) && validarTelefone(telE))
        {
            agenda.push({
                nome: nomeE,
                telefone: telE,
                email: emailE
            });
        }
        else{
            console.log("Dados não cadastrados")
        }

        console.log("Deseja continuar? (sim)");
        continuar = (await input()).toLowerCase();

    } while (agenda.length < 5 && continuar === "sim");
    
    
    console.log("\nNÃO == DADOS DIGITADOS ==");
    console.log(agenda)


})();

