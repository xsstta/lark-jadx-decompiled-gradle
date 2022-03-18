package com.ss.android.ttvecamera.hardware;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class TECameraOGXMProxy extends C60390e {

    @Retention(RetentionPolicy.CLASS)
    public @interface MiCameraHideType {
    }

    @Override // com.ss.android.ttvecamera.hardware.C60390e
    /* renamed from: a */
    public void mo206816a(int i, CameraManager cameraManager) {
    }

    @Override // com.ss.android.ttvecamera.hardware.C60390e
    /* renamed from: a */
    public String mo206814a() {
        return super.mo206814a();
    }

    public TECameraOGXMProxy(Context context) {
        super(context);
    }

    @Override // com.ss.android.ttvecamera.hardware.C60390e
    /* renamed from: c */
    public boolean mo206817c(CameraCharacteristics cameraCharacteristics) {
        return super.mo206817c(cameraCharacteristics);
    }

    /* renamed from: a */
    public String mo206815a(int i) {
        return mo206814a();
    }

    @Override // com.ss.android.ttvecamera.hardware.C60390e
    /* renamed from: a */
    public int mo206813a(CameraCharacteristics cameraCharacteristics, CaptureRequest.Builder builder, boolean z) {
        return super.mo206813a(cameraCharacteristics, builder, z);
    }
}
