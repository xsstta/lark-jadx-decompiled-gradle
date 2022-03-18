package com.bytedance.ee.bear.shadow;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.core.content.ContextCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.ee.bear.shadow.a */
public class C10963a implements IShadowLayout {

    /* renamed from: A */
    private int f29468A;

    /* renamed from: B */
    private int f29469B;

    /* renamed from: C */
    private int f29470C;

    /* renamed from: D */
    private int f29471D;

    /* renamed from: E */
    private int f29472E;

    /* renamed from: F */
    private int f29473F;

    /* renamed from: G */
    private int f29474G;

    /* renamed from: H */
    private int f29475H;

    /* renamed from: I */
    private Paint f29476I;

    /* renamed from: J */
    private Paint f29477J;

    /* renamed from: K */
    private PorterDuffXfermode f29478K;

    /* renamed from: L */
    private int f29479L;

    /* renamed from: M */
    private float[] f29480M;

    /* renamed from: N */
    private RectF f29481N;

    /* renamed from: O */
    private int f29482O;

    /* renamed from: P */
    private int f29483P;

    /* renamed from: Q */
    private int f29484Q;

    /* renamed from: R */
    private WeakReference<View> f29485R;

    /* renamed from: S */
    private Path f29486S;

    /* renamed from: T */
    private boolean f29487T;

    /* renamed from: U */
    private int f29488U;

    /* renamed from: a */
    public int f29489a;

    /* renamed from: b */
    public boolean f29490b;

    /* renamed from: c */
    public boolean f29491c;

    /* renamed from: d */
    public int f29492d;

    /* renamed from: e */
    public float f29493e;

    /* renamed from: f */
    public int f29494f;

    /* renamed from: g */
    public int f29495g;

    /* renamed from: h */
    public int f29496h;

    /* renamed from: i */
    public int f29497i;

    /* renamed from: j */
    private Context f29498j;

    /* renamed from: k */
    private int f29499k;

    /* renamed from: l */
    private int f29500l;

    /* renamed from: m */
    private int f29501m;

    /* renamed from: n */
    private int f29502n;

    /* renamed from: o */
    private int f29503o;

    /* renamed from: p */
    private int f29504p;

    /* renamed from: q */
    private int f29505q;

    /* renamed from: r */
    private int f29506r;

    /* renamed from: s */
    private int f29507s;

    /* renamed from: t */
    private int f29508t;

    /* renamed from: u */
    private int f29509u;

    /* renamed from: v */
    private int f29510v;

    /* renamed from: w */
    private int f29511w;

    /* renamed from: x */
    private int f29512x;

    /* renamed from: y */
    private int f29513y;

    /* renamed from: z */
    private int f29514z;

    /* renamed from: a */
    public int mo41623a() {
        return this.f29492d;
    }

    /* renamed from: b */
    public float mo41633b() {
        return this.f29493e;
    }

    /* renamed from: c */
    public int mo41637c() {
        return this.f29488U;
    }

    /* renamed from: d */
    public int mo41639d() {
        return this.f29489a;
    }

    /* renamed from: e */
    public int mo41641e() {
        return this.f29479L;
    }

    /* renamed from: h */
    public static boolean m45507h() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private void m45509j() {
        View view = this.f29485R.get();
        if (view != null) {
            view.invalidate();
        }
    }

