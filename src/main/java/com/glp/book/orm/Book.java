package com.glp.book.orm;

import org.springframework.stereotype.Component;

@Component
public class Book {
    private int Bid;
    private String BTitle;
    private String BAuthor;
    private Double BPrice;
    private int BCategoryID;
    private String BPublisher;
    private String BPhoto;

    private CateGoty cateGoty;

    public CateGoty getCateGoty() {
        return cateGoty;
    }

    public void setCateGoty(CateGoty cateGoty) {
        this.cateGoty = cateGoty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Bid=" + Bid +
                ", BTitle='" + BTitle + '\'' +
                ", BAuthor='" + BAuthor + '\'' +
                ", BPrice=" + BPrice +
                ", BCategoryID=" + BCategoryID +
                ", BPublisher='" + BPublisher + '\'' +
                ", BPhoto='" + BPhoto + '\'' +
                '}';
    }

    public Book() {
    }

    public Book(int bid, String BTitle, String BAuthor, Double BPrice, int BCategoryID, String BPublisher, String BPhoto) {
        Bid = bid;
        this.BTitle = BTitle;
        this.BAuthor = BAuthor;
        this.BPrice = BPrice;
        this.BCategoryID = BCategoryID;
        this.BPublisher = BPublisher;
        this.BPhoto = BPhoto;
    }

    public int getBid() {
        return Bid;
    }

    public void setBid(int bid) {
        Bid = bid;
    }

    public String getBTitle() {
        return BTitle;
    }

    public void setBTitle(String BTitle) {
        this.BTitle = BTitle;
    }

    public String getBAuthor() {
        return BAuthor;
    }

    public void setBAuthor(String BAuthor) {
        this.BAuthor = BAuthor;
    }

    public Double getBPrice() {
        return BPrice;
    }

    public void setBPrice(Double BPrice) {
        this.BPrice = BPrice;
    }

    public int getBCategoryID() {
        return BCategoryID;
    }

    public void setBCategoryID(int BCategoryID) {
        this.BCategoryID = BCategoryID;
    }

    public String getBPublisher() {
        return BPublisher;
    }

    public void setBPublisher(String BPublisher) {
        this.BPublisher = BPublisher;
    }

    public String getBPhoto() {
        return BPhoto;
    }

    public void setBPhoto(String BPhoto) {
        this.BPhoto = BPhoto;
    }
}
