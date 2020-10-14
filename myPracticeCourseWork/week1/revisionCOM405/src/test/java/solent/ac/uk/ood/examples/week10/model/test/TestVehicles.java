/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solent.ac.uk.ood.examples.week10.model.test;

import java.util.HashSet;
import org.junit.Test;
import static org.junit.Assert.*;
import solent.ac.uk.ood.examples.week10.model.Car;
import solent.ac.uk.ood.examples.week10.model.Lorry;
import solent.ac.uk.ood.examples.week10.model.Motorbike;
import solent.ac.uk.ood.examples.week10.model.Vehicle;


public class TestVehicles {

    @Test
    public void bikeTest() {
       double bike_test = 1800.00;
       Vehicle bike = new Motorbike();
       bike.setWeight(bike_test);
       double fee = bike.calculateFee();
       System.out.println("bike weight=" + bike_test + " fee=" + fee);
       assertEquals(3.00, fee, 0);
    }

    @Test
    public void carTest1(){
        double car_test1 = 1590.00;
        Vehicle car = new Car();
        car.setWeight(car_test1);
        double fee = car.calculateFee();
        System.out.println("car weight=" + car_test1 + " fee=" + fee);
        assertEquals(5.00, fee, 0);
    }

    @Test
    public void carTest2(){
        double car_test2 = 1698.00;
        Vehicle car = new Car();
        car.setWeight(car_test2);
        double fee = car.calculateFee();
        System.out.println("car weight=" + car_test2 + " fee=" + fee);
        assertEquals(5.00, fee, 0);
    }
    
    @Test
    public void carTest3() {
        double car_test3 = 1890.00;
        Vehicle car = new Car();
        car.setWeight(car_test3);
        double fee = car.calculateFee();
        System.out.println("car weight=" + car_test3 + " fee=" + fee);
        assertEquals(5.20, fee, 0);
    }
    
    @Test
    public void lorryTest1() {
        double lorry_test1 = 1590;
        Vehicle lorry = new Lorry();
        lorry.setWeight(lorry_test1);
        double fee = lorry.calculateFee();
        System.out.println("lorry weight=" + lorry_test1 + " fee=" + fee);
        assertEquals(10.00, fee, 0);
    }
    
    @Test
    public void lorryTest2() {
        double lorry_test2 = 9005;
        Vehicle lorry = new Lorry();
        lorry.setWeight(lorry_test2);
        double fee = lorry.calculateFee();
        System.out.println("lorry weight=" + lorry_test2 + " fee=" + fee);
        assertEquals(15.00, fee, 0);
    }
}