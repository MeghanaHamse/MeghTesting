package Utils;

import org.testng.annotations.DataProvider;

public class DataP{
	@DataProvider(name = "RegisterP")
	public Object[][] RegP() {
	    return new Object[][] {
	        {"meghanahamse0724@gmail.com", "Meghana@2407"}
	       //{"darshanhamse07@gmail.com","Darsh"}
	    };
	}
	@DataProvider(name = "ProfilePage")
	public Object[][] ProfP() {
	    return new Object[][] {
	        {"meghana", "hamse"}
	    };
	}
}
