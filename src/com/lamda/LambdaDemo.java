package com.lamda;
interface A{
    void show(int i);

}
/*
class XYZ implements A
{
    @Override
    public void show() {
        System.out.println("Hello");
    }
}
*/

public class LambdaDemo {
    public static void main(String[] args) {
        // A obj =new XYZ();
        //A obj =new A() {
           /* @Override
            public void show() {
                System.out.println("Hello");

            }
        };*/
        // obj.show();
        A obj;
        obj = (i) -> System.out.println("Hello"+i);
        obj.show(5);
    }
}






