package com.ss.android.lark.moments.impl.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fH\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/ScrollerConflictPtrFrameLayout;", "Lcom/ss/android/lark/widget/ptr/LKUIPtrClassicFrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "disallowInterceptTouchEvent", "", "dispatchTouchEvent", "e", "Landroid/view/MotionEvent;", "requestDisallowInterceptTouchEvent", "", "disallowIntercept", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ScrollerConflictPtrFrameLayout extends LKUIPtrClassicFrameLayout {

    /* renamed from: a */
    private boolean f119276a;

    public ScrollerConflictPtrFrameLayout(Context context) {
        super(context);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        this.f119276a = z;
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "e");
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            requestDisallowInterceptTouchEvent(false);
        }
        if (this.f119276a) {
            return dispatchTouchEventSupper(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public ScrollerConflictPtrFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScrollerConflictPtrFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
