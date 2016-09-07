package com.HBV501G.skutl.model;


import java.util.Date;

/**
 * Created by Siggigauti on 07/09/2016.
 */
public class Ferd {
    private int ferdId; //Geyma meta upplýsingar.
    private Date dateCreated; //Hvenær var búið til YYYY-MM-DD
    private Date dateDeparture; //Hvenær er farið af stað MM-DD-HH-MM
    private String createdBy; //Username á hver bjó til (verður sér obj seinna)
    private String[] tagAlongs; //Listi af fólki sem er að fara með (usernames)
    private String departureLocation; //Getur verið object af bæjum? sama fyrir arrival.
    private String arrivalLocation;
    private int carSpaceLeft; //Hversu mikið pláss eftir í bílnum
    private int gasPrice; //Hvert er verðið

    public Ferd(int ferdId, Date dateCreated, Date dateDeparture, String createdBy, String[] tagAlongs, String departureLocation, String arrivalLocation, int carSpaceLeft, int gasPrice) {
        this.ferdId = ferdId;
        this.dateCreated = dateCreated;
        this.dateDeparture = dateDeparture;
        this.createdBy = createdBy;
        this.tagAlongs = tagAlongs;
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.carSpaceLeft = carSpaceLeft;
        this.gasPrice = gasPrice;
    }

    public int getFerdId() {
        return ferdId;
    }

    public void setFerdId(int ferdId) {
        this.ferdId = ferdId;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(Date dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String[] getTagAlongs() {
        return tagAlongs;
    }

    public void setTagAlongs(String[] tagAlongs) {
        this.tagAlongs = tagAlongs;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public int getCarSpaceLeft() {
        return carSpaceLeft;
    }

    public void setCarSpaceLeft(int carSpaceLeft) {
        this.carSpaceLeft = carSpaceLeft;
    }

    public int getGasPrice() {
        return gasPrice;
    }

    public void setGasPrice(int gasPrice) {
        this.gasPrice = gasPrice;
    }
}
