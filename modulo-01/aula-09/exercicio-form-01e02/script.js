function validaForm() {
    var fName = document.getElementById("fName").value;
    var lName = document.getElementById("lName").value;
    var pwd1 = document.getElementById("pwd1").value;
    var pwd2 = document.getElementById("pwd2").value;

    if (fName == "") {
        alert("O campo 'nome' é obrigatório.");
        return false;
    }

    if (lName == "") {
        alert("O campo 'sobrenome' é obrigatório.");
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

function getFormvalue(){
    var fName = document.getElementById("fName").value;
    var lName = document.getElementById("lName").value;

    var nomeCompleto = fName + " " + lName;

    return nomeCompleto;
}