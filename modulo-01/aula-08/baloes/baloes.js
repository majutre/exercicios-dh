function start() {

    let nivel = document.getElementById("nivelJogo").value;

    window.location.href = "jogo.html?" + nivel;

}

function iniciaJogo() {

    let url = window.location.search;
    let nivel_jogo = url.replace("?", "");

    let tempo = 0;

    if (nivel_jogo == 1) { //nível fácil: 120 segundos
        tempo = 120;
    }

    if (nivel_jogo == 2) { //nível médio: 60 segundos
        tempo = 60;
    }

    if (nivel_jogo == 3) { //nível difícil: 30 segundos
        tempo = 30;
    }

    //inserindo segundos no span
    document.getElementById("cronometro").innerHTML = tempo;

    //quantidade de balões
    let qteBaloes = 80;

    //imprimir quantidade de balões inteiros
    document.getElementById("baloesInteiros").innerHTML = qteBaloes;
    document.getElementById("baloesEstourados").innerHTML = 0;

    criaBaloes(qteBaloes);
    contagem_tempo(tempo + 1);
}

function contagem_tempo(segundos) {

    segundos = segundos - 1;

    if (segundos == -1) {
        clearTimeout(timerId); //para a execução da função do settimeout
        game_over();
        return false;
    }

    if (segundos <= 5){
        document.getElementById('cronometro').style.color = "red";
    }

    document.getElementById('cronometro').innerHTML = segundos;

    timerId = setTimeout("contagem_tempo(" + segundos + ")", 1000);
}

function game_over() {
    remove_evento_baloes();
    alert("Fim de jogo, você não conseguiu estourar todos os balões a tempo ")
}



function criaBaloes(qteBaloes) {
    for (let i = 1; i <= qteBaloes; i++) {

        let balao = document.createElement("img");
        balao.src = "imagens/balao_azul_pequeno.png";
        balao.style.margin = "10px";
        balao.id = "b"+i;
        balao.onclick = function(){estourar(this);} ;

        document.getElementById("cenario").appendChild(balao);
    }
}

function estourar(e) {

    var id_balao = e.id;

    document.getElementById(id_balao).setAttribute("onclick", "");
    document.getElementById(id_balao).src = 'imagens/balao_azul_pequeno_estourado.png';

    pontuacao(-1);

}

function pontuacao(acao) {

    var baloesInteiros = document.getElementById('baloesInteiros').innerHTML;
    var baloesEstourados = document.getElementById('baloesEstourados').innerHTML;

    baloesInteiros = parseInt(baloesInteiros);
    baloesEstourados = parseInt(baloesEstourados);

    baloesInteiros = baloesInteiros + acao;
    baloesEstourados = baloesEstourados - acao;

    document.getElementById('baloesInteiros').innerHTML = baloesInteiros;
    document.getElementById('baloesEstourados').innerHTML = baloesEstourados;

    situacao_jogo(baloesInteiros);


}

function situacao_jogo(baloesInteiros) {
    if (baloesInteiros == 0) {
        alert('Parabéns, você conseguiu estourar todos os balões a tempo');
        parar_jogo();
    }
}

function parar_jogo() {
    clearTimeout(timerId);
}
