package com.example.adilos.firebasechatapp;

import java.util.Date;

/**
 * Created by ADILOS on 18-07-2017.
 */

public class ChatMessage {

    //In order to store the chat messages in the Firebase real-time database, a messages model is
    // created for them. The layout of the chat message, has three views. To be able to
    // populate those views, the model too must have at least three fields.
    //to make the model compatible with FirebaseUI, default constructor is needed
    // along with getters and setters for all the member variables.

    private String messageText;
    private String messageUser;
    private long messageTime;

    public ChatMessage(String messageText, String messageUser) {
        this.messageText = messageText;
        this.messageUser = messageUser;

        // Initialize to current time
        messageTime = new Date().getTime();
    }

    public ChatMessage(){
        //constructor with no arguments required
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}