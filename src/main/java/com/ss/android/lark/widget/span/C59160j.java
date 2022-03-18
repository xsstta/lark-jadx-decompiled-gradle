package com.ss.android.lark.widget.span;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.AbstractC38819j;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.image.p1960c.C38821a;
import com.ss.android.lark.utils.UIHelper;
import java.util.Objects;

/* renamed from: com.ss.android.lark.widget.span.j */
public class C59160j extends ImageSpan {

    /* renamed from: a */
    public int f146844a;

    /* renamed from: b */
    public int f146845b;

    /* renamed from: c */
    public C59153c f146846c;

    /* renamed from: d */
    public AbstractC59163b f146847d;

    /* renamed from: e */
    public boolean f146848e;

    /* renamed from: f */
    private Context f146849f;

    /* renamed from: g */
    private String f146850g;

    /* renamed from: h */
    private AbstractC59162a f146851h;

    /* renamed from: com.ss.android.lark.widget.span.j$a */
    public interface AbstractC59162a {
        void loadImage(Context context, String str, int i, int i2, AbstractC38819j jVar);
    }

    /* renamed from: com.ss.android.lark.widget.span.j$b */
    public interface AbstractC59163b {
        /* renamed from: a */
        void mo201096a();

        /* renamed from: b */
        void mo201097b();
    }

    /* renamed from: com.ss.android.lark.widget.span.j$c */
    public static class C59164c {

        /* renamed from: g */
        private static AbstractC59162a f146852g;

        /* renamed from: a */
        int f146853a;

        /* renamed from: b */
        int f146854b;

        /* renamed from: c */
        C59153c f146855c;

        /* renamed from: d */
        Drawable f146856d;

        /* renamed from: e */
        AbstractC59163b f146857e;

        /* renamed from: f */
        AbstractC59162a f146858f;

        /* renamed from: a */
        private AbstractC59162a m229828a() {
            if (f146852g == null) {
                f146852g = $$Lambda$j$c$FmoVsx0dhBu2VkkOuvIjgFON40.INSTANCE;
            }
            return f146852g;
        }

        /* renamed from: a */
        public C59164c mo201103a(int i) {
            this.f146853a = i;
            return this;
        }

        /* renamed from: b */
        public C59164c mo201109b(int i) {
            this.f146854b = i;
            return this;
        }

        /* renamed from: a */
        public C59164c mo201104a(Drawable drawable) {
            this.f146856d = drawable;
            return this;
        }

        /* renamed from: a */
        private Drawable m229827a(Context context) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(UIUtils.getColor(context, R.color.bg_body_overlay));
            C59153c cVar = this.f146855c;
            if (cVar != null) {
                gradientDrawable.setStroke(cVar.mo201081b(), this.f146855c.mo201080a());
                gradientDrawable.setCornerRadius((float) this.f146855c.mo201082c());
            }
            gradientDrawable.setSize(this.f146853a, this.f146854b);
            gradientDrawable.setBounds(0, 0, this.f146853a, this.f146854b);
            return gradientDrawable;
        }

        /* renamed from: a */
        public C59164c mo201105a(C59153c cVar) {
            this.f146855c = cVar;
            return this;
        }

        /* renamed from: a */
        public C59164c mo201106a(AbstractC59162a aVar) {
            if (aVar != null) {
                this.f146858f = aVar;
            }
            return this;
        }

        /* renamed from: a */
        public C59164c mo201107a(AbstractC59163b bVar) {
            this.f146857e = bVar;
            return this;
        }

        /* renamed from: a */
        public C59160j mo201108a(Context context, String str) {
            if (this.f146856d == null) {
                this.f146856d = m229827a(context);
            }
            if (this.f146858f == null) {
                this.f146858f = m229828a();
            }
            return new C59160j(context, str, this.f146853a, this.f146854b, this.f146855c, this.f146856d, this.f146858f, this.f146857e);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m229829a(Context context, String str, int i, int i2, AbstractC38819j jVar) {
            ImageLoader.with(context).load(str).asDrawable().override(i, i2).into(jVar);
        }
    }

    public Drawable getDrawable() {
        Context context;
        if (!this.f146848e && (context = this.f146849f) != null) {
            this.f146851h.loadImage(context, this.f146850g, this.f146844a, this.f146845b, new C59165d());
        }
        return super.getDrawable();
    }

    public int hashCode() {
        return Objects.hash(this.f146850g, Integer.valueOf(this.f146844a), Integer.valueOf(this.f146845b), this.f146846c);
    }

    /* renamed from: a */
    public void mo201099a(AbstractC59163b bVar) {
        this.f146847d = bVar;
    }

    /* renamed from: com.ss.android.lark.widget.span.j$d */
    private class C59165d extends C38818i<Drawable> {
        private C59165d() {
        }

        @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
        /* renamed from: a */
        public void mo49247a(Drawable drawable) {
            super.mo49247a(drawable);
            Drawable a = C59154e.m229814a(UIHelper.getDrawable(R.drawable.ic_richtext_failed), C59160j.this.f146844a, C59160j.this.f146845b, C59160j.this.f146846c);
            a.setBounds(0, 0, C59160j.this.f146844a, C59160j.this.f146845b);
            C38821a.m153224a(C59160j.this, "mDrawable", a);
            C38821a.m153224a(C59160j.this, "mDrawableRef", null);
            if (!C59160j.this.f146848e && C59160j.this.f146847d != null) {
                C59160j.this.f146847d.mo201097b();
            }
            C59160j.this.f146848e = true;
        }

        /* renamed from: d */
        public void mo49248a(Drawable drawable) {
            super.mo49248a((Object) drawable);
            Drawable a = C59154e.m229814a(drawable, C59160j.this.f146844a, C59160j.this.f146845b, C59160j.this.f146846c);
            a.setBounds(0, 0, C59160j.this.f146844a, C59160j.this.f146845b);
            C38821a.m153224a(C59160j.this, "mDrawable", a);
            C38821a.m153224a(C59160j.this, "mDrawableRef", null);
            C59160j.this.f146848e = true;
            if (C59160j.this.f146847d != null) {
                C59160j.this.f146847d.mo201096a();
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59160j)) {
            return false;
        }
        C59160j jVar = (C59160j) obj;
        if (TextUtils.equals(this.f146850g, jVar.f146850g) && this.f146844a == jVar.f146844a && this.f146845b == jVar.f146845b) {
            return true;
        }
        return false;
    }

    public C59160j(Context context, String str, int i, int i2, C59153c cVar, Drawable drawable, AbstractC59162a aVar, AbstractC59163b bVar) {
        super(drawable);
        this.f146849f = context;
        this.f146850g = str;
        this.f146844a = i;
        this.f146845b = i2;
        this.f146846c = cVar;
        this.f146851h = aVar;
        this.f146847d = bVar;
    }
}
