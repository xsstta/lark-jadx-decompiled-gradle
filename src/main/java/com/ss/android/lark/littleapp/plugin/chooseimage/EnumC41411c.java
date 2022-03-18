package com.ss.android.lark.littleapp.plugin.chooseimage;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.littleapp.plugin.chooseimage.c */
public enum EnumC41411c {
    ORIGINAL("original"),
    COMPRESSED("compressed");
    
    public String mValue;

    public static boolean contains(String str) {
        for (EnumC41411c cVar : values()) {
            if (cVar.mValue.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private EnumC41411c(String str) {
        this.mValue = str;
    }
}
