package _07_OOP_Sample;

public class main {


    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        rec.length=5;
        rec.width=5;

        rec.perimeter();
        System.out.println("perimeter =" + rec.perimeter());

        rec.calAreaOfRectangle();
        System.out.println("Area= "+ rec.calAreaOfRectangle());
        System.out.println("************************************************************************************");
        System.out.println("------------------------------------------------------------------------------------");


        Bird eagle = new Bird();
        eagle.type = "Big Eagle";
        eagle.age = 15;
        eagle.color ="grey";
        eagle.listOfNeeds = new String[3];
        eagle.listOfNeeds[0]="water";
        eagle.listOfNeeds[1]="meat";
        eagle.listOfNeeds[2]="cage";

        eagle.owner = new Owner();

        eagle.owner.gender="Male";
        eagle.owner.name="kenan";
        eagle.owner.age=29;
        eagle.printProperties();
        eagle.owner.printOwnerInfo();


        System.out.println("************************************************************************************");
        System.out.println("------------------------------------------------------------------------------------");

        Fish nemo = new Fish();
        nemo.age= 5;
        nemo.color="yellow";
        nemo.type="hamsi";
        nemo.listOfNeeds = new String[2];
        nemo.listOfNeeds[0]="water";
        nemo.listOfNeeds[1]="yem";


        nemo.owner = new Owner();
        nemo.owner.age=27;
        nemo.owner.name="Tuğçe";
        nemo.owner.gender="female";

        nemo.printProperties();
        nemo.owner.printOwnerInfo();



        System.out.println("************************************************************************************");
        System.out.println("------------------------------------------------------------------------------------");


        Circle circle = new Circle();

        circle.radius = 5;
        System.out.println("area: " + circle.circleOfArea());
        System.out.println("perimeter: "+ circle.circleOfPerimeter());








    }

}
