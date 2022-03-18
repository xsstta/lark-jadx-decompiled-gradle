package com.ss.android.appcenter.common.bannerview.p1289a;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.viewpager2.widget.C1615c;
import androidx.viewpager2.widget.C1617e;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.appcenter.common.bannerview.p1290b.C28137b;
import com.ss.android.appcenter.common.bannerview.transform.OverlapPageTransformer;

/* renamed from: com.ss.android.appcenter.common.bannerview.a.b */
public class C28134b {

    /* renamed from: a */
    private C28135c f70463a;

    /* renamed from: b */
    private final C28133a f70464b;

    /* renamed from: c */
    private final C1615c f70465c = new C1615c();

    /* renamed from: d */
    private C1617e f70466d;

    /* renamed from: e */
    private ViewPager2.AbstractC1608g f70467e;

    /* renamed from: b */
    public C1615c mo100159b() {
        return this.f70465c;
    }

    /* renamed from: a */
    public C28135c mo100156a() {
        if (this.f70463a == null) {
            this.f70463a = new C28135c();
        }
        return this.f70463a;
    }

    /* renamed from: c */
    public void mo100160c() {
        C1617e eVar = this.f70466d;
        if (eVar != null) {
            this.f70465c.mo8362b(eVar);
        }
    }

    /* renamed from: d */
    public void mo100161d() {
        ViewPager2.AbstractC1608g gVar = this.f70467e;
        if (gVar != null) {
            this.f70465c.mo8362b(gVar);
        }
    }

    public C28134b() {
        C28135c cVar = new C28135c();
        this.f70463a = cVar;
        this.f70464b = new C28133a(cVar);
    }

    /* renamed from: e */
    public void mo100162e() {
        mo100160c();
        C1617e eVar = new C1617e(this.f70463a.mo100178f());
        this.f70466d = eVar;
        this.f70465c.mo8361a(eVar);
    }

    /* renamed from: a */
    public void mo100157a(Context context, AttributeSet attributeSet) {
        this.f70464b.mo100155a(context, attributeSet);
    }

    /* renamed from: a */
    public void mo100158a(boolean z, float f) {
        mo100161d();
        if (!z || Build.VERSION.SDK_INT < 21) {
            this.f70467e = new C28137b(f);
        } else {
            this.f70467e = new OverlapPageTransformer(this.f70463a.mo100192n(), f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED);
        }
        this.f70465c.mo8361a(this.f70467e);
    }
}
