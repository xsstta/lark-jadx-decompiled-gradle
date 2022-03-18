package com.ss.android.vc.meeting.module.sketch.render.gl.util;

import android.opengl.GLES20;
import com.ss.android.vc.common.p3077b.C60700b;

public class GLUtils {
    public static boolean debugGL() {
        return false;
    }

    public static void checkError() {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Throwable th = new Throwable();
            C60700b.m235846a("GL", "GL error: " + glGetError, th);
        }
    }

    public static String generateMarkId(String str) {
        return "mark_" + str;
    }

    private static String getHex(int i) {
        return "0x" + Integer.toHexString(i);
    }

    public static String getErrorString(int i) {
        switch (i) {
            case 12288:
                return "EGL_SUCCESS";
            case 12289:
                return "EGL_NOT_INITIALIZED";
            case 12290:
                return "EGL_BAD_ACCESS";
            case 12291:
                return "EGL_BAD_ALLOC";
            case 12292:
                return "EGL_BAD_ATTRIBUTE";
            case 12293:
                return "EGL_BAD_CONFIG";
            case 12294:
                return "EGL_BAD_CONTEXT";
            case 12295:
                return "EGL_BAD_CURRENT_SURFACE";
            case 12296:
                return "EGL_BAD_DISPLAY";
            case 12297:
                return "EGL_BAD_MATCH";
            case 12298:
                return "EGL_BAD_NATIVE_PIXMAP";
            case 12299:
                return "EGL_BAD_NATIVE_WINDOW";
            case 12300:
                return "EGL_BAD_PARAMETER";
            case 12301:
                return "EGL_BAD_SURFACE";
            case 12302:
                return "EGL_CONTEXT_LOST";
            default:
                return getHex(i);
        }
    }
}
