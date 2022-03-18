package com.ss.android.vc.meeting.module.meetingdialog.labs.page;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.page.f */
public class C62285f extends PagerAdapter {

    /* renamed from: a */
    protected final List<AbstractC62283d> f156493a = new ArrayList();

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f156493a.size();
    }

    /* renamed from: b */
    public AbstractC62283d mo215413b(int i) {
        return this.f156493a.get(i);
    }

    /* renamed from: a */
    public void mo215411a(List<AbstractC62283d> list) {
        this.f156493a.clear();
        this.f156493a.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        if (!(obj instanceof AbstractC62283d) || !this.f156493a.contains(obj)) {
            return -2;
        }
        return super.getItemPosition(obj);
    }

    /* renamed from: a */
    public boolean mo215412a(int i) {
        return mo215413b(i).mo215385c();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        AbstractC62283d b = mo215413b(i);
        b.mo215389a(viewGroup);
        return b;
    }

    /* renamed from: a */
    public String mo215410a(Context context, int i) {
        return mo215413b(i).mo215377a(context);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        if (((AbstractC62283d) obj).mo215398g() == view) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        ((AbstractC62283d) obj).mo215395b(viewGroup);
    }
}
