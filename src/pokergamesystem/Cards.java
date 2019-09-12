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
public class Cards 
{
    
    private short suit, rank;
    private static String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
    private static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    
    Cards(short suit, short rank){
        this.rank = rank;
        this.suit = suit;
    }
    
    public short getRank(){
        return rank;
    }
    
    public short getSuit(){
        return suit;
    }
    
    public String toString()
    {
        return ranks[rank] + " of " + suits[suit];
    }
    
    public static String rankAsString(int _rank)
    {
        return ranks[_rank];
    }
    
}
