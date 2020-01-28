public class Dictionary2 extends Book2
{
    private int definitions;
    //Sets up the dictionary with the specified number of pages
    //(maintained by the Book parent class) and defintions.

    public Dictionary2 (int numPages, int numDefinitions)
    {
        super (numPages);
        definitions = numDefinitions;
    }//end constructor

    //Prints a message using both local and inherited values.
    public void definitionMessage()
    {
        System.out.println("Number of definitions: " + definitions);
        System.out.println("Defintions per page: " + definitions/pages);
    }//end defintionMessage
}//end Dictionary2
