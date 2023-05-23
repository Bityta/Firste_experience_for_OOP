public class Dog extends Predator implements Pet {

    @Override
    public void vois() {
        System.out.println("Гаф...!!");
    }

    @Override
    public void call() {
        System.out.println("Бежит на голос");
    }

    @Override
    public void eating() {
        System.out.println("Бежит есть");

    }
}
