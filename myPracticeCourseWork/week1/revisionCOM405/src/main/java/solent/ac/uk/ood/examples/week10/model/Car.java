package solent.ac.uk.ood.examples.week10.model;

public class Car extends Vehicle {
//Creates a class called "Car" which inherits from the "Vehicle" class.
    
    private double expected_weight = 1590; 
    // Creates a variable called "expected_weight) as a double and assigns it the value of 1590.
    private double excess_weight_charge = 0.10;
    //Creates a variable called "excess_weight_charge as a double and assigns it the value of 0.10.
    private double standard_charge = 5.00; 
    //Creates a variable called "standard_charge" as a double and assigns it the value of 5.00.
    
    
    @Override
    public Double calculateFee() {
       double charge = standard_charge;
       //Sets the value of the variable charge to the same as the variable "standard_charge". And sets "charge" as a double.
       if(getWeight() > expected_weight ){
       //If the value of weight (getWeight) is more than the value of "expected_weight" then do the following code.
           charge = charge + excess_weight_charge * Math.round(getWeight() - expected_weight);
       //Set "charge" to the values of "charge" plus the value of "excess_weight_charge", 
       // and multiply that by the values of (weight (getWeight) minus the value of "expected_weight) amd round the result.
       }
       return charge;
       //Return the value of "charge"
       
    }
}
