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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/appcenter/common/bannerview/indicator/drawer/CircleDrawer;", "Lcom/ss/android/appcenter/common/bannerview/indicator/drawer/BaseDrawer;", "indicatorOptions", "Lcom/ss/android/appcenter/common/bannerview/indicator/option/IndicatorOptions;", "(Lcom/ss/android/appcenter/common/bannerview/indicator/option/IndicatorOptions;)V", "rectF", "Landroid/graphics/RectF;", "drawCircle", "", "canvas", "Landroid/graphics/Canvas;", "coordinateX", "", "coordinateY", "radius", "drawCircleSlider", "drawColor", "drawNormal", "drawScaleSlider", "drawSlider", "drawWormSlider", "measureHeight", "", "onDraw", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.common.bannerview.indicator.a.b */
public final class CircleDrawer extends BaseDrawer {

    /* renamed from: b */
    private final RectF f70508b = new RectF();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.appcenter.common.bannerview.indicator.drawer.BaseDrawer
    /* renamed from: f */
    public int mo100212f() {
        return ((int) mo100206a()) + 6;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CircleDrawer(IndicatorOptions bVar) {
        super(bVar);
        Intrinsics.checkParameterIsNotNull(bVar, "indicatorOptions");
    }

    @Override // com.ss.android.appcenter.common.bannerview.indicator.drawer.IDrawer
    /* renamed from: a */
    public void mo100217a(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        if (mo100213g().mo100235d() > 1) {
            m102986b(canvas);
            m102987c(canvas);
        }
    }

    /* renamed from: c */
    private final void m102987c(Canvas canvas) {
        mo100209c().setColor(mo100213g().mo100241f());
        int c = mo100213g().mo100232c();
        if (c == 0 || c == 2) {
            m102990f(canvas);
        } else if (c == 3) {
            m102991g(canvas);
        } else if (c == 4) {
            m102989e(canvas);
        } else if (c == 5) {
            m102988d(canvas);
        }
    }

    /* renamed from: b */
    private final void m102986b(Canvas canvas) {
        float i = mo100213g().mo100247i();
        mo100209c().setColor(mo100213g().mo100238e());
        int d = mo100213g().mo100235d();
        for (int i2 = 0; i2 < d; i2++) {
            m102985a(canvas, IndicatorUtils.f70529a.mo100271a(mo100213g(), mo100206a(), i2), IndicatorUtils.f70529a.mo100272b(mo100206a()), i / ((float) 2));
        }
    }

    /* renamed from: f */
    private final void m102990f(Canvas canvas) {
        int k = mo100213g().mo100249k();
        float a = IndicatorUtils.f70529a.mo100271a(mo100213g(), mo100206a(), k);
        m102985a(canvas, a + ((IndicatorUtils.f70529a.mo100271a(mo100213g(), mo100206a(), (k + 1) % mo100213g().mo100235d()) - a) * mo100213g().mo100250l()), IndicatorUtils.f70529a.mo100272b(mo100206a()), mo100213g().mo100248j() / ((float) 2));
    }

    /* renamed from: g */
    private final void m102991g(Canvas canvas) {
        float i = mo100213g().mo100247i();
        float l = mo100213g().mo100250l();
        int k = mo100213g().mo100249k();
        float g = mo100213g().mo100243g() + mo100213g().mo100247i();
        float a = IndicatorUtils.f70529a.mo100271a(mo100213g(), mo100206a(), k);
        float f = (float) 2;
        float coerceAtLeast = (RangesKt.coerceAtLeast(((l - 0.5f) * g) * 2.0f, (float) BitmapDescriptorFactory.HUE_RED) + a) - (mo100213g().mo100247i() / f);
        float f2 = (float) 3;
        this.f70508b.set(coerceAtLeast + f2, f2, a + RangesKt.coerceAtMost(l * g * 2.0f, g) + (mo100213g().mo100247i() / f) + f2, i + f2);
        canvas.drawRoundRect(this.f70508b, i, i, mo100209c());
    }

    /* renamed from: d */
    private final void m102988d(Canvas canvas) {
        Object obj;
        float f;
        int k = mo100213g().mo100249k();
        float l = mo100213g().mo100250l();
        float a = IndicatorUtils.f70529a.mo100271a(mo100213g(), mo100206a(), k);
        float b = IndicatorUtils.f70529a.mo100272b(mo100206a());
        ArgbEvaluator d = mo100210d();
        Object obj2 = null;
        if (d != null) {
            obj = d.evaluate(l, Integer.valueOf(mo100213g().mo100241f()), Integer.valueOf(mo100213g().mo100238e()));
        } else {
            obj = null;
        }
        Paint c = mo100209c();
        if (obj != null) {
            c.setColor(((Integer) obj).intValue());
            float f2 = (float) 2;
            m102985a(canvas, a, b, mo100213g().mo100247i() / f2);
            ArgbEvaluator d2 = mo100210d();
            if (d2 != null) {
                obj2 = d2.evaluate(((float) 1) - l, Integer.valueOf(mo100213g().mo100241f()), Integer.valueOf(mo100213g().mo100238e()));
            }
            Paint c2 = mo100209c();
            if (obj2 != null) {
                c2.setColor(((Integer) obj2).intValue());
                if (k == mo100213g().mo100235d() - 1) {
                    f = IndicatorUtils.f70529a.mo100271a(mo100213g(), mo100206a(), 0);
                } else {
                    f = mo100213g().mo100247i() + a + mo100213g().mo100243g();
                }
                m102985a(canvas, f, b, mo100213g().mo100248j() / f2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
    }

    /* renamed from: e */
    private final void m102989e(Canvas canvas) {
        Object obj;
        int k = mo100213g().mo100249k();
        float l = mo100213g().mo100250l();
        float a = IndicatorUtils.f70529a.mo100271a(mo100213g(), mo100206a(), k);
        float b = IndicatorUtils.f70529a.mo100272b(mo100206a());
        Object obj2 = null;
        if (l < ((float) 1)) {
            ArgbEvaluator d = mo100210d();
            if (d != null) {
                obj = d.evaluate(l, Integer.valueOf(mo100213g().mo100241f()), Integer.valueOf(mo100213g().mo100238e()));
            } else {
                obj = null;
            }
            Paint c = mo100209c();
            if (obj != null) {
                c.setColor(((Integer) obj).intValue());
                float f = (float) 2;
                m102985a(canvas, a, b, (mo100213g().mo100248j() / f) - (((mo100213g().mo100248j() / f) - (mo100213g().mo100247i() / f)) * l));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
        }
        if (k == mo100213g().mo100235d() - 1) {
            ArgbEvaluator d2 = mo100210d();
            if (d2 != null) {
                obj2 = d2.evaluate(l, Integer.valueOf(mo100213g().mo100238e()), Integer.valueOf(mo100213g().mo100241f()));
            }
            Paint c2 = mo100209c();
            if (obj2 != null) {
                c2.setColor(((Integer) obj2).intValue());
                float f2 = (float) 2;
                m102985a(canvas, mo100206a() / f2, b, (mo100208b() / f2) + (((mo100206a() / f2) - (mo100208b() / f2)) * l));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        } else if (l > ((float) 0)) {
            ArgbEvaluator d3 = mo100210d();
            if (d3 != null) {
                obj2 = d3.evaluate(l, Integer.valueOf(mo100213g().mo100238e()), Integer.valueOf(mo100213g().mo100241f()));
            }
            Paint c3 = mo100209c();
            if (obj2 != null) {
                c3.setColor(((Integer) obj2).intValue());
                float f3 = (float) 2;
                m102985a(canvas, a + mo100213g().mo100243g() + mo100213g().mo100247i(), b, (mo100213g().mo100247i() / f3) + (((mo100213g().mo100248j() / f3) - (mo100213g().mo100247i() / f3)) * l));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: a */
    private final void m102985a(Canvas canvas, float f, float f2, float f3) {
        float f4 = (float) 3;
        canvas.drawCircle(f + f4, f2 + f4, f3, mo100209c());
    }
}
