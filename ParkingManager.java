import java.util.*;
import java.time.Duration;
public class ParkingManager {
	ArrayList<Vehicle> v = new ArrayList<>();
	Vehicle ve = new Vehicle();
	public void addVehicle(Vehicle veh)
	{
		for(Vehicle vnew:v)
		{
			if(vnew.equals(veh))
			{
				System.out.println("Already Full");
				return;
			}
		}
		v.add(veh);
		System.out.println("Vehicle Parked Successfully");
	}
	public void backOut(String rto) throws vehicleNotFoundException
	{

		for(int i = 0; i < v.size(); i++)
	    {
	        if(v.get(i).getRto().equalsIgnoreCase(rto))
	        {
	            v.remove(i);
	            System.out.println("Vehicle BackOut Successfully");
	            return;
	        }
	    }
		throw new vehicleNotFoundException();
	}
	public void display()
	{
		for(Vehicle vdis:v) {
			System.out.println(vdis);
		}
	}
	
	public double calculateFee(Vehicle ve)
	{
		long hours = Duration.between(ve.entrytime, ve.exittime).toHours();

	    if(hours <= 0)
	        return 0;

	    if(ve.getVtype().equalsIgnoreCase("two-wheeler"))
	        return hours * 20;

	    if(ve.getVtype().equalsIgnoreCase("four-wheeler"))
	        return hours * 40;

	    return 0;
	}
}
