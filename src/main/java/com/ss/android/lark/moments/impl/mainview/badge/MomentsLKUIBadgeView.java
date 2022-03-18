package com.ss.android.lark.moments.impl.mainview.badge;

import android.content.Context;
import android.util.AttributeSet;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0014J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/moments/impl/mainview/badge/MomentsLKUIBadgeView;", "Lcom/larksuite/component/ui/imageview/LKUIBadgeView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isSmallRedDot", "", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "setIsSmallRedDot", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MomentsLKUIBadgeView extends LKUIBadgeView {

    /* renamed from: b */
    private boolean f120255b;

    public MomentsLKUIBadgeView(Context context) {
        super(context);
    }

    public final void setIsSmallRedDot(boolean z) {
        this.f120255b = z;
    }

    public MomentsLKUIBadgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.ui.imageview.LKUIBadgeView
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f120255b) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsLKUIBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
