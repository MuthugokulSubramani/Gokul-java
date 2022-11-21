public class Bus {
   private int busno;
    private boolean Ac;
    private int capacity;
    Bus(int no, boolean Ac, int cap){
        this.busno = no;
        this.Ac = Ac;
        this.capacity = cap;

    }
   public int getBusno(){
        return  busno;
   }

   public boolean isAc(){
        return Ac;
   }

    public int getCapacity(){   //accessor method
        return capacity;
    }

    public void setAc(boolean val){
        Ac = val;
    }
    public void setCapacity(int cap){    //mutator method
        capacity = cap;
    }
    public void displaybusinfo(){    //Creating method to bus info
        System.out.println("Bus no: " + busno + "Ac: " + Ac + "Capacity: " + capacity);
    }

}
