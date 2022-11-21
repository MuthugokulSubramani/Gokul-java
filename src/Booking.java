import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    String passengername;
    int busno;
    Date date;

    Booking(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name of Passenger: ");
        passengername = scanner.next();
        System.out.println("Enter Bus No:");
        busno = scanner.nextInt();
        System.out.println("Enter Date dd-mm-yyyy");
        String dateinput = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateinput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
   public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses){
        int capacity = 0;
        for (Bus bus:buses){
            if (bus.getBusno() == busno)
                capacity = bus.getCapacity();
        }
        int booked = 0;
        for (Booking b:bookings){
            if (b.busno == busno && b.date.equals(date)){
                booked++;
            }
        }
        return booked<capacity?true:false;

   }
}
