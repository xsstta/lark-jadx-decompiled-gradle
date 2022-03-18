package com.ss.android.lark.mm.module.list.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.lcodecore.tkrefreshlayout.AbstractC26376a;
import com.lcodecore.tkrefreshlayout.p1213b.C26395a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0001H\u0016J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020!H\u0014J\u0010\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020(H\u0014J\b\u0010)\u001a\u00020!H\u0016J \u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u0011H\u0016J \u0010.\u001a\u00020!2\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u0011H\u0016J\b\u0010/\u001a\u00020!H\u0016J\u0010\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020\nH\u0002J\b\u00102\u001a\u00020!H\u0002J\u0018\u00102\u001a\u00020!2\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u0011H\u0016J\b\u00103\u001a\u00020!H\u0002R\u0014\u0010\f\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001a0\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/lark/mm/module/list/widget/MinutesListFooterView;", "Landroid/view/View;", "Lcom/lcodecore/tkrefreshlayout/IBottomView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "DEFAULT_SIZE", "getDEFAULT_SIZE", "()I", "animatingColor", "circleSpacing", "", "mAnimators", "Ljava/util/ArrayList;", "Landroid/animation/ValueAnimator;", "Lkotlin/collections/ArrayList;", "mPaint", "Landroid/graphics/Paint;", "mUpdateListeners", "", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "normalColor", "paintColors", "", "scaleFloats", "", "createAnimators", "", "getView", "isStarted", "", "onDetachedFromWindow", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onFinish", "onPullReleasing", "fraction", "maxHeadHeight", "headHeight", "onPullingUp", "reset", "setIndicatorColor", "color", "startAnim", "stopAnim", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MinutesListFooterView extends View implements AbstractC26376a {

    /* renamed from: a */
    public final float[] f116951a;

    /* renamed from: b */
    private final int f116952b;

    /* renamed from: c */
    private float f116953c;

    /* renamed from: d */
    private final int[] f116954d;

    /* renamed from: e */
    private ArrayList<ValueAnimator> f116955e;

    /* renamed from: f */
    private final Map<ValueAnimator, ValueAnimator.AnimatorUpdateListener> f116956f;

    /* renamed from: g */
    private Paint f116957g;

    /* renamed from: h */
    private int f116958h;

    /* renamed from: i */
    private int f116959i;

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26376a
    public View getView() {
        return this;
    }

    public final int getDEFAULT_SIZE() {
        return this.f116952b;
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26376a
    /* renamed from: a */
    public void mo93621a() {
        C45855f.m181663b("MinutesListFooterView", "onFinish");
        m183772d();
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26376a
    /* renamed from: b */
    public void mo93624b() {
        C45855f.m181663b("MinutesListFooterView", "reset");
        m183772d();
    }

    /* renamed from: e */
    private final boolean m183773e() {
        ArrayList<ValueAnimator> arrayList = this.f116955e;
        if (arrayList == null) {
            return false;
        }
        Iterator<ValueAnimator> it = arrayList.iterator();
        if (!it.hasNext()) {
            return false;
        }
        ValueAnimator next = it.next();
        Intrinsics.checkExpressionValueIsNotNull(next, "animator");
        return next.isStarted();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList<ValueAnimator> arrayList = this.f116955e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i).cancel();
            }
        }
    }

    /* renamed from: c */
    private final void m183771c() {
        ArrayList<ValueAnimator> arrayList = this.f116955e;
        if (arrayList == null) {
            m183774f();
        }
        if (arrayList != null && !m183773e()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ValueAnimator valueAnimator = arrayList.get(i);
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animators[i]");
                ValueAnimator valueAnimator2 = valueAnimator;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f116956f.get(valueAnimator2);
                if (animatorUpdateListener != null) {
                    valueAnimator2.addUpdateListener(animatorUpdateListener);
                }
                valueAnimator2.start();
            }
            setIndicatorColor(this.f116959i);
        }
    }

    /* renamed from: d */
    private final void m183772d() {
        ArrayList<ValueAnimator> arrayList = this.f116955e;
        if (arrayList != null) {
            Iterator<ValueAnimator> it = arrayList.iterator();
            while (it.hasNext()) {
                ValueAnimator next = it.next();
                Intrinsics.checkExpressionValueIsNotNull(next, "animator");
                if (next.isStarted()) {
                    next.removeAllUpdateListeners();
                    next.end();
                }
            }
        }
        setIndicatorColor(this.f116958h);
    }

    /* renamed from: f */
    private final void m183774f() {
        this.f116955e = new ArrayList<>();
        int[] iArr = {SmEvents.EVENT_NW, 240, 360};
        for (int i = 0; i <= 2; i++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.3f, 1.0f);
            Intrinsics.checkExpressionValueIsNotNull(ofFloat, "scaleAnim");
            ofFloat.setDuration(750L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setStartDelay((long) iArr[i]);
            this.f116956f.put(ofFloat, new C46451a(this, i));
            ArrayList<ValueAnimator> arrayList = this.f116955e;
            if (arrayList != null) {
                arrayList.add(ofFloat);
            }
        }
    }

    public MinutesListFooterView(Context context) {
        this(context, null);
    }

    private final void setIndicatorColor(int i) {
        Paint paint = this.f116957g;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.widget.MinutesListFooterView$a */
    public static final class C46451a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ MinutesListFooterView f116960a;

        /* renamed from: b */
        final /* synthetic */ int f116961b;

        C46451a(MinutesListFooterView minutesListFooterView, int i) {
            this.f116960a = minutesListFooterView;
            this.f116961b = i;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float[] fArr = this.f116960a.f116951a;
            int i = this.f116961b;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                fArr[i] = ((Float) animatedValue).floatValue();
                this.f116960a.postInvalidate();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        float f = (float) 2;
        float min = (((float) Math.min(getWidth(), getHeight())) - (this.f116953c * f)) / ((float) 6);
        float f2 = min * f;
        float width = ((float) (getWidth() / 2)) - (this.f116953c + f2);
        float height = ((float) getHeight()) / f;
        for (int i = 0; i <= 2; i++) {
            canvas.save();
            float f3 = (float) i;
            canvas.translate((f2 * f3) + width + (this.f116953c * f3), height);
            float[] fArr = this.f116951a;
            canvas.scale(fArr[i], fArr[i]);
            Paint paint = this.f116957g;
            if (paint != null) {
                paint.setColor(this.f116954d[i]);
            }
            Paint paint2 = this.f116957g;
            if (paint2 != null) {
                canvas.drawCircle(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, min, paint2);
            }
            canvas.restore();
        }
    }

    public MinutesListFooterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26376a
    /* renamed from: a */
    public void mo93622a(float f, float f2) {
        C45855f.m181663b("MinutesListFooterView", "startAnim");
        m183771c();
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26376a
    /* renamed from: b */
    public void mo93625b(float f, float f2, float f3) {
        C45855f.m181663b("MinutesListFooterView", "onPullReleasing");
        m183772d();
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26376a
    /* renamed from: a */
    public void mo93623a(float f, float f2, float f3) {
        C45855f.m181663b("MinutesListFooterView", "onPullingUp");
        m183772d();
    }

    public MinutesListFooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f116952b = 25;
        this.f116951a = new float[]{1.0f, 1.0f, 1.0f};
        this.f116954d = new int[]{getResources().getColor(R.color.Yellow), getResources().getColor(R.color.Green), getResources().getColor(R.color.Blue)};
        this.f116956f = new HashMap();
        this.f116958h = -1118482;
        this.f116959i = -1615546;
        int a = C26395a.m95593a(context, (float) 25);
        setLayoutParams(new FrameLayout.LayoutParams(a, a, 17));
        this.f116953c = (float) C26395a.m95593a(context, 4.0f);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f116957g = paint;
    }
}
