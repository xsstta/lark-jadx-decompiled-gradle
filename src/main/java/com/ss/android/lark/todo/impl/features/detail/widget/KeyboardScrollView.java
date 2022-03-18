package com.ss.android.lark.todo.impl.features.detail.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/widget/KeyboardScrollView;", "Landroid/widget/HorizontalScrollView;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mOnScrollChangeListener", "Lcom/ss/android/lark/todo/impl/features/detail/widget/KeyboardScrollView$OnScrollChangeListener;", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "setOnScrollChangeListener", "listener", "OnScrollChangeListener", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class KeyboardScrollView extends HorizontalScrollView {

    /* renamed from: a */
    private OnScrollChangeListener f140208a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/widget/KeyboardScrollView$OnScrollChangeListener;", "", "onDrawChange", "", "view", "Lcom/ss/android/lark/todo/impl/features/detail/widget/KeyboardScrollView;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.widget.KeyboardScrollView$a */
    public interface OnScrollChangeListener {
        /* renamed from: a */
        void mo192707a(KeyboardScrollView keyboardScrollView);
    }

    public final void setOnScrollChangeListener(OnScrollChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f140208a = aVar;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        OnScrollChangeListener aVar = this.f140208a;
        if (aVar != null) {
            aVar.mo192707a(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyboardScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attributeSet");
    }
}
