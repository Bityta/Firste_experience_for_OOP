public class Cat extends Animal implements Pet{

    @Override
    public void vois(){
        System.out.println("Мяуууу...");
    }

    @Override
    public void call() {
        System.out.println("Неспеша идет на голос");
    }

    @Override
    public void eating() {
        System.out.println("Рвется со всех лам кушать");

    }


}
