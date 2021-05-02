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
public class installment {
    
    private int installment_id;
    private String clientName;
    private String issue_date;
    private String due_date;
    private String pay_date;
    private int amount;

    public installment(int installment_id, String clientName, String issue_date, String due_date, String pay_date, int amount) {
        this.installment_id = installment_id;
        this.clientName = clientName;
        this.issue_date = issue_date;
        this.due_date = due_date;
        this.pay_date = pay_date;
        this.amount = amount;
    }

    public int getInstallment_id() {
        return installment_id;
    }

    public String getClientName() {
        return clientName;
    }

    public String getIssue_date() {
        return issue_date;
    }

    public String getDue_date() {
        return due_date;
    }

    public String getPay_date() {
        return pay_date;
    }

    public int getAmount() {
        return amount;
    }
    
    
    
}
