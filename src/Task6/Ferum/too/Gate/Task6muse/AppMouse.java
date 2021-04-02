package Task6.Ferum.too.Gate.Task6muse;

public class AppMouse {
    public static void main(String[] args) {

        Mouse mouse1 = new Mouse(55);
        Mouse mouse2 = new Mouse(68);
        Mouse mouse3 = new Mouse( 75);
      //  Mouse [] mouseX = new Mouse {mouse1, mouse2,mouse3};


        Cat cat1 = new Cat("wef","8",80, 67, new Mouse[]{mouse1, mouse2, mouse3, null, null} );
        Cat cat2 = new Cat("vbv","8",90, 57, new Mouse[]{mouse1, mouse2, null, null, null} );
        cat1.catchCat(cat2);

       // Cat cat2 = new Cat();


  /*public void catchCat(Cat cattt)    --- нужна ли эта строчка..?
  if (cat1.weight > cat2.weight){

            for (int i = 0; i < cat2.mousesCatch.length, i ++) {
             mousesCatch[i] = mouse
                if (mouse.mouseSpeed > cat1.speed>){

                }


            }
                cat2.mousesCatch = 0;

    }
   */

    }
}
