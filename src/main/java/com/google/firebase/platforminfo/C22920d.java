package com.google.firebase.platforminfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.platforminfo.d */
public class C22920d {

    /* renamed from: b */
    private static volatile C22920d f56660b;

    /* renamed from: a */
    private final Set<AbstractC22922f> f56661a = new HashSet();

    C22920d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Set<AbstractC22922f> mo79558a() {
        Set<AbstractC22922f> unmodifiableSet;
        synchronized (this.f56661a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f56661a);
        }
        return unmodifiableSet;
    }

    /* renamed from: b */
    public static C22920d m83293b() {
        C22920d dVar = f56660b;
        if (dVar == null) {
            synchronized (C22920d.class) {
                dVar = f56660b;
                if (dVar == null) {
                    dVar = new C22920d();
                    f56660b = dVar;
                }
            }
        }
        return dVar;
    }
}
