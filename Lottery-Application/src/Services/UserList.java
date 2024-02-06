package Services;

import Models.User;


import java.util.List;
import java.util.Scanner;

public class UserList extends User{

    User head;

    public UserList(){
        this.head = null;
    }

    public void addNewUser(String userName, int numberOfTickets, List<Integer> ticketNumbers){
        User newUser = new User(userName,numberOfTickets,ticketNumbers);
        if(head == null){
            head = newUser;
        }
        else{
            User current = head;

            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newUser);
        }

    }
    public void addOldUser(String userName, int numberOfTickets, List<Integer> ticketNumbers){
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("What is your user Id ?");
        int userId = scanner.nextInt();

        User newUser = new User(userId, userName, numberOfTickets, ticketNumbers);
        if(head == null){
            head = newUser;
        }
        else{
            User current = head;

            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newUser);
        }

    }
    public void addUser(){
        welcomeUser();
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Are you a new user ? Yes/No");
        String userAns = scanner.nextLine().toUpperCase();
        switch (userAns){
            case "YES":
                addNewUser(getUserName(),getNumberOfTickets(),getTicketNumbers());
                userInfo();
                return;
            case "NO":
                addOldUser(getUserName(),getNumberOfTickets(),getTicketNumbers());
                userInfo();
                return;
            default:
                System.out.println("Enter valid answer, Yes/No");
        }
    }

    public void drawLottery(){
    }


}
