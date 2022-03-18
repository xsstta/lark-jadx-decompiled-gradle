package com.tt.miniapp.video.p3341d.p3344c.p3346b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.larksuite.suite.R;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.C67590h;

/* renamed from: com.tt.miniapp.video.d.c.b.a */
public class C67108a {

    /* renamed from: a */
    public boolean f169168a;

    /* renamed from: b */
    protected View f169169b;

    /* renamed from: c */
    public AbstractC67110a f169170c;

    /* renamed from: d */
    private boolean f169171d;

    /* renamed from: e */
    private boolean f169172e;

    /* renamed from: f */
    private boolean f169173f = true;

    /* renamed from: g */
    private ImageView f169174g;

    /* renamed from: h */
    private ImageView f169175h;

    /* renamed from: i */
    private String f169176i;

    /* renamed from: j */
    private String f169177j;

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.video.d.c.b.a$a */
    public interface AbstractC67110a {
        /* renamed from: a */
        void mo233342a(View view);
    }

    /* renamed from: b */
    public boolean mo233338b() {
        return this.f169171d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo233331a() {
        if (this.f169168a) {
            this.f169168a = false;
            m261612c();
        }
    }

    /* renamed from: c */
    private void m261612c() {
        if (this.f169173f || !this.f169172e || this.f169168a) {
            C67590h.m263079a(this.f169175h, 4);
        } else {
            C67590h.m263079a(this.f169175h, 0);
        }
    }

    /* renamed from: a */
    public void mo233333a(AbstractC67110a aVar) {
        this.f169170c = aVar;
    }

    /* renamed from: a */
    public void mo233335a(boolean z) {
        this.f169172e = z;
        m261612c();
    }

    /* renamed from: b */
    public void mo233337b(boolean z) {
        this.f169173f = z;
        m261612c();
    }

    /* renamed from: d */
    public void mo233340d(boolean z) {
        int i;
        View view = this.f169169b;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        C67590h.m263079a(view, i);
        if (!z) {
            this.f169168a = true;
            m261612c();
        }
    }

    /* renamed from: b */
    public void mo233336b(String str) {
        if (TextUtils.isEmpty(str)) {
            C67590h.m263079a(this.f169174g, 4);
            return;
        }
        C67590h.m263079a(this.f169174g, 0);
        if (!str.equals(this.f169176i)) {
            this.f169176i = str;
            HostDependManager.getInst().loadImage(this.f169169b.getContext(), this.f169174g, Uri.parse(this.f169176i));
        }
    }

    /* renamed from: c */
    public void mo233339c(boolean z) {
        int i;
        if (this.f169171d != z) {
            this.f169171d = z;
            if (this.f169175h.getVisibility() == 0) {
                ImageView imageView = this.f169175h;
                if (this.f169171d) {
                    i = R.drawable.microapp_m_material_fullscreen_play;
                } else {
                    i = R.drawable.microapp_m_material_play;
                }
                imageView.setImageResource(i);
            }
        }
    }

    /* renamed from: a */
    public void mo233334a(String str) {
        if (!TextUtils.equals(this.f169177j, str) && str != null) {
            this.f169177j = str;
            str.hashCode();
            if (str.equals("fill")) {
                this.f169174g.setScaleType(ImageView.ScaleType.FIT_XY);
            } else if (!str.equals("cover")) {
                this.f169174g.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else {
                this.f169174g.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        }
    }

    /* renamed from: a */
    public void mo233332a(Context context, ViewGroup viewGroup) {
        if (context != null && viewGroup != null) {
            LayoutInflater.from(context).inflate(R.layout.microapp_m_plugin_poster, viewGroup, true);
            View findViewById = viewGroup.findViewById(R.id.video_poster_layout);
            this.f169169b = findViewById;
            this.f169174g = (ImageView) findViewById.findViewById(R.id.microapp_m_video_poster_image);
            ImageView imageView = (ImageView) this.f169169b.findViewById(R.id.microapp_m_video_poster_play);
            this.f169175h = imageView;
            imageView.setOnClickListener(new View.OnClickListener() {
                /* class com.tt.miniapp.video.p3341d.p3344c.p3346b.C67108a.View$OnClickListenerC671091 */

                public void onClick(View view) {
                    if (C67108a.this.f169170c != null) {
                        C67108a.this.f169170c.mo233342a(null);
                    }
                }
            });
        }
    }
}
