package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    private static int counter = 1;
    private int lotteryNumber;
    private String userName;
    private int numberOfTickets = 0;
    private int userId;
    private List<Integer> ticketNumbers = new ArrayList<>();
    private User next;
    private int totalPrice;
    private List<Integer> remainingTickets = new ArrayList<>();


    public User() {
        remainingTickets();
    }

    public User(String userName, int numberOfTickets, List<Integer> ticketNumbers) {
        this.userName = userName;
        this.numberOfTickets = numberOfTickets;
        this.ticketNumbers = ticketNumbers;
        this.next = null;
        this.userId = userIdGenerator();
    }
    public User(int userId,String userName,int numberOfTickets, List<Integer> ticketNumbers) {
        this.userName = userName;
        this.numberOfTickets = numberOfTickets;
        this.userId = userId;
        this.ticketNumbers = ticketNumbers;
        this.next = null;
    }

    private static int userIdGenerator(){
        return counter++;
    }

    public int getLotteryNumber() {
        return lotteryNumber;
    }

    public void setLotteryNumber(int lotteryNumber) {
        this.lotteryNumber = lotteryNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<Integer> getTicketNumbers() {
        return ticketNumbers;
    }

    public void setTicketNumbers(List<Integer> ticketNumbers) {
        this.ticketNumbers = ticketNumbers;
    }

    public User getNext() {
        return next;
    }

    public void setNext(User next) {
        this.next = next;
    }

    public void remainingTickets(){
        for(int j = 0;j<20;j++){
            remainingTickets.add(j);
        }
    }
    public void welcomeUser(){

        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Welcome To Mega Lottery Draw !");

        System.out.println("What is your name ?");
        userName = scanner.nextLine();

        System.out.println("How many tickets do you want to buy ?");
        numberOfTickets = scanner.nextInt();

        System.out.println("Which number of tickets do you want to buy ?");
        System.out.println("Remaining tickets are -- " + remainingTickets);
        for(int i = 0; i<numberOfTickets;i++) {
            int tickets = scanner.nextInt();
            ticketNumbers.add(tickets);
            remainingTickets.remove(tickets);
        }

        totalPrice = numberOfTickets * 20;
    }
    public void userInfo(){
        System.out.println("User Id : " + userId  +
                "  ||  User Name : " + userName +
                "  ||  Number of Tickets : " + numberOfTickets +
                "  ||  Total price : " + totalPrice +
                "\nTicket Numbers : " + ticketNumbers);
    }
}
