//Em minha visão isso não deveria ser funcionalidade do Front, pois haveria matriculas repitidas
function gerarMatricula() {
   var txt = "ACA";
   var aleatorio = Math.floor(Math.random() * 1500);
   txt = txt + aleatorio;
   //basicamente é uma função especifica para ser rodada no botão de matricula
   //não vejo sentido caso queira retornar a outra função
   document.getElementById('matricula').value = txt;
}