package com.ss.android.lark.mm.module.player.core;

import android.content.Context;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.videoshop.api.AbstractC64095d;
import com.ss.android.videoshop.context.VideoContext;
import com.ss.android.videoshop.p3195b.C64116b;
import com.ss.ttvideoengine.TTVideoEngine;

/* renamed from: com.ss.android.lark.mm.module.player.core.m */
public class C46684m implements AbstractC64095d {

    /* renamed from: a */
    public boolean f117430a;

    /* renamed from: b */
    public int f117431b;

    /* renamed from: c */
    public boolean f117432c;

    /* renamed from: d */
    public int f117433d;

    /* renamed from: e */
    public boolean f117434e;

    /* renamed from: f */
    public int f117435f;

    /* renamed from: g */
    public int f117436g;

    /* renamed from: h */
    public boolean f117437h;

    /* renamed from: com.ss.android.lark.mm.module.player.core.m$a */
    public static class C46686a {

        /* renamed from: a */
        private C46684m f117438a = new C46684m();

        /* renamed from: a */
        public C46684m mo163948a() {
            return this.f117438a;
        }

        /* renamed from: a */
        public C46686a mo163946a(boolean z) {
            this.f117438a.f117432c = z;
            return this;
        }

        /* renamed from: b */
        public C46686a mo163949b(boolean z) {
            this.f117438a.f117437h = z;
            return this;
        }

        /* renamed from: a */
        public C46686a mo163944a(int i) {
            this.f117438a.f117433d = i;
            this.f117438a.f117434e = true;
            return this;
        }

        /* renamed from: a */
        public C46686a mo163945a(int i, int i2) {
            this.f117438a.f117435f = i;
            this.f117438a.f117436g = i2;
            return this;
        }

        /* renamed from: a */
        public C46686a mo163947a(boolean z, int i) {
            this.f117438a.f117430a = z;
            this.f117438a.f117431b = i;
            return this;
        }
    }

    private C46684m() {
    }

    @Override // com.ss.android.videoshop.api.AbstractC64095d
    /* renamed from: a */
    public TTVideoEngine mo163943a(Context context, int i, C64116b bVar, VideoContext videoContext) {
        TTVideoEngine tTVideoEngine = new TTVideoEngine(context, i);
        if (this.f117432c) {
            tTVideoEngine.setIntOption(160, 1);
            tTVideoEngine.setIntOption(28, 3);
        }
        if (this.f117434e) {
            tTVideoEngine.setIntOption(161, this.f117433d);
        }
        if (this.f117430a) {
            if (this.f117431b == MmVideoEncodingType.H264.getValue()) {
                tTVideoEngine.setIntOption(7, 1);
                tTVideoEngine.setAsyncInit(true, 0);
            } else if (this.f117431b == MmVideoEncodingType.H265.getValue()) {
                tTVideoEngine.setIntOption(7, 1);
                tTVideoEngine.setAsyncInit(true, 1);
            }
        }
        if (this.f117437h) {
            C45855f.m181664c("MmVideoEngineFactory", "nearestMaxPosOffset: " + this.f117435f + ", cacheMaxSeconds: " + this.f117436g);
            tTVideoEngine.setCacheControlEnabled(true);
            tTVideoEngine.setIntOption(SmEvents.EVENT_HBRESET, 1);
            tTVideoEngine.setIntOption(954, this.f117435f);
            tTVideoEngine.setIntOption(0, this.f117436g);
        } else {
            C45855f.m181664c("MmVideoEngineFactory", "disable nearestCache");
        }
        return tTVideoEngine;
    }
}
