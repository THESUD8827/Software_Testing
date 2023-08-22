package Package1;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 
{
	 @DataProvider(name = "TestData")
	    public Object[][] provideTestData() 
	 {
	        
	        return new Object[][] { {"Sudhanshu"}, {"Kapil"}, {"Mike"} }; 
	 }
	 
	 @Test(dataProvider = "TestData")
	 public void Test1(String a) 
	 {
		 System.out.println(a.length());
		 System.out.println(a.concat(" ").concat("Singh"));
	 }
	 

}
