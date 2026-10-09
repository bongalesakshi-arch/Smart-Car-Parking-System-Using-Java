import java.lang.Exception;
public class vehicleNotFoundException extends Exception {
	String msg;
	public vehicleNotFoundException() {
		msg="Vehicle Not Found";
	}
	public vehicleNotFoundException(String msg)
	{
		this.msg=msg;
	}
	public String getmsg(String msg)
	{
		return msg;
	}
}
