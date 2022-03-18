package com.ss.android.vc.meeting.module.sketch.render.gl.impl;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/vc/meeting/module/sketch/render/gl/impl/GLSketchViewImpl$markRenderRunnable$1", "Ljava/lang/Runnable;", "run", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class GLSketchViewImpl$markRenderRunnable$1 implements Runnable {
    final /* synthetic */ GLSketchViewImpl this$0;

    public void run() {
        this.this$0.onRenderMark();
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    GLSketchViewImpl$markRenderRunnable$1(GLSketchViewImpl gLSketchViewImpl) {
        this.this$0 = gLSketchViewImpl;
    }
}
