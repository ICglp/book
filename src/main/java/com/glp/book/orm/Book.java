package com.glp.book.orm;

public class Book {
    private int Bid;
    private String BTile;
    private String BAuthor;
    private Double BPrice;
    private int BCategoryID;
    private String BPublisher;
    private Long BPhoto;

    public int getBid() {
        return Bid;
    }

    public void setBid(int bid) {
        Bid = bid;
    }

    public String getBTile() {
        return BTile;
    }

    public void setBTile(String BTile) {
        this.BTile = BTile;
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

    public Long getBPhoto() {
        return BPhoto;
    }

    public void setBPhoto(Long BPhoto) {
        this.BPhoto = BPhoto;
    }

    public Book() {
    }

    public Book(int bid, String BTile, String BAuthor, Double BPrice, int BCategoryID, String BPublisher, Long BPhoto) {
        Bid = bid;
        this.BTile = BTile;
        this.BAuthor = BAuthor;
        this.BPrice = BPrice;
        this.BCategoryID = BCategoryID;
        this.BPublisher = BPublisher;
        this.BPhoto = BPhoto;
    }
}
