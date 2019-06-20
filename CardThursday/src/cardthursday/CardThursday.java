/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 OO Principles

1.There is encapsulate principle to protect the data from any other app make it private.
2.Cohesion principle used here to develop well-focused class.
3.Coupling is used for Loosely coupled and Tightly coupled enums.

Java Features used which make our work easy is that  erase and Reuse so that
we just need to add the new value instead of old one.

*/
package cardthursday;

/**
 *
 * @author owner
 */
public class CardThursday {

    //Use enum to avoid the coupling
    public enum Suit{RED,YELLOW,GREEN,BLUE};
    private Suit s;
    public enum Value{ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAWTWO, DRAWFOUR, WILDCARD};
    private Value v;
    
    public CardThursday(Suit su , Value va)
    {
        this.s = su;
        this.v = va;
    }
    
    //Encapsulated fields
    public Suit getS()
    {
        return s;
    }
    
    public Value getv()
    {
        return v;
    }
    
    public void setS(Suit s)
    {
        this.s = s;
    }
    
    public void setV(Value v)
    {
        this.v = v;
    }
 
    
}
