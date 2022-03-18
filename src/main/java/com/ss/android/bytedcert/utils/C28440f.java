package com.ss.android.bytedcert.utils;

import android.content.Context;
import android.hardware.Camera;
import androidx.core.app.ActivityCompat;

/* renamed from: com.ss.android.bytedcert.utils.f */
public class C28440f {
    /* renamed from: a */
    public static long m104231a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public static boolean m104233b() {
        Camera camera = null;
        try {
            camera = Camera.open();
            camera.setParameters(camera.getParameters());
            if (camera != null) {
                camera.release();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            if (camera != null) {
                camera.release();
            }
            return false;
        } catch (Throwable th) {
            if (camera != null) {
                camera.release();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static boolean m104232a(Context context) {
        if (ActivityCompat.checkSelfPermission(context, "android.permission.CAMERA") == 0) {
            return true;
        }
        return false;
    }
}
