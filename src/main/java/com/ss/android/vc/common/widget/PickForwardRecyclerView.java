package com.ss.android.vc.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.lark.widget.recyclerview.FpsRecyclerView;
import com.ss.android.vc.common.p3083e.C60773o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0014¨\u0006\r"}, d2 = {"Lcom/ss/android/vc/common/widget/PickForwardRecyclerView;", "Lcom/ss/android/lark/widget/recyclerview/FpsRecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onMeasure", "", "wSpec", "hSpec", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class PickForwardRecyclerView extends FpsRecyclerView {
    public PickForwardRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public PickForwardRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(C60773o.m236115a(88.0d), Integer.MIN_VALUE));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickForwardRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PickForwardRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
