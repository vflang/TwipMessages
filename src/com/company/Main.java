package com.company;
/*
Message class: bew object --> constructor accepts person's phone # and person's name; set both to different variables
method for recieving text and assigning time to it --> use the System clock?? system.time ro something like1

MessageList class:
- store the list of messages; messages can be added, removed, displayed and moved from one list to another --> arraylist
- Messages are stored in descending order (just keept on adding it to the first so it moves the rest down

Message List class neds to support the following functions:
- Allow new messages to be inserted into the list
- Message lists are stored in descending timeReceived order
*/
public class Main {

    public static void main(String[] args) {
	Message myMessage = new Message();
	myMessage.personInfo("Veronica", "1 484-###-###");
	myMessage.receiveTxt("heckin bamboozled");
	myMessage.displayList();
	myMessage.removeMessage(50);
    }
}
