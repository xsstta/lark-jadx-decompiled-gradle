package com.scwang.smartrefresh.layout.internal.pathview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.scwang.smartrefresh.layout.internal.pathview.b */
public class C27166b extends Drawable {

    /* renamed from: j */
    protected static final Region f67572j = new Region();

    /* renamed from: k */
    protected static final Region f67573k = new Region(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* renamed from: a */
    protected Paint f67574a;

    /* renamed from: b */
    protected List<Path> f67575b;

    /* renamed from: c */
    protected List<Integer> f67576c;

    /* renamed from: d */
    protected int f67577d = 1;

    /* renamed from: e */
    protected int f67578e = 1;

    /* renamed from: f */
    protected int f67579f;

    /* renamed from: g */
    protected int f67580g;

    /* renamed from: h */
    protected int f67581h;

    /* renamed from: i */
    protected int f67582i;

    /* renamed from: l */
    protected List<Path> f67583l;

    /* renamed from: m */
    protected List<String> f67584m;

    /* renamed from: n */
    private Bitmap f67585n;

    /* renamed from: o */
    private boolean f67586o;

    /* renamed from: e */
    public void mo96591e() {
        this.f67586o = false;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: d */
    public boolean mo96589d() {
        if (!this.f67586o) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public int mo96585b() {
        return getBounds().width();
    }

    /* renamed from: c */
    public int mo96587c() {
        return getBounds().height();
    }

    public C27166b() {
        Paint paint = new Paint();
        this.f67574a = paint;
        paint.setColor(-15614977);
        this.f67574a.setStyle(Paint.Style.FILL);
        this.f67574a.setAntiAlias(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo96581a() {
        Integer num;
        Integer num2;
        Integer num3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        List<Path> list = this.f67575b;
        Integer num4 = null;
        if (list != null) {
            Integer num5 = null;
            num2 = null;
            num = null;
            for (Path path : list) {
                Region region = f67572j;
                region.setPath(path, f67573k);
                Rect bounds = region.getBounds();
                if (num4 == null) {
                    i4 = bounds.top;
                } else {
                    i4 = num4.intValue();
                }
                num4 = Integer.valueOf(Math.min(i4, bounds.top));
                if (num5 == null) {
                    i5 = bounds.left;
                } else {
                    i5 = num5.intValue();
                }
                num5 = Integer.valueOf(Math.min(i5, bounds.left));
                if (num2 == null) {
                    i6 = bounds.right;
                } else {
                    i6 = num2.intValue();
                }
                num2 = Integer.valueOf(Math.max(i6, bounds.right));
                if (num == null) {
                    i7 = bounds.bottom;
                } else {
                    i7 = num.intValue();
                }
                num = Integer.valueOf(Math.max(i7, bounds.bottom));
            }
            num3 = num4;
            num4 = num5;
        } else {
            num3 = null;
            num2 = null;
            num = null;
        }
        int i8 = 0;
        if (num4 == null) {
            i = 0;
        } else {
            i = num4.intValue();
        }
        this.f67579f = i;
        if (num3 == null) {
            i2 = 0;
        } else {
            i2 = num3.intValue();
        }
        this.f67580g = i2;
        if (num2 == null) {
            i3 = 0;
        } else {
            i3 = num2.intValue() - this.f67579f;
        }
        this.f67577d = i3;
        if (num != null) {
            i8 = num.intValue() - this.f67580g;
        }
        this.f67578e = i8;
        if (this.f67581h == 0) {
            this.f67581h = this.f67577d;
        }
        if (this.f67582i == 0) {
            this.f67582i = i8;
        }
        Rect bounds2 = getBounds();
        super.setBounds(bounds2.left, bounds2.top, bounds2.left + this.f67577d, bounds2.top + this.f67578e);
    }

    public void setAlpha(int i) {
        this.f67574a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f67574a.setColorFilter(colorFilter);
    }

    public void setBounds(Rect rect) {
        setBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: a */
    public void mo96583a(int... iArr) {
        this.f67576c = new ArrayList();
        for (int i : iArr) {
            this.f67576c.add(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    private void m98771a(Canvas canvas) {
        canvas.translate((float) (-this.f67579f), (float) (-this.f67580g));
        if (this.f67575b != null) {
            for (int i = 0; i < this.f67575b.size(); i++) {
                List<Integer> list = this.f67576c;
                if (list != null && i < list.size()) {
                    this.f67574a.setColor(this.f67576c.get(i).intValue());
                }
                canvas.drawPath(this.f67575b.get(i), this.f67574a);
            }
        }
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (this.f67574a.getAlpha() == 255) {
            canvas.save();
            canvas.translate((float) (bounds.left - this.f67579f), (float) (bounds.top - this.f67580g));
            if (this.f67575b != null) {
                for (int i = 0; i < this.f67575b.size(); i++) {
                    List<Integer> list = this.f67576c;
                    if (list != null && i < list.size()) {
                        this.f67574a.setColor(this.f67576c.get(i).intValue());
                    }
                    canvas.drawPath(this.f67575b.get(i), this.f67574a);
                }
                this.f67574a.setAlpha(255);
            }
            canvas.restore();
            return;
        }
        mo96586b(width, height);
        if (!mo96589d()) {
            mo96582a(width, height);
            mo96591e();
        }
        canvas.drawBitmap(this.f67585n, (float) bounds.left, (float) bounds.top, this.f67574a);
    }

    /* renamed from: a */
    public void mo96584a(String... strArr) {
        this.f67582i = 0;
        this.f67581h = 0;
        this.f67584m = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f67583l = arrayList;
        this.f67575b = arrayList;
        for (String str : strArr) {
            this.f67584m.add(str);
            this.f67583l.add(C27163a.m98758a(str));
        }
        mo96581a();
    }

    /* renamed from: a */
    public void mo96582a(int i, int i2) {
        this.f67585n.eraseColor(0);
        m98771a(new Canvas(this.f67585n));
    }

    /* renamed from: b */
    public void mo96586b(int i, int i2) {
        if (this.f67585n == null || !mo96588c(i, i2)) {
            this.f67585n = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.f67586o = true;
        }
    }

    /* renamed from: c */
    public boolean mo96588c(int i, int i2) {
        if (i == this.f67585n.getWidth() && i2 == this.f67585n.getHeight()) {
            return true;
        }
        return false;
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        List<Path> list = this.f67583l;
        if (list == null || list.size() <= 0 || (i5 == this.f67577d && i6 == this.f67578e)) {
            super.setBounds(i, i2, i3, i4);
            return;
        }
        this.f67575b = C27163a.m98759a((((float) i5) * 1.0f) / ((float) this.f67581h), (((float) i6) * 1.0f) / ((float) this.f67582i), this.f67583l, this.f67584m);
        mo96581a();
    }
}
