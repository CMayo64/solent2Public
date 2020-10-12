package solent.ac.uk.ood.examples.week10.model;

public class Lorry extends Vehicle {
//Creates a class called "Lorry" that inherits from the "Vehicle" class
    
    private double standard_weight = 8000;
    //Creates a variable called "standard_weight" and sets the value to 8000.
   
    @Override
    public Double calculateFee() {
        return(getWeight() < standard_weight) ? 10.00:15.00;
        //If the lorry wight it 8000 or less than the price is 10.00, else if its mmore than 8000 the price is 15.00
    }
}
