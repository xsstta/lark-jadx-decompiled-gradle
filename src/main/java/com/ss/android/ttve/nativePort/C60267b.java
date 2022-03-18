package com.ss.android.ttve.nativePort;

import android.media.ImageReader;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.vesdk.AbstractC64077u;
import com.ss.android.vesdk.C63929ab;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.ttve.nativePort.b */
public class C60267b {

    /* renamed from: a */
    public String f150460a = "HwFrameExtractorRange_";

    /* renamed from: b */
    String f150461b;

    /* renamed from: c */
    int f150462c;

    /* renamed from: d */
    int f150463d;

    /* renamed from: e */
    int f150464e;

    /* renamed from: f */
    int f150465f;

    /* renamed from: g */
    boolean f150466g;

    /* renamed from: h */
    AbstractC64077u f150467h;

    /* renamed from: i */
    VEFrame f150468i;

    /* renamed from: j */
    MediaCodec f150469j = null;

    /* renamed from: k */
    public final Object f150470k = new Object();

    /* renamed from: l */
    HandlerThread f150471l;

    /* renamed from: m */
    HandlerThread f150472m;

    /* renamed from: n */
    ImageReader f150473n;

    /* renamed from: o */
    int f150474o = 0;

    /* renamed from: p */
    boolean f150475p = false;

    /* renamed from: q */
    private long f150476q = Thread.currentThread().getId();

    /* renamed from: d */
    private void m234173d() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f150464e * this.f150465f * 4);
        allocateDirect.clear();
        this.f150468i = VEFrame.createByteBufferFrame(allocateDirect, this.f150464e, this.f150465f, 0, 0, VEFrame.ETEPixelFormat.TEPixFmt_ARGB8);
    }

    /* renamed from: b */
    public void mo206312b() {
        if (this.f150471l != null) {
            try {
                new Handler(this.f150471l.getLooper()).post(new Runnable() {
                    /* class com.ss.android.ttve.nativePort.C60267b.RunnableC602681 */

                    public void run() {
                        synchronized (C60267b.this.f150470k) {
                            C60267b.this.mo206311a();
                            C60267b.this.f150470k.notify();
                        }
                    }
                });
                synchronized (this.f150470k) {
                    if (!this.f150475p) {
                        this.f150470k.wait();
                    }
                }
                this.f150471l.quitSafely();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo206311a() {
        try {
            C63929ab.m250974a(this.f150460a, "stop begin");
            if (!this.f150475p) {
                this.f150475p = true;
                if (this.f150473n != null) {
                    this.f150469j.reset();
                    this.f150469j.release();
                }
                ImageReader imageReader = this.f150473n;
                if (imageReader != null) {
                    imageReader.close();
                }
                HandlerThread handlerThread = this.f150472m;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
                C63929ab.m250974a(this.f150460a, "stop end");
            }
        } catch (Exception e) {
            C63929ab.m250974a(this.f150460a, "stop crash");
            Log.e(this.f150460a, Log.getStackTraceString(e));
            mo206313c();
        }
    }

    /* renamed from: c */
    public void mo206313c() {
        if (!this.f150475p) {
            String str = this.f150460a;
            C63929ab.m250974a(str, "processFrameLast begin hasProcessCount:" + this.f150474o);
            if (!this.f150467h.processFrame(null, this.f150464e, this.f150465f, 0)) {
                String str2 = this.f150460a;
                C63929ab.m250974a(str2, "processFrameLast stop hasProcxessCount:" + this.f150474o);
            }
        }
    }

    public C60267b(String str, int i, int i2, int i3, int i4, boolean z, int i5, AbstractC64077u uVar) {
        this.f150460a += i5 + "_" + this.f150476q;
        this.f150461b = str;
        this.f150462c = Math.max(i, 0);
        this.f150463d = i2;
        this.f150464e = i3;
        this.f150465f = i4;
        this.f150466g = z;
        this.f150467h = uVar;
        try {
            m234173d();
        } catch (OutOfMemoryError unused) {
            C63929ab.m250978c(this.f150460a, "init alloc oom");
            Runtime.getRuntime().gc();
            try {
                m234173d();
            } catch (Exception unused2) {
                mo206313c();
            }
        }
    }
}
