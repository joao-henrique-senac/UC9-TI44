function validarCPF(cpf) {
  // Remove caracteres não numéricos
  cpf = cpf.replace(/\D/g, "");

  // Verifica se tem 11 dígitos
  if (cpf.length !== 11) return console.log("CPF deve ter 11 dígitos");

  // Rejeita CPFs com todos os dígitos iguais (ex: 11111111111)
  if (/^(\d)\1{10}$/.test(cpf)) return console.log("CPF não pode ter todos os dígitos iguais");

  // Função para calcular um dígito verificador
  function calcularDigito(cpfParcial, fatorInicial) {
    let soma = 0;
    for (let i = 0; i < cpfParcial.length; i++) {
      soma += parseInt(cpfParcial[i]) * (fatorInicial - i);
    }
    const resto = (soma * 10) % 11;
    return resto === 10 ? 0 : resto;
  }

  const digito1 = calcularDigito(cpf.slice(0, 9), 10);
  const digito2 = calcularDigito(cpf.slice(0, 10), 11);

  return digito1 === parseInt(cpf[9]) && digito2 === parseInt(cpf[10]);
  
}

// Exemplo de uso:
// true
module.exports = validarCPF;