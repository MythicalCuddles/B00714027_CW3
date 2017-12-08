package Coursework.Objects;

import java.util.ArrayList;
import java.util.Date;

public class Book {
    /// Instance Variables
    // Main Variables
    private int id;
    private String title, author;
    // Loan Variables
    private boolean outOnLoan;
    private String loanHolder;
    private Date dateOfLoan;

    /// Class Variables
    private static int noOfBooks;
    public static ArrayList<Fiction> fictionArrayList = new ArrayList<>();
    public static ArrayList<NonFiction> nonFictionArrayList = new ArrayList<>();

    // Constructors
    public Book() { this(null, null); }
    public Book(String title, String author) { this(title, author, false, null, null); }
    public Book(String title, String author, boolean outOnLoan, String loanHolder, Date dateOfLoan) {
        this.id = this.getNoOfBooks();
        this.title = title;
        this.author = author;

        this.outOnLoan = outOnLoan;
        this.loanHolder = loanHolder;
        this.dateOfLoan = dateOfLoan;

        noOfBooks++;
    }

    // Instance Getters
    public int getId() { return this.id; }
    public String getTitle() { return this.title; }
    public String getAuthor() { return this.author; }
    public boolean isOutOnLoan() { return this.outOnLoan; }
    public String getLoanHolder() { return this.loanHolder; }
    public Date getDateOfLoan() { return this.dateOfLoan; }

    // Instance Setters
    //public void setId(int id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setOutOnLoan(boolean outOnLoan) { this.outOnLoan = outOnLoan; }
    public void setLoanHolder(String loanHolder) { this.loanHolder = loanHolder; }
    public void setDateOfLoan(Date dateOfLoan) { this.dateOfLoan = dateOfLoan; }

    // Class Getters
    public int getNoOfBooks() { return this.noOfBooks; }

    // Class Setters
    public void setNoOfBooks(int noOfBooks) { this.noOfBooks = noOfBooks; }
}