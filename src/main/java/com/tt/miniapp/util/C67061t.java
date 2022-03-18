package com.tt.miniapp.util;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.tt.miniapp.util.t */
public class C67061t<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f169035a;

    /* renamed from: b */
    private int f169036b;

    /* renamed from: c */
    private int f169037c;

    /* renamed from: d */
    private int f169038d;

    /* renamed from: e */
    private int f169039e;

    /* renamed from: f */
    private int f169040f;

    /* renamed from: g */
    private int f169041g;

    /* renamed from: h */
    private AbstractC67062a f169042h;

    /* renamed from: com.tt.miniapp.util.t$a */
    public interface AbstractC67062a<K, V> {
        /* renamed from: a */
        void mo233163a(K k, V v);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo233161a(K k, V v) {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo233169c(K k, V v) {
    }

    /* renamed from: a */
    public LinkedHashMap mo233166a() {
        return this.f169035a;
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f169040f;
        int i3 = this.f169041g + i2;
        if (i3 != 0) {
            i = (i2 * 100) / i3;
        } else {
            i = 0;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f169037c), Integer.valueOf(this.f169040f), Integer.valueOf(this.f169041g), Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo233167a(AbstractC67062a aVar) {
        this.f169042h = aVar;
    }

    /* renamed from: a */
    public final synchronized V mo233165a(K k) {
        V remove;
        if (k != null) {
            remove = this.f169035a.remove(k);
            if (remove != null) {
                this.f169036b -= m261355d(k, remove);
            }
        } else {
            throw new NullPointerException("key == null");
        }
        return remove;
    }

    /* renamed from: a */
    private void m261354a(int i) {
        Map.Entry<K, V> next;
        while (this.f169036b > i && !this.f169035a.isEmpty() && (next = this.f169035a.entrySet().iterator().next()) != null) {
            K key = next.getKey();
            V value = next.getValue();
            this.f169035a.remove(key);
            if (this.f169042h != null) {
                System.out.println("trimToSize size:" + this.f169036b);
                this.f169042h.mo233163a(key, value);
            }
            this.f169036b -= m261355d(key, value);
            this.f169039e++;
            mo233169c(key, value);
        }
        if (this.f169036b < 0 || (this.f169035a.isEmpty() && this.f169036b != 0)) {
            throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
        }
    }

    /* renamed from: d */
    private int m261355d(K k, V v) {
        int a = mo233161a(k, v);
        if (a >= 0) {
            return a;
        }
        throw new IllegalStateException("Negative size: " + ((Object) k) + ContainerUtils.KEY_VALUE_DELIMITER + ((Object) v));
    }

    /* renamed from: b */
    public final synchronized V mo233168b(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        this.f169038d++;
        this.f169036b += m261355d(k, v);
        put = this.f169035a.put(k, v);
        if (put != null) {
            this.f169036b -= m261355d(k, put);
            AppBrandLogger.m52828d("", new Object[0]);
        }
        m261354a(this.f169037c);
        return put;
    }

    public C67061t(int i, int i2, LinkedHashMap linkedHashMap) {
        if (i > 0) {
            this.f169037c = i;
            this.f169036b = i2;
            if (linkedHashMap == null) {
                this.f169035a = new LinkedHashMap<>(0, 0.75f, true);
            } else {
                this.f169035a = linkedHashMap;
            }
        } else {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }
}
