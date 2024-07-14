class SalesData{
    private int[] data;

    public SalesData(int[] d){
        data=new int[d.length];

        for (int i=0; i<d.length; i++){
            data[i]= d[i];
        }
    }

    public SalesData(){
        data=new int[0];
    }


    public void setSalesData(int[] d){
        data=new int[d.length];

        for (int i=0; i<d.length; i++){
            data[i]= d[i];
        }
    }

    public long getTotal(){
        int total=0;
        for (int i=0; i<data.length; i++){
            total+=data[i];
        }
        return total;
    }

    public int getHighestSale(){
        int max=data[0];
        for (int i=0; i<data.length; i++){
            if (data[i]>max)
                max=data[i];
        }
        return max;
    }

    public int getLowestSale(){
        int min=data[0];
        for (int i=0; i<data.length; i++){
            if (data[i]<min)
                min=data[i];
        }
        return min;
    }

    public double getAverage(){
        return getTotal()/data.length;
    }

}