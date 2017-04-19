import java.util.Scanner;

public class Hangman
{
    

    public static void main (String args[])
    {
        Scanner answer = new Scanner (System.in);
        boolean gameOver = false;
        boolean win = false;
        
        
        while (gameOver == false)
        {
            answer.next();
            int correct = 0;
        int incorrect = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == answer)
                correct++;
            else
            incorrect++;
        }
            if(answer.length != 1)
            {
                
            }
            
        }
        
        if (win == true)
        {
            
        }
    }

    
    public boolean checkAnswer(String answer)
    {
       
    }
    
    public void printHangman(int timesWrong)
    {
        System.out.println("Print some hangman Ascii art here");
    }
}
