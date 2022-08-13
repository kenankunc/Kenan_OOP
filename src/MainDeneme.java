public class MainDeneme {
    public static void main(String[] args) throws Exception {

        deneme1 deneme1 =new deneme1("tugce",20);

        deneme2 deneme2 = new deneme2("kenan",25);
        deneme2.read();
        deneme2.printfunciton();
        System.out.println(deneme2.getAge());
        System.out.println(deneme2.getName());
        deneme2.printfuction("overload yaptık abi");


        System.out.println(deneme1.getAge());
        System.out.println(deneme1.getName());
        deneme1.setName("kenan");










    }
}
