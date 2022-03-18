package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.calendar.impl.features.common.widget.scrollview.MutableScrollView;

/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.a */
public class C30165a {

    /* renamed from: a */
    final int f75260a = -1;

    /* renamed from: b */
    private MutableScrollView f75261b;

    /* renamed from: c */
    private float f75262c;

    /* renamed from: d */
    private float f75263d;

    /* renamed from: e */
    private float f75264e;

    /* renamed from: f */
    private int f75265f;

    /* renamed from: g */
    private int f75266g;

    /* renamed from: h */
    private int[] f75267h;

    /* renamed from: a */
    public void mo108766a(int i) {
        if (this.f75265f == -1) {
            this.f75265f = i;
        }
    }

    public C30165a(MutableScrollView mutableScrollView) {
        this.f75261b = mutableScrollView;
        this.f75264e = 1.0f / ((float) mutableScrollView.getMeasuredHeight());
        this.f75266g = 1;
        this.f75265f = -1;
        this.f75262c = 0.3f;
        this.f75263d = 1.0f / 0.3f;
        int[] iArr = new int[2];
        this.f75267h = iArr;
        mutableScrollView.getLocationInWindow(iArr);
    }

    /* renamed from: b */
    public void mo108767b(int i) {
        float f = (((float) (i - this.f75267h[1])) * this.f75264e) - 0.5f;
        int signum = ((int) Math.signum(f)) * UIUtils.dp2px(this.f75261b.getContext(), Math.max((float) BitmapDescriptorFactory.HUE_RED, this.f75262c - (0.5f - Math.abs(f))) * this.f75263d * 25.0f);
        int scrollY = this.f75261b.getScrollY();
        if (Math.abs(i - this.f75265f) > this.f75266g) {
            scrollY = this.f75261b.getScrollY() + signum;
        }
        this.f75261b.mo113347a(0, scrollY);
    }
}
