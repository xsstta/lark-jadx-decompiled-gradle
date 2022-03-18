package com.ss.texturerender;

import com.ss.android.lark.calendar.impl.utils.CalendarWorkHourUtil;
import java.lang.reflect.Method;

public class VideoOCLSRWrapper {
    private Method mGetOutputMethod;
    private Method mInitMethod;
    private Method mInitMethodMax;
    private Method mInitMethodMaxMalisync;
    private Method mInitWithLicenseMethod;
    private Method mProcessMethod;
    private Method mProcessOesMethod;
    private Method mReleaseMethod;
    private Object mSRObject;

    public VideoOCLSRWrapper() {
        TextureRenderLog.m256492d("VideoOCLSRWrapper", "new VideoOCLSRWrapper");
        _initObjAndMethod();
    }

    public void ReleaseVideoOclSr() {
        Method method;
        Object obj = this.mSRObject;
        if (!(obj == null || (method = this.mReleaseMethod) == null)) {
            _invokeMethod(method, obj, new Object[0]);
            TextureRenderLog.m256492d("VideoOCLSRWrapper", "ReleaseVideoOclSr");
        }
        this.mSRObject = null;
    }

    public int GetVideoOclSrOutput() {
        if (this.mSRObject == null || this.mGetOutputMethod == null) {
            _initObjAndMethod();
        }
        Object _invokeMethod = _invokeMethod(this.mGetOutputMethod, this.mSRObject, new Object[0]);
        if (_invokeMethod == null) {
            return -1;
        }
        return ((Integer) _invokeMethod).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00c5 A[SYNTHETIC, Splitter:B:12:0x00c5] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void _initObjAndMethod() {
        /*
        // Method dump skipped, instructions count: 329
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.texturerender.VideoOCLSRWrapper._initObjAndMethod():void");
    }

    private Object _invokeMethod(Method method, Object obj, Object... objArr) {
        if (method == null || obj == null) {
            return null;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (Exception e) {
            TextureRenderLog.m256492d("VideoOCLSRWrapper", e.toString());
            return null;
        }
    }

    public int VideoOclSrProcess(int i, int i2, int i3, boolean z) {
        if (this.mSRObject == null || this.mProcessMethod == null) {
            _initObjAndMethod();
        }
        Object _invokeMethod = _invokeMethod(this.mProcessMethod, this.mSRObject, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z));
        if (_invokeMethod == null) {
            return -1;
        }
        return ((Integer) _invokeMethod).intValue();
    }

    public boolean InitVideoOclSr(String str, int i, boolean z, String str2) {
        if (this.mSRObject == null || this.mInitWithLicenseMethod == null) {
            _initObjAndMethod();
        }
        Object obj = null;
        Object obj2 = this.mSRObject;
        if (obj2 != null) {
            if (this.mInitWithLicenseMethod != null) {
                TextureRenderLog.m256492d("VideoOCLSRWrapper", "mInitWithLicenseMethod " + str2);
                obj = _invokeMethod(this.mInitWithLicenseMethod, this.mSRObject, str, Integer.valueOf(i), Boolean.valueOf(z), true, str2, 720, Integer.valueOf((int) CalendarWorkHourUtil.f83805a));
            } else {
                Method method = this.mInitMethod;
                if (method != null) {
                    obj = _invokeMethod(method, obj2, str, Integer.valueOf(i), Boolean.valueOf(z));
                }
            }
        }
        if (obj == null || !((Boolean) obj).booleanValue()) {
            return false;
        }
        return true;
    }

    public int VideoOclSrOesProcess(int i, int i2, int i3, float[] fArr, boolean z) {
        if (this.mSRObject == null || this.mProcessOesMethod == null) {
            _initObjAndMethod();
        }
        Object _invokeMethod = _invokeMethod(this.mProcessOesMethod, this.mSRObject, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fArr, Boolean.valueOf(z));
        if (_invokeMethod == null) {
            return -1;
        }
        return ((Integer) _invokeMethod).intValue();
    }

    public boolean InitVideoOclSr(String str, int i, boolean z, int i2, int i3) {
        if (this.mSRObject == null || this.mInitMethodMax == null) {
            _initObjAndMethod();
        }
        Object _invokeMethod = _invokeMethod(this.mInitMethodMax, this.mSRObject, str, Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3));
        if (_invokeMethod == null || !((Boolean) _invokeMethod).booleanValue()) {
            return false;
        }
        return true;
    }

    public boolean InitVideoOclSr(String str, int i, boolean z, boolean z2, int i2, int i3, String str2) {
        if (this.mSRObject == null || this.mInitWithLicenseMethod == null) {
            _initObjAndMethod();
        }
        Object obj = null;
        Object obj2 = this.mSRObject;
        if (obj2 != null) {
            if (this.mInitWithLicenseMethod != null) {
                TextureRenderLog.m256492d("VideoOCLSRWrapper", "mInitWithLicenseMethod " + str2);
                obj = _invokeMethod(this.mInitWithLicenseMethod, this.mSRObject, str, Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2), str2, Integer.valueOf(i2), Integer.valueOf(i3));
            } else {
                Method method = this.mInitMethodMaxMalisync;
                if (method != null) {
                    obj = _invokeMethod(method, obj2, str, Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i2), Integer.valueOf(i3));
                } else if (this.mInitMethodMax != null) {
                    TextureRenderLog.m256492d("VideoOCLSRWrapper", "mInitMethodMaxMalisync null, use mInitMethodMax");
                    obj = _invokeMethod(this.mInitMethodMax, this.mSRObject, str, Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3));
                } else if (this.mInitMethod != null) {
                    TextureRenderLog.m256492d("VideoOCLSRWrapper", "mInitMethodMaxMalisync/mInitMethodMax null,use mInitMethod");
                    obj = _invokeMethod(this.mInitMethod, this.mSRObject, str, Integer.valueOf(i), Boolean.valueOf(z));
                }
            }
        }
        if (obj == null || !((Boolean) obj).booleanValue()) {
            return false;
        }
        return true;
    }
}
