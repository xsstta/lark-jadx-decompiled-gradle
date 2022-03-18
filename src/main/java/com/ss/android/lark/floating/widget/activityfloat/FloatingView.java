package com.ss.android.lark.floating.widget.activityfloat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.lark.floating.data.FloatConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/floating/widget/activityfloat/FloatingView;", "Lcom/ss/android/lark/floating/widget/activityfloat/AbstractDragFloatingView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "getLayoutId", "", "()Ljava/lang/Integer;", "renderView", "", "view", "Landroid/view/View;", "setFloatConfig", "config", "Lcom/ss/android/lark/floating/data/FloatConfig;", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class FloatingView extends AbstractDragFloatingView {
    @Override // com.ss.android.lark.floating.widget.activityfloat.AbstractDragFloatingView
    /* renamed from: a */
    public void mo140273a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
    }

    @Override // com.ss.android.lark.floating.widget.activityfloat.AbstractDragFloatingView
    public Integer getLayoutId() {
        return getConfig().mo140184b();
    }

    public final void setFloatConfig(FloatConfig aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "config");
        setConfig(aVar);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        mo140272a(context);
        requestLayout();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FloatingView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
