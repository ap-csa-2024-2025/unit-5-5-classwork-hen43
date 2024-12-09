public class Dog
{
    private String breed;
    private String color;
    private int size;


    public void setColor(String newColor){
      color = newColor;
    }

    public String getColor(){
      return color;
    }


    public void bark(){  
      int chaos = (int)(Math.random() * 10); 

      for(int i = 0; i < chaos; i++){
        System.out.print("ARF ");
      }
    }
}
