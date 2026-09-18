import java.util.*;
import java.time.LocalTime;
public class Vehicle {
	String vtype;
	String vname;
	String rto;
	LocalTime entrytime;
	LocalTime exittime;
	int slot;
	public Vehicle() {
		
	}
	public Vehicle(String vtype, String vname, String rto, LocalTime entrytime, LocalTime exittime, int slot) {
		super();
		this.vtype = vtype;
		this.vname = vname;
		this.rto = rto;
		this.entrytime = entrytime;
		this.exittime = exittime;
		this.slot = slot;
	}
	
	public String getVtype() {
		return vtype;
	}
	public void setVtype(String vtype) {
		this.vtype = vtype;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getRto() {
		return rto;
	}
	public void setRto(String rto) {
		this.rto = rto;
	}
	public  LocalTime getEntrytime() {
		return entrytime;
	}
	public void setEntrytime(LocalTime entrytime) {
		this.entrytime = entrytime;
	}
	public LocalTime getExittime() {
		return exittime;
	}
	public void setExittime(LocalTime exittime) {
		this.exittime = exittime;
	}
	public int getSlot() {
		return slot;
	}
	public void setSlot(int slot) {
		this.slot = slot;
	}
	void accept(Scanner sc)
	{
		System.out.println("Enter Vehicle Type(Two-Wheeler/Four-Wheeler)");
		vtype=sc.next();
		System.out.println("Enter Vehicle name");
		vname=sc.next();
		System.out.println("Enter RTO number");
		rto=sc.next();
		System.out.println("Enter Entry Hour");
		int h1 = sc.nextInt();
		entrytime = LocalTime.of(h1, 0);

		System.out.println("Enter Exit Hour");
		int h2 = sc.nextInt();
		exittime = LocalTime.of(h2, 0);
		System.out.println("Enter slot you want");
		slot=sc.nextInt();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(entrytime, exittime, rto, slot, vname, vtype);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return slot == other.slot;
	}
	@Override
	public String toString() {
		return "vehicle [vtype=" + vtype + ", vname=" + vname + ", rto=" + rto + ", entrytime=" + entrytime
				+ ", exittime=" + exittime + ", slot=" + slot + "]";
	}
}
