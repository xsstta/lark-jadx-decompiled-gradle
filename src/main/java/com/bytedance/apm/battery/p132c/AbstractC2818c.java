package com.bytedance.apm.battery.p132c;

import com.bytedance.apm.battery.p132c.p133a.AbstractC2814b;
import com.bytedance.apm.core.ActivityLifeObserver;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.apm.battery.c.c */
public abstract class AbstractC2818c<T extends AbstractC2814b> implements AbstractC2823h {

    /* renamed from: a */
    long f9013a;

    /* renamed from: b */
    boolean f9014b;

    /* renamed from: c */
    ConcurrentHashMap<Integer, T> f9015c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private String f9016d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12166a(T t, long j, long j2);

    @Override // com.bytedance.apm.battery.p132c.AbstractC2823h
    /* renamed from: b */
    public void mo12167b() {
        this.f9014b = false;
    }

    @Override // com.bytedance.apm.battery.p132c.AbstractC2823h
    /* renamed from: c */
    public void mo12168c() {
        this.f9014b = true;
    }

    /* renamed from: f */
    public String mo12185f() {
        return this.f9016d;
    }

    @Override // com.bytedance.apm.battery.p132c.AbstractC2823h
    public void h_() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f9015c.size() != 0) {
            long j = this.f9013a;
            if (currentTimeMillis - j >= 600000) {
                mo12164a(j, currentTimeMillis);
            }
        }
        this.f9013a = currentTimeMillis;
    }

    AbstractC2818c(String str) {
        this.f9016d = str;
        this.f9014b = ActivityLifeObserver.getInstance().isForeground();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12164a(long j, long j2) {
        Iterator<Map.Entry<Integer, T>> it = this.f9015c.entrySet().iterator();
        while (it.hasNext()) {
            T value = it.next().getValue();
            if (0 < value.f9003e && value.f9003e < value.f9002d) {
                it.remove();
            } else if (0 < value.f9003e && value.f9003e < j) {
                it.remove();
            } else if (j2 >= value.f9002d) {
                mo12166a(value, j, j2);
            }
        }
    }
}
