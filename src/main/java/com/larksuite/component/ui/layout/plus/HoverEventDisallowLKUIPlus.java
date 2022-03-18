package com.larksuite.component.ui.layout.plus;

import android.view.MotionEvent;
import com.larksuite.component.ui.layout.ILKUILayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/larksuite/component/ui/layout/plus/HoverEventDisallowLKUIPlus;", "Lcom/larksuite/component/ui/layout/plus/BaseInnerPlus;", "layout", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "(Lcom/larksuite/component/ui/layout/ILKUILayout;)V", "getPlusType", "Lcom/larksuite/component/ui/layout/plus/InnerPlusType;", "onDelegateInterceptHoverEvent", "", "event", "Landroid/view/MotionEvent;", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class HoverEventDisallowLKUIPlus extends BaseInnerPlus {
    @Override // com.larksuite.component.ui.layout.plus.BaseInnerPlus
    public InnerPlusType getPlusType() {
        return InnerPlusType.HOVER_EVENT_DISALLOW;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HoverEventDisallowLKUIPlus(ILKUILayout iLKUILayout) {
        super(iLKUILayout);
        Intrinsics.checkParameterIsNotNull(iLKUILayout, "layout");
    }

    @Override // com.larksuite.component.ui.layout.plus.BaseLKUIPlus
    public Boolean onDelegateInterceptHoverEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        return true;
    }
}
