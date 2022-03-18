package com.bytedance.ee.bear.reminder.calendar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.bytedance.ee.bear.reminder.C10615c;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p718t.C13749l;
import com.haibin.calendarview.AbstractC23357l;
import com.haibin.calendarview.Calendar;
import java.util.ArrayList;
import java.util.List;

public class ReminderMonthView extends AbstractC23357l implements AbstractC10617a, NonProguard {
    private static C10616a sExpireTime = null;
    private static List<AbstractC10617a> sParamUpdateListeners = new ArrayList();
    private static int sSelectAfterDayColorRes = 2131101372;
    private static int sSelectBeforeDayColorRes = 2131101373;
    private static int sSelectCurrentDayColorRes = 2131101374;
    private int mRadius = C13749l.m55738a(16);
    private float mTextHeight;

    /* renamed from: com.bytedance.ee.bear.reminder.calendar.ReminderMonthView$a */
    public static class C10616a {

        /* renamed from: a */
        public int f28526a;

        /* renamed from: b */
        public int f28527b;
    }

    @Override // com.bytedance.ee.bear.reminder.calendar.AbstractC10617a
    public void onExpireTimeUpdate() {
        invalidate();
    }

    @Override // com.bytedance.ee.bear.reminder.calendar.AbstractC10617a
    public void onSelectColorResUpdate() {
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sParamUpdateListeners.add(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sParamUpdateListeners.remove(this);
    }

    public ReminderMonthView(Context context) {
        super(context);
        Typeface createFromAsset = Typeface.createFromAsset(getContext().getAssets(), "fonts/DINAlternateBold.ttf");
        this.mCurMonthTextPaint.setTypeface(createFromAsset);
        this.mOtherMonthTextPaint.setTypeface(createFromAsset);
        this.mSelectTextPaint.setTypeface(createFromAsset);
        Rect rect = new Rect();
        this.mCurMonthTextPaint.getTextBounds("22", 0, 2, rect);
        this.mTextHeight = (float) rect.height();
    }

    private static void notifyListeners(boolean z) {
        if (z) {
            for (AbstractC10617a aVar : sParamUpdateListeners) {
                aVar.onExpireTimeUpdate();
            }
            return;
        }
        for (AbstractC10617a aVar2 : sParamUpdateListeners) {
            aVar2.onSelectColorResUpdate();
        }
    }

    public static void updateExpireTime(int i, int i2) {
        if (sExpireTime == null) {
            sExpireTime = new C10616a();
        }
        sExpireTime.f28526a = i;
        sExpireTime.f28527b = i2;
        notifyListeners(true);
    }

    public static void updateSelectDayColorResources(int i, int i2, int i3) {
        sSelectBeforeDayColorRes = i;
        sSelectAfterDayColorRes = i3;
        sSelectCurrentDayColorRes = i2;
        notifyListeners(false);
    }

    /* access modifiers changed from: protected */
    @Override // com.haibin.calendarview.AbstractC23357l
    public void onDrawScheme(Canvas canvas, Calendar calendar, int i, int i2) {
        canvas.drawCircle((float) (i + (this.mItemWidth / 2)), (this.mTextBaseLine - (this.mTextHeight / 2.0f)) + ((float) i2), (float) this.mRadius, this.mSchemePaint);
    }

    /* access modifiers changed from: protected */
    @Override // com.haibin.calendarview.AbstractC23357l
    public boolean onDrawSelected(Canvas canvas, Calendar calendar, int i, int i2, boolean z) {
        int i3;
        long timeInMillis = calendar.getTimeInMillis();
        C10616a aVar = sExpireTime;
        if (aVar != null) {
            timeInMillis = C10615c.m44023a(calendar, aVar.f28526a, sExpireTime.f28527b, 0);
        }
        long currentTimeMillis = timeInMillis - System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            i3 = sSelectBeforeDayColorRes;
        } else if (currentTimeMillis < 604800000) {
            i3 = sSelectCurrentDayColorRes;
        } else {
            i3 = sSelectAfterDayColorRes;
        }
        this.mSelectedPaint.setColor(getResources().getColor(i3));
        canvas.drawCircle((float) (i + (this.mItemWidth / 2)), (this.mTextBaseLine - (this.mTextHeight / 2.0f)) + ((float) i2), (float) this.mRadius, this.mSelectedPaint);
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.haibin.calendarview.AbstractC23357l
    public void onDrawText(Canvas canvas, Calendar calendar, int i, int i2, boolean z, boolean z2) {
        Paint paint;
        float f = this.mTextBaseLine + ((float) i2);
        int i3 = i + (this.mItemWidth / 2);
        String valueOf = String.valueOf(calendar.getDay());
        float f2 = (float) i3;
        if (z2 || z) {
            paint = this.mSelectTextPaint;
        } else if (calendar.isCurrentMonth()) {
            paint = this.mCurMonthTextPaint;
        } else {
            paint = this.mOtherMonthTextPaint;
        }
        canvas.drawText(valueOf, f2, f, paint);
    }
}
