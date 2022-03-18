package com.tt.miniapp.video.p3341d.p3344c.p3347c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.larksuite.suite.R;
import com.tt.miniapphost.util.C67590h;

/* renamed from: com.tt.miniapp.video.d.c.c.d */
public class View$OnClickListenerC67118d extends AbstractC67113a implements View.OnClickListener {

    /* renamed from: d */
    private ImageView f169202d;

    /* renamed from: e */
    private AbstractC67119a f169203e;

    /* renamed from: f */
    private boolean f169204f;

    /* renamed from: g */
    private boolean f169205g;

    /* renamed from: h */
    private boolean f169206h;

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.video.d.c.c.d$a */
    public interface AbstractC67119a {
        /* renamed from: a */
        void mo233379a(boolean z);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.video.p3341d.p3344c.p3347c.AbstractC67113a
    /* renamed from: a */
    public int mo233344a() {
        return R.layout.microapp_m_plugin_center_toolbar;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.video.p3341d.p3344c.p3347c.AbstractC67113a
    /* renamed from: b */
    public int mo233347b() {
        return R.id.video_middle_layout;
    }

    @Override // com.tt.miniapp.video.p3341d.p3344c.p3347c.AbstractC67113a
    /* renamed from: c */
    public void mo233349c() {
        super.mo233349c();
        mo233375a(false, false);
    }

    /* renamed from: d */
    private int m261665d() {
        if (this.f169204f) {
            if (this.f169206h) {
                return R.drawable.microapp_m_material_fullscreen_pause;
            }
            return R.drawable.microapp_m_material_pause;
        } else if (this.f169205g) {
            if (this.f169206h) {
                return R.drawable.microapp_m_material_fullscreen_replay;
            }
            return R.drawable.microapp_m_material_replay;
        } else if (this.f169206h) {
            return R.drawable.microapp_m_material_fullscreen_play;
        } else {
            return R.drawable.microapp_m_material_play;
        }
    }

    /* renamed from: a */
    public void mo233374a(AbstractC67119a aVar) {
        this.f169203e = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo233376c(boolean z) {
        int i;
        ImageView imageView = this.f169202d;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C67590h.m263079a(imageView, i);
    }

    /* renamed from: d */
    public void mo233377d(boolean z) {
        if (this.f169206h != z) {
            this.f169206h = z;
            mo233375a(this.f169204f, this.f169205g);
        }
    }

    public void onClick(View view) {
        AbstractC67119a aVar;
        if (view.getId() == R.id.microapp_m_video_play && (aVar = this.f169203e) != null) {
            aVar.mo233379a(!this.f169204f);
        }
    }

    /* renamed from: a */
    public void mo233375a(boolean z, boolean z2) {
        this.f169205g = z2;
        this.f169204f = z;
        ImageView imageView = this.f169202d;
        if (imageView != null) {
            imageView.setImageResource(m261665d());
        }
    }

    @Override // com.tt.miniapp.video.p3341d.p3344c.p3347c.AbstractC67113a
    /* renamed from: a */
    public void mo233345a(Context context, ViewGroup viewGroup) {
        super.mo233345a(context, viewGroup);
        if (this.f169181a != null) {
            ImageView imageView = (ImageView) this.f169181a.findViewById(R.id.microapp_m_video_play);
            this.f169202d = imageView;
            imageView.setOnClickListener(this);
        }
    }
}
