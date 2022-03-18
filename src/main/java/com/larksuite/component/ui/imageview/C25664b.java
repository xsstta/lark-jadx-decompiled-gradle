package com.larksuite.component.ui.imageview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;

/* renamed from: com.larksuite.component.ui.imageview.b */
public class C25664b extends Drawable {

    /* renamed from: a */
    private CharSequence f62659a;

    /* renamed from: b */
    private float f62660b;

    /* renamed from: c */
    private Drawable f62661c;

    /* renamed from: d */
    private int f62662d;

    /* renamed from: e */
    private Drawable f62663e;

    /* renamed from: f */
    private float f62664f;

    /* renamed from: g */
    private final Paint f62665g;

    /* renamed from: h */
    private volatile boolean f62666h;

    /* renamed from: i */
    private volatile boolean f62667i;

    /* renamed from: j */
    private int f62668j;

    /* renamed from: k */
    private int f62669k;

    /* renamed from: l */
    private Rect f62670l;

    /* renamed from: a */
    private boolean m91975a(Drawable drawable, Drawable drawable2) {
        return false;
    }

    public int getOpacity() {
        return -3;
    }

    public int getIntrinsicHeight() {
        return this.f62669k;
    }

    public int getIntrinsicWidth() {
        return this.f62668j;
    }

    /* renamed from: com.larksuite.component.ui.imageview.b$a */
    public static final class C25666a {

        /* renamed from: a */
        public CharSequence f62671a;

        /* renamed from: b */
        public float f62672b;

        /* renamed from: c */
        public Drawable f62673c;

        /* renamed from: d */
        public int f62674d = -1;

        /* renamed from: e */
        public Drawable f62675e;

        /* renamed from: f */
        public float f62676f;

        /* renamed from: b */
        public C25666a mo89423b(float f) {
            return this;
        }

        /* renamed from: a */
        public C25664b mo89422a() {
            return new C25664b(this);
        }

        /* renamed from: a */
        public C25666a mo89418a(float f) {
            this.f62672b = f;
            return this;
        }

        /* renamed from: c */
        public C25666a mo89425c(float f) {
            this.f62676f = f;
            return this;
        }

        /* renamed from: a */
        public C25666a mo89419a(int i) {
            this.f62674d = i;
            return this;
        }

        /* renamed from: b */
        public C25666a mo89424b(Drawable drawable) {
            this.f62675e = drawable;
            return this;
        }

        /* renamed from: a */
        public C25666a mo89420a(Drawable drawable) {
            this.f62673c = drawable;
            return this;
        }

        /* renamed from: a */
        public C25666a mo89421a(CharSequence charSequence) {
            this.f62671a = charSequence;
            return this;
        }
    }

    /* renamed from: b */
    public boolean mo89410b() {
        if (this.f62666h) {
            m91976c();
            if (getCallback() != null) {
                getCallback().invalidateDrawable(this);
            }
            this.f62666h = false;
            this.f62667i = false;
            return true;
        } else if (!this.f62667i) {
            return false;
        } else {
            this.f62667i = false;
            invalidateSelf();
            return true;
        }
    }

