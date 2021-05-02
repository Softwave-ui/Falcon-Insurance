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
public class DrivingLicense {
    
    private int license_id;
    private String clientName;
    private int client_id;
    private String driving_skills;
    private String issue_date;
    private String Expiry_date;

    public DrivingLicense(int license_id, String clientName, String driving_skills, String issue_date, String Expiry_date) {
        this.license_id = license_id;
        this.clientName = clientName;
        this.client_id = client_id;
        this.driving_skills = driving_skills;
        this.issue_date = issue_date;
        this.Expiry_date = Expiry_date;
    }

    public int getLicense_id() {
        return license_id;
    }



    public String getClientName() {
        return clientName;
    }

    public String getDriving_skills() {
        return driving_skills;
    }

    public String getIssue_date() {
        return issue_date;
    }

    public String getExpiry_date() {
        return Expiry_date;
    }
    

    
}
