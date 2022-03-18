package com.ss.android.lark.ui.lkuiplus;

import android.view.DragEvent;
import android.view.ViewGroup;
import com.larksuite.component.ui.layout.ILKUILayout;
import com.larksuite.component.ui.layout.plus.BaseLKUIPlus;
import com.ss.android.lark.widget.drag.DragDropController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\nR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/ui/lkuiplus/DragDropLKUIPlus;", "Lcom/larksuite/component/ui/layout/plus/BaseLKUIPlus;", "layout", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "(Lcom/larksuite/component/ui/layout/ILKUILayout;)V", "mCurrentChatName", "", "mOnDragDropListener", "Lcom/ss/android/lark/widget/drag/DragDropController$OnDragDropListener;", "mStopConsumeDragEvent", "", "onDelegateDragEvent", "event", "Landroid/view/DragEvent;", "(Landroid/view/DragEvent;)Ljava/lang/Boolean;", "setCurrentChatName", "currentChatName", "setOnDragDropListener", "", "listener", "setStopConsumeDragEvent", "stopConsume", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
public final class DragDropLKUIPlus extends BaseLKUIPlus {
    private String mCurrentChatName;
    private DragDropController.OnDragDropListener mOnDragDropListener;
    private boolean mStopConsumeDragEvent;

    public final void setOnDragDropListener(DragDropController.OnDragDropListener aVar) {
        this.mOnDragDropListener = aVar;
    }

    public final void setStopConsumeDragEvent(boolean z) {
        this.mStopConsumeDragEvent = z;
    }

    public final DragDropLKUIPlus setCurrentChatName(String str) {
        DragDropLKUIPlus dragDropLKUIPlus = this;
        dragDropLKUIPlus.mCurrentChatName = str;
        return dragDropLKUIPlus;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragDropLKUIPlus(ILKUILayout iLKUILayout) {
        super(iLKUILayout);
        Intrinsics.checkParameterIsNotNull(iLKUILayout, "layout");
    }

    @Override // com.larksuite.component.ui.layout.plus.BaseLKUIPlus
    public Boolean onDelegateDragEvent(DragEvent dragEvent) {
        Intrinsics.checkParameterIsNotNull(dragEvent, "event");
        if (this.mStopConsumeDragEvent) {
            return super.onDelegateDragEvent(dragEvent);
        }
        if (this.mOnDragDropListener == null) {
            return super.onDelegateDragEvent(dragEvent);
        }
        DragDropController aVar = DragDropController.f143463a;
        ViewGroup layout = getLayout();
        String str = this.mCurrentChatName;
        DragDropController.OnDragDropListener aVar2 = this.mOnDragDropListener;
        if (aVar2 == null) {
            Intrinsics.throwNpe();
        }
        boolean a = aVar.mo197515a(layout, dragEvent, str, aVar2, true);
        if (a) {
            return Boolean.valueOf(a);
        }
        return super.onDelegateDragEvent(dragEvent);
    }
}
