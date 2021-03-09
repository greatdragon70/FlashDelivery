package com.entities;

public class Order {
    private String DHcode;
    private int postCode;
    private String senderName;
    private String senderAddress;
    private int senderPhone;
    private String recipientName;
    private String recipientAddress;
    private int recipientPhone;
    private String type;
    private int weight;
    private String idStatus;
    private float shippingFee;
    private float collectionFee;
    private float totalMoney;

    public Order(String DHcode, int postCode, String senderName, String senderAddress, int senderPhone, String recipientName, String recipientAddress, int recipientPhone, String type, int weight, String idStatus, float shippingFee, float collectionFee, float totalMoney) {
        this.DHcode = DHcode;
        this.postCode = postCode;
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.senderPhone = senderPhone;
        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.recipientPhone = recipientPhone;
        this.type = type;
        this.weight = weight;
        this.idStatus = idStatus;
        this.shippingFee = shippingFee;
        this.collectionFee = collectionFee;
        this.totalMoney = totalMoney;
    }

    public String getDHcode() {
        return DHcode;
    }

    public void setDHcode(String DHcode) {
        this.DHcode = DHcode;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public int getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(int senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public int getRecipientPhone() {
        return recipientPhone;
    }

    public void setRecipientPhone(int recipientPhone) {
        this.recipientPhone = recipientPhone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(String idStatus) {
        this.idStatus = idStatus;
    }

    public float getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(float shippingFee) {
        this.shippingFee = shippingFee;
    }

    public float getCollectionFee() {
        return collectionFee;
    }

    public void setCollectionFee(float collectionFee) {
        this.collectionFee = collectionFee;
    }

    public float getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(float totalMoney) {
        this.totalMoney = totalMoney;
    }
}
