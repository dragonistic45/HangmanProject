import java.util.Scanner;

public class Hangman
{
    
    public static void main (String args[])
    {
        Scanner answer = new Scanner (System.in);
        boolean gameOver = false;
        boolean win = false;
        
        int correct = 0;
        int incorrect = 0;
        while (gameOver == false)
        {
            answer.next();
           
        for (int i = 0; i < Word.length; i++)
        {
            if (Word.substring(i) == answer)
            correct++;
            else
            incorrect++;
        }
            if(answer.length != 1)
            {
                
            }
            if (incorrect.length == 6)
            {
                gameOver = true;
            }
            else if (correct == Word.length)
            {
                gameOver = true;
                win = true;
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
