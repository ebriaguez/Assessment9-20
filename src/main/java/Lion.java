public class Lion extends Feline {
    public Lion(String food) {
        super(food);
    }

    @Override
    public void printFood() {
        System.out.println("Lion eats " + this.getFood());
    }
}
