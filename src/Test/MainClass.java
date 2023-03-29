package Test;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirCraft aircraft1 = new AirCraft();
		aircraft1.aircraftName = "KV";
		aircraft1.modelNo = 28;
		aircraft1.verticalTakeOff = true;
		aircraft1.fighterAirtoAir();
		
		System.out.println("******************************Gopesh**************************");
		KeyBoard keyboard1 = new KeyBoard();
		keyboard1.brandName = "Logi";
		keyboard1.bluetoothEnabled = true;
		keyboard1.keys = 51;
		keyboard1.connect();

	}

}