    /* renamed from: f */
    public boolean mo41644f() {
        int i = this.f29479L;
        if ((i == -1 || i == -2 || i > 0) && this.f29489a != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private void m45508i() {
        View view;
        if (m45507h() && (view = this.f29485R.get()) != null) {
            int i = this.f29492d;
            if (i == 0) {
                view.setElevation(BitmapDescriptorFactory.HUE_RED);
            } else {
                view.setElevation((float) i);
            }
            view.invalidateOutline();
        }
    }

    /* renamed from: g */
    public int mo41645g() {
        View view = this.f29485R.get();
        if (view == null) {
            return this.f29479L;
        }
        int i = this.f29479L;
        if (i == -1) {
            return view.getHeight() / 2;
        }
        if (i == -2) {
            return view.getWidth() / 2;
        }
        return i;
    }

    /* renamed from: f */
    public void mo41643f(int i) {
        this.f29512x = i;
    }

    /* renamed from: g */
    public void mo41646g(int i) {
        this.f29470C = i;
    }

    /* renamed from: h */
    public void mo41647h(int i) {
        this.f29475H = i;
    }

    /* renamed from: k */
    public void mo41650k(int i) {
        this.f29482O = i;
    }

    /* renamed from: l */
    public void mo41651l(int i) {
        this.f29483P = i;
    }

    /* renamed from: b */
    public void mo41636b(boolean z) {
        this.f29487T = z;
        m45509j();
    }

    /* renamed from: e */
    public void mo41642e(int i) {
        this.f29507s = i;
    }

    /* renamed from: a */
    public void mo41625a(float f) {
        if (this.f29493e != f) {
            this.f29493e = f;
            m45508i();
        }
    }

    /* renamed from: b */
    public void mo41635b(int i) {
        if (this.f29488U != i) {
            this.f29488U = i;
            m45510n(i);
        }
    }

    /* renamed from: c */
    public void mo41638c(int i) {
        if (this.f29489a != i) {
            mo41628a(this.f29479L, i, this.f29492d, this.f29493e);
        }
    }

    /* renamed from: d */
    public void mo41640d(int i) {
        if (this.f29479L != i) {
            mo41627a(i, this.f29492d, this.f29493e);
        }
    }

    /* renamed from: m */
    public void mo41652m(int i) {
        this.f29484Q = i;
        View view = this.f29485R.get();
        if (view != null) {
            view.invalidate();
        }
    }

    /* renamed from: n */
    private void m45510n(int i) {
        View view;
        if (Build.VERSION.SDK_INT >= 28 && (view = this.f29485R.get()) != null) {
            view.setOutlineAmbientShadowColor(i);
            view.setOutlineSpotShadowColor(i);
        }
    }

    /* renamed from: j */
    public int mo41649j(int i) {
        if (this.f29500l <= 0 || View.MeasureSpec.getSize(i) <= this.f29500l) {
            return i;
        }
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(this.f29499k, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(this.f29499k, 1073741824);
    }

    /* renamed from: a */
    public void mo41626a(int i) {
        if (this.f29492d != i) {
            this.f29492d = i;
            m45508i();
        }
    }

    /* renamed from: i */
    public int mo41648i(int i) {
        if (this.f29499k <= 0 || View.MeasureSpec.getSize(i) <= this.f29499k) {
            return i;
        }
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(this.f29499k, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(this.f29499k, 1073741824);
    }

    /* renamed from: a */
    public void mo41630a(Canvas canvas) {
        boolean z;
        boolean z2;
        View view = this.f29485R.get();
        if (view != null) {
            int g = mo41645g();
            if (g <= 0 || m45507h() || this.f29484Q == 0) {
                z = false;
            } else {
                z = true;
            }
            if (this.f29483P <= 0 || this.f29482O == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z && !z2) {
                return;
            }
            if (!this.f29487T || !m45507h() || this.f29492d == 0) {
                int width = canvas.getWidth();
                int height = canvas.getHeight();
                canvas.save();
                canvas.translate((float) view.getScrollX(), (float) view.getScrollY());
                float f = ((float) this.f29483P) / 2.0f;
                if (this.f29491c) {
                    this.f29481N.set(((float) view.getPaddingLeft()) + f, ((float) view.getPaddingTop()) + f, ((float) (width - view.getPaddingRight())) - f, ((float) (height - view.getPaddingBottom())) - f);
                } else {
                    this.f29481N.set(f, f, ((float) width) - f, ((float) height) - f);
                }
                if (this.f29490b) {
                    if (this.f29480M == null) {
                        this.f29480M = new float[8];
                    }
                    int i = this.f29489a;
                    if (i == 1) {
                        float[] fArr = this.f29480M;
                        float f2 = (float) g;
                        fArr[4] = f2;
                        fArr[5] = f2;
                        fArr[6] = f2;
                        fArr[7] = f2;
                    } else if (i == 2) {
                        float[] fArr2 = this.f29480M;
                        float f3 = (float) g;
                        fArr2[0] = f3;
                        fArr2[1] = f3;
                        fArr2[6] = f3;
                        fArr2[7] = f3;
                    } else if (i == 3) {
                        float[] fArr3 = this.f29480M;
                        float f4 = (float) g;
                        fArr3[0] = f4;
                        fArr3[1] = f4;
                        fArr3[2] = f4;
                        fArr3[3] = f4;
                    } else if (i == 4) {
                        float[] fArr4 = this.f29480M;
                        float f5 = (float) g;
                        fArr4[2] = f5;
                        fArr4[3] = f5;
                        fArr4[4] = f5;
                        fArr4[5] = f5;
                    }
                }
                if (z) {
                    int saveLayer = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) width, (float) height, null, 31);
                    canvas.drawColor(this.f29484Q);
                    this.f29477J.setColor(this.f29484Q);
                    this.f29477J.setStyle(Paint.Style.FILL);
                    this.f29477J.setXfermode(this.f29478K);
                    if (!this.f29490b) {
                        float f6 = (float) g;
                        canvas.drawRoundRect(this.f29481N, f6, f6, this.f29477J);
                    } else {
                        m45506a(canvas, this.f29481N, this.f29480M, this.f29477J);
                    }
                    this.f29477J.setXfermode(null);
                    canvas.restoreToCount(saveLayer);
                }
                if (z2) {
                    this.f29477J.setColor(this.f29482O);
                    this.f29477J.setStrokeWidth((float) this.f29483P);
                    this.f29477J.setStyle(Paint.Style.STROKE);
                    if (this.f29490b) {
                        m45506a(canvas, this.f29481N, this.f29480M, this.f29477J);
                    } else if (g <= 0) {
                        canvas.drawRect(this.f29481N, this.f29477J);
                    } else {
                        float f7 = (float) g;
                        canvas.drawRoundRect(this.f29481N, f7, f7, this.f29477J);
                    }
                }
                canvas.restore();
            }
        }
    }

    /* renamed from: a */
    public void mo41632a(boolean z) {
        View view;
        if (m45507h() && (view = this.f29485R.get()) != null) {
            this.f29491c = z;
            view.invalidateOutline();
        }
    }

    /* renamed from: b */
    public int mo41634b(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i) == 1073741824 || i2 >= (i3 = this.f29502n)) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
    }

