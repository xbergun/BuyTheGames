package Concrete;

import Abstract.UserService;
import Entities.Users;

public class UserManager implements UserService{

	@Override
	public void register(Users user) {
		System.out.println(user.getFirstName()+ " "+ "isimli kullanıcıya kayıt oluşturuldu.");
		
	}

	public void updateData(Users user) {
		System.out.println(user.getNationaltyId()+ "Numarali kullanici güncellendi");
		
	}

	@Override
	public void deleteAcc(Users user) {
		System.out.println(user.getFirstName()+" "+ "İsimli kullanici silindi.");
		
	}

	

}
