var rodada = 1;
var matriz = Array(3); //[a, b, c]

matriz["a"] = Array(3); //[[a1, a2, a3], b, c]
matriz["b"] = Array(3); //[[a1, a2, a3], [b1, b2, b3], c]
matriz["c"] = Array(3); //[[a1, a2, a3], [b1, b2, b3], [c1, c2, c3]]

//zerar matriz
//[[0, 0, 0], [0, 0, 0], [0, 0, 0]]
matriz["a"][1] = 0;
matriz["a"][2] = 0;
matriz["a"][3] = 0;

matriz["b"][1] = 0;
matriz["b"][2] = 0;
matriz["b"][3] = 0;

matriz["c"][1] = 0;
matriz["c"][2] = 0;
matriz["c"][3] = 0;

$(document).ready(function () {
    $("#btnStart").click(function () {

        //valida digitação dos apelidos dos jogadores
        if ($("#user1").val() == "") {
            alert("Preencha o apelido do Jogador 1.")
            return false;
        }

        if ($("#user2").val() == "") {
            alert("Preencha o apelido do Jogador 2.")
            return false;
        }

        //exibir apelidos e criar spans
        $("#input-user1").html($("#user1").val());
        $("#input-user2").html($("#user2").val());

        //controlar visualização das divs
        $("#pagina-inicial").hide();
        $("#palco").show();

    });

    //adicionar class jogada em cada div do jogo
    $(".jogada").click(function () {

        //criar id em cada div do jogo
        var idClick = this.id;
        $("#" + idClick).off();
        jogada(idClick);
    });

    function jogada(id) {

        //criar variável rodada
        var icone = "";
        var ponto = 0;

        //a cada rodada, verificar que jogador está jogando (par/impar)
        if ((rodada % 2) == 1) {
            icone = "url('assets/imagens/marcacao_1.png')";
            ponto = -1;
        } else {
            icone = "url('assets/imagens/marcacao_2.png')";
            ponto = 1;
        }

        rodada++;

        $("#" + id).css("background-image", icone);

        //criar arrays globalmente
        //quebrar id para pegar a linha e coluna
        var linha_coluna = id.split("-");

        matriz[linha_coluna[0]][linha_coluna[1]] = ponto;

        //verificar se houve vencedor
        verifica_combinacao();
    console.log(matriz);

    }

    function verifica_combinacao() {

        //verificar linha A
        var pontos = 0;
        for (var i = 1; i <= 3; i++) {
            pontos = pontos + matriz["a"][i];
        }
        ganhador(pontos);

        //verificar linha B
        var pontos = 0;
        for (var i = 1; i <= 3; i++) {
            pontos = pontos + matriz["b"][i];
        }
        ganhador(pontos);

        //verificar linha C
        var pontos = 0;
        for (var i = 1; i <= 3; i++) {
            pontos = pontos + matriz["c"][i];
        }
        ganhador(pontos);

        //verificar vertical
        for (var i = 1; i <= 3; i++) {
            pontos = 0;
            pontos = pontos + matriz["a"][i];
            pontos = pontos + matriz["b"][i];
            pontos = pontos + matriz["c"][i];

            ganhador(pontos);
        }

        //verificar diagonal
        
        pontos = 0;
        pontos = matriz["a"][1] + matriz["b"][2]; + matriz["c"][3];
        ganhador(pontos);

        pontos = 0;
        pontos = matriz["a"][3] + matriz["b"][2]; + matriz["c"][1];
        ganhador(pontos);
        

    }

    function ganhador(pontos) {
        if (pontos == -3){
            var jogada_1 = $("#user1").val();
            alert(jogada_1 + " é o vencedor");
            $(".jogada").off();
        } else if (pontos == 3) {
            var jogada_2 = $("#user2").val();
            alert(jogada_2 + " é o vencedor");
            $(".jogada").off();
        }
    }
});