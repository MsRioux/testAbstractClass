public abstract class ParentClassAbstract
{
    public String name;
    private String word;

    public ParentClassAbstract(String name, String word)
    {
        this.name = name;
        this.word = word;
    }

    public String toString()
    {
        String result = "Name: " + name + "\nWord: " + word;
        return result;
    }
}
