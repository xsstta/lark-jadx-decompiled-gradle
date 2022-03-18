package com.ss.android.appcenter.common.bannerview.indicator.drawer;

import android.animation.ArgbEvaluator;
import android.graphics.Paint;
import com.ss.android.appcenter.common.bannerview.indicator.option.IndicatorOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b&\u0018\u0000 /2\u00020\u0001:\u0002/0B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020#H\u0002J0\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020#H\u0016J\u001c\u0010,\u001a\u00060\u0012R\u00020\u00002\u0006\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020#H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8DX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0004R\u0012\u0010\u0011\u001a\u00060\u0012R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e¨\u00061"}, d2 = {"Lcom/ss/android/appcenter/common/bannerview/indicator/drawer/BaseDrawer;", "Lcom/ss/android/appcenter/common/bannerview/indicator/drawer/IDrawer;", "mIndicatorOptions", "Lcom/ss/android/appcenter/common/bannerview/indicator/option/IndicatorOptions;", "(Lcom/ss/android/appcenter/common/bannerview/indicator/option/IndicatorOptions;)V", "argbEvaluator", "Landroid/animation/ArgbEvaluator;", "getArgbEvaluator$appcenter_release", "()Landroid/animation/ArgbEvaluator;", "setArgbEvaluator$appcenter_release", "(Landroid/animation/ArgbEvaluator;)V", "isWidthEquals", "", "()Z", "getMIndicatorOptions$appcenter_release", "()Lcom/ss/android/appcenter/common/bannerview/indicator/option/IndicatorOptions;", "setMIndicatorOptions$appcenter_release", "mMeasureResult", "Lcom/ss/android/appcenter/common/bannerview/indicator/drawer/BaseDrawer$MeasureResult;", "mPaint", "Landroid/graphics/Paint;", "getMPaint$appcenter_release", "()Landroid/graphics/Paint;", "setMPaint$appcenter_release", "(Landroid/graphics/Paint;)V", "maxWidth", "", "getMaxWidth$appcenter_release", "()F", "setMaxWidth$appcenter_release", "(F)V", "minWidth", "getMinWidth$appcenter_release", "setMinWidth$appcenter_release", "measureHeight", "", "measureWidth", "onLayout", "", "changed", "left", "top", "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "Companion", "MeasureResult", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.common.bannerview.indicator.a.a */
public abstract class BaseDrawer implements IDrawer {

    /* renamed from: a */
    public static final Companion f70498a = new Companion(null);

    /* renamed from: b */
    private final MeasureResult f70499b = new MeasureResult();

    /* renamed from: c */
    private float f70500c;

    /* renamed from: d */
    private float f70501d;

    /* renamed from: e */
    private Paint f70502e;

    /* renamed from: f */
    private ArgbEvaluator f70503f;

    /* renamed from: g */
    private IndicatorOptions f70504g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/appcenter/common/bannerview/indicator/drawer/BaseDrawer$Companion;", "", "()V", "INDICATOR_PADDING", "", "INDICATOR_PADDING_ADDITION", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.common.bannerview.indicator.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001d\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000fR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/ss/android/appcenter/common/bannerview/indicator/drawer/BaseDrawer$MeasureResult;", "", "(Lcom/ss/android/appcenter/common/bannerview/indicator/drawer/BaseDrawer;)V", "<set-?>", "", "measureHeight", "getMeasureHeight", "()I", "setMeasureHeight$appcenter_release", "(I)V", "measureWidth", "getMeasureWidth", "setMeasureWidth$appcenter_release", "setMeasureResult", "", "setMeasureResult$appcenter_release", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.common.bannerview.indicator.a.a$b */
    public final class MeasureResult {

        /* renamed from: b */
        private int f70506b;

        /* renamed from: c */
        private int f70507c;

        /* renamed from: a */
        public final int mo100214a() {
            return this.f70506b;
        }

        /* renamed from: b */
        public final int mo100216b() {
            return this.f70507c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public MeasureResult() {
        }

        /* renamed from: a */
        public final void mo100215a(int i, int i2) {
            this.f70506b = i;
            this.f70507c = i2;
        }
    }

    /* renamed from: a */
    public final float mo100206a() {
        return this.f70500c;
    }

    /* renamed from: b */
    public final float mo100208b() {
        return this.f70501d;
    }

    /* renamed from: c */
    public final Paint mo100209c() {
        return this.f70502e;
    }

    /* renamed from: d */
    public final ArgbEvaluator mo100210d() {
        return this.f70503f;
    }

    /* renamed from: g */
    public final IndicatorOptions mo100213g() {
        return this.f70504g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo100212f() {
        return ((int) this.f70504g.mo100245h()) + 3;
    }

    /* renamed from: h */
    private final int mo100223h() {
        float d = (float) (this.f70504g.mo100235d() - 1);
        return ((int) ((this.f70504g.mo100243g() * d) + this.f70500c + (d * this.f70501d))) + 6;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo100211e() {
        if (this.f70504g.mo100247i() == this.f70504g.mo100248j()) {
            return true;
        }
        return false;
    }

    public BaseDrawer(IndicatorOptions bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "mIndicatorOptions");
        this.f70504g = bVar;
        Paint paint = new Paint();
        this.f70502e = paint;
        paint.setAntiAlias(true);
        if (this.f70504g.mo100232c() == 4 || this.f70504g.mo100232c() == 5) {
            this.f70503f = new ArgbEvaluator();
        }
    }

    @Override // com.ss.android.appcenter.common.bannerview.indicator.drawer.IDrawer
    /* renamed from: a */
    public MeasureResult mo100207a(int i, int i2) {
        this.f70500c = RangesKt.coerceAtLeast(this.f70504g.mo100247i(), this.f70504g.mo100248j());
        this.f70501d = RangesKt.coerceAtMost(this.f70504g.mo100247i(), this.f70504g.mo100248j());
        if (this.f70504g.mo100224a() == 1) {
            this.f70499b.mo100215a(mo100212f(), mo100223h());
        } else {
            this.f70499b.mo100215a(mo100223h(), mo100212f());
        }
        return this.f70499b;
    }
}
