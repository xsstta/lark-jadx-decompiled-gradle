package com.ss.android.lark.todo.impl.features.detail.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/common/InterceptScrollContainer;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "disableParentTouch", "", "getDisableParentTouch", "()Z", "setDisableParentTouch", "(Z)V", "interceptTouch", "getInterceptTouch", "setInterceptTouch", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InterceptScrollContainer extends ConstraintLayout {

    /* renamed from: a */
    private boolean f139909a;

    /* renamed from: b */
    private boolean f139910b;

    public final boolean getDisableParentTouch() {
        return this.f139909a;
    }

    public final boolean getInterceptTouch() {
        return this.f139910b;
    }

    public final void setDisableParentTouch(boolean z) {
        this.f139909a = z;
    }

    public final void setInterceptTouch(boolean z) {
        this.f139910b = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InterceptScrollContainer(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(this.f139909a);
        if (this.f139910b) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InterceptScrollContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InterceptScrollContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
