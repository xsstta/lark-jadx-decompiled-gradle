package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

public abstract class YearView extends View {

    /* renamed from: a */
    C23350e f57557a;

    /* renamed from: b */
    protected Paint f57558b;

    /* renamed from: c */
    protected Paint f57559c;

    /* renamed from: d */
    protected Paint f57560d;

    /* renamed from: e */
    protected Paint f57561e;

    /* renamed from: f */
    protected Paint f57562f;

    /* renamed from: g */
    protected Paint f57563g;

    /* renamed from: h */
    protected Paint f57564h;

    /* renamed from: i */
    protected Paint f57565i;

    /* renamed from: j */
    protected Paint f57566j;

    /* renamed from: k */
    protected Paint f57567k;

    /* renamed from: l */
    protected Paint f57568l;

    /* renamed from: m */
    protected Paint f57569m;

    /* renamed from: n */
    protected Paint f57570n;

    /* renamed from: o */
    protected Paint f57571o;

    /* renamed from: p */
    List<Calendar> f57572p;

    /* renamed from: q */
    protected int f57573q;

    /* renamed from: r */
    protected int f57574r;

    /* renamed from: s */
    protected float f57575s;

    /* renamed from: t */
    protected float f57576t;

    /* renamed from: u */
    protected float f57577u;

    /* renamed from: v */
    protected int f57578v;

    /* renamed from: w */
    protected int f57579w;

    /* renamed from: x */
    protected int f57580x;

