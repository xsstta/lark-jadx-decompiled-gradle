package com.ss.android.vc.meeting.module.reaction.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0012B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/vc/meeting/module/reaction/widget/TouchControlPtrFrameLayout;", "Lcom/ss/android/lark/widget/ptr/LKUIPtrClassicFrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mPtrDependency", "Lcom/ss/android/vc/meeting/module/reaction/widget/TouchControlPtrFrameLayout$PtrDependency;", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "setDependency", "", "dependency", "PtrDependency", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class TouchControlPtrFrameLayout extends LKUIPtrClassicFrameLayout {

    /* renamed from: a */
    private PtrDependency f158284a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/vc/meeting/module/reaction/widget/TouchControlPtrFrameLayout$PtrDependency;", "", "getVisibleFeedViewMaxWidth", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.widget.TouchControlPtrFrameLayout$a */
    public interface PtrDependency {
        /* renamed from: a */
        int mo217225a();
    }

    public TouchControlPtrFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public TouchControlPtrFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setDependency(PtrDependency aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f158284a = aVar;
    }

    @Override // com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        if (motionEvent.getAction() == 0) {
            PtrDependency aVar = this.f158284a;
            if (aVar != null) {
                i = aVar.mo217225a();
            } else {
                i = Integer.MAX_VALUE;
            }
            if (motionEvent.getX() > ((float) i)) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchControlPtrFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TouchControlPtrFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
