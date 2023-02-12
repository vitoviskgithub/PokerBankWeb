package DTO;

import java.util.Date;

public class TournamentsDTO {

    private int id_tourn, value_tourn, itm_val_tourn, app_id_tourn, id_user_tourn;
    private String type_tourn, desc_tourn;
    private Date date_tourn;

    public int getId_tourn() {
        return id_tourn;
    }

    public void setId_tourn(int id_tourn) {
        this.id_tourn = id_tourn;
    }

    public int getValue_tourn() {
        return value_tourn;
    }

    public void setValue_tourn(int value_tourn) {
        this.value_tourn = value_tourn;
    }

    public int getItm_val_tourn() {
        return itm_val_tourn;
    }

    public void setItm_val_tourn(int itm_val_tourn) {
        this.itm_val_tourn = itm_val_tourn;
    }

    public String getType_tourn() {
        return type_tourn;
    }

    public void setType_tourn(String type_tourn) {
        this.type_tourn = type_tourn;
    }

    public int getApp_id_tourn() {
        return app_id_tourn;
    }

    public void setApp_id_tourn(int app_id_tourn) {
        this.app_id_tourn = app_id_tourn;
    }

    public int getId_user_tourn() {
        return id_user_tourn;
    }

    public void setId_user_tourn(int id_user_tourn) {
        this.id_user_tourn = id_user_tourn;
    }

    public Date getDate_tourn() {
        return date_tourn;
    }

    public void setDate_tourn(Date date_tourn) {
        this.date_tourn = date_tourn;
    }

    public String getDesc_tourn() {
        return desc_tourn;
    }

    public void setDesc_tourn(String desc_tourn) {
        this.desc_tourn = desc_tourn;
    }

}
