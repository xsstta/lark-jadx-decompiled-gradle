package com.larksuite.framework.flyfish;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.yoga.android.YogaLayout;
import com.larksuite.framework.flyfish.util.ViewUtil;
import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ0\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0014J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0014¨\u0006\u0014"}, d2 = {"Lcom/larksuite/framework/flyfish/FlyFishYogaLayout;", "Lcom/facebook/yoga/android/YogaLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onLayout", "", "changed", "", "l", "t", "r", C63954b.f161494a, "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "flyfish_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class FlyFishYogaLayout extends YogaLayout {
    public FlyFishYogaLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public FlyFishYogaLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.yoga.android.YogaLayout
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.yoga.android.YogaLayout
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        } else if (getChildCount() == 0) {
            setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        } else {
            throw new IllegalArgumentException("MeasureSpec mode must be MeasureSpec.EXACTLY, now is w:" + ViewUtil.f64301a.mo92372a(i) + ", h:" + ViewUtil.f64301a.mo92372a(i2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlyFishYogaLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlyFishYogaLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
