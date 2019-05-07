package com.merchant;

public class BeginMerchantsGuide 
{
    public static void main( String[] args )
    {
        String filePath = "./src/com/merchant/input.txt";

        if (args.length != 0)
            filePath = args[0];

        try{
            ReadInputAndProcess readInput = new ReadInputAndProcess();
            readInput.readFileAndProcess(filePath);
            DisplayOutput.processOutput();
        }
        catch(Exception e){
            System.out.println("An exception has been raised, Either due to invalid input or due to reading the file, quiting the program " + e);
        }

    }
}
