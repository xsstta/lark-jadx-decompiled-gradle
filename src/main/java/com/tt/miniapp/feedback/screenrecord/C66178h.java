package com.tt.miniapp.feedback.screenrecord;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.util.Objects;

/* renamed from: com.tt.miniapp.feedback.screenrecord.h */
public class C66178h extends AbstractC66161a {

    /* renamed from: b */
    private C66177g f167061b;

    /* renamed from: c */
    private Surface f167062c;

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.feedback.screenrecord.AbstractC66161a
    /* renamed from: b */
    public MediaFormat mo231463b() {
        return this.f167061b.mo231504a();
    }

    @Override // com.tt.miniapp.feedback.screenrecord.AbstractC66161a
    /* renamed from: e */
    public void mo231467e() {
        Surface surface = this.f167062c;
        if (surface != null) {
            surface.release();
            this.f167062c = null;
        }
        super.mo231467e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Surface mo231506f() {
        Surface surface = this.f167062c;
        Objects.requireNonNull(surface, "doesn't prepare()");
        return surface;
    }

    C66178h(C66177g gVar) {
        super(gVar.f167058f);
        this.f167061b = gVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.feedback.screenrecord.AbstractC66161a
    /* renamed from: a */
    public void mo231461a(MediaCodec mediaCodec) {
        this.f167062c = mediaCodec.createInputSurface();
        AppBrandLogger.m52828d("tma_VideoEncoder", "VideoEncoder create input surface: " + this.f167062c);
    }
}
