function validarEmail(email) {
    const regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return regex.test(email);
}


function validarTelefone(telefone) {
  // Remove tudo que não for número
  const cleaned = telefone.replace(/\D/g, "");

  // Regras:
  // 8 dígitos  → telefone fixo
  // 9 dígitos  → celular sem DDD
  // 10 dígitos → telefone fixo com DDD
  // 11 dígitos → celular com DDD (brasileiro padrão)
  
  const regex = /^(\d{8}|\d{9}|\d{10}|\d{11})$/;

  return regex.test(cleaned);
}


module.exports = {validarEmail, validarTelefone};