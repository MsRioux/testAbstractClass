public abstract class ParentClassAbstract
{
    public String name;
    private String word;

    public ParentClassAbstract(String name, String word)
    {
        this.name = name;
        this.word = word;
    }//end constructor

    public String toString()
    {
        String result = "Name: " + name + "\nWord: " + word;
        return result;
    }//end to string
}//end abstract class which is a parent to ChildconreteClass
