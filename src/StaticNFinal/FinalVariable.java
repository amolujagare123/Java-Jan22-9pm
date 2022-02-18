package StaticNFinal;

public class FinalVariable {

    final int speed = 150;

    void change()
    {
        speed = 200;
    }

    public static void main(String[] args) {

        FinalVariable ob = new FinalVariable();
        ob.change();
        System.out.println(ob.speed);
    }
}
