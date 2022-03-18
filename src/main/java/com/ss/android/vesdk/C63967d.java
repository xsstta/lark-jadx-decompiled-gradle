package com.ss.android.vesdk;

import android.media.AudioRecord;
import com.bytedance.bpea.basics.BPEAException;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.api.ve.VEPrivacyCertCheckEntry;

/* renamed from: com.ss.android.vesdk.d */
public class C63967d {
    /* renamed from: a */
    public static void m251089a(PrivacyCert privacyCert, AudioRecord audioRecord) {
        if (m251090a(privacyCert, 0)) {
            audioRecord.startRecording();
        }
    }

    /* renamed from: b */
    public static void m251091b(PrivacyCert privacyCert, AudioRecord audioRecord) {
        if (m251090a(privacyCert, 1)) {
            audioRecord.stop();
        }
    }

    /* renamed from: c */
    public static void m251092c(PrivacyCert privacyCert, AudioRecord audioRecord) {
        if (m251090a(privacyCert, 2)) {
            audioRecord.release();
        }
    }

    /* renamed from: a */
    private static boolean m251090a(PrivacyCert privacyCert, int i) {
        boolean z = true;
        if (i == 0) {
            try {
                VEPrivacyCertCheckEntry.AudioRecord.m15137a(privacyCert);
            } catch (BPEAException e) {
                z = false;
                C63929ab.m250980d("TEAudioPolicyAdapter", "error:" + e.getErrorMsg() + " errorCode:" + e.getErrorCode());
            }
        } else if (i == 1) {
            VEPrivacyCertCheckEntry.AudioRecord.m15138b(privacyCert);
        } else if (i == 2) {
            VEPrivacyCertCheckEntry.AudioRecord.m15139c(privacyCert);
        }
        C63929ab.m250974a("TEAudioPolicyAdapter", "check privacy:" + z + ", check type: " + i);
        return z;
    }
}
