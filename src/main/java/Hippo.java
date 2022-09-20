public class Hippo implements Animal{

    public Hippo(String food) {
        super(food);
    }

    @Override
    public void printFood() {
        System.out.println("Hippo eats " + this.getFood());
    }

}
