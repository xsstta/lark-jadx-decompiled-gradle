package com.ss.android.lark.mediarecorder.p2244b;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.android.lark.mediarecorder.p2245c.C44796g;
import com.ss.android.lark.mediarecorder.view.AbstractC44851c;
import com.ss.android.lark.mediarecorder.view.C44830a;

/* renamed from: com.ss.android.lark.mediarecorder.b.c */
public class C44780c implements AbstractC44784e {

    /* renamed from: a */
    private Context f113402a;

    /* renamed from: b */
    private AbstractC44784e f113403b = this.f113405d;

    /* renamed from: c */
    private AbstractC44851c f113404c;

    /* renamed from: d */
    private AbstractC44784e f113405d = new C44781d(this);

    /* renamed from: e */
    private AbstractC44784e f113406e = new C44778a(this);

    /* renamed from: f */
    private AbstractC44784e f113407f = new C44779b(this);

    /* renamed from: c */
    public AbstractC44851c mo158534c() {
        return this.f113404c;
    }

    /* renamed from: d */
    public Context mo158535d() {
        return this.f113402a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public AbstractC44784e mo158536e() {
        return this.f113406e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public AbstractC44784e mo158537f() {
        return this.f113407f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public AbstractC44784e mo158538g() {
        return this.f113405d;
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: a */
    public void mo158523a() {
        this.f113403b.mo158523a();
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: b */
    public void mo158530b() {
        this.f113403b.mo158530b();
    }

    /* renamed from: a */
    public void mo158533a(AbstractC44784e eVar) {
        this.f113403b = eVar;
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: a */
    public void mo158528a(String str) {
        C44796g.m177637c("CameraMachine->flash mode: " + str);
        this.f113403b.mo158528a(str);
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: b */
    public void mo158531b(SurfaceHolder surfaceHolder, float f) {
        C44796g.m177637c("CameraMachine->swtich: ");
        this.f113403b.mo158531b(surfaceHolder, f);
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: a */
    public void mo158526a(Surface surface, float f) {
        C44796g.m177637c("CameraMachine->record screenProp: " + f);
        this.f113403b.mo158526a(surface, f);
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: c */
    public void mo158532c(SurfaceHolder surfaceHolder, float f) {
        C44796g.m177637c("CameraMachine->cancle screenProp: " + f);
        this.f113403b.mo158532c(surfaceHolder, f);
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: a */
    public void mo158525a(float f, int i) {
        C44796g.m177637c("CameraMachine->zoom: " + f + " type" + i);
        this.f113403b.mo158525a(f, i);
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: a */
    public void mo158527a(SurfaceHolder surfaceHolder, float f) {
        C44796g.m177637c("CameraMachine->start screenProp: " + f);
        this.f113403b.mo158527a(surfaceHolder, f);
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: a */
    public void mo158529a(boolean z, long j) {
        C44796g.m177637c("CameraMachine->stopRecord isShort: " + z + " time:" + j);
        this.f113403b.mo158529a(z, j);
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: a */
    public void mo158524a(float f, float f2, C44830a.AbstractC44840c cVar) {
        C44796g.m177637c("CameraMachine->foucs: ");
        this.f113403b.mo158524a(f, f2, cVar);
    }

    public C44780c(Context context, AbstractC44851c cVar, C44830a.AbstractC44838a aVar) {
        this.f113402a = context;
        this.f113404c = cVar;
    }
}
