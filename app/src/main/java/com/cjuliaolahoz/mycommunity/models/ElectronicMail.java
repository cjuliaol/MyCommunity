package com.cjuliaolahoz.mycommunity.models;

/**
 * Created by cjuliaol on 24/10/2016.
 */

public class ElectronicMail {
    private int mailId;
    private String Mail;
    private int inhabitantId;

    public int getMailId() {
        return mailId;
    }

    public void setMailId(int mailId) {
        this.mailId = mailId;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public int getInhabitantId() {
        return inhabitantId;
    }

    public void setInhabitantId(int inhabitantId) {
        this.inhabitantId = inhabitantId;
    }
}
