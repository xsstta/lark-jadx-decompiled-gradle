package com.ss.android.lark.widget.span;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.C26254af;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.AbstractC38819j;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.span.C59160j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

public class RemoteMediaSpan extends ImageSpan {

    /* renamed from: a */
    public Context f146800a;

    /* renamed from: b */
    public int f146801b;

    /* renamed from: c */
    public int f146802c;

    /* renamed from: d */
    public C59153c f146803d;

    /* renamed from: e */
    public String f146804e;

    /* renamed from: f */
    public C59160j.AbstractC59163b f146805f;

    /* renamed from: g */
    public boolean f146806g;

    /* renamed from: h */
    private String f146807h;

    /* renamed from: i */
    private C59160j.AbstractC59162a f146808i;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    /* renamed from: com.ss.android.lark.widget.span.RemoteMediaSpan$b */
    public static class C59150b {

        /* renamed from: a */
        private static C59160j.AbstractC59162a f146810a;

        /* renamed from: b */
        private int f146811b;

        /* renamed from: c */
        private int f146812c;

        /* renamed from: d */
        private C59153c f146813d;

        /* renamed from: e */
        private Drawable f146814e;

        /* renamed from: f */
        private C59160j.AbstractC59163b f146815f;

        /* renamed from: g */
        private C59160j.AbstractC59162a f146816g;

        /* renamed from: b */
        public C59160j.AbstractC59162a mo201072b() {
            if (f146810a == null) {
                f146810a = $$Lambda$RemoteMediaSpan$b$aJhTce9XG_Znm2vGXyGWdm80iow.INSTANCE;
            }
            return f146810a;
        }

        /* renamed from: a */
        public Drawable mo201065a() {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(UIHelper.getColor(R.color.bg_body_overlay));
            C59153c cVar = this.f146813d;
            if (cVar != null) {
                gradientDrawable.setStroke(cVar.mo201081b(), this.f146813d.mo201080a());
                gradientDrawable.setCornerRadius((float) this.f146813d.mo201082c());
            }
            gradientDrawable.setSize(this.f146811b, this.f146812c);
            gradientDrawable.setBounds(0, 0, this.f146811b, this.f146812c);
            return gradientDrawable;
        }

        /* renamed from: a */
        public C59150b mo201066a(int i) {
            this.f146811b = i;
            return this;
        }

        /* renamed from: b */
        public C59150b mo201071b(int i) {
            this.f146812c = i;
            return this;
        }

        /* renamed from: a */
        public C59150b mo201067a(Drawable drawable) {
            this.f146814e = drawable;
            return this;
        }

        /* renamed from: a */
        public C59150b mo201068a(C59153c cVar) {
            this.f146813d = cVar;
            return this;
        }

        /* renamed from: a */
        public C59150b mo201069a(C59160j.AbstractC59162a aVar) {
            if (aVar != null) {
                this.f146816g = aVar;
            }
            return this;
        }

        /* renamed from: a */
        public RemoteMediaSpan mo201070a(Context context, String str, String str2) {
            if (this.f146814e == null) {
                this.f146814e = mo201065a();
            }
            if (this.f146816g == null) {
                this.f146816g = mo201072b();
            }
            return new RemoteMediaSpan(context, str, str2, this.f146811b, this.f146812c, this.f146813d, this.f146814e, this.f146816g, this.f146815f);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m229799a(Context context, String str, int i, int i2, AbstractC38819j jVar) {
            ImageLoader.with(context).load(str).asDrawable().override(i, i2).into(jVar);
        }
    }

    public Drawable getDrawable() {
        Context context;
        if (!this.f146806g && (context = this.f146800a) != null) {
            this.f146808i.loadImage(context, this.f146807h, this.f146801b, this.f146802c, new C59149a());
        }
        return super.getDrawable();
    }

    /* renamed from: a */
    public Drawable mo201059a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        C59153c cVar = this.f146803d;
        if (cVar != null) {
            gradientDrawable.setStroke(cVar.mo201081b(), this.f146803d.mo201080a());
            gradientDrawable.setCornerRadius((float) this.f146803d.mo201082c());
        }
        gradientDrawable.setColor(UIUtils.getColor(this.f146800a, R.color.ud_N200));
        gradientDrawable.setSize(this.f146801b, this.f146802c);
        return gradientDrawable;
    }

    public int hashCode() {
        return Objects.hash(this.f146807h, Integer.valueOf(this.f146801b), Integer.valueOf(this.f146802c), this.f146803d, this.f146804e);
    }

    /* renamed from: a */
    public void mo201060a(C59160j.AbstractC59163b bVar) {
        this.f146805f = bVar;
    }

    /* renamed from: com.ss.android.lark.widget.span.RemoteMediaSpan$a */
    private class C59149a extends C38818i<Drawable> {
        private C59149a() {
        }

