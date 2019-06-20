/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

OO principle

1. The principle used here is Inheritance to inherit the features(fields and methods) 
of other two class which is CardThursday and GameHand.
*/
package cardthursday;

/**
 *
 * @author owner
 */
public class GamePlayer {
    public static void main(String[]args)
    {
        GameHand ch= new GameHand();
        ch.generate();//Calling
        for(CardThursday c: ch.deck)
        {
            System.out.println(c.getS() + " " + c.getv());
        }
    }
    
}
