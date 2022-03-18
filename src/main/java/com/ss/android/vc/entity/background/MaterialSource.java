package com.ss.android.vc.entity.background;

public enum MaterialSource {
    UNKNOWN_SOURCE(0),
    All_SOURCE(1),
    APP_WIN(2),
    APP_MAC(3),
    APP_ANDROID(4),
    APP_IOS(5),
    APP_IPAD(6),
    APP_SETTINGS(7),
    APP_ADMIN(8),
    ISV_UPLOAD(21),
    ISV_UPLOAD_FROM_VC(22),
    ISV_UPLOAD_FROM_PRESET(23);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public int getValue() {
        return this.value;
    }

    public static MaterialSource fromValue(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_SOURCE;
            case 1:
                return All_SOURCE;
            case 2:
                return APP_WIN;
            case 3:
                return APP_MAC;
            case 4:
                return APP_ANDROID;
            case 5:
                return APP_IOS;
            case 6:
                return APP_IPAD;
            case 7:
                return APP_SETTINGS;
            case 8:
                return APP_ADMIN;
            default:
                switch (i) {
                    case 21:
                        return ISV_UPLOAD;
                    case 22:
                        return ISV_UPLOAD_FROM_VC;
                    case 23:
                        return ISV_UPLOAD_FROM_PRESET;
                    default:
                        return null;
                }
        }
    }

    private MaterialSource(int i) {
        this.value = i;
    }
}
