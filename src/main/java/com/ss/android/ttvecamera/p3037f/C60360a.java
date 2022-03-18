package com.ss.android.ttvecamera.p3037f;

import android.media.MediaCodec;
import android.media.MediaMetadataRetriever;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.ttvecamera.C60427s;
import java.io.File;

/* renamed from: com.ss.android.ttvecamera.f.a */
public class C60360a {

    /* renamed from: e */
    private static final SparseIntArray f150864e;

    /* renamed from: a */
    private MediaRecorder f150865a = new MediaRecorder();

    /* renamed from: b */
    private String f150866b;

    /* renamed from: c */
    private int f150867c = -1;

    /* renamed from: d */
    private Surface f150868d;

    /* renamed from: f */
    private HandlerThread f150869f;

    /* renamed from: g */
    private Handler f150870g;

    /* renamed from: h */
    private Size f150871h = new Size(1280, 720);

    /* renamed from: i */
    private int f150872i = 30;

    /* renamed from: j */
    private int f150873j = 10000000;

    /* renamed from: k */
    private int f150874k = 0;

    /* renamed from: l */
    private AbstractC60361a f150875l;

    /* renamed from: com.ss.android.ttvecamera.f.a$a */
    public interface AbstractC60361a {
        /* renamed from: a */
        void mo206746a(int i);
    }

    /* renamed from: b */
    public static HandlerThread m234462b(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: a */
    public void mo206739a() {
    }

    /* renamed from: d */
    public Surface mo206745d() {
        if (this.f150868d == null) {
            this.f150868d = MediaCodec.createPersistentInputSurface();
        }
        return this.f150868d;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f150864e = sparseIntArray;
        sparseIntArray.append(0, 90);
        sparseIntArray.append(1, 0);
        sparseIntArray.append(2, 270);
        sparseIntArray.append(3, 180);
    }

    /* renamed from: f */
    private void m234464f() {
        HandlerThread b = m234462b("MediaRecorderBackground");
        this.f150869f = b;
        b.start();
        this.f150870g = new Handler(this.f150869f.getLooper());
    }

    /* renamed from: g */
    private void m234465g() {
        HandlerThread handlerThread = this.f150869f;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            try {
                this.f150869f.join();
                this.f150869f = null;
                this.f150870g = null;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public C60360a() {
        m234464f();
    }

    /* renamed from: b */
    public void mo206743b() {
        String str = this.f150866b;
        if (str != null && !str.isEmpty()) {
            File file = new File(this.f150866b);
            C60427s.m234842b("TEMediaRecorder", "file length = " + file.length());
            if (file.exists()) {
                file.delete();
                this.f150866b = "";
                C60427s.m234842b("TEMediaRecorder", "invalid video file deleted!");
            }
        }
    }

    /* renamed from: e */
    private void m234463e() {
        String str = this.f150866b;
        if (str != null && !str.isEmpty()) {
            File file = new File(this.f150866b);
            C60427s.m234842b("TEMediaRecorder", "file length = " + file.length());
            if (!file.exists() || file.length() != 0) {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(this.f150866b);
                    Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                } catch (IllegalArgumentException unused) {
                    mo206743b();
                    C60427s.m234844d("TEMediaRecorder", "cannot access the file");
                }
                mediaMetadataRetriever.release();
                return;
            }
            file.delete();
            this.f150866b = "";
            C60427s.m234842b("TEMediaRecorder", "invalid video file deleted!");
        }
    }

    /* renamed from: c */
    public void mo206744c() {
        C60427s.m234842b("TEMediaRecorder", "[schedule] releaseMediaRecorder");
        if (this.f150865a != null) {
            C60427s.m234845e("TEMediaRecorder", "Releasing media recorder.");
            try {
                this.f150865a.reset();
            } catch (IllegalStateException e) {
                C60427s.m234844d("TEMediaRecorder", "media recorder maybe has been released! msg=" + e.getMessage());
                m234461a(-605);
            }
            m234463e();
            this.f150865a.release();
            this.f150865a = null;
            m234465g();
        }
    }

    /* renamed from: a */
    private void m234461a(int i) {
        AbstractC60361a aVar = this.f150875l;
        if (aVar != null) {
            aVar.mo206746a(i);
        }
    }

    /* renamed from: a */
    public void mo206741a(AbstractC60361a aVar) {
        this.f150875l = aVar;
    }

    /* renamed from: a */
    public void mo206742a(String str) {
        if (str == null || str.isEmpty()) {
            C60427s.m234844d("TEMediaRecorder", "empty file name");
        }
        m234463e();
        this.f150866b = str;
        Log.d("TEMediaRecorder", "file path = " + this.f150866b);
    }

    /* renamed from: a */
    public void mo206740a(int i, int i2, int i3, int i4) {
        this.f150871h = new Size(i, i2);
        this.f150872i = i3;
        this.f150873j = i4;
    }
}
