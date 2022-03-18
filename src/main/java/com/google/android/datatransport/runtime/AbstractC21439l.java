package com.google.android.datatransport.runtime;

import android.util.Base64;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.C21423c;

/* renamed from: com.google.android.datatransport.runtime.l */
public abstract class AbstractC21439l {

    /* renamed from: com.google.android.datatransport.runtime.l$a */
    public static abstract class AbstractC21440a {
        /* renamed from: a */
        public abstract AbstractC21440a mo72666a(Priority priority);

        /* renamed from: a */
        public abstract AbstractC21440a mo72667a(String str);

        /* renamed from: a */
        public abstract AbstractC21440a mo72668a(byte[] bArr);

        /* renamed from: a */
        public abstract AbstractC21439l mo72669a();
    }

    /* renamed from: a */
    public abstract String mo72661a();

    /* renamed from: b */
    public abstract byte[] mo72662b();

    /* renamed from: c */
    public abstract Priority mo72663c();

    /* renamed from: d */
    public static AbstractC21440a m77567d() {
        return new C21423c.C21425a().mo72666a(Priority.DEFAULT);
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[3];
        objArr[0] = mo72661a();
        objArr[1] = mo72663c();
        if (mo72662b() == null) {
            str = "";
        } else {
            str = Base64.encodeToString(mo72662b(), 2);
        }
        objArr[2] = str;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }

    /* renamed from: a */
    public AbstractC21439l mo72690a(Priority priority) {
        return m77567d().mo72667a(mo72661a()).mo72666a(priority).mo72668a(mo72662b()).mo72669a();
    }
}
