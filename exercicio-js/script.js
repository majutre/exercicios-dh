//1

function par(num){
    if (num % 2 == 0) {
        console.log("O número " + num + " é par."); //`O número ${num} é par.`
    } else {
        console.log(`O número ${num} é ímpar.`); //"O número " + num + " é ímpar."
    }
}

//2

nPrimo = num => {
    for (let i = 2; i < num; i++)
        if (num % i === 0) {
            return false;
        }
    return num > 1;
}

//3

for (i = 10; i > 0; i--) {
    console.log(i);
}
console.log("depois");

//4

//5

//6
/*
arr = [5.3, 4.7, 8.5, 7.1, 6.4, 9.2, 9.8, 5.5, 7.4, 7.0];

let notas = [];

arr.forEach(element => {
    if (element > 7){
        notas.push(element);
    }
});

console.log(notas);

//função callable

function acimaMedia (arr){
    arr.forEach(element => {
        if (element > 7) {
            notas.push(element);
        }
    });
    console.log(notas);
}
*/

//7

const produtos = [ { nome:"Banana", preco: 1.2 }, { nome: "Suco", preco: 2.5 }, { nome: "Batata", preco: .75 } ];

function somar(arr){
    let soma = 0;
    for (i=0; i < arr.length; i++){
        soma = soma + arr[i].preco;
    }
    console.log(soma);
}

somar(produtos);
