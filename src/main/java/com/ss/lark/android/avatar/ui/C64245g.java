package com.ss.lark.android.avatar.ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.lark.android.avatar.ui.g */
public class C64245g extends FragmentPagerAdapter {

    /* renamed from: a */
    List<Fragment> f162425a = new ArrayList();

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f162425a.size();
    }

    public C64245g(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    /* renamed from: a */
    public void mo222702a(Fragment fragment) {
        if (!this.f162425a.contains(fragment)) {
            this.f162425a.add(fragment);
        }
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        if (i < 0 || i >= this.f162425a.size()) {
            return null;
        }
        return this.f162425a.get(i);
    }
}
