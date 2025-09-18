package abstractexamples;

public class Rectangle  extends Shape {
	
	    private int width;
	    private int height;

	    public Rectangle(int width, int height) {
	        this.width = width;
	        this.height = height;
	    }

	    void calArea() {
	        super.area = width * height;
	    }
	
}
