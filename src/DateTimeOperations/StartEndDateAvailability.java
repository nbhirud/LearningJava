package DateTimeOperations;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class StartEndDateAvailability {
	
	private static ArrayList<VehicleBooking> bookings = new ArrayList<>();

	public static void main(String[] args) {
		VehicleBooking[] vb = new VehicleBooking[10];
		vb[0] = new VehicleBooking(1, new GregorianCalendar(2017,03,16), new GregorianCalendar(2017,03,16));
		vb[1] = new VehicleBooking(1, new GregorianCalendar(2017,03,20), new GregorianCalendar(2017,03,22));
		vb[2] = new VehicleBooking(1, new GregorianCalendar(2017,03,26), new GregorianCalendar(2017,03,27));
		vb[3] = new VehicleBooking(1, new GregorianCalendar(2017,04,20), new GregorianCalendar(2017,04,22));
		vb[4] = new VehicleBooking(2, new GregorianCalendar(2017,03,26), new GregorianCalendar(2017,03,27));
		vb[5] = new VehicleBooking(2, new GregorianCalendar(2017,03,21), new GregorianCalendar(2017,03,22));
		vb[6] = new VehicleBooking(2, new GregorianCalendar(2017,03,30), new GregorianCalendar(2017,04,02));
		
		for(VehicleBooking v : vb) {
			bookings.add(v);
		}
		
		for(VehicleBooking v : bookings) {
			System.out.println(v);
		}
		
		
	}

}
















/*
 
 1	1	2017,03,16	2017,03,16
2	1	2017,03,20	2017,03,22
3	1	2017,03,26	2017,03,27
4	1	2017,04,20	2017,04,22
5	2	2017,03,26	2017,03,27
6	2	2017,03,21	2017,03,22
7	2	2017,03,30	2017,04,02


*/
