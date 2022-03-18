package com.ss.android.vc.meeting.module.sketch;

import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
public final class SketchRenderModel$eraseTimeOutShapesTask$1 implements Runnable {
    final /* synthetic */ SketchRenderModel this$0;

    SketchRenderModel$eraseTimeOutShapesTask$1(SketchRenderModel sketchRenderModel) {
        this.this$0 = sketchRenderModel;
    }

    public final void run() {
        this.this$0.getSketchControl().eraseTimeOutShapes();
    }
}
