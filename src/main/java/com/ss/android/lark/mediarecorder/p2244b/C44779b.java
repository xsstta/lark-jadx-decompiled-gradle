package com.ss.android.lark.mediarecorder.p2244b;

import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mediarecorder.view.C44830a;

/* renamed from: com.ss.android.lark.mediarecorder.b.b */
public class C44779b implements AbstractC44784e {

    /* renamed from: a */
    private final String f113400a = "BorrowVideoState";

    /* renamed from: b */
    private C44780c f113401b;

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: a */
    public void mo158523a() {
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: a */
    public void mo158524a(float f, float f2, C44830a.AbstractC44840c cVar) {
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: a */
    public void mo158526a(Surface surface, float f) {
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: a */
    public void mo158528a(String str) {
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: a */
    public void mo158529a(boolean z, long j) {
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: b */
    public void mo158531b(SurfaceHolder surfaceHolder, float f) {
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: b */
    public void mo158530b() {
        this.f113401b.mo158534c().mo158617b(2);
        C44780c cVar = this.f113401b;
        cVar.mo158533a(cVar.mo158538g());
    }

    public C44779b(C44780c cVar) {
        this.f113401b = cVar;
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: a */
    public void mo158525a(float f, int i) {
        Log.m165379d("BorrowVideoState", "zoom");
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: c */
    public void mo158532c(SurfaceHolder surfaceHolder, float f) {
        this.f113401b.mo158534c().mo158611a(2);
        C44780c cVar = this.f113401b;
        cVar.mo158533a(cVar.mo158538g());
    }

    @Override // com.ss.android.lark.mediarecorder.p2244b.AbstractC44784e
    /* renamed from: a */
    public void mo158527a(SurfaceHolder surfaceHolder, float f) {
        C44830a.m177740a().mo158664b(surfaceHolder, f);
        C44780c cVar = this.f113401b;
        cVar.mo158533a(cVar.mo158538g());
    }
}
