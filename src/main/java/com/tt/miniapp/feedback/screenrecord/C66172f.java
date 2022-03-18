package com.tt.miniapp.feedback.screenrecord;

import android.hardware.display.VirtualDisplay;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.tt.miniapp.feedback.screenrecord.AbstractC66161a;
import com.tt.miniapphost.data.C67485a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.tt.miniapp.feedback.screenrecord.f */
public class C66172f {

    /* renamed from: a */
    public HandlerC66176b f167030a;

    /* renamed from: b */
    public AbstractC66175a f167031b;

    /* renamed from: c */
    private int f167032c;

    /* renamed from: d */
    private int f167033d;

    /* renamed from: e */
    private int f167034e;

    /* renamed from: f */
    private String f167035f;

    /* renamed from: g */
    private MediaProjection f167036g;

    /* renamed from: h */
    private C66178h f167037h;

    /* renamed from: i */
    private MediaFormat f167038i;

    /* renamed from: j */
    private int f167039j = -1;

    /* renamed from: k */
    private MediaMuxer f167040k;

    /* renamed from: l */
    private boolean f167041l;

    /* renamed from: m */
    private AtomicBoolean f167042m = new AtomicBoolean(false);

    /* renamed from: n */
    private VirtualDisplay f167043n;

    /* renamed from: o */
    private MediaProjection.Callback f167044o = new MediaProjection.Callback() {
        /* class com.tt.miniapp.feedback.screenrecord.C66172f.C661731 */

        public void onStop() {
            C66172f.this.mo231491a();
        }
    };

    /* renamed from: p */
    private HandlerThread f167045p;

    /* renamed from: q */
    private LinkedList<Integer> f167046q = new LinkedList<>();

    /* renamed from: r */
    private LinkedList<MediaCodec.BufferInfo> f167047r = new LinkedList<>();

    /* renamed from: s */
    private long f167048s;

    /* renamed from: com.tt.miniapp.feedback.screenrecord.f$a */
    public interface AbstractC66175a {
        /* renamed from: a */
        void mo231500a();

        /* renamed from: a */
        void mo231501a(long j);

        /* renamed from: a */
        void mo231502a(Throwable th);
    }

    /* renamed from: a */
    public static HandlerThread m259102a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: a */
    public final boolean mo231491a() {
        if (!this.f167042m.get()) {
            mo231498g();
            return true;
        }
        m259106a(false);
        return false;
    }

    /* renamed from: h */
    private void m259107h() throws IOException {
        this.f167037h.mo231462a(new AbstractC66161a.AbstractC66163a() {
            /* class com.tt.miniapp.feedback.screenrecord.C66172f.C661742 */

            /* renamed from: a */
            boolean f167050a;

            @Override // com.tt.miniapp.feedback.screenrecord.AbstractC66161a.AbstractC66163a
            /* renamed from: a */
            public void mo231474a(AbstractC66161a aVar, MediaFormat mediaFormat) {
                C66172f.this.mo231489a(mediaFormat);
                C66172f.this.mo231495e();
            }

            @Override // com.tt.miniapp.feedback.screenrecord.AbstractC66164b.AbstractC66165a
            /* renamed from: a */
            public void mo231475a(AbstractC66164b bVar, Exception exc) {
                this.f167050a = true;
                AppBrandLogger.m52829e("tma_ScreenRecorderManager", "VideoEncoder ran into an error! ", exc);
                Message.obtain(C66172f.this.f167030a, 2, exc).sendToTarget();
            }

            @Override // com.tt.miniapp.feedback.screenrecord.AbstractC66161a.AbstractC66163a
            /* renamed from: a */
            public void mo231473a(AbstractC66161a aVar, int i, MediaCodec.BufferInfo bufferInfo) {
                AppBrandLogger.m52830i("tma_ScreenRecorderManager", "VideoEncoder output buffer available: index=" + i);
                try {
                    C66172f.this.mo231488a(i, bufferInfo);
                } catch (Exception e) {
                    AppBrandLogger.m52829e("tma_ScreenRecorderManager", "Muxer encountered an error! ", e);
                    Message.obtain(C66172f.this.f167030a, 2, e).sendToTarget();
                }
            }
        });
        this.f167037h.mo231460a();
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (this.f167036g != null) {
            AppBrandLogger.m52829e("tma_ScreenRecorderManager", "release() not called!");
            mo231498g();
        }
    }

