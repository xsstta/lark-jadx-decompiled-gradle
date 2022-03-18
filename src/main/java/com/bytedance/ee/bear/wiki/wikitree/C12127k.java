package com.bytedance.ee.bear.wiki.wikitree;

import android.util.ArrayMap;
import com.bytedance.ee.bear.wiki.wikitree.tree.p586a.C12136e;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.k */
public class C12127k {

    /* renamed from: a */
    private Map<String, C12136e> f32671a = new ArrayMap();

    /* renamed from: com.bytedance.ee.bear.wiki.wikitree.k$a */
    private static final class C12128a {

        /* renamed from: a */
        public static final C12127k f32672a = new C12127k();
    }

    /* renamed from: b */
    public static C12127k m50124b() {
        return C12128a.f32672a;
    }

    /* renamed from: a */
    public void mo46307a() {
        this.f32671a.clear();
    }

    /* renamed from: a */
    public C12136e mo46306a(String str) {
        return this.f32671a.get(str);
    }

    /* renamed from: a */
    public void mo46308a(String str, C12136e eVar) {
        if (eVar != null) {
            this.f32671a.put(str, eVar);
        }
    }
}
