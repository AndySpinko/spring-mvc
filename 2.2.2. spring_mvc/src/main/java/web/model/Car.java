package web.model;

public class Car {

    private int id;
    private String model;
    private String body;

    public Car() {

    }

    public Car (int id, String model, String body) {
        this.id = id;
        this.model = model;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
