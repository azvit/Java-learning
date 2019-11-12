package com.company;
import java.util.Scanner;
public class R2D2 extends Mech {
    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    private String loc;
   private String loc1 = "Холл";
@Override
 public void move(){
     Scanner in = new Scanner(System.in);


     System.out.print("Куда мне пойти, хозяин? (Возможные варианты ответа: Спальня=1, Кухня=2, Холл=3, Улица=4, Гараж=5) Я нахожусь в " + loc1 + "\n");
     loc = in.next();
     if (loc.equals(loc1)){
         System.out.println("Но я уже здесь, хозяин!");
     }
     else
     switch (loc){

         case "Спальня": loc1 = loc;
             System.out.println("Слушаюсь, двигаюсь в " + loc1);
             break;
         case "Кухня": loc1 = loc;
             System.out.println("Слушаюсь, двигаюсь в " + loc1);
             break;
         case "Холл": loc1 = loc;
             System.out.println("Слушаюсь, двигаюсь в " + loc1);
             break;
         case "Улица": loc1 = loc;
             System.out.println("Слушаюсь, двигаюсь в " + loc1);
             break;
         case "Гараж": loc1 = loc;
             System.out.println("Слушаюсь, двигаюсь в " + loc1);
             break;
         case "Выход": break;
         default:  System.out.println("Прости, хозяин, но я не могу туда опасть :(");
     }

 }
}
