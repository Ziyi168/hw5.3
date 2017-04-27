import javax.Swing;
import javax.swing.JOptionPane;
public class MyCarDriver {

	private static int count = 0;
	
	public static void main(String[] args) {
		
		
	
	MyCar ZiyiCar = new MyCar("white",280,"3.0L");
	count++;
	
    System.out.println(ZiyiCar);
    
    MyCar hisCar = new MyCar ("black",400,"3.5L");
    count++;
    System.out.println(hisCar);
    
    MyCar herCar = new MyCar("pink", 300,"2.5L");
    count++;
    System.out.println(herCar);
    
    
    MyCar newCar = new MyCar("white",280,"3.0L");
	count++;
    
    
    
    if(ZiyiCar.equal(newCar)){
    	
    	
    	JOptionPane.showMessageDialog(null, "These cars are the same.");
    	
    	
    }else{
    	
    	JOptionPane.showMessageDialog(null, "These cars are different.");;
    }
    

    
    
	}
	
	
	public static int getCount(){
		
		return count;
		
	}
	

}
