package com.ss.android.lark.banner.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.banner.export.AbstractC29484e;
import com.ss.android.lark.image.ImageLoader;

public class BannerNormalView extends FrameLayout {

    /* renamed from: a */
    public ConstraintLayout f73695a;

    /* renamed from: b */
    public AbstractC29506a f73696b;

    /* renamed from: c */
    private ImageView f73697c;

    /* renamed from: d */
    private ImageView f73698d;

    /* renamed from: e */
    private TextView f73699e;

    /* renamed from: f */
    private TextView f73700f;

    /* renamed from: g */
    private TextView f73701g;

    /* renamed from: h */
    private CloseIcon f73702h;

    /* renamed from: i */
    private int f73703i;

    public @interface Style {
    }

    /* renamed from: com.ss.android.lark.banner.view.BannerNormalView$a */
    public interface AbstractC29506a {
        /* renamed from: a */
        void mo104507a();

        /* renamed from: b */
        void mo104508b();

        /* renamed from: c */
        void mo104509c();
    }

    /* renamed from: b */
    private void m108628b() {
        mo104485a(getContext(), this);
        m108630c();
        m108631d();
    }

    /* renamed from: d */
    private void m108631d() {
        this.f73695a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.banner.view.$$Lambda$BannerNormalView$nG7RUzGLXADjoK4S6SBMeUMiKAE */

            public final void onClick(View view) {
                BannerNormalView.this.m108629b(view);
            }
        });
        this.f73702h.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.banner.view.$$Lambda$BannerNormalView$qtJKOz2YKLNDn2ekUxx3p94Kc */

            public final void onClick(View view) {
                BannerNormalView.this.m108627a(view);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo104483a() {
        TextView textView = this.f73699e;
        if (textView != null && this.f73700f != null) {
            int lineCount = 4 - textView.getLineCount();
            if (lineCount <= 0) {
                this.f73700f.setVisibility(8);
                return;
            }
            this.f73700f.setVisibility(0);
            this.f73700f.setMaxLines(lineCount);
        }
    }

    /* renamed from: c */
    private void m108630c() {
        this.f73695a = (ConstraintLayout) findViewById(R.id.container);
        this.f73697c = (ImageView) findViewById(R.id.container_bg_img);
        this.f73698d = (ImageView) findViewById(R.id.icon);
        this.f73699e = (TextView) findViewById(R.id.title);
        this.f73700f = (TextView) findViewById(R.id.content);
        this.f73701g = (TextView) findViewById(R.id.button);
        this.f73702h = (CloseIcon) findViewById(R.id.close);
        setButtonBgColor(getResources().getColor(R.color.lkui_B500));
        mo104484a(getResources().getColor(R.color.lkui_B100), 0);
        this.f73695a.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.ss.android.lark.banner.view.BannerNormalView.View$OnAttachStateChangeListenerC295041 */

            public void onViewDetachedFromWindow(View view) {
            }

            public void onViewAttachedToWindow(View view) {
                if (BannerNormalView.this.f73696b != null) {
                    BannerNormalView.this.f73696b.mo104507a();
                }
                BannerNormalView.this.f73695a.removeOnAttachStateChangeListener(this);
            }
        });
        if (this.f73703i > 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.ss.android.lark.banner.view.BannerNormalView.ViewTreeObserver$OnGlobalLayoutListenerC295052 */

                public void onGlobalLayout() {
                    BannerNormalView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    BannerNormalView.this.mo104483a();
                }
            });
        }
    }

    /* renamed from: com.ss.android.lark.banner.view.BannerNormalView$b */
    public static class C29507b {

        /* renamed from: a */
        public String f73706a;

        /* renamed from: b */
        AbstractC29484e f73707b;

        /* renamed from: c */
        private String f73708c;

        /* renamed from: d */
        private String f73709d;

        /* renamed from: e */
        private int f73710e;

        /* renamed from: f */
        private String f73711f;

        /* renamed from: g */
        private String f73712g;

        /* renamed from: h */
        private String f73713h;

        /* renamed from: i */
        private String f73714i;

        /* renamed from: j */
        private String f73715j;

        /* renamed from: k */
        private String f73716k;

        /* renamed from: l */
        private String f73717l;

        /* renamed from: m */
        private String f73718m;

        /* renamed from: n */
        private boolean f73719n;

        /* renamed from: o */
        private String f73720o;

        /* renamed from: p */
        private String f73721p;

        /* renamed from: a */
        public C29507b mo104510a(int i) {
            this.f73710e = i;
            return this;
        }

        /* renamed from: b */
        public C29507b mo104515b(String str) {
            this.f73709d = str;
            return this;
        }

        /* renamed from: c */
        public C29507b mo104516c(String str) {
            this.f73711f = str;
            return this;
        }

        /* renamed from: d */
        public C29507b mo104517d(String str) {
            this.f73712g = str;
            return this;
        }

        /* renamed from: e */
        public C29507b mo104518e(String str) {
            this.f73713h = str;
            return this;
        }

        /* renamed from: f */
        public C29507b mo104519f(String str) {
            this.f73714i = str;
            return this;
        }

        /* renamed from: g */
        public C29507b mo104520g(String str) {
            this.f73715j = str;
            return this;
        }

        /* renamed from: h */
        public C29507b mo104521h(String str) {
            this.f73716k = str;
            return this;
        }

        /* renamed from: i */
        public C29507b mo104522i(String str) {
            this.f73717l = str;
            return this;
        }

        /* renamed from: j */
        public C29507b mo104523j(String str) {
            this.f73718m = str;
            return this;
        }

        /* renamed from: k */
        public C29507b mo104524k(String str) {
            this.f73720o = str;
            return this;
        }

        /* renamed from: l */
        public C29507b mo104525l(String str) {
            this.f73706a = str;
            return this;
        }

        /* renamed from: m */
        public C29507b mo104526m(String str) {
            this.f73721p = str;
            return this;
        }

        /* renamed from: n */
        private int m108638n(String str) {
            try {
                return Color.parseColor(str);
            } catch (Exception unused) {
                return -1;
            }
        }

        /* renamed from: a */
        public C29507b mo104511a(AbstractC29484e eVar) {
            this.f73707b = eVar;
            return this;
        }

        /* renamed from: a */
        public C29507b mo104512a(String str) {
            this.f73708c = str;
            return this;
        }

        /* renamed from: a */
        public C29507b mo104513a(boolean z) {
            this.f73719n = z;
            return this;
        }

        /* renamed from: a */
        public BannerNormalView mo104514a(Context context, int i) {
            final BannerNormalView bannerNormalView = new BannerNormalView(context, i);
            if (!TextUtils.isEmpty(this.f73711f)) {
                bannerNormalView.setContainerBgImg(this.f73711f);
                bannerNormalView.mo104484a(0, m108638n(this.f73721p));
            } else {
                bannerNormalView.mo104484a(m108638n(this.f73708c), m108638n(this.f73721p));
            }
            if (!TextUtils.isEmpty(this.f73709d)) {
                bannerNormalView.setIcon(this.f73709d);
            } else {
                bannerNormalView.setIcon(this.f73710e);
            }
            bannerNormalView.setTitle(this.f73712g);
            if (!TextUtils.isEmpty(this.f73713h)) {
                bannerNormalView.setTitleColor(m108638n(this.f73713h));
            }
            bannerNormalView.setContent(this.f73714i);
            if (!TextUtils.isEmpty(this.f73715j)) {
                bannerNormalView.setContentColor(m108638n(this.f73715j));
            }
            bannerNormalView.setButtonText(this.f73716k);
            if (!TextUtils.isEmpty(this.f73717l)) {
                bannerNormalView.setButtonTextColor(m108638n(this.f73717l));
            }
            if (!TextUtils.isEmpty(this.f73718m)) {
                bannerNormalView.setButtonBgColor(m108638n(this.f73718m));
            }
            bannerNormalView.setCloseIconShow(this.f73719n);
            if (!TextUtils.isEmpty(this.f73720o)) {
                bannerNormalView.setCloseIconColor(m108638n(this.f73720o));
            }
            if (this.f73707b != null) {
                bannerNormalView.setListener(new AbstractC29506a() {
                    /* class com.ss.android.lark.banner.view.BannerNormalView.C29507b.C295081 */

                    @Override // com.ss.android.lark.banner.view.BannerNormalView.AbstractC29506a
                    /* renamed from: a */
                    public void mo104507a() {
                        if (C29507b.this.f73707b != null) {
                            C29507b.this.f73707b.mo104367a(bannerNormalView);
                        }
                    }

                    @Override // com.ss.android.lark.banner.view.BannerNormalView.AbstractC29506a
                    /* renamed from: c */
                    public void mo104509c() {
                        if (C29507b.this.f73707b != null) {
                            C29507b.this.f73707b.mo104371b(bannerNormalView);
                        }
                    }

                    @Override // com.ss.android.lark.banner.view.BannerNormalView.AbstractC29506a
                    /* renamed from: b */
                    public void mo104508b() {
                        if (C29507b.this.f73707b != null) {
                            C29507b.this.f73707b.mo104368a(bannerNormalView, C29507b.this.f73706a);
                        }
                    }
                });
            }
            return bannerNormalView;
        }
    }

    public void setListener(AbstractC29506a aVar) {
        this.f73696b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m108627a(View view) {
        AbstractC29506a aVar = this.f73696b;
        if (aVar != null) {
            aVar.mo104509c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m108629b(View view) {
        AbstractC29506a aVar = this.f73696b;
        if (aVar != null) {
            aVar.mo104508b();
        }
    }

    public void setButtonText(int i) {
        TextView textView = this.f73701g;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public void setContent(int i) {
        TextView textView = this.f73700f;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public void setIcon(int i) {
        ImageView imageView = this.f73698d;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    public void setTitle(int i) {
        TextView textView = this.f73699e;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public void setButtonText(String str) {
        TextView textView = this.f73701g;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setButtonTextColor(int i) {
        TextView textView;
        if (i != -1 && (textView = this.f73701g) != null) {
            textView.setTextColor(i);
        }
    }

    public void setCloseIconColor(int i) {
        CloseIcon closeIcon;
        if (i != -1 && (closeIcon = this.f73702h) != null) {
            closeIcon.mo104527a(i);
        }
    }

    public void setCloseIconShow(boolean z) {
        int i;
        CloseIcon closeIcon = this.f73702h;
        if (closeIcon != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            closeIcon.setVisibility(i);
        }
    }

    public void setContent(String str) {
        TextView textView = this.f73700f;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setContentColor(int i) {
        TextView textView;
        if (i != -1 && (textView = this.f73700f) != null) {
            textView.setTextColor(i);
        }
    }

    public void setIcon(Bitmap bitmap) {
        ImageView imageView = this.f73698d;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void setTitle(String str) {
        TextView textView = this.f73699e;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTitleColor(int i) {
        TextView textView;
        if (i != -1 && (textView = this.f73699e) != null) {
            textView.setTextColor(i);
        }
    }

    public void setContainerBgImg(String str) {
        if (!TextUtils.isEmpty(str)) {
            ImageLoader.with(getContext()).load(str).asDrawable().into(this.f73697c);
        }
    }

    public void setIcon(Drawable drawable) {
        ImageView imageView = this.f73698d;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public void setButtonBgColor(int i) {
        if (i != -1 && this.f73701g != null) {
            this.f73701g.setBackground(StyleHelper.m108715b(getContext(), (float) UIUtils.dp2px(getContext(), 4.0f), i, 0, 0));
        }
    }

    public void setIcon(String str) {
        if (!TextUtils.isEmpty(str) && this.f73698d != null) {
            ImageLoader.with(getContext()).load(str).asDrawable().into(this.f73698d);
        }
    }

    public BannerNormalView(Context context, int i) {
        super(context);
        this.f73703i = i;
        m108628b();
    }

    /* renamed from: a */
    public void mo104484a(int i, int i2) {
        int dp2px = UIUtils.dp2px(getContext(), 0.5f);
        Drawable a = StyleHelper.m108714a(getContext(), (float) UIUtils.dp2px(getContext(), 8.0f), i, dp2px, i2);
        ConstraintLayout constraintLayout = this.f73695a;
        if (constraintLayout != null) {
            constraintLayout.setBackground(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo104485a(Context context, ViewGroup viewGroup) {
        int i = this.f73703i;
        if (i == 2) {
            LayoutInflater.from(context).inflate(R.layout.normal_banner_2, viewGroup);
        } else if (i == 1) {
            LayoutInflater.from(context).inflate(R.layout.normal_banner, viewGroup);
        } else {
            LayoutInflater.from(context).inflate(R.layout.normal_banner_0, viewGroup);
        }
    }
}
