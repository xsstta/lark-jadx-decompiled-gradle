package com.ss.android.lark.calendar.impl.features.common.widget.infinitepager;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;

/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitepager.b */
public abstract class AbstractC31218b extends PagerAdapter {

    /* renamed from: a */
    private C31217a[] f78950a = new C31217a[3];

    /* renamed from: b */
    protected Context f78951b;

    /* renamed from: c */
    protected int f78952c;

    /* renamed from: d */
    private boolean f78953d;

    /* renamed from: a */
    public abstract View mo108825a(int i);

    /* renamed from: b */
    public abstract void mo108831b(int i);

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return 3;
    }

    /* renamed from: i */
    public boolean mo113217i() {
        return this.f78953d;
    }

    /* renamed from: h */
    public void mo113216h() {
        C31217a aVar = new C31217a(this.f78951b);
        this.f78950a[0] = aVar;
        aVar.mo113212a(mo108825a(0));
        C31217a aVar2 = new C31217a(this.f78951b);
        this.f78950a[1] = aVar2;
        aVar2.mo113212a(mo108825a(1));
        C31217a aVar3 = new C31217a(this.f78951b);
        this.f78950a[2] = aVar3;
        aVar3.mo113212a(mo108825a(2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo113218j() {
        this.f78950a[0].mo113214c();
        View b = this.f78950a[0].mo113213b();
        this.f78950a[1].mo113214c();
        C31217a[] aVarArr = this.f78950a;
        aVarArr[0].mo113212a(aVarArr[1].mo113213b());
        this.f78950a[2].mo113214c();
        C31217a[] aVarArr2 = this.f78950a;
        aVarArr2[1].mo113212a(aVarArr2[2].mo113213b());
        this.f78950a[2].mo113212a(b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo113219k() {
        this.f78950a[2].mo113214c();
        View b = this.f78950a[2].mo113213b();
        this.f78950a[1].mo113214c();
        C31217a[] aVarArr = this.f78950a;
        aVarArr[2].mo113212a(aVarArr[1].mo113213b());
        this.f78950a[0].mo113214c();
        C31217a[] aVarArr2 = this.f78950a;
        aVarArr2[1].mo113212a(aVarArr2[0].mo113213b());
        this.f78950a[0].mo113212a(b);
    }

    public AbstractC31218b(Context context) {
        this.f78951b = context;
    }

    /* renamed from: d */
    public <T extends View> T mo113215d(int i) {
        if (i < 0 || i > 2) {
            return null;
        }
        return (T) this.f78950a[i].mo113213b();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        if (view == ((C31217a) obj).mo113211a()) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        C31217a aVar = this.f78950a[i];
        viewGroup.addView(aVar.mo113211a());
        int i2 = this.f78952c + 1;
        this.f78952c = i2;
        if (i2 == 3) {
            this.f78953d = true;
        }
        mo108831b(i);
        return aVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView(((C31217a) obj).mo113211a());
    }
}
