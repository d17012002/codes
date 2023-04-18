class longestdatatype {
public static void main(String args[]) {
    byte b = 64;
    char c = 'a';
    short s = 17024;
    int i =5444000;
    float f = 5.5343467f;
    double d = .123484628;
    double result = (f*b) + (i/c) - (d*s);
System.out.println((f*b) + "+" + (i/c) +"-" +(d*s));
System.out.println("result = "+ result);
}   
}
