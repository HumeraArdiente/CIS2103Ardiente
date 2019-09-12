/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pokergamesystem;

/**
 *
 * @author ardientehu_cis21035
 */
public class Main {
    
    public static void main(String[] args)
    {
        Deck deck= new Deck();
        Card C;

        System.out.println(deck.getTotalCards());

        while (deck.getTotalCards()!=0 )
        {
            C = deck.drawFromDeck();
            System.out.println(C.toString());
        }
    } 
    
}
