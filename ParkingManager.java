import java.util.*;
import java.time.Duration;
public class ParkingManager {
	ArrayList<Vehicle> v = new ArrayList<>();
	public void addVehicle(Vehicle veh)
	{
		for(Vehicle vnew:v)
		{
			if(vnew.equals(veh))//check based on slot entered if slot already full or not
			{
				System.out.println("Vehicle Already Exists");
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
		for(Vehicle vdis:v) 
		{
			System.out.println(vdis);
		}
	}

	public double calculateFee(String rto) throws vehicleNotFoundException
	{
		
		for(Vehicle vnew:v)
		{
			 if(vnew.getRto().equalsIgnoreCase(rto))
	            {
	                long hours = Duration.between(
	                        vnew.getEntrytime(),
	                        vnew.getExittime()
	                ).toHours();		
				if(hours <= 0)
			        return 0;

			    if(vnew.getVtype().equalsIgnoreCase("two-wheeler"))
			        return hours * 20;

			    if(vnew.getVtype().equalsIgnoreCase("four-wheeler"))
			        return hours * 40;
			}
		}
	
        throw new vehicleNotFoundException();
	}
	public int searchVehicle(String rto)throws vehicleNotFoundException
	{
		for(Vehicle vnew:v)
		{
			 if(vnew.getRto().equalsIgnoreCase(rto))
			 {
				 return vnew.slot;
			 }
		}
		throw new vehicleNotFoundException();
	}
}

