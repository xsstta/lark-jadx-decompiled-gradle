package com.ss.android.lark.inno.player.p1974b.p1975a;

import android.view.View;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.lark.inno.player.b.a.a */
public class C38944a {

    /* renamed from: a */
    private int f100094a;

    /* renamed from: b */
    private int f100095b;

    /* renamed from: c */
    private float f100096c;

    /* renamed from: d */
    private float f100097d;

    /* renamed from: e */
    private int f100098e;

    /* renamed from: f */
    private FrameLayout f100099f;

    /* renamed from: g */
    private View f100100g;

    /* renamed from: h */
    private final Runnable f100101h = new Runnable() {
        /* class com.ss.android.lark.inno.player.p1974b.p1975a.C38944a.RunnableC389451 */

        public void run() {
            C38944a.this.mo142543b();
        }
    };

    /* renamed from: a */
    public void mo142539a() {
        View view = this.f100100g;
        if (view != null) {
            view.removeCallbacks(this.f100101h);
            this.f100100g.postOnAnimation(this.f100101h);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        if (r5 >= r7) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        if (r5 >= r7) goto L_0x005e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo142543b() {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.inno.player.p1974b.p1975a.C38944a.mo142543b():void");
    }

    /* renamed from: a */
    public void mo142540a(int i) {
        this.f100098e = i;
        mo142539a();
    }

    /* renamed from: a */
    public void mo142541a(View view) {
        this.f100100g = view;
        mo142539a();
    }

    /* renamed from: a */
    private float m153664a(float f) {
        float f2;
        int i = this.f100094a;
        int i2 = this.f100095b;
        if (i <= 0 || i2 <= 0) {
            f2 = -1.0f;
        } else {
            f2 = ((float) i) / ((float) i2);
        }
        if (f2 <= BitmapDescriptorFactory.HUE_RED) {
            return f;
        }
        float f3 = this.f100096c;
        if (f3 > BitmapDescriptorFactory.HUE_RED) {
            return f3 * f2;
        }
        return f2;
    }

    /* renamed from: a */
    public void mo142542a(FrameLayout frameLayout) {
        this.f100099f = frameLayout;
        mo142539a();
    }
}
