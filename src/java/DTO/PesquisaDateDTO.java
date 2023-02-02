
package DTO;

import java.util.Date;

public class PesquisaDateDTO {
    
    private Date datainicio;
    private Date datafim;
    private int iduser,soma, id_app;
    private String nome_user, nome_app, senha_user;

    public Date getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Date datainicio) {
        this.datainicio = datainicio;
    }

    public Date getDatafim() {
        return datafim;
    }

    public void setDatafim(Date datafim) {
        this.datafim = datafim;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    public String getNome_user() {
        return nome_user;
    }

    public void setNome_user(String nome_user) {
        this.nome_user = nome_user;
    }

    public String getNome_app() {
        return nome_app;
    }

    public void setNome_app(String nome_app) {
        this.nome_app = nome_app;
    }

    public int getId_app() {
        return id_app;
    }

    public void setId_app(int id_app) {
        this.id_app = id_app;
    }

    /**
     * @return the senha_user
     */
    public String getSenha_user() {
        return senha_user;
    }

    /**
     * @param senha_user the senha_user to set
     */
    public void setSenha_user(String senha_user) {
        this.senha_user = senha_user;
    }
    
    
}
