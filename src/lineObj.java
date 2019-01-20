

import java.sql.Time;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karee
 */
public class lineObj {
    public String customer;
    public String route;
    public String departure_date;
    public String departure_time;
    public String A_c;
    public String rotation;

        public lineObj(String customer, String route, String departure_date, String departure_time, String A_c, String rotation) {
        this.customer = customer;
        this.route = route;
        this.departure_date = departure_date;
        this.departure_time = departure_time;
        this.A_c = A_c;
        this.rotation = rotation;
    }
    
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(String departure_date) {
        this.departure_date = departure_date;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public String getA_c() {
        return A_c;
    }

    public void setA_c(String A_c) {
        this.A_c = A_c;
    }

    public String getRotation() {
        return rotation;
    }

    public void setRotation(String rotation) {
        this.rotation = rotation;
    }
    @Override
    public String toString() {
        return "Line [customer=" + customer+ ", route=" + route+ ", departure_date=" +departure_date+ ", departure_time=" + departure_time+", A/C "+A_c+", rotation"+rotation +"]";
    }
   
   
}
