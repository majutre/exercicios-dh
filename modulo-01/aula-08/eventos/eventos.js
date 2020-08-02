//Parte do Exercício 2
function dizerOi() {
    alert("Olá!");
}

//Parte do Exercício 3
function mudarBg() {
    document.body.style.backgroundColor = "green"
}

//Parte do Exercício 4
function sight() {
    console.log("Estou vendo a imagem.");
}

/*
//Parte do Exercício 5 - antes de adicionar a tarefa do exercício 9
function clicker(){
    let pic = document.getElementById("fotoPraia");
    pic.addEventListener("click", () => {console.log("Estou clicando na imagem");}, false);
}
*/

//Exercício 5 e 9
function clicker() {
    let x = event.clientX;
    let y = event.clientY;
    let coor = "Localização do mouse => Coordenada X: " + x + "; coordenada Y: " + y + ".";
    let pic = document.getElementById("fotoPraia");
    pic.addEventListener("click", () => {
        console.log(coor);
    }, false);
}

//Parte do Exercício 6
function changeColor() {
    document.getElementById("bd").addEventListener("click", changeColor);
    this.style.backgroundColor = "red";
    return false;
}
/*
//Sem listener (exercício 07)
function changeColor() {
    document.getElementById("bd").style.backgroundColor = "red";
    return false;
}
*/

//Parte do Exercício 8
function fail() {
    alert("Não é possível enviar :(");
    return false;
}

//Parte do Exercício 9

function goTo() {
    //window.location.href = "http://google.com";
    window.location.replace("http://stackoverflow.com");
}

//TIMERS

//1


function timer() {
    setTimeout(function () {
        alert("Tempo esgotado!");
    }, 10000);
}


function timer2() {
    setInterval(function () {
        alert("hora do intervalo");
    }, 5000);
}