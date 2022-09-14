package Project;

class BookTheaterSeat {
	int totalSeats = 20;

	synchronized void bookSeat(int seats) {
		if (totalSeats >= seats) {
			System.out.println(seats + "seats book Successfully");
			totalSeats = totalSeats - seats;
			System.out.println("seats left " + totalSeats);
		}

		else {
			System.out.println("sorry seats cannot be booked");
			System.out.println("seats left: " + totalSeats);
		}
	}
}

public class MovieBookApp extends Thread

{
	static BookTheaterSeat b;
	int seats;

	public void run() {
		b.bookSeat(seats);
	}

	public static void main(String[] args)

	{
		b = new BookTheaterSeat();

		MovieBookApp deepak = new MovieBookApp();
		deepak.seats = 7;
		deepak.start();

		MovieBookApp amit = new MovieBookApp();
		amit.seats = 6;
		amit.start();

	}

}
