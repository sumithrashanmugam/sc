package Shipments;

import org.testng.annotations.DataProvider;

import disableAndEnable.BasepageFormEsa;

public class ShipUtils {
	@DataProvider(name = "Shipment")
	public String[][] Shipdata() {
		
		String[][] exceldata=ShipData.readexcelship();
		return exceldata;
		
	}
}
	
	

