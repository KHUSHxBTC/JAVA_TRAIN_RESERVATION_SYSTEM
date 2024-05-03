package com.PROJECT;


import java.util.HashMap;
import java.util.Scanner;

class Book {
    private String arrival;
    private String departure;
    private int wanted_seats;
    private int train_choice;
    private int confirm;
    private int booking_id = 1098;
    private int r = 57, a = 89, g = 102, v = 157, t = 79;
    HashMap<Integer,String> booking=new HashMap<Integer,String>();
    int booking_count=0;
    Scanner scanner = new Scanner(System.in);

    void book_ticket() {
        System.out.println("ENTER DEPARTURE CITY: ");
        departure = scanner.nextLine(); 
        System.out.println("ENTER ARRIVAL CITY: ");
        arrival = scanner.nextLine(); 
        if (departure.equals("Ahmedabad") && arrival.equals("Delhi")) {
            System.out.println("---------------AVAILABLE TRAINS---------------");
            System.out.println("1. NDLS RAJDHANI EXPRESS\nDEPART TIME - 7:05 PM\nARRIVAL TIME - 7:30 AM");
            System.out.print("AVAILABLE SEATS: " + r + "\n");
            System.out.print("FARE - Rs 1500\n\n\n");
            System.out.println("2. Ashram Express\nDEPART TIME - 7:45 PM\nARRIVAL TIME - 10:30 AM");
            System.out.print("AVAILABLE SEATS: " + a + "\n");
            System.out.print("FARE - Rs 1207\n\n\n");
            System.out.println("3. Dee Garibrath\nDEPART TIME - 7:05 PM\nARRIVAL TIME - 11:30 AM");
            System.out.print("AVAILABLE SEATS: " + g + "\n");
            System.out.print("FARE - Rs 910\n\n\n");
            System.out.println("PRESS 4 TO EXIT!!");
            System.out.println("ENTER YOUR CHOICE: ");
            train_choice = scanner.nextInt();
            scanner.nextLine();
            if (train_choice == 1) {
                System.out.println("NDLS RAJDHANI EXPRESS\nDEPART TIME - 7:05 PM\nARRIVAL TIME - 7:30 AM");
                System.out.print("AVAILABLE SEATS: " + r+"\n");
                System.out.print("FARE - Rs 1500\n");
                System.out.println("ENTER NUMBER OF TICKETS YOU WANT: ");
                wanted_seats = scanner.nextInt();
                if(r==0) {
                	System.out.println("NO SEATS AVAILABLE");
                }
                else if (wanted_seats > r) {
                    System.out.println("ONLY " + r + " SEATS ARE AVAILABLE !!");
                } else {
                    System.out.print("TOTAL FARE FOR ");
                    System.out.print(wanted_seats);
                    System.out.print(" IS  Rs ");
                    System.out.print(wanted_seats * 1500);
                    System.out.println("\nPRESS 1 TO CONFIRM BOOKING!!!");
                    System.out.println("PRESS 2 TO EXIT !! ");
                    confirm = scanner.nextInt();
                    scanner.nextLine();
                    switch (confirm) {
                        case 1:
                            System.out.println("YOUR TICKET IS CONFIRMED ON-> NDLS RAJDHANI EXPRESS\nDEPART TIME - 7:05 PM\nARRIVAL TIME - 7:30 AM");
                            System.out.println("TOTAL FARE-> Rs ");
                            System.out.println(wanted_seats * 1500);
                            System.out.println("BOOKING ID : ");
                            booking_id+=wanted_seats;
                            r = r - wanted_seats;
                            booking.put(booking_id,"r");
                            booking_count++;
                            System.out.println(booking_id);
                            System.out.println("\n\n\n");
                            break;
                        case 2:
                            System.out.println("EXITING\n\n\n");
                            break;

                    }

                }
            } else if (train_choice == 2) {
                a = 89;
                System.out.println("Ashram Express\nDEPART TIME - 7:45 PM\nARRIVAL TIME - 10:30 AM");
                System.out.print("AVAILABLE SEATS: " + a + "\n");
                System.out.print("FARE - Rs 1207\n");
                System.out.println("ENTER NUMBER OF TICKETS YOU WANT: ");
                wanted_seats = scanner.nextInt();
                scanner.nextLine();
                if(a==0) {
                	System.out.println("NO SEATS AVAILABLE");
                }
                else if (wanted_seats > a) {
                    System.out.println("ONLY " + a + " SEATS ARE AVAILABLE !!");
                } else {
                    System.out.print("TOTAL FARE FOR ");
                    System.out.print(wanted_seats);
                    System.out.print(" IS  Rs ");
                    System.out.print(wanted_seats * 1207);
                    System.out.println("\nPRESS 1 TO CONFIRM BOOKING!!!");
                    System.out.println("PRESS 2 TO EXIT !! ");
                    confirm = scanner.nextInt();
                    scanner.nextLine();
                    switch (confirm) {
                        case 1:
                            System.out.println("YOUR TICKET IS CONFIRMED ON-> Ashram Express\nDEPART TIME - 7:45 PM\nARRIVAL TIME - 10:30 AM");
                            System.out.println("TOTAL FARE-> Rs ");
                            System.out.println(wanted_seats * 1207);
                            System.out.println("BOOKING ID : ");
                            booking_id+=wanted_seats;
                            a=a-wanted_seats;
                            booking.put(booking_id,"a");
                            booking_count++;
                            System.out.println(booking_id);
                            System.out.println(" \n\n\n");
                            break;
                        case 2:
                            System.out.println("EXITING\n\n\n");
                            break;

                    }

                }
            } else if (train_choice == 3) {

                System.out.println("Dee Garibrath\nDEPART TIME - 7:05 PM\nARRIVAL TIME - 11:30 AM");
                System.out.print("AVAILABLE SEATS: " + g + "\n");
                System.out.print("FARE - Rs 910\n");
                System.out.println("ENTER NUMBER OF TICKETS YOU WANT: ");
                wanted_seats = scanner.nextInt();
                scanner.nextLine();
                if(g==0) {
                	System.out.println("NO SEATS AVAILABLE");
                }
                else if (wanted_seats > g) {
                    System.out.println("ONLY " + g + " SEATS ARE AVAILABLE !!");
                } else {
                    System.out.print("TOTAL FARE FOR ");
                    System.out.print(wanted_seats);
                    System.out.print(" IS  Rs ");
                    System.out.print(wanted_seats * 910);
                    System.out.println("\nPRESS 1 TO CONFIRM BOOKING!!!");
                    System.out.println("PRESS 2 TO EXIT !! ");
                    confirm = scanner.nextInt();
                    scanner.nextLine();
                    switch (confirm) {
                        case 1:
                            System.out.println("YOUR TICKET IS CONFIRMED ON-> Dee Garibrath\nDEPART TIME - 7:05 PM\nARRIVAL TIME - 11:30 AM");
                            System.out.println("TOTAL FARE-> Rs ");
                            System.out.println(wanted_seats * 910);
                            System.out.println("BOOKING ID : ");
                            booking_id+=wanted_seats;
                            g = g - wanted_seats;
                            booking.put(booking_id,"g");
                            booking_count++;
                            System.out.println(booking_id);
                            System.out.println(" \n\n\n");
                            break;
                        case 2:
                            System.out.println("EXITING\n\n\n");
                            break;

                    }

                }

            }
        } else if (departure.equals("Ahmedabad") && arrival.equals("Mumbai")) {
            System.out.println("---------------AVAILABLE TRAINS---------------");
            System.out.println("1. VANDE BHARAT EXPRESS \nDEPART TIME - 3:05 PM\nARRIVAL TIME - 8:30 PM");
            System.out.print("AVAILABLE SEATS: " + v + "\n");
            System.out.print("FARE - Rs 1400\n\n\n");
            System.out.println("2. TEJAS Express\nDEPART TIME - 6:40 AM\nARRIVAL TIME - 1:05PM ");
            System.out.print("AVAILABLE SEATS: " + t + "\n");
            System.out.print("FARE - Rs 1680\n\n\n");
            System.out.println("PRESS 3 TO EXIT!!");
            System.out.println("ENTER YOUR CHOICE: ");
            train_choice = scanner.nextInt();
            scanner.nextLine();
            	if (train_choice == 1) {
                System.out.println("VANDE BHARAT EXPRESS \nDEPART TIME - 3:05 PM\nARRIVAL TIME - 8:30 PM");
                System.out.print("AVAILABLE SEATS: " + v + "\n");
                System.out.print("FARE - Rs 1400\n");
                System.out.println("ENTER NUMBER OF TICKETS YOU WANT: ");
                wanted_seats = scanner.nextInt();
                if(v==0) {
                	System.out.println("NO SEATS AVAILABLE");
                }
                else if (wanted_seats > v) {
                    System.out.println("ONLY " + v + " SEATS ARE AVAILABLE !!");
                } else {
                    System.out.print("TOTAL FARE FOR ");
                    System.out.print(wanted_seats);
                    System.out.print(" IS  Rs ");
                    System.out.print(wanted_seats * 1400);
                    System.out.println("\nPRESS 1 TO CONFIRM BOOKING!!!");
                    System.out.println("PRESS 2 TO EXIT !! ");
                    confirm = scanner.nextInt();
                    scanner.nextLine();
                    switch (confirm) {
                        case 1:
                            System.out.println("YOUR TICKET IS CONFIRMED ON-> VANDE BHARAT EXPRESS \nDEPART TIME - 3:05 PM\nARRIVAL TIME - 8:30 PM");
                            System.out.println("TOTAL FARE-> Rs ");
                            System.out.println(wanted_seats * 1400);
                            System.out.println("BOOKING ID : ");
                            booking_id+=wanted_seats;
                            v = v - wanted_seats;
                            booking.put(booking_id,"v");
                            booking_count++;
                            System.out.println(booking_id);
                            System.out.println("\n\n\n");
                            break;
                        case 2:
                            System.out.println("EXITING\n\n\n");
                            break;

                    }

                }
            } else if (train_choice == 2) {

                System.out.println("TEJAS Express\nDEPART TIME - 6:40 AM\nARRIVAL TIME - 1:05PM ");
                System.out.print("AVAILABLE SEATS: " + t + "\n");
                System.out.print("FARE - Rs 1680\n");
                System.out.println("ENTER NUMBER OF TICKETS YOU WANT: ");
                wanted_seats = scanner.nextInt();
                if(t==0) {
                	System.out.println("NO SEATS AVAILABLE");
                }
                else if (wanted_seats > t) {
                    System.out.println("ONLY " + t + " SEATS ARE AVAILABLE !!");
                } else {
                    System.out.print("TOTAL FARE FOR ");
                    System.out.print(wanted_seats);
                    System.out.print(" IS  Rs ");
                    System.out.print(wanted_seats * 1680);
                    System.out.println("\nPRESS 1 TO CONFIRM BOOKING!!!");
                    System.out.println("PRESS 2 TO EXIT !! ");
                    confirm = scanner.nextInt();
                    scanner.nextLine();
                    switch (confirm) {
                        case 1:
                            System.out.println("YOUR TICKET IS CONFIRMED ON-> TEJAS Express\nDEPART TIME - 6:40 AM\nARRIVAL TIME - 1:05PM ");
                            System.out.println("TOTAL FARE-> Rs ");
                            System.out.println(wanted_seats * 1680);
                            System.out.println("BOOKING ID : ");
                            booking_id+=wanted_seats;
                            t = t - wanted_seats;
                            booking.put(booking_id,"t");
                            booking_count++;
                            System.out.println(booking_id);
                            System.out.println(" \n\n\n");
                            break;
                        case 2:
                            System.out.println("EXITING\n\n\n");
                            break;

                    }

                }
            }
        }
    }

