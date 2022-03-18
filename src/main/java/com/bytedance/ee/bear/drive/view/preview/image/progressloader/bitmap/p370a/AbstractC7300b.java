package com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a;

import com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7310h;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p372d.C7333f;
import java.util.Queue;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.a.b */
abstract class AbstractC7300b<T extends AbstractC7310h> {

    /* renamed from: a */
    private final Queue<T> f19563a = C7333f.m29295a(20);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo28502b();

    AbstractC7300b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public T mo28504c() {
        T poll = this.f19563a.poll();
        if (poll == null) {
            return mo28502b();
        }
        return poll;
    }

    /* renamed from: a */
    public void mo28503a(T t) {
        if (this.f19563a.size() < 20) {
            this.f19563a.offer(t);
        }
    }
}
