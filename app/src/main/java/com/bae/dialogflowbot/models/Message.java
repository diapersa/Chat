package com.bae.dialogflowbot.models;

public class Message {

    private String message;
    private boolean isReceived;
    private CustomPayload customPayload;

    public Message(String message, boolean isReceived) {
        this.message = message;
        this.isReceived = isReceived;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getIsReceived() {
        return isReceived;
    }

    public void setIsReceived(boolean isReceived) {
        this.isReceived = isReceived;
    }

    public CustomPayload getCustomPayload() {
        return customPayload;
    }

    public void setCustomPayload(CustomPayload customPayload) {
        this.customPayload = customPayload;
    }
}
