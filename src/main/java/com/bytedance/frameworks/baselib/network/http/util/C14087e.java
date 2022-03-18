package com.bytedance.frameworks.baselib.network.http.util;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bytedance.frameworks.baselib.network.http.util.e */
public class C14087e<K, V> {

    /* renamed from: a */
    private Map<K, V> f37020a;

    /* renamed from: b */
    private int f37021b;

    /* renamed from: c */
    private int f37022c;

    /* renamed from: d */
    private int f37023d;

    /* renamed from: e */
    private int f37024e;

    /* renamed from: f */
    private int f37025f;

    /* renamed from: g */
    private int f37026g;

    /* renamed from: h */
    private int f37027h;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo51818b(K k, V v) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo51819c(K k, V v) {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public V mo51820c(K k) {
        return null;
    }

    /* renamed from: b */
    public final synchronized int mo51816b() {
        return this.f37021b;
    }

    /* renamed from: a */
    public final synchronized void mo51815a() {
        m57030a(-1);
    }

    /* renamed from: c */
    public synchronized Map<K, V> mo51821c() {
        return this.f37020a;
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f37026g;
        int i3 = this.f37027h + i2;
        if (i3 != 0) {
            i = (i2 * 100) / i3;
        } else {
            i = 0;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f37022c), Integer.valueOf(this.f37026g), Integer.valueOf(this.f37027h), Integer.valueOf(i));
    }

    public C14087e(int i) {
        if (i > 0) {
            this.f37022c = i;
            this.f37020a = Collections.synchronizedMap(new LinkedHashMap(0, 0.75f, true));
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: b */
    public final synchronized V mo51817b(K k) {
        V remove;
        if (k != null) {
            remove = this.f37020a.remove(k);
            if (remove != null) {
                this.f37021b -= m57031d(k, remove);
            }
        } else {
            throw new NullPointerException("key == null");
        }
        return remove;
    }

    /* renamed from: a */
    private void m57030a(int i) {
        Map.Entry<K, V> next;
        while (this.f37021b > i && !this.f37020a.isEmpty() && (next = this.f37020a.entrySet().iterator().next()) != null) {
            K key = next.getKey();
            V value = next.getValue();
            this.f37020a.remove(key);
            this.f37021b -= m57031d(key, value);
            this.f37025f++;
            mo51818b(key, value);
        }
        if (this.f37021b < 0 || (this.f37020a.isEmpty() && this.f37021b != 0)) {
            throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
        }
    }

    /* renamed from: a */
    public final synchronized V mo51813a(K k) {
        if (k != null) {
            V v = this.f37020a.get(k);
            if (v != null) {
                this.f37026g++;
                return v;
            }
            this.f37027h++;
            V c = mo51820c(k);
            if (c != null) {
                this.f37024e++;
                this.f37021b += m57031d(k, c);
                this.f37020a.put(k, c);
                m57030a(this.f37022c);
            }
            return c;
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: d */
    private int m57031d(K k, V v) {
        int c = mo51819c(k, v);
        if (c >= 0) {
            return c;
        }
        throw new IllegalStateException("Negative size: " + ((Object) k) + ContainerUtils.KEY_VALUE_DELIMITER + ((Object) v));
    }

    /* renamed from: a */
    public final synchronized V mo51814a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        this.f37023d++;
        this.f37021b += m57031d(k, v);
        put = this.f37020a.put(k, v);
        if (put != null) {
            this.f37021b -= m57031d(k, put);
        }
        m57030a(this.f37022c);
        return put;
    }
}
