/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Prince Hossain
 */


public class Client {
    
    private int client_id;
    private String client_name;
    private String client_gender;
    private String client_email;
    private String client_address;
    private String client_phone_number;
    private int Client_age;
    private int credit_score;

    public Client(int client_id, String client_name, String client_gender, String client_address, String client_phone_number, String client_email,int Client_age, int credit_score) {
        this.client_id = client_id;
        this.client_name = client_name;
        this.client_gender = client_gender;
        this.client_address = client_address;
        this.client_phone_number = client_phone_number;
        this.client_email = client_email;
        this.Client_age = Client_age;
        this.credit_score = credit_score;
    }

    public int getClient_id() {
        return client_id;
    }

    public String getClient_name() {
        return client_name;
    }

    public String getClient_gender() {
        return client_gender;
    }

    public String getClient_email() {
        return client_email;
    }

    public String getClient_address() {
        return client_address;
    }

    public String getClient_phone_number() {
        return client_phone_number;
    }

    public int getClient_age() {
        return Client_age;
    }

    public int getCredit_score() {
        return credit_score;
    }
    

}


