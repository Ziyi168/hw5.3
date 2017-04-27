public class Day {
	
	
	
    private String [] days = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
    private int day;


    public Day() {
        day=0;
    }

    /**
     *
     * @param day
     */
    public Day(int day) {
    	
    	if(day < 0){
    		day = ((day * -1) / 7 * 7 + 7 + day) % 7;
    	}else{
    		day = day % 7;
    	}
    	
        this.day=day;
    }

    /**
     * To get the current day
     * @return returns current day
     */
    public String getDay(){
        return days[day];
    }

    public void setDay(int day){
        this.day=day%7;
    }

    public String nextDay(){
        return days[(day+1)%7];
    }
    
    public String nextNDay(int n){
        return days[(day+n)%7];
    }
    
    
    public String previousDay(){
    	
    	if(this.day == 0){
    		return days[6];
    	}else{
    		return days[(day-1)%7];
    	}
    }
    

    public String toString() {
        return days[day];
    }
}