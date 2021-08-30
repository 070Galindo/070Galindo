package AppCode;

public class Rectangle {
    //#region - public properties
    private int height;
    public void setHeight(int height) { this.height = height; }
    public int getHeight() { return height; }

    private int width;
    public void setWidth(int width) { this.width = width; }
    public int getWidth() { return width; }
    //#endregion


    //#region - constructores
    public Rectangle(int height, int width) {
        setHeight(height);
        setWidth(width);
    }
    //#endregion


    //#region - public methods
    public int getArea() {
        return height * width;
    }
    //#endregion
}
