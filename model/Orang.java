package model;

public class Orang {
    protected String name;

    public Orang(String name) {
        this.name = name.trim();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name.trim(); }
}

