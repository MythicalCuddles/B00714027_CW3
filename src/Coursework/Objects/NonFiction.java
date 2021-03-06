package Coursework.Objects;

import Coursework.Enums.TypeOfNonFiction;
import Coursework.Extensions.BooleanWorker;

import java.io.Serializable;
import java.time.LocalDate;

/*****************************************************
 Project Name:      B00714027 CW3
 File Name:         NonFiction
 Created by: 		Melissa Brennan
 Student No:        B00714027
 Comments:          Subclass of Superclass Book
 ******************************************************/

public class NonFiction extends Book implements Serializable {
    // Instance Variables
    private TypeOfNonFiction genre;

    // Constructors
    public NonFiction() { this(null, null, null); }
    public NonFiction(String title, String author, TypeOfNonFiction genre) { this(title, author, genre, false, null, null); }
    public NonFiction(String title, String author, TypeOfNonFiction genre, boolean outOnLoan, String loanHolder, LocalDate dateOfLoan) {
        super(title, author, outOnLoan, loanHolder, dateOfLoan);

        this.genre = genre;
    }

    // Instance Getters
    public TypeOfNonFiction getGenre() { return this.genre; }

    // Instance Setters
    public void setGenre(TypeOfNonFiction genre) { this.genre = genre; }

    // Override Methods
    @Override
    public String toString() {
        return "[NON-FICTION]\nBook ID: " + super.getId() + "\nBook Title: " + super.getTitle() + "\nBook Author: " + super.getAuthor()  +
                "\nOn Loan? " + BooleanWorker.toYesNo(super.isOutOnLoan()) + "\nLoan Holder: " + super.getLoanHolder() + "\nDate of Loan: " + super.getDateOfLoan() +
                "\nBook Genre: " + genre.toString();
    }
}
