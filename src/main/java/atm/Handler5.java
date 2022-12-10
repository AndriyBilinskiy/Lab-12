package atm;

public class Handler5 extends Handler{
    @Override
    public void process(int price) {
        System.out.println(price / 50);
    }
}
