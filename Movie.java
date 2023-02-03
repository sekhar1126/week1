package Testing;



public class Movie {
	private int movieId ;
	private int noOfseats;
	private double costOfTicket;
	
	

	public Movie(int movieId, int noOfseats, double costOfTicket) {
		this.movieId = movieId;
		this.noOfseats = noOfseats;
		this.costOfTicket = costOfTicket;
	}
	
	/*public int getMovieId() 
	{
		return movieId;
	}
	public void setMovieId(int movieId)
	{
		this.movieId = movieId;
	}




	public int getNoOfseats() {
		return noOfseats;
	}
	public void setNoOfseats(int noOfseats) {
		this.noOfseats = noOfseats;
	}
	*/
	public double getcostOfTickets(int movieId, int noOfseats) {
		if(movieId==111) {
			costOfTicket = 7*noOfseats;
			
		}else if(movieId==112) {
			costOfTicket = 8*noOfseats;
		}
		else if(movieId==113){
			costOfTicket = 8.5*noOfseats;
			
		}else {
			
			System.out.println("Enter a valid movie id!!!");
		}
		return costOfTicket;
	}


	public static void main(String[] args)
	{
	{
		Movie e1 =new Movie(0, 0, 0);
		System.out.println(e1.getcostOfTickets(112, 3));
	}
	}
	}
	
		
	


