package com.ss.android.ttvecamera.p3034c;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.c.a */
public interface AbstractC60324a {

    /* renamed from: com.ss.android.ttvecamera.c.a$a */
    public interface AbstractC60325a {
        /* renamed from: a */
        void mo206604a(CaptureRequest.Builder builder);

        /* renamed from: c */
        int mo206562c();

        /* renamed from: d */
        int mo206563d();
    }

    /* renamed from: a */
    int mo206598a();

    /* renamed from: a */
    CameraCaptureSession.CaptureCallback mo206599a(CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z);

    /* renamed from: a */
    CameraCaptureSession.CaptureCallback mo206600a(CaptureRequest.Builder builder, boolean z);

    /* renamed from: a */
    void mo206601a(CaptureRequest.Builder builder);

    /* renamed from: a */
    void mo206602a(CaptureRequest.Builder builder, Rect rect);

    /* renamed from: b */
    void mo206603b(CaptureRequest.Builder builder, Rect rect);
}
