package com.ss.android.lark.player.entity;

import android.os.Bundle;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.player.entity.a */
public class C52129a {

    /* renamed from: a */
    private static List<Bundle> f129343a = new ArrayList();

    static {
        for (int i = 0; i < 3; i++) {
            f129343a.add(new Bundle());
        }
    }

    /* renamed from: a */
    public static synchronized Bundle m202238a() {
        synchronized (C52129a.class) {
            for (int i = 0; i < 3; i++) {
                if (f129343a.get(i).isEmpty()) {
                    return f129343a.get(i);
                }
            }
            Log.m165397w("BundlePool", "<create new bundle object>");
            return new Bundle();
        }
    }
}
