package com.bytedance.ee.bear.bitable.card.view.cell.attachment.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ee.util.p718t.C13749l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0014¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/view/AttachmentCoverItemLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class AttachmentCoverItemLayout extends FrameLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AttachmentCoverItemLayout(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AttachmentCoverItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int a = C13749l.m55738a(4);
        int a2 = C13749l.m55738a(2);
        setPadding(a2, a, a2, a);
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        super.onMeasure(makeMeasureSpec, ((a - a2) * 2) + makeMeasureSpec);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AttachmentCoverItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