        @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
        /* renamed from: a */
        public void mo49247a(Drawable drawable) {
            super.mo49247a(drawable);
            Drawable a = RemoteMediaSpan.this.mo201059a();
            a.setBounds(0, 0, RemoteMediaSpan.this.f146801b, RemoteMediaSpan.this.f146802c);
            C26254af.m95005a(RemoteMediaSpan.this, "mDrawable", a);
            C26254af.m95005a(RemoteMediaSpan.this, "mDrawableRef", (Object) null);
            RemoteMediaSpan.this.f146806g = true;
            if (RemoteMediaSpan.this.f146805f != null) {
                RemoteMediaSpan.this.f146805f.mo201097b();
            }
        }

        /* renamed from: d */
        public void mo49248a(Drawable drawable) {
            super.mo49248a((Object) drawable);
            Bitmap a = RemoteMediaSpan.this.mo201057a(((BitmapDrawable) drawable).getBitmap(), BitmapFactory.decodeResource(RemoteMediaSpan.this.f146800a.getResources(), R.drawable.ic_richtext_media_play), 0);
            RemoteMediaSpan remoteMediaSpan = RemoteMediaSpan.this;
            Drawable a2 = C59154e.m229814a(new BitmapDrawable(RemoteMediaSpan.this.f146800a.getResources(), RemoteMediaSpan.this.mo201057a(a, remoteMediaSpan.mo201058a(remoteMediaSpan.f146804e), 1)), RemoteMediaSpan.this.f146801b, RemoteMediaSpan.this.f146802c, RemoteMediaSpan.this.f146803d);
            a2.setBounds(0, 0, RemoteMediaSpan.this.f146801b, RemoteMediaSpan.this.f146802c);
            C26254af.m95005a(RemoteMediaSpan.this, "mDrawable", a2);
            C26254af.m95005a(RemoteMediaSpan.this, "mDrawableRef", (Object) null);
            RemoteMediaSpan.this.f146806g = true;
            if (RemoteMediaSpan.this.f146805f != null) {
                RemoteMediaSpan.this.f146805f.mo201096a();
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RemoteMediaSpan)) {
            return false;
        }
        RemoteMediaSpan remoteMediaSpan = (RemoteMediaSpan) obj;
        if (!TextUtils.equals(this.f146807h, remoteMediaSpan.f146807h) || !TextUtils.equals(this.f146804e, remoteMediaSpan.f146804e) || this.f146801b != remoteMediaSpan.f146801b || this.f146802c != remoteMediaSpan.f146802c || !this.f146803d.equals(remoteMediaSpan.f146803d)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public Bitmap mo201058a(String str) {
        Bitmap decodeResource = BitmapFactory.decodeResource(this.f146800a.getResources(), R.drawable.ic_richtext_video_label);
        Rect rect = new Rect();
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setTextSize((float) UIHelper.dp2px(12.0f));
        paint.getTextBounds(str, 0, str.length(), rect);
        int dp2px = UIHelper.dp2px(6.0f);
        int dp2px2 = UIHelper.dp2px(3.5f);
        int width = decodeResource.getWidth() + dp2px + dp2px2 + rect.width() + dp2px;
        int height = rect.height() + dp2px + dp2px;
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor("#B2141F33"));
        paint.setStyle(Paint.Style.FILL);
        RectF rectF = new RectF();
        rectF.left = BitmapDescriptorFactory.HUE_RED;
        rectF.top = BitmapDescriptorFactory.HUE_RED;
        rectF.right = (float) width;
        rectF.bottom = (float) height;
        float f = (float) (height / 2);
        canvas.drawRoundRect(rectF, f, f, paint);
        RectF rectF2 = new RectF();
        rectF2.left = (float) dp2px;
        rectF2.right = rectF2.left + ((float) decodeResource.getWidth());
        rectF2.top = (float) ((height - decodeResource.getHeight()) >> 1);
        rectF2.bottom = (float) ((decodeResource.getHeight() + height) >> 1);
        canvas.drawBitmap(decodeResource, (Rect) null, rectF2, paint);
        paint.setColor(-1);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        canvas.drawText(str, rectF2.right + ((float) dp2px2), (float) ((((height - fontMetricsInt.bottom) + fontMetricsInt.top) / 2) - fontMetricsInt.top), paint);
        return createBitmap;
    }

    /* renamed from: a */
    public Bitmap mo201057a(Bitmap bitmap, Bitmap bitmap2, int i) {
        int i2;
        int i3;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        if (i == 0) {
            i3 = (width - bitmap2.getWidth()) >> 1;
            i2 = (height - bitmap2.getHeight()) >> 1;
        } else {
            int dp2px = (width - UIHelper.dp2px(12.0f)) - bitmap2.getWidth();
            i2 = (height - UIHelper.dp2px(12.0f)) - bitmap2.getHeight();
            i3 = dp2px;
        }
        canvas.drawBitmap(bitmap2, (float) i3, (float) i2, (Paint) null);
        return createBitmap;
    }

    public RemoteMediaSpan(Context context, String str, String str2, int i, int i2, C59153c cVar, Drawable drawable, C59160j.AbstractC59162a aVar, C59160j.AbstractC59163b bVar) {
        super(drawable);
        this.f146800a = context;
        this.f146807h = str;
        this.f146804e = str2;
        this.f146801b = i;
        this.f146802c = i2;
        this.f146803d = cVar;
        this.f146805f = bVar;
        this.f146808i = aVar;
    }
}
