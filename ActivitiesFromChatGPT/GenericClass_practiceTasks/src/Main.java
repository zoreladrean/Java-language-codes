public class Main {
    public static void main(String[] args) throws Exception {
        Box <Boolean> box1 = new Box<>();
        box1.setValue(true);
        System.out.println(box1.getValue());

        System.out.println();

        Box <Double> box2 = new Box<>();
        box2.setValue(3.14);
        System.out.println(box2.getValue());

        System.out.println();

        Box <String> box3 = new Box<>();
        box3.setValue("Hello World!");
        System.out.println("The box contains: " +box3.getValue());
    }
}
