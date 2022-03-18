package com.ss.android.ttvecamera;

import android.hardware.Camera;
import com.bytedance.bpea.basics.BPEAException;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.api.ve.VEPrivacyCertCheckEntry;

/* renamed from: com.ss.android.ttvecamera.f */
public class C60359f {
    /* renamed from: a */
    public static void m234459a(PrivacyCert privacyCert, Camera camera) {
        if (m234460a(privacyCert, false)) {
            camera.release();
        }
    }

    /* renamed from: a */
    public static Camera m234458a(PrivacyCert privacyCert, int i) {
        if (!m234460a(privacyCert, true)) {
            return null;
        }
        if (i >= 0) {
            return Camera.open(i);
        }
        return Camera.open();
    }

    /* renamed from: a */
    private static boolean m234460a(PrivacyCert privacyCert, boolean z) {
        boolean z2;
        if (z) {
            try {
                VEPrivacyCertCheckEntry.Camera.m15143a(privacyCert);
            } catch (BPEAException e) {
                C60427s.m234844d("TECamera1PolicyAdapter", "error:" + e.getErrorMsg() + " errorCode:" + e.getErrorCode());
                z2 = false;
            }
        } else {
            VEPrivacyCertCheckEntry.Camera.m15144b(privacyCert);
        }
        z2 = true;
        C60427s.m234839a("TECamera1PolicyAdapter", "check privacy:" + z2 + ", open:" + z);
        return z2;
    }
}
