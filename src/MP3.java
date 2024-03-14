  class MP3 extends Item{
    private int duration;
     public MP3 (String name, String description, String ID, float price, int duration){
       super(name, description, ID, price);
       this.duration = duration;
     }

    void showInfo()
    {
      System.out.println("MP3 - Name: " + name + ", Description: " + getDescription() + ", ID: " + ID + ", Price: " + price + ", Duration: " + duration + " minutes");
    }
    
    }
    
  
