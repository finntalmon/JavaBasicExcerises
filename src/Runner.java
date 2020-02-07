public class Runner {

    public static void main(String[] args) {
        Car toyota = new Car(2006, "toyota", 100000, "Prius");

        toyota.setYear(2006);
        System.out.println(toyota.getYear());

        toyota.setMake("toyota");
        System.out.println(toyota.getMake());

        toyota.drive(100000);
        System.out.println(toyota.getMiles());

        toyota.setModel("Prius");
        System.out.println(toyota.getModel());

        System.out.println(toyota.toString());

        Rectangle myRect = new Rectangle(4, 6);
        System.out.println(myRect.getArea());
        System.out.println(myRect.getDiagonal());
        System.out.println(myRect.isSquare());
        System.out.println(myRect.toString());
    }

}