    /* renamed from: y */
    protected int f57581y;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81065a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo81067a(Canvas canvas, int i, int i2, int i3, int i4, int i5);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo81068a(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo81069a(Canvas canvas, Calendar calendar, int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo81070a(Canvas canvas, Calendar calendar, int i, int i2, boolean z, boolean z2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo81071a(Canvas canvas, Calendar calendar, int i, int i2, boolean z);

    private int getMonthViewTop() {
        return this.f57557a.mo81118M() + this.f57557a.mo81121P() + this.f57557a.mo81119N() + this.f57557a.mo81120O();
    }

    /* renamed from: c */
    private void m84742c() {
        String str;
        if (!(this.f57557a.f57622c == null || this.f57557a.f57622c.size() == 0)) {
            for (Calendar calendar : this.f57572p) {
                if (this.f57557a.f57622c.containsKey(calendar.toString())) {
                    Calendar calendar2 = this.f57557a.f57622c.get(calendar.toString());
                    if (TextUtils.isEmpty(calendar2.getScheme())) {
                        str = this.f57557a.mo81132a();
                    } else {
                        str = calendar2.getScheme();
                    }
                    calendar.setScheme(str);
                    calendar.setSchemeColor(calendar2.getSchemeColor());
                    calendar.setSchemes(calendar2.getSchemes());
                } else {
                    calendar.setScheme("");
                    calendar.setSchemeColor(0);
                    calendar.setSchemes(null);
                }
            }
        }
    }

    /* renamed from: b */
    private void m84740b() {
        this.f57558b.setAntiAlias(true);
        this.f57558b.setTextAlign(Paint.Align.CENTER);
        this.f57558b.setColor(-15658735);
        this.f57558b.setFakeBoldText(true);
        this.f57559c.setAntiAlias(true);
        this.f57559c.setTextAlign(Paint.Align.CENTER);
        this.f57559c.setColor(-1973791);
        this.f57559c.setFakeBoldText(true);
        this.f57560d.setAntiAlias(true);
        this.f57560d.setTextAlign(Paint.Align.CENTER);
        this.f57561e.setAntiAlias(true);
        this.f57561e.setTextAlign(Paint.Align.CENTER);
        this.f57562f.setAntiAlias(true);
        this.f57562f.setTextAlign(Paint.Align.CENTER);
        this.f57570n.setAntiAlias(true);
        this.f57570n.setFakeBoldText(true);
        this.f57571o.setAntiAlias(true);
        this.f57571o.setFakeBoldText(true);
        this.f57571o.setTextAlign(Paint.Align.CENTER);
        this.f57563g.setAntiAlias(true);
        this.f57563g.setTextAlign(Paint.Align.CENTER);
        this.f57566j.setAntiAlias(true);
        this.f57566j.setStyle(Paint.Style.FILL);
        this.f57566j.setTextAlign(Paint.Align.CENTER);
        this.f57566j.setColor(-1223853);
        this.f57566j.setFakeBoldText(true);
        this.f57567k.setAntiAlias(true);
        this.f57567k.setStyle(Paint.Style.FILL);
        this.f57567k.setTextAlign(Paint.Align.CENTER);
        this.f57567k.setColor(-1223853);
        this.f57567k.setFakeBoldText(true);
        this.f57564h.setAntiAlias(true);
        this.f57564h.setStyle(Paint.Style.FILL);
        this.f57564h.setStrokeWidth(2.0f);
        this.f57564h.setColor(-1052689);
        this.f57568l.setAntiAlias(true);
        this.f57568l.setTextAlign(Paint.Align.CENTER);
        this.f57568l.setColor(-65536);
        this.f57568l.setFakeBoldText(true);
        this.f57569m.setAntiAlias(true);
        this.f57569m.setTextAlign(Paint.Align.CENTER);
        this.f57569m.setColor(-65536);
        this.f57569m.setFakeBoldText(true);
        this.f57565i.setAntiAlias(true);
        this.f57565i.setStyle(Paint.Style.FILL);
        this.f57565i.setStrokeWidth(2.0f);
    }

    public YearView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f57574r = (getWidth() - (this.f57557a.mo81117L() * 2)) / 7;
        mo81065a();
        m84738a(canvas);
        m84741b(canvas);
        m84743c(canvas);
    }

    /* renamed from: a */
    private void m84738a(Canvas canvas) {
        mo81068a(canvas, this.f57578v, this.f57579w, this.f57557a.mo81117L(), this.f57557a.mo81118M(), getWidth() - (this.f57557a.mo81117L() * 2), this.f57557a.mo81121P() + this.f57557a.mo81118M());
    }

    /* renamed from: c */
    private void m84743c(Canvas canvas) {
        int i = 0;
        int i2 = 0;
        while (i2 < this.f57581y) {
            int i3 = i;
            for (int i4 = 0; i4 < 7; i4++) {
                Calendar calendar = this.f57572p.get(i3);
                if (i3 <= this.f57572p.size() - this.f57580x) {
                    if (calendar.isCurrentMonth()) {
                        m84739a(canvas, calendar, i2, i4, i3);
                    }
                    i3++;
                } else {
                    return;
                }
            }
            i2++;
            i = i3;
        }
    }

    /* renamed from: b */
    private void m84741b(Canvas canvas) {
        if (this.f57557a.mo81120O() > 0) {
            int X = this.f57557a.mo81129X();
            if (X > 0) {
                X--;
            }
            int width = (getWidth() - (this.f57557a.mo81117L() * 2)) / 7;
            for (int i = 0; i < 7; i++) {
                mo81067a(canvas, X, this.f57557a.mo81117L() + (i * width), this.f57557a.mo81121P() + this.f57557a.mo81118M() + this.f57557a.mo81119N(), width, this.f57557a.mo81120O());
                X++;
                if (X >= 7) {
                    X = 0;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void setup(C23350e eVar) {
        this.f57557a = eVar;
        this.f57558b.setTextSize((float) eVar.mo81123R());
        this.f57566j.setTextSize((float) eVar.mo81123R());
        this.f57559c.setTextSize((float) eVar.mo81123R());
        this.f57568l.setTextSize((float) eVar.mo81123R());
        this.f57567k.setTextSize((float) eVar.mo81123R());
        this.f57566j.setColor(eVar.mo81124S());
        this.f57558b.setColor(eVar.mo81122Q());
        this.f57559c.setColor(eVar.mo81122Q());
        this.f57568l.setColor(eVar.mo81116K());
        this.f57567k.setColor(eVar.mo81115J());
        this.f57570n.setTextSize((float) eVar.mo81111F());
        this.f57570n.setColor(eVar.mo81112G());
        this.f57571o.setColor(eVar.mo81114I());
        this.f57571o.setTextSize((float) eVar.mo81113H());
    }

    public YearView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57558b = new Paint();
        this.f57559c = new Paint();
        this.f57560d = new Paint();
        this.f57561e = new Paint();
        this.f57562f = new Paint();
        this.f57563g = new Paint();
        this.f57564h = new Paint();
        this.f57565i = new Paint();
        this.f57566j = new Paint();
        this.f57567k = new Paint();
        this.f57568l = new Paint();
        this.f57569m = new Paint();
        this.f57570n = new Paint();
        this.f57571o = new Paint();
        m84740b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo81066a(int i, int i2) {
        this.f57578v = i;
        this.f57579w = i2;
        this.f57580x = C23349d.m84789b(i, i2, this.f57557a.mo81129X());
        C23349d.m84772a(this.f57578v, this.f57579w, this.f57557a.mo81129X());
        this.f57572p = C23349d.m84782a(this.f57578v, this.f57579w, this.f57557a.ad(), this.f57557a.mo81129X());
        this.f57581y = 6;
        m84742c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo81072b(int i, int i2) {
        Rect rect = new Rect();
        this.f57558b.getTextBounds("1", 0, 1, rect);
        int height = (rect.height() * 12) + getMonthViewTop();
        if (i2 < height) {
            i2 = height;
        }
        getLayoutParams().width = i;
        getLayoutParams().height = i2;
        this.f57573q = (i2 - getMonthViewTop()) / 6;
        Paint.FontMetrics fontMetrics = this.f57558b.getFontMetrics();
        this.f57575s = (((float) (this.f57573q / 2)) - fontMetrics.descent) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f);
        Paint.FontMetrics fontMetrics2 = this.f57570n.getFontMetrics();
        this.f57576t = (((float) (this.f57557a.mo81121P() / 2)) - fontMetrics2.descent) + ((fontMetrics2.bottom - fontMetrics2.top) / 2.0f);
        Paint.FontMetrics fontMetrics3 = this.f57571o.getFontMetrics();
        this.f57577u = (((float) (this.f57557a.mo81120O() / 2)) - fontMetrics3.descent) + ((fontMetrics3.bottom - fontMetrics3.top) / 2.0f);
        invalidate();
    }

    /* renamed from: a */
    private void m84739a(Canvas canvas, Calendar calendar, int i, int i2, int i3) {
        int i4;
        int L = (i2 * this.f57574r) + this.f57557a.mo81117L();
        int monthViewTop = (i * this.f57573q) + getMonthViewTop();
        boolean equals = calendar.equals(this.f57557a.f57634o);
        boolean hasScheme = calendar.hasScheme();
        if (hasScheme) {
            boolean z = false;
            if (equals) {
                z = mo81071a(canvas, calendar, L, monthViewTop, true);
            }
            if (z || !equals) {
                Paint paint = this.f57564h;
                if (calendar.getSchemeColor() != 0) {
                    i4 = calendar.getSchemeColor();
                } else {
                    i4 = this.f57557a.mo81171m();
                }
                paint.setColor(i4);
                mo81069a(canvas, calendar, L, monthViewTop);
            }
        } else if (equals) {
            mo81071a(canvas, calendar, L, monthViewTop, false);
        }
        mo81070a(canvas, calendar, L, monthViewTop, hasScheme, equals);
    }
}