    /* renamed from: a */
    public int mo41624a(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i) == 1073741824 || i2 >= (i3 = this.f29501m)) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
    }

    /* renamed from: a */
    public void mo41627a(int i, int i2, float f) {
        mo41628a(i, this.f29489a, i2, f);
    }

    /* renamed from: a */
    public void mo41631a(Canvas canvas, int i, int i2) {
        View view = this.f29485R.get();
        if (view != null) {
            if (this.f29476I == null && (this.f29503o > 0 || this.f29508t > 0 || this.f29513y > 0 || this.f29471D > 0)) {
                this.f29476I = new Paint();
            }
            canvas.save();
            canvas.translate((float) view.getScrollX(), (float) view.getScrollY());
            int i3 = this.f29503o;
            if (i3 > 0) {
                this.f29476I.setStrokeWidth((float) i3);
                this.f29476I.setColor(this.f29506r);
                int i4 = this.f29507s;
                if (i4 < 255) {
                    this.f29476I.setAlpha(i4);
                }
                float f = ((float) this.f29503o) / 2.0f;
                canvas.drawLine((float) this.f29504p, f, (float) (i - this.f29505q), f, this.f29476I);
            }
            int i5 = this.f29508t;
            if (i5 > 0) {
                this.f29476I.setStrokeWidth((float) i5);
                this.f29476I.setColor(this.f29511w);
                int i6 = this.f29512x;
                if (i6 < 255) {
                    this.f29476I.setAlpha(i6);
                }
                float floor = (float) Math.floor((double) (((float) i2) - (((float) this.f29508t) / 2.0f)));
                canvas.drawLine((float) this.f29509u, floor, (float) (i - this.f29510v), floor, this.f29476I);
            }
            int i7 = this.f29513y;
            if (i7 > 0) {
                this.f29476I.setStrokeWidth((float) i7);
                this.f29476I.setColor(this.f29469B);
                int i8 = this.f29470C;
                if (i8 < 255) {
                    this.f29476I.setAlpha(i8);
                }
                float f2 = ((float) this.f29513y) / 2.0f;
                canvas.drawLine(f2, (float) this.f29514z, f2, (float) (i2 - this.f29468A), this.f29476I);
            }
            int i9 = this.f29471D;
            if (i9 > 0) {
                this.f29476I.setStrokeWidth((float) i9);
                this.f29476I.setColor(this.f29474G);
                int i10 = this.f29475H;
                if (i10 < 255) {
                    this.f29476I.setAlpha(i10);
                }
                float floor2 = (float) Math.floor((double) (((float) i) - (((float) this.f29471D) / 2.0f)));
                canvas.drawLine(floor2, (float) this.f29472E, floor2, (float) (i2 - this.f29473F), this.f29476I);
            }
            canvas.restore();
        }
    }

    public C10963a(Context context, AttributeSet attributeSet, int i, View view) {
        this(context, attributeSet, i, 0, view);
    }

    /* renamed from: a */
    private void m45506a(Canvas canvas, RectF rectF, float[] fArr, Paint paint) {
        this.f29486S.reset();
        this.f29486S.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(this.f29486S, paint);
    }

    /* renamed from: a */
    public void mo41628a(int i, int i2, int i3, float f) {
        mo41629a(i, i2, i3, this.f29488U, f);
    }

    /* renamed from: a */
    public void mo41629a(int i, int i2, int i3, int i4, float f) {
        boolean z;
        View view = this.f29485R.get();
        if (view != null) {
            this.f29479L = i;
            this.f29489a = i2;
            this.f29490b = mo41644f();
            this.f29492d = i3;
            this.f29493e = f;
            this.f29488U = i4;
            if (m45507h()) {
                int i5 = this.f29492d;
                if (i5 == 0 || this.f29490b) {
                    view.setElevation(BitmapDescriptorFactory.HUE_RED);
                } else {
                    view.setElevation((float) i5);
                }
                m45510n(this.f29488U);
                view.setOutlineProvider(new ViewOutlineProvider() {
                    /* class com.bytedance.ee.bear.shadow.C10963a.C109641 */

                    public void getOutline(View view, Outline outline) {
                        int i;
                        int i2;
                        int i3;
                        int i4;
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width != 0 && height != 0) {
                            int g = C10963a.this.mo41645g();
                            if (C10963a.this.f29490b) {
                                if (C10963a.this.f29489a == 4) {
                                    i4 = 0 - g;
                                    i2 = width;
                                    i = height;
                                } else if (C10963a.this.f29489a == 1) {
                                    i3 = 0 - g;
                                    i2 = width;
                                    i = height;
                                    i4 = 0;
                                    outline.setRoundRect(i4, i3, i2, i, (float) g);
                                    return;
                                } else {
                                    if (C10963a.this.f29489a == 2) {
                                        width += g;
                                    } else if (C10963a.this.f29489a == 3) {
                                        height += g;
                                    }
                                    i2 = width;
                                    i = height;
                                    i4 = 0;
                                }
                                i3 = 0;
                                outline.setRoundRect(i4, i3, i2, i, (float) g);
                                return;
                            }
                            int i5 = C10963a.this.f29496h;
                            int max = Math.max(i5 + 1, height - C10963a.this.f29497i);
                            int i6 = C10963a.this.f29494f;
                            int i7 = width - C10963a.this.f29495g;
                            if (C10963a.this.f29491c) {
                                i6 += view.getPaddingLeft();
                                i5 += view.getPaddingTop();
                                i7 = Math.max(i6 + 1, i7 - view.getPaddingRight());
                                max = Math.max(i5 + 1, max - view.getPaddingBottom());
                            }
                            float f = C10963a.this.f29493e;
                            if (C10963a.this.f29492d == 0) {
                                f = 1.0f;
                            }
                            outline.setAlpha(f);
                            if (g <= 0) {
                                outline.setRect(i6, i5, i7, max);
                            } else {
                                outline.setRoundRect(i6, i5, i7, max, (float) g);
                            }
                        }
                    }
                });
                int i6 = this.f29479L;
                if (i6 == -2 || i6 == -1 || i6 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                view.setClipToOutline(z);
            }
            view.invalidate();
        }
    }

    public C10963a(Context context, AttributeSet attributeSet, int i, int i2, View view) {
        int i3;
        this.f29507s = 255;
        this.f29512x = 255;
        this.f29470C = 255;
        this.f29475H = 255;
        this.f29483P = 1;
        this.f29486S = new Path();
        this.f29487T = true;
        int i4 = 0;
        this.f29492d = 0;
        this.f29488U = -16777216;
        this.f29494f = 0;
        this.f29495g = 0;
        this.f29496h = 0;
        this.f29497i = 0;
        this.f29498j = context;
        this.f29485R = new WeakReference<>(view);
        int color = ContextCompat.getColor(context, R.color.space_kit_n300);
        this.f29506r = color;
        this.f29511w = color;
        this.f29478K = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        Paint paint = new Paint();
        this.f29477J = paint;
        paint.setAntiAlias(true);
        this.f29493e = 0.17f;
        this.f29481N = new RectF();
        if (attributeSet == null && i == 0 && i2 == 0) {
            i3 = 0;
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843039, 16843040, 16843071, 16843072, R.attr.borderColor, R.attr.borderWidth, R.attr.bottomDividerColor, R.attr.bottomDividerHeight, R.attr.bottomDividerInsetLeft, R.attr.bottomDividerInsetRight, R.attr.hideRadiusSide, R.attr.leftDividerColor, R.attr.leftDividerInsetBottom, R.attr.leftDividerInsetTop, R.attr.leftDividerWidth, R.attr.outerNormalColor, R.attr.outlineExcludePadding, R.attr.outlineInsetBottom, R.attr.outlineInsetLeft, R.attr.outlineInsetRight, R.attr.outlineInsetTop, R.attr.radius, R.attr.rightDividerColor, R.attr.rightDividerInsetBottom, R.attr.rightDividerInsetTop, R.attr.rightDividerWidth, R.attr.shadowAlpha, R.attr.shadowElevation, R.attr.showBorderOnlyBeforeL, R.attr.topDividerColor, R.attr.topDividerHeight, R.attr.topDividerInsetLeft, R.attr.topDividerInsetRight, R.attr.useThemeGeneralShadowElevation}, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i5 = 0;
            i3 = 0;
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 0) {
                    this.f29499k = obtainStyledAttributes.getDimensionPixelSize(index, this.f29499k);
                } else if (index == 1) {
                    this.f29500l = obtainStyledAttributes.getDimensionPixelSize(index, this.f29500l);
                } else if (index == 2) {
                    this.f29501m = obtainStyledAttributes.getDimensionPixelSize(index, this.f29501m);
                } else if (index == 3) {
                    this.f29502n = obtainStyledAttributes.getDimensionPixelSize(index, this.f29502n);
                } else if (index == 29) {
                    this.f29506r = obtainStyledAttributes.getColor(index, this.f29506r);
                } else if (index == 30) {
                    this.f29503o = obtainStyledAttributes.getDimensionPixelSize(index, this.f29503o);
                } else if (index == 31) {
                    this.f29504p = obtainStyledAttributes.getDimensionPixelSize(index, this.f29504p);
                } else if (index == 32) {
                    this.f29505q = obtainStyledAttributes.getDimensionPixelSize(index, this.f29505q);
                } else if (index == 6) {
                    this.f29511w = obtainStyledAttributes.getColor(index, this.f29511w);
                } else if (index == 7) {
                    this.f29508t = obtainStyledAttributes.getDimensionPixelSize(index, this.f29508t);
                } else if (index == 8) {
                    this.f29509u = obtainStyledAttributes.getDimensionPixelSize(index, this.f29509u);
                } else if (index == 9) {
                    this.f29510v = obtainStyledAttributes.getDimensionPixelSize(index, this.f29510v);
                } else if (index == 11) {
                    this.f29469B = obtainStyledAttributes.getColor(index, this.f29469B);
                } else if (index == 14) {
                    this.f29513y = obtainStyledAttributes.getDimensionPixelSize(index, this.f29513y);
                } else if (index == 13) {
                    this.f29514z = obtainStyledAttributes.getDimensionPixelSize(index, this.f29514z);
                } else if (index == 12) {
                    this.f29468A = obtainStyledAttributes.getDimensionPixelSize(index, this.f29468A);
                } else if (index == 22) {
                    this.f29474G = obtainStyledAttributes.getColor(index, this.f29474G);
                } else if (index == 25) {
                    this.f29471D = obtainStyledAttributes.getDimensionPixelSize(index, this.f29471D);
                } else if (index == 24) {
                    this.f29472E = obtainStyledAttributes.getDimensionPixelSize(index, this.f29472E);
                } else if (index == 23) {
                    this.f29473F = obtainStyledAttributes.getDimensionPixelSize(index, this.f29473F);
                } else if (index == 4) {
                    this.f29482O = obtainStyledAttributes.getColor(index, this.f29482O);
                } else if (index == 5) {
                    this.f29483P = obtainStyledAttributes.getDimensionPixelSize(index, this.f29483P);
                } else if (index == 21) {
                    i5 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 15) {
                    this.f29484Q = obtainStyledAttributes.getColor(index, this.f29484Q);
                } else if (index == 10) {
                    this.f29489a = obtainStyledAttributes.getInt(index, this.f29489a);
                } else if (index == 28) {
                    this.f29487T = obtainStyledAttributes.getBoolean(index, this.f29487T);
                } else if (index == 27) {
                    i3 = obtainStyledAttributes.getDimensionPixelSize(index, i3);
                } else if (index == 26) {
                    this.f29493e = obtainStyledAttributes.getFloat(index, this.f29493e);
                } else if (index == 33) {
                    obtainStyledAttributes.getBoolean(index, false);
                } else if (index == 18) {
                    this.f29494f = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 19) {
                    this.f29495g = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 20) {
                    this.f29496h = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 17) {
                    this.f29497i = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 16) {
                    this.f29491c = obtainStyledAttributes.getBoolean(index, false);
                }
            }
            obtainStyledAttributes.recycle();
            i4 = i5;
        }
        mo41628a(i4, this.f29489a, i3, this.f29493e);
    }
}
