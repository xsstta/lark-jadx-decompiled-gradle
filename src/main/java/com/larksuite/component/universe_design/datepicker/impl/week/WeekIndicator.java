package com.larksuite.component.universe_design.datepicker.impl.week;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.larksuite.component.universe_design.util.CalendarDate;
import com.larksuite.component.universe_design.util.ResUtil;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH\u0014J\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\bJ\u0016\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\u000bJ \u0010\"\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010$R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/impl/week/WeekIndicator;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mBlackColor", "", "mBlueColor", "mChangeTextColorBlue", "", "mCurrentWeekDayIndex", "mShowTexts", "", "", "[Ljava/lang/String;", "mWeekDateTextPaint", "Landroid/text/TextPaint;", "mWeeks", "weekTextSizePx", "", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setWeekTextSizePx", "textSize", "updateWeekColor", "currentWeekDayIndex", "changeTextColorBlue", "updateWeekColorAndText", "weekStartDay", "Lcom/larksuite/component/universe_design/util/CalendarDate$DayOfWeek;", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class WeekIndicator extends View {

    /* renamed from: a */
    private final String[] f63253a;

    /* renamed from: b */
    private final String[] f63254b = new String[7];

    /* renamed from: c */
    private final int f63255c;

    /* renamed from: d */
    private final int f63256d;

    /* renamed from: e */
    private int f63257e;

    /* renamed from: f */
    private boolean f63258f;

    /* renamed from: g */
    private final TextPaint f63259g;

    /* renamed from: h */
    private float f63260h;

    public final void setWeekTextSizePx(int i) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        float a = UDDimenUtils.m93307a(context, (float) i);
        this.f63260h = a;
        this.f63259g.setTextSize(a);
        requestLayout();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDraw(canvas);
        float width = ((float) getWidth()) / ((float) 7);
        for (int i = 0; i < 7; i++) {
            String str = this.f63254b[i];
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (!this.f63258f || i != this.f63257e) {
                    this.f63259g.setColor(this.f63256d);
                } else {
                    this.f63259g.setColor(this.f63255c);
                }
                int i2 = (int) width;
                Rect rect = new Rect(i2 * i, 0, i2 * (i + 1), getHeight());
                Paint.FontMetrics fontMetrics = this.f63259g.getFontMetrics();
                canvas.drawText(str, (float) rect.centerX(), (((float) rect.centerY()) + ((fontMetrics.bottom - fontMetrics.top) / ((float) 2))) - fontMetrics.bottom, this.f63259g);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), (int) this.f63260h);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WeekIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        TextPaint textPaint = new TextPaint();
        this.f63259g = textPaint;
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "getContext()");
        float a = UDDimenUtils.m93307a(context2, 12.0f);
        this.f63260h = a;
        textPaint.setTextSize(a);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
        Context context3 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "getContext()");
        this.f63253a = ResUtil.m93302a(context3, R.array.ud_timePicker_weeks_abbreviation);
        this.f63255c = context.getResources().getColor(R.color.primary_pri_500);
        this.f63256d = context.getResources().getColor(R.color.text_title);
    }

    /* renamed from: a */
    public final void mo90549a(int i, boolean z, CalendarDate.DayOfWeek dayOfWeek) {
        this.f63257e = i;
        this.f63258f = z;
        int i2 = 0;
        if (dayOfWeek != null) {
            int i3 = C25743a.f63261a[dayOfWeek.ordinal()];
            if (i3 == 1) {
                while (i2 < 7) {
                    int i4 = i2 + 1;
                    this.f63254b[i2] = this.f63253a[i4 % 7];
                    i2 = i4;
                }
            } else if (i3 == 2) {
                while (i2 < 7) {
                    this.f63254b[i2] = this.f63253a[(i2 + 6) % 7];
                    i2++;
                }
            }
            invalidate();
        }
        while (i2 < 7) {
            this.f63254b[i2] = this.f63253a[i2];
            i2++;
        }
        invalidate();
    }
}
