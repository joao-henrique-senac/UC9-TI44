const input = require("../input");


(async() => {

    console.log("Corretor palavras: ");
      const palavra = await input();

      let novapalvra = palavra.replace("empresa" ,"startup " )
   
    console.log(`Esse é aforma sugeriada ${novapalvra}`);
})();
