package com.ss.android.vc.meeting.module.sketch.render.canvas;

import android.os.Handler;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.sketch.AbsSketchControl;
import com.ss.android.vc.meeting.module.sketch.render.canvas.CanvasSketchViewImpl;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/vc/meeting/module/sketch/render/canvas/CanvasSketchViewImpl$RenderThread$renderRunnable$1", "Ljava/lang/Runnable;", "run", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class CanvasSketchViewImpl$RenderThread$renderRunnable$1 implements Runnable {
    final /* synthetic */ CanvasSketchViewImpl.RenderThread this$0;

    public void run() {
        boolean z;
        AbsSketchControl ag;
        AbsSketchControl ag2;
        String str;
        String str2;
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        boolean onRender = this.this$0.onRender();
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (onRender) {
            Handler handler = this.this$0.mHandler;
            if (handler != null) {
                CanvasSketchViewImpl$RenderThread$renderRunnable$1 canvasSketchViewImpl$RenderThread$renderRunnable$1 = this;
                if (currentTimeMillis2 < this.this$0.drawInterval) {
                    j = this.this$0.drawInterval - currentTimeMillis2;
                } else {
                    j = 0;
                }
                handler.postDelayed(canvasSketchViewImpl$RenderThread$renderRunnable$1, j);
            }
        } else if (this.this$0.isAlive()) {
            C60700b.m235851b("[Sketch] [CanvasSketchViewImpl]", "[onRender]", "not valid, but thread is alive!");
            C61303k meeting = CanvasSketchViewImpl.access$getSketchView$p(this.this$0.this$0).getMeeting();
            boolean z2 = true;
            boolean z3 = false;
            if (!(meeting == null || (ag2 = meeting.ag()) == null || (str = ag2.curShareScreenId) == null || (str2 = str) == null || str2.length() == 0)) {
                z2 = false;
            }
            C61303k meeting2 = CanvasSketchViewImpl.access$getSketchView$p(this.this$0.this$0).getMeeting();
            if (meeting2 != null) {
                z = meeting2.mo212065n();
            } else {
                z = false;
            }
            C61303k meeting3 = CanvasSketchViewImpl.access$getSketchView$p(this.this$0.this$0).getMeeting();
            if (!(meeting3 == null || (ag = meeting3.ag()) == null)) {
                z3 = ag.isInSketch();
            }
            if (!z || z2 || !z3) {
                C60700b.m235864f("[Sketch] [CanvasSketchViewImpl]", "[onRender2]", "no screen share, stop RenderThread, isOnTheCall = " + z + ", isNotScreen = " + z2 + ", isInSketch = " + z3);
                this.this$0.quit();
                return;
            }
            Handler handler2 = this.this$0.mHandler;
            if (handler2 != null) {
                handler2.postDelayed(this, 100);
            }
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    CanvasSketchViewImpl$RenderThread$renderRunnable$1(CanvasSketchViewImpl.RenderThread renderThread) {
        this.this$0 = renderThread;
    }
}
