package com.ss.android.lark.mm.module.detail;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import com.ss.android.lark.mm.p2288b.C45855f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/Custom1PxView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "def", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class Custom1PxView extends View {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mm/module/detail/Custom1PxView$onDraw$1", "Landroid/view/Choreographer$FrameCallback;", "doFrame", "", "frameTimeNanos", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.Custom1PxView$a */
    public static final class Choreographer$FrameCallbackC45920a implements Choreographer.FrameCallback {
        Choreographer$FrameCallbackC45920a() {
        }

        public void doFrame(long j) {
            C45855f.m181663b("MmAppreciableDetailTracker", "doFrame");
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Choreographer.getInstance().postFrameCallback(new Choreographer$FrameCallbackC45920a());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Custom1PxView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
