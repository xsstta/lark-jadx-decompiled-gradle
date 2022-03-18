package com.ss.android.lark.calendar.impl.features.common.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.d */
public final class Vp2Helper implements Runnable {

    /* renamed from: a */
    public final Function2<Integer, Integer, Unit> f78877a;

    /* renamed from: b */
    private final ViewPager2 f78878b;

    /* renamed from: c */
    private final RecyclerView.Adapter<?> f78879c;

    /* renamed from: a */
    public final ViewPager2 mo113133a() {
        return this.f78878b;
    }

    public void run() {
        this.f78879c.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo113135a(long j) {
        Vp2Helper dVar = this;
        this.f78878b.removeCallbacks(dVar);
        this.f78878b.postDelayed(dVar, j);
    }

    /* renamed from: a */
    public final void mo113134a(int i) {
        int currentItem = this.f78878b.getCurrentItem();
        if (currentItem != i) {
            this.f78878b.endFakeDrag();
            ViewPager2 viewPager2 = this.f78878b;
            boolean z = true;
            if (viewPager2.getWidth() <= 0 || this.f78878b.getHeight() <= 0 || Math.abs(currentItem - i) != 1) {
                z = false;
            }
            viewPager2.setCurrentItem(i, z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.k<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public Vp2Helper(ViewPager2 viewPager2, RecyclerView.Adapter<?> adapter, Function2<? super Integer, ? super Integer, Unit> kVar) {
        Intrinsics.checkParameterIsNotNull(viewPager2, "vp");
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        Intrinsics.checkParameterIsNotNull(kVar, "pageSelectListener");
        this.f78878b = viewPager2;
        this.f78879c = adapter;
        this.f78877a = kVar;
        viewPager2.setAdapter(adapter);
        viewPager2.setOrientation(0);
        viewPager2.registerOnPageChangeCallback(new ViewPager2.AbstractC1603e(this) {
            /* class com.ss.android.lark.calendar.impl.features.common.widget.Vp2Helper.C312011 */

            /* renamed from: a */
            final /* synthetic */ Vp2Helper f78880a;

            /* renamed from: b */
            private int f78881b;

            {
                this.f78880a = r1;
                this.f78881b = r1.mo113133a().getCurrentItem();
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1603e
            public void onPageSelected(int i) {
                this.f78880a.f78877a.invoke(Integer.valueOf(this.f78881b), Integer.valueOf(i));
                this.f78881b = i;
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ void m116555a(Vp2Helper dVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 100;
        }
        dVar.mo113135a(j);
    }
}
