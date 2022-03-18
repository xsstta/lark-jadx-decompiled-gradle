package com.ss.android.appcenter.common.bannerview.indicator.drawer;

import android.animation.ArgbEvaluator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.appcenter.common.bannerview.indicator.option.IndicatorOptions;
import com.ss.android.appcenter.common.bannerview.indicator.utils.IndicatorUtils;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0014J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0013H\u0002J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/ss/android/appcenter/common/bannerview/indicator/drawer/RectDrawer;", "Lcom/ss/android/appcenter/common/bannerview/indicator/drawer/BaseDrawer;", "indicatorOptions", "Lcom/ss/android/appcenter/common/bannerview/indicator/option/IndicatorOptions;", "(Lcom/ss/android/appcenter/common/bannerview/indicator/option/IndicatorOptions;)V", "mRectF", "Landroid/graphics/RectF;", "getMRectF$appcenter_release", "()Landroid/graphics/RectF;", "setMRectF$appcenter_release", "(Landroid/graphics/RectF;)V", "drawCheckedSlider", "", "canvas", "Landroid/graphics/Canvas;", "drawColorSlider", "drawDash", "drawInequalitySlider", "pageSize", "", "drawRoundRect", "rx", "", "ry", "drawScaleSlider", "i", "drawSmoothSlider", "drawUncheckedSlider", "drawWormSlider", "onDraw", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.common.bannerview.indicator.a.g */
public class RectDrawer extends BaseDrawer {

    /* renamed from: b */
    private RectF f70511b = new RectF();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo100218b(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
    }

