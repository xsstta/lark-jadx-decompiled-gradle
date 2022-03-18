package com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.C0917s;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.AbstractC31902b;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.AbstractC31908f;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.log.Log;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class WheelView extends View {

    /* renamed from: A */
    int f81411A;

    /* renamed from: B */
    int f81412B;

    /* renamed from: C */
    int f81413C;

    /* renamed from: D */
    int f81414D;

    /* renamed from: E */
    long f81415E;

    /* renamed from: F */
    int f81416F;

    /* renamed from: G */
    protected Object[] f81417G;

    /* renamed from: H */
    private final float f81418H;

    /* renamed from: I */
    private DividerType f81419I;

    /* renamed from: J */
    private GestureDetector f81420J;

    /* renamed from: K */
    private boolean f81421K;

    /* renamed from: L */
    private boolean f81422L;

    /* renamed from: M */
    private ScheduledFuture<?> f81423M;

    /* renamed from: N */
    private String f81424N;

    /* renamed from: O */
    private int f81425O;

    /* renamed from: P */
    private int f81426P;

    /* renamed from: Q */
    private int f81427Q;

    /* renamed from: R */
    private float f81428R;

    /* renamed from: S */
    private int f81429S;

    /* renamed from: T */
    private int f81430T;

    /* renamed from: U */
    private int f81431U;

    /* renamed from: V */
    private float f81432V;

    /* renamed from: W */
    private boolean f81433W;

    /* renamed from: a */
    Context f81434a;
    private Float aa;
    private ILoopChangeListener ab;
    private boolean ac;

    /* renamed from: b */
    Handler f81435b;

    /* renamed from: c */
    AbstractC31917h f81436c;

    /* renamed from: d */
    ScheduledExecutorService f81437d;

    /* renamed from: e */
    Paint f81438e;

    /* renamed from: f */
    Paint f81439f;

    /* renamed from: g */
    Paint f81440g;

    /* renamed from: h */
    AbstractC31902b f81441h;

    /* renamed from: i */
    int f81442i;

    /* renamed from: j */
    int f81443j;

    /* renamed from: k */
    int f81444k;

    /* renamed from: l */
    float f81445l;

    /* renamed from: m */
    Typeface f81446m;

    /* renamed from: n */
    int f81447n;

    /* renamed from: o */
    int f81448o;

    /* renamed from: p */
    int f81449p;

    /* renamed from: q */
    float f81450q;

    /* renamed from: r */
    boolean f81451r;

    /* renamed from: s */
    float f81452s;

    /* renamed from: t */
    float f81453t;

    /* renamed from: u */
    float f81454u;

    /* renamed from: v */
    float f81455v;

    /* renamed from: w */
    int f81456w;

    /* renamed from: x */
    int f81457x;

    /* renamed from: y */
    int f81458y;

    /* renamed from: z */
    int f81459z;

    public enum ACTION {
        CLICK,
        FLING,
        DAGGLE
    }

    public enum DividerType {
        FILL,
        WRAP,
        NONE
    }

    public final AbstractC31902b getAdapter() {
        return this.f81441h;
    }

    public final int getCurrentItem() {
        return this.f81426P;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m121355h() {
        this.ab.onChangeLoop();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo116462a();
    }

    /* renamed from: b */
    public void mo116466b() {
        this.f81436c.mo115161a(getCurrentItem());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo116468c() {
        if (this.f81436c != null) {
            postDelayed(new RunnableC31918i(this), 0);
        }
    }

    public int getItemsCount() {
        AbstractC31902b bVar = this.f81441h;
        if (bVar != null) {
            return bVar.mo116503a();
        }
        return 0;
    }

    /* renamed from: d */
    private void m121351d() {
        float f = this.f81450q;
        if (f < 1.0f) {
            this.f81450q = 1.0f;
        } else if (f > 4.0f) {
            this.f81450q = 4.0f;
        }
    }

    /* renamed from: a */
    public synchronized void mo116462a() {
        ScheduledFuture<?> scheduledFuture = this.f81423M;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f81423M.cancel(true);
            this.f81423M = null;
        }
    }

    /* renamed from: e */
    private void m121352e() {
        Paint paint = new Paint();
        this.f81438e = paint;
        paint.setColor(this.f81447n);
        this.f81438e.setAntiAlias(true);
        this.f81438e.setTypeface(this.f81446m);
        this.f81438e.setTextSize((float) this.f81442i);
        Paint paint2 = new Paint();
        this.f81439f = paint2;
        paint2.setColor(this.f81449p);
        this.f81439f.setAntiAlias(true);
        this.f81439f.setTextScaleX(1.176f);
        this.f81439f.setTypeface(this.f81446m);
        this.f81439f.setTextSize(((float) this.f81442i) * 1.176f);
        Paint paint3 = new Paint();
        this.f81440g = paint3;
        paint3.setColor(this.f81448o);
        this.f81440g.setAntiAlias(true);
        if (Build.VERSION.SDK_INT >= 11) {
            setLayerType(1, null);
        }
    }

    /* renamed from: f */
    private void m121353f() {
        if (this.f81441h != null) {
            m121354g();
            int i = (int) (this.f81445l * ((float) (this.f81459z - 1)));
            this.f81413C = i;
            this.f81411A = (int) (((double) (i * 2)) / 3.141592653589793d);
            this.f81414D = (int) (((double) i) / 3.141592653589793d);
            this.f81412B = View.MeasureSpec.getSize(this.f81416F);
            int i2 = this.f81411A;
            float f = this.f81445l;
            this.f81452s = (((float) i2) - f) / 2.0f;
            float f2 = (((float) i2) + f) / 2.0f;
            this.f81453t = f2;
            this.f81454u = (f2 - ((f - ((float) this.f81444k)) / 2.0f)) - this.f81432V;
            if (this.f81456w == -1) {
                if (this.f81451r) {
                    this.f81456w = (this.f81441h.mo116503a() + 1) / 2;
                } else {
                    this.f81456w = 0;
                }
                this.f81457x = this.f81456w;
            }
        }
    }

    /* renamed from: g */
    private void m121354g() {
        this.f81439f.setTextScaleX(1.176f);
        this.f81439f.setTextSize(((float) this.f81442i) * 1.176f);
        Rect rect = new Rect();
        if (!TextUtils.isEmpty(this.f81441h.mo116508b())) {
            this.f81439f.getTextBounds(this.f81441h.mo116508b(), 0, this.f81441h.mo116508b().length(), rect);
            this.f81443j = rect.width();
        } else {
            for (int i = 0; i < this.f81441h.mo116503a(); i++) {
                String a = m121345a(this.f81441h.mo116507b(i));
                this.f81439f.getTextBounds(a, 0, a.length(), rect);
                int width = rect.width();
                if (width > this.f81443j) {
                    this.f81443j = width;
                }
            }
        }
        this.f81439f.getTextBounds("星期", 0, 2, rect);
        int height = rect.height() + 2;
        this.f81444k = height;
        this.f81445l = this.f81450q * ((float) height);
    }

    public final void setCyclic(boolean z) {
        this.f81451r = z;
    }

    public void setDividerType(DividerType dividerType) {
        this.f81419I = dividerType;
    }

    public void setGravity(int i) {
        this.f81429S = i;
    }

    public void setIsOptions(boolean z) {
        this.f81421K = z;
    }

    public void setLabel(String str) {
        this.f81424N = str;
    }

    public void setLoopChangeListener(ILoopChangeListener dVar) {
        this.ab = dVar;
    }

    public final void setOnItemSelectedListener(AbstractC31917h hVar) {
        this.f81436c = hVar;
    }

    public void setShowTwoFigure(boolean z) {
        this.f81433W = z;
    }

    public WheelView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo116465a(Boolean bool) {
        this.f81422L = bool.booleanValue();
    }

    public final void setAdapter(AbstractC31902b bVar) {
        this.f81441h = bVar;
        invalidate();
    }

    public final void setCurrentItem(int i) {
        this.f81426P = i;
        this.f81456w = i;
        this.f81455v = BitmapDescriptorFactory.HUE_RED;
        invalidate();
    }

    public void setDividerColor(int i) {
        if (i != 0) {
            this.f81448o = i;
            this.f81440g.setColor(i);
        }
    }

    public void setItemVisible(int i) {
        if (i != this.f81459z) {
            this.f81417G = new Object[i];
        }
        this.f81459z = i;
    }

    public void setLineSpacingMultiplier(float f) {
        if (f != BitmapDescriptorFactory.HUE_RED) {
            this.f81450q = f;
            m121351d();
        }
    }

    public void setTextColorCenter(int i) {
        if (i != 0) {
            this.f81449p = i;
            this.f81439f.setColor(i);
        }
    }

    public void setTextColorOut(int i) {
        if (i != 0) {
            this.f81447n = i;
            this.f81438e.setColor(i);
        }
    }

    public void setTextXOffset(int i) {
        this.f81425O = i;
        if (i != 0) {
            this.f81439f.setTextScaleX(1.0f);
        }
    }

    public final void setTypeface(Typeface typeface) {
        this.f81446m = typeface;
        this.f81438e.setTypeface(typeface);
        this.f81439f.setTypeface(this.f81446m);
    }

    /* renamed from: b */
    private int m121348b(int i) {
        if (i < 0) {
            i += this.f81441h.mo116503a();
        }
        if (i > this.f81441h.mo116503a() - 1) {
            return i - this.f81441h.mo116503a();
        }
        return i;
    }

    /* renamed from: a */
    private int m121344a(int i) {
        if (this.f81441h.mo116503a() <= 0) {
            return 0;
        }
        if (i < 0) {
            return m121344a(i + this.f81441h.mo116503a());
        }
        if (i > this.f81441h.mo116503a() - 1) {
            return m121344a(i - this.f81441h.mo116503a());
        }
        return i;
    }

    public final void setTextSize(float f) {
        if (f > BitmapDescriptorFactory.HUE_RED) {
            int i = (int) (this.f81434a.getResources().getDisplayMetrics().density * f);
            this.f81442i = i;
            this.f81438e.setTextSize((float) i);
            this.f81439f.setTextSize((float) this.f81442i);
        }
    }

    /* renamed from: a */
    private String m121345a(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof AbstractC31908f) {
            return ((AbstractC31908f) obj).mo116514a();
        }
        if (!(obj instanceof Integer) || !this.f81433W) {
            return obj.toString();
        }
        return String.format(Locale.getDefault(), "%02d", Integer.valueOf(((Integer) obj).intValue()));
    }

    /* renamed from: b */
    private void m121349b(String str) {
        String str2;
        Rect rect = new Rect();
        this.f81439f.getTextBounds(str, 0, str.length(), rect);
        int i = this.f81429S;
        if (i == 3) {
            this.f81430T = 0;
        } else if (i == 5) {
            this.f81430T = (this.f81412B - rect.width()) - ((int) this.f81432V);
        } else if (i == 17) {
            if (this.f81421K || (str2 = this.f81424N) == null || str2.equals("") || !this.f81422L) {
                this.f81430T = (int) (((double) (this.f81412B - rect.width())) * 0.5d);
            } else {
                this.f81430T = (int) (((double) (this.f81412B - rect.width())) * 0.25d);
            }
        }
    }

    /* renamed from: c */
    private void m121350c(String str) {
        String str2;
        Rect rect = new Rect();
        this.f81438e.getTextBounds(str, 0, str.length(), rect);
        int i = this.f81429S;
        if (i == 3) {
            this.f81431U = 0;
        } else if (i == 5) {
            this.f81431U = (this.f81412B - rect.width()) - ((int) this.f81432V);
        } else if (i == 17) {
            if (this.f81421K || (str2 = this.f81424N) == null || str2.equals("") || !this.f81422L) {
                this.f81431U = (int) (((double) (this.f81412B - rect.width())) * 0.5d);
            } else {
                this.f81431U = (int) (((double) (this.f81412B - rect.width())) * 0.25d);
            }
        }
    }

    /* renamed from: a */
    private void m121346a(Context context) {
        this.f81434a = context;
        this.f81435b = new HandlerC31916g(this);
        GestureDetector gestureDetector = new GestureDetector(context, new C31915f(this));
        this.f81420J = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f81451r = true;
        this.f81455v = BitmapDescriptorFactory.HUE_RED;
        this.f81456w = -1;
        m121352e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo116467b(float f) {
        if (this.f81451r && this.ab != null) {
            int a = this.f81456w + (((int) (this.f81455v / this.f81445l)) % this.f81441h.mo116503a());
            float f2 = this.f81455v % this.f81445l;
            if (Math.abs(f2) > this.f81445l - 10.0f) {
                if (f2 > BitmapDescriptorFactory.HUE_RED) {
                    a++;
                } else {
                    a--;
                }
            }
            int b = m121348b(a);
            boolean z = true;
            if (f <= BitmapDescriptorFactory.HUE_RED ? b <= this.f81457x : b >= this.f81457x) {
                z = false;
            }
            if (z && this.ab != null && this.ac) {
                this.ac = false;
                post(new Runnable() {
                    /* class com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.$$Lambda$WheelView$Zy4IRYF_u4u6wSdElJAIyDsDc */

                    public final void run() {
                        WheelView.this.m121355h();
                    }
                });
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.f81420J.onTouchEvent(motionEvent);
        if (motionEvent.isFromSource(2) && motionEvent.getAction() == 8) {
            float floatValue = (-motionEvent.getAxisValue(9)) * this.aa.floatValue();
            this.f81455v += floatValue;
            if (!this.f81451r) {
                float f = ((float) (-this.f81456w)) * this.f81445l;
                float f2 = this.f81445l;
                float a = ((float) ((this.f81441h.mo116503a() - 1) - this.f81456w)) * f2;
                float f3 = this.f81455v;
                if (((double) f3) - (((double) f2) * 0.25d) < ((double) f)) {
                    f = f3 - floatValue;
                } else if (((double) f3) + (((double) f2) * 0.25d) > ((double) a)) {
                    a = f3 - floatValue;
                }
                if (f3 < f) {
                    this.f81455v = (float) ((int) f);
                } else if (f3 > a) {
                    this.f81455v = (float) ((int) a);
                }
            }
            mo116467b(floatValue);
            if (!onTouchEvent) {
                float y = motionEvent.getY();
                int i = this.f81414D;
                double acos = Math.acos((double) ((((float) i) - y) / ((float) i))) * ((double) this.f81414D);
                float f4 = this.f81445l;
                this.f81427Q = (int) ((((float) (((int) ((acos + ((double) (f4 / 2.0f))) / ((double) f4))) - (this.f81459z / 2))) * f4) - (((this.f81455v % f4) + f4) % f4));
                mo116464a(ACTION.DAGGLE);
                return true;
            }
        }
        invalidate();
        return super.onGenericMotionEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.f81420J.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f81415E = System.currentTimeMillis();
            mo116462a();
            this.f81428R = motionEvent.getRawY();
        } else if (action == 2) {
            float rawY = this.f81428R - motionEvent.getRawY();
            this.f81428R = motionEvent.getRawY();
            this.f81455v += rawY;
            if (!this.f81451r) {
                float f = ((float) (-this.f81456w)) * this.f81445l;
                float f2 = this.f81445l;
                float a = ((float) ((this.f81441h.mo116503a() - 1) - this.f81456w)) * f2;
                float f3 = this.f81455v;
                if (((double) f3) - (((double) f2) * 0.25d) < ((double) f)) {
                    f = f3 - rawY;
                } else if (((double) f3) + (((double) f2) * 0.25d) > ((double) a)) {
                    a = f3 - rawY;
                }
                if (f3 < f) {
                    this.f81455v = (float) ((int) f);
                } else if (f3 > a) {
                    this.f81455v = (float) ((int) a);
                }
            }
            mo116467b(rawY);
        } else if (!onTouchEvent) {
            float y = motionEvent.getY();
            int i = this.f81414D;
            float f4 = this.f81445l;
            this.f81427Q = (int) ((((float) (((int) (((Math.acos((double) ((((float) i) - y) / ((float) i))) * ((double) this.f81414D)) + ((double) (f4 / 2.0f))) / ((double) f4))) - (this.f81459z / 2))) * f4) - (((this.f81455v % f4) + f4) % f4));
            if (System.currentTimeMillis() - this.f81415E > 120) {
                mo116464a(ACTION.DAGGLE);
            } else {
                mo116464a(ACTION.CLICK);
            }
        }
        invalidate();
        return true;
    }

    /* renamed from: a */
    private void m121347a(String str) {
        Rect rect = new Rect();
        this.f81439f.getTextBounds(str, 0, str.length(), rect);
        int i = this.f81442i;
        for (int width = rect.width(); width > this.f81412B; width = rect.width()) {
            i--;
            this.f81439f.setTextSize((float) i);
            this.f81439f.getTextBounds(str, 0, str.length(), rect);
        }
        this.f81438e.setTextSize((float) i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        String str;
        int i;
        int i2;
        float f3;
        AbstractC31902b bVar = this.f81441h;
        if (bVar != null) {
            if (this.f81456w < 0) {
                this.f81456w = 0;
            }
            if (this.f81456w >= bVar.mo116503a()) {
                this.f81456w = this.f81441h.mo116503a() - 1;
            }
            Object[] objArr = this.f81417G;
            int i3 = (int) (this.f81455v / this.f81445l);
            this.f81458y = i3;
            try {
                this.f81457x = this.f81456w + (i3 % this.f81441h.mo116503a());
            } catch (ArithmeticException unused) {
                Log.m165383e("WheelView", "adapter.getItemsCount == 0");
            }
            float f4 = this.f81455v % this.f81445l;
            if (Math.abs(f4) > this.f81445l - 10.0f) {
                if (f4 > BitmapDescriptorFactory.HUE_RED) {
                    this.f81457x++;
                } else {
                    this.f81457x--;
                }
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = f4;
            }
            if (!this.f81451r) {
                if (this.f81457x < 0) {
                    this.f81457x = 0;
                }
                if (this.f81457x > this.f81441h.mo116503a() - 1) {
                    this.f81457x = this.f81441h.mo116503a() - 1;
                }
            } else {
                if (this.f81457x < 0) {
                    this.f81457x = this.f81441h.mo116503a() + this.f81457x;
                }
                if (this.f81457x > this.f81441h.mo116503a() - 1) {
                    this.f81457x -= this.f81441h.mo116503a();
                }
            }
            this.ac = true;
            int i4 = 0;
            while (true) {
                int i5 = this.f81459z;
                if (i4 >= i5) {
                    break;
                }
                int i6 = this.f81457x - ((i5 / 2) - i4);
                if (this.f81451r) {
                    objArr[i4] = this.f81441h.mo116507b(m121344a(i6));
                } else if (i6 < 0) {
                    objArr[i4] = "";
                } else if (i6 > this.f81441h.mo116503a() - 1) {
                    objArr[i4] = "";
                } else {
                    objArr[i4] = this.f81441h.mo116507b(i6);
                }
                i4++;
            }
            if (this.f81419I == DividerType.WRAP) {
                if (TextUtils.isEmpty(this.f81424N)) {
                    i2 = (this.f81412B - this.f81443j) / 2;
                } else {
                    i2 = (this.f81412B - this.f81443j) / 4;
                }
                float f5 = (float) (i2 - 12);
                if (f5 <= BitmapDescriptorFactory.HUE_RED) {
                    f3 = 10.0f;
                } else {
                    f3 = f5;
                }
                float f6 = ((float) this.f81412B) - f3;
                float f7 = this.f81452s;
                canvas.drawLine(f3, f7, f6, f7, this.f81440g);
                float f8 = this.f81453t;
                canvas.drawLine(f3, f8, f6, f8, this.f81440g);
            } else if (this.f81419I == DividerType.FILL) {
                float f9 = this.f81452s;
                canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f9, (float) this.f81412B, f9, this.f81440g);
                float f10 = this.f81453t;
                canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f10, (float) this.f81412B, f10, this.f81440g);
            }
            if (!TextUtils.isEmpty(this.f81424N) && this.f81422L) {
                canvas.drawText(this.f81424N, ((float) (this.f81412B - mo116461a(this.f81439f, this.f81424N))) - this.f81432V, this.f81454u, this.f81439f);
            }
            int i7 = 0;
            while (i7 < this.f81459z) {
                canvas.save();
                double d = (double) (((this.f81445l * ((float) i7)) - f) / ((float) this.f81414D));
                float f11 = (float) (90.0d - ((d / 3.141592653589793d) * 180.0d));
                if (f11 >= 90.0f || f11 <= -90.0f) {
                    f2 = f;
                    canvas.restore();
                } else {
                    float pow = (float) Math.pow((double) (Math.abs(f11) / 90.0f), 2.2d);
                    if (this.f81422L || TextUtils.isEmpty(this.f81424N) || TextUtils.isEmpty(m121345a(objArr[i7]))) {
                        str = m121345a(objArr[i7]);
                    } else {
                        str = m121345a(objArr[i7]) + this.f81424N;
                    }
                    m121347a(str);
                    m121349b(str);
                    m121350c(str);
                    f2 = f;
                    float cos = (float) (((((double) this.f81414D) - (Math.cos(d) * ((double) this.f81414D))) - ((Math.sin(d) * ((double) this.f81444k)) / 2.0d)) + ((Math.sin(d) - 1.0d) * ((double) this.f81444k)));
                    canvas.translate(BitmapDescriptorFactory.HUE_RED, cos);
                    float f12 = this.f81452s;
                    if (cos > f12 || ((float) this.f81444k) + cos < f12) {
                        float f13 = this.f81453t;
                        if (cos <= f13 && ((float) this.f81444k) + cos >= f13) {
                            canvas.save();
                            canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f81412B, this.f81453t - cos);
                            canvas.drawText(str, (float) this.f81430T, ((float) this.f81444k) - this.f81432V, this.f81439f);
                            canvas.restore();
                            canvas.save();
                            canvas.clipRect(BitmapDescriptorFactory.HUE_RED, this.f81453t - cos, (float) this.f81412B, (float) ((int) this.f81445l));
                            canvas.drawText(str, (float) this.f81431U, (float) this.f81444k, this.f81438e);
                            canvas.restore();
                            float f14 = this.f81453t;
                            if (f14 - cos > (cos + ((float) this.f81444k)) - f14) {
                                this.f81426P = this.f81441h.mo116504a(objArr[i7]);
                            }
                        } else if (cos < f12 || ((float) this.f81444k) + cos > f13) {
                            canvas.save();
                            canvas.clipRect(0, 0, this.f81412B, (int) this.f81445l);
                            Paint paint = this.f81438e;
                            int i8 = this.f81425O;
                            int i9 = -1;
                            if (i8 == 0) {
                                i = 0;
                            } else if (i8 > 0) {
                                i = 1;
                            } else {
                                i = -1;
                            }
                            if (f11 <= BitmapDescriptorFactory.HUE_RED) {
                                i9 = 1;
                            }
                            paint.setTextSkewX(((float) (i * i9)) * 0.5f * pow);
                            this.f81438e.setAlpha((int) ((1.0f - pow) * 255.0f));
                            canvas.drawText(str, ((float) this.f81431U) + (((float) this.f81425O) * pow), (float) this.f81444k, this.f81438e);
                            canvas.restore();
                            canvas.restore();
                            this.f81439f.setTextSize((float) this.f81442i);
                        } else {
                            canvas.scale(1.0f, 1.176f);
                            canvas.drawText(str, (float) this.f81430T, (((float) this.f81444k) * 0.916f) - this.f81432V, this.f81439f);
                            this.f81426P = this.f81441h.mo116504a(objArr[i7]);
                        }
                    } else {
                        canvas.save();
                        canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f81412B, this.f81452s - cos);
                        canvas.drawText(str, (float) this.f81431U, (float) this.f81444k, this.f81438e);
                        canvas.restore();
                        canvas.save();
                        canvas.clipRect(BitmapDescriptorFactory.HUE_RED, this.f81452s - cos, (float) this.f81412B, (float) ((int) this.f81445l));
                        canvas.drawText(str, (float) this.f81430T, ((float) this.f81444k) - this.f81432V, this.f81439f);
                        canvas.restore();
                        float f15 = this.f81452s;
                        if (f15 - cos < (cos + ((float) this.f81444k)) - f15) {
                            this.f81426P = this.f81441h.mo116504a(objArr[i7]);
                        }
                    }
                    canvas.restore();
                    this.f81439f.setTextSize((float) this.f81442i);
                }
                i7++;
                f = f2;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo116463a(float f) {
        mo116462a();
        this.f81423M = this.f81437d.scheduleWithFixedDelay(new C31914e(this, f), 0, 5, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo116464a(ACTION action) {
        mo116462a();
        if (action == ACTION.FLING || action == ACTION.DAGGLE) {
            float f = this.f81455v;
            float f2 = this.f81445l;
            int i = (int) (((f % f2) + f2) % f2);
            this.f81427Q = i;
            if (((float) i) > f2 / 2.0f) {
                this.f81427Q = (int) (f2 - ((float) i));
            } else {
                this.f81427Q = -i;
            }
        }
        this.f81423M = this.f81437d.scheduleWithFixedDelay(new C31919j(this, this.f81427Q), 0, 10, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f81416F = i;
        m121353f();
        setMeasuredDimension(this.f81412B, this.f81411A);
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f81418H = 0.5f;
        this.f81437d = Executors.newSingleThreadScheduledExecutor();
        this.f81446m = Typeface.MONOSPACE;
        this.f81447n = -5723992;
        this.f81448o = -2763307;
        this.f81449p = C32634ae.m125178a(R.color.text_title);
        this.f81450q = 2.5f;
        this.f81459z = 5;
        this.f81415E = 0;
        this.f81421K = false;
        this.f81422L = true;
        this.f81427Q = 0;
        this.f81428R = BitmapDescriptorFactory.HUE_RED;
        this.f81429S = 17;
        this.f81430T = 0;
        this.f81431U = 0;
        this.f81417G = new Object[5];
        this.ac = true;
        this.aa = Float.valueOf(C0917s.m4407b(ViewConfiguration.get(context), context));
        this.f81442i = (int) getResources().getDimension(R.dimen.dp_17);
        float f = getResources().getDisplayMetrics().density;
        if (f < 1.0f) {
            this.f81432V = 2.4f;
        } else {
            int i = (1.0f > f ? 1 : (1.0f == f ? 0 : -1));
            if (i <= 0 && f < 2.0f) {
                this.f81432V = 3.6f;
            } else if (i <= 0 && f < 2.0f) {
                this.f81432V = 4.5f;
            } else if (2.0f <= f && f < 3.0f) {
                this.f81432V = 6.0f;
            } else if (f >= 3.0f) {
                this.f81432V = f * 2.5f;
            }
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.pickerview_dividerColor, R.attr.pickerview_gravity, R.attr.pickerview_lineSpacingMultiplier, R.attr.pickerview_textColorCenter, R.attr.pickerview_textColorOut, R.attr.pickerview_textSize}, 0, 0);
            this.f81429S = obtainStyledAttributes.getInt(1, 17);
            this.f81447n = obtainStyledAttributes.getColor(4, this.f81447n);
            this.f81449p = obtainStyledAttributes.getColor(3, this.f81449p);
            this.f81448o = obtainStyledAttributes.getColor(0, this.f81448o);
            this.f81442i = obtainStyledAttributes.getDimensionPixelOffset(5, this.f81442i);
            this.f81450q = obtainStyledAttributes.getFloat(2, this.f81450q);
            obtainStyledAttributes.recycle();
        }
        m121351d();
        m121346a(context);
    }

    /* renamed from: a */
    public int mo116461a(Paint paint, String str) {
        if (str == null || str.length() <= 0) {
            return 0;
        }
        int length = str.length();
        float[] fArr = new float[length];
        paint.getTextWidths(str, fArr);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i += (int) Math.ceil((double) fArr[i2]);
        }
        return i;
    }
}
