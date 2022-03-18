package com.ss.android.lark.threadtab.p2757a;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.threadwindow.fragment.AbstractC56088f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.threadtab.a.a */
public class C55976a extends FragmentPagerAdapter {

    /* renamed from: a */
    protected final List<AbstractC56088f> f138328a = new ArrayList();

    /* renamed from: b */
    protected final FragmentManager f138329b;

    /* renamed from: c */
    protected final List<String> f138330c;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f138328a.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        return this.f138328a.get(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        if (!CollectionUtils.isNotEmpty(this.f138330c) || i >= this.f138330c.size()) {
            return "";
        }
        return this.f138330c.get(i);
    }

    public C55976a(FragmentManager fragmentManager, List<String> list) {
        super(fragmentManager);
        this.f138329b = fragmentManager;
        this.f138330c = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.FragmentPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Fragment fragment = (Fragment) super.instantiateItem(viewGroup, i);
        this.f138329b.beginTransaction().show(fragment).commitAllowingStateLoss();
        return fragment;
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.FragmentPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        this.f138329b.beginTransaction().hide(this.f138328a.get(i)).commitAllowingStateLoss();
    }
}
