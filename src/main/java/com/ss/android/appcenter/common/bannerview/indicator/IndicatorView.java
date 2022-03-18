package com.ss.android.appcenter.common.bannerview.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.ss.android.appcenter.common.bannerview.indicator.base.BaseIndicatorView;
import com.ss.android.appcenter.common.bannerview.indicator.drawer.BaseDrawer;
import com.ss.android.appcenter.common.bannerview.indicator.drawer.DrawerProxy;
import com.ss.android.appcenter.common.bannerview.indicator.option.IndicatorOptions;
import com.ss.android.appcenter.common.bannerview.indicator.p1293b.C28139a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J0\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0014J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0014J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u000e\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/appcenter/common/bannerview/indicator/IndicatorView;", "Lcom/ss/android/appcenter/common/bannerview/indicator/base/BaseIndicatorView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mDrawerProxy", "Lcom/ss/android/appcenter/common/bannerview/indicator/drawer/DrawerProxy;", "notifyDataChanged", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onLayout", "changed", "", "left", "top", "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "rotateCanvas", "setIndicatorOptions", "options", "Lcom/ss/android/appcenter/common/bannerview/indicator/option/IndicatorOptions;", "setOrientation", "orientation", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class IndicatorView extends BaseIndicatorView {

    /* renamed from: a */
    private DrawerProxy f70497a;

    public IndicatorView(Context context) {
        this(context, null, 0, 6, null);
    }

    public IndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.ss.android.appcenter.common.bannerview.indicator.base.IIndicator, com.ss.android.appcenter.common.bannerview.indicator.base.BaseIndicatorView
    /* renamed from: a */
    public void mo100200a() {
        this.f70497a = new DrawerProxy(getMIndicatorOptions());
        super.mo100200a();
    }

    public final void setOrientation(int i) {
        getMIndicatorOptions().mo100227a(i);
    }

    @Override // com.ss.android.appcenter.common.bannerview.indicator.base.IIndicator, com.ss.android.appcenter.common.bannerview.indicator.base.BaseIndicatorView
    public void setIndicatorOptions(IndicatorOptions bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "options");
        super.setIndicatorOptions(bVar);
        this.f70497a.mo100220a(bVar);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDraw(canvas);
        m102971a(canvas);
        this.f70497a.mo100217a(canvas);
    }

    /* renamed from: a */
    private final void m102971a(Canvas canvas) {
        if (getMIndicatorOptions().mo100224a() == 1) {
            canvas.rotate(90.0f, ((float) getWidth()) / 2.0f, ((float) getWidth()) / 2.0f);
        } else if (getMIndicatorOptions().mo100224a() == 3) {
            canvas.rotate(180.0f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        BaseDrawer.MeasureResult a = this.f70497a.mo100207a(i, i2);
        setMeasuredDimension(a.mo100214a(), a.mo100216b());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        C28139a.m103015a(context, attributeSet, getMIndicatorOptions());
        this.f70497a = new DrawerProxy(getMIndicatorOptions());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f70497a.mo100221a(z, i, i2, i3, i4);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IndicatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
