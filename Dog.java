public class Dog
{
    private String breed;
    private String color;
    private String name;
    private int size;

    public void setColor(String newColor){
      color = newColor;
    }

    public String getColor(){
      return color;
    }

    public void setName(String newName){
      name = newName;
    }

    public String getName(){
      return name;
    }

    public void bark(int anger_factor){  
      int chaos = (int)(Math.random() * anger_factor); 

      for(int i = 0; i < chaos; i++){
        System.out.print("ARF ");
      }
    }
}
