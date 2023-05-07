public class BClass {
    private AClass aClass;

    public BClass(AClass aClass) {
        this.aClass = aClass;
    }

    public void shout() {
        aClass.shout();
    }
}
