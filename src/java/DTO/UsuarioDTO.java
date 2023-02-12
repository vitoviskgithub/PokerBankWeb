package DTO;

//ENCAPSULAMENTO (GET AND SET)
public class UsuarioDTO {

    private int id_usuario;
    private int adm_usuario, cod_contapoker;
    private String nome_usuario, email_usuario, telefone_usuario, senha_usuario, usuario_ativo;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getAdm_usuario() {
        return adm_usuario;
    }

    public void setAdm_usuario(int adm_usuario) {
        this.adm_usuario = adm_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getTelefone_usuario() {
        return telefone_usuario;
    }

    public void setTelefone_usuario(String telefone_usuario) {
        this.telefone_usuario = telefone_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public int getCod_contapoker() {
        return cod_contapoker;
    }

    public void setCod_contapoker(int cod_contapoker) {
        this.cod_contapoker = cod_contapoker;
    }

    public String getUsuario_ativo() {
        return usuario_ativo;
    }

    public void setUsuario_ativo(String usuario_ativo) {
        this.usuario_ativo = usuario_ativo;
    }

}
