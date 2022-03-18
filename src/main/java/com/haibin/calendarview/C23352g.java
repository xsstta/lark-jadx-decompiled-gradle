package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.haibin.calendarview.g */
public final class C23352g extends AbstractC23364p {

    /* renamed from: a */
    private Paint f57651a = new Paint();

    /* renamed from: b */
    private Paint f57652b = new Paint();

    /* renamed from: c */
    private float f57653c;

    /* renamed from: d */
    private int f57654d;

    /* renamed from: e */
    private float f57655e;

    /* renamed from: a */
    private float m84866a(String str) {
        return this.f57651a.measureText(str);
    }

    public C23352g(Context context) {
        super(context);
        this.f57651a.setTextSize((float) C23349d.m84776a(context, 8.0f));
        this.f57651a.setColor(-1);
        this.f57651a.setAntiAlias(true);
        this.f57651a.setFakeBoldText(true);
        this.f57652b.setAntiAlias(true);
        this.f57652b.setStyle(Paint.Style.FILL);
        this.f57652b.setTextAlign(Paint.Align.CENTER);
        this.f57652b.setColor(-1223853);
        this.f57652b.setFakeBoldText(true);
        this.f57653c = (float) C23349d.m84776a(getContext(), 7.0f);
        this.f57654d = C23349d.m84776a(getContext(), 4.0f);
        Paint.FontMetrics fontMetrics = this.f57652b.getFontMetrics();
        this.f57655e = (this.f57653c - fontMetrics.descent) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f) + ((float) C23349d.m84776a(getContext(), 1.0f));
    }

    /* access modifiers changed from: protected */
    @Override // com.haibin.calendarview.AbstractC23364p
    /* renamed from: a */
    public void mo81185a(Canvas canvas, Calendar calendar, int i) {
        this.f57652b.setColor(calendar.getSchemeColor());
        int i2 = this.f57654d;
        float f = this.f57653c;
        canvas.drawCircle(((float) ((this.mItemWidth + i) - i2)) - (f / 2.0f), ((float) i2) + f, f, this.f57652b);
        canvas.drawText(calendar.getScheme(), (((float) ((i + this.mItemWidth) - this.f57654d)) - (this.f57653c / 2.0f)) - (m84866a(calendar.getScheme()) / 2.0f), ((float) this.f57654d) + this.f57655e, this.f57651a);
    }

    /* access modifiers changed from: protected */
    @Override // com.haibin.calendarview.AbstractC23364p
    /* renamed from: a */
    public boolean mo81187a(Canvas canvas, Calendar calendar, int i, boolean z) {
        this.mSelectedPaint.setStyle(Paint.Style.FILL);
        int i2 = this.f57654d;
        canvas.drawRect((float) (i + i2), (float) i2, (float) ((i + this.mItemWidth) - this.f57654d), (float) (this.mItemHeight - this.f57654d), this.mSelectedPaint);
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.haibin.calendarview.AbstractC23364p
    /* renamed from: a */
    public void mo81186a(Canvas canvas, Calendar calendar, int i, boolean z, boolean z2) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        int i2 = i + (this.mItemWidth / 2);
        int i3 = (-this.mItemHeight) / 6;
        if (z2) {
            float f = (float) i2;
            canvas.drawText(String.valueOf(calendar.getDay()), f, this.mTextBaseLine + ((float) i3), this.mSelectTextPaint);
            canvas.drawText(calendar.getLunar(), f, this.mTextBaseLine + ((float) (this.mItemHeight / 10)), this.mSelectedLunarTextPaint);
        } else if (z) {
            String valueOf = String.valueOf(calendar.getDay());
            float f2 = (float) i2;
            float f3 = this.mTextBaseLine + ((float) i3);
            if (calendar.isCurrentDay()) {
                paint3 = this.mCurDayTextPaint;
            } else if (calendar.isCurrentMonth()) {
                paint3 = this.mSchemeTextPaint;
            } else {
                paint3 = this.mOtherMonthTextPaint;
            }
            canvas.drawText(valueOf, f2, f3, paint3);
            String lunar = calendar.getLunar();
            float f4 = this.mTextBaseLine + ((float) (this.mItemHeight / 10));
            if (calendar.isCurrentDay()) {
                paint4 = this.mCurDayLunarTextPaint;
            } else {
                paint4 = this.mSchemeLunarTextPaint;
            }
            canvas.drawText(lunar, f2, f4, paint4);
        } else {
            String valueOf2 = String.valueOf(calendar.getDay());
            float f5 = (float) i2;
            float f6 = this.mTextBaseLine + ((float) i3);
            if (calendar.isCurrentDay()) {
                paint = this.mCurDayTextPaint;
            } else if (calendar.isCurrentMonth()) {
                paint = this.mCurMonthTextPaint;
            } else {
                paint = this.mOtherMonthTextPaint;
            }
            canvas.drawText(valueOf2, f5, f6, paint);
            String lunar2 = calendar.getLunar();
            float f7 = this.mTextBaseLine + ((float) (this.mItemHeight / 10));
            if (calendar.isCurrentDay()) {
                paint2 = this.mCurDayLunarTextPaint;
            } else if (calendar.isCurrentMonth()) {
                paint2 = this.mCurMonthLunarTextPaint;
            } else {
                paint2 = this.mOtherMonthLunarTextPaint;
            }
            canvas.drawText(lunar2, f5, f7, paint2);
        }
    }
}
