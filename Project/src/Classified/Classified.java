package Classified;

import People.Person;
import errors.EmptyFieldsError;

import java.util.Objects;

public class Classified {

    private Person seller;
    private String title;
    private String description;
    private double price;

    public Classified(Person Seller){
        setSeller(Seller);
    }

    public Classified(Person Seller, String title, String description, double price){
        this.seller = Seller;
        this.description = description;
        this.title = title;
        this.price = price;
    }

    private void setSeller(Person seller) {
        this.seller = seller;
    }

    public Boolean userIsSeller(Person visitor){
        return this.seller.equals(visitor);
    }

    public void updateClassified(String title, String description, Double price) throws EmptyFieldsError {
        if (!Objects.equals(title, "") && title != null){this.title =  title;}
        if (!Objects.equals(description, "") && description != null){this.description = description;}
        if ( price !=  null ) {this.price = price;}

        if(title == null || description == null || price == null){
            throw new EmptyFieldsError(title, description,price);
        }
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
