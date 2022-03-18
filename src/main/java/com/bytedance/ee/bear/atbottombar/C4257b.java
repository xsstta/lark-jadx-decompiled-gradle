package com.bytedance.ee.bear.atbottombar;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.atbottombar.b */
public class C4257b extends PagerAdapter {

    /* renamed from: a */
    private List<C4255a> f12808a;

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f12808a.size();
    }

    public C4257b(List<C4255a> list) {
        ArrayList arrayList = new ArrayList();
        this.f12808a = arrayList;
        arrayList.addAll(list);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View a = this.f12808a.get(i).mo16712a();
        viewGroup.addView(a);
        return a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView(this.f12808a.get(i).mo16712a());
    }
}
