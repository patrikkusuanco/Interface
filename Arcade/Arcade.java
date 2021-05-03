package com.Arcade;

public class ArcadeMachine implements Coinable, Time{

	int game = 0;

	public ArcadeMachine() {
		this.game = 999999999;
	}

	@Override
	public void time() {

		System.out.println("Machine is ready to play!");

	}

	@Override
	public void reload(int count) {
		this.game += count;
	}

	@Override
	public boolean insertCoin() {
		if(this.game > 0) {
			this.time();
			return true;
		}
		System.out.println("Machine is empty");
		return false;

	}


}
