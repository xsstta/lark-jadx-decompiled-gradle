package com.ss.android.medialib.qr;

import android.content.Context;
import android.view.SurfaceHolder;
import com.bef.effectsdk.message.MessageCenter;

public class EnigmaScanner implements MessageCenter.AbstractC2081a {
    private AbstractC59427a listener;

    public enum ScanMode {
        CAMERA,
        PICTURE
    }

    /* renamed from: com.ss.android.medialib.qr.EnigmaScanner$a */
    public interface AbstractC59427a {
    }

    private synchronized void onResult() {
    }

    private void setScanMode() {
    }

    public void enableCameraScan(boolean z) {
    }

    public void enableCameraScanWithRequirement(boolean z, long j) {
    }

    @Override // com.bef.effectsdk.message.MessageCenter.AbstractC2081a
    public void onMessageReceived(int i, int i2, int i3, String str) {
    }

    public void startScan(Context context, Object obj, SurfaceHolder surfaceHolder, ScanSettings scanSettings) {
    }

    public void startScan(String str, ScanSettings scanSettings, long j) {
    }

    public void stop() {
    }

    public synchronized void stopCameraScan() {
    }

    public synchronized void stopPicScan() {
    }

    public ScanMode getScanMode() {
        return ScanMode.CAMERA;
    }

    public void release() {
        MessageCenter.m9051b(this);
    }

    public void setListener(AbstractC59427a aVar) {
        this.listener = aVar;
    }
}
