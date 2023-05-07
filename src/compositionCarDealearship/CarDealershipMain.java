package compositionCarDealearship;

public class CarDealershipMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car hondaCivic = new Car("Honda", "White", 5, 24000);
		Car kiaSeltos = new Car("Kia", "Blue", 5, 20000);
		Car santaFe = new Car("Hyundai", "Brown",7,35000);
		Car rav4 = new Car("Toyota", "Red",5,45000);
		CarDealership ds = new CarDealership();

		ds.addCarsToDealership(hondaCivic);
		ds.addCarsToDealership(kiaSeltos);

	}

}
