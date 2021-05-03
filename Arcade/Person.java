package com.Arcade;

public class Person
{
	private int coins;
	private int price;

	public Person(int coins)
	{
		this.coins = coins;
		this.price = 1;
	}

	public void intsertCoin(Coinable coinable, int coins)
	{
		System.out.println("You inserted " + coins + " coins");
		if(coins > 0)
		{
			if(!coinable.insertCoin())
			{
				System.out.println(coins + " coins refunded ");
			}
			else
			{
			coins = coins * price * 5;
			System.out.println("You have " + coins + " minutes to play the game");
			}
		}

		else
		{
			System.out.println("Please insert coin to play the game");
		}

	}
}
