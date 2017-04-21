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
            String word = answer.next();
            

            if(word.length() != 1)
            {
                System.out.println("Please guess a valid character.");
                word = answer.next();
            }
            
            if (checkAnswer(word))
            {
                
                
            }
            
            if (incorrect == 6)
            {
                gameOver = true;
            }
            else if (correct == word.length())
            {
                gameOver = true;
                win = true;
            }
        }
        
        if (win == true)
        {
            
        }
    }

    
    public static boolean checkAnswer(String answer, String guessWord)
    {
       for (int i = 0; i < guessWord.length(); i++)
       {
           if (guessWord.substring(i) == answer)
           {
            System.out.println("There is a " + answer + " in the word!");
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
