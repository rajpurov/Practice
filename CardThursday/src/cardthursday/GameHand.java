/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

OO Principle

1.Delegation is used here to hand over the responsibility for a 
  task to another class.
2.Interface principle used for interface of class instead of implementation.
*/
package cardthursday;

/**
 *
 * @author owner
 */
public class GameHand {
    
    private int size=60;
    CardThursday[] deck = new CardThursday[size];//array of object
    public void generate()
    {
        //foreach loop
        int counter=0;
        for(CardThursday.Suit s : CardThursday.Suit.values())
        {
            for(CardThursday.Value v : CardThursday.Value.values())
            {
                //CardThursday c1 = new CardThursday(s,v);
                deck[counter] = new CardThursday(s,v);
                counter++;
            }
        }
    }
    
}
