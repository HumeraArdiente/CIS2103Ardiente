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
	private ArrayList<Card> cards;

	 Deck()
	{
		cards = new ArrayList<Card>();
		int index_1, index_2;
		Random generator = new Random();
		Card temp;

		for (short a=1; a<=4; a++)
		{
			for (short b=1; b<=13; b++)
			 {
			   cards.add(new Card(a,b) );
			 }
		}
	   int size; 	  

		for (int i=0; i<100; i++)
		{
			index_1 = generator.nextInt( cards.size() - 1 );
			index_2 = generator.nextInt( cards.size() - 1 );

			temp = cards.get( index_2 );
			cards.set( index_2 , cards.get( index_1 ) );
			cards.set( index_1, temp );
		}
	}

	public Card drawFromDeck()
	{	   
		return cards.remove( 0 );
	}

	public int getTotalCards()
	{
		return cards.size();   //we could use this method when making a complete poker game to see if we needed a new deck
	}
}
