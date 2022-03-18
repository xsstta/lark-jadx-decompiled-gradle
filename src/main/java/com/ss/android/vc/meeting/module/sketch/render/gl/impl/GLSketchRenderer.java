package com.ss.android.vc.meeting.module.sketch.render.gl.impl;

import com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public interface GLSketchRenderer extends BaseGLTextureView.Renderer {
    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView.Renderer
    void onDrawFrame(GL10 gl10);

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView.Renderer
    void onSurfaceChanged(GL10 gl10, int i, int i2);

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView.Renderer
    void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig);

    void onSurfaceDestroy();
}
