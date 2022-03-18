package com.ss.texturerender;

import android.opengl.GLES20;
import android.opengl.GLUtils;

public class TexGLUtils {
    public static int createFbo() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        checkGLError("createFbo");
        return iArr[0];
    }

    public static void deleteFbo(int i) {
        if (i > 0) {
            GLES20.glDeleteFramebuffers(1, new int[i], 0);
        }
    }

    public static void deleteTexture(int i) {
        if (i > 0) {
            GLES20.glDeleteTextures(1, new int[i], 0);
        }
    }

    public static boolean checkGLError(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return false;
        }
        TextureRenderLog.m256492d("GLUtils", str + ": gl error = " + GLUtils.getEGLErrorString(glGetError));
        return true;
    }

    public static int genTexture(int i) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGLError("glGenTextures");
        if (iArr[0] != 0) {
            GLES20.glBindTexture(i, iArr[0]);
            GLES20.glTexParameteri(i, 10242, 33071);
            GLES20.glTexParameteri(i, 10243, 33071);
            GLES20.glTexParameteri(i, 10241, 9729);
            GLES20.glTexParameteri(i, 10240, 9729);
        }
        return iArr[0];
    }
}