    /* renamed from: h */
    public final RectF mo100223h() {
        return this.f70511b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RectDrawer(IndicatorOptions bVar) {
        super(bVar);
        Intrinsics.checkParameterIsNotNull(bVar, "indicatorOptions");
    }

    /* renamed from: c */
    private final void m103005c(Canvas canvas) {
        mo100209c().setColor(mo100213g().mo100241f());
        int c = mo100213g().mo100232c();
        if (c == 2) {
            m103009f(canvas);
        } else if (c == 3) {
            m103008e(canvas);
        } else if (c == 5) {
            m103007d(canvas);
        }
    }

    @Override // com.ss.android.appcenter.common.bannerview.indicator.drawer.IDrawer
    /* renamed from: a */
    public void mo100217a(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        int d = mo100213g().mo100235d();
        if (d <= 1) {
            return;
        }
        if (mo100211e() && mo100213g().mo100232c() != 0) {
            m103004b(canvas, d);
            m103005c(canvas);
        } else if (mo100213g().mo100232c() == 4) {
            for (int i = 0; i < d; i++) {
                m103003a(canvas, i);
            }
        } else {
            m103006c(canvas, d);
        }
    }

    /* renamed from: e */
    private final void m103008e(Canvas canvas) {
        float h = mo100213g().mo100245h();
        float l = mo100213g().mo100250l();
        int k = mo100213g().mo100249k();
        float g = mo100213g().mo100243g() + mo100213g().mo100247i();
        float a = IndicatorUtils.f70529a.mo100271a(mo100213g(), mo100206a(), k);
        float f = (float) 2;
        float coerceAtMost = a + RangesKt.coerceAtMost(l * g * 2.0f, g) + (mo100213g().mo100247i() / f);
        this.f70511b.set((RangesKt.coerceAtLeast(((l - 0.5f) * g) * 2.0f, (float) BitmapDescriptorFactory.HUE_RED) + a) - (mo100213g().mo100247i() / f), BitmapDescriptorFactory.HUE_RED, coerceAtMost, h);
        mo100222a(canvas, h, h);
    }

    /* renamed from: f */
    private final void m103009f(Canvas canvas) {
        int k = mo100213g().mo100249k();
        float g = mo100213g().mo100243g();
        float h = mo100213g().mo100245h();
        float f = (float) k;
        float a = (mo100206a() * f) + (f * g) + ((mo100206a() + g) * mo100213g().mo100250l());
        this.f70511b.set(a, BitmapDescriptorFactory.HUE_RED, mo100206a() + a, h);
        mo100222a(canvas, h, h);
    }

    /* renamed from: d */
    private final void m103007d(Canvas canvas) {
        Object obj;
        int k = mo100213g().mo100249k();
        float l = mo100213g().mo100250l();
        float f = (float) k;
        float b = (mo100208b() * f) + (f * mo100213g().mo100243g());
        Object obj2 = null;
        if (((double) l) < 0.99d) {
            ArgbEvaluator d = mo100210d();
            if (d != null) {
                obj = d.evaluate(l, Integer.valueOf(mo100213g().mo100241f()), Integer.valueOf(mo100213g().mo100238e()));
            } else {
                obj = null;
            }
            Paint c = mo100209c();
            if (obj != null) {
                c.setColor(((Integer) obj).intValue());
                this.f70511b.set(b, BitmapDescriptorFactory.HUE_RED, mo100208b() + b, mo100213g().mo100245h());
                mo100222a(canvas, mo100213g().mo100245h(), mo100213g().mo100245h());
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
        }
        float g = b + mo100213g().mo100243g() + mo100213g().mo100247i();
        if (k == mo100213g().mo100235d() - 1) {
            g = BitmapDescriptorFactory.HUE_RED;
        }
        ArgbEvaluator d2 = mo100210d();
        if (d2 != null) {
            obj2 = d2.evaluate(((float) 1) - l, Integer.valueOf(mo100213g().mo100241f()), Integer.valueOf(mo100213g().mo100238e()));
        }
        Paint c2 = mo100209c();
        if (obj2 != null) {
            c2.setColor(((Integer) obj2).intValue());
            this.f70511b.set(g, BitmapDescriptorFactory.HUE_RED, mo100208b() + g, mo100213g().mo100245h());
            mo100222a(canvas, mo100213g().mo100245h(), mo100213g().mo100245h());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
    }

    /* renamed from: b */
    private final void m103004b(Canvas canvas, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            mo100209c().setColor(mo100213g().mo100238e());
            float f = (float) i2;
            float a = (mo100206a() * f) + (f * mo100213g().mo100243g()) + (mo100206a() - mo100208b());
            this.f70511b.set(a, BitmapDescriptorFactory.HUE_RED, mo100208b() + a, mo100213g().mo100245h());
            mo100222a(canvas, mo100213g().mo100245h(), mo100213g().mo100245h());
        }
    }

    /* renamed from: c */
    private final void m103006c(Canvas canvas, int i) {
        float f;
        int i2;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 == mo100213g().mo100249k()) {
                f = mo100206a();
            } else {
                f = mo100208b();
            }
            Paint c = mo100209c();
            if (i3 == mo100213g().mo100249k()) {
                i2 = mo100213g().mo100241f();
            } else {
                i2 = mo100213g().mo100238e();
            }
            c.setColor(i2);
            this.f70511b.set(f2, BitmapDescriptorFactory.HUE_RED, f2 + f, mo100213g().mo100245h());
            mo100222a(canvas, mo100213g().mo100245h(), mo100213g().mo100245h());
            f2 += f + mo100213g().mo100243g();
        }
    }

