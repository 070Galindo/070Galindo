package AppCode;

public class App {
    public void start() {
        Rectangle rect = new Rectangle(10, 10);
        
        int area = rect.getArea();        
        String msg = "The area for the rectangle is " + area;
        
        System.out.println(msg);
    }
}
