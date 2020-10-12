package solent.ac.uk.ood.examples.week10.model;

public class Motorbike extends Vehicle {
// Creates a class called "Motorbike" which inherits from the "vehicle" class

    @Override
    public Double calculateFee() {
    //Creates a methd called "calculateFee(), that doe the following code.
        return 3.00;
        //Returns 3.00 when method called.
        //This is all thats required for the mototrbike code as all motorbikes have a fee of 3.00 regardless of the weight of it. 
    }
}
