package ch.csbe.productmanager;

public class Owner {
    private Long id;
    private String name;

    // Standard-Konstruktor
    public Owner() {
    }

    // Konstruktor mit Parametern
    public Owner(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter und Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

