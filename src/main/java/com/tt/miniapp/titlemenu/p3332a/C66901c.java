package com.tt.miniapp.titlemenu.p3332a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.miniapp.titlemenu.a.c */
public class C66901c extends PagerAdapter {

    /* renamed from: a */
    private final int f168759a = 8;

    /* renamed from: b */
    private final int f168760b;

    /* renamed from: c */
    private Context f168761c;

    /* renamed from: d */
    private final List<C66899a> f168762d;

    /* renamed from: e */
    private boolean f168763e;

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: a */
    public boolean mo232925a() {
        return this.f168763e;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        List<C66899a> list = this.f168762d;
        if (list != null) {
            return (int) Math.ceil((double) (((float) list.size()) / ((float) this.f168759a)));
        }
        return 0;
    }

    public C66901c(Context context, List<C66899a> list) {
        boolean z;
        this.f168761c = context;
        this.f168762d = list;
        int i = 8 / 2;
        this.f168760b = i;
        if (list.size() > i) {
            z = true;
        } else {
            z = false;
        }
        this.f168763e = z;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == null) {
            ArrayList arrayList = new ArrayList();
            int i2 = this.f168759a;
            int i3 = i * i2;
            int i4 = (i + 1) * i2;
            while (i3 < this.f168762d.size() && i3 < i4) {
                C66899a aVar = this.f168762d.get(i3);
                if (aVar.getParent() != null) {
                    ((ViewGroup) aVar.getParent()).removeView(aVar);
                }
                arrayList.add(aVar);
                i3++;
            }
            viewGroup.addView(new C66900b(this.f168761c, arrayList, this.f168760b));
        }
        return viewGroup.getChildAt(i);
    }
}
