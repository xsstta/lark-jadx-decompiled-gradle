package com.bytedance.ee.bear.widgets.wheelview.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import com.bytedance.ee.bear.thread.BearExecutors;
import com.bytedance.ee.bear.widgets.wheelview.p572a.AbstractC11878a;
import com.bytedance.ee.bear.widgets.wheelview.p573b.AbstractC11879a;
import com.bytedance.ee.bear.widgets.wheelview.p574c.AbstractC11881b;
import com.bytedance.ee.bear.widgets.wheelview.p574c.C11880a;
import com.bytedance.ee.bear.widgets.wheelview.p575d.C11882a;
import com.bytedance.ee.bear.widgets.wheelview.p575d.C11884c;
import com.bytedance.ee.bear.widgets.wheelview.p575d.HandlerC11883b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class WheelView extends View {

    /* renamed from: A */
    private int f32142A;

    /* renamed from: B */
    private String f32143B;

    /* renamed from: C */
    private Typeface f32144C;

    /* renamed from: D */
    private int f32145D;

    /* renamed from: E */
    private int f32146E;

    /* renamed from: F */
    private int f32147F;

    /* renamed from: G */
    private int f32148G;

    /* renamed from: H */
    private float f32149H;

    /* renamed from: I */
    private boolean f32150I;

    /* renamed from: J */
    private float f32151J;

    /* renamed from: K */
    private float f32152K;

    /* renamed from: L */
    private float f32153L;

    /* renamed from: M */
    private int f32154M;

    /* renamed from: N */
    private int f32155N;

    /* renamed from: O */
    private int f32156O;

    /* renamed from: P */
    private int f32157P;

    /* renamed from: Q */
    private int f32158Q;

    /* renamed from: R */
    private int f32159R;

    /* renamed from: S */
    private int f32160S;

    /* renamed from: T */
    private int f32161T;

    /* renamed from: U */
    private int f32162U;

    /* renamed from: V */
    private float f32163V;

    /* renamed from: W */
    private long f32164W;

    /* renamed from: a */
    boolean f32165a;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private float ae;
    private float af;
    private final float ag;
    private float ah;

    /* renamed from: b */
    public AbstractC11886a f32166b;

    /* renamed from: c */
    public AbstractC11881b f32167c;

    /* renamed from: d */
    public float f32168d;

    /* renamed from: e */
    public float f32169e;

    /* renamed from: f */
    private boolean f32170f;

    /* renamed from: g */
    private int f32171g;

    /* renamed from: h */
    private DividerType f32172h;

    /* renamed from: i */
    private boolean f32173i;

    /* renamed from: j */
    private Context f32174j;

    /* renamed from: k */
    private Handler f32175k;

    /* renamed from: l */
    private GestureDetector f32176l;

    /* renamed from: m */
    private boolean f32177m;

    /* renamed from: n */
    private ScheduledExecutorService f32178n;

    /* renamed from: o */
    private ScheduledFuture<?> f32179o;

    /* renamed from: p */
    private Paint f32180p;

    /* renamed from: q */
    private Paint f32181q;

    /* renamed from: r */
    private Paint f32182r;

    /* renamed from: s */
    private AbstractC11878a f32183s;

    /* renamed from: t */
    private String f32184t;

    /* renamed from: u */
    private String f32185u;

    /* renamed from: v */
    private int f32186v;

    /* renamed from: w */
    private int f32187w;

    /* renamed from: x */
    private int f32188x;

    /* renamed from: y */
    private int f32189y;

    /* renamed from: z */
    private int f32190z;

    public enum ACTION {
        CLICK,
        FLING,
        DAGGLE
    }

    public enum DividerType {
        FILL,
        WRAP
    }

    /* renamed from: com.bytedance.ee.bear.widgets.wheelview.view.WheelView$a */
    public interface AbstractC11886a {
        /* renamed from: a */
        void mo45742a(WheelView wheelView, int i, int i2);

        /* renamed from: a */
        void mo45743a(boolean z);
    }

    /* renamed from: d */
    public boolean mo45705d() {
        return this.f32150I;
    }

    public final AbstractC11878a getAdapter() {
        return this.f32183s;
    }

    public Handler getHandler() {
        return this.f32175k;
    }

    public int getInitPosition() {
        return this.f32154M;
    }

    public float getItemHeight() {
        return this.f32168d;
    }

    public float getResistance() {
        return this.ah;
    }

    public float getTotalScrollY() {
        return this.f32169e;
    }

    /* renamed from: b */
    public void mo45703b() {
        m49332g();
        requestLayout();
    }

    /* renamed from: c */
    public final void mo45704c() {
        if (this.f32167c != null) {
            postDelayed(new Runnable() {
                /* class com.bytedance.ee.bear.widgets.wheelview.view.WheelView.RunnableC118851 */

                public void run() {
                    float f;
                    if (WheelView.this.f32166b != null) {
                        float f2 = WheelView.this.f32169e / WheelView.this.f32168d;
                        if (WheelView.this.f32169e >= BitmapDescriptorFactory.HUE_RED) {
                            f = 0.5f;
                        } else {
                            f = -0.5f;
                        }
                        AbstractC11886a aVar = WheelView.this.f32166b;
                        WheelView wheelView = WheelView.this;
                        aVar.mo45742a(wheelView, (int) (f2 + f), wheelView.getCurrentItem());
                    }
                    WheelView.this.f32167c.mo40119a(WheelView.this.getCurrentItem());
                }
            }, 200);
        }
    }

    public int getItemsCount() {
        AbstractC11878a aVar = this.f32183s;
        if (aVar != null) {
            return aVar.mo40121a();
        }
        return 0;
    }

    /* renamed from: e */
    private void m49330e() {
        float f = this.f32149H;
        if (f < 1.0f) {
            this.f32149H = 1.0f;
        } else if (f > 4.0f) {
            this.f32149H = 4.0f;
        }
    }

    /* renamed from: a */
    public void mo45700a() {
        ScheduledFuture<?> scheduledFuture = this.f32179o;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f32179o.cancel(true);
            this.f32179o = null;
        }
    }

    public final Object getCurrentObject() {
        if (this.f32183s == null) {
            return null;
        }
        return this.f32183s.mo40125b(getCurrentItem());
    }

    /* renamed from: h */
    private void m49333h() {
        Rect rect = new Rect();
        Paint paint = this.f32181q;
        String str = this.f32143B;
        paint.getTextBounds(str, 0, str.length(), rect);
        this.f32189y = rect.width();
        this.f32181q.getTextBounds("星期", 0, 2, rect);
        int height = rect.height() + 2;
        this.f32190z = height;
        this.f32168d = this.f32149H * ((float) height);
    }

    /* renamed from: f */
    private void m49331f() {
        Paint paint = new Paint();
        this.f32180p = paint;
        paint.setColor(this.f32145D);
        this.f32180p.setAntiAlias(true);
        this.f32180p.setTextSize((float) this.f32188x);
        Paint paint2 = new Paint();
        this.f32181q = paint2;
        paint2.setColor(this.f32146E);
        this.f32181q.setAntiAlias(true);
        this.f32181q.setTextScaleX(1.1f);
        this.f32181q.setTextSize((float) this.f32186v);
        Paint paint3 = new Paint();
        this.f32182r = paint3;
        paint3.setColor(this.f32148G);
        this.f32182r.setAntiAlias(true);
        setLayerType(1, null);
    }

    /* renamed from: g */
    private void m49332g() {
        if (this.f32183s != null) {
            m49333h();
            int i = (int) (this.f32168d * ((float) (this.f32158Q - 1)));
            this.f32159R = (int) (((double) (i * 2)) / 3.141592653589793d);
            this.f32161T = (int) (((double) i) / 3.141592653589793d);
            this.f32160S = View.MeasureSpec.getSize(this.aa);
            int i2 = this.f32159R;
            float f = this.f32168d;
            this.f32151J = (((float) i2) - f) / 2.0f;
            float f2 = (((float) i2) + f) / 2.0f;
            this.f32152K = f2;
            this.f32153L = (f2 - ((f - ((float) this.f32190z)) / 2.0f)) - this.ae;
            if (this.f32154M == -1) {
                if (this.f32150I) {
                    this.f32154M = (this.f32183s.mo40121a() + 1) / 2;
                } else {
                    this.f32154M = 0;
                }
            }
            this.f32156O = this.f32154M;
        }
    }

    public final int getCurrentItem() {
        int i;
        AbstractC11878a aVar = this.f32183s;
        if (aVar == null) {
            return 0;
        }
        if (!this.f32150I || ((i = this.f32155N) >= 0 && i < aVar.mo40121a())) {
            return Math.max(0, Math.min(this.f32155N, this.f32183s.mo40121a() - 1));
        }
        return Math.max(0, Math.min(Math.abs(Math.abs(this.f32155N) - this.f32183s.mo40121a()), this.f32183s.mo40121a() - 1));
    }

    public final void setCyclic(boolean z) {
        this.f32150I = z;
    }

    public void setDefaultContent(String str) {
        this.f32184t = str;
    }

    public void setDividerType(DividerType dividerType) {
        this.f32172h = dividerType;
    }

    public void setGravity(int i) {
        this.ab = i;
    }

    public void setLabel(String str) {
        this.f32185u = str;
    }

    public final void setMaxWidthText(String str) {
        this.f32143B = str;
    }

    public void setOnItemScrollListener(AbstractC11886a aVar) {
        this.f32166b = aVar;
    }

    public final void setOnItemSelectedListener(AbstractC11881b bVar) {
        this.f32167c = bVar;
    }

    public void setResistance(float f) {
        this.ah = f;
    }

    public void setScroll(boolean z) {
        this.f32170f = z;
    }

    public void setTextColorLabel(int i) {
        this.f32147F = i;
    }

    public void setTotalScrollY(float f) {
        this.f32169e = f;
    }

    public WheelView(Context context) {
        this(context, null);
    }

    public final void setAdapter(AbstractC11878a aVar) {
        this.f32183s = aVar;
        mo45703b();
    }

    public void setDividerColor(int i) {
        this.f32148G = i;
        this.f32182r.setColor(i);
    }

    public void setTextColorCenter(int i) {
        this.f32146E = i;
        this.f32181q.setColor(i);
    }

    public void setTextColorOut(int i) {
        this.f32145D = i;
        this.f32180p.setColor(i);
    }

    public final void setCurrentItem(int i) {
        this.f32155N = i;
        this.f32154M = i;
        this.f32169e = BitmapDescriptorFactory.HUE_RED;
        invalidate();
    }

    public void setLineSpacingMultiplier(float f) {
        if (f != BitmapDescriptorFactory.HUE_RED) {
            this.f32149H = f;
            m49330e();
        }
    }

    public void setTextXOffset(int i) {
        this.f32142A = i;
        if (i != 0) {
            this.f32181q.setTextScaleX(1.0f);
        }
    }

    public final void setTypeface(Typeface typeface) {
        this.f32144C = typeface;
        this.f32180p.setTypeface(typeface);
        this.f32181q.setTypeface(this.f32144C);
    }

    public final void setTextSizeCenter(float f) {
        if (f > BitmapDescriptorFactory.HUE_RED) {
            int i = (int) (this.f32174j.getResources().getDisplayMetrics().density * f);
            this.f32186v = i;
            this.f32181q.setTextSize((float) i);
        }
    }

    public final void setTextSizeLabel(float f) {
        if (f > BitmapDescriptorFactory.HUE_RED) {
            this.f32187w = (int) (this.f32174j.getResources().getDisplayMetrics().density * f);
        }
    }

    public final void setTextSizeOut(float f) {
        if (f > BitmapDescriptorFactory.HUE_RED) {
            int i = (int) (this.f32174j.getResources().getDisplayMetrics().density * f);
            this.f32188x = i;
            this.f32180p.setTextSize((float) i);
        }
    }

    /* renamed from: a */
    private int m49324a(int i) {
        if (i < 0) {
            return m49324a(i + this.f32183s.mo40121a());
        }
        if (i > this.f32183s.mo40121a() - 1) {
            return m49324a(i - this.f32183s.mo40121a());
        }
        return i;
    }

    /* renamed from: b */
    private void m49328b(String str) {
        Rect rect = new Rect();
        this.f32181q.getTextBounds(str, 0, str.length(), rect);
        int i = this.ab;
        if (i == 3) {
            this.ac = 0;
        } else if (i == 5) {
            this.ac = (this.f32160S - rect.width()) - ((int) this.ae);
        } else if (i == 17) {
            this.ac = (int) (((double) (this.f32160S - rect.width())) * 0.5d);
        }
    }

    /* renamed from: c */
    private void m49329c(String str) {
        Rect rect = new Rect();
        this.f32180p.getTextBounds(str, 0, str.length(), rect);
        int i = this.ab;
        if (i == 3) {
            this.ad = 0;
        } else if (i == 5) {
            this.ad = (this.f32160S - rect.width()) - ((int) this.ae);
        } else if (i == 17) {
            this.ad = (int) (((double) (this.f32160S - rect.width())) * 0.5d);
        }
    }

    /* renamed from: a */
    private String m49325a(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof AbstractC11879a) {
            return ((AbstractC11879a) obj).mo45695a();
        }
        if (!(obj instanceof Integer)) {
            return obj.toString();
        }
        return String.format(Locale.getDefault(), "%02d", Integer.valueOf(((Integer) obj).intValue()));
    }

    /* renamed from: a */
    private void m49326a(Context context) {
        this.f32174j = context;
        this.f32175k = new HandlerC11883b(this);
        GestureDetector gestureDetector = new GestureDetector(context, new C11880a(this));
        this.f32176l = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f32169e = BitmapDescriptorFactory.HUE_RED;
        this.f32154M = -1;
        m49331f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r5 != 3) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 245
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.widgets.wheelview.view.WheelView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private void m49327a(String str) {
        Rect rect = new Rect();
        this.f32181q.getTextBounds(str, 0, str.length(), rect);
        int i = this.f32186v;
        int i2 = this.f32188x;
        for (int width = rect.width(); width > this.f32160S; width = rect.width()) {
            i--;
            i2--;
            this.f32181q.setTextSize((float) i);
            this.f32181q.getTextBounds(str, 0, str.length(), rect);
        }
        this.f32180p.setTextSize((float) i2);
    }

    /* renamed from: a */
    public final void mo45701a(float f) {
        mo45700a();
        this.f32179o = this.f32178n.scheduleWithFixedDelay(new C11882a(this, f), 0, 5, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        String str;
        String str2;
        Object[] objArr;
        String str3;
        int i;
        String str4;
        String str5;
        String str6;
        int i2;
        float f;
        if (this.f32183s != null) {
            int min = Math.min(Math.max(0, this.f32154M), this.f32183s.mo40121a() - 1);
            this.f32154M = min;
            Object[] objArr2 = new Object[this.f32158Q];
            int i3 = (int) (this.f32169e / this.f32168d);
            this.f32157P = i3;
            try {
                this.f32156O = min + (i3 % this.f32183s.mo40121a());
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
            if (!this.f32150I) {
                if (this.f32156O < 0) {
                    this.f32156O = 0;
                }
                if (this.f32156O > this.f32183s.mo40121a() - 1) {
                    this.f32156O = this.f32183s.mo40121a() - 1;
                }
            } else {
                if (this.f32156O < 0) {
                    this.f32156O = this.f32183s.mo40121a() + this.f32156O;
                }
                if (this.f32156O > this.f32183s.mo40121a() - 1) {
                    this.f32156O -= this.f32183s.mo40121a();
                }
            }
            float f2 = this.f32169e % this.f32168d;
            int i4 = 0;
            while (true) {
                int i5 = this.f32158Q;
                str = "";
                if (i4 >= i5) {
                    break;
                }
                int i6 = this.f32156O - ((i5 / 2) - i4);
                if (this.f32150I) {
                    objArr2[i4] = this.f32183s.mo40125b(m49324a(i6));
                } else if (i6 < 0) {
                    objArr2[i4] = str;
                } else if (i6 > this.f32183s.mo40121a() - 1) {
                    objArr2[i4] = str;
                } else {
                    objArr2[i4] = this.f32183s.mo40125b(i6);
                }
                i4++;
            }
            if (this.f32172h == DividerType.WRAP) {
                if (TextUtils.isEmpty(this.f32185u)) {
                    i2 = (this.f32160S - this.f32189y) / 2;
                } else {
                    i2 = (this.f32160S - this.f32189y) / 4;
                }
                float f3 = (float) (i2 - 12);
                if (f3 <= BitmapDescriptorFactory.HUE_RED) {
                    f = 10.0f;
                } else {
                    f = f3;
                }
                float f4 = ((float) this.f32160S) - f;
                float f5 = this.f32151J;
                canvas.drawLine(f, f5, f4, f5, this.f32182r);
                if (this.f32173i) {
                    float f6 = this.f32152K;
                    canvas.drawLine(f, f6, f4, f6, this.f32182r);
                }
            } else {
                float f7 = this.f32151J;
                canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f7, (float) this.f32160S, f7, this.f32182r);
                if (this.f32173i) {
                    float f8 = this.f32152K;
                    canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f8, (float) this.f32160S, f8, this.f32182r);
                }
            }
            if (!TextUtils.isEmpty(this.f32185u) && this.f32177m) {
                m49328b(this.f32143B);
                int i7 = this.ac + this.f32189y;
                Paint paint = this.f32181q;
                int i8 = this.f32187w;
                if (i8 == 0) {
                    i8 = this.f32186v;
                }
                paint.setTextSize((float) i8);
                Paint paint2 = this.f32181q;
                int i9 = this.f32147F;
                if (i9 == 0) {
                    i9 = this.f32146E;
                }
                paint2.setColor(i9);
                canvas.drawText(this.f32185u, ((float) i7) - this.ae, this.f32153L, this.f32181q);
                this.f32181q.setTextSize((float) this.f32186v);
                this.f32181q.setColor(this.f32146E);
            }
            int i10 = 0;
            while (i10 < this.f32158Q) {
                canvas.save();
                double d = (double) (((this.f32168d * ((float) i10)) - f2) / ((float) this.f32161T));
                float f9 = (float) (90.0d - ((d / 3.141592653589793d) * 180.0d));
                if (f9 >= 90.0f || f9 <= -90.0f) {
                    objArr = objArr2;
                    str2 = str;
                    canvas.restore();
                } else {
                    float pow = (float) Math.pow((double) (Math.abs(f9) / 90.0f), 2.2d);
                    if (TextUtils.isEmpty(this.f32185u) || TextUtils.isEmpty(m49325a(objArr2[i10]))) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(m49325a(objArr2[i10]));
                        if (TextUtils.isEmpty(this.f32184t)) {
                            str5 = str;
                        } else {
                            str5 = this.f32184t;
                        }
                        sb.append(str5);
                        str3 = sb.toString();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m49325a(objArr2[i10]));
                        if (TextUtils.isEmpty(this.f32184t)) {
                            str6 = str;
                        } else {
                            str6 = this.f32184t;
                        }
                        sb2.append(str6);
                        sb2.append(this.f32185u);
                        str3 = sb2.toString();
                    }
                    m49327a(str3);
                    m49328b(str3);
                    m49329c(str3);
                    if (!TextUtils.isEmpty(this.f32185u) && this.f32177m) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(m49325a(objArr2[i10]));
                        if (TextUtils.isEmpty(this.f32184t)) {
                            str4 = str;
                        } else {
                            str4 = this.f32184t;
                        }
                        sb3.append(str4);
                        str3 = sb3.toString();
                    }
                    objArr = objArr2;
                    str2 = str;
                    float cos = (float) ((((double) this.f32161T) - (Math.cos(d) * ((double) this.f32161T))) - ((Math.sin(d) * ((double) this.f32190z)) / 2.0d));
                    canvas.translate(BitmapDescriptorFactory.HUE_RED, cos);
                    float f10 = this.f32151J;
                    if (cos > f10 || ((float) this.f32190z) + cos < f10) {
                        float f11 = this.f32152K;
                        if (cos > f11 || ((float) this.f32190z) + cos < f11) {
                            if (cos >= f10) {
                                int i11 = this.f32190z;
                                if (((float) i11) + cos <= f11) {
                                    canvas.drawText(str3, (float) this.ac, ((float) i11) - this.ae, this.f32181q);
                                    this.f32155N = this.f32156O - ((this.f32158Q / 2) - i10);
                                }
                            }
                            canvas.save();
                            canvas.clipRect(0, 0, this.f32160S, (int) this.f32168d);
                            canvas.scale(1.0f, ((float) Math.sin(d)) * this.af);
                            Paint paint3 = this.f32180p;
                            int compare = Integer.compare(this.f32142A, 0);
                            if (f9 > BitmapDescriptorFactory.HUE_RED) {
                                i = -1;
                            } else {
                                i = 1;
                            }
                            paint3.setTextSkewX(((float) (compare * i)) * 0.5f * pow);
                            this.f32180p.setAlpha((int) ((1.0f - pow) * 255.0f));
                            canvas.drawText(str3, ((float) this.ad) + (((float) this.f32142A) * pow), (float) this.f32190z, this.f32180p);
                            canvas.restore();
                            canvas.restore();
                            this.f32181q.setTextSize((float) this.f32186v);
                        } else {
                            canvas.save();
                            canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f32160S, this.f32152K - cos);
                            canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                            canvas.drawText(str3, (float) this.ac, ((float) this.f32190z) - this.ae, this.f32181q);
                            canvas.restore();
                            canvas.save();
                            canvas.clipRect(BitmapDescriptorFactory.HUE_RED, this.f32152K - cos, (float) this.f32160S, (float) ((int) this.f32168d));
                            canvas.scale(1.0f, ((float) Math.sin(d)) * this.af);
                            canvas.drawText(str3, (float) this.ad, (float) this.f32190z, this.f32180p);
                            canvas.restore();
                        }
                    } else {
                        canvas.save();
                        canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f32160S, this.f32151J - cos);
                        canvas.scale(1.0f, ((float) Math.sin(d)) * this.af);
                        canvas.drawText(str3, (float) this.ad, (float) this.f32190z, this.f32180p);
                        canvas.restore();
                        canvas.save();
                        canvas.clipRect(BitmapDescriptorFactory.HUE_RED, this.f32151J - cos, (float) this.f32160S, (float) ((int) this.f32168d));
                        canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                        canvas.drawText(str3, (float) this.ac, ((float) this.f32190z) - this.ae, this.f32181q);
                        canvas.restore();
                    }
                    canvas.restore();
                    this.f32181q.setTextSize((float) this.f32186v);
                }
                i10++;
                objArr2 = objArr;
                str = str2;
            }
        }
    }

    /* renamed from: a */
    public void mo45702a(ACTION action) {
        mo45700a();
        if (action == ACTION.FLING || action == ACTION.DAGGLE) {
            float f = this.f32169e;
            float f2 = this.f32168d;
            int i = (int) (((f % f2) + f2) % f2);
            this.f32162U = i;
            if (((float) i) > f2 / 2.0f) {
                this.f32162U = (int) (f2 - ((float) i));
            } else {
                this.f32162U = -i;
            }
        }
        this.f32179o = this.f32178n.scheduleWithFixedDelay(new C11884c(this, this.f32162U), 0, 10, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            size = (int) this.f32181q.measureText(this.f32143B);
            mode = 1073741824;
        }
        this.aa = View.MeasureSpec.makeMeasureSpec(size, mode);
        m49332g();
        setMeasuredDimension(this.f32160S, this.f32159R);
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32170f = true;
        this.f32173i = true;
        this.f32177m = true;
        this.f32178n = BearExecutors.m48471f();
        this.f32143B = "";
        this.f32144C = Typeface.MONOSPACE;
        this.f32149H = 1.6f;
        this.f32158Q = 11;
        this.f32162U = 0;
        this.f32163V = BitmapDescriptorFactory.HUE_RED;
        this.f32164W = 0;
        this.ab = 17;
        this.ac = 0;
        this.ad = 0;
        this.af = 0.8f;
        this.ag = 0.5f;
        this.ah = 20.0f;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.widget_wheelview_textsize);
        float f = getResources().getDisplayMetrics().density;
        if (f < 1.0f) {
            this.ae = 2.4f;
        } else {
            int i = (1.0f > f ? 1 : (1.0f == f ? 0 : -1));
            if (i <= 0 && f < 2.0f) {
                this.ae = 3.6f;
            } else if (i <= 0 && f < 2.0f) {
                this.ae = 4.5f;
            } else if (2.0f <= f && f < 3.0f) {
                this.ae = 6.0f;
            } else if (f >= 3.0f) {
                this.ae = f * 2.5f;
            }
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.wheelView_cyclic, R.attr.wheelView_dividerColor, R.attr.wheelView_gravity, R.attr.wheelView_lineSpacingMultiplier, R.attr.wheelView_resistance, R.attr.wheelView_textColorCenter, R.attr.wheelView_textColorOut, R.attr.wheelView_textScaleOut, R.attr.wheelView_textSizeCenter, R.attr.wheelView_textSizeOut}, 0, 0);
            this.ab = obtainStyledAttributes.getInt(2, 17);
            this.f32145D = obtainStyledAttributes.getColor(6, context.getResources().getColor(R.color.text_placeholder));
            this.f32146E = obtainStyledAttributes.getColor(5, context.getResources().getColor(R.color.text_title));
            this.f32148G = obtainStyledAttributes.getColor(1, context.getResources().getColor(R.color.line_divider_default));
            this.f32186v = obtainStyledAttributes.getDimensionPixelOffset(8, dimensionPixelSize);
            this.f32188x = obtainStyledAttributes.getDimensionPixelOffset(9, dimensionPixelSize);
            this.af = obtainStyledAttributes.getFloat(7, 0.8f);
            this.f32149H = obtainStyledAttributes.getFloat(3, this.f32149H);
            this.f32150I = obtainStyledAttributes.getBoolean(0, true);
            this.ah = obtainStyledAttributes.getFloat(4, 20.0f);
            obtainStyledAttributes.recycle();
        }
        m49330e();
        m49326a(context);
    }
}
