//1

function par(num) {
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

function anoNovo(cb) {

    for (i = 10; i > 0; i--) {
        console.log(i);
    }

    cb();

}

function xyz() {
    console.log("feliz ano novo!!!");
}

anoNovo(xyz);


//4

let p1 = new Promise((res, rej) => {
    setTimeout(function () {
        for (i = 10; i > 0; i--) {
            console.log(i);
        }
    }, 3000);

    if (res) {
        res("Promise fulfilled!")
    } else {
        console.log(rej);
    }

    p1.then((msg) => {
        console.log("Teste1", msg)
    }).catch((err) => {
        console.log(err);
    });
});


//5

const newYearsEve = async () => {
    try {
      const countdown = () => {
            for (let i = 10; i > 0; i--) {
                console.log(i);
            }
        }
      const msg = () => {
            countdown();
            return "Feliz ano novoooooooooo!!!";
        }
        res = await msg();
        console.log(res)
    } catch (err) {
        console.log(err)
    }
}
newYearsEve();


//6

arr = [5.3, 4.7, 8.5, 7.1, 6.4, 9.2, 9.8, 5.5, 7.4, 7.0];

let notas = [];

function acimaMedia(arr) {
    arr.forEach(element => {
        if (element > 7) {
            notas.push(element);
        }
    });
    console.log(notas);
}
acimaMedia(arr);

//7

const produtos = [{
    nome: "Banana",
    preco: 1.2
}, {
    nome: "Suco",
    preco: 2.5
}, {
    nome: "Batata",
    preco: .75
}];

function somar(arr) {
    let soma = 0;
    for (i = 0; i < arr.length; i++) {
        soma = soma + arr[i].preco;
    }
    console.log(soma);
}

somar(produtos);

//8

var alunos = [{
        nome: "Clara",
        grade: 8,
        materia: ""
    },
    {
        nome: "Matheus",
        grade: 8,
        materia: ""
    },
    {
        nome: "Thiago",
        grade: 9,
        materia: ""
    },
    {
        nome: "Marina",
        grade: 8,
        materia: ""
    },
    {
        nome: "Luís",
        serie: 9,
        materia: ""
    },
    {
        nome: "Fernanda",
        serie: 9,
        materia: ""
    }
];

function qualMateria(arr) {
    arr.forEach(student => {
        if (student.grade === 9) {
            student.materia = "Física";
        } else {
            student.materia = "História";
        }
    });
    return arr;
}


console.log(qualMateria(alunos));