import java.util.Scanner;
import java.util.ArrayList;

class Ticket {
    String movieName;
    double price;
    String seat;
    String customerName;
    int customerAge;
    String status;
    int ticketId;

    Ticket(String movieName, double price, String seat, String customerName, int customerAge, String status, int ticketId) {
        this.movieName = movieName;
        this.price = price;
        this.seat = seat;
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.status = status;
        this.ticketId = ticketId;
    }
}

class TicketSystem {
    
    private ArrayList<String> movieNames = new ArrayList<>();
    private ArrayList<Double> moviePrices = new ArrayList<>();
    private ArrayList<Ticket> tickets = new ArrayList<>();

    void addMovie(String name, double price) {
        movieNames.add(name);
        moviePrices.add(price);
    }

    void showMovies() {
        
        if(movieNames.size() == 0) {
            
            System.out.println("No movies found! Please add a movie first.");
            
            return;
        }
        
        for(int i = 0; i < movieNames.size(); i++) {
            
            System.out.println(i + ". " + movieNames.get(i) + " | Price: " + moviePrices.get(i) + " TL");
        }
    }

    void bookTicket(int movieIndex, String seat, String customerName, int customerAge, String status) {
        
        if(movieIndex < 0 || movieIndex >= movieNames.size()) {
            
            System.out.println("Invalid movie index!");
            
            return;
        }
        
        int ticketId = (int)(Math.random()*10000)+1;
        
        Ticket ticket = new Ticket(
                
                movieNames.get(movieIndex),
                moviePrices.get(movieIndex),
                seat,
                customerName,
                customerAge,
                status,
                ticketId
        
        );
        
        tickets.add(ticket);
        System.out.println("Ticket booked successfully! Ticket ID: #" + ticketId);
    }

    void showTickets() {
       
        if(tickets.size() == 0) {
           
            System.out.println("No tickets booked yet!");
            
            return;
        }
       
        for(Ticket t : tickets) {
        
            System.out.println("Ticket #" + t.ticketId + ": Movie: " + t.movieName + " | Seat: " + t.seat +
                    " | Customer: " + t.customerName + " | Age: " + t.customerAge + " | Status: " + t.status +
                    " | Price: " + calculatePrice(t.price, t.status) + " TL");
        }
    }

    void removeMovie(int movieIndex) {
        
        if(movieIndex < 0 || movieIndex >= movieNames.size()) {
           
            System.out.println("Invalid movie index!");
           
            return;
        }
       
        movieNames.remove(movieIndex);
        moviePrices.remove(movieIndex);
        System.out.println("Movie removed successfully!");
    }

    private double calculatePrice(double basePrice, String status) {
        
        double total = basePrice;
        
        if(status.equalsIgnoreCase("Student")) 
        
        total *= 0.85;
        
        else if(status.equalsIgnoreCase("Retired")) 
        
        total *= 0.90;
        
        return total;
    }
}


public class Main {
   
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
       
        TicketSystem ts = new TicketSystem();

        System.out.println("Welcome to Mini Movie Ticket System!");

        while(true) {
            
            System.out.println("\n1. Add Movie");
            System.out.println("2. Show Movies");
            System.out.println("3. Book Ticket");
            System.out.println("4. Show Booked Tickets");
            System.out.println("5. Remove Movie");
            System.out.println("0. Exit");
            System.out.print("Please make your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
               
                case 1:
                    
                    System.out.print("Enter Movie Title: ");
                    String name = scanner.nextLine();
                    
                    System.out.print("Enter Movie Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    
                    ts.addMovie(name, price);
                    
                    System.out.println("Movie added successfully!");
                    break;

                case 2:
                    
                    System.out.println("Movies List:");
                    ts.showMovies();
                    break;

                case 3:
                   
                    ts.showMovies();
                    
                    System.out.print("Enter the index of the movie to book: ");
                    
                    int idx = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Enter Seat: ");
                    String seat = scanner.nextLine();
                    
                    System.out.print("Enter Customer Name: ");
                    String custName = scanner.nextLine();
                    
                    System.out.print("Enter Customer Age: ");
                    int custAge = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Enter Status (Normal/Student/Retired): ");
                    String status = scanner.nextLine();
                    
                    ts.bookTicket(idx, seat, custName, custAge, status);
                    break;

                case 4:
                    
                    ts.showTickets();
                    break;

                case 5:
                    
                    ts.showMovies();
                    
                    System.out.print("Enter index of movie to remove: ");
                    int rmv = scanner.nextInt();
                    scanner.nextLine();
                    
                    ts.removeMovie(rmv);
                    break;

                case 0:
                    
                    System.out.println("Exiting system... Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        }
    }
}
