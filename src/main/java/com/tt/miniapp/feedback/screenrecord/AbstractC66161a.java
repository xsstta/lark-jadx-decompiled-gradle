package com.tt.miniapp.feedback.screenrecord;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.view.Surface;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.feedback.screenrecord.AbstractC66164b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: com.tt.miniapp.feedback.screenrecord.a */
public abstract class AbstractC66161a implements AbstractC66164b {

    /* renamed from: a */
    public AbstractC66163a f167020a;

    /* renamed from: b */
    private String f167021b;

    /* renamed from: c */
    private MediaCodec f167022c;

    /* renamed from: d */
    private MediaCodec.Callback f167023d = new MediaCodec.Callback() {
        /* class com.tt.miniapp.feedback.screenrecord.AbstractC66161a.C661621 */

        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            AbstractC66161a.this.f167020a.mo231475a(AbstractC66161a.this, codecException);
        }

        public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
            AbstractC66161a.this.f167020a.mo231472a(AbstractC66161a.this, i);
        }

        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            AbstractC66161a.this.f167020a.mo231474a(AbstractC66161a.this, mediaFormat);
        }

        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
            AbstractC66161a.this.f167020a.mo231473a(AbstractC66161a.this, i, bufferInfo);
        }
    };

    /* renamed from: com.tt.miniapp.feedback.screenrecord.a$a */
    public static abstract class AbstractC66163a implements AbstractC66164b.AbstractC66165a {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo231472a(AbstractC66161a aVar, int i) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo231473a(AbstractC66161a aVar, int i, MediaCodec.BufferInfo bufferInfo) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo231474a(AbstractC66161a aVar, MediaFormat mediaFormat) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo231461a(MediaCodec mediaCodec) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract MediaFormat mo231463b();

    /* renamed from: d */
    public void mo231466d() {
        MediaCodec mediaCodec = this.f167022c;
        if (mediaCodec != null) {
            mediaCodec.stop();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final MediaCodec mo231465c() {
        MediaCodec mediaCodec = this.f167022c;
        Objects.requireNonNull(mediaCodec, "doesn't prepare()");
        return mediaCodec;
    }

    /* renamed from: e */
    public void mo231467e() {
        MediaCodec mediaCodec = this.f167022c;
        if (mediaCodec != null) {
            mediaCodec.release();
            this.f167022c = null;
        }
    }

    /* renamed from: a */
    public void mo231460a() throws IOException {
        if (Looper.myLooper() == null || Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("should run in a HandlerThread");
        } else if (this.f167022c == null) {
            MediaFormat b = mo231463b();
            AppBrandLogger.m52828d("tma_BaseEncoder", "Create media format: " + b);
            MediaCodec a = m259074a(b.getString("mime"));
            try {
                if (this.f167020a != null) {
                    a.setCallback(this.f167023d);
                }
                a.configure(b, (Surface) null, (MediaCrypto) null, 1);
                mo231461a(a);
                a.start();
                this.f167022c = a;
            } catch (MediaCodec.CodecException e) {
                AppBrandLogger.m52828d("tma_BaseEncoder", "Configure codec failure!\n  with format" + b, e);
                throw e;
            }
        } else {
            throw new IllegalStateException("prepared!");
        }
    }

    AbstractC66161a(String str) {
        this.f167021b = str;
    }

    /* renamed from: a */
    public final ByteBuffer mo231459a(int i) {
        return mo231465c().getOutputBuffer(i);
    }

    /* renamed from: b */
    public final void mo231464b(int i) {
        mo231465c().releaseOutputBuffer(i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo231462a(AbstractC66163a aVar) {
        if (this.f167022c == null) {
            this.f167020a = aVar;
            return;
        }
        throw new IllegalStateException("mEncoder is not null");
    }

    /* renamed from: a */
    private MediaCodec m259074a(String str) throws IOException {
        try {
            String str2 = this.f167021b;
            if (str2 != null) {
                return MediaCodec.createByCodecName(str2);
            }
        } catch (IOException e) {
            AppBrandLogger.m52831w("tma_BaseEncoder", "Create MediaCodec by name '" + this.f167021b + "' failure!", e);
        }
        return MediaCodec.createEncoderByType(str);
    }
}
