import java.util.Scanner;

public class ChooseYourAdventure {
  public static void main( String[] args ) {

    Scanner keyboard = new Scanner( System.in );
    String ans1, ans2, ans3;

    System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
    System.out.println("You are in a creepy house! Would you like to go 'upstairs' or into the 'kitchen'?");
    ans1 = keyboard.next().toLowerCase();

    if (ans1.equals("upstairs")) {
      System.out.println("You head upstairs and hear a door fling open. You quickly look to find a place to hide.");
      System.out.println(" Do you you enter the 'library' or the 'bedroom'?");
      ans2 = keyboard.next().toLowerCase();
      if (ans2.equals("library")) {
        System.out.println("You run into the library and shut the door. You hear a scream and running towards your direction. Quick! find a place to hide. Do you enter the 'study' or hide in the 'box'?");
        ans3 = keyboard.next().toLowerCase();
        if (ans3.equals("study")) {
          System.out.println("You run into the study and try to close the door quietly behind you. As you back up away from the door you trip over a book. The last thing you hear is a blood curdling scream and the splintering of the door you just shut. Better luck next time!");
        }
        else if (ans3.equals("box")) {
          System.out.println("You quickly pull open the box and jump inside. You close the lid on top of yourself and try to steady your breathing as best you can. When you hear 'it' enter in not far behind you. It looks around, pacing back and forth, inching closer. When the floorboard creaks and the creature screams and rushes down the hallway.");
          System.out.println("You're safe!... for now.");
        }
      }
      else if (ans2.equals("bedroom")) {
        System.out.println("You book it towards the bedroom. You hear the creature fly up the stairs! You slam the door behind you and rush to lock it. You only have a few seconds. Do you hide under the 'bed' or go in the 'closet'?");
        ans3 = keyboard.next().toLowerCase();
        if (ans3.equals("bed")) {
          System.out.println("you dive under the bed and hold your breath when you hear the door just shatter behind you. The creature rushes in and clears the room. It begins to walk out when it sees a pattern in the carpet leading under the bed. It flips the mattress! You dont even have time to hear the mattress hit the floor...");
        }
        else if (ans3.equals("closet")) {
          System.out.println("you run to the closet and feel you barely have time to close the door behind you. The creature is not far behind you! You hear it move around and then begin to slowly pace out of the room. when a coat hanger falls off and gives you away! The last noise you hear is a terrifying scream and the sound of the door beaking...");
        }
      }
    }
    else if (ans1.equals("kitchen")) {
      System.out.println("You head into the kitchen when you hear a terrifying noise from close by! You need a place to hide. Do you go down into the 'cellar' or do you go into the 'meatlocker'?");
      ans2 = keyboard.next().toLowerCase();
      if (ans2.equals("cellar")) {
        System.out.println("You go down into the cellar. The creature senses your presence and lets loose a horrible noise! Do you hide under the 'stairs' or you under some 'blankets'?");
        ans3 = keyboard.next().toLowerCase();
        if (ans3.equals("stairs")) {
          System.out.println("You decide to hide under the stairs. The creatures rushes into the room! It doesnt take long to find you. Maybe you hiding in the open wasn't such a good idea.");
        }
        else if (ans3.equals("blankets")) {
          System.out.println("You quickly toss some blankets on you and try to stay motionless. The monster rushes in. It surveys the room and though you try not to move, you are overtaken by fear and the shaking gives you away! The monster tears you and the blankets to shreds...");
        }
      }
      else if (ans2.equals("meatlocker")) {
        System.out.println("You open up the meatlocker and to your horror you see pieces of other victims dangling from the walls and throughout the room. The monster is closing in on you. Do you hide in the 'freezer' or try and 'blend' in with the others?");
        ans3 = keyboard.next().toLowerCase();
        if (ans3.equals("freezer")) {
          System.out.println("You dive into the freezer and close the door behind you until you hear it shut. Through the window you can see the monster move in and quickly scope the place out. He then quickly backs up and keeps searching the rest of the house. You feel safe...and cold. You go to open the door but you find the handle has be removed from this end! You feel your heart sink as well as your heart rate...");
        }
        else if (ans3.equals("blend")) {
          System.out.println("You decide to try and blend in with the other victims. You climb up on a rack and sprawl 'pieces' around you. Through the severed legs of one of the victims you see the monster enter! After a few seconds of quick glancing you see it quickly retreat as if it doesnt like the cold. You're safe! Now to plan your escape...");
        }
      }
    }
    System.out.println("Till next time!");
  }
}
