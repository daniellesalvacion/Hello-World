package oobExercise;

import java.sql.DriverPropertyInfo;

public class camera {

    //Attribute
    String model;
    double price;
    double dof;
    int ss;
    double aperture;
    int iso;

    //Constructor
    public camera(String model, double price, double dof, int ss, double aperture, int iso) {
        this.model = model;
        this.price = price;
        this.dof = dof;
        this.ss = ss;
        this.aperture = aperture;
        this.iso = iso;
    }

    //Method
    public String get_model() {
        return model;
    }
    public double get_price() {
        return price;
    }
    public double get_dof() {
        return dof;
    }
    public double get_ss() {
        return ss;
    }
    public double get_aperture() {
        return aperture;
    }
    public int get_iso() {
        return iso;
    }

}
