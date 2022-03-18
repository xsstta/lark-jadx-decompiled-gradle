package com.bytedance.ee.webapp.p723d;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.ee.webapp.d.a */
public class C13790a {

    /* renamed from: a */
    public static final Set<String> f36046a;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("biz.navigation.setTitle");
        hashSet.add("biz.navigation.setLeft");
        hashSet.add("biz.navigation.setRight");
        hashSet.add("biz.navigation.setMenu");
        hashSet.add("biz.navigation.close");
        hashSet.add("device.screen.lockViewOrientation");
        hashSet.add("device.screen.unlockViewOrientation");
        f36046a = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public static boolean m55889a(String str) {
        return f36046a.contains(str);
    }
}
