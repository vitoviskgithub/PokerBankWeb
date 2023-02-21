function abrirModal(){
    const modal = document.getElementById('janelaModalID');
    /**atribuindo uma classe ao
     elemento class modal e id janelaModalID */
    modal.classList.add('abrir');

    /*quando o elemento modal for
    clicado vai contecer algum 
    evento
    (e) é para adicionar eventos
    no javascript nessa sintaxe*/
    modal.addEventListener('click', (e)=>{
        /* quero que o evento ocorro quando
        o alvo for o seguinte id*/
        if(e.target.id == 'fecharID'||e.target.id == 'janelaModalID'){
            modal.classList.remove('abrir');
        }
    });
}