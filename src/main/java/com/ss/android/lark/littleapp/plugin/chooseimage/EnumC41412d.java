package com.ss.android.lark.littleapp.plugin.chooseimage;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.littleapp.plugin.chooseimage.d */
public enum EnumC41412d {
    CAMERA("camera"),
    ALBUM("album");
    
    public String mValue;

    public static boolean contains(String str) {
        for (EnumC41412d dVar : values()) {
            if (dVar.mValue.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private EnumC41412d(String str) {
        this.mValue = str;
    }
}
