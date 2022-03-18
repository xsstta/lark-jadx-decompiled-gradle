package com.ss.android.ttvecamera;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import com.bytedance.bpea.basics.BPEAException;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.api.ve.VEPrivacyCertCheckEntry;

/* renamed from: com.ss.android.ttvecamera.h */
public class C60385h {
    /* renamed from: a */
    public static void m234615a(PrivacyCert privacyCert, CameraDevice cameraDevice) {
        if (m234617a(privacyCert, false)) {
            cameraDevice.close();
        }
    }

    /* renamed from: a */
    public static boolean m234617a(PrivacyCert privacyCert, boolean z) {
        boolean z2;
        if (z) {
            try {
                VEPrivacyCertCheckEntry.Camera.m15143a(privacyCert);
            } catch (BPEAException e) {
                C60427s.m234844d("TECamera2PolicyAdapter", "error:" + e.getErrorMsg() + " errorCode:" + e.getErrorCode());
                z2 = false;
            }
        } else {
            VEPrivacyCertCheckEntry.Camera.m15144b(privacyCert);
        }
        z2 = true;
        C60427s.m234839a("TECamera2PolicyAdapter", "check privacy:" + z2 + ", open:" + z);
        return z2;
    }

    /* renamed from: a */
    public static void m234616a(PrivacyCert privacyCert, CameraManager cameraManager, String str, CameraDevice.StateCallback stateCallback, Handler handler) throws CameraAccessException {
        if (m234617a(privacyCert, true)) {
            cameraManager.openCamera(str, stateCallback, handler);
        }
    }
}
