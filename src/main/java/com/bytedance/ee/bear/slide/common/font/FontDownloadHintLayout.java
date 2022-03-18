package com.bytedance.ee.bear.slide.common.font;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.text.DecimalFormat;

public class FontDownloadHintLayout extends FrameLayout {

    /* renamed from: a */
    private TextView f30683a;

    /* renamed from: b */
    private ImageView f30684b;

    /* renamed from: c */
    private LinearLayout f30685c;

    /* renamed from: d */
    private ProgressBar f30686d;

    /* renamed from: e */
    private LinearLayout f30687e;

    /* renamed from: f */
    private TextView f30688f;

    /* renamed from: g */
    private ImageView f30689g;

    /* renamed from: h */
    private LinearLayout f30690h;

    /* renamed from: i */
    private LinearLayout f30691i;

    /* renamed from: j */
    private TextView f30692j;

    /* renamed from: k */
    private View.OnClickListener f30693k;

    /* renamed from: l */
    private View.OnClickListener f30694l;

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m47428e() {
        this.f30691i.setVisibility(8);
    }

    /* renamed from: b */
    public void mo43707b() {
        this.f30685c.setVisibility(8);
        this.f30687e.setVisibility(8);
        this.f30690h.setVisibility(0);
        this.f30691i.setVisibility(8);
    }

    /* renamed from: c */
    public void mo43708c() {
        this.f30685c.setVisibility(8);
        this.f30687e.setVisibility(8);
        this.f30690h.setVisibility(8);
        this.f30691i.setVisibility(8);
    }

    /* renamed from: a */
    public void mo43704a() {
        this.f30685c.setVisibility(8);
        this.f30687e.setVisibility(8);
        this.f30690h.setVisibility(8);
        this.f30691i.setVisibility(0);
        this.f30691i.postDelayed(new Runnable() {
            /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$FontDownloadHintLayout$TA07vpXgefVacO8BUcrtdLQK7pM */

            public final void run() {
                FontDownloadHintLayout.this.m47428e();
            }
        }, 1000);
    }

    /* renamed from: d */
    private void m47427d() {
        LayoutInflater.from(getContext()).inflate(R.layout.slide_font_download_hint_layout, this);
        this.f30683a = (TextView) findViewById(R.id.slide_download_font_hint_text);
        this.f30684b = (ImageView) findViewById(R.id.slide_download_font_btn);
        this.f30685c = (LinearLayout) findViewById(R.id.slide_download_font_hint_layout);
        this.f30686d = (ProgressBar) findViewById(R.id.slide_download_font_progress_bar);
        this.f30692j = (TextView) findViewById(R.id.slide_download_font_progress_text);
        this.f30687e = (LinearLayout) findViewById(R.id.slide_download_font_progress_layout);
        this.f30688f = (TextView) findViewById(R.id.slide_download_font_retry_text);
        this.f30689g = (ImageView) findViewById(R.id.slide_download_font_retry_btn);
        this.f30690h = (LinearLayout) findViewById(R.id.slide_download_font_retry_layout);
        this.f30691i = (LinearLayout) findViewById(R.id.slide_download_font_success_layout);
        this.f30684b.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$FontDownloadHintLayout$uG4gTC58i_zG4Qw1iWHx0W21lRw */

            public final void onClick(View view) {
                FontDownloadHintLayout.this.m47426b(view);
            }
        });
        this.f30689g.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$FontDownloadHintLayout$uCYh5iAZ17rhtaMC0TMhgwdOiu4 */

            public final void onClick(View view) {
                FontDownloadHintLayout.this.m47425a((FontDownloadHintLayout) view);
            }
        });
    }

    public void setOnDownloadClickListener(View.OnClickListener onClickListener) {
        this.f30694l = onClickListener;
    }

    public void setOnRetryClickListener(View.OnClickListener onClickListener) {
        this.f30693k = onClickListener;
    }

    public FontDownloadHintLayout(Context context) {
        super(context);
        m47427d();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m47425a(View view) {
        View.OnClickListener onClickListener = this.f30693k;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m47426b(View view) {
        View.OnClickListener onClickListener = this.f30694l;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* renamed from: a */
    public void mo43705a(int i) {
        this.f30685c.setVisibility(8);
        this.f30687e.setVisibility(0);
        this.f30690h.setVisibility(8);
        this.f30691i.setVisibility(8);
        Context context = getContext();
        this.f30692j.setText(C10539a.m43639a(context, R.string.Slide_Slide_DownloadPercent, "percent", i + ""));
        this.f30686d.setProgress(i);
    }

    /* renamed from: a */
    public void mo43706a(long j) {
        String str;
        this.f30685c.setVisibility(0);
        this.f30687e.setVisibility(8);
        this.f30690h.setVisibility(8);
        this.f30691i.setVisibility(8);
        double d = ((double) j) / 1024.0d;
        if (d > 10.0d) {
            try {
                str = String.valueOf((int) d);
            } catch (Exception e) {
                C13479a.m54759a("FontDownloadHintLayout", "urlSize format err", e);
                str = "";
            }
        } else {
            str = new DecimalFormat("#.#").format(d);
        }
        this.f30683a.setText(C10539a.m43639a(getContext(), R.string.Slide_Slide_FontDownloadHint, "size", str));
    }

    public FontDownloadHintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m47427d();
    }

    public FontDownloadHintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m47427d();
    }
}
