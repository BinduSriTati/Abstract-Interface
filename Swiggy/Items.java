package Swiggy;

public class Items {
    public String Biryani;
    public String starters;
    public String deserts;
    public String curries;


    public Items(String biryani, String starters, String deserts, String curries) {
        Biryani = biryani;
        this.starters = starters;
        this.deserts = deserts;
        this.curries = curries;
    }

    public String getBiryani() {
        return Biryani;
    }

    public String getStarters() {
        return starters;
    }

    public String getDeserts() {
        return deserts;
    }

    public String getCurries() {
        return curries;
    }
}

