package bridgelabz.workshop;

import java.util.LinkedList;


abstract class Notification {
 String message;
 String timeStamp;

 Notification(String message, String timeStamp) {
     this.message = message;
     this.timeStamp = timeStamp;
 }

 
 abstract void display();
}


class LikeNotification extends Notification {
 String likedBy;



public class SocialMediaNotificationDemo {
 public static void main(String[] args) {
    
 }
}

