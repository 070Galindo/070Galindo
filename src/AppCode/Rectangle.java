package AppCode;

public class Rectangle {
    //#region - public properties
    private int _height;
    public void setHeight(int height) { _height = height; }
    public int getHeight() { return _height; }

    private int _width;
    public void setWidth(int width) { _width = width; }
    public int getWidth() { return _width; }
    //#endregion


    //#region - constructores
    public Rectangle(int height, int width) {
        setHeight(height);
        setWidth(width);
    }
    //#endregion


    //#region - public methods
    public int getArea() {
        return _height * _width;
    }
    //#endregion
}
