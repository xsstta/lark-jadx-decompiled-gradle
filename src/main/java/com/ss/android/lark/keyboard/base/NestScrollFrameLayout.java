package com.ss.android.lark.keyboard.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u000e\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/keyboard/base/NestScrollFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "startX", "startY", "targetView", "Landroid/view/ViewGroup;", "getTargetView", "()Landroid/view/ViewGroup;", "setTargetView", "(Landroid/view/ViewGroup;)V", "attach", "", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class NestScrollFrameLayout extends FrameLayout {

    /* renamed from: a */
    private ViewGroup f103294a;

    /* renamed from: b */
    private int f103295b;

    /* renamed from: c */
    private int f103296c;

    public final ViewGroup getTargetView() {
        return this.f103294a;
    }

    public final void setTargetView(ViewGroup viewGroup) {
        this.f103294a = viewGroup;
    }

    /* renamed from: a */
    public final void mo146855a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "targetView");
        this.f103294a = viewGroup;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NestScrollFrameLayout(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r0 != 3) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0052
            int r0 = r5.getAction()
            r1 = 1
            if (r0 == 0) goto L_0x003d
            if (r0 == r1) goto L_0x0034
            r2 = 2
            if (r0 == r2) goto L_0x0012
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0052
        L_0x0012:
            float r0 = r5.getX()
            int r0 = (int) r0
            float r2 = r5.getY()
            int r2 = (int) r2
            int r3 = r4.f103295b
            int r0 = r0 - r3
            int r0 = java.lang.Math.abs(r0)
            int r3 = r4.f103296c
            int r2 = r2 - r3
            int r2 = java.lang.Math.abs(r2)
            if (r0 <= r2) goto L_0x0052
            android.view.ViewGroup r0 = r4.f103294a
            if (r0 == 0) goto L_0x0052
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L_0x0052
        L_0x0034:
            android.view.ViewGroup r0 = r4.f103294a
            if (r0 == 0) goto L_0x0052
            r1 = 0
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L_0x0052
        L_0x003d:
            float r0 = r5.getX()
            int r0 = (int) r0
            r4.f103295b = r0
            float r0 = r5.getY()
            int r0 = (int) r0
            r4.f103296c = r0
            android.view.ViewGroup r0 = r4.f103294a
            if (r0 == 0) goto L_0x0052
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x0052:
            boolean r5 = super.dispatchTouchEvent(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.keyboard.base.NestScrollFrameLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NestScrollFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestScrollFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f103295b = -1;
        this.f103296c = -1;
    }
}
