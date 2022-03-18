package com.ss.android.lark.littleapp.plugin.chooseimage;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.littleapp.plugin.chooseimage.b */
public enum EnumC41410b {
    IMAGE("image"),
    VIDEO("video");
    
    public String mValue;

    public static boolean contains(String str) {
        for (EnumC41410b bVar : values()) {
            if (bVar.mValue.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private EnumC41410b(String str) {
        this.mValue = str;
    }
}
