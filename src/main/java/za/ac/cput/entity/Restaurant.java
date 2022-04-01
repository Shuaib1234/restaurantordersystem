package za.ac.cput.entity;

public class Restaurant {
    private String restaurantId;
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantTelphone;
    private boolean isOpen;

    private Restaurant(){}

    private Restaurant(Builder builder){
        this.restaurantId=builder.restaurantId;
        this.restaurantName=builder.restaurantName;
        this.restaurantAddress=builder.restaurantAddress;
        this.restaurantTelphone=builder.restaurantTelphone;
        this.isOpen=builder.isOpen;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantTelphone() {
        return restaurantTelphone;
    }

    public void setRestaurantTelphone(String restaurantTelphone) {
        this.restaurantTelphone = restaurantTelphone;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantId='" + restaurantId + '\'' +
                ", restaurantName='" + restaurantName + '\'' +
                ", restaurantAddress='" + restaurantAddress + '\'' +
                ", restaurantTelphone='" + restaurantTelphone + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }
    public static class Builder {
        private String restaurantId;
        private String restaurantName;
        private String restaurantAddress;
        private String restaurantTelphone;
        private boolean isOpen;

        public Builder setRestaurantId(String restaurantId) {
            this.restaurantId = restaurantId;
            return this;
        }

        public Builder setRestaurantName(String restaurantName) {
            this.restaurantName = restaurantName;
            return this;

        }

        public Builder setRestaurantAddress(String restaurantAddress) {
            this.restaurantAddress = restaurantAddress;
            return this;
        }

        public Builder setRestaurantTelphone(String restaurantTelphone) {
            this.restaurantTelphone = restaurantTelphone;
            return this;
        }

        public Builder setOpen(boolean open) {
            isOpen = open;
            return this;
        }
        public Builder copy (Restaurant restaurant){
            this.restaurantId=restaurant.restaurantId;
            this.restaurantName=restaurant.restaurantName;
            this.restaurantAddress=restaurant.restaurantAddress;
            this.restaurantTelphone=restaurant.restaurantTelphone;
            this.isOpen=restaurant.isOpen;
            return this;
        }
        public Restaurant build(){
            return new Restaurant(this);
        }
    }

}
