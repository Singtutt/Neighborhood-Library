package com.pluralsight;

public class Book {

//    --Properties-To-Include-In-Class--
//    id: int
//    isbn: String
//    title: String
//    isCheckedOut: boolean
//    checkedOutTo: String
//          &&
//    --Methods-To-Include--
//    checkOut (name)
//    checkIn ()
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

//    --Getters-and-setters-for-properties--
    public int getId() {
    return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
//    When book is checked out:
//    -checkedOutTo variable set to name provided by user input.
//    -isCheckedOut variable set to true (Why?)
//    When book is checked in:
//    -checkOutTo variable set to "" (To remove name from registry?)
//    -isCheckedOut variable set to false (Why?)
    public void checkOut(String name) {
        if (!isCheckedOut) {
            isCheckedOut = true;
            checkedOutTo = name;
        }
    }

    public void checkIn() {
        if (isCheckedOut) {
            isCheckedOut = false;
            checkedOutTo = "";
        }
    }
}
