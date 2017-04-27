/*
 * Create a Car Class with color, horse power, engine size, and make as instance variable
Including getter and setter methods, toString, costructor with no parameter and with parameters (all local varibles that matching instance variables)
Create another class named CarDriver that instantiate three car objects from Car class and use the methods from car class as instructed below.
1. Create Car() for myCar, Car("Black",400,3.5,"Honda") for hisCar, and Car("Pink",300,2.5,"Volks") for herCar objects.
2. Use toString for each car object, when using toString you do not need to type .toString(). ie. System.out.println(carObj.toString()) is equivalent to  System.out.println(carObj).
3. Use setColor("Blue"), setHorsePower(650), setEngineSize(6.5), setMake("Ferrari") for each car object,
4. Use getColor(), getHorsePoser(), getEngineSize(), getMake() for each car object. ie. System.out.println(myCar.getColor() + " " + myCar.getHorsePower() + " " +  myCar.getEngineSize() + " " + myCar.getMake());
 */

public class MyCar {
	public String color;
	public int horsePower;
	String engineSize;
	
	// constructor
    public MyCar(){
       String color = "White";
       int horsePower = 281;
       String engineSize = "3.0L"; 
    }
    public MyCar(String color, int horsePower, String engineSize){
    	this.color = color;
    	this.horsePower = horsePower;
    	this.engineSize = engineSize;
    }
    public void showMyCar(){
    	String newColor = null;
    	int newHorsePower = 0;
    	this.color = newColor;
    	String newEngineSize = null;
    	this.horsePower = newHorsePower;
    	this.engineSize = newEngineSize; 
    }
    public String getNewColor(){
    	String newColor = this.color;
		return newColor;
    }
    public String getColor (){
    	return this.color;
    }
    public String getColor(String color){
    	return this.color;// "get" does not have to use this, but can.
    }
    public int horsePower(){
		return this.horsePower;
    }
    public String getEngineSzie(){
    	return this.engineSize;
    }
    
    public void setHorsePower (int horsePower){
    	this.horsePower = horsePower;
    }
    
    public int getHorsePower(){
    	return this.horsePower;
    }
    
    public String toString(){
    	return "[ Color: "+ color + " horse power: " + horsePower +" engine size: "+ engineSize +"]";
	 
    } 
    
    public boolean equal(MyCar otherCar){
    	
    	if(this.color.equals(otherCar.getColor())
    			&& this.horsePower == otherCar.getHorsePower()
    			&& this.engineSize.equals(otherCar.getEngineSzie())){
    		return true;
    	}else{
    		return false;
    	}

    	
    }
    
}