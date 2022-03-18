package com.ss.android.vc.meeting.module.subtitle;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import com.airbnb.lottie.AbstractC1810j;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.model.C1847d;
import com.airbnb.lottie.p072d.AbstractC1797e;
import com.airbnb.lottie.p072d.C1794b;
import com.larksuite.suite.R;

public class LottieLoadingView extends LottieAnimationView {
    public LottieLoadingView(Context context) {
        super(context);
        m247148a(null);
    }

    public void setColor(int i) {
        addValueCallback(new C1847d("**"), AbstractC1810j.f6196C, new AbstractC1797e(i) {
            /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$LottieLoadingView$cfGr9D9VwVlWxd8IkJTa3QkCl8 */
            public final /* synthetic */ int f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.airbnb.lottie.p072d.AbstractC1797e
            public final Object getValue(C1794b bVar) {
                return LottieLoadingView.m271414lambda$cfGr9D9VwVlWxd8IkJTa3QkCl8(this.f$0, bVar);
            }
        });
    }

    /* renamed from: a */
    private void m247148a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.view_color});
        addValueCallback(new C1847d("**"), AbstractC1810j.f6196C, new AbstractC1797e(obtainStyledAttributes.getColor(0, -1)) {
            /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$LottieLoadingView$YdVmElVtYyqyba55q4JxLWAxY */
            public final /* synthetic */ int f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.airbnb.lottie.p072d.AbstractC1797e
            public final Object getValue(C1794b bVar) {
                return LottieLoadingView.m271413lambda$YdVmElVtYyqyba55q4JxLWAxY(this.f$0, bVar);
            }
        });
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ColorFilter m247147a(int i, C1794b bVar) {
        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ ColorFilter m247149b(int i, C1794b bVar) {
        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    public LottieLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m247148a(attributeSet);
    }

    public LottieLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m247148a(attributeSet);
    }
}
