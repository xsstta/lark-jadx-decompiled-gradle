package com.ss.android.pushmanager;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.pushmanager.d */
public class C59966d {

    /* renamed from: a */
    public static final Set<Integer> f149484a;

    /* renamed from: a */
    public static String m232705a() {
        return C59958a.m232686a("/service/1/update_token/");
    }

    /* renamed from: b */
    public static String m232706b() {
        return C59958a.m232686a("/service/1/app_notice_status/");
    }

    /* renamed from: c */
    public static String m232707c() {
        return C59958a.m232686a("/cloudpush/update_sender/");
    }

    static {
        HashSet hashSet = new HashSet();
        f149484a = hashSet;
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
    }
}
