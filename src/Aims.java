
public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Animation", "Frozen", 19.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("James Cameron", "Action", "Avatar", 24.99f);

        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        cart.removeDigitalVideoDisc(dvd2);

        System.out.println("Total cost is: " + cart.totalCost());
    }
}