/**
 * javabean
 */
public class javabean {
    public static void main(String[] args) {
        A obj = new A();
        obj.setId(11037);
        int A = obj.getId();
        System.out.println();
    }
}

 class A implements java.io.Serializable {
    private int id;

    public A() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
