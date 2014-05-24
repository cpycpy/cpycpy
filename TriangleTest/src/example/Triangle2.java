package example;

public class Triangle2 {
	double a,b,c;
	public Triangle2(double a,double b,double c){
		
		this.a = a;
		this.b = b;
		this.c = c;
		}
	public boolean isValid(){
	    if(a+b<=c||b+c<=a||a+c<=b||b+a<=c||c+b<=a||c+a<=b){
		
		return false;
	}
	    return true;
}
}
