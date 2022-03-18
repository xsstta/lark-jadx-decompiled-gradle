package com.bytedance.ies.xelement.picker.view;

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
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.ies.xelement.localize.LocalizeAdapter;
import com.bytedance.ies.xelement.picker.p818a.AbstractC14498d;
import com.bytedance.ies.xelement.picker.p821d.AbstractC14506a;
import com.bytedance.ies.xelement.picker.p822e.AbstractC14512f;
import com.bytedance.ies.xelement.picker.p822e.C14510d;
import com.bytedance.ies.xelement.picker.p823f.C14517a;
import com.bytedance.ies.xelement.picker.p823f.C14519c;
import com.bytedance.ies.xelement.picker.p823f.HandlerC14518b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.suite.R;
import com.lynx.tasm.base.LLog;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class WheelView extends View {

    /* renamed from: b */
    private static final String[] f38336b = {"00", HiAnalyticsConstant.KeyAndValue.NUMBER_01, "02", "03", "04", "05", "06", "07", "08", "09"};

    /* renamed from: A */
    private boolean f38337A;

    /* renamed from: B */
    private float f38338B;

    /* renamed from: C */
    private float f38339C;

    /* renamed from: D */
    private float f38340D;

    /* renamed from: E */
    private float f38341E;

    /* renamed from: F */
    private int f38342F;

    /* renamed from: G */
    private int f38343G;

    /* renamed from: H */
    private int f38344H;

    /* renamed from: I */
    private int f38345I;

    /* renamed from: J */
    private int f38346J;

    /* renamed from: K */
    private int f38347K;

    /* renamed from: L */
    private int f38348L;

    /* renamed from: M */
    private int f38349M;

    /* renamed from: N */
    private float f38350N;

    /* renamed from: O */
    private long f38351O;

    /* renamed from: P */
    private int f38352P;

    /* renamed from: Q */
    private int f38353Q;

    /* renamed from: R */
    private int f38354R;

    /* renamed from: S */
    private int f38355S;

    /* renamed from: T */
    private float f38356T;

    /* renamed from: U */
    private boolean f38357U;

    /* renamed from: V */
    private LocalizeAdapter f38358V;

    /* renamed from: a */
    public AbstractC14512f f38359a;

    /* renamed from: c */
    private DividerType f38360c;

    /* renamed from: d */
    private Context f38361d;

    /* renamed from: e */
    private Handler f38362e;

    /* renamed from: f */
    private GestureDetector f38363f;

    /* renamed from: g */
    private boolean f38364g;

    /* renamed from: h */
    private boolean f38365h;

    /* renamed from: i */
    private ScheduledExecutorService f38366i;

    /* renamed from: j */
    private ScheduledFuture<?> f38367j;

    /* renamed from: k */
    private Paint f38368k;

    /* renamed from: l */
    private Paint f38369l;

    /* renamed from: m */
    private Paint f38370m;

    /* renamed from: n */
    private AbstractC14498d f38371n;

    /* renamed from: o */
    private String f38372o;

    /* renamed from: p */
    private int f38373p;

    /* renamed from: q */
    private int f38374q;

    /* renamed from: r */
    private int f38375r;

    /* renamed from: s */
    private int f38376s;

    /* renamed from: t */
    private float f38377t;

    /* renamed from: u */
    private Typeface f38378u;

    /* renamed from: v */
    private int f38379v;

    /* renamed from: w */
    private int f38380w;

    /* renamed from: x */
    private int f38381x;

    /* renamed from: y */
    private int f38382y;

    /* renamed from: z */
    private float f38383z;

    public enum ACTION {
        CLICK,
        FLING,
        DAGGLE
    }

    public enum DividerType {
        FILL,
        WRAP,
        CIRCLE
    }

    /* renamed from: c */
    public boolean mo53427c() {
        return this.f38337A;
    }

    public final AbstractC14498d getAdapter() {
        return this.f38371n;
    }

    public Handler getHandler() {
        return this.f38362e;
    }

    public int getInitPosition() {
        return this.f38342F;
    }

    public float getItemHeight() {
        return this.f38377t;
    }

    public float getTotalScrollY() {
        return this.f38341E;
    }

    /* renamed from: a */
    public void mo53424a(ACTION action) {
        mo53422a();
        if (action == ACTION.FLING || action == ACTION.DAGGLE) {
            float f = this.f38341E;
            float f2 = this.f38377t;
            int i = (int) (((f % f2) + f2) % f2);
            this.f38349M = i;
            if (((float) i) > f2 / 2.0f) {
                this.f38349M = (int) (f2 - ((float) i));
            } else {
                this.f38349M = -i;
            }
        }
        this.f38367j = this.f38366i.scheduleWithFixedDelay(new C14519c(this, this.f38349M), 0, 10, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final void mo53423a(float f) {
        mo53422a();
        this.f38367j = this.f38366i.scheduleWithFixedDelay(new C14517a(this, f), 0, 5, TimeUnit.MILLISECONDS);
    }

    public int getItemsCount() {
        AbstractC14498d dVar = this.f38371n;
        if (dVar != null) {
            return dVar.mo53384a();
        }
        return 0;
    }

    /* renamed from: d */
    private void m58694d() {
        float f = this.f38383z;
        if (f < 1.0f) {
            this.f38383z = 1.0f;
        } else if (f > 4.0f) {
            this.f38383z = 4.0f;
        }
    }

    /* renamed from: a */
    public void mo53422a() {
        ScheduledFuture<?> scheduledFuture = this.f38367j;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f38367j.cancel(true);
            this.f38367j = null;
        }
    }

    /* renamed from: b */
    public final void mo53426b() {
        if (this.f38359a != null) {
            postDelayed(new Runnable() {
                /* class com.bytedance.ies.xelement.picker.view.WheelView.RunnableC145211 */

                public void run() {
                    WheelView.this.f38359a.mo53416a(WheelView.this.getCurrentItem());
                }
            }, 200);
        }
    }

    /* renamed from: e */
    private void m58695e() {
        Paint paint = new Paint();
        this.f38368k = paint;
        paint.setColor(this.f38379v);
        this.f38368k.setAntiAlias(true);
        this.f38368k.setTypeface(this.f38378u);
        this.f38368k.setTextSize((float) this.f38373p);
        Paint paint2 = new Paint();
        this.f38369l = paint2;
        paint2.setColor(this.f38380w);
        this.f38369l.setAntiAlias(true);
        this.f38369l.setTextScaleX(1.1f);
        this.f38369l.setTypeface(this.f38378u);
        this.f38369l.setTextSize((float) this.f38373p);
        Paint paint3 = new Paint();
        this.f38370m = paint3;
        paint3.setColor(this.f38381x);
        this.f38370m.setAntiAlias(true);
        setLayerType(1, null);
    }

    /* renamed from: f */
    private void m58696f() {
        if (this.f38371n != null) {
            m58697g();
            int i = (int) (this.f38377t * ((float) (this.f38345I - 1)));
            this.f38346J = (int) (((double) (i * 2)) / 3.141592653589793d);
            this.f38348L = (int) (((double) i) / 3.141592653589793d);
            this.f38347K = View.MeasureSpec.getSize(this.f38352P);
            int i2 = this.f38346J;
            float f = this.f38377t;
            this.f38338B = (((float) i2) - f) / 2.0f;
            float f2 = (((float) i2) + f) / 2.0f;
            this.f38339C = f2;
            this.f38340D = (f2 - ((f - ((float) this.f38375r)) / 2.0f)) - this.f38356T;
            if (this.f38342F == -1) {
                if (this.f38337A) {
                    this.f38342F = (this.f38371n.mo53384a() + 1) / 2;
                } else {
                    this.f38342F = 0;
                }
            }
            this.f38344H = this.f38342F;
        }
    }

    /* renamed from: g */
    private void m58697g() {
        String str;
        Rect rect = new Rect();
        for (int i = 0; i < this.f38371n.mo53384a(); i++) {
            String a = m58687a(this.f38371n.mo53386b(i));
            this.f38369l.getTextBounds(a, 0, a.length(), rect);
            int width = rect.width();
            if (width > this.f38374q) {
                this.f38374q = width;
            }
        }
        LocalizeAdapter aVar = this.f38358V;
        String str2 = "Week";
        if (!(aVar == null || (str = aVar.mo53213a().get("wheel_text_bound_text")) == null || str.isEmpty())) {
            str2 = str;
        }
        this.f38369l.getTextBounds(str2, 0, 2, rect);
        int height = rect.height() + 2;
        this.f38375r = height;
        this.f38377t = this.f38383z * ((float) height);
    }

    public final int getCurrentItem() {
        int i;
        AbstractC14498d dVar = this.f38371n;
        if (dVar == null) {
            return 0;
        }
        if (!this.f38337A || ((i = this.f38343G) >= 0 && i < dVar.mo53384a())) {
            return Math.max(0, Math.min(this.f38343G, this.f38371n.mo53384a() - 1));
        }
        return Math.max(0, Math.min(Math.abs(Math.abs(this.f38343G) - this.f38371n.mo53384a()), this.f38371n.mo53384a() - 1));
    }

    /* renamed from: a */
    public void mo53425a(boolean z) {
        this.f38365h = z;
    }

    public void setAlphaGradient(boolean z) {
        this.f38357U = z;
    }

    public final void setCyclic(boolean z) {
        this.f38337A = z;
    }

    public void setDividerType(DividerType dividerType) {
        this.f38360c = dividerType;
    }

    public void setGravity(int i) {
        this.f38353Q = i;
    }

    public void setIsOptions(boolean z) {
        this.f38364g = z;
    }

    public void setLabel(String str) {
        this.f38372o = str;
    }

    public void setLocalizeAdapter(LocalizeAdapter aVar) {
        this.f38358V = aVar;
    }

    public final void setOnItemSelectedListener(AbstractC14512f fVar) {
        this.f38359a = fVar;
    }

    public void setTotalScrollY(float f) {
        this.f38341E = f;
    }

    public WheelView(Context context) {
        this(context, null);
    }

    public void setDividerColor(int i) {
        this.f38381x = i;
        this.f38370m.setColor(i);
    }

    public void setTextColorCenter(int i) {
        this.f38380w = i;
        this.f38369l.setColor(i);
    }

    public void setTextColorOut(int i) {
        this.f38379v = i;
        this.f38368k.setColor(i);
    }

    /* renamed from: b */
    private String m58691b(int i) {
        if (i < 0 || i >= 10) {
            return String.valueOf(i);
        }
        return f38336b[i];
    }

    public final void setAdapter(AbstractC14498d dVar) {
        this.f38371n = dVar;
        m58696f();
        invalidate();
    }

    public final void setCurrentIndex(int i) {
        this.f38343G = i;
        this.f38342F = i;
        this.f38341E = BitmapDescriptorFactory.HUE_RED;
        invalidate();
    }

    public void setDividerWidth(int i) {
        this.f38382y = i;
        this.f38370m.setStrokeWidth((float) i);
    }

    public void setItemsVisibleCount(int i) {
        if (i % 2 == 0) {
            i++;
        }
        this.f38345I = i + 2;
    }

    public void setLineSpacingMultiplier(float f) {
        if (f != BitmapDescriptorFactory.HUE_RED) {
            this.f38383z = f;
            m58694d();
        }
    }

    public void setTextXOffset(int i) {
        this.f38376s = i;
        if (i != 0) {
            this.f38369l.setTextScaleX(1.0f);
        }
    }

    public final void setTypeface(Typeface typeface) {
        this.f38378u = typeface;
        this.f38368k.setTypeface(typeface);
        this.f38369l.setTypeface(this.f38378u);
    }

    /* renamed from: a */
    private int m58686a(int i) {
        if (i < 0) {
            return m58686a(i + this.f38371n.mo53384a());
        }
        if (i > this.f38371n.mo53384a() - 1) {
            return m58686a(i - this.f38371n.mo53384a());
        }
        return i;
    }

    public final void setTextSize(float f) {
        if (f > BitmapDescriptorFactory.HUE_RED) {
            int i = (int) (this.f38361d.getResources().getDisplayMetrics().density * f);
            this.f38373p = i;
            this.f38368k.setTextSize((float) i);
            this.f38369l.setTextSize((float) this.f38373p);
        }
    }

    /* renamed from: a */
    private String m58687a(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof AbstractC14506a) {
            return ((AbstractC14506a) obj).mo53411a();
        }
        if (obj instanceof Integer) {
            return m58691b(((Integer) obj).intValue());
        }
        return obj.toString();
    }

    /* renamed from: b */
    private void m58692b(String str) {
        String str2;
        Rect rect = new Rect();
        this.f38369l.getTextBounds(str, 0, str.length(), rect);
        int i = this.f38353Q;
        if (i == 3) {
            this.f38354R = 0;
        } else if (i == 5) {
            this.f38354R = (this.f38347K - rect.width()) - ((int) this.f38356T);
        } else if (i == 17) {
            if (this.f38364g || (str2 = this.f38372o) == null || str2.equals("") || !this.f38365h) {
                this.f38354R = (int) (((double) (this.f38347K - rect.width())) * 0.5d);
            } else {
                this.f38354R = (int) (((double) (this.f38347K - rect.width())) * 0.25d);
            }
        }
    }

    /* renamed from: c */
    private void m58693c(String str) {
        String str2;
        Rect rect = new Rect();
        this.f38368k.getTextBounds(str, 0, str.length(), rect);
        int i = this.f38353Q;
        if (i == 3) {
            this.f38355S = 0;
        } else if (i == 5) {
            this.f38355S = (this.f38347K - rect.width()) - ((int) this.f38356T);
        } else if (i == 17) {
            if (this.f38364g || (str2 = this.f38372o) == null || str2.equals("") || !this.f38365h) {
                this.f38355S = (int) (((double) (this.f38347K - rect.width())) * 0.5d);
            } else {
                this.f38355S = (int) (((double) (this.f38347K - rect.width())) * 0.25d);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.f38363f.onTouchEvent(motionEvent);
        float f = ((float) (-this.f38342F)) * this.f38377t;
        float a = ((float) ((this.f38371n.mo53384a() - 1) - this.f38342F)) * this.f38377t;
        int action = motionEvent.getAction();
        boolean z = false;
        if (action == 0) {
            this.f38351O = System.currentTimeMillis();
            mo53422a();
            this.f38350N = motionEvent.getRawY();
        } else if (action == 2) {
            float rawY = this.f38350N - motionEvent.getRawY();
            this.f38350N = motionEvent.getRawY();
            float f2 = this.f38341E + rawY;
            this.f38341E = f2;
            if (!this.f38337A) {
                float f3 = this.f38377t;
                if ((f2 - (f3 * 0.25f) < f && rawY < BitmapDescriptorFactory.HUE_RED) || ((f3 * 0.25f) + f2 > a && rawY > BitmapDescriptorFactory.HUE_RED)) {
                    this.f38341E = f2 - rawY;
                    z = true;
                }
            }
        } else if (!onTouchEvent) {
            float y = motionEvent.getY();
            int i = this.f38348L;
            float f4 = this.f38377t;
            this.f38349M = (int) ((((float) (((int) (((Math.acos((double) ((((float) i) - y) / ((float) i))) * ((double) this.f38348L)) + ((double) (f4 / 2.0f))) / ((double) f4))) - (this.f38345I / 2))) * f4) - (((this.f38341E % f4) + f4) % f4));
            if (System.currentTimeMillis() - this.f38351O > 120) {
                mo53424a(ACTION.DAGGLE);
            } else {
                mo53424a(ACTION.CLICK);
            }
        }
        if (!z && motionEvent.getAction() != 0) {
            invalidate();
        }
        return true;
    }

    /* renamed from: a */
    private void m58689a(Context context) {
        this.f38361d = context;
        this.f38362e = new HandlerC14518b(this);
        GestureDetector gestureDetector = new GestureDetector(context, new C14510d(this));
        this.f38363f = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f38337A = true;
        this.f38341E = BitmapDescriptorFactory.HUE_RED;
        this.f38342F = -1;
        m58695e();
    }

    /* renamed from: a */
    private void m58690a(String str) {
        Rect rect = new Rect();
        this.f38369l.getTextBounds(str, 0, str.length(), rect);
        int i = this.f38373p;
        for (int width = rect.width(); width > this.f38347K; width = rect.width()) {
            i--;
            this.f38369l.setTextSize((float) i);
            this.f38369l.getTextBounds(str, 0, str.length(), rect);
        }
        this.f38368k.setTextSize((float) i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        String str;
        float f2;
        int i;
        float f3;
        if (this.f38371n != null) {
            int min = Math.min(Math.max(0, this.f38342F), this.f38371n.mo53384a() - 1);
            this.f38342F = min;
            try {
                this.f38344H = min + (((int) (this.f38341E / this.f38377t)) % this.f38371n.mo53384a());
            } catch (ArithmeticException unused) {
                LLog.m96429e("WheelView", "Error！adapter.getItemsCount() == 0，adapter data doesn't match");
            }
            if (!this.f38337A) {
                if (this.f38344H < 0) {
                    this.f38344H = 0;
                }
                if (this.f38344H > this.f38371n.mo53384a() - 1) {
                    this.f38344H = this.f38371n.mo53384a() - 1;
                }
            } else {
                if (this.f38344H < 0) {
                    this.f38344H = this.f38371n.mo53384a() + this.f38344H;
                }
                if (this.f38344H > this.f38371n.mo53384a() - 1) {
                    this.f38344H -= this.f38371n.mo53384a();
                }
            }
            float f4 = this.f38341E % this.f38377t;
            float f5 = 10.0f;
            if (this.f38360c == DividerType.WRAP) {
                if (TextUtils.isEmpty(this.f38372o)) {
                    i = (this.f38347K - this.f38374q) / 2;
                } else {
                    i = (this.f38347K - this.f38374q) / 4;
                }
                float f6 = (float) (i - 12);
                if (f6 <= BitmapDescriptorFactory.HUE_RED) {
                    f3 = 10.0f;
                } else {
                    f3 = f6;
                }
                float f7 = ((float) this.f38347K) - f3;
                float f8 = this.f38338B;
                canvas.drawLine(f3, f8, f7, f8, this.f38370m);
                float f9 = this.f38339C;
                canvas.drawLine(f3, f9, f7, f9, this.f38370m);
            } else if (this.f38360c == DividerType.CIRCLE) {
                this.f38370m.setStyle(Paint.Style.STROKE);
                this.f38370m.setStrokeWidth((float) this.f38382y);
                if (TextUtils.isEmpty(this.f38372o)) {
                    f2 = ((float) (this.f38347K - this.f38374q)) / 2.0f;
                } else {
                    f2 = ((float) (this.f38347K - this.f38374q)) / 4.0f;
                }
                float f10 = f2 - 12.0f;
                if (f10 > BitmapDescriptorFactory.HUE_RED) {
                    f5 = f10;
                }
                canvas.drawCircle(((float) this.f38347K) / 2.0f, ((float) this.f38346J) / 2.0f, Math.max((((float) this.f38347K) - f5) - f5, this.f38377t) / 1.8f, this.f38370m);
            } else {
                float f11 = this.f38338B;
                canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f11, (float) this.f38347K, f11, this.f38370m);
                float f12 = this.f38339C;
                canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f12, (float) this.f38347K, f12, this.f38370m);
            }
            if (!TextUtils.isEmpty(this.f38372o) && this.f38365h) {
                canvas.drawText(this.f38372o, ((float) (this.f38347K - mo53421a(this.f38369l, this.f38372o))) - this.f38356T, this.f38340D, this.f38369l);
            }
            int i2 = 0;
            while (true) {
                int i3 = this.f38345I;
                if (i2 < i3) {
                    int i4 = this.f38344H - ((i3 / 2) - i2);
                    Object obj = "";
                    if (this.f38337A) {
                        obj = this.f38371n.mo53386b(m58686a(i4));
                    } else if (i4 >= 0 && i4 <= this.f38371n.mo53384a() - 1) {
                        obj = this.f38371n.mo53386b(i4);
                    }
                    canvas.save();
                    double d = (double) (((this.f38377t * ((float) i2)) - f4) / ((float) this.f38348L));
                    float f13 = (float) (90.0d - ((d / 3.141592653589793d) * 180.0d));
                    if (f13 > 90.0f || f13 < -90.0f) {
                        f = f4;
                        canvas.restore();
                    } else {
                        if (this.f38365h || TextUtils.isEmpty(this.f38372o) || TextUtils.isEmpty(m58687a(obj))) {
                            str = m58687a(obj);
                        } else {
                            str = m58687a(obj) + this.f38372o;
                        }
                        float pow = (float) Math.pow((double) (Math.abs(f13) / 90.0f), 2.2d);
                        m58690a(str);
                        m58692b(str);
                        m58693c(str);
                        f = f4;
                        float cos = (float) ((((double) this.f38348L) - (Math.cos(d) * ((double) this.f38348L))) - ((Math.sin(d) * ((double) this.f38375r)) / 2.0d));
                        canvas.translate(BitmapDescriptorFactory.HUE_RED, cos);
                        float f14 = this.f38338B;
                        if (cos > f14 || ((float) this.f38375r) + cos < f14) {
                            float f15 = this.f38339C;
                            if (cos > f15 || ((float) this.f38375r) + cos < f15) {
                                if (cos >= f14) {
                                    int i5 = this.f38375r;
                                    if (((float) i5) + cos <= f15) {
                                        canvas.drawText(str, (float) this.f38354R, ((float) i5) - this.f38356T, this.f38369l);
                                        this.f38343G = this.f38344H - ((this.f38345I / 2) - i2);
                                    }
                                }
                                canvas.save();
                                canvas.clipRect(0, 0, this.f38347K, (int) this.f38377t);
                                canvas.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                                m58688a(pow, f13);
                                canvas.drawText(str, ((float) this.f38355S) + (((float) this.f38376s) * pow), (float) this.f38375r, this.f38368k);
                                canvas.restore();
                                canvas.restore();
                                this.f38369l.setTextSize((float) this.f38373p);
                            } else {
                                canvas.save();
                                canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f38347K, this.f38339C - cos);
                                canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                                canvas.drawText(str, (float) this.f38354R, ((float) this.f38375r) - this.f38356T, this.f38369l);
                                canvas.restore();
                                canvas.save();
                                canvas.clipRect(BitmapDescriptorFactory.HUE_RED, this.f38339C - cos, (float) this.f38347K, (float) ((int) this.f38377t));
                                canvas.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                                m58688a(pow, f13);
                                canvas.drawText(str, (float) this.f38355S, (float) this.f38375r, this.f38368k);
                                canvas.restore();
                            }
                        } else {
                            canvas.save();
                            canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f38347K, this.f38338B - cos);
                            canvas.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                            m58688a(pow, f13);
                            canvas.drawText(str, (float) this.f38355S, (float) this.f38375r, this.f38368k);
                            canvas.restore();
                            canvas.save();
                            canvas.clipRect(BitmapDescriptorFactory.HUE_RED, this.f38338B - cos, (float) this.f38347K, (float) ((int) this.f38377t));
                            canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                            canvas.drawText(str, (float) this.f38354R, ((float) this.f38375r) - this.f38356T, this.f38369l);
                            canvas.restore();
                        }
                        canvas.restore();
                        this.f38369l.setTextSize((float) this.f38373p);
                    }
                    i2++;
                    f4 = f;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f38352P = i;
        m58696f();
        setMeasuredDimension(this.f38347K, this.f38346J);
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38365h = true;
        this.f38366i = Executors.newSingleThreadScheduledExecutor();
        this.f38378u = Typeface.MONOSPACE;
        this.f38383z = 1.6f;
        this.f38345I = 11;
        this.f38349M = 0;
        this.f38350N = BitmapDescriptorFactory.HUE_RED;
        this.f38351O = 0;
        this.f38353Q = 17;
        this.f38354R = 0;
        this.f38355S = 0;
        this.f38357U = false;
        this.f38373p = getResources().getDimensionPixelSize(R.dimen.lynx_picker_textsize);
        float f = getResources().getDisplayMetrics().density;
        if (f < 1.0f) {
            this.f38356T = 2.4f;
        } else if (1.0f <= f && f < 2.0f) {
            this.f38356T = 4.0f;
        } else if (2.0f <= f && f < 3.0f) {
            this.f38356T = 6.0f;
        } else if (f >= 3.0f) {
            this.f38356T = f * 2.5f;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.picker_dividerColor, R.attr.picker_dividerWidth, R.attr.picker_gravity, R.attr.picker_lineSpacingMultiplier, R.attr.picker_textColorCenter, R.attr.picker_textColorOut, R.attr.picker_textSize}, 0, 0);
            this.f38353Q = obtainStyledAttributes.getInt(2, 17);
            this.f38379v = obtainStyledAttributes.getColor(5, -5723992);
            this.f38380w = obtainStyledAttributes.getColor(4, -14013910);
            this.f38381x = obtainStyledAttributes.getColor(0, -2763307);
            this.f38382y = obtainStyledAttributes.getDimensionPixelSize(1, 2);
            this.f38373p = obtainStyledAttributes.getDimensionPixelOffset(6, this.f38373p);
            this.f38383z = obtainStyledAttributes.getFloat(3, this.f38383z);
            obtainStyledAttributes.recycle();
        }
        m58694d();
        m58689a(context);
    }

    /* renamed from: a */
    private void m58688a(float f, float f2) {
        int i;
        int i2;
        int i3 = this.f38376s;
        int i4 = -1;
        if (i3 > 0) {
            i = 1;
        } else if (i3 < 0) {
            i = -1;
        } else {
            i = 0;
        }
        Paint paint = this.f38368k;
        if (f2 <= BitmapDescriptorFactory.HUE_RED) {
            i4 = 1;
        }
        paint.setTextSkewX(((float) (i * i4)) * 0.5f * f);
        if (this.f38357U) {
            i2 = (int) (((90.0f - Math.abs(f2)) / 90.0f) * 255.0f);
        } else {
            i2 = 255;
        }
        this.f38368k.setAlpha(i2);
    }

    /* renamed from: a */
    public int mo53421a(Paint paint, String str) {
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
