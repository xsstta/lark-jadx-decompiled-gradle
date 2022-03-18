package com.google.android.datatransport.runtime;

import com.google.android.datatransport.AbstractC21350c;
import com.google.android.datatransport.AbstractC21392d;
import com.google.android.datatransport.C21349b;
import com.google.android.datatransport.runtime.C21400b;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.k */
public abstract class AbstractC21437k {

    /* renamed from: com.google.android.datatransport.runtime.k$a */
    public static abstract class AbstractC21438a {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract AbstractC21438a mo72629a(C21349b bVar);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract AbstractC21438a mo72630a(AbstractC21350c<?> cVar);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract AbstractC21438a mo72631a(AbstractC21392d<?, byte[]> dVar);

        /* renamed from: a */
        public abstract AbstractC21438a mo72632a(AbstractC21439l lVar);

        /* renamed from: a */
        public abstract AbstractC21438a mo72633a(String str);

        /* renamed from: a */
        public abstract AbstractC21437k mo72634a();
    }

    /* renamed from: a */
    public abstract AbstractC21439l mo72621a();

    /* renamed from: b */
    public abstract String mo72622b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract AbstractC21350c<?> mo72623c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract AbstractC21392d<?, byte[]> mo72624d();

    /* renamed from: e */
    public abstract C21349b mo72625e();

    AbstractC21437k() {
    }

    /* renamed from: g */
    public static AbstractC21438a m77554g() {
        return new C21400b.C21402a();
    }

    /* renamed from: f */
    public byte[] mo72689f() {
        return mo72624d().apply(mo72623c().mo72494b());
    }
}
