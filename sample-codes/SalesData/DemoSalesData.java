public class DemoSalesData{
    public static void main(String[] args){
        int[] salesArray= {2,43,2,6,1};
        SalesData sd= new SalesData(salesArray);


        System.out.println("Total is: "+sd.getTotal());

        System.out.println("Average is: "+ sd.getAverage());

        System.out.println("Hight sale is: "+ sd.getHighestSale());

        System.out.println("Lowest Sale is: "+ sd.getLowestSale());
    }
}