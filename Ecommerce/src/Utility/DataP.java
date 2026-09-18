package Utility;

import org.testng.annotations.DataProvider;

public class DataP {
	@DataProvider(name="megh")
	public Object[][] locals()
	{
		return new Object[][] {
				{"megh","India","6789"}
		};
	}
}
/*
import org.testng.annotations.DataProvider;

public class DataP {

    @DataProvider(name = "megh")
    public Object[][] locals() {

        return new Object[][] {
            {"megh", "India", "6789"}
        };
    }
}
*/