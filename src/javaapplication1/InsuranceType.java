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
public class InsuranceType {
     private int type_id;
    private int amount_paid;
    private int amount_received;

    public InsuranceType(int type_id, int amount_paid, int amount_received) {
        this.type_id = type_id;
        this.amount_paid = amount_paid;
        this.amount_received = amount_received;
    }

    public int getType_id() {
        return type_id;
    }

    public int getAmount_paid() {
        return amount_paid;
    }

    public int getAmount_received() {
        return amount_received;
    }
    
    
}
