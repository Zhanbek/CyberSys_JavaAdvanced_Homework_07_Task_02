import java.io.Serializable;

public class Animal implements Serializable {
    protected Long id;
    public  String name;
    private String color;

    public Animal(String color, Long id, String name) {
        this.color = color;
        this.id = id;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

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

    @Override
    public String toString() {
        return "Animal {" +
                "color='" + color + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
