class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
	char tax;	
	//TODO constructor
	Public Item(int id, String name, double price, char tax){
	this.id=id;
	this.name=name;
	this.price=price;
	this.tax=tax;
	}
	//TODO setters and getters
	void setId(int id){
	this.id=id;
	}
	void setName(String name){
	this.name=name;
	}
	void setPrice(double price){
	this.price=price;
	}
	
	int getId(){
	return id;
	}
	String getName(){
	return name;
	}
	double getPrice(){
	return price;
	}
	char getTax(){
	return tax;
	}


	double taxReturn () {
		//TODOK
		if('A'==tax){
		return (((price/100)*18)/100)*15
		}
		if('B'== tax){
  		return(((price/100)*5)/100)*15
		}
		if('C'==tax){
		return 0;
		}
	}
}
