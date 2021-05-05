package Concrete;

import Abstract.GameService;
import Entities.Games;
import Entities.Users;


public  class GameManager implements GameService{



	@Override
	public void sell(Users user, Games game) {
	System.out.println(user.getFirstName()+ "Adlı Kullanıcı " + game.getGameName()+"Adlı oyunu satin aldı");
		
	}

	

}