    /* renamed from: c */
    private void m91976c() {
        if (!TextUtils.isEmpty(this.f62659a)) {
            int measureText = (int) this.f62665g.measureText(this.f62659a.toString());
            int i = (int) (this.f62665g.getFontMetrics().bottom - this.f62665g.getFontMetrics().top);
            if (this.f62659a.length() == 1) {
                int max = (int) (((float) Math.max(measureText, i)) + (this.f62664f * 2.0f));
                this.f62669k = max;
                this.f62668j = max;
            } else {
                this.f62668j = (int) (((float) measureText) + (this.f62664f * 2.0f) + m91974a(8.0f));
                this.f62669k = (int) (((float) i) + (this.f62664f * 2.0f));
            }
        } else {
            this.f62668j = 0;
            this.f62669k = 0;
        }
        Drawable drawable = this.f62663e;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicWidth2 = this.f62663e.getIntrinsicWidth();
            this.f62663e.setBounds(0, 0, intrinsicWidth, intrinsicWidth2);
            int i2 = this.f62668j;
            if (i2 != 0) {
                intrinsicWidth = i2;
            }
            this.f62668j = intrinsicWidth;
            int i3 = this.f62669k;
            if (i3 != 0) {
                intrinsicWidth2 = i3;
            }
            this.f62669k = intrinsicWidth2;
        }
        Drawable drawable2 = this.f62661c;
        if (drawable2 != null) {
            int i4 = this.f62668j;
            if (i4 == 0) {
                i4 = drawable2.getIntrinsicWidth();
            }
            this.f62668j = i4;
            int i5 = this.f62669k;
            if (i5 == 0) {
                i5 = this.f62661c.getIntrinsicHeight();
            }
            this.f62669k = i5;
            this.f62661c.setBounds(0, 0, this.f62668j, i5);
        }
    }

    /* renamed from: a */
    public boolean mo89407a() {
        if (this.f62661c == null && this.f62663e == null && TextUtils.isEmpty(this.f62659a)) {
            return true;
        }
        return false;
    }

    public void setAlpha(int i) {
        this.f62665g.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f62665g.setColorFilter(colorFilter);
    }

    /* renamed from: a */
    private static float m91974a(float f) {
        return (f * Resources.getSystem().getDisplayMetrics().density) + 0.5f;
    }

    /* renamed from: a */
    public C25664b mo89403a(int i) {
        if (this.f62662d != i) {
            this.f62662d = i;
            this.f62665g.setColor(i);
        }
        this.f62667i = true;
        return this;
    }

    /* renamed from: b */
    public C25664b mo89409b(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f62661c;
        if (drawable2 != drawable) {
            boolean a = m91975a(drawable, drawable2);
            this.f62661c = drawable;
            if (this.f62666h || !a) {
                z = true;
            } else {
                z = false;
            }
            this.f62666h = z;
        }
        return this;
    }

    private C25664b(C25666a aVar) {
        float f;
        Drawable drawable;
        float f2;
        this.f62670l = new Rect();
        this.f62659a = aVar.f62671a;
        if (aVar.f62672b > BitmapDescriptorFactory.HUE_RED) {
            f = aVar.f62672b;
        } else {
            f = this.f62660b;
        }
        this.f62660b = f;
        this.f62662d = aVar.f62674d;
        if (aVar.f62673c != null) {
            drawable = aVar.f62673c;
        } else {
            drawable = new ColorDrawable(-65536);
        }
        this.f62661c = drawable;
        this.f62663e = aVar.f62675e;
        if (aVar.f62676f >= BitmapDescriptorFactory.HUE_RED) {
            f2 = aVar.f62676f;
        } else {
            f2 = this.f62664f;
        }
        this.f62664f = f2;
        TextPaint textPaint = new TextPaint();
        this.f62665g = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setColor(this.f62662d);
        textPaint.setTextSize(this.f62660b);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setAlpha(255);
        if (Build.VERSION.SDK_INT >= 28) {
            textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, ParticipantRepo.f117150c, false));
        }
        m91976c();
    }

    /* renamed from: a */
    public C25664b mo89405a(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f62663e;
        if (drawable2 != drawable) {
            boolean a = m91975a(drawable, drawable2);
            this.f62663e = drawable;
            if (this.f62666h || !a) {
                z = true;
            } else {
                z = false;
            }
            this.f62666h = z;
        }
        return this;
    }

    /* renamed from: a */
    public C25664b mo89406a(String str) {
        if ((str == null && this.f62659a != null) || (str != null && !str.equals(this.f62659a))) {
            this.f62659a = str;
            this.f62666h = true;
        }
        return this;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = this.f62661c;
        if (drawable != null) {
            Rect bounds2 = drawable.getBounds();
            int width = bounds2.width();
            int height = bounds2.height();
            canvas.save();
            canvas.translate((float) ((bounds.width() - width) / 2), (float) ((bounds.height() - height) / 2));
            this.f62661c.draw(canvas);
            canvas.restore();
        }
        if (this.f62663e != null) {
            canvas.save();
            canvas.translate((float) ((bounds.width() - this.f62663e.getBounds().width()) / 2), (float) ((bounds.height() - this.f62663e.getBounds().width()) / 2));
            this.f62663e.draw(canvas);
            canvas.restore();
        } else if (!TextUtils.isEmpty(this.f62659a)) {
            String charSequence = this.f62659a.toString();
            this.f62665g.getTextBounds(charSequence, 0, this.f62659a.length(), this.f62670l);
            canvas.drawText(charSequence, (float) bounds.centerX(), ((float) bounds.centerY()) - this.f62670l.exactCenterY(), this.f62665g);
        }
    }

    /* renamed from: b */
    public C25664b mo89408b(Context context, float f) {
        float a = C25653b.m91892a(context, f);
        if (this.f62664f != a) {
            this.f62664f = a;
        }
        this.f62666h = true;
        return this;
    }

    /* renamed from: a */
    public C25664b mo89404a(Context context, float f) {
        float a = C25653b.m91892a(context, f);
        if (this.f62660b != a) {
            this.f62660b = a;
            this.f62665g.setTextSize(a);
            this.f62666h = true;
        }
        return this;
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        m91976c();
    }
}
