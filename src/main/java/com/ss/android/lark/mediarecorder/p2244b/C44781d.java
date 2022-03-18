package com.ss.android.lark.mediarecorder.p2244b;

import android.graphics.Bitmap;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.android.lark.mediarecorder.p2245c.C44796g;
import com.ss.android.lark.mediarecorder.view.C44830a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mediarecorder.b.d */
public class C44781d implements AbstractC44784e {

    /* renamed from: a */
    public C44780c f113408a;

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: b */
    public void mo158530b() {
        C44796g.m177637c("PreviewState->preview state, no confirm event");
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: a */
    public void mo158523a() {
        C44796g.m177637c("PreviewState->capture");
        C44830a.m177740a().mo158656a(new C44830a.AbstractC44842e() {
            /* class com.ss.android.lark.mediarecorder.p2244b.C44781d.C447821 */

            @Override // com.ss.android.lark.mediarecorder.view.C44830a.AbstractC44842e
            /* renamed from: a */
            public void mo158539a(Bitmap bitmap, boolean z) {
                C44781d.this.f113408a.mo158534c().mo158613a(bitmap, z);
                C44781d.this.f113408a.mo158533a(C44781d.this.f113408a.mo158536e());
                C44796g.m177637c("capture");
            }
        });
    }

    C44781d(C44780c cVar) {
        this.f113408a = cVar;
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: a */
    public void mo158528a(String str) {
        C44796g.m177637c("PreviewState->flash mode: " + str);
        C44830a.m177740a().mo158665b(str);
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: c */
    public void mo158532c(SurfaceHolder surfaceHolder, float f) {
        C44796g.m177637c("PreviewState->preview state, no cancel event");
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: b */
    public void mo158531b(SurfaceHolder surfaceHolder, float f) {
        C44796g.m177637c("PreviewState->swtich screenProp: " + f);
        C44830a.m177740a().mo158652a(surfaceHolder, f);
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: a */
    public void mo158525a(float f, int i) {
        C44796g.m177637c("PreviewState->zoom: " + f + " type" + i);
        C44830a.m177740a().mo158647a(f, i);
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: a */
    public void mo158526a(Surface surface, float f) {
        C44796g.m177637c("PreviewState->record  screenProp: " + f);
        C44830a.m177740a().mo158651a(surface, f, (C44830a.AbstractC44839b) null);
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: a */
    public void mo158527a(SurfaceHolder surfaceHolder, float f) {
        C44796g.m177637c("PreviewState->start screenProp: " + f);
        C44830a.m177740a().mo158664b(surfaceHolder, f);
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: a */
    public void mo158529a(final boolean z, long j) {
        C44796g.m177637c("PreviewState->stopRecord isShort: " + z + " time:" + j);
        C44830a.m177740a().mo158659a(z, new C44830a.AbstractC44841d() {
            /* class com.ss.android.lark.mediarecorder.p2244b.C44781d.C447832 */

            @Override // com.ss.android.lark.mediarecorder.view.C44830a.AbstractC44841d
            /* renamed from: a */
            public void mo158540a(String str, Bitmap bitmap) {
                if (z) {
                    C44781d.this.f113408a.mo158534c().mo158611a(3);
                    return;
                }
                C44781d.this.f113408a.mo158534c().mo158612a(bitmap, str);
                C44781d.this.f113408a.mo158533a(C44781d.this.f113408a.mo158537f());
            }
        });
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: a */
    public void mo158524a(float f, float f2, C44830a.AbstractC44840c cVar) {
        C44796g.m177637c("PreviewState->preview state foucs");
        if (this.f113408a.mo158534c().mo158614a(f, f2)) {
            C44830a.m177740a().mo158650a(this.f113408a.mo158535d(), f, f2, cVar);
        }
    }
}
