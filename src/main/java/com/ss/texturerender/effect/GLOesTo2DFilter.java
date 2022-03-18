package com.ss.texturerender.effect;

import android.opengl.GLES20;
import android.os.Bundle;
import com.ss.texturerender.TextureRenderLog;

public class GLOesTo2DFilter extends GLDefaultFilter {
    private float[] mSTMatrix = new float[16];
    private int muSTMatrixHandle;
    private final String oesFragmentShader = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private final String oesVertexShader = "uniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";

    @Override // com.ss.texturerender.effect.GLDefaultFilter
    public int onDrawFrameBefore() {
        this.mSurfaceTexture.getTransformMatrix(this.mSTMatrix);
        GLES20.glUniformMatrix4fv(this.muSTMatrixHandle, 1, false, this.mSTMatrix, 0);
        return 0;
    }

    public GLOesTo2DFilter() {
        super(3);
        this.mInTextureTarget = 36197;
        this.mOrder = 100;
        TextureRenderLog.m256492d("TR_GLOesTo2DFilter", "new GLOesTo2DFilter");
    }

    @Override // com.ss.texturerender.effect.AbsEffect, com.ss.texturerender.effect.GLDefaultFilter
    public String getStringOption(int i) {
        if (i == 11000) {
            return "uniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
        }
        if (i != 11001) {
            return super.getStringOption(i);
        }
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    }

    @Override // com.ss.texturerender.effect.AbsEffect, com.ss.texturerender.effect.GLDefaultFilter
    public int init(Bundle bundle) {
        super.init(bundle);
        this.muSTMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uSTMatrix");
        TextureRenderLog.m256492d("TR_GLOesTo2DFilter", "init");
        return 0;
    }
}
