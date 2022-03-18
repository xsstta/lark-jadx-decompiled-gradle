package com.ss.android.vc.meeting.module.sketch.render.gl.renderer;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.GLES20;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.sketch.render.AbstractShapeRender;
import com.ss.android.vc.meeting.module.sketch.render.gl.mm.GLMemoryManager;
import com.ss.android.vc.meeting.module.sketch.render.gl.model.GLRenderModel;
import com.ss.android.vc.meeting.module.sketch.render.gl.shape.BaseAssembler;
import com.ss.android.vc.meeting.module.sketch.render.gl.util.GLUtils;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class CompoundRenderer extends BaseRenderer {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.renderer.BaseRenderer
    public String getFragmentShaderAssetPath() {
        return "frag.glsl";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.renderer.BaseRenderer
    public String getVertexShaderAssetPath() {
        return "vert.glsl";
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.renderer.BaseRenderer
    public void onDrawFrame(GL10 gl10) {
        super.onDrawFrame(gl10);
        GLES20.glUseProgram(this.mProgram);
        GLES20.glUniform1f(GLES20.glGetUniformLocation(this.mProgram, "u_AxisScale"), this.mModel.getAxisScale());
        GLES20.glUniform3f(GLES20.glGetUniformLocation(this.mProgram, "u_Transform"), this.mModel.getCurrentTranslate().x, this.mModel.getCurrentTranslate().y, this.mModel.getCurrentScale());
        GLES20.glUniformMatrix4fv(GLES20.glGetUniformLocation(this.mProgram, "u_Matrix"), 1, false, this.mModel.getCurrentMatrix(), 0);
        GLES20.glUniform1f(GLES20.glGetUniformLocation(this.mProgram, "u_BorderWidth"), this.mModel.getLineBorderWidth() / this.mModel.getCurrentScale());
        GLES20.glUniform1f(GLES20.glGetUniformLocation(this.mProgram, "u_WindowWidth"), this.mModel.getViewWidth());
        GLES20.glUniform1f(GLES20.glGetUniformLocation(this.mProgram, "u_WindowHeight"), this.mModel.getViewHeight());
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.mModel) {
            boolean andResetViewportChanged = this.mModel.getAndResetViewportChanged();
            boolean staticChanged = this.mModel.getStaticChanged();
            if (andResetViewportChanged || staticChanged) {
                C60700b.m235851b("[Sketch] [CompoundRenderer]", "[onDrawFrame]", "redraw static:  [viewportChanged]" + andResetViewportChanged + "  [staticChanged]" + staticChanged + "  [count]" + this.mModel.getStaticData().size());
                this.mMemoryManager.setWriteMode(GLMemoryManager.WriteMode.WRITE_ARCHIVE);
                this.mMemoryManager.resetMemory();
                boolean z = false;
                for (AbstractShapeRender abstractShapeRender : this.mModel.getStaticData().values()) {
                    if (dumpShapeVertex(abstractShapeRender, this.mMemoryManager) == -1) {
                        this.mModel.removeStatic(abstractShapeRender.getId(), false);
                        z = true;
                    }
                }
                if (!z) {
                    this.mModel.setStaticChanged(false);
                }
            }
            if (!this.mModel.getPendingStaticData().isEmpty()) {
                C60700b.m235851b("[Sketch] [CompoundRenderer]", "[onDrawFrame2]", "pending static not empty: [count]" + this.mModel.getPendingStaticData().size());
                this.mMemoryManager.setWriteMode(GLMemoryManager.WriteMode.WRITE_ARCHIVE);
                for (AbstractShapeRender abstractShapeRender2 : this.mModel.getPendingStaticData().values()) {
                    if (dumpShapeVertex(abstractShapeRender2, this.mMemoryManager) == -1) {
                        this.mModel.removeStatic(abstractShapeRender2.getId(), false);
                    } else {
                        this.mModel.getStaticData().put(abstractShapeRender2.getId(), abstractShapeRender2);
                    }
                }
                this.mModel.setStaticChanged(true);
                this.mModel.getPendingStaticData().clear();
            }
            this.mMemoryManager.flush();
            this.mMemoryManager.setWriteMode(GLMemoryManager.WriteMode.WRITE_DYNAMIC);
            this.mMemoryManager.resetBuffer();
            for (AbstractShapeRender abstractShapeRender3 : this.mModel.getDynamicData().values()) {
                if (dumpShapeVertex(abstractShapeRender3, this.mMemoryManager) == -1) {
                    this.mModel.removeDynamic(abstractShapeRender3.getId());
                }
            }
            for (AbstractShapeRender abstractShapeRender4 : this.mModel.getVariateData().values()) {
                if (dumpShapeVertex(abstractShapeRender4, this.mMemoryManager) == -1) {
                    this.mModel.removeVariate(abstractShapeRender4.getId());
                }
            }
            this.mMemoryManager.flush();
        }
        if (GLUtils.debugGL()) {
            C60700b.m235851b("[Sketch] [CompoundRenderer]", "[onDrawFrame3]", "dump vertex cost: " + (System.currentTimeMillis() - currentTimeMillis));
        }
        int indexCount = this.mMemoryManager.indexCount();
        if (GLUtils.debugGL()) {
            C60700b.m235851b("[Sketch] [CompoundRenderer]", "[onDrawFrame4]", "index count: " + indexCount);
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.mProgram, "vPosition");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        GLES20.glVertexAttribPointer(glGetAttribLocation, 4, 5126, false, 60, 0);
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.mProgram, "vColor");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        GLES20.glVertexAttribPointer(glGetAttribLocation2, 4, 5126, false, 60, 16);
        int glGetAttribLocation3 = GLES20.glGetAttribLocation(this.mProgram, "vLineWidth");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation3);
        GLES20.glVertexAttribPointer(glGetAttribLocation3, 1, 5126, false, 60, 32);
        int glGetAttribLocation4 = GLES20.glGetAttribLocation(this.mProgram, "vPointIndicator");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation4);
        GLES20.glVertexAttribPointer(glGetAttribLocation4, 1, 5126, false, 60, 36);
        int glGetAttribLocation5 = GLES20.glGetAttribLocation(this.mProgram, "vZ");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation5);
        GLES20.glVertexAttribPointer(glGetAttribLocation5, 1, 5126, false, 60, 40);
        int glGetAttribLocation6 = GLES20.glGetAttribLocation(this.mProgram, "vCtrl");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation6);
        GLES20.glVertexAttribPointer(glGetAttribLocation6, 4, 5126, false, 60, 44);
        GLUtils.checkError();
        GLES20.glDrawElements(4, indexCount, 5125, 0);
        GLUtils.checkError();
        GLES20.glDisableVertexAttribArray(glGetAttribLocation);
        GLES20.glDisableVertexAttribArray(glGetAttribLocation2);
        GLES20.glDisableVertexAttribArray(glGetAttribLocation3);
        GLES20.glDisableVertexAttribArray(glGetAttribLocation4);
        GLES20.glDisableVertexAttribArray(glGetAttribLocation5);
        GLES20.glDisableVertexAttribArray(glGetAttribLocation6);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.renderer.BaseRenderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        super.onSurfaceCreated(gl10, eGLConfig);
    }

    private int dumpShapeVertex(AbstractShapeRender abstractShapeRender, GLMemoryManager gLMemoryManager) {
        if (!(abstractShapeRender instanceof BaseAssembler)) {
            return 0;
        }
        BaseAssembler baseAssembler = (BaseAssembler) abstractShapeRender;
        if (baseAssembler.valid()) {
            return baseAssembler.dumpTriangles(gLMemoryManager);
        }
        return 0;
    }

    public CompoundRenderer(Context context, GLRenderModel gLRenderModel, GLMemoryManager gLMemoryManager) {
        super(context, gLRenderModel, gLMemoryManager);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.renderer.BaseRenderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        float f;
        super.onSurfaceChanged(gl10, i, i2);
        float f2 = 1.0f;
        if (i > i2) {
            f2 = (((float) i) * 1.0f) / ((float) i2);
            f = 1.0f;
        } else {
            f = (((float) i2) * 1.0f) / ((float) i);
        }
        this.mModel.changeAxis(new PointF(f2, f), (float) i, (float) i2);
    }
}
