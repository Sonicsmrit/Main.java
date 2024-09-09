package models;

public class Genra {
    String name;
    String description;

    public Genra(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;

    }

    public String getDescription() {
        return description;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

