package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline;

import android.graphics.Rect;
import com.ss.android.lark.calendar.impl.utils.CalendarWorkHourUtil;
import com.ss.android.lark.utils.UIHelper;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.c */
public class C30167c {

    /* renamed from: a */
    public C30169b[][] f75268a;

    /* renamed from: b */
    public int f75269b;

    /* renamed from: c */
    public int f75270c;

    /* renamed from: d */
    public int f75271d;

    /* renamed from: e */
    public int f75272e;

    /* renamed from: f */
    public int f75273f;

    /* renamed from: g */
    public float f75274g;

    /* renamed from: h */
    private final int f75275h = 24;

    /* renamed from: i */
    private final int f75276i = 60;

    /* renamed from: j */
    private final int f75277j = CalendarWorkHourUtil.f83805a;

    /* renamed from: k */
    private int f75278k;

    /* renamed from: l */
    private int f75279l;

    /* renamed from: m */
    private int f75280m;

    /* renamed from: n */
    private int f75281n;

    /* renamed from: o */
    private int f75282o;

    /* renamed from: p */
    private int f75283p;

    /* renamed from: q */
    private float f75284q;

    /* renamed from: r */
    private int f75285r;

    /* renamed from: s */
    private int f75286s;

    /* renamed from: t */
    private Rect f75287t = new Rect();

    /* renamed from: u */
    private AbstractC30170c f75288u;

    /* renamed from: v */
    private List<int[]> f75289v = new ArrayList();

    /* renamed from: w */
    private C30172e f75290w;

    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.c$c */
    interface AbstractC30170c {
    }

