package com.example.demo.SystemDesignPractice;
/*
create a system for managing a movie theater's ticket bookings →
The system should have the following features:
Store Movie Details → Every movie will have a name, genre, duration, and ticket price.
Book Tickets → Allow users to select a movie but not over booking.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Movie {
    private String name;
    private String genre;
    private int duration;
    private double price;
    private int ticket;

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean bookTicket(int ticketBook) {
        if (ticketBook <= ticket) {
            ticket -= ticketBook;
            return true;
        }
        return false;
    }

    public Movie(String name, String genre, double price, int duration, int ticket) {
        this.name = name;
        this.genre = genre;
        this.price = price;
        this.duration = duration;
        this.ticket = ticket;
    }
}

public class MovieManagement {
    List<Movie> movies = new ArrayList<>();

    public void addMovie(String name, String genre, double price, int duration, int ticket) {
        movies.add(new Movie(name, genre, price, duration, ticket));
    }

    public void displayMovie(String film) {
        for (Movie movie : movies) {
            if (Objects.equals(movie.getName(), film)) {
                System.out.println(movie.getName());
                System.out.println(movie.getGenre());
                System.out.println(movie.getDuration());
                System.out.println(movie.getPrice());
            }
        }
    }


    public void bookShow(String movieName, int ticket) {
        boolean checkMovieAvailability = false;
        for (Movie movie1 : movies) {
            if (Objects.equals(movie1.getName(), movieName)) {
                checkMovieAvailability = true;
                if (movie1.bookTicket(ticket)) {
                    System.out.println("Ticket Confimred " + movieName + " Ticket Price " + movie1.getPrice() + "Number of tickets book " + ticket);
                } else {
                    System.out.println("not available");
                }
            }
        }
        if (!checkMovieAvailability) {
            System.out.println("movie is not there");
        }
    }

    public static void main(String[] args) {
        MovieManagement movieManagement = new MovieManagement();
        movieManagement.addMovie("Aae Dil ha Muskil", "Rom-Com", 235, 300, 50);
        movieManagement.addMovie("Meri Pyari Bindu", "Drama", 150, 200, 30);

        movieManagement.bookShow("Aae Dil ha Muskil", 50);
        movieManagement.bookShow("Aae ", 50);
        movieManagement.displayMovie("Meri Pyari Bindu");
    }
}
