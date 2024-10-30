public class OrderFactory {
    public IOrder getInstance(String orderType) {
        return switch (orderType.toLowerCase()){
            case "online" -> new OnlineOrder();
            case "instore" -> new InStoreOrder();
            case "telephone" -> new TelephoneOrder();
            default -> null;
        };
    }
}
