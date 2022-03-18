package com.larksuite.framework.flyfish.core;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.flyfish.util.ViewUtil;
import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J0\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0014J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0014¨\u0006\u001b"}, d2 = {"Lcom/larksuite/framework/flyfish/core/GroupView;", "Landroid/view/ViewGroup;", "Lcom/larksuite/framework/flyfish/core/IViewOperateSupport;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "addViewNoLayoutRequest", "", "child", "Landroid/view/View;", "index", "params", "Landroid/view/ViewGroup$LayoutParams;", "onLayout", "changed", "", "l", "t", "r", C63954b.f161494a, "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "flyfish_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class GroupView extends ViewGroup implements IViewOperateSupport {
    public GroupView(Context context) {
        this(context, null, 0, 6, null);
    }

    public GroupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        throw new IllegalArgumentException("MeasureSpec mode must be MeasureSpec.EXACTLY, now is w:" + ViewUtil.f64301a.mo92372a(i) + ", h:" + ViewUtil.f64301a.mo92372a(i2));
    }

    @Override // com.larksuite.framework.flyfish.core.IViewOperateSupport
    /* renamed from: a */
    public void mo92354a(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkParameterIsNotNull(view, "child");
        addViewInLayout(view, i, layoutParams, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GroupView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
