package Task03;

public class Donate {
    private String shape;
   private int size;
   private String flavour;
   private String ingredients;
   private String decor;

   public Donate(String shape,  int size, String flavour,  String ingredients, String decor){
       this.shape = shape;
       this.size = size;
       this.flavour = flavour;
       this.ingredients = ingredients;
       this.decor = decor;
   }

   public Donate(String shape, String ingredients) {
        this.shape = shape;
        this.ingredients = ingredients;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDecor() {
        return decor;
    }

    public void setDecor(String decor) {
        this.decor = decor;
    }

    @Override
    public String toString() {
        return "Donate{" +
                "shape='" + shape + '\'' +
                ", size=" + size +
                ", flavour='" + flavour + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", decor='" + decor + '\'' +
                '}';
    }
}
