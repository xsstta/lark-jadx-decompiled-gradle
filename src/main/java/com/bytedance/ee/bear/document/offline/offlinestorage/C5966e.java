package com.bytedance.ee.bear.document.offline.offlinestorage;

import android.text.TextUtils;
import android.util.LruCache;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.document.offline.offlinestorage.e */
public class C5966e extends LruCache<C5967a, C5968f> {

    /* renamed from: com.bytedance.ee.bear.document.offline.offlinestorage.e$a */
    public static class C5967a {

        /* renamed from: a */
        public final String f16716a;

        /* renamed from: b */
        public final String f16717b;

        public int hashCode() {
            int i;
            String str = this.f16716a;
            int i2 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i3 = i * 31;
            String str2 = this.f16717b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return i3 + i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C5967a aVar = (C5967a) obj;
            String str = this.f16716a;
            if (str == null ? aVar.f16716a != null : !str.equals(aVar.f16716a)) {
                return false;
            }
            String str2 = this.f16717b;
            String str3 = aVar.f16717b;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
            return false;
        }

        public C5967a(String str, String str2) {
            this.f16716a = str;
            this.f16717b = str2;
        }
    }

    public C5966e(int i) {
        super(i);
    }

    /* renamed from: a */
    public void mo24120a(String str) {
        synchronized (this) {
            for (Map.Entry entry : snapshot().entrySet()) {
                C5967a aVar = (C5967a) entry.getKey();
                if (TextUtils.equals(str, aVar.f16717b)) {
                    remove(aVar);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int sizeOf(C5967a aVar, C5968f fVar) {
        String d = fVar.mo24137d();
        if (d == null) {
            return 0;
        }
        return d.length();
    }

    /* renamed from: a */
    public C5968f mo24118a(String str, String str2) {
        C5968f fVar;
        synchronized (this) {
            fVar = (C5968f) get(new C5967a(str, str2));
            if (fVar != null) {
                fVar = new C5968f(fVar);
            }
        }
        return fVar;
    }

    /* renamed from: a */
    public C5968f mo24119a(String str, String str2, C5968f fVar) {
        C5968f fVar2;
        synchronized (this) {
            fVar2 = new C5968f(fVar);
            put(new C5967a(str, str2), fVar2);
        }
        return fVar2;
    }
}
