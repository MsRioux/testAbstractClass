public class ChildConcreteClass extends ParentClassAbstract {
    private int num1;

    public ChildConcreteClass(String name, String word, int num1)
    {
        super(name, word);
        this.num1 = num1;
    }//end constructor

    public String toString()
    {
        String result = super.toString() + "\nNum1: " + num1;
        return result;
    }//end toString
}//end child class which extends abstract parent
