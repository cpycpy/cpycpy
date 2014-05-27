package example;

public class Triangle2 {
	double a,b,c,d;
	public Triangle2(double a,double b,double c,double d){
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		}
	public boolean isValid(){
	    if(a+b+c<=d||a+c+b<=d||b+a+c<=d||b+c+a<=d||c+a+b<=d||c+b+a<=d||
	    		b+c+d<=a||b+d+c<=a||c+b+d<=a||c+d+b<=a||d+c+b<=a||d+b+c<=a||
	    		a+c+d<=b||a+d+c<=b||c+a+d<=b||c+d+a<=b||d+a+c<=b||d+c+a<=b||
	    		a+b+d<=c||a+d+b<=c||b+a+d<=c||b+d+a<=c||d+a+b<=c||d+b+a<=c){
		
		return false;
	}
	    return true;
}
}
