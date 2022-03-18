package com.ss.android.lark.widget.wheelpicker;

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
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class WheelView extends View {

    /* renamed from: A */
    protected int f147161A;

    /* renamed from: B */
    protected int f147162B;

    /* renamed from: C */
    protected int f147163C;

    /* renamed from: D */
    protected int f147164D;

    /* renamed from: E */
    protected int f147165E;

    /* renamed from: F */
    protected int f147166F;

    /* renamed from: G */
    protected long f147167G;

    /* renamed from: H */
    protected int f147168H;

    /* renamed from: I */
    protected DividerType f147169I;

    /* renamed from: J */
    protected GestureDetector f147170J;

    /* renamed from: K */
    protected boolean f147171K;

    /* renamed from: L */
    protected boolean f147172L;

    /* renamed from: M */
    protected ScheduledFuture<?> f147173M;

    /* renamed from: N */
    protected String f147174N;

    /* renamed from: O */
    protected int f147175O;

    /* renamed from: P */
    protected int f147176P;

    /* renamed from: Q */
    protected float f147177Q;

    /* renamed from: R */
    protected int f147178R;

    /* renamed from: S */
    protected int f147179S;

    /* renamed from: T */
    protected int f147180T;

    /* renamed from: U */
    protected float f147181U;

    /* renamed from: V */
    protected Object[] f147182V;

    /* renamed from: c */
    protected Context f147183c;

    /* renamed from: d */
    protected Handler f147184d;

    /* renamed from: e */
    protected AbstractC59262g f147185e;

    /* renamed from: f */
    protected ScheduledExecutorService f147186f;

    /* renamed from: g */
    protected Paint f147187g;

    /* renamed from: h */
    protected Paint f147188h;

    /* renamed from: i */
    protected Paint f147189i;

    /* renamed from: j */
    protected AbstractC59265j f147190j;

    /* renamed from: k */
    protected int f147191k;

    /* renamed from: l */
    protected int f147192l;

    /* renamed from: m */
    protected int f147193m;

    /* renamed from: n */
    protected float f147194n;

    /* renamed from: o */
    protected Typeface f147195o;

    /* renamed from: p */
    protected int f147196p;

    /* renamed from: q */
    protected int f147197q;

    /* renamed from: r */
    protected int f147198r;

    /* renamed from: s */
    protected float f147199s;

    /* renamed from: t */
    protected boolean f147200t;

    /* renamed from: u */
    protected float f147201u;

    /* renamed from: v */
    protected float f147202v;

    /* renamed from: w */
    protected float f147203w;

    /* renamed from: x */
    protected float f147204x;

    /* renamed from: y */
    protected int f147205y;

    /* renamed from: z */
    protected int f147206z;

    public enum ACTION {
        CLICK,
        FLING,
        DAGGLE
    }

    public enum DividerType {
        FILL,
        WRAP
    }

    public final AbstractC59265j getAdapter() {
        return this.f147190j;
    }

    public final int getCurrentItem() {
        return this.f147175O;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo201488d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo201489e() {
        if (this.f147185e != null) {
            postDelayed(new RunnableC59263h(this), 200);
        }
    }

    public int getItemsCount() {
        AbstractC59265j jVar = this.f147190j;
        if (jVar != null) {
            return jVar.mo156880a();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo156843b() {
        float f = this.f147199s;
        if (f < 1.2f) {
            this.f147199s = 1.2f;
        } else if (f > 2.0f) {
            this.f147199s = 2.0f;
        }
    }

    /* renamed from: d */
    public void mo201488d() {
        ScheduledFuture<?> scheduledFuture = this.f147173M;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f147173M.cancel(true);
            this.f147173M = null;
        }
    }

    /* renamed from: f */
    private void m230160f() {
        if (this.f147190j != null) {
            mo156841a();
            int i = (int) (this.f147194n * ((float) (this.f147162B - 1)));
            this.f147165E = i;
            this.f147163C = (int) (((double) (i * 2)) / 3.141592653589793d);
            this.f147166F = (int) (((double) i) / 3.141592653589793d);
            this.f147164D = View.MeasureSpec.getSize(this.f147168H);
            int i2 = this.f147163C;
            float f = this.f147194n;
            this.f147201u = (((float) i2) - f) / 2.0f;
            float f2 = (((float) i2) + f) / 2.0f;
            this.f147202v = f2;
            this.f147203w = (f2 - ((f - ((float) this.f147193m)) / 2.0f)) - this.f147181U;
            if (this.f147205y == -1) {
                if (this.f147200t) {
                    this.f147205y = (this.f147190j.mo156880a() + 1) / 2;
                } else {
                    this.f147205y = 0;
                }
            }
            this.f147206z = this.f147205y;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo177666c() {
        Paint paint = new Paint();
        this.f147187g = paint;
        paint.setColor(this.f147196p);
        this.f147187g.setAntiAlias(true);
        this.f147187g.setTextSize((float) this.f147191k);
        Paint paint2 = new Paint();
        this.f147188h = paint2;
        paint2.setColor(this.f147197q);
        this.f147188h.setAntiAlias(true);
        this.f147188h.setTextScaleX(1.1f);
        this.f147188h.setTypeface(this.f147195o);
        this.f147188h.setTextSize((float) this.f147191k);
        Paint paint3 = new Paint();
        this.f147189i = paint3;
        paint3.setColor(this.f147198r);
        this.f147189i.setAntiAlias(true);
        if (Build.VERSION.SDK_INT >= 11) {
            setLayerType(1, null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo156841a() {
        Rect rect = new Rect();
        for (int i = 0; i < this.f147190j.mo156880a(); i++) {
            String a = mo201482a(this.f147190j.mo156885b(i));
            this.f147188h.getTextBounds(a, 0, a.length(), rect);
            int width = rect.width();
            if (width > this.f147192l) {
                this.f147192l = width;
            }
            this.f147188h.getTextBounds("星期", 0, 2, rect);
            this.f147193m = rect.height() + 2;
        }
        this.f147194n = this.f147199s * ((float) this.f147193m);
    }

    public final void setCyclic(boolean z) {
        this.f147200t = z;
    }

    public void setDividerType(DividerType dividerType) {
        this.f147169I = dividerType;
    }

    public void setGravity(int i) {
        this.f147178R = i;
    }

    public void setIsOptions(boolean z) {
        this.f147171K = z;
    }

    public void setLabel(String str) {
        this.f147174N = str;
    }

    public final void setOnItemSelectedListener(AbstractC59262g gVar) {
        this.f147185e = gVar;
    }

    public WheelView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo201485a(Boolean bool) {
        this.f147172L = bool.booleanValue();
    }

    public void setDividerColor(int i) {
        this.f147198r = i;
        this.f147189i.setColor(i);
    }

    public final void setAdapter(AbstractC59265j jVar) {
        this.f147190j = jVar;
        m230160f();
        invalidate();
    }

    public void setCurrentItem(int i) {
        this.f147175O = i;
        this.f147205y = i;
        this.f147204x = BitmapDescriptorFactory.HUE_RED;
        invalidate();
    }

    public void setItemVisible(int i) {
        if (i != this.f147162B) {
            this.f147182V = new Object[i];
        }
        this.f147162B = i;
    }

    public void setLineSpacingMultiplier(float f) {
        if (f != BitmapDescriptorFactory.HUE_RED) {
            this.f147199s = f;
            mo156843b();
        }
    }

    public void setTextColorCenter(int i) {
        if (i != 0) {
            this.f147197q = i;
            this.f147188h.setColor(i);
        }
    }

    public void setTextColorOut(int i) {
        if (i != 0) {
            this.f147196p = i;
            this.f147187g.setColor(i);
        }
    }

    public final void setTypeface(Typeface typeface) {
        this.f147195o = typeface;
        this.f147187g.setTypeface(typeface);
        this.f147188h.setTypeface(this.f147195o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo201483a(float f) {
        mo201488d();
        this.f147173M = this.f147186f.scheduleWithFixedDelay(new C59258c(this, f), 0, 5, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    private void m230159a(Context context) {
        this.f147183c = context;
        this.f147184d = new HandlerC59260e(this);
        GestureDetector gestureDetector = new GestureDetector(context, new C59259d(this));
        this.f147170J = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f147200t = true;
        this.f147204x = BitmapDescriptorFactory.HUE_RED;
        this.f147205y = -1;
        mo177666c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo201486c(int i) {
        if (i < 0) {
            return mo201486c(i + this.f147190j.mo156880a());
        }
        if (i > this.f147190j.mo156880a() - 1) {
            return mo201486c(i - this.f147190j.mo156880a());
        }
        return i;
    }

    public final void setTextSize(float f) {
        if (f > BitmapDescriptorFactory.HUE_RED) {
            int i = (int) (this.f147183c.getResources().getDisplayMetrics().density * f);
            this.f147191k = i;
            this.f147187g.setTextSize((float) i);
            this.f147188h.setTextSize((float) this.f147191k);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo177665b(String str) {
        String str2;
        Rect rect = new Rect();
        this.f147187g.getTextBounds(str, 0, str.length(), rect);
        int i = this.f147178R;
        if (i == 3) {
            this.f147180T = 0;
        } else if (i == 5) {
            this.f147180T = (this.f147164D - rect.width()) - ((int) this.f147181U);
        } else if (i == 17) {
            if (this.f147171K || (str2 = this.f147174N) == null || str2.equals("") || !this.f147172L) {
                this.f147180T = (int) (((double) (this.f147164D - rect.width())) * 0.5d);
            } else {
                this.f147180T = (int) (((double) (this.f147164D - rect.width())) * 0.25d);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo201482a(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof AbstractC59257b) {
            return ((AbstractC59257b) obj).mo156890a();
        }
        if (!(obj instanceof Integer)) {
            return obj.toString();
        }
        return String.format(Locale.getDefault(), "%02d", Integer.valueOf(((Integer) obj).intValue()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo201487c(String str) {
        Rect rect = new Rect();
        this.f147188h.getTextBounds(str, 0, str.length(), rect);
        int i = this.f147191k;
        for (int width = rect.width(); width > this.f147164D; width = rect.width()) {
            i--;
            this.f147188h.setTextSize((float) i);
            this.f147188h.getTextBounds(str, 0, str.length(), rect);
        }
        this.f147187g.setTextSize((float) i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.f147170J.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f147167G = System.currentTimeMillis();
            mo201488d();
            this.f147177Q = motionEvent.getRawY();
        } else if (action == 2) {
            float rawY = this.f147177Q - motionEvent.getRawY();
            this.f147177Q = motionEvent.getRawY();
            this.f147204x += rawY;
            if (!this.f147200t) {
                float f = ((float) (-this.f147205y)) * this.f147194n;
                float f2 = this.f147194n;
                float a = ((float) ((this.f147190j.mo156880a() - 1) - this.f147205y)) * f2;
                float f3 = this.f147204x;
                if (((double) f3) - (((double) f2) * 0.25d) < ((double) f)) {
                    f = f3 - rawY;
                } else if (((double) f3) + (((double) f2) * 0.25d) > ((double) a)) {
                    a = f3 - rawY;
                }
                if (f3 < f) {
                    this.f147204x = (float) ((int) f);
                } else if (f3 > a) {
                    this.f147204x = (float) ((int) a);
                }
            }
        } else if (!onTouchEvent) {
            float y = motionEvent.getY();
            int i = this.f147166F;
            float f4 = this.f147194n;
            this.f147176P = (int) ((((float) (((int) (((Math.acos((double) ((((float) i) - y) / ((float) i))) * ((double) this.f147166F)) + ((double) (f4 / 2.0f))) / ((double) f4))) - (this.f147162B / 2))) * f4) - (((this.f147204x % f4) + f4) % f4));
            if (System.currentTimeMillis() - this.f147167G > 120) {
                mo201484a(ACTION.DAGGLE);
            } else {
                mo201484a(ACTION.CLICK);
            }
        }
        invalidate();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo201484a(ACTION action) {
        mo201488d();
        if (action == ACTION.FLING || action == ACTION.DAGGLE) {
            float f = this.f147204x;
            float f2 = this.f147194n;
            int i = (int) (((f % f2) + f2) % f2);
            this.f147176P = i;
            if (((float) i) > f2 / 2.0f) {
                this.f147176P = (int) (f2 - ((float) i));
            } else {
                this.f147176P = -i;
            }
        }
        this.f147173M = this.f147186f.scheduleWithFixedDelay(new C59264i(this, this.f147176P), 0, 10, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        AbstractC59265j jVar = this.f147190j;
        if (jVar != null) {
            if (this.f147205y < 0) {
                this.f147205y = 0;
            }
            if (this.f147205y >= jVar.mo156880a()) {
                this.f147205y = this.f147190j.mo156880a() - 1;
            }
            Object[] objArr = this.f147182V;
            int i2 = (int) (this.f147204x / this.f147194n);
            this.f147161A = i2;
            try {
                this.f147206z = this.f147205y + (i2 % this.f147190j.mo156880a());
            } catch (ArithmeticException unused) {
                Log.m165383e("WheelView", "something went wrong！adapter.getItemsCount() == 0，items data did not match");
            }
            if (!this.f147200t) {
                if (this.f147206z < 0) {
                    this.f147206z = 0;
                }
                if (this.f147206z > this.f147190j.mo156880a() - 1) {
                    this.f147206z = this.f147190j.mo156880a() - 1;
                }
            } else {
                if (this.f147206z < 0) {
                    this.f147206z = this.f147190j.mo156880a() + this.f147206z;
                }
                if (this.f147206z > this.f147190j.mo156880a() - 1) {
                    this.f147206z -= this.f147190j.mo156880a();
                }
            }
            float f2 = this.f147204x % this.f147194n;
            int i3 = 0;
            while (true) {
                int i4 = this.f147162B;
                if (i3 >= i4) {
                    break;
                }
                int i5 = this.f147206z - ((i4 / 2) - i3);
                if (this.f147200t) {
                    objArr[i3] = this.f147190j.mo156885b(mo201486c(i5));
                } else if (i5 < 0) {
                    objArr[i3] = "";
                } else if (i5 > this.f147190j.mo156880a() - 1) {
                    objArr[i3] = "";
                } else {
                    objArr[i3] = this.f147190j.mo156885b(i5);
                }
                i3++;
            }
            if (this.f147169I == DividerType.WRAP) {
                if (TextUtils.isEmpty(this.f147174N)) {
                    i = (this.f147164D - this.f147192l) / 2;
                } else {
                    i = (this.f147164D - this.f147192l) / 4;
                }
                float f3 = (float) (i - 12);
                if (f3 <= BitmapDescriptorFactory.HUE_RED) {
                    f = 10.0f;
                } else {
                    f = f3;
                }
                float f4 = ((float) this.f147164D) - f;
                float f5 = this.f147201u;
                canvas.drawLine(f, f5, f4, f5, this.f147189i);
                float f6 = this.f147202v;
                canvas.drawLine(f, f6, f4, f6, this.f147189i);
            } else {
                float f7 = this.f147201u;
                canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f7, (float) this.f147164D, f7, this.f147189i);
                float f8 = this.f147202v;
                canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f8, (float) this.f147164D, f8, this.f147189i);
            }
            if (!TextUtils.isEmpty(this.f147174N) && this.f147172L) {
                canvas.drawText(this.f147174N, ((float) (this.f147164D - mo201481a(this.f147188h, this.f147174N))) - this.f147181U, this.f147203w, this.f147188h);
            }
            for (int i6 = 0; i6 < this.f147162B; i6++) {
                canvas.save();
                double d = (double) (((this.f147194n * ((float) i6)) - f2) / ((float) this.f147166F));
                float f9 = (float) (90.0d - ((d / 3.141592653589793d) * 180.0d));
                if (f9 >= 90.0f || f9 <= -90.0f) {
                    canvas.restore();
                } else {
                    String a = (this.f147172L || TextUtils.isEmpty(this.f147174N) || TextUtils.isEmpty(mo201482a(objArr[i6]))) ? mo201482a(objArr[i6]) : mo201482a(objArr[i6]) + this.f147174N;
                    mo201487c(a);
                    mo177664a(a);
                    mo177665b(a);
                    float cos = (float) ((((double) this.f147166F) - (Math.cos(d) * ((double) this.f147166F))) - ((Math.sin(d) * ((double) this.f147193m)) / 2.0d));
                    canvas.translate(BitmapDescriptorFactory.HUE_RED, cos);
                    canvas.scale(1.0f, (float) Math.sin(d));
                    float f10 = this.f147201u;
                    if (cos > f10 || ((float) this.f147193m) + cos < f10) {
                        float f11 = this.f147202v;
                        if (cos > f11 || ((float) this.f147193m) + cos < f11) {
                            if (cos >= f10) {
                                int i7 = this.f147193m;
                                if (((float) i7) + cos <= f11) {
                                    canvas.drawText(a, (float) this.f147179S, ((float) i7) - this.f147181U, this.f147188h);
                                    this.f147175O = this.f147190j.mo156882a(objArr[i6]);
                                }
                            }
                            canvas.save();
                            canvas.clipRect(0, 0, this.f147164D, (int) this.f147194n);
                            canvas.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                            canvas.drawText(a, (float) this.f147180T, (float) this.f147193m, this.f147187g);
                            canvas.restore();
                        } else {
                            canvas.save();
                            canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f147164D, this.f147202v - cos);
                            canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                            canvas.drawText(a, (float) this.f147179S, ((float) this.f147193m) - this.f147181U, this.f147188h);
                            canvas.restore();
                            canvas.save();
                            canvas.clipRect(BitmapDescriptorFactory.HUE_RED, this.f147202v - cos, (float) this.f147164D, (float) ((int) this.f147194n));
                            canvas.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                            canvas.drawText(a, (float) this.f147180T, (float) this.f147193m, this.f147187g);
                            canvas.restore();
                        }
                    } else {
                        canvas.save();
                        canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f147164D, this.f147201u - cos);
                        canvas.scale(1.0f, ((float) Math.sin(d)) * 0.8f);
                        canvas.drawText(a, (float) this.f147180T, (float) this.f147193m, this.f147187g);
                        canvas.restore();
                        canvas.save();
                        canvas.clipRect(BitmapDescriptorFactory.HUE_RED, this.f147201u - cos, (float) this.f147164D, (float) ((int) this.f147194n));
                        canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                        canvas.drawText(a, (float) this.f147179S, ((float) this.f147193m) - this.f147181U, this.f147188h);
                        canvas.restore();
                    }
                    canvas.restore();
                    this.f147188h.setTextSize((float) this.f147191k);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo177664a(String str) {
        String str2;
        Rect rect = new Rect();
        this.f147188h.getTextBounds(str, 0, str.length(), rect);
        int i = this.f147178R;
        if (i == 3) {
            this.f147179S = 0;
        } else if (i == 5) {
            this.f147179S = (this.f147164D - rect.width()) - ((int) this.f147181U);
        } else if (i == 17) {
            if (this.f147171K || (str2 = this.f147174N) == null || str2.equals("") || !this.f147172L) {
                this.f147179S = (int) (((double) (this.f147164D - rect.width())) * 0.5d);
            } else {
                this.f147179S = (int) (((double) (this.f147164D - rect.width())) * 0.25d);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f147168H = i;
        m230160f();
        setMeasuredDimension(this.f147164D, this.f147163C);
    }

    /* renamed from: a */
    public int mo201481a(Paint paint, String str) {
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

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f147186f = CoreThreadPool.getDefault().getScheduleThreadPool();
        this.f147195o = Typeface.MONOSPACE;
        this.f147196p = -5723992;
        this.f147197q = -14013910;
        this.f147198r = -2763307;
        this.f147199s = 1.6f;
        this.f147162B = 11;
        this.f147167G = 0;
        this.f147171K = false;
        this.f147172L = true;
        this.f147176P = 0;
        this.f147177Q = BitmapDescriptorFactory.HUE_RED;
        this.f147178R = 17;
        this.f147179S = 0;
        this.f147180T = 0;
        this.f147182V = new Object[11];
        this.f147191k = getResources().getDimensionPixelSize(R.dimen.pickerview_textsize);
        float f = getResources().getDisplayMetrics().density;
        if (f < 1.0f) {
            this.f147181U = 2.4f;
        } else {
            int i = (1.0f > f ? 1 : (1.0f == f ? 0 : -1));
            if (i <= 0 && f < 2.0f) {
                this.f147181U = 3.6f;
            } else if (i <= 0 && f < 2.0f) {
                this.f147181U = 4.5f;
            } else if (2.0f <= f && f < 3.0f) {
                this.f147181U = 6.0f;
            } else if (f >= 3.0f) {
                this.f147181U = f * 2.5f;
            }
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.pickerview_dividerColor, R.attr.pickerview_gravity, R.attr.pickerview_lineSpacingMultiplier, R.attr.pickerview_textColorCenter, R.attr.pickerview_textColorOut, R.attr.pickerview_textSize}, 0, 0);
            this.f147178R = obtainStyledAttributes.getInt(1, 17);
            this.f147196p = obtainStyledAttributes.getColor(4, this.f147196p);
            this.f147197q = obtainStyledAttributes.getColor(3, this.f147197q);
            this.f147198r = obtainStyledAttributes.getColor(0, this.f147198r);
            this.f147191k = obtainStyledAttributes.getDimensionPixelOffset(5, this.f147191k);
            this.f147199s = obtainStyledAttributes.getFloat(2, this.f147199s);
            obtainStyledAttributes.recycle();
        }
        mo156843b();
        m230159a(context);
    }
}
