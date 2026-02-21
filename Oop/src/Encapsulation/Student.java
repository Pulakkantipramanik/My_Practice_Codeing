package Encapsulation;

public class Student {
    private String name ;
    private int rollnumber;
   /* public String getName(){
        return name;
    }
    public int setRollNumber(){
        return rollnumber;
    }*/


    public void setName(String name) {
        this.name = name;
    }


    public void setRollnumber(int rollnumber)
    {
       if (rollnumber<=0){
           throw new IllegalArgumentException("invalid number");
       }
        this.rollnumber = rollnumber;
    }
    public void details(){
        System.out.println(this.name=name);
        System.out.println(this.rollnumber=rollnumber);
    }

}
