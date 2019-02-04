
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Ronak
 * @modifier GuoXing Zheng 991472414
 */
public class CardTrick {
    public static void main(String[] args)
    {
        //object to push
        Card object = new Card();
        
        
        object.setSuit("mine");
        object.setValue(1);
       System.out.println(object.getSuit());
       System.out.println(object.getValue());
        
    }
    
}
