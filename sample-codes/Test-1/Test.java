public class Test{
    public static void main(String[] args) {
        Pizza pizza = new Pizza();

        pizza.setName("Italian");
        pizza.setPrize(20);
        System.err.println("Pizza name: "+pizza.getName());
        System.err.println("Pizza prize: "+pizza.getPrize());

    }
};

class Pizza{
    private String name;
    private int prize;

    public void setName(String name){
        this.name=name;
    }
    public void setPrize(int prize){
        this.prize=prize;
    }

    public String getName(){
        return this.name;
    }

    public int getPrize(){
        return this.prize;
    }
} 