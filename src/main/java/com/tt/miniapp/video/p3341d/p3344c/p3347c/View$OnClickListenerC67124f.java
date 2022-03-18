package com.tt.miniapp.video.p3341d.p3344c.p3347c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.util.C67047m;
import com.tt.miniapphost.util.C67590h;

/* renamed from: com.tt.miniapp.video.d.c.c.f */
public class View$OnClickListenerC67124f extends AbstractC67113a implements View.OnClickListener {

    /* renamed from: d */
    private ImageView f169223d;

    /* renamed from: e */
    private AbstractC67125a f169224e;

    /* renamed from: f */
    private boolean f169225f;

    /* renamed from: g */
    private IAppContext f169226g;

    /* renamed from: com.tt.miniapp.video.d.c.c.f$a */
    public interface AbstractC67125a {
        /* renamed from: a */
        void mo233385a();
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.video.p3341d.p3344c.p3347c.AbstractC67113a
    /* renamed from: a */
    public int mo233344a() {
        return R.layout.microapp_m_plugin_top_toolbar;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.video.p3341d.p3344c.p3347c.AbstractC67113a
    /* renamed from: b */
    public int mo233347b() {
        return R.id.microapp_m_video_top_layout;
    }

    /* renamed from: d */
    private void m261694d() {
        if (this.f169225f) {
            C67590h.m263079a(this.f169223d, 0);
        } else {
            C67590h.m263079a(this.f169223d, 4);
        }
    }

    public View$OnClickListenerC67124f(IAppContext iAppContext) {
        this.f169226g = iAppContext;
    }

    /* renamed from: a */
    public void mo233386a(AbstractC67125a aVar) {
        this.f169224e = aVar;
    }

    /* renamed from: c */
    public void mo233387c(boolean z) {
        this.f169225f = z;
        m261694d();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.microapp_m_video_fullscreen_back) {
            C67047m.m261304a(this.f169226g.getCurrentActivity());
            AbstractC67125a aVar = this.f169224e;
            if (aVar != null) {
                aVar.mo233385a();
            }
        }
    }

    @Override // com.tt.miniapp.video.p3341d.p3344c.p3347c.AbstractC67113a
    /* renamed from: a */
    public void mo233345a(Context context, ViewGroup viewGroup) {
        super.mo233345a(context, viewGroup);
        if (this.f169181a != null) {
            ImageView imageView = (ImageView) this.f169181a.findViewById(R.id.microapp_m_video_fullscreen_back);
            this.f169223d = imageView;
            imageView.setOnClickListener(this);
            m261694d();
        }
    }
}