    /* renamed from: a */
    private final void m103003a(Canvas canvas, int i) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        float f;
        int f2 = mo100213g().mo100241f();
        float g = mo100213g().mo100243g();
        float h = mo100213g().mo100245h();
        int k = mo100213g().mo100249k();
        float i2 = mo100213g().mo100247i();
        float j = mo100213g().mo100248j();
        if (i < k) {
            mo100209c().setColor(mo100213g().mo100238e());
            if (k == mo100213g().mo100235d() - 1) {
                float f3 = (float) i;
                f = (f3 * i2) + (f3 * g) + ((j - i2) * mo100213g().mo100250l());
            } else {
                float f4 = (float) i;
                f = (f4 * i2) + (f4 * g);
            }
            this.f70511b.set(f, BitmapDescriptorFactory.HUE_RED, i2 + f, h);
            mo100222a(canvas, h, h);
        } else if (i == k) {
            mo100209c().setColor(f2);
            float l = mo100213g().mo100250l();
            if (k == mo100213g().mo100235d() - 1) {
                ArgbEvaluator d = mo100210d();
                if (d != null) {
                    obj4 = d.evaluate(l, Integer.valueOf(f2), Integer.valueOf(mo100213g().mo100238e()));
                } else {
                    obj4 = null;
                }
                Paint c = mo100209c();
                if (obj4 != null) {
                    c.setColor(((Integer) obj4).intValue());
                    float d2 = (((float) (mo100213g().mo100235d() - 1)) * (mo100213g().mo100243g() + i2)) + j;
                    this.f70511b.set((d2 - j) + ((j - i2) * l), BitmapDescriptorFactory.HUE_RED, d2, h);
                    mo100222a(canvas, h, h);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
            } else {
                float f5 = (float) 1;
                if (l < f5) {
                    ArgbEvaluator d3 = mo100210d();
                    if (d3 != null) {
                        obj3 = d3.evaluate(l, Integer.valueOf(f2), Integer.valueOf(mo100213g().mo100238e()));
                    } else {
                        obj3 = null;
                    }
                    Paint c2 = mo100209c();
                    if (obj3 != null) {
                        c2.setColor(((Integer) obj3).intValue());
                        float f6 = (float) i;
                        float f7 = (f6 * i2) + (f6 * g);
                        this.f70511b.set(f7, BitmapDescriptorFactory.HUE_RED, f7 + i2 + ((j - i2) * (f5 - l)), h);
                        mo100222a(canvas, h, h);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                    }
                }
            }
            if (k == mo100213g().mo100235d() - 1) {
                if (l > ((float) 0)) {
                    ArgbEvaluator d4 = mo100210d();
                    if (d4 != null) {
                        obj2 = d4.evaluate(((float) 1) - l, Integer.valueOf(f2), Integer.valueOf(mo100213g().mo100238e()));
                    } else {
                        obj2 = null;
                    }
                    Paint c3 = mo100209c();
                    if (obj2 != null) {
                        c3.setColor(((Integer) obj2).intValue());
                        this.f70511b.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i2 + BitmapDescriptorFactory.HUE_RED + ((j - i2) * l), h);
                        mo100222a(canvas, h, h);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
            } else if (l > ((float) 0)) {
                ArgbEvaluator d5 = mo100210d();
                if (d5 != null) {
                    obj = d5.evaluate(((float) 1) - l, Integer.valueOf(f2), Integer.valueOf(mo100213g().mo100238e()));
                } else {
                    obj = null;
                }
                Paint c4 = mo100209c();
                if (obj != null) {
                    c4.setColor(((Integer) obj).intValue());
                    float f8 = (float) i;
                    float f9 = (f8 * i2) + (f8 * g) + i2 + g + j;
                    this.f70511b.set((f9 - i2) - ((j - i2) * l), BitmapDescriptorFactory.HUE_RED, f9, h);
                    mo100222a(canvas, h, h);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
        } else if (k + 1 != i || mo100213g().mo100250l() == BitmapDescriptorFactory.HUE_RED) {
            mo100209c().setColor(mo100213g().mo100238e());
            float f10 = (float) i;
            float b = (mo100208b() * f10) + (f10 * g) + (j - mo100208b());
            this.f70511b.set(b, BitmapDescriptorFactory.HUE_RED, mo100208b() + b, h);
            mo100222a(canvas, h, h);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo100222a(Canvas canvas, float f, float f2) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        mo100218b(canvas);
    }
}
