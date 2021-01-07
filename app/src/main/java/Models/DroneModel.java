package Models;

public class DroneModel {
    int pic;
    String text,dimen,weight;
    public  DroneModel(){}

    public DroneModel(int pic, String text, String dimen, String weight) {
        this.pic = pic;
        this.text = text;
        this.dimen = dimen;
        this.weight = weight;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDimen() {
        return dimen;
    }

    public void setDimen(String dimen) {
        this.dimen = dimen;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "DroneModel{" +
                "pic=" + pic +
                ", text='" + text + '\'' +
                ", dimen='" + dimen + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