    void cancel_ticket() {
    	int previous=1098;
    	int cancel_count=0;
        System.out.println("Enter your booking ID to cancel the ticket:");
        int cancel_booking_id = scanner.nextInt();
        scanner.nextLine();
        for(HashMap.Entry<Integer,String> trainName : booking.entrySet()) {
        	if(trainName.getValue()=="r"&&cancel_booking_id==trainName.getKey()) {
        		System.out.println("Ticket cancellation successful for booking ID: " + cancel_booking_id);
        		cancel_count=trainName.getKey()-previous;
        		 r=r+cancel_count;
        		 previous=trainName.getKey();
        		 booking.remove(cancel_booking_id);
        		 System.out.println(cancel_count);
        	}else if(trainName.getValue()=="a"&&cancel_booking_id==trainName.getKey()) {
        		System.out.println("Ticket cancellation successful for booking ID: " + cancel_booking_id);
        		cancel_count=trainName.getKey()-previous;
        		a=a+cancel_count;
        		previous=trainName.getKey();
        		booking.remove(cancel_booking_id);
        	}
        	else if(trainName.getValue()=="g"&&cancel_booking_id==trainName.getKey()) {
        		System.out.println("Ticket cancellation successful for booking ID: " + cancel_booking_id);
        		cancel_count=trainName.getKey()-previous;
        		g=g+cancel_count;
        		previous=trainName.getKey();
        		booking.remove(cancel_booking_id);
        	}
        	else if(trainName.getValue()=="v"&&cancel_booking_id==trainName.getKey()) {
        		System.out.println("Ticket cancellation successful for booking ID: " + cancel_booking_id);
        		cancel_count=trainName.getKey()-previous;
        		v=v+cancel_count;
        		previous=trainName.getKey();
        		booking.remove(cancel_booking_id);
        	}
        	else if(trainName.getValue()=="t"&&cancel_booking_id==trainName.getKey()) {
        		System.out.println("Ticket cancellation successful for booking ID: " + cancel_booking_id);
        		cancel_count=trainName.getKey()-previous;
        		t=t+cancel_count;
        		previous=trainName.getKey();
        		booking.remove(cancel_booking_id);
        	}else {
        		previous=trainName.getKey();
        		System.out.println("Invalid booking ID. Ticket cancellation failed.");
        		
        	}
        }
    }
}

