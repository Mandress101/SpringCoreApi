package it.mandress101.springcore.api.model;

public class EPrefix {

    public String extentionName;
    public String dysplayName;
    public EColor primaryColor;

    public EPrefix(String extentionName, String dysplayName, EColor primaryColor) {
        this.extentionName = extentionName;
        this.dysplayName = dysplayName;
        this.primaryColor = primaryColor;
    }

    public String getExtentionName() {
        return extentionName;
    }

    public String getDysplayName() {
        return dysplayName;
    }

    public EColor getPrimaryColor() {
        return primaryColor;
    }
}
