public class SubscriptionPlan {
    public class SubscriptionPlan {
        private String type;
        private double price;
        private int deviceLimit;

        public SubscriptionPlan(String type, double price, int deviceLimit) {
            this.type = type;
            this.price = price;
            this.deviceLimit = deviceLimit;
        }

        public void displayInfo() {
            System.out.println("Plan: " + type + ", Price: " + price + ", Devices: " + deviceLimit);
        }

        public String getType() { return type; }
        public double getPrice() { return price; }
        public int getDeviceLimit() { return deviceLimit; }
    }
}
