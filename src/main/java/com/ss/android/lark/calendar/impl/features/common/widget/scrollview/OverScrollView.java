package com.ss.android.lark.calendar.impl.features.common.widget.scrollview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.larksuite.framework.utils.Reflect;
import com.ss.android.lark.calendar.impl.utils.ao;

public class OverScrollView extends MutableScrollView {

    /* renamed from: c */
    private int f79057c;

    /* renamed from: d */
    private int f79058d;

    /* renamed from: e */
    private boolean f79059e;

    /* renamed from: f */
    private boolean f79060f;

    /* renamed from: g */
    private boolean f79061g;

    /* renamed from: h */
    private Reflect f79062h;

    /* renamed from: i */
    private OverScroller f79063i;

    /* renamed from: a */
    private int m116815a(int i, boolean z) {
        if (!z) {
            return 0;
        }
        return i;
    }

    /* renamed from: c */
    public void mo113352c() {
        this.f79059e = false;
    }

    public int getTopOverScrollDistance() {
        return this.f79057c;
    }

    public void computeScroll() {
        super.computeScroll();
        m116822f();
    }

    /* renamed from: d */
    private boolean m116820d() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0) {
            return true;
        }
        if (overScrollMode != 1 || computeVerticalScrollRange() <= computeVerticalScrollExtent()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m116821e() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0) {
            return true;
        }
        if (overScrollMode != 1 || computeHorizontalScrollRange() <= computeHorizontalScrollExtent()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private void m116822f() {
        if (this.f79063i.isFinished() && this.f79055b != null) {
            this.f79055b.mo112685b();
        }
    }

    public void setBottomOverScrollDistance(int i) {
        this.f79058d = i;
    }

    public void setTopOverScrollDistance(int i) {
        this.f79057c = i;
    }

    public OverScrollView(Context context) {
        super(context);
        m116816a(context);
    }

    /* renamed from: a */
    private void m116817a(boolean z) {
        if (!z) {
            this.f79057c = 0;
            this.f79058d = 0;
        }
    }

    /* renamed from: a */
    private void m116816a(Context context) {
        this.f79063i = new OverScroller(context);
        try {
            Reflect a = Reflect.m94918a(this);
            this.f79062h = a;
            a.mo93334a("mScroller", this.f79063i);
        } catch (Exception unused) {
        }
        ao.m125228a((ScrollView) this);
        setOverScrollMode(1);
    }

    /* renamed from: a */
    private boolean m116818a(int[] iArr) {
        if (iArr[0] > iArr[1]) {
            iArr[0] = iArr[1];
        } else if (iArr[0] >= iArr[2]) {
            return false;
        } else {
            iArr[0] = iArr[2];
        }
        return true;
    }

    public OverScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m116816a(context);
    }

    /* renamed from: b */
    private boolean m116819b(int i, boolean z) {
        if (z || this.f79059e || i >= 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f79061g = true;
        super.onLayout(z, i, i2, i3, i4);
        this.f79061g = false;
    }

    /* access modifiers changed from: protected */
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        if (m116819b(i4, z)) {
            i2 = 0;
        }
        int i9 = i3 + i;
        int a = m116815a(i7, m116821e());
        int i10 = i4 + i2;
        m116817a(m116820d());
        int i11 = -a;
        int i12 = a + i5;
        int i13 = -this.f79057c;
        int i14 = this.f79058d + i6;
        int[] iArr = {i9, i12, i11};
        boolean a2 = m116818a(iArr);
        int[] iArr2 = {i10, i14, i13};
        boolean a3 = m116818a(iArr2);
        onOverScrolled(iArr[0], iArr2[0], a2, a3);
        if (iArr2[0] <= i13) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f79060f = z2;
        if (a2 || a3) {
            return true;
        }
        return false;
    }
}
