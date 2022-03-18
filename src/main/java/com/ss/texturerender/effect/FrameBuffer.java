package com.ss.texturerender.effect;

import android.opengl.GLES20;
import com.ss.texturerender.TexGLUtils;

public class FrameBuffer {
    private int mFboID = TexGLUtils.createFbo();

    public void release() {
        TexGLUtils.deleteFbo(this.mFboID);
    }

    public void unBind() {
        GLES20.glBindFramebuffer(36160, 0);
    }

    public void bind() {
        GLES20.glBindFramebuffer(36160, this.mFboID);
    }

    public void unbindTexture2D() {
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
        unBind();
    }

    public int bindTexture2D(int i) {
        bind();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        if (GLES20.glCheckFramebufferStatus(36160) != 36053) {
            return -1;
        }
        return 0;
    }
}
