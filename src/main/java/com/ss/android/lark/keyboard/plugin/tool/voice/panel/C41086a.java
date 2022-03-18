package com.ss.android.lark.keyboard.plugin.tool.voice.panel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.util.List;

/* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.panel.a */
public class C41086a extends PagerAdapter {

    /* renamed from: a */
    private Context f104723a;

    /* renamed from: b */
    private List<View> f104724b;

    /* renamed from: c */
    private List<String> f104725c;

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f104724b.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        return this.f104725c.get(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View view = this.f104724b.get(i);
        viewGroup.addView(view);
        return view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public C41086a(Context context, List<View> list, List<String> list2) {
        this.f104723a = context;
        this.f104724b = list;
        this.f104725c = list2;
    }
}
