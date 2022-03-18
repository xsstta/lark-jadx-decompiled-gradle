package com.ss.android.lark.setting.page.content.common.impl.font;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001GB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\bH\u0002J\u0010\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u00020\bH\u0002J\b\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u0002062\u0006\u00108\u001a\u000209H\u0014J(\u0010:\u001a\u0002062\u0006\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020\n2\u0006\u0010=\u001a\u00020\n2\u0006\u0010>\u001a\u00020\nH\u0014J\u0010\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0016J\u000e\u0010C\u001a\u0002062\u0006\u0010D\u001a\u000200J\u000e\u0010E\u001a\u0002062\u0006\u0010F\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\nXD¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(XD¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010+\u001a\n ,*\u0004\u0018\u00010(0(X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u000e¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/font/FontSizeSettingView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "halfLineHieght", "", "mATextColor", "", "mBigSize", "mBigTextPaint", "Landroid/graphics/Paint;", "mBigTextScale", "mCircleColor", "mCirclePaint", "mCircleRadius", "mCircleX", "mCircleY", "mCurrentProgress", "mHeight", "mInitialPosition", "mItemWidth", "mLineColor", "mLinePaint", "mLineWidth", "mMargin", "mMaxArea", "mPoints", "", "Landroid/graphics/Point;", "mSmallSize", "mSmallTextPaint", "mSmallTextScale", "mStandardTextColor", "mStandardTextPaint", "mStandardTextScale", "mStanderSize", "mTextA", "", "mTextBigMargin", "mTextSmallMargin", "mTextStandard", "kotlin.jvm.PlatformType", "mTextStandardMargin", "mWidth", "onChangeListener", "Lcom/ss/android/lark/setting/page/content/common/impl/font/FontSizeSettingView$OnProgressChangeListener;", "dp2px", "dp", "getNearestPoint", "x", "initAttrs", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "setChangeCallbackListener", "listener", "setDefaultPosition", "position", "OnProgressChangeListener", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class FontSizeSettingView extends View {

    /* renamed from: A */
    private Paint f134085A;

    /* renamed from: B */
    private float f134086B;

    /* renamed from: C */
    private float f134087C;

    /* renamed from: D */
    private final List<Point> f134088D;

    /* renamed from: E */
    private float f134089E;

    /* renamed from: F */
    private float f134090F;

    /* renamed from: G */
    private float f134091G;

    /* renamed from: H */
    private OnProgressChangeListener f134092H;

    /* renamed from: a */
    private final String f134093a;

    /* renamed from: b */
    private final String f134094b;

    /* renamed from: c */
    private final int f134095c;

    /* renamed from: d */
    private final float f134096d;

    /* renamed from: e */
    private final float f134097e;

    /* renamed from: f */
    private final float f134098f;

    /* renamed from: g */
    private final float f134099g;

    /* renamed from: h */
    private final int f134100h;

    /* renamed from: i */
    private float f134101i;

    /* renamed from: j */
    private final int f134102j;

    /* renamed from: k */
    private final int f134103k;

    /* renamed from: l */
    private float f134104l;

    /* renamed from: m */
    private int f134105m;

    /* renamed from: n */
    private int f134106n;

    /* renamed from: o */
    private int f134107o;

    /* renamed from: p */
    private final int f134108p;

    /* renamed from: q */
    private float f134109q;

    /* renamed from: r */
    private float f134110r;

    /* renamed from: s */
    private float f134111s;

    /* renamed from: t */
    private int f134112t;

    /* renamed from: u */
    private int f134113u;

    /* renamed from: v */
    private int f134114v;

    /* renamed from: w */
    private Paint f134115w;

    /* renamed from: x */
    private Paint f134116x;

    /* renamed from: y */
    private Paint f134117y;

    /* renamed from: z */
    private Paint f134118z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/font/FontSizeSettingView$OnProgressChangeListener;", "", "onChangeListener", "", "position", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.FontSizeSettingView$a */
    public interface OnProgressChangeListener {
        /* renamed from: a */
        void mo185434a(int i);
    }

    public FontSizeSettingView(Context context) {
        this(context, null, 2, null);
    }

    /* renamed from: a */
    private final void m210321a() {
        Paint paint = new Paint(1);
        paint.setColor(this.f134100h);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(this.f134101i);
        this.f134115w = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(this.f134108p);
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setTextSize(this.f134109q);
        this.f134089E = paint2.measureText(this.f134093a);
        this.f134116x = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(this.f134107o);
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        paint3.setTextSize(this.f134110r);
        this.f134090F = paint3.measureText(this.f134094b);
        this.f134117y = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(this.f134108p);
        paint4.setStyle(Paint.Style.FILL_AND_STROKE);
        paint4.setTextSize(this.f134111s);
        this.f134091G = paint4.measureText(this.f134093a);
        this.f134118z = paint4;
        Paint paint5 = new Paint(1);
        paint5.setColor(this.f134103k);
        paint5.setStyle(Paint.Style.FILL);
        setLayerType(1, null);
        paint5.setShadowLayer(8.0f, BitmapDescriptorFactory.HUE_RED, 2.0f, C57582a.m223616d(getContext(), R.color.shadow_default_sm));
        this.f134085A = paint5;
    }

    public final void setChangeCallbackListener(OnProgressChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f134092H = aVar;
    }

    public final void setDefaultPosition(int i) {
        this.f134106n = i;
        OnProgressChangeListener aVar = this.f134092H;
        if (aVar != null) {
            aVar.mo185434a(i);
        }
        invalidate();
    }

    /* renamed from: b */
    private final float m210322b(float f) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        return TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        this.f134086B = motionEvent.getX();
        int action = motionEvent.getAction();
        if (action == 0) {
            invalidate();
        } else if (action == 1) {
            this.f134086B = (float) m210320a(this.f134086B).x;
            invalidate();
            OnProgressChangeListener aVar = this.f134092H;
            if (aVar != null) {
                aVar.mo185434a(this.f134105m);
            }
        } else if (action == 2) {
            invalidate();
        }
        return true;
    }

    /* renamed from: a */
    private final Point m210320a(float f) {
        if (f < ((float) this.f134088D.get(0).x)) {
            this.f134105m = 0;
            return (Point) CollectionsKt.first((List) this.f134088D);
        }
        List<Point> list = this.f134088D;
        if (f > ((float) list.get(list.size() - 1).x)) {
            this.f134105m = CollectionsKt.getLastIndex(this.f134088D);
            return (Point) CollectionsKt.last((List) this.f134088D);
        }
        int size = this.f134088D.size();
        for (int i = 0; i < size; i++) {
            Point point = this.f134088D.get(i);
            if (Math.abs(((float) point.x) - f) <= ((float) (this.f134112t / 2))) {
                this.f134105m = i;
                return point;
            }
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDraw(canvas);
        String str = this.f134093a;
        float f = (float) 2;
        float f2 = ((float) this.f134088D.get(0).x) - (this.f134089E / f);
        float height = ((float) ((getHeight() * 2) / 3)) - this.f134096d;
        Paint paint = this.f134116x;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSmallTextPaint");
        }
        canvas.drawText(str, f2, height, paint);
        String str2 = this.f134094b;
        float f3 = ((float) this.f134088D.get(1).x) - (this.f134090F / f);
        float height2 = ((float) ((getHeight() * 2) / 3)) - this.f134097e;
        Paint paint2 = this.f134117y;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStandardTextPaint");
        }
        canvas.drawText(str2, f3, height2, paint2);
        String str3 = this.f134093a;
        List<Point> list = this.f134088D;
        float f4 = ((float) list.get(list.size() - 1).x) - (this.f134091G / f);
        float height3 = ((float) ((getHeight() * 2) / 3)) - this.f134098f;
        Paint paint3 = this.f134118z;
        if (paint3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBigTextPaint");
        }
        canvas.drawText(str3, f4, height3, paint3);
        float f5 = (float) this.f134088D.get(0).x;
        float f6 = (float) 3;
        float height4 = ((float) (getHeight() * 2)) / f6;
        List<Point> list2 = this.f134088D;
        float f7 = (float) list2.get(list2.size() - 1).x;
        float height5 = ((float) (getHeight() * 2)) / f6;
        Paint paint4 = this.f134115w;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLinePaint");
        }
        canvas.drawLine(f5, height4, f7, height5, paint4);
        for (Point point : this.f134088D) {
            float f8 = (float) 1;
            float f9 = ((float) point.x) + f8;
            float height6 = ((float) ((getHeight() * 2) / 3)) - this.f134099g;
            float f10 = ((float) point.x) + f8;
            float height7 = ((float) ((getHeight() * 2) / 3)) + this.f134099g;
            Paint paint5 = this.f134115w;
            if (paint5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLinePaint");
            }
            canvas.drawLine(f9, height6, f10, height7, paint5);
        }
        float f11 = this.f134086B;
        int i = this.f134095c;
        if (f11 < ((float) i)) {
            this.f134086B = (float) i;
        }
        if (this.f134086B > ((float) (getWidth() - this.f134095c))) {
            this.f134086B = ((float) getWidth()) - ((float) this.f134095c);
        }
        float f12 = this.f134086B + ((float) 1);
        float f13 = this.f134087C;
        float f14 = this.f134104l;
        Paint paint6 = this.f134085A;
        if (paint6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCirclePaint");
        }
        canvas.drawCircle(f12, f13, f14, paint6);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FontSizeSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f134093a = "A";
        this.f134094b = UIHelper.getString(R.string.Lark_NewSettings_DefaultTextSize);
        this.f134095c = (int) m210322b(42.0f);
        this.f134096d = m210322b(25.0f);
        this.f134097e = m210322b(26.0f);
        this.f134098f = m210322b(24.0f);
        this.f134099g = m210322b(4.0f);
        this.f134100h = C57582a.m223616d(context, R.color.ud_N400);
        this.f134101i = m210322b(1.0f);
        this.f134102j = 5;
        this.f134103k = C57582a.m223616d(context, R.color.static_white);
        this.f134104l = m210322b(14.0f);
        this.f134106n = 1;
        this.f134107o = C57582a.m223616d(context, R.color.text_placeholder);
        this.f134108p = C57582a.m223616d(context, R.color.text_title);
        this.f134109q = m210322b(17.0f);
        this.f134110r = m210322b(17.0f);
        this.f134111s = m210322b(26.0f);
        this.f134088D = new ArrayList();
        m210321a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FontSizeSettingView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f134113u = i2;
        this.f134114v = i;
        this.f134087C = ((float) (getHeight() * 2)) / ((float) 3);
        int i5 = i - (this.f134095c * 2);
        int i6 = this.f134102j;
        this.f134112t = i5 / i6;
        if (i6 >= 0) {
            int i7 = 0;
            while (true) {
                this.f134088D.add(new Point(this.f134095c + (this.f134112t * i7), (getHeight() * 2) / 3));
                if (i7 == i6) {
                    break;
                }
                i7++;
            }
        }
        this.f134086B = (float) this.f134088D.get(this.f134106n).x;
    }
}
