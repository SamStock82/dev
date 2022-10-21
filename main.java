public class main {
    public static Integer value = 10;
    public static void main(String[] args){
        main app = new main();
        app.go();
    }

    static void go(){
        System.out.println("Welcome to my app");
        System.out.println("The value is "+value);
        value = value + 10
        System.out.println("Now the value is "+value);
    }
}