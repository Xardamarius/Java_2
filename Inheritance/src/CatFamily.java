public class CatFamily {
    private int ears;
    private int legs;
    private boolean bigClaws;

    public CatFamily(int ears, int legs, boolean bigClaws) {
        this.ears = ears;
        this.legs = legs;
        this.bigClaws = bigClaws;
    }

    public void showinfo() {
        System.out.println("Колличество Ушей: " + ears + "Колличество лап: " + legs + "Наличие больших когтей: " + bigClaws);
    }

    public void setBigClaws(boolean bigClaws) {this.bigClaws = bigClaws;}

    public void eat() {
        System.out.println("Кушаю ");
    }
}
