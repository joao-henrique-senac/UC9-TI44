const input = require("../input");


(async() => {

    console.log("digite o seu texto ");
      const texto = await input();

    console.log(`esse texto tem  ${texto.length} caracteres`);
})();
