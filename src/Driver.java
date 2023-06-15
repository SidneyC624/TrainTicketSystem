
public class Driver {

	public static void main(String[] args) {
		double charge = TicketSystem.getCharge(Location.HAPPYTOWN, true, 2);
		System.out.println(charge);
		charge = TicketSystem.getCharge(Location.GLORIOUSLAKE, false, 4);
		System.out.println(charge);
		charge = TicketSystem.getCharge(Location.SUNNYCITY, true, 3);
		System.out.println(charge);

	}

}
