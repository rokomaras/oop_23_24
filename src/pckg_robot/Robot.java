package pckg_robot;

public class Robot {
    private int id;
    private String descripiton;
    private static int cntID = 100;
    public Robot(String descripiton){
        this.id = cntID++;
        this.descripiton = descripiton;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Robot[" +
                "id=" + id +
                ", descripiton='" + descripiton + '\'' +
                ']';
    }
}
