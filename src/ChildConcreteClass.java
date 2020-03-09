public class ChildConcreteClass extends ParentClassAbstract {
    private int num1;

    public ChildConcreteClass(String name, String word, int num1)
    {
        super(name, word);
        this.num1 = num1;
    }

    public String toString()
    {
        String result = super.toString() + "\nNum1: " + num1;
        return result;
    }
}
