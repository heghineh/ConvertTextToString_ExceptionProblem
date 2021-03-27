package com.company;

public class TextToConvert {
    String textToConvert;

    public TextToConvert() {
    }

    public TextToConvert(String textToConvert) {
        this.textToConvert = textToConvert;
    }

    public int convert(String string){
        int convertedString = Integer.parseInt(textToConvert.trim());
        return convertedString;
    }

    public String getTextToConvert() {
        return textToConvert;
    }

    public void setTextToConvert(String textToConvert) {
        this.textToConvert = textToConvert;
    }
}
