package com.ss.android.lark.pin.impl;

import android.graphics.Canvas;
import com.larksuite.component.ui.layout.ILKUILayout;
import com.larksuite.component.ui.layout.plus.BaseLKUIPlus;
import com.ss.android.lark.pin.impl.statistics.PinAppreciableHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/pin/impl/ChatPinDrawEventPlus;", "Lcom/larksuite/component/ui/layout/plus/BaseLKUIPlus;", "layout", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "(Lcom/larksuite/component/ui/layout/ILKUILayout;)V", "isFirstRender", "", "onDelegateDispatchDrawEnd", "", "canvas", "Landroid/graphics/Canvas;", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatPinDrawEventPlus extends BaseLKUIPlus {
    private boolean isFirstRender = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatPinDrawEventPlus(ILKUILayout iLKUILayout) {
        super(iLKUILayout);
        Intrinsics.checkParameterIsNotNull(iLKUILayout, "layout");
    }

    @Override // com.larksuite.component.ui.layout.plus.BaseLKUIPlus
    public void onDelegateDispatchDrawEnd(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        if (this.isFirstRender) {
            this.isFirstRender = false;
            PinAppreciableHitPoint.f128210a.mo177430g();
        }
    }
}
