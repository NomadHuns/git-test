public class App {
    public static void main(String[] args) throws Exception {
        AClass aClass = new AClass();
        BClass bClass = new BClass(aClass);
    }
}
