
public class Farm {
	
	private String farmName;
	private Animal[] animals;
	private int numAnimals;
    
	
	public Farm() {
		
		this.animals = new Animal[10];
		this.farmName = "";
		this.numAnimals = 0;
		
	}
	public Farm(String farmName) {
		this.farmName = farmName;
		this.numAnimals = 0;
		this.animals = new Animal[10];
	}

    public Farm(int maxAnimals) {
    	
        if (maxAnimals < 0) {
        	
            this.animals = new Animal[0];
            this.numAnimals = 0;
        } 
        else {
        	
            this.animals = new Animal[maxAnimals];
            this.farmName = "";
    		this.numAnimals = 0;
            
        }
        
       
    }
    public Farm(String farmName, int maxAnimals) {
        
        this.farmName = farmName;
        this.animals = new Animal[maxAnimals];
        this.numAnimals = 0;
    
}
	
	

    public void setFarmName(String name) {
        farmName = name;
    }

    public String getFarmName() {
        return farmName;
    }

    public void addAnimal(Animal a) {
    	
        if (numAnimals == animals.length) {
        	
            Animal[] newAnimals = new Animal[animals.length + 20];
            
            for (int i = 0; i < animals.length; i++) {
                newAnimals[i] = animals[i];
            }
            
            animals = newAnimals;
        }
        
        animals[numAnimals++] = a;
    }


    public Animal getAnimal(int index) {
    	if (index <0 || index >= numAnimals) {
    		return null;
    	}
        return animals[index];
    }

    public int getNumAnimals() {
        return numAnimals;
    }

    public Animal getFirstAnimal() {
        if (numAnimals > 0) {
            return animals[0];
        } else {
            return null;
        }
    }


    public Animal getLastAnimal() {
        if (numAnimals > 0) {
            return animals[numAnimals - 1];
        } else {
            return null;
        }
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public Animal removeAnimal(int index) {
    	if ( index < 0 || index >= numAnimals) {
    		return null;
    	}
    	else {
    	animals[index] = null;
    	
        for (int i = index +1; i < numAnimals ; i++) {
        	
        	animals[i -1] = animals[i];
        	
        		
        }
        numAnimals--;
     }
    	return animals[index];
	 
    }


    public void removeAllAnimals() {
    	
    	for (int i = 0; i < animals.length ; i++) {
    		animals[i] = null;
    	
    	}
    	numAnimals = 0;
    	
    	
    	       
    	
        
        
    }
   

    public double getTotalWeightOfAllAnimals() {
        double totalWeight = 0;
        
        for (int i = 0; i < numAnimals; i++) {
            totalWeight += animals[i].getWeight();
        }
        return totalWeight;
    }

    public double getAverageWeightOfAllAnimals() {
        if (numAnimals > 0) {
            return getTotalWeightOfAllAnimals() / numAnimals;
        } else {
            return 0;
        }
    }


    public int getNumberOfAnimalsAboveWeight(double weight) {
        int count = 0;
        for (int i = 0; i < numAnimals; i++) {
            if (animals[i].getWeight() > weight) {
                count++;
            }
        }
        return count;
    }
    
    public int getNumberOfAnimalsBelowWeight(double weight) { 
        int count = 0;
        for (int i = 0; i < numAnimals; i++) {
            if (animals[i].getWeight() < weight) {
                count++;
            }
        }
        return count;
    }
    
    public void increaseWeightOfAllAnimals() {
        for (Animal animal : animals) {
            animal.gainWeight();
        }
    }

    public void increaseWeightOfAllAnimals(double weight) {
        for (Animal animal : animals) {
            animal.gainWeight(weight);
        }
    }
    
    
    public void printAllDetails() {
        System.out.printf("FarmName: %20s | Number of Animals: %4d | Farm Size: %4d\n", farmName, numAnimals, animals.length);
        for (int i = 0; i < numAnimals; i++) {
            animals[i].printDetails();
        }
    }


    
}
