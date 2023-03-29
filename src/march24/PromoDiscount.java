package march24;

public class PromoDiscount {
	double price;
	
	String promoCode;
	void discountPromo(){
		price*=.5;
		if(promoCode=="Promo5") {
			price*=.95;
			System.out.println("The sale amount is "+price);
		}
		if(promoCode=="Promo10") {
			price*=0.90;
			System.out.println("The sale amount is "+price);
		}
		if(promoCode=="Promo20") {
			price*=.80;
			System.out.println("The sale amount is "+price);
		}
		else {
			System.out.println("The sale amount is "+price);
		}
		
		
	}

}
