package solent.ac.uk.ood.examples.week10.model;

public abstract class Vehicle {

    private Double weight;
    //Creates a variable called "weight" and 
    // sets it as a double (for example, 30040.5).

    private String registration;
    //Creates a variable called registration and
    // set it as a string (for example, JY09DGO).
    
    public Double getWeight(){
        return weight;
    }
    // This returns the value of "weight".
    
    public void setWeight(Double weight){
        this.weight = weight;
    }
    // This sets the value of the variable "weight".
    
    public String getRegistration(){
        return registration;
    }
    // This returns the value of "registration".
    
    public void setRegistration(String registration){
        this.registration = registration;
    }
    // This sets the value of the variable "registration".
    
    public abstract Double calculateFee();
    // Creates a method called "caculateFee"
    // and sets the result as a double.
    
}
