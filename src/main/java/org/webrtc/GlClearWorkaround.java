package org.webrtc;

import android.opengl.GLES20;
import android.os.Build;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.ttm.player.MediaPlayer;
import java.nio.Buffer;
import java.nio.FloatBuffer;

public class GlClearWorkaround {
    private static final FloatBuffer FULL_RECTANGLE_BUFFER = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private GlShader currentShader;
    private boolean mHasInit;

    public enum WORKAROUND_STATUS {
        kStatusUnknown,
        kStatusEnable,
        kStatusDisable
    }

    private GlShader createShader() {
        return new GlShader("#ifdef GL_ES\nprecision mediump float;\n#endif\nuniform float u_clear_depth;\nattribute vec4 a_position;\nvoid main(void) {\n  gl_Position = vec4(a_position.x, a_position.y, u_clear_depth, 1.0);\n}\n", "#ifdef GL_ES\nprecision mediump float;\n#endif\nuniform vec4 u_clear_color;\nvoid main(void) {\n  gl_FragColor = u_clear_color;\n}\n");
    }

    public synchronized void init() {
        this.mHasInit = true;
    }

    public synchronized void release() {
        this.mHasInit = false;
        GlShader glShader = this.currentShader;
        if (glShader != null) {
            glShader.release();
            this.currentShader = null;
        }
    }

    public static WORKAROUND_STATUS isNeedWorkaround() {
        if (Build.VERSION.SDK_INT < 23) {
            return WORKAROUND_STATUS.kStatusEnable;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return WORKAROUND_STATUS.kStatusDisable;
        }
        String lowerCase = GLES20.glGetString(7936).toLowerCase();
        if (lowerCase.contains("mali") || lowerCase.contains("arm")) {
            return WORKAROUND_STATUS.kStatusEnable;
        }
        return WORKAROUND_STATUS.kStatusDisable;
    }

    private void prepareShader() {
        GlShader createShader = createShader();
        this.currentShader = createShader;
        createShader.useProgram();
        GlUtil.checkNoGLES2Error("Create shader");
        int attribLocation = createShader.getAttribLocation("a_position");
        GLES20.glEnableVertexAttribArray(attribLocation);
        GLES20.glVertexAttribPointer(attribLocation, 2, 5126, false, 0, (Buffer) FULL_RECTANGLE_BUFFER);
        GlUtil.checkNoGLES2Error("Prepare shader");
    }

    public synchronized void clear(int i, int i2, int i3, float f, float f2, float f3, float f4, float f5, int i4) {
        if (this.mHasInit) {
            if (this.currentShader == null) {
                prepareShader();
            }
            this.currentShader.useProgram();
            GLES20.glUniform1f(this.currentShader.getUniformLocation("u_clear_depth"), f5);
            GLES20.glUniform4f(this.currentShader.getUniformLocation("u_clear_color"), f, f2, f3, f4);
            if ((i3 & 16384) == 0) {
                GLES20.glColorMask(false, false, false, false);
            }
            GlUtil.checkNoGLES2Error("before depth test");
            if ((i3 & DynamicModule.f58006b) != 0) {
                GLES20.glEnable(2929);
                GLES20.glDepthFunc(519);
            } else {
                GLES20.glDisable(2929);
                GLES20.glDepthFunc(MediaPlayer.MEDIA_PLAYER_OPTION_APPID);
            }
            GlUtil.checkNoGLES2Error("before stencil test");
            if ((i3 & 1024) != 0) {
                GLES20.glEnable(2960);
                GLES20.glStencilFunc(519, i4, 255);
                GLES20.glStencilOp(7680, 7680, 7681);
            } else {
                GLES20.glDisable(2960);
                GLES20.glStencilOp(7680, 7680, 7680);
                GLES20.glStencilMask(0);
            }
            GlUtil.checkNoGLES2Error("before clear workaround");
            GLES20.glDisable(2884);
            GLES20.glDisable(3042);
            GLES20.glDisable(32823);
            GLES20.glViewport(0, 0, i, i2);
            GLES20.glDrawArrays(5, 0, 4);
            GlUtil.checkNoGLES2Error("after clear workaround");
        }
    }
}
