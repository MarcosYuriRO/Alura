// Projeto base Alura
alert("Boas-vindas ao Jogo do Número Secreto!");
let numeroMaximo = 5000;
let numeroSecreto = parseInt(Math.random() * numeroMaximo +1);
console.log (numeroSecreto)
let chute
let tentativas = 1

//enquanto chute nao for igual ao n.s.;
while (chute != numeroSecreto) {
    chute = prompt("Escolha um número entre 1 e " + numeroMaximo);

    if (chute == numeroSecreto) {
        break;
    } else {
        if (chute > numeroSecreto) {
            alert ("O Número Secreto é menor que " + chute);
        } else {
            alert ("O Número Secreto é maior que " + chute);
        }
        //tentativas = tentativas + 1;
        tentativas++;
    }
};

let palavraTentativa = tentativas > 1 ? "tentativas" : "tentativa";
alert("Isso aí! Você descobriu o Número Secreto " + numeroSecreto + " com " + tentativas + " " + palavraTentativa + ".");


// Desafio Tópico 1 Alura (01 ao 07)
/*alert ("Boas-vindas ao nosso site!");
let nome = "Lua";
let idade = 25;
let numeroDeVendas = 50;
let saldoDisponivel = 1000;
let mensagemDeErro = "Erro! Preencha todos os campos";
 alert (mensagemDeErro);*/

 // Desafio Tópico 1 Alura (08 ao 10)
/*let nome = prompt ("Digite o seu nome:");
let idade = prompt ("Digite a sua idade:");

if (idade >= 18) {
   alert ("Pode tirar a habilitação!");
};*/

//Desafio Tópico 2 (01)
/*let diaSemana = prompt ("Escreva o dia da semana");
if (diaSemana == "Domingo" || diaSemana == "Sabado") {
   alert ("Bom fim de semana!");
}  else {
   alert ("Boa semana!");
    };*/

//Desafio Tópico 2 (02)
/*let numero = prompt ("Informe um número");
if (numero >= 0) {
    alert (numero + " é positivo");
} else {
    alert (numero + " é negativo");
};*/

//Desafio Tópico 2 (03)
/*let pontuacao = prompt ("Qual foi a sua pontuação?");
if (pontuacao >= 100) {
    alert ("Parabéns, você ganhou!");
} else {
    alert ("Tente novamente para ganhar.");
};*/
 
//Desafio Tópico 2 (04)
/*let saldoConta = 100;
alert (`Você tem ${saldoConta} reais em sua conta.`);*/

//Desafio Tópico 2 (05)
/*let nome = prompt ("Digite o seu nome:");
alert ("Boas vindas, " + nome);*/

//Desafio Tópico 3 (01)
/*let contador = 1;

while (contador <= 10) {
    alert (contador);
    contador++;
};*/

//Desafio Tópico 3 (02)
/*let contador = 10;

while (contador >= 0) {
    alert (contador);
    contador--;
};*/

//Desafio Tópico 3 (03)
/*let numeroNatural = prompt ("Digite um Número Natural");

while (numeroNatural >= 0) {
    console.log (numeroNatural);
    numeroNatural--;
};*/

//Desafio Tópico 3 (04)
/*let numeroEscolhido = prompt ("Escolha um Número Natural");
let contador = 0;

while (contador <= numeroEscolhido) {
    console.log (contador);
    contador++;
};*/

//Desafio Tópico 4 (01)
/*console.log ("Boas-vindas, usuário(a)");*/

//Desafio Tópico 4 (02)
/*let nome = "Yuri";
console.log ("Olá, " + nome);*/

//Desafio Tópico 4 (03)
/*let nome = "Yuri";
alert ("Olá, " + nome);*/

//Desafio Tópico 4 (04)
/*let lingFav = prompt ("Qual sua linguagem favorita de programação?");
console.log (lingFav);*/

//Desafio Tópico 4 (05)
/*let valor1 = 1;
let valor2 = 4;
let resultado = valor1 + valor2;
console.log (`A soma de ${valor1} e ${valor2} é igual a ${resultado}`);*/

//Desafio Tópico 4 (06)
/*let valor1 = 5;
let valor2 = 3;
let resultado = valor1 - valor2;
console.log (`A diferença entre ${valor1} e ${valor2} é igual a ${resultado}`);*/

//Desafio Tópico 4 (07)
/*let idade = prompt ("Insira a sua idade");

if (idade >= 18) {
    console.log ("Você é maior de idade");
} else {
    console.log ("Você é menor de idade");
}*/

//Desafio Tópico 4 (08)
/*let numero  = prompt ("Digite um Número Inteiro");

if (numero != 0) {
    let sinalNumero = numero > 0 ? "positivo" : "negativo"
    console.log (`${numero} é um número ${sinalNumero}`);
} else {
    console.log ("o seu número é Zero");
};*/

//Desafio Tópico 4 (09)
/*let contador = 1

while (contador <= 10) {
    console.log (contador);
    contador++;
};*/

//Desafio Tópico 4 (10)
/*let nota = 10;

if (nota >= 7) {
    console.log ("Parabéns! Você foi Aprovado.");
} else{
    console.log ("Você foi Reprovado.");
};*/

//Desafio Tópico 4 (11)
/*let numeroAleatorio = (Math.random());
console.log (numeroAleatorio);*/

//Desafio Tópico 4 (12)
/*let numeroAleatorio = parseInt(Math.random() * 10 + 1);
console.log (numeroAleatorio);*/

//Desafio Tópico 4 (13)
/*let numeroAleatorio = parseInt(Math.random() * 1000 + 1);
console.log (numeroAleatorio);*/