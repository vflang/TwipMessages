package com.company;

import java.util.ArrayList;
import java.util.TimeZone;

/**
 * Created by Veronica Lang on 2/8/2018.
 Message class: bew object --> constructor accepts person's phone # and person's name; set both to different variables
 method for receiving text and assigning time to it --> use the System clock?? system.time ro something like1
 System.currentTimeMillis() and TimeZone.getDefault();
 */
public class Message {
    public static String contactName;
    public static String phoneNum;
    public static String sentMessage;
    public static ArrayList allMessages = new ArrayList();

    public void personInfo (String name, String phoneNumber){
        contactName = name;
        phoneNum = phoneNumber;
    }
    public String receiveTxt(String message){
        sentMessage = message;
        TimeZone.getDefault();
        String MessagePlusTime = ("\"" + sentMessage + "\"\t received at " + System.currentTimeMillis());
        allMessages.add(MessagePlusTime); //make it so that it adds to the first index?
       return (MessagePlusTime);
    }
    public String removeMessage(int numOfMessage){ //like the 5th or first message etc
        int numMessage = numOfMessage;
         String tempMessage = allMessages.get(numMessage).toString();
        allMessages.remove(numMessage);
        return ("You have removed" + tempMessage + "from your messages");
    }
    public ArrayList displayList(){
        return (allMessages);
    }
    /*public ArrayList<String> getList(){
        return allMessages;
    }*/

}
