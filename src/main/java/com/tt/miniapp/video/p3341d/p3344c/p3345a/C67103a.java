package com.tt.miniapp.video.p3341d.p3344c.p3345a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.suite.R;
import com.tt.miniapp.video.view.widget.RotateImageView;
import com.tt.miniapphost.util.C67590h;

/* renamed from: com.tt.miniapp.video.d.c.a.a */
public class C67103a {

    /* renamed from: a */
    public AbstractC67105a f169157a;

    /* renamed from: b */
    private RotateImageView f169158b;

    /* renamed from: c */
    private View f169159c;

    /* renamed from: d */
    private View f169160d;

    /* renamed from: e */
    private TextView f169161e;

    /* renamed from: f */
    private TextView f169162f;

    /* renamed from: g */
    private boolean f169163g;

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.video.d.c.a.a$a */
    public interface AbstractC67105a {
        /* renamed from: a */
        void mo233327a();
    }

    /* renamed from: a */
    public void mo233320a() {
        if (this.f169163g) {
            m261595a(60, R.drawable.microapp_m_video_loading_fullscreen);
            m261597b(18, 18);
            m261596a(108, 42, 18, R.drawable.microapp_m_material_video_retry_bg_fullscreen);
            return;
        }
        m261595a(44, R.drawable.microapp_m_video_loading);
        m261597b(14, 14);
        m261596a(84, 32, 14, R.drawable.microapp_m_material_video_retry_bg);
    }

    /* renamed from: a */
    public void mo233322a(AbstractC67105a aVar) {
        this.f169157a = aVar;
    }

    /* renamed from: c */
    public void mo233325c(boolean z) {
        this.f169163g = z;
        mo233320a();
    }

    /* renamed from: b */
    public void mo233324b(boolean z) {
        int i = 0;
        AppBrandLogger.m52828d("tma_VideoLoadingLayout", "showRetry ", Boolean.valueOf(z));
        C67590h.m263079a(this.f169158b, 4);
        if (z) {
            C67590h.m263079a(this.f169160d, 0);
        } else {
            C67590h.m263079a(this.f169160d, 4);
        }
        View view = this.f169159c;
        if (!z) {
            i = 4;
        }
        C67590h.m263079a(view, i);
    }

    /* renamed from: a */
    public void mo233323a(boolean z) {
        int i = 0;
        AppBrandLogger.m52828d("tma_VideoLoadingLayout", "showLoading ", Boolean.valueOf(z));
        C67590h.m263079a(this.f169160d, 4);
        if (z) {
            C67590h.m263079a(this.f169158b, 0);
            RotateImageView rotateImageView = this.f169158b;
            if (rotateImageView != null) {
                rotateImageView.mo233407a();
            }
        } else {
            C67590h.m263079a(this.f169158b, 4);
            RotateImageView rotateImageView2 = this.f169158b;
            if (rotateImageView2 != null) {
                rotateImageView2.mo233408b();
            }
        }
        View view = this.f169159c;
        if (!z) {
            i = 4;
        }
        C67590h.m263079a(view, i);
    }

    /* renamed from: a */
    private void m261595a(int i, int i2) {
        RotateImageView rotateImageView = this.f169158b;
        if (rotateImageView != null) {
            Context context = rotateImageView.getContext();
            ViewGroup.LayoutParams layoutParams = this.f169158b.getLayoutParams();
            if (layoutParams != null) {
                float f = (float) i;
                layoutParams.width = (int) C67590h.m263065a(context, f);
                layoutParams.height = (int) C67590h.m263065a(context, f);
                this.f169158b.setLayoutParams(layoutParams);
            }
            this.f169158b.setImageResource(i2);
        }
    }

    /* renamed from: b */
    private void m261597b(int i, int i2) {
        TextView textView = this.f169161e;
        if (textView != null) {
            Context context = textView.getContext();
            this.f169161e.setTextSize(2, (float) i);
            ViewGroup.LayoutParams layoutParams = this.f169161e.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) C67590h.m263065a(context, (float) i2);
                this.f169161e.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: a */
    public void mo233321a(Context context, ViewGroup viewGroup) {
        if (context != null && viewGroup != null) {
            LayoutInflater.from(context).inflate(R.layout.microapp_m_plugin_loading_layout, viewGroup, true);
            View findViewById = viewGroup.findViewById(R.id.microapp_m_video_loading_layout);
            this.f169159c = findViewById;
            this.f169158b = (RotateImageView) findViewById.findViewById(R.id.microapp_m_video_loading_progress);
            View findViewById2 = this.f169159c.findViewById(R.id.microapp_m_video_loading_retry);
            this.f169160d = findViewById2;
            findViewById2.setOnClickListener(new View.OnClickListener() {
                /* class com.tt.miniapp.video.p3341d.p3344c.p3345a.C67103a.View$OnClickListenerC671041 */

                public void onClick(View view) {
                    if (C67103a.this.f169157a != null) {
                        C67103a.this.f169157a.mo233327a();
                    }
                }
            });
            this.f169161e = (TextView) this.f169159c.findViewById(R.id.microapp_m_video_retry_tips);
            this.f169162f = (TextView) this.f169159c.findViewById(R.id.microapp_m_video_retry);
            mo233320a();
        }
    }

    /* renamed from: a */
    private void m261596a(int i, int i2, int i3, int i4) {
        TextView textView = this.f169162f;
        if (textView != null) {
            Context context = textView.getContext();
            ViewGroup.LayoutParams layoutParams = this.f169162f.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = (int) C67590h.m263065a(context, (float) i);
                layoutParams.height = (int) C67590h.m263065a(context, (float) i2);
                this.f169162f.setLayoutParams(layoutParams);
            }
            this.f169162f.setTextSize(2, (float) i3);
            this.f169162f.setBackgroundResource(i4);
        }
    }
}
