package net.lucode.hackware.magicindicator;

import androidx.viewpager.widget.ViewPager;

/* renamed from: net.lucode.hackware.magicindicator.c */
public class C69634c {
    /* renamed from: a */
    public static void m267483a(final MagicIndicator magicIndicator, ViewPager viewPager) {
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class net.lucode.hackware.magicindicator.C69634c.C696351 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                magicIndicator.mo243175b(i);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                magicIndicator.mo243173a(i);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                magicIndicator.mo243174a(i, f, i2);
            }
        });
    }
}
