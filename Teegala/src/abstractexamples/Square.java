package abstractexamples;


public class Square extends Shape{
	    private int side;

	    public Square(int side) {
	        this.side = side;
	    }

	    @Override
	    void calArea() {
	      super.area = side * side;
	    }
	
}