    /* renamed from: b */
    public void mo231492b() {
        if (this.f167045p == null) {
            HandlerThread a = m259102a("tma_ScreenRecorderManager");
            this.f167045p = a;
            a.start();
            HandlerC66176b bVar = new HandlerC66176b(this.f167045p.getLooper());
            this.f167030a = bVar;
            bVar.sendEmptyMessage(0);
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public void mo231493c() {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        ByteBuffer allocate = ByteBuffer.allocate(0);
        bufferInfo.set(0, 0, 0, 4);
        AppBrandLogger.m52830i("tma_ScreenRecorderManager", "Signal EOS to muxer");
        int i = this.f167039j;
        if (i != -1) {
            m259104a(i, bufferInfo, allocate);
        }
        this.f167039j = -1;
    }

    /* renamed from: f */
    public void mo231496f() {
        this.f167042m.set(false);
        this.f167047r.clear();
        this.f167046q.clear();
        try {
            C66178h hVar = this.f167037h;
            if (hVar != null) {
                hVar.mo231466d();
            }
        } catch (IllegalStateException e) {
            AppBrandLogger.m52829e("tma_ScreenRecorderManager", 6, e.getStackTrace());
        }
    }

    /* renamed from: d */
    public void mo231494d() {
        if (this.f167042m.get()) {
            throw new IllegalStateException();
        } else if (this.f167036g != null) {
            this.f167042m.set(true);
            this.f167036g.registerCallback(this.f167044o, this.f167030a);
            try {
                this.f167040k = new MediaMuxer(this.f167035f, 0);
                m259107h();
                this.f167043n = this.f167036g.createVirtualDisplay("tma_ScreenRecorderManager-display", this.f167032c, this.f167033d, this.f167034e, 1, this.f167037h.mo231506f(), null, null);
                AppBrandLogger.m52828d("tma_ScreenRecorderManager", "created virtual display: " + this.f167043n.getDisplay());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new IllegalStateException("maybe release");
        }
    }

    /* renamed from: e */
    public void mo231495e() {
        MediaFormat mediaFormat;
        if (!this.f167041l && (mediaFormat = this.f167038i) != null) {
            this.f167039j = this.f167040k.addTrack(mediaFormat);
            this.f167040k.start();
            this.f167041l = true;
            AppBrandLogger.m52830i("tma_ScreenRecorderManager", "Started media muxer, videoIndex=" + this.f167039j);
            if (!this.f167046q.isEmpty()) {
                AppBrandLogger.m52830i("tma_ScreenRecorderManager", "Mux pending video output buffers...");
                while (true) {
                    MediaCodec.BufferInfo poll = this.f167047r.poll();
                    if (poll != null) {
                        mo231488a(this.f167046q.poll().intValue(), poll);
                    } else {
                        AppBrandLogger.m52830i("tma_ScreenRecorderManager", "Mux pending video output buffers done.");
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public void mo231498g() {
        MediaProjection mediaProjection = this.f167036g;
        if (mediaProjection != null) {
            mediaProjection.unregisterCallback(this.f167044o);
        }
        VirtualDisplay virtualDisplay = this.f167043n;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.f167043n = null;
        }
        this.f167038i = null;
        this.f167039j = -1;
        this.f167041l = false;
        HandlerThread handlerThread = this.f167045p;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f167045p = null;
        }
        C66178h hVar = this.f167037h;
        if (hVar != null) {
            hVar.mo231467e();
            this.f167037h = null;
        }
        MediaProjection mediaProjection2 = this.f167036g;
        if (mediaProjection2 != null) {
            mediaProjection2.stop();
            this.f167036g = null;
        }
        MediaMuxer mediaMuxer = this.f167040k;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                this.f167040k.release();
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "tma_ScreenRecorderManager", e.getStackTrace());
            }
            this.f167040k = null;
        }
        this.f167030a = null;
    }

    /* renamed from: a */
    public static C66172f m259103a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234282c();
    }

    /* renamed from: a */
    private void m259105a(MediaCodec.BufferInfo bufferInfo) {
        if (this.f167048s == 0) {
            this.f167048s = bufferInfo.presentationTimeUs;
            bufferInfo.presentationTimeUs = 0;
            return;
        }
        bufferInfo.presentationTimeUs -= this.f167048s;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.feedback.screenrecord.f$b */
    public class HandlerC66176b extends Handler {
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                try {
                    C66172f.this.mo231494d();
                    if (C66172f.this.f167031b != null) {
                        C66172f.this.f167031b.mo231500a();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    message.obj = e;
                }
            } else if (!(i == 1 || i == 2)) {
                return;
            }
            C66172f.this.mo231496f();
            if (message.arg1 != 1) {
                C66172f.this.mo231493c();
            }
            if (C66172f.this.f167031b != null) {
                C66172f.this.f167031b.mo231502a((Throwable) message.obj);
            }
            C66172f.this.mo231498g();
        }

        HandlerC66176b(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: a */
    private void m259106a(boolean z) {
        this.f167030a.sendMessageAtFrontOfQueue(Message.obtain(this.f167030a, 1, z ? 1 : 0, 0));
    }

    /* renamed from: a */
    public void mo231489a(MediaFormat mediaFormat) {
        if (this.f167039j >= 0 || this.f167041l) {
            throw new IllegalStateException("output format already changed!");
        }
        AppBrandLogger.m52830i("tma_ScreenRecorderManager", "Video output format changed.\n New format: " + mediaFormat.toString());
        this.f167038i = mediaFormat;
    }

    /* renamed from: a */
    public void mo231488a(int i, MediaCodec.BufferInfo bufferInfo) {
        if (!this.f167042m.get()) {
            AppBrandLogger.m52831w("tma_ScreenRecorderManager", "muxVideo: Already stopped!");
        } else if (!this.f167041l || this.f167039j == -1) {
            this.f167046q.add(Integer.valueOf(i));
            this.f167047r.add(bufferInfo);
        } else {
            m259104a(this.f167039j, bufferInfo, this.f167037h.mo231459a(i));
            this.f167037h.mo231464b(i);
            if ((bufferInfo.flags & 4) != 0) {
                AppBrandLogger.m52828d("tma_ScreenRecorderManager", "Stop encoder and muxer, since the buffer has been marked with EOS");
                this.f167039j = -1;
                m259106a(true);
            }
        }
    }

    /* renamed from: a */
    private void m259104a(int i, MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        boolean z;
        AbstractC66175a aVar;
        if ((bufferInfo.flags & 2) != 0) {
            AppBrandLogger.m52828d("tma_ScreenRecorderManager", "Ignoring BUFFER_FLAG_CODEC_CONFIG");
            bufferInfo.size = 0;
        }
        if ((bufferInfo.flags & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (bufferInfo.size != 0 || z) {
            if (bufferInfo.presentationTimeUs != 0 && i == this.f167039j) {
                m259105a(bufferInfo);
            }
            AppBrandLogger.m52828d("tma_ScreenRecorderManager", "[" + Thread.currentThread().getId() + "] Got buffer, track=" + i + ", info: size=" + bufferInfo.size + ", presentationTimeUs=" + bufferInfo.presentationTimeUs);
            if (!z && (aVar = this.f167031b) != null) {
                aVar.mo231501a(bufferInfo.presentationTimeUs);
            }
        } else {
            AppBrandLogger.m52828d("tma_ScreenRecorderManager", "info.size == 0, drop it.");
            byteBuffer = null;
        }
        if (byteBuffer != null) {
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            this.f167040k.writeSampleData(i, byteBuffer, bufferInfo);
            AppBrandLogger.m52830i("tma_ScreenRecorderManager", "Sent " + bufferInfo.size + " bytes to MediaMuxer on track " + i);
        }
    }

    /* renamed from: a */
    public void mo231490a(C66177g gVar, int i, MediaProjection mediaProjection, String str) {
        this.f167032c = gVar.f167053a;
        this.f167033d = gVar.f167054b;
        this.f167034e = i;
        this.f167036g = mediaProjection;
        this.f167035f = str;
        this.f167037h = new C66178h(gVar);
    }
}
