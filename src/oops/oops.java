package oops;

public class oops  implements A,B {

    public static void main(String[] args) {
        oops o = new oops();
        o.show();
    }


    @Override
    public void show() {
        A.super.show();
    }
}
