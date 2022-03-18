package com.ss.android.lark.mediarecorder.p2245c;

import android.hardware.Camera;
import android.media.AudioRecord;

/* renamed from: com.ss.android.lark.mediarecorder.c.c */
public class C44790c {
    /* renamed from: a */
    public static int m177624a() {
        int minBufferSize = AudioRecord.getMinBufferSize(44100, 16, 2);
        AudioRecord audioRecord = new AudioRecord(0, 44100, 16, 2, minBufferSize * 100);
        short[] sArr = new short[minBufferSize];
        try {
            audioRecord.startRecording();
            if (audioRecord.getRecordingState() != 3) {
                audioRecord.stop();
                audioRecord.release();
                C44796g.m177637c("audio recorder is using");
                return -1;
            } else if (audioRecord.read(sArr, 0, minBufferSize) <= 0) {
                audioRecord.stop();
                audioRecord.release();
                C44796g.m177637c("record result is null");
                return -2;
            } else {
                audioRecord.stop();
                audioRecord.release();
                return 1;
            }
        } catch (Exception unused) {
            audioRecord.release();
            return -2;
        }
    }

    /* renamed from: a */
    public static synchronized boolean m177625a(int i) {
        boolean z;
        synchronized (C44790c.class) {
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
