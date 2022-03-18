package com.ss.android.vc.meeting.module.p3117d;

import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.irtc.AbstractC61030i;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.vc.meeting.module.d.b */
public class C61600b<T> implements AbstractC61030i {

    /* renamed from: a */
    protected String f154539a = "";

    /* renamed from: b */
    protected WeakReference<T> f154540b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo213457a(T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo213458b(T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo213459c(T t) {
    }

    @Override // com.ss.android.vc.irtc.AbstractC61030i
    /* renamed from: d */
    public void mo210661d() {
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m240486e() {
        T t = this.f154540b.get();
        if (t != null) {
            mo213459c(t);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m240487f() {
        T t = this.f154540b.get();
        if (t != null) {
            mo213458b(t);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m240488g() {
        T t = this.f154540b.get();
        if (t != null) {
            mo213457a(t);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61030i
    /* renamed from: a */
    public final void mo210658a() {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.p3117d.$$Lambda$b$JCs_YEYFqI5bynoB6CZXefvh80 */

            public final void run() {
                C61600b.m271228lambda$JCs_YEYFqI5bynoB6CZXefvh80(C61600b.this);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.AbstractC61030i
    /* renamed from: b */
    public final void mo210659b() {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.p3117d.$$Lambda$b$RYQvr08MBPqYbvgFuRTN9u1Sic */

            public final void run() {
                C61600b.m271229lambda$RYQvr08MBPqYbvgFuRTN9u1Sic(C61600b.this);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.AbstractC61030i
    /* renamed from: c */
    public final void mo210660c() {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.p3117d.$$Lambda$b$0F99AM5Lqw8WXxqfBAy073qN4zw */

            public final void run() {
                C61600b.lambda$0F99AM5Lqw8WXxqfBAy073qN4zw(C61600b.this);
            }
        });
    }

    public C61600b(String str, T t) {
        if (str != null) {
            this.f154539a = str;
        }
        this.f154540b = new WeakReference<>(t);
    }
}
