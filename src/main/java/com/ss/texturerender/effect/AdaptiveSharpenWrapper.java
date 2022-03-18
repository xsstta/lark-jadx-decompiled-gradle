package com.ss.texturerender.effect;

import com.ss.texturerender.TextureRenderHelper;
import com.ss.texturerender.TextureRenderLog;
import java.lang.reflect.Method;

public class AdaptiveSharpenWrapper {
    private Method mGetOutputMethod;
    private Method mInitMethod;
    private Method mProcessMethod;
    private Method mProcessOESMethod;
    private Method mReleaseMethod;
    private Object mSharpenObject;

    public int GetAdaptiveSharpenOutput() {
        Method method;
        Object _invokeMethod;
        Object obj = this.mSharpenObject;
        if (obj == null || (method = this.mGetOutputMethod) == null || (_invokeMethod = _invokeMethod(method, obj, new Object[0])) == null) {
            return -1;
        }
        return ((Integer) _invokeMethod).intValue();
    }

    public void ReleaseAdaptiveSharpen() {
        Method method;
        Object obj = this.mSharpenObject;
        if (!(obj == null || (method = this.mReleaseMethod) == null)) {
            _invokeMethod(method, obj, new Object[0]);
            TextureRenderLog.m256492d("TR_AdaptiveSharpenWrapper", "ReleaseAdaptiveSharpen");
        }
        this.mSharpenObject = null;
    }

    public AdaptiveSharpenWrapper() {
        TextureRenderLog.m256492d("TR_AdaptiveSharpenWrapper", "new AdaptiveSharpenWrapper");
        try {
            Class<?> clzUsingPluginLoader = TextureRenderHelper.getClzUsingPluginLoader(1, "com.ss.lens.algorithm.AdaptiveSharpen");
            if (clzUsingPluginLoader != null) {
                this.mInitMethod = clzUsingPluginLoader.getDeclaredMethod("InitAdaptiveSharpen", Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                this.mProcessMethod = clzUsingPluginLoader.getDeclaredMethod("AdaptiveSharpenProcess", Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Integer.TYPE);
                this.mProcessOESMethod = clzUsingPluginLoader.getDeclaredMethod("AdaptiveSharpenOesProcess", Integer.TYPE, Integer.TYPE, Integer.TYPE, float[].class, Boolean.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Integer.TYPE);
                this.mGetOutputMethod = clzUsingPluginLoader.getDeclaredMethod("GetAdaptiveSharpenOutput", new Class[0]);
                this.mReleaseMethod = clzUsingPluginLoader.getDeclaredMethod("ReleaseAdaptiveSharpen", new Class[0]);
                this.mSharpenObject = clzUsingPluginLoader.newInstance();
            }
        } catch (Exception e) {
            TextureRenderLog.m256492d("TR_AdaptiveSharpenWrapper", "AdaptiveSharpen get fail:" + e.toString());
            this.mSharpenObject = null;
            this.mInitMethod = null;
            this.mProcessMethod = null;
            this.mGetOutputMethod = null;
            this.mReleaseMethod = null;
        }
    }

    private Object _invokeMethod(Method method, Object obj, Object... objArr) {
        if (method == null || obj == null) {
            return null;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (Exception e) {
            TextureRenderLog.m256492d("TR_AdaptiveSharpenWrapper", e.toString());
            return null;
        }
    }

    public boolean InitAdaptiveSharpen(boolean z, int i, int i2, int i3) {
        Method method;
        Object _invokeMethod;
        Object obj = this.mSharpenObject;
        if (obj == null || (method = this.mInitMethod) == null || (_invokeMethod = _invokeMethod(method, obj, Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3))) == null) {
            return false;
        }
        return ((Boolean) _invokeMethod).booleanValue();
    }

    public int AdaptiveSharpenProcess(int i, int i2, int i3, boolean z, int i4, float f, float f2, float f3, int i5) {
        Method method;
        Object _invokeMethod;
        Object obj = this.mSharpenObject;
        if (obj == null || (method = this.mProcessMethod) == null || (_invokeMethod = _invokeMethod(method, obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z), Integer.valueOf(i4), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i5))) == null) {
            return -1;
        }
        return ((Integer) _invokeMethod).intValue();
    }

    public int AdaptiveSharpenOesProcess(int i, int i2, int i3, float[] fArr, boolean z, int i4, float f, float f2, float f3, int i5) {
        Method method;
        Object _invokeMethod;
        Object obj = this.mSharpenObject;
        if (obj == null || (method = this.mProcessOESMethod) == null || (_invokeMethod = _invokeMethod(method, obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fArr, Boolean.valueOf(z), Integer.valueOf(i4), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i5))) == null) {
            return -1;
        }
        return ((Integer) _invokeMethod).intValue();
    }
}
