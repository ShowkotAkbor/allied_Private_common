package hw4Q2JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		// instantiated AboutMe class
		AboutMe aboutMe = new AboutMe();// constructor initialized when object is created
		// Variables is initialized bellow
		aboutMe.name = "Showkot Akbor";
		aboutMe.gender = 'M';
		aboutMe.height = 5.7;
		aboutMe.age = 33;
		aboutMe.cell = 2025529177l;
		aboutMe.zipcode = 22153;
		aboutMe.weight = 156.5f;
		aboutMe.moveToUsa = 2012;
		aboutMe.citizenship = true;
		// method initialized
		aboutMe.aboutMe();
		System.out.println("\n***************************************\n");
		AboutMe myFriend = new AboutMe();
		myFriend.name = "Alex";
		myFriend.gender = 'M';
		myFriend.height = 5.9;
		myFriend.age = 35;
		myFriend.cell = 3012675634l;
		myFriend.zipcode = 22150;
		myFriend.weight = 166.5f;
		myFriend.moveToUsa = 2000;
		myFriend.citizenship = true;
		myFriend.aboutMe();// method is initialized
	}

}
