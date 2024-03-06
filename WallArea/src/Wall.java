public class Wall {
    //instence variables
    private double width;
    private double height;

    //constructor default
     public Wall(){

    }
    public Wall(double width,double height){
         if(width < 0){
             this.width = 0.0;
         }
         else{this.width = width;}
        if(width < 0){
            this.height = 0.0;
        }
        else{this.height = height;}    }
}
