package com.bae.dialogflowbot.models;

import java.util.ArrayList;

public class RichContent {
    ArrayList<ArrayList<Option>> options;
    String type;

    public ArrayList<ArrayList<Option>> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<ArrayList<Option>> options) {
        this.options = options;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
