package com.ss.android.lark.calendar.impl.features.meetingroom.instance.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.meetingroom.instance.viewdata.OneInstanceViewData;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u0004\u0018\u00010\u0010J\u0012\u0010\u001e\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0010R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/widget/InstanceChipView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBackgroundPaint", "Landroid/graphics/Paint;", "mBackgroundStrokePaint", "mDottedRectangle", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "mInstanceData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/viewdata/OneInstanceViewData;", "mStartEndPadding", "", "mTitleTextPaint", "Landroid/text/TextPaint;", "mTitleTextSize", "mTopBottomPadding", "clear", "", "drawEventChip", "canvas", "Landroid/graphics/Canvas;", "drawTitleText", "getData", "onDraw", "setData", "instanceData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InstanceChipView extends View {

    /* renamed from: a */
    private OneInstanceViewData f82115a;

    /* renamed from: b */
    private final TextPaint f82116b;

    /* renamed from: c */
    private final Paint f82117c;

    /* renamed from: d */
    private final Paint f82118d;

    /* renamed from: e */
    private final float f82119e;

    /* renamed from: f */
    private final float f82120f;

    /* renamed from: g */
    private final float f82121g;

    /* renamed from: h */
    private final Drawable f82122h;

    public InstanceChipView(Context context) {
        this(context, null, 0, 6, null);
    }

    public InstanceChipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final OneInstanceViewData getData() {
        return this.f82115a;
    }

    /* renamed from: a */
    public final void mo117201a() {
        this.f82115a = null;
    }

    public final void setData(OneInstanceViewData cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "instanceData");
        this.f82115a = cVar;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (canvas != null) {
            m122160a(canvas);
            m122161b(canvas);
        }
    }

    /* renamed from: b */
    private final void m122161b(Canvas canvas) {
        String e;
        OneInstanceViewData cVar;
        OneInstanceViewData cVar2 = this.f82115a;
        if (cVar2 != null && (e = cVar2.mo117176e()) != null && (cVar = this.f82115a) != null) {
            int f = cVar.mo117178f();
            String str = e;
            if (!TextUtils.isEmpty(str)) {
                this.f82116b.setTextAlign(Paint.Align.LEFT);
                this.f82116b.setFakeBoldText(false);
                this.f82116b.setTextSize(this.f82119e);
                this.f82116b.setColor(f);
                int breakText = this.f82116b.breakText(str, 0, e.length(), true, (((float) getWidth()) - (this.f82121g * ((float) 2))) + this.f82119e, null);
                Paint.FontMetrics fontMetrics = this.f82116b.getFontMetrics();
                float f2 = this.f82120f;
                canvas.drawText(e, 0, breakText, f2, f2 - fontMetrics.top, (Paint) this.f82116b);
            }
        }
    }

    /* renamed from: a */
    private final void m122160a(Canvas canvas) {
        OneInstanceViewData cVar = this.f82115a;
        if (cVar != null) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            float a = UDDimenUtils.m93307a(context, 0.5f);
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            float a2 = UDDimenUtils.m93308a(context2, 2);
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight());
            float f = a / ((float) 2);
            rectF.inset(f, f);
            Path path = new Path();
            path.addRoundRect(rectF, a2, a2, Path.Direction.CW);
            this.f82117c.setColor(cVar.mo117179g());
            Paint paint = this.f82118d;
            Context context3 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            paint.setColor(UDColorUtils.getColor(context3, R.color.bg_body));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(a);
            canvas.drawRoundRect(rectF, a2, a2, this.f82117c);
            canvas.drawPath(path, this.f82118d);
            OneInstanceViewData cVar2 = this.f82115a;
            if (cVar2 != null && cVar2.mo117180h()) {
                this.f82122h.setBounds(0, 0, getWidth(), getHeight());
                this.f82122h.draw(canvas);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstanceChipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f82119e = (float) UIHelper.dp2px(14.0f);
        this.f82120f = (float) UIHelper.dp2px(3.0f);
        this.f82121g = (float) UIHelper.dp2px(9.0f);
        this.f82122h = UIHelper.getDrawable(R.drawable.bg_dotted_rectangle);
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint();
        this.f82116b = textPaint;
        textPaint.setAntiAlias(true);
        Paint paint = new Paint();
        this.f82117c = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        this.f82118d = paint2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstanceChipView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
