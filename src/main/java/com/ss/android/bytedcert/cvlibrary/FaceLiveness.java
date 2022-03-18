package com.ss.android.bytedcert.cvlibrary;

import com.C1711a;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.bytedcert.p1304b.C28317a;
import com.ss.android.bytedcert.utils.C28432b;

public class FaceLiveness {
    public native long native_FL_CreateHandler();

    public native int native_FL_GetBestFrame(long j, byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2);

    public native String native_FL_GetSdkData(long j, int i, String str, String str2, String str3);

    public native int native_FL_ReleaseHandle(long j, boolean z, String str);

    public native int native_FL_ResetHandle(long j, boolean z, String str);

    public native int native_FL_SetConfig(long j, int i, float f);

    public native int native_FL_SetModle(long j, String str);

    public native int native_FL_SetParamFromBytes(long j, int i, int i2, int i3, int i4, int i5, int i6);

    public native int native_FL_doPredict(long j, byte[] bArr, int i, int i2, int i3, int i4, int i5, int[] iArr, int i6, boolean z, String str);

    public native int native_FL_show(long j, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int[] iArr, int i4);

    static {
        if (!BytedCertManager.getInstance().isLoadSmash()) {
            try {
                C1711a.m7628a("smash");
                System.err.println("FaceLivess: library load!");
            } catch (Exception e) {
                C28432b.m104210a(e, C28317a.C28318a.f71136K);
                System.err.println("WARNING: FaceLivess Could not load library!");
            }
        }
    }
}
