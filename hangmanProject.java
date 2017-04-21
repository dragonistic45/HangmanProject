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
       for (int i = 0; Word.legnth; i++)
       {
           if (Word.substring(i) == answer)
           {
            System.out.println("There is a " + Word + " in the word!");
            return true;
           }
       }
       return false;
    }
    
    public void printHangman(int timesWrong)
    {
        if (timesWrong >= 0)
         {
             if (timesWrong == 0)
             {
                 System.out.println ("  _______");
                 System.out.println (" |       |");
                 System.out.println (" |");
                 System.out.println (" |");
                 System.out.println (" |");
                 System.out.println (" |");
                 System.out.println (" |______");
                 System.out.println ("/_______\\"); 
             }
                 else
                    if (timesWrong == 1)             
                    {
                        System.out.println ("  _______");
                        System.out.println (" |       |");
                        System.out.println (" |       O");
                        System.out.println (" |");
                        System.out.println (" |");
                        System.out.println (" |");
                        System.out.println (" |______");
                        System.out.println ("/_______\\"); 
                    }
                        else 
                            if (timesWrong == 2)
                            {
                                System.out.println ("  _______");
                                System.out.println (" |       |");
                                System.out.println (" |       O");
                                System.out.println (" |       |");
                                System.out.println (" |");
                                System.out.println (" |");
                                System.out.println (" |______");
                                System.out.println ("/_______\\");
                            }
                                else
                                    if (timesWrong == 3)
                                    {
                                        System.out.println ("  _______");
                                        System.out.println (" |       |");
                                        System.out.println (" |       O");
                                        System.out.println (" |      /|\");
                                        System.out.println (" |");
                                        System.out.println (" |");
                                        System.out.println (" |______");
                                        System.out.println ("/_______\\"); 
                                    } 
                                        else
                                            if (timesWrong == 4)
                                            {
                                                System.out.println ("  _______");
                                                System.out.println (" |       |");
                                                System.out.println (" |       O");
                                                System.out.println (" |      /|\");
                                                System.out.println (" |       ");
                                                System.out.println (" |       ");
                                                System.out.println (" |______");
                                                System.out.println ("/________\\");
                                            }
                                                else 
                                                    if (timesWrong == 5)
                                                    {
                                                        System.out.println ("  _______");
                                                        System.out.println (" |       |");
                                                        System.out.println (" |       O");
                                                        System.out.println (" |      /|\");
                                                        System.out.println (" |       |");
                                                        System.out.println (" |       ");
                                                        System.out.println (" |______");
                                                        System.out.println ("/________\\");
                                                    }  
                                                        else
                                                            if (timesWrong == 6)
                                                            {
                                                                System.out.println ("  _______");
                                                                System.out.println (" |       |");
                                                                System.out.println (" |       O");
                                                                System.out.println (" |      /|\");
                                                                System.out.println (" |       |");
                                                                System.out.println (" |      /");
                                                                System.out.println (" |______");
                                                                System.out.println ("/________\\");
                                                            }
                                                                else
                                                                    if (timesWrong == 7)
                                                                    {
                                                                        System.out.println ("  _______");
                                                                        System.out.println (" |       |");
                                                                        System.out.println (" |       O");
                                                                        System.out.println (" |     \\|/");
                                                                        System.out.println (" |       |");
                                                                        System.out.println (" |      /.\");
                                                                        System.out.println (" |______");
                                                                        System.out.println ("/________\\");
                                                                    }  
                                                                        else
                                                                            if (timesWrong == 8)
                                                                            {
                                                                                System.out.println ("  _______");
                                                                                System.out.println (" |       |");
                                                                                System.out.println (" |       O");
                                                                                System.out.println (" |      /|\");
                                                                                System.out.println (" |       |");
                                                                                System.out.println (" |      /.\");
                                                                                System.out.println (" |______");
                                                                                System.out.println ("/________\\");
                                                                                System.out.println ("Hangman!");
                                                                            }
         }                                                             
    }
}
