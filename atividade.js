/*
var nomes = []
nomes[0] = "joão";

var idades = []
idades[0] = "18";

var telefone = []
telefone[0] = "12374565"

console.log(nomes)
console.log(iades)
console.log(telefone)
*/

const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Digite seu nome: ", function(nome) {
    console.log("Olá, " + nome);
    rl.close();
});
