
public class Animal {
	
	
	private String name;
	private int birthYear;
	private double weight;
	private char gender;
	

	public Animal() {
		
        this.name = "";
        this.birthYear = 1900;
        this.weight = 0.0;
        this.gender = 'u';
	}
	
    public Animal(String name, int birthYear, double weight, char gender) {
    	
        this.name = name;
        this.birthYear = birthYear;
        
        if (weight < 0) {
            this.weight = -1.0;
        }
        else {
            this.weight = weight;
        }

        if (gender == 'f' || gender == 'm') {
            this.gender = gender;
        } else {
            this.gender = 'u';
        }

        
    }

    
	
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public int  getBirthYear() {
		return this.birthYear;
	}
	
	public void setBirthYear(int birthyear) {
		this.birthYear = birthyear;
	}
	
	public double getWeight() {
		return this.weight;
		
	}
	
	public void setWeight(double weight) {
	    if (weight < 0) {
	        this.weight = -1.0;
	    } else {
	        this.weight = weight;
	    }
	}

	
	public char getGender() {
		return this.gender;
	}
	
	public void setGender(char gender) {
		
		
		if (gender == 'm' || gender == 'f') {
			this.gender = gender; 
			} else {
			this.gender = 'u';
		}
	}
	
	public int calculateAge(int year) {
		
		if (year < birthYear) {
			return -1;
		}
		else {
			return year - birthYear ;
		}
		
	}
	
	public boolean isMale() {
		
	    return Character.toLowerCase(gender) == 'm'; 

	}

	
	public boolean isFemale() {
		
		return Character.toLowerCase(gender) == 'f';  
	}
	
	
	
	public void printDetails() {
		
		System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c\n", name, birthYear, weight, gender);
	}
	
	
	public void gainWeight() {
		this.weight += 1;
	}
	
	
	public void gainWeight(double w) {
		
	    if (w > 0) {
	    	
	        double newWeight = this.weight + w;
	        if (newWeight >= 0) {
	            this.weight = newWeight;
	        } else {
	            this.weight = weight;
	        }
	    }
	}


	public void loseWeight(double w) {
		
	    if (w > 0 && this.weight - w > 0) {
	    	
	        this.weight -= w;
	    }
	}

	
	public void loseWeight() {
		
		this.weight = weight -1;
		
		if (weight < 0) {
			
			this.weight = 0;
		}
	}
	
	
	
	

}
