package DTO;

import java.util.Date;

public class BankUserDTO {

    private int id_user_bank, app_id_bank, codigo_bank, entrada_bank, perda_bank, ganho_bank, saldo_bank, saque_bank;
    private Date data_bank;
    private String comment_bank;

    public int getCodigo_bank() {
        return codigo_bank;
    }

    public void setCodigo_bank(int codigo_bank) {
        this.codigo_bank = codigo_bank;
    }

    public int getEntrada_bank() {
        return entrada_bank;
    }

    public void setEntrada_bank(int entrada_bank) {
        this.entrada_bank = entrada_bank;
    }

    public int getPerda_bank() {
        return perda_bank;
    }

    public void setPerda_bank(int perda_bank) {
        this.perda_bank = perda_bank;
    }

    public int getGanho_bank() {
        return ganho_bank;
    }

    public void setGanho_bank(int ganho_bank) {
        this.ganho_bank = ganho_bank;
    }

    public int getSaldo_bank() {
        return saldo_bank;
    }

    public void setSaldo_bank(int saldo_bank) {
        this.saldo_bank = saldo_bank;
    }

     public int getSaque_bank() {
        return saque_bank;
    }

    public void setSaque_bank(int saque_bank) {
        this.saque_bank = saque_bank;
    }

    public int getId_user_bank() {
        return id_user_bank;
    }

    public void setId_user_bank(int id_user_bank) {
        this.id_user_bank = id_user_bank;
    }

    public int getApp_id_bank() {
        return app_id_bank;
    }

    public void setApp_id_bank(int app_id_bank) {
        this.app_id_bank = app_id_bank;
    }

    public Date getData_bank() {
        return data_bank;
    }

    public void setData_bank(Date data_bank) {
        this.data_bank = data_bank;
    }

    public String getComment_bank() {
        return comment_bank;
    }

    public void setComment_bank(String comment_bank) {
        this.comment_bank = comment_bank;
    }

}
