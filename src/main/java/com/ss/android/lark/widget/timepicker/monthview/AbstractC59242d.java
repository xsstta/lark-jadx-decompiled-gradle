package com.ss.android.lark.widget.timepicker.monthview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;

/* renamed from: com.ss.android.lark.widget.timepicker.monthview.d */
public abstract class AbstractC59242d extends PagerAdapter {

    /* renamed from: a */
    protected Context f147116a;

    /* renamed from: b */
    private C59239c[] f147117b = new C59239c[3];

    /* renamed from: c */
    private int f147118c;

    /* renamed from: d */
    private boolean f147119d;

    /* renamed from: b */
    public abstract View mo201394b(int i);

    /* renamed from: c */
    public abstract void mo201397c(int i);

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return 3;
    }

    /* renamed from: b */
    public boolean mo201395b() {
        return this.f147119d;
    }

    /* renamed from: a */
    public void mo201393a() {
        C59239c cVar = new C59239c(this.f147116a);
        this.f147117b[0] = cVar;
        cVar.mo201375a(mo201394b(0));
        C59239c cVar2 = new C59239c(this.f147116a);
        this.f147117b[1] = cVar2;
        cVar2.mo201375a(mo201394b(1));
        C59239c cVar3 = new C59239c(this.f147116a);
        this.f147117b[2] = cVar3;
        cVar3.mo201375a(mo201394b(2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo201396c() {
        this.f147117b[0].mo201377c();
        View b = this.f147117b[0].mo201376b();
        this.f147117b[1].mo201377c();
        C59239c[] cVarArr = this.f147117b;
        cVarArr[0].mo201375a(cVarArr[1].mo201376b());
        this.f147117b[2].mo201377c();
        C59239c[] cVarArr2 = this.f147117b;
        cVarArr2[1].mo201375a(cVarArr2[2].mo201376b());
        this.f147117b[2].mo201375a(b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo201398d() {
        this.f147117b[2].mo201377c();
        View b = this.f147117b[2].mo201376b();
        this.f147117b[1].mo201377c();
        C59239c[] cVarArr = this.f147117b;
        cVarArr[2].mo201375a(cVarArr[1].mo201376b());
        this.f147117b[0].mo201377c();
        C59239c[] cVarArr2 = this.f147117b;
        cVarArr2[1].mo201375a(cVarArr2[0].mo201376b());
        this.f147117b[0].mo201375a(b);
    }

    public AbstractC59242d(Context context) {
        this.f147116a = context;
    }

    /* renamed from: a */
    public <T extends View> T mo201392a(int i) {
        if (i < 0 || i > 2) {
            return null;
        }
        return (T) this.f147117b[i].mo201376b();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        if (view == ((C59239c) obj).mo201374a()) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        C59239c cVar = this.f147117b[i];
        viewGroup.addView(cVar.mo201374a());
        int i2 = this.f147118c + 1;
        this.f147118c = i2;
        if (i2 == 3) {
            this.f147119d = true;
        }
        mo201397c(i);
        return cVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView(((C59239c) obj).mo201374a());
    }
}
