package com.itwang.pojo;

public class OnceItemsViewWithBLOBs extends OnceItemsView {
    private String bookItems;

    private String catItems;

    public String getBookItems() {
        return bookItems;
    }

    public void setBookItems(String bookItems) {
        this.bookItems = bookItems == null ? null : bookItems.trim();
    }

    public String getCatItems() {
        return catItems;
    }

    public void setCatItems(String catItems) {
        this.catItems = catItems == null ? null : catItems.trim();
    }
}