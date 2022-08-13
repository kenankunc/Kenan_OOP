public class deneme1 {

    private final String name;
    private final int age;


    public void printfunciton(){
        System.out.println(" lets print smt..");
    }

    public void printfuction(String overload){

        System.out.println("bu overload yapılmış bir method==" + overload);
    }

    public deneme1(String name,int age) {

        this.age= age;
        this.name=name;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Name = "+ name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("age = "+ age);
    }
}
