package com.google.android.play.core.assetpacks;

import com.google.android.play.core.splitcompat.C22679r;

/* renamed from: com.google.android.play.core.assetpacks.a */
public abstract class AbstractC22575a {

    /* renamed from: a */
    private static final AbstractC22575a f55648a = new C22577ab(1, null, null);

    /* renamed from: a */
    static AbstractC22575a m81933a(String str, String str2) {
        C22679r.m82539a(str, "STORAGE_FILES location path must be non-null");
        C22679r.m82539a(str, "STORAGE_FILES assetsPath must be non-null");
        return new C22577ab(0, str, str2);
    }

    /* renamed from: a */
    public abstract int mo78694a();

    /* renamed from: b */
    public abstract String mo78695b();

    /* renamed from: c */
    public abstract String mo78696c();
}
