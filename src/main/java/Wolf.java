public class Wolf extends Canine{
    public Wolf(String food) {
        super(food);
    }

    @Override
    public void printFood() {
        System.out.println("wolf eats " + this.getFood());
    }
}
