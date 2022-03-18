package com.google.android.gms.common.internal;

/* renamed from: com.google.android.gms.common.internal.i */
public final class C21750i {

    /* renamed from: a */
    private static final int f53090a = 15;

    /* renamed from: b */
    private final String f53091b;

    /* renamed from: c */
    private final String f53092c;

    public C21750i(String str, String str2) {
        Preconditions.checkNotNull(str, "log tag cannot be null");
        Preconditions.checkArgument(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f53091b = str;
        if (str2 == null || str2.length() <= 0) {
            this.f53092c = null;
        } else {
            this.f53092c = str2;
        }
    }

    public C21750i(String str) {
        this(str, null);
    }
}
