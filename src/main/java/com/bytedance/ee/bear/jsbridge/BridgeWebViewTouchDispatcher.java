package com.bytedance.ee.bear.jsbridge;

import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0007J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/jsbridge/BridgeWebViewTouchDispatcher;", "", "()V", "mTouchListeners", "", "Landroid/view/View$OnTouchListener;", "addListener", "", "listener", "clearTouchListeners", "dispatchTouch", "", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "removeListener", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.jsbridge.f */
public final class BridgeWebViewTouchDispatcher {

    /* renamed from: a */
    private final List<View.OnTouchListener> f21368a = new ArrayList();

    /* renamed from: a */
    public final void mo30840a() {
        this.f21368a.clear();
    }

    /* renamed from: b */
    public final void mo30843b(View.OnTouchListener onTouchListener) {
        Intrinsics.checkParameterIsNotNull(onTouchListener, "listener");
        this.f21368a.remove(onTouchListener);
    }

    /* renamed from: a */
    public final void mo30841a(View.OnTouchListener onTouchListener) {
        Intrinsics.checkParameterIsNotNull(onTouchListener, "listener");
        if (!this.f21368a.contains(onTouchListener)) {
            this.f21368a.add(onTouchListener);
        }
    }

    /* renamed from: a */
    public final boolean mo30842a(View view, MotionEvent motionEvent) {
        for (View.OnTouchListener onTouchListener : this.f21368a) {
            if (onTouchListener.onTouch(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
