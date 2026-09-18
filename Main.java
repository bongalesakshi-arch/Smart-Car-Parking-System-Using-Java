import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParkingManager pm = new ParkingManager();
        String rtonumber;
        int choice;

        do {

            System.out.println("\n===== SMART PARKING SYSTEM =====");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Back Out Vehicle");
            System.out.println("3. Display Vehicles");
            System.out.println("4.Fees");
            System.out.println("5.Search Your Vehicle");
            System.out.println("6.Exit");

            choice = sc.nextInt();

            switch (choice) {

            case 1:
               
            	Vehicle v = new Vehicle();
            	v.accept(sc);
            	pm.addVehicle(v);
                break;

            case 2:
                
            	System.out.println("Enter RTO Number");
            	rtonumber=sc.next();
            	try {
					pm.backOut(rtonumber);
				} catch (vehicleNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println(e.msg);
				}
                break;

            case 3:
                pm.display();
                break;

            case 4:
            	
            	System.out.println("Enter RTO Number");
            	rtonumber=sc.next();
            	try {
					System.out.println(pm.calculateFee(rtonumber));
				} catch (vehicleNotFoundException e) {
			
					System.out.println(e.msg);
				}
            	break;
            case 5:
            	
            	System.out.println("Enter RTO Number");
            	rtonumber=sc.next();
            	try {
					System.out.println("Your Vehicle Is Parked At Slot No:"+pm.searchVehicle(rtonumber));
				} catch (vehicleNotFoundException e) {
				
					System.out.println(e.msg);
				}
                break;
            case 6:
            	System.out.println("Thank You🙏...");
            	break;
            default:
                System.out.println("Invalid Choice");
            }

        } while (choice != 6);
    }
}