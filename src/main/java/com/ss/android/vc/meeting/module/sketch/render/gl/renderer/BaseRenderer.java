package com.ss.android.vc.meeting.module.sketch.render.gl.renderer;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.sketch.render.gl.mm.GLMemoryManager;
import com.ss.android.vc.meeting.module.sketch.render.gl.model.GLRenderModel;
import com.ss.android.vc.meeting.module.sketch.render.gl.util.FileUtils;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class BaseRenderer implements GLSurfaceView.Renderer {
    protected Context mContext;
    protected GLMemoryManager mMemoryManager;
    protected final GLRenderModel mModel;
    protected int mProgram;

    /* access modifiers changed from: protected */
    public String getFragmentShaderAssetPath() {
        return "";
    }

    /* access modifiers changed from: protected */
    public String getVertexShaderAssetPath() {
        return "";
    }

    public void onDrawFrame(GL10 gl10) {
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
    }

    private void comipleAndLinkProgram() {
        String vertexShaderAssetPath = getVertexShaderAssetPath();
        String fragmentShaderAssetPath = getFragmentShaderAssetPath();
        String loadAssetFile = FileUtils.loadAssetFile(this.mContext, vertexShaderAssetPath);
        String loadAssetFile2 = FileUtils.loadAssetFile(this.mContext, fragmentShaderAssetPath);
        int[] iArr = new int[1];
        int loadShader = loadShader(35633, loadAssetFile);
        int loadShader2 = loadShader(35632, loadAssetFile2);
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, loadShader);
            GLES20.glAttachShader(glCreateProgram, loadShader2);
            GLES20.glLinkProgram(glCreateProgram);
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 0) {
                C60700b.m235864f("[Sketch] [BaseRender]", "[comipleAndLinkProgram2]", "Error linking program:" + GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
                return;
            }
            this.mProgram = glCreateProgram;
        }
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        comipleAndLinkProgram();
    }

    private int loadShader(int i, String str) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            return 0;
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        C60700b.m235864f("[Sketch] [BaseRender]", "[loadShader]", GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public BaseRenderer(Context context, GLRenderModel gLRenderModel, GLMemoryManager gLMemoryManager) {
        this.mContext = context;
        this.mModel = gLRenderModel;
        this.mMemoryManager = gLMemoryManager;
    }
}
