package com.ss.android.vc.meeting.module.sketch;

import android.content.Context;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.sketch.render.canvas.CanvasSketchViewImpl;
import com.ss.android.vc.meeting.module.sketch.render.gl.impl.GLRenderImpl;
import com.ss.android.vc.meeting.module.sketch.render.gl.impl.GLSketchViewImpl;
import com.ss.android.vc.meeting.module.sketch.render.gl.model.GLRenderModel;

public class SketchViewImplFactory {
    public static ISketchViewImpl createSketchViewImpl(Context context, SketchView sketchView, C61303k kVar, boolean z) {
        C60700b.m235851b("[Sketch] [SketchViewImplFactory]", "[createSketchViewImpl]", "[gl]" + z);
        if (z) {
            GLSketchViewImpl gLSketchViewImpl = new GLSketchViewImpl(context);
            gLSketchViewImpl.setSketchView(sketchView);
            gLSketchViewImpl.setRenderer(new GLRenderImpl(context, (GLRenderModel) kVar.ag().getRenderModel()));
            return gLSketchViewImpl;
        }
        CanvasSketchViewImpl canvasSketchViewImpl = new CanvasSketchViewImpl(context);
        canvasSketchViewImpl.setSketchView(sketchView);
        canvasSketchViewImpl.setRenderModel(kVar.ag().getRenderModel());
        return canvasSketchViewImpl;
    }
}
