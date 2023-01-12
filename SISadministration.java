public class SISadministration extends Sales{
String AdminUsername;
String Password;

}

class Product{
double price;
int entry_date;
int product_id;
String product_name;
double totalPrice(double price){
double tax=0.15*price;
double totalPrice=price+tax;
return totalPrice;
}


}
class Customer extends Product {
    String customer_name;
    String Customer_address;
}
class Sales extends Customer{

}