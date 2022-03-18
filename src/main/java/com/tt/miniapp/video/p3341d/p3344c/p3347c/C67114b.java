package com.tt.miniapp.video.p3341d.p3344c.p3347c;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.larksuite.suite.R;
import com.tt.miniapp.util.C67024ac;

/* renamed from: com.tt.miniapp.video.d.c.c.b */
public class C67114b extends AbstractC67113a {

    /* renamed from: d */
    private ProgressBar f169184d;

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.video.p3341d.p3344c.p3347c.AbstractC67113a
    /* renamed from: a */
    public int mo233344a() {
        return R.layout.microapp_m_plugin_bottom_progress;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.video.p3341d.p3344c.p3347c.AbstractC67113a
    /* renamed from: b */
    public int mo233347b() {
        return R.id.microapp_m_video_bottom_progressbar;
    }

    @Override // com.tt.miniapp.video.p3341d.p3344c.p3347c.AbstractC67113a
    /* renamed from: c */
    public void mo233349c() {
        ProgressBar progressBar = this.f169184d;
        if (progressBar != null) {
            progressBar.setProgress(0);
            this.f169184d.setSecondaryProgress(0);
        }
    }

    /* renamed from: a */
    public void mo233350a(int i) {
        ProgressBar progressBar = this.f169184d;
        if (progressBar != null) {
            progressBar.setSecondaryProgress(i);
        }
    }

    /* renamed from: a */
    public void mo233351a(int i, int i2) {
        ProgressBar progressBar = this.f169184d;
        if (progressBar != null) {
            progressBar.setProgress(C67024ac.m261230a(i, i2));
        }
    }

    @Override // com.tt.miniapp.video.p3341d.p3344c.p3347c.AbstractC67113a
    /* renamed from: a */
    public void mo233345a(Context context, ViewGroup viewGroup) {
        super.mo233345a(context, viewGroup);
        this.f169183c = true;
        if (this.f169181a != null) {
            this.f169184d = (ProgressBar) this.f169181a.findViewById(R.id.microapp_m_video_bottom_progressbar);
        }
    }
}