class user {
    private String username;
    private String password;
    private String susername;
    private String spassword;
    private boolean isLoggedIn = false;

    void login() {
        System.out.println("ENTER USERNAME: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        System.out.println("ENTER PASSWORD: ");
        String password = scanner.nextLine();

        if ((username.equals("ABC") && password.equals("ABC")) ||
                (username.equals(susername) && password.equals(spassword))) {
            System.out.println("Login successful!");
            isLoggedIn = true;
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    void signup() {
        System.out.println("Enter new username: ");
        Scanner scanner = new Scanner(System.in);
        susername = scanner.next();

        System.out.println("Enter new password: ");
        spassword = scanner.next();
        if(susername!=null && spassword != null)
        {        System.out.println("Signup successful!");
       	}
        else {
        	System.out.println("USERNAME OR PASSWORD CANNOT BE NULL!!");
        }
       
    }

    boolean isLoggedIn() {
        return isLoggedIn;
    }
}

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        user u = new user();
        Book b = new Book();
        int choice;

        if (!u.isLoggedIn()) {
            do {
                System.out.println("------------------------WELCOME TO RAILWAY RESERVATION SYSTEM!------------------------");
                System.out.println("KINDLY PRESS 1 FOR LOGIN ");
                System.out.println("KINDLY PRESS 2 FOR SIGNUP ");
                System.out.println("KINDLY PRESS 3 TO EXIT ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        u.login();
                        break;
                    case 2:
                        u.signup();
                        break;
                    case 3:
                        System.out.println("Thank you for using Railway Reservation System!");
                        return;
                    default:
                        System.out.println("Invalid choice\n\n\n");
                }
            } while (!u.isLoggedIn());
        }
        do {
        	System.out.println("------------------------WELCOME TO RAILWAY RESERVATION SYSTEM!------------------------");
            System.out.println("KINDLY PRESS 1 FOR BOOK TRAIN TICKETS");
            System.out.println("KINDLY PRESS 2 FOR CANCELING TRAIN TICKETS ");
            System.out.println("KINDLY PRESS 3 TO EXIT ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    b.book_ticket();
                    break;
                case 2:
                    b.cancel_ticket();
                    break;
                case 3:
                    System.out.println("Exiting Railway Reservation System");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        } while (true);
    }
}
