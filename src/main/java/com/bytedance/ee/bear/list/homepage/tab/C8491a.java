package com.bytedance.ee.bear.list.homepage.tab;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.homepage.tab.a */
public class C8491a extends FragmentPagerAdapter {

    /* renamed from: a */
    private final Context f22930a;

    /* renamed from: b */
    private final List<C8493c> f22931b;

    /* renamed from: c */
    private Fragment f22932c;

    /* renamed from: a */
    public Fragment mo33167a() {
        return this.f22932c;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f22931b.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        return this.f22930a.getString(this.f22931b.get(i).mo33171b());
    }

    /* renamed from: a */
    public C8493c mo33168a(int i) {
        C13479a.m54764b("HomeTabAdapter", "getTabInfo()...position = " + i);
        if (C13657b.m55420a(i, this.f22931b)) {
            return this.f22931b.get(i);
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        C13479a.m54764b("HomeTabAdapter", "getItem()...position = " + i);
        if (!C13657b.m55420a(i, this.f22931b)) {
            return null;
        }
        return Fragment.instantiate(this.f22930a, this.f22931b.get(i).mo33172c());
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.FragmentPagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof Fragment) {
            this.f22932c = (Fragment) obj;
        }
        super.setPrimaryItem(viewGroup, i, obj);
    }

    public C8491a(FragmentManager fragmentManager, Context context, List<C8493c> list) {
        super(fragmentManager);
        this.f22930a = context;
        this.f22931b = list;
        C13479a.m54764b("HomeTabAdapter", "HomeTabAdapter()...mTabInfoList = " + list);
    }
}
