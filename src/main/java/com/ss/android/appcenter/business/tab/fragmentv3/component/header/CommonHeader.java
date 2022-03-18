package com.ss.android.appcenter.business.tab.fragmentv3.component.header;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.p1268b.C27688a;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;

public class CommonHeader extends FrameLayout {

    /* renamed from: a */
    private TextView f70274a;

    /* renamed from: b */
    private ImageView f70275b;

    /* renamed from: c */
    private ImageView f70276c;

    /* renamed from: d */
    private ImageView f70277d;

    /* renamed from: e */
    private ImageView f70278e;

    /* renamed from: f */
    private View f70279f;

    /* renamed from: g */
    private View f70280g;

    /* renamed from: h */
    private View f70281h;

    /* renamed from: i */
    private View f70282i;

    /* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.component.header.CommonHeader$b */
    public static class C28077b {

        /* renamed from: a */
        public boolean f70286a;

        /* renamed from: b */
        public boolean f70287b;

        /* renamed from: c */
        public String f70288c;

        /* renamed from: d */
        public String f70289d;

        /* renamed from: e */
        public String f70290e;

        /* renamed from: f */
        public C28076a f70291f;

        /* renamed from: g */
        public String f70292g;

        public C28077b() {
        }

        public String toString() {
            return String.format("Model{isTitleInside=%s, showHeader=%s, title='%s', titleIconUrl='%s', schema='%s', extra=%s, bizComponentType='%s'}", Boolean.valueOf(this.f70286a), Boolean.valueOf(this.f70287b), this.f70288c, this.f70289d, this.f70290e, this.f70291f, this.f70292g);
        }

        public C28077b(String str, String str2, String str3, boolean z, boolean z2, String str4) {
            this.f70288c = str;
            this.f70289d = str2;
            this.f70290e = str3;
            this.f70286a = z;
            this.f70287b = z2;
            this.f70292g = str4;
        }
    }

    /* renamed from: a */
    public void mo99945a() {
        this.f70275b = this.f70277d;
    }

    /* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.component.header.CommonHeader$a */
    public static class C28076a {

        /* renamed from: a */
        public int f70283a;

        /* renamed from: b */
        public int f70284b;

        /* renamed from: c */
        public int f70285c;

        public C28076a(int i) {
            this.f70285c = i;
        }

        public C28076a(int i, int i2) {
            this.f70283a = i;
            this.f70284b = i2;
        }
    }

    public CommonHeader(Context context) {
        this(context, null);
    }

    public void setTitle(String str) {
        this.f70274a.setText(str);
    }

    /* renamed from: a */
    public static int m102627a(boolean z) {
        if (z) {
            return C28209p.m103291a(44.0f);
        }
        return C28209p.m103291a(40.0f);
    }

    public void setTitleIconUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f70275b.setVisibility(0);
            if (URLUtil.isNetworkUrl(str)) {
                C27688a.m101213a(str, this.f70275b);
            } else {
                C27688a.m101209a(getContext(), str, this.f70275b);
            }
        } else {
            this.f70275b.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m102628a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.workplace_template_common_header_layout, (ViewGroup) this, true);
        this.f70279f = inflate;
        this.f70274a = (TextView) inflate.findViewById(R.id.header_title);
        ImageView imageView = (ImageView) this.f70279f.findViewById(R.id.title_icon);
        this.f70276c = imageView;
        this.f70275b = imageView;
        this.f70277d = (ImageView) this.f70279f.findViewById(R.id.title_icon_squircle);
        this.f70278e = (ImageView) this.f70279f.findViewById(R.id.arrow_icon);
        this.f70280g = this.f70279f.findViewById(R.id.title_click_wrapper);
        this.f70282i = this.f70279f.findViewById(R.id.menu_click_wrapper);
        this.f70281h = this.f70279f.findViewById(R.id.internal_click_wrapper);
        mo99947a(0, 0, 0);
        setClipToPadding(false);
        setClipChildren(false);
    }

    public CommonHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* renamed from: a */
    public void mo99946a(int i, int i2) {
        this.f70274a.setTextSize(0, (float) C28209p.m103291a(14.0f));
        C28209p.m103300a(this.f70275b, C28209p.m103291a(20.0f), C28209p.m103291a(20.0f));
        this.f70280g.setPadding(C28209p.m103291a(12.0f), C28209p.m103291a(12.0f), 0, C28209p.m103291a(4.0f));
        this.f70282i.setPadding(0, C28209p.m103291a(12.0f), C28209p.m103291a(14.0f), C28209p.m103291a(4.0f));
        C28209p.m103301a(this.f70280g, -i, 0, 0, 0);
        C28209p.m103301a(this.f70282i, C28209p.m103291a(12.0f), 0, -i2, 0);
        C28209p.m103299a(this, C28209p.m103291a(44.0f));
    }

    /* renamed from: a */
    public void mo99949a(boolean z, View.OnClickListener onClickListener) {
        if (z) {
            this.f70282i.setVisibility(0);
            this.f70282i.setOnClickListener(onClickListener);
            return;
        }
        this.f70282i.setVisibility(8);
        this.f70282i.setOnClickListener(null);
    }

    public CommonHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m102628a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m102629a(String str, String str2, View view) {
        C27548m.m100547m().mo98222f().mo98206c(getContext(), str);
        C27710b.m101325y(str2);
    }

    /* renamed from: a */
    public void mo99948a(String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            $$Lambda$CommonHeader$ofKRVP_sWwIxMfulrHv5xccwles r0 = new View.OnClickListener(str, str2) {
                /* class com.ss.android.appcenter.business.tab.fragmentv3.component.header.$$Lambda$CommonHeader$ofKRVP_sWwIxMfulrHv5xccwles */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(View view) {
                    CommonHeader.this.m102629a((CommonHeader) this.f$1, this.f$2, (String) view);
                }
            };
            this.f70280g.setOnClickListener(r0);
            if (z) {
                this.f70281h.setOnClickListener(r0);
            }
            this.f70280g.setEnabled(true);
            this.f70278e.setVisibility(0);
            return;
        }
        this.f70280g.setOnClickListener(null);
        this.f70281h.setOnClickListener(null);
        this.f70280g.setEnabled(false);
        this.f70278e.setVisibility(8);
    }

    /* renamed from: a */
    public void mo99947a(int i, int i2, int i3) {
        this.f70274a.setTextSize(0, (float) C28209p.m103291a(16.0f));
        C28209p.m103300a(this.f70275b, C28209p.m103291a(22.0f), C28209p.m103291a(22.0f));
        int a = C28209p.m103291a(12.0f) - i3;
        this.f70280g.setPadding(C28209p.m103291a(12.0f), 0, 0, a);
        this.f70282i.setPadding(0, 0, C28209p.m103291a(14.0f), a);
        C28209p.m103301a(this.f70280g, -i, 0, 0, 0);
        C28209p.m103301a(this.f70282i, C28209p.m103291a(12.0f), 0, -i2, 0);
        C28209p.m103299a(this, C28209p.m103291a(40.0f) - i3);
    }
}
