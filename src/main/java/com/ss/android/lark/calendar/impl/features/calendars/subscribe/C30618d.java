package com.ss.android.lark.calendar.impl.features.calendars.subscribe;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.d */
public class C30618d extends PagerAdapter {

    /* renamed from: a */
    private List<ViewInfos> f76632a;

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f76632a.size();
    }

    public C30618d(List<ViewInfos> list) {
        this.f76632a = list;
    }

    /* renamed from: a */
    public View instantiateItem(ViewGroup viewGroup, int i) {
        View a = this.f76632a.get(i).mo110523a();
        viewGroup.addView(a);
        return a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }
}
