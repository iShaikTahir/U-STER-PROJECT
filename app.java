public class UsterLogic {
    public static void main(String[] args) {
        string city ="Hyderabad"; // or "Riyadh"
        boolean emergencyActive = true;
         
        if (emergencyActive){
            System.out.println("U-STER ALERT:Clearing traffic in "+city);
            System.out.println("Signal Status: ALL GREEN FOR AMBULANCE");
        }   else { 
            System.out.println("Status: Normal Traffic Flow.");

        }
    }
}