package com.hawaso.javacampus.models;

public class Version {
    private Long id;
    private String title;

    public Version(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Version() {
        super();
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }    
}
