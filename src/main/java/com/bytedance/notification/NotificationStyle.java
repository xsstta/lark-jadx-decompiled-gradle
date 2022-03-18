package com.bytedance.notification;

public enum NotificationStyle {
    NORMAL(1, "NORMAL"),
    SMALL_PICTURE(2, "SMALL_PICTURE");
    
    public final int styleIndex;
    public final String styleName;

    public String toString() {
        return this.styleName;
    }

    private NotificationStyle(int i, String str) {
        this.styleIndex = i;
        this.styleName = str;
    }
}
