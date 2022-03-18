package com.ss.lark.android.passport.biz.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.widget.c */
public class C65296c extends PagerAdapter {

    /* renamed from: a */
    List<View> f164416a;

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f164416a.size();
    }

    public C65296c(List<View> list) {
        this.f164416a = list;
    }

    /* renamed from: a */
    public View instantiateItem(ViewGroup viewGroup, int i) {
        View view = this.f164416a.get(i);
        viewGroup.addView(view);
        return view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }
}
