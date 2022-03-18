package com.ss.android.ttvecamera.p3034c;

import android.hardware.camera2.CaptureRequest;
import com.ss.android.ttvecamera.p3034c.AbstractC60324a;

/* renamed from: com.ss.android.ttvecamera.c.f */
public class C60334f extends C60326b {
    public C60334f(AbstractC60324a.AbstractC60325a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ttvecamera.p3034c.AbstractC60324a, com.ss.android.ttvecamera.p3034c.C60326b
    /* renamed from: a */
    public void mo206601a(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
    }
}
