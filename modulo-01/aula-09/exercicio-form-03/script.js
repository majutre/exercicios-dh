function validaForm() {

    var fName = document.getElementById("fName").value;
    var lName = document.getElementById("lName").value;
    var email = document.getElementById("email").value;
    var pwd1 = document.getElementById("pwd1").value;
    var pwd2 = document.getElementById("pwd2").value;

    if (typeof fName != "string") {
        alert("Preencha o campo 'nome' corretamente.");
        return false;
    }

    if (typeof lName != "string") {
        alert("Preencha o campo 'sobrenome' corretamente.");
        return false;
    }

    if (email == "") {
        alert("O preenchimento do e-mail é obrigatório.");
        return false;
    }

    if (pwd1 == "") {
        alert("O preenchimento da senha é obrigatório.");
        return false;
    }

    if (pwd2 == "") {
        alert("O campo 'repita a senha' é obrigatório.");
        return false;
    }

    if (pwd1 != pwd2) {
        alert("As senhas digitadas não coincidem.");
        return false;
    }
}


function apagar() {
  document.getElementById("myForm").reset();
}

function ocultar(){

    var fName = document.getElementById("fName").value;
    var lName = document.getElementById("lName").value;
    var email = document.getElementById("email").value;

    document.getElementById("divForm").style.display = "none";
    document.getElementById("botoes").style.display = "none";
    document.getElementById("dados").style.display = "block";

    document.getElementById("ul1").innerHTML = fName;
    document.getElementById("ul2").innerHTML = lName;
    document.getElementById("ul3").innerHTML = email;
}


function changeBg(value) {
    var color = document.body.style.backgroundColor;
    switch (value) {
        case "f":
            color = "lightSkyBlue";
            break;
        case "m":
            color = "lightPink";
            break;
        case "o":
            color = "MediumSlateBlue";
            break;
    }
    document.body.style.backgroundColor = color;
}


function editar(){
    var fName = document.getElementById("fName").value;
    var lName = document.getElementById("lName").value;
    var email = document.getElementById("email").value;

    document.getElementById("divForm").style.display = "block";
    document.getElementById("botoes").style.display = "block";
    document.getElementById("dados").style.display = "none";

  //
}
