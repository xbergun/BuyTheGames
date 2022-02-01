package Entities;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.UserCheckManager;
import Concrete.UserManager;

public class Main {

	public static void main(String[] args) {
		
		Users user1= new Users(1232131534,"Berkay","Ergun","13061999");
	    Games game1=new Games("Valorant");

	    Campaigns campaigns= new Campaigns(1,20,5);

	    UserCheckManager check = new UserCheckManager();
	    check.check(user1);
	    

	    CampaignManager campmanag = new CampaignManager();
	    campmanag.delete(campaigns);

	    UserManager user = new UserManager();
	    user.register(user1);
	    
	    GameManager gameManager = new GameManager();
	    gameManager.sell(user1, game1);

	}

}
