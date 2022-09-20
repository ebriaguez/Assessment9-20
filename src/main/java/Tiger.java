//superclass

public class Tiger extends Feline {
    public Tiger(String food) {
        super(food);
    }

    @Override
    public void printFood() {
        System.out.println("Tiger eats " + this.getFood());
    }
}
