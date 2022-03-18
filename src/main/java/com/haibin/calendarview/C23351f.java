package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.haibin.calendarview.f */
public final class C23351f extends AbstractC23357l {

    /* renamed from: a */
    private Paint f57646a = new Paint();

    /* renamed from: b */
    private Paint f57647b = new Paint();

    /* renamed from: c */
    private float f57648c;

    /* renamed from: d */
    private int f57649d;

    /* renamed from: e */
    private float f57650e;

    /* renamed from: a */
    private float m84865a(String str) {
        return this.f57646a.measureText(str);
    }

    public C23351f(Context context) {
        super(context);
        this.f57646a.setTextSize((float) C23349d.m84776a(context, 8.0f));
        this.f57646a.setColor(-1);
        this.f57646a.setAntiAlias(true);
        this.f57646a.setFakeBoldText(true);
        this.f57647b.setAntiAlias(true);
        this.f57647b.setStyle(Paint.Style.FILL);
        this.f57647b.setTextAlign(Paint.Align.CENTER);
        this.f57647b.setColor(-1223853);
        this.f57647b.setFakeBoldText(true);
        this.f57648c = (float) C23349d.m84776a(getContext(), 7.0f);
        this.f57649d = C23349d.m84776a(getContext(), 4.0f);
        Paint.FontMetrics fontMetrics = this.f57647b.getFontMetrics();
        this.f57650e = (this.f57648c - fontMetrics.descent) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f) + ((float) C23349d.m84776a(getContext(), 1.0f));
    }

    /* access modifiers changed from: protected */
    @Override // com.haibin.calendarview.AbstractC23357l
    public void onDrawScheme(Canvas canvas, Calendar calendar, int i, int i2) {
        this.f57647b.setColor(calendar.getSchemeColor());
        int i3 = this.f57649d;
        float f = this.f57648c;
        canvas.drawCircle(((float) ((this.mItemWidth + i) - i3)) - (f / 2.0f), ((float) (i3 + i2)) + f, f, this.f57647b);
        canvas.drawText(calendar.getScheme(), (((float) ((i + this.mItemWidth) - this.f57649d)) - (this.f57648c / 2.0f)) - (m84865a(calendar.getScheme()) / 2.0f), ((float) (i2 + this.f57649d)) + this.f57650e, this.f57646a);
    }

    /* access modifiers changed from: protected */
    @Override // com.haibin.calendarview.AbstractC23357l
    public boolean onDrawSelected(Canvas canvas, Calendar calendar, int i, int i2, boolean z) {
        this.mSelectedPaint.setStyle(Paint.Style.FILL);
        int i3 = this.f57649d;
        canvas.drawRect((float) (i + i3), (float) (i3 + i2), (float) ((i + this.mItemWidth) - this.f57649d), (float) ((i2 + this.mItemHeight) - this.f57649d), this.mSelectedPaint);
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.haibin.calendarview.AbstractC23357l
    public void onDrawText(Canvas canvas, Calendar calendar, int i, int i2, boolean z, boolean z2) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        int i3 = i + (this.mItemWidth / 2);
        int i4 = i2 - (this.mItemHeight / 6);
        if (z2) {
            float f = (float) i3;
            canvas.drawText(String.valueOf(calendar.getDay()), f, this.mTextBaseLine + ((float) i4), this.mSelectTextPaint);
            canvas.drawText(calendar.getLunar(), f, this.mTextBaseLine + ((float) i2) + ((float) (this.mItemHeight / 10)), this.mSelectedLunarTextPaint);
        } else if (z) {
            String valueOf = String.valueOf(calendar.getDay());
            float f2 = (float) i3;
            float f3 = this.mTextBaseLine + ((float) i4);
            if (calendar.isCurrentDay()) {
                paint3 = this.mCurDayTextPaint;
            } else if (calendar.isCurrentMonth()) {
                paint3 = this.mSchemeTextPaint;
            } else {
                paint3 = this.mOtherMonthTextPaint;
            }
            canvas.drawText(valueOf, f2, f3, paint3);
            String lunar = calendar.getLunar();
            float f4 = this.mTextBaseLine + ((float) i2) + ((float) (this.mItemHeight / 10));
            if (calendar.isCurrentDay()) {
                paint4 = this.mCurDayLunarTextPaint;
            } else {
                paint4 = this.mSchemeLunarTextPaint;
            }
            canvas.drawText(lunar, f2, f4, paint4);
        } else {
            String valueOf2 = String.valueOf(calendar.getDay());
            float f5 = (float) i3;
            float f6 = this.mTextBaseLine + ((float) i4);
            if (calendar.isCurrentDay()) {
                paint = this.mCurDayTextPaint;
            } else if (calendar.isCurrentMonth()) {
                paint = this.mCurMonthTextPaint;
            } else {
                paint = this.mOtherMonthTextPaint;
            }
            canvas.drawText(valueOf2, f5, f6, paint);
            String lunar2 = calendar.getLunar();
            float f7 = this.mTextBaseLine + ((float) i2) + ((float) (this.mItemHeight / 10));
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
