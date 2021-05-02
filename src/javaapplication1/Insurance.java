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
public class Insurance {
    private int insurance_id;
    private String clientName;
    private String employeeName;
    private int amountReceiveType;
    private String start_date;
    private String end_date;

    public Insurance(int insurance_id, String clientName, String employeeName, int amountReceiveType, String start_date, String end_date) {
        this.insurance_id = insurance_id;
        this.clientName = clientName;
        this.employeeName = employeeName;
        this.amountReceiveType = amountReceiveType;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public int getInsurance_id() {
        return insurance_id;
    }

    public String getClientName() {
        return clientName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getAmountReceiveType() {
        return amountReceiveType;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getEnd_date() {
        return end_date;
    }
    
    
}
