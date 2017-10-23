package edu.webfutuandroid.ing26sistemas.gamescenral.model;

/**
 * Created by ing26sistemas on 22/10/17.
 */

public class Picture {

    private String picture;
    private String nameCard;
    private String citynameCard;

    public Picture(String picture, String nameCard, String citynameCard) {
        this.picture = picture;
        this.nameCard = nameCard;
        this.citynameCard = citynameCard;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public String getCitynameCard() {
        return citynameCard;
    }

    public void setCitynameCard(String citynameCard) {
        this.citynameCard = citynameCard;
    }
}
