package com.bytedance.p203b;

import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.b.d */
public class C3500d extends UnsatisfiedLinkError {

    /* renamed from: a */
    private static final ArrayList<C3500d> f11056a = new ArrayList<>();

    static UnsatisfiedLinkError[] getErrors() {
        UnsatisfiedLinkError[] unsatisfiedLinkErrorArr;
        ArrayList<C3500d> arrayList = f11056a;
        synchronized (arrayList) {
            unsatisfiedLinkErrorArr = (UnsatisfiedLinkError[]) arrayList.toArray(new UnsatisfiedLinkError[0]);
        }
        return unsatisfiedLinkErrorArr;
    }

    C3500d(String str) {
        super(str);
        ArrayList<C3500d> arrayList = f11056a;
        synchronized (arrayList) {
            arrayList.add(this);
        }
    }

    C3500d(String str, Throwable th) {
        super(str);
        initCause(th);
        ArrayList<C3500d> arrayList = f11056a;
        synchronized (arrayList) {
            arrayList.add(this);
        }
    }
}