    /* renamed from: a */
    public int mo108768a() {
        return this.f75270c;
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.c$a */
    public static class C30168a {

        /* renamed from: a */
        public int f75291a;

        /* renamed from: b */
        public int f75292b;

        /* renamed from: c */
        public int f75293c = UIHelper.dp2px(1.0f);

        /* renamed from: d */
        public int f75294d;

        /* renamed from: e */
        public int f75295e = UIHelper.dp2px(7.0f);

        /* renamed from: f */
        public int f75296f;

        /* renamed from: g */
        public int f75297g;

        /* renamed from: h */
        public float f75298h = ((float) UIHelper.dp2px(50.0f));

        /* renamed from: i */
        public int f75299i;

        /* renamed from: j */
        public int f75300j = UIHelper.dp2px(5.0f);

        /* renamed from: k */
        public int f75301k = UIHelper.dp2px(0.5f);

        /* renamed from: l */
        public int f75302l = UIHelper.dp2px(1.0f);

        /* renamed from: a */
        public C30167c mo108781a() {
            C30167c cVar = new C30167c(this);
            cVar.mo108779d();
            return cVar;
        }

        /* renamed from: a */
        public C30168a mo108780a(int i) {
            this.f75291a = i;
            return this;
        }

        /* renamed from: b */
        public C30168a mo108782b(int i) {
            this.f75292b = i;
            return this;
        }

        /* renamed from: c */
        public C30168a mo108783c(int i) {
            this.f75293c = i;
            return this;
        }

        /* renamed from: d */
        public C30168a mo108784d(int i) {
            this.f75295e = i;
            return this;
        }

        /* renamed from: e */
        public C30168a mo108785e(int i) {
            this.f75300j = i;
            return this;
        }

        /* renamed from: f */
        public C30168a mo108786f(int i) {
            this.f75301k = i;
            return this;
        }

        /* renamed from: g */
        public C30168a mo108787g(int i) {
            this.f75297g = i;
            return this;
        }

        /* renamed from: h */
        public C30168a mo108788h(int i) {
            this.f75298h = (float) i;
            return this;
        }

        /* renamed from: i */
        public C30168a mo108789i(int i) {
            this.f75302l = i;
            return this;
        }
    }

    /* renamed from: b */
    public int mo108775b() {
        return this.f75268a[23][0].f75306d;
    }

    /* renamed from: c */
    public int mo108778c() {
        int b = mo108776b(0);
        int b2 = mo108776b(30);
        int i = this.f75268a[0][0].f75303a;
        this.f75287t.set(i, b, this.f75271d + i, b2);
        return this.f75287t.height();
    }

    /* renamed from: d */
    public void mo108779d() {
        for (int i = 0; i < 24; i++) {
            for (int i2 = 0; i2 < this.f75282o; i2++) {
                int i3 = (this.f75271d * i2) + this.f75269b + ((this.f75285r + this.f75286s) * i2);
                int round = Math.round((((float) i) * this.f75284q) + ((float) this.f75270c));
                this.f75268a[i][i2] = new C30169b(i3, round, i3 + this.f75271d, Math.round(((float) round) + this.f75284q));
            }
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.c$d */
    class C30171d implements AbstractC30170c {
        C30171d() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.c$e */
    public class C30172e {
        C30172e() {
        }

        /* renamed from: a */
        public Rect mo108790a(float f, float f2, float f3, float f4, int i) {
            int round = Math.round(f2 * 14.4f * C30167c.this.f75274g);
            int round2 = Math.round((f / 100.0f) * ((float) C30167c.this.f75271d));
            int round3 = Math.round((f3 / 100.0f) * ((float) C30167c.this.f75271d)) + (i * C30167c.this.f75272e) + C30167c.this.f75269b;
            int round4 = Math.round(f4 * 14.4f * C30167c.this.f75274g) + C30167c.this.f75270c;
            return new Rect(round3, round4, round2 + round3, round + round4);
        }
    }

    /* renamed from: a */
    public int mo108769a(float f) {
        return (int) Math.min(((f - ((float) this.f75269b)) - ((float) this.f75280m)) / ((float) this.f75271d), (float) (this.f75282o - 1));
    }

    /* renamed from: b */
    public int mo108776b(int i) {
        return Math.round((((float) i) * this.f75274g) + ((float) this.f75270c));
    }

    /* renamed from: a */
    public int mo108770a(int i) {
        return Math.round((((float) ((i - this.f75270c) - this.f75281n)) * 1.0f) / this.f75274g) * 60;
    }

    public C30167c(C30168a aVar) {
        this.f75278k = aVar.f75291a;
        this.f75279l = aVar.f75292b;
        this.f75269b = aVar.f75293c;
        this.f75280m = aVar.f75294d;
        this.f75270c = aVar.f75295e;
        this.f75281n = aVar.f75296f;
        this.f75283p = aVar.f75301k;
        this.f75282o = aVar.f75297g;
        this.f75284q = aVar.f75298h;
        this.f75285r = aVar.f75299i;
        this.f75286s = aVar.f75300j;
        this.f75273f = aVar.f75302l;
        int[] iArr = new int[2];
        iArr[1] = this.f75282o;
        iArr[0] = 24;
        this.f75268a = (C30169b[][]) Array.newInstance(C30169b.class, iArr);
        int i = ((this.f75278k - this.f75269b) - this.f75280m) / this.f75282o;
        this.f75272e = i;
        this.f75271d = (i - this.f75285r) - this.f75286s;
        this.f75274g = this.f75284q / 60.0f;
        this.f75288u = new C30171d();
        this.f75290w = new C30172e();
    }

    /* renamed from: c */
    private Rect m111771c(float f, float f2) {
        int i;
        int i2 = this.f75271d;
        if (i2 == 0) {
            this.f75287t.setEmpty();
            return this.f75287t;
        }
        float f3 = (f - ((float) this.f75269b)) - ((float) this.f75280m);
        float f4 = (f2 - ((float) this.f75270c)) - ((float) this.f75281n);
        int i3 = (int) (f3 / ((float) ((i2 + this.f75285r) + this.f75286s)));
        int i4 = (int) (f4 / this.f75284q);
        int i5 = 0;
        if (i4 < 0) {
            i = 0;
        } else {
            i = Math.min(i4, 23);
        }
        if (i3 >= 0) {
            i5 = Math.min(i3, this.f75282o - 1);
        }
        C30169b bVar = this.f75268a[i][i5];
        if (bVar != null) {
            this.f75287t.set(bVar.f75303a, bVar.f75304b, bVar.f75305c, bVar.f75306d);
        } else {
            this.f75287t.setEmpty();
        }
        return this.f75287t;
    }

    /* renamed from: b */
    public Rect mo108777b(float f, float f2) {
        Rect c = m111771c(f, f2);
        int height = c.height();
        int round = Math.round((float) (c.top + (height / 4)));
        int round2 = Math.round((float) (c.top + ((height * 3) / 4)));
        int round3 = Math.round((float) (c.height() / 2));
        if (f2 < ((float) round)) {
            if (c.top - round3 > mo108768a()) {
                c.offset(0, -round3);
            }
        } else if (f2 > ((float) round2) && c.bottom + round3 < mo108775b()) {
            c.offset(0, round3);
        }
        return c;
    }

    /* renamed from: a */
    public Rect mo108771a(float f, float f2) {
        Rect c = m111771c(f, f2);
        float height = (float) c.height();
        float f3 = 1.0f * height;
        int round = Math.round(((float) c.top) + (f3 / 4.0f));
        int round2 = Math.round(((float) c.top) + (f3 / 2.0f));
        int round3 = Math.round(((float) c.top) + ((height * 3.0f) / 4.0f));
        if (f2 > ((float) c.top) && f2 <= ((float) round)) {
            c.set(c.left, m111770a(c.top, round, f2), c.right, c.bottom);
        } else if (f2 > ((float) round) && f2 <= ((float) round2)) {
            c.set(c.left, m111770a(round, round2, f2), c.right, c.bottom);
        } else if (f2 > ((float) round2) && f2 <= ((float) round3)) {
            c.set(c.left, m111770a(round2, round3, f2), c.right, c.bottom);
        } else if (f2 > ((float) round3) && f2 <= ((float) c.bottom)) {
            c.set(c.left, m111770a(round3, c.bottom, f2), c.right, c.bottom);
        }
        return c;
    }

    /* renamed from: a */
    public Rect mo108773a(int i, int i2) {
        if (i >= this.f75282o || i < 0 || i2 < 0 || i2 > 1440) {
            this.f75287t.setEmpty();
            return this.f75287t;
        }
        int i3 = this.f75268a[0][i].f75303a;
        int b = mo108776b(i2);
        this.f75287t.set(i3, b, this.f75272e + i3, Math.round(((float) b) + this.f75284q));
        return this.f75287t;
    }

    /* renamed from: a */
    private int m111770a(int i, int i2, float f) {
        return f >= ((float) ((i + i2) / 2)) ? i2 : i;
    }

    /* renamed from: a */
    public Rect mo108774a(int i, int i2, int i3) {
        if (i >= this.f75282o || i < 0 || i3 <= i2) {
            this.f75287t.setEmpty();
            return this.f75287t;
        }
        int i4 = this.f75268a[0][i].f75303a;
        this.f75287t.set(i4, mo108776b(i2), this.f75271d + i4, mo108776b(i3));
        return this.f75287t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.c$b */
    public class C30169b {

        /* renamed from: a */
        public int f75303a;

        /* renamed from: b */
        public int f75304b;

        /* renamed from: c */
        public int f75305c;

        /* renamed from: d */
        public int f75306d;

        public C30169b(int i, int i2, int i3, int i4) {
            this.f75303a = i;
            this.f75304b = i2;
            this.f75305c = i3;
            this.f75306d = i4;
        }
    }

    /* renamed from: a */
    public Rect mo108772a(float f, float f2, float f3, float f4, int i) {
        return this.f75290w.mo108790a(f, f2, f3, f4, i);
    }
}
