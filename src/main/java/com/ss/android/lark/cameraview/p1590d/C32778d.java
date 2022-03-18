package com.ss.android.lark.cameraview.p1590d;

import android.hardware.Camera;

/* renamed from: com.ss.android.lark.cameraview.d.d */
public class C32778d {
    /* renamed from: a */
    public static synchronized boolean m125814a(int i) {
        boolean z;
        synchronized (C32778d.class) {
            z = false;
            Camera camera = null;
            try {
                camera = Camera.open(i);
                camera.setParameters(camera.getParameters());
                if (camera != null) {
                    camera.release();
                    z = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (camera != null) {
                    camera.release();
                }
            } catch (Throwable th) {
                if (camera != null) {
                    camera.release();
                }
                throw th;
            }
        }
        return z;
    }
}
