package solent.ac.uk.ood.examples.week10.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Bridge {
    
    private static final int max_vehicles = 20;
    private static final double max_weight = 30000;

    private Map<String,Vehicle> vehicles = new LinkedHashMap<String,Vehicle>();
    
    public Double calcTotalWeight() {
        double totalWeight = 0;
        for (Vehicle vehicle : vehicles.values()){
            totalWeight = totalWeight + vehicle.getWeight();
        }
        return totalWeight;
    }

    public boolean requestAddVechicle(Vehicle vehicle) {
        if (vehicles.size() >=max_vehicles  ) return false;
        double totalWeight = calcTotalWeight();
        if (totalWeight+vehicle.getWeight()>max_weight) return false;
        vehicles.put(vehicle.getRegistration(),vehicle);
        return true;
    }

    public boolean removeVehicle(String registration) {
        if(vehicles.remove(registration)!=null){
                return true;
        } else return false;
    }

    public int numberOfVehicles() {
        return vehicles.size();
    }

    public Double calcTotalCost() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
