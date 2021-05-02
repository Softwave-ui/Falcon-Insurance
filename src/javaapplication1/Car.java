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
public class Car {
    
    private int car_id;
    private String clientName;
    private String company_name;
    private String model_name;
    private int year_made;
    private int price;
    private String condition;

    public Car(int car_id, String clientName, String company_name, String model_name, int year_made, int price, String condition) {
        this.car_id = car_id;
        this.clientName = clientName;
        this.company_name = company_name;
        this.model_name = model_name;
        this.year_made = year_made;
        this.price = price;
        this.condition = condition;
    }

    public int getCar_id() {
        return car_id;
    }

    public String getClientName() {
        return clientName;
    }

    public String getCompany_name() {
        return company_name;
    }

    public String getModel_name() {
        return model_name;
    }

    public int getYear_made() {
        return year_made;
    }

    public int getPrice() {
        return price;
    }

    public String getCondition() {
        return condition;
    }
    
    
    
}
