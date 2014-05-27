package example;

public class Triangle {
	double a,b,c;
	public Triangle(double a,double b,double c){
		
		this.a = a;
		this.b = b;
		this.c = c;
		}
    public boolean isValid(){
    if(a<=0||b<=0||c<=0){
	
	return false;
}
return true;
}
}