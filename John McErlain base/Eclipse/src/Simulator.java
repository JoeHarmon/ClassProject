import java.util.ArrayList;
import java.util.Random;
/*
 */
public class Simulator
{  
    private Grass blades;
    //private ArrayList<Grass> blades;
   

    /**
     * Constructor for objects of class Simulator
     */
    public Simulator()
    {
     //grass = new Grass(); 
     //blades= new ArrayList<Grass>(); 
    }
    
    /**
     * Grow Grass (but not in Colorado)
     */
    public void growGrass()    
    { 
       //blades= new ArrayList<Grass>();
       
       int bladestogrow;
       bladestogrow = 100;
        //{ArrayList<Car> cars= new ArrayList<Car>();
      for (int i= 0; i < bladestogrow; i++){
      //blades.add(new Grass());
      blades = new Grass();
      blades.makeVisible();}
     } 

    /*public void growGrass ()
    {
            grass.slowMoveVertical(80);
            grass.slowMoveVertical(-80);
    }*/
   
     
    
    /*public void getLawnmower ()
    {
      
        {
           System.out.println("Get The LawnMower!!");
        }
    }*/

}
