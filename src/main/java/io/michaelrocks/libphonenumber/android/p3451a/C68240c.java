package io.michaelrocks.libphonenumber.android.p3451a;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: io.michaelrocks.libphonenumber.android.a.c */
public class C68240c {

    /* renamed from: a */
    private C68241a<String, Pattern> f171501a;

    /* access modifiers changed from: private */
    /* renamed from: io.michaelrocks.libphonenumber.android.a.c$a */
    public static class C68241a<K, V> {

        /* renamed from: a */
        public int f171502a;

        /* renamed from: b */
        private LinkedHashMap<K, V> f171503b;

        /* renamed from: a */
        public synchronized V mo237417a(K k) {
            return this.f171503b.get(k);
        }

        public C68241a(int i) {
            this.f171502a = i;
            this.f171503b = new LinkedHashMap<K, V>(((i * 4) / 3) + 1, 0.75f, true) {
                /* class io.michaelrocks.libphonenumber.android.p3451a.C68240c.C68241a.C682421 */

                /* access modifiers changed from: protected */
                @Override // java.util.LinkedHashMap
                public boolean removeEldestEntry(Map.Entry<K, V> entry) {
                    if (size() > C68241a.this.f171502a) {
                        return true;
                    }
                    return false;
                }
            };
        }

        /* renamed from: a */
        public synchronized void mo237418a(K k, V v) {
            this.f171503b.put(k, v);
        }
    }

    public C68240c(int i) {
        this.f171501a = new C68241a<>(i);
    }

    /* renamed from: a */
    public Pattern mo237416a(String str) {
        Pattern a = this.f171501a.mo237417a(str);
        if (a != null) {
            return a;
        }
        Pattern compile = Pattern.compile(str);
        this.f171501a.mo237418a(str, compile);
        return compile;
    }
}
