var rodada = 1;
var matriz_jogo = Array(3); //[[0,0,0],[0,0,0],[0,0,0]]
matriz_jogo['a'] = Array(3);
matriz_jogo['b'] = Array(3);
matriz_jogo['c'] = Array(3);
matriz_jogo['a'][1] = 0;
matriz_jogo['a'][2] = 0;
matriz_jogo['a'][3] = 0;
matriz_jogo['b'][1] = 0;
matriz_jogo['b'][2] = 0;
matriz_jogo['b'][3] = 0;
matriz_jogo['c'][1] = 0;
matriz_jogo['c'][2] = 0;
matriz_jogo['c'][3] = 0;
$(document).ready(function () {
    $('#btnStart').click(function () {
        //valida a digitação dos apelidos dos jogadores
        if ($('#user1').val() == '') {
            alert('Apelido do jogador 1 não foi preenchido');
            return false;
        }
        if ($('#user2').val() == '') {
            alert('Apelido do jogador 2 não foi preenchido');
            return false;
        }
        //exibir os apelidos
        $('#input_user1').html($('#user1').val());
        $('#input_user2').html($('#user2').val());
        //contrala visualização das divs
        $('#pagina-inicial').hide();
        $('#palco').show();
    });
    $('.jogada').click(function () {
        var id_campo_clicado = this.id;
        $("#" + id_campo_clicado).off();
        jogada(id_campo_clicado);
    });

    function jogada(id) {
        var icone = '';
        var ponto = 0;
        if ((rodada % 2) == 1) {
            icone = 'url("assets/imagens/marcacao_1.png")';
            ponto = -1;
        } else {
            icone = 'url("assets/imagens/marcacao_2.png")';
            ponto = 1;
        }
        rodada++;
        $('#' + id).css('background-image', icone);
        //criar arrays globalmente
        //quebrar o id para pegar linha e coluna
        var linha_coluna = id.split('-'); //a-1
        matriz_jogo[linha_coluna[0]][linha_coluna[1]] = ponto;
        console.log(matriz_jogo);
        //verificação se houve vencedor
        verifica_combinacao();
    }

    function verifica_combinacao() {
        //verifica na horizontal linha A
        var pontos = 0;
        for (var i = 1; i <= 3; i++) {
            pontos = pontos + matriz_jogo['a'][i];
        }
        ganhador(pontos);
        //verifica na horizontal linha B
        pontos = 0;
        for (var i = 1; i <= 3; i++) {
            pontos = pontos + matriz_jogo['b'][i];
        }
        ganhador(pontos);
        //verifica na horizontal linha C
        pontos = 0;
        for (var i = 1; i <= 3; i++) {
            pontos = pontos + matriz_jogo['c'][i];
        }
        ganhador(pontos);
        //verifica na vertical
        for (var l = 1; l <= 3; l++) {
            pontos = 0;
            pontos = pontos + matriz_jogo['a'][l];
            pontos = pontos + matriz_jogo['b'][l];
            pontos = pontos + matriz_jogo['c'][l];
            ganhador(pontos);
        }
        //verificar na diagonal
        pontos = 0;
        pontos = matriz_jogo['a'][1] + matriz_jogo['b'][2] + matriz_jogo['c'][3];
        ganhador(pontos);
        pontos = 0;
        pontos = matriz_jogo['a'][3] + matriz_jogo['b'][2] + matriz_jogo['c'][1];
        ganhador(pontos);
    }

    function ganhador(pontos) {
        if (pontos == -3) {
            var jogada_1 = $('#user1').val();
            alert(jogada_1 + ' é o vencedor');
            $('.jogada').off();
        } else if (pontos == 3) {
            var jogada_2 = $('#user2').val();
            alert(jogada_2 + ' é o vencedor');
            $('.jogada').off();
        }
    }
});