package com.ss.android.vc.meeting.module.sketch.render.gl.impl;

import android.content.Context;
import android.graphics.RectF;
import android.opengl.GLES20;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.sketch.render.gl.mm.GLMemoryManager;
import com.ss.android.vc.meeting.module.sketch.render.gl.model.GLRenderModel;
import com.ss.android.vc.meeting.module.sketch.render.gl.renderer.BaseRenderer;
import com.ss.android.vc.meeting.module.sketch.render.gl.renderer.CompoundRenderer;
import com.ss.android.vc.meeting.module.sketch.render.gl.util.GLUtils;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class GLRenderImpl implements GLSketchRenderer {
    private long lastLogTime = 0;
    private GLMemoryManager mBufferManager;
    private RectF mContentBound = new RectF();
    private Context mContext;
    private int mHeight;
    private long mLastRenderTime;
    private final GLRenderModel mModel;
    private List<BaseRenderer> mRenderers = new ArrayList(10);
    private int mWidth;
    private int scissorH;
    private int scissorW;
    private int scissorX;
    private int scissorY;

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.impl.GLSketchRenderer
    public void onSurfaceDestroy() {
        destroyGL();
    }

    public void destroyGL() {
        C60700b.m235851b("[Sketch] [GLRenderImpl]", "[destroyGL]", "destroyGL");
        this.mBufferManager.destroy();
    }

    public void initGL() {
        C60700b.m235851b("[Sketch] [GLRenderImpl]", "[initGL]", "initGL");
        this.mBufferManager.create();
        this.mRenderers.clear();
        this.mRenderers.add(new CompoundRenderer(this.mContext, this.mModel, this.mBufferManager));
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 1);
        GLES20.glEnable(2929);
        GLES20.glDepthFunc(MediaPlayer.MEDIA_PLAYER_OPTION_MODULE_ID);
        GLES20.glClearColor(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView.Renderer
    public void onContentBoundChanged(RectF rectF) {
        if (rectF == null || this.mWidth <= 0 || this.mHeight <= 0 || rectF.left >= rectF.right || rectF.top >= rectF.bottom) {
            C60700b.m235851b("[Sketch] [GLRenderImpl]", "[onContentBoundChanged]", "invalid param, bound = " + rectF + ", mWidth = " + this.mWidth + ", mHeight = " + this.mHeight);
            return;
        }
        this.scissorX = (int) rectF.left;
        this.scissorY = (int) ((((float) this.mHeight) - rectF.top) - (rectF.bottom - rectF.top));
        this.scissorW = (int) (rectF.right - rectF.left);
        this.scissorH = (int) (rectF.bottom - rectF.top);
        C60700b.m235851b("[Sketch] [GLRenderImpl]", "[onContentBoundChanged]", String.format("save scissor, x:%d, y:%d, w:%d, h:%d", Integer.valueOf(this.scissorX), Integer.valueOf(this.scissorY), Integer.valueOf(this.scissorW), Integer.valueOf(this.scissorH)));
        this.mContentBound = rectF;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView.Renderer, com.ss.android.vc.meeting.module.sketch.render.gl.impl.GLSketchRenderer
    public void onDrawFrame(GL10 gl10) {
        long currentTimeMillis = System.currentTimeMillis();
        if (GLUtils.debugGL() && currentTimeMillis - this.lastLogTime > 2000) {
            this.lastLogTime = currentTimeMillis;
        }
        long j = this.mLastRenderTime;
        long j2 = currentTimeMillis - j < 16 ? (16 - currentTimeMillis) + j : 0;
        if (j2 > 0) {
            try {
                Thread.sleep(j2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.mLastRenderTime = currentTimeMillis + j2;
        GLES20.glClear(16640);
        if (this.mModel.valid()) {
            this.mModel.prepareDrawingData();
            GLES20.glEnable(3089);
            if (this.scissorX < 0) {
                this.scissorX = 0;
            }
            if (this.scissorY < 0) {
                this.scissorY = 0;
            }
            int i = this.scissorX;
            int i2 = this.scissorW + i;
            int i3 = this.mWidth;
            if (i2 > i3) {
                this.scissorW = i3 - i;
            }
            int i4 = this.scissorY;
            int i5 = this.scissorH + i4;
            int i6 = this.mHeight;
            if (i5 > i6) {
                this.scissorH = i6 - i4;
            }
            GLES20.glScissor(i, i4, this.scissorW, this.scissorH);
            for (BaseRenderer baseRenderer : this.mRenderers) {
                baseRenderer.onDrawFrame(gl10);
            }
            GLES20.glDisable(3089);
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView.Renderer, com.ss.android.vc.meeting.module.sketch.render.gl.impl.GLSketchRenderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        initGL();
        for (BaseRenderer baseRenderer : this.mRenderers) {
            baseRenderer.onSurfaceCreated(gl10, eGLConfig);
        }
    }

    public GLRenderImpl(Context context, GLRenderModel gLRenderModel) {
        this.mContext = context;
        this.mModel = gLRenderModel;
        this.mBufferManager = new GLMemoryManager();
    }

    public void resize(int i, int i2) {
        C60700b.m235851b("[Sketch] [GLRenderImpl]", "[resize]", "[w]" + i + "  [h]" + i2);
        this.mWidth = i;
        this.mHeight = i2;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.gl.impl.BaseGLTextureView.Renderer, com.ss.android.vc.meeting.module.sketch.render.gl.impl.GLSketchRenderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        resize(i, i2);
        GLES20.glViewport(0, 0, this.mWidth, this.mHeight);
        onContentBoundChanged(this.mContentBound);
        for (BaseRenderer baseRenderer : this.mRenderers) {
            baseRenderer.onSurfaceChanged(gl10, i, i2);
        }
    }
}
