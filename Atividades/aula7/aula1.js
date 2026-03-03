/*

console.log("Olá mundo"); // console.log = print 
var nome = "joao"
// isso é uma concatenação 
console.log ("Olá " + nome );

var idade = 35
//interpolação 
/*
"" - aspas 
'' - apostrofo 
`` - craze 
*/
/*
console.log(`Olá ${nome}, sua idade é ${idade}`); //

var cestaCafe = []
cestaCafe[0] = "pão"

var cesta_cafe = [] // ESTOU DECLARANDO UM VETOR 
cesta_cafe[0] = "cafe"; // uma atribuição 
cesta_cafe[1] = "ovo";

var cesta_cafe = ["cafe", "ovo"]

cesta_cafe.push("bacon"); //push adiciona itens aos vetor

console.log(cestaCafe)
console.log(cesta_cafe)

/*
var nomes = []
nomes[0] = "joão";

var idades = []
idades[0] = "18";

var telefone = []
telefone[0] = "12374565"

console.log(nomes)
console.log(idades)
console.log(telefone)
*/
// estrutura, dicionario, classe anonima 

/*
console.log(usuario.idade)

var nomes = []
nomes[0] = "joão";
nomes[1] = "otavio";
nomes[2] = "fernado";

var telefone = []
telefone[0] = "12374565"
telefone[1] = "32425454"
telefone[2] = "123463465"

var endereco = []
endereco[0] = "rua larissa 01"
endereco[1]= "rua maria 01"
endereco[2] = "rua laura 01"

console.log(nomes)
console.log(endereco)
console.log(telefone)

var usuario = {
  nomes,
  telefone,
  endereco

}

console.log(usuario)
*/
/*
var lista_de_produto = [];

produto.push({
    item: "feijão",
    valor: 20,
    cod: "23133"

});

produto.push({
    item: "arroz",
    valor: 20,
    cod: "1234"

});

var soma = produto[0].valor + produto[1].valor;
console.log(soma)
*/
var alunos = [];
alunos.push({
    aluno: "jão",
    nota: 10,

});

alunos.push({
    aluno: "lucas",
    nota: 4,

});

alunos.push({
    aluno: "pedro",
    nota: 5,

});

var soma
var resultado 
soma = alunos[0].nota + alunos[1].nota + alunos[2].nota

resultado = soma / 3

console.log(resultado);

