package com.thegiantgames.model;

public class wallpaper {

    String url, category;

    public wallpaper(String url, String category) {
        this.url = url;
        this.category = category;
    }

    public String getUrl() {
        return url;
    }

    public String getCategory() {
        return category;
    }
}
