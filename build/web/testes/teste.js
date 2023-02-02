const botao = document.getElementById("btnClique");
const botao1 = document.getElementById("btnApenas");

botao.addEventListener("click", fnSoma);
botao1.addEventListener("click", nada);

function fnSoma(){
    alert(3+8);
    return;
}

function nada(){
    
    alert("NADA");
    return;
}
 

