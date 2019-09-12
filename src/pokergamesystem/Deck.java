/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pokergamesystem;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ardientehu_cis21035
 */
public class Deck {
    private ArrayList<Cards> cards;
    
    Deck(){
        cards = new ArrayList<Cards>();
        int index_1, index_2;
        Random generator = new Random();
        Cards temp;
        
        for(int x = 1; x <= 4; x++){
            for(int y = 1; y <= 13; y++){
                cards.add(new Card (a, b));
            }
        }
        int size;
        
        for(int i = 0; i < 100; i++){
            index_1 = generator.nextInt(cards.size() - 1);
            index_2 = generator.nextInt(cards.size() - 1);
            
            temp = cards.get(index_2);
            cards.set(index_2, cards.get(index_1));
            cards.set(index_1, temp);
        }
    }
        
    public Cards drawFromDeck(){
        return cards.remove(0);
    }
        
    public int getTotalCards(){
        return cards.size();
    }    
    
}
