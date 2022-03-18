package com.ss.android.lark.calendar.impl.features.common.widget.calendar.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;

public class CalendarWeekIndicator extends LinearLayout {

    /* renamed from: a */
    private String[] f78765a = C32634ae.m125183c(R.array.weeks_abbr);

    /* renamed from: b */
    private String[] f78766b = new String[7];

    /* renamed from: c */
    private int f78767c;

    /* renamed from: d */
    private boolean f78768d;

    /* renamed from: e */
    private int f78769e;

    /* renamed from: f */
    private int f78770f;

    /* renamed from: g */
    private TextPaint f78771g;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.CalendarWeekIndicator$1 */
    public static /* synthetic */ class C311701 {

        /* renamed from: a */
        static final /* synthetic */ int[] f78772a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting$DayOfWeek[] r0 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting.DayOfWeek.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.CalendarWeekIndicator.C311701.f78772a = r0
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting$DayOfWeek r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting.DayOfWeek.MONDAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.CalendarWeekIndicator.C311701.f78772a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting$DayOfWeek r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting.DayOfWeek.SATURDAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.CalendarWeekIndicator.C311701.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = ((float) getWidth()) / 7.0f;
        for (int i = 0; i < 7; i++) {
            String str = this.f78766b[i];
            if (!TextUtils.isEmpty(str)) {
                if (!this.f78768d || i != this.f78767c) {
                    this.f78771g.setColor(this.f78770f);
                } else {
                    this.f78771g.setColor(this.f78769e);
                }
                int i2 = (int) width;
                Rect rect = new Rect(getLeft() + (i2 * i), 0, getLeft() + (i2 * (i + 1)), getHeight());
                Paint.FontMetrics fontMetrics = this.f78771g.getFontMetrics();
                canvas.drawText(str, (float) rect.centerX(), (((float) rect.centerY()) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f)) - fontMetrics.bottom, this.f78771g);
            }
        }
    }

    /* renamed from: a */
    public void mo112908a(int i, boolean z) {
        CalendarSetting c = C30022a.f74884c.mo108456c();
        mo112909a(i, z, c.getWeekStartDay());
        C30022a.f74884c.mo108450a(new C30086b.AbstractC30090a(c, z) {
            /* class com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.$$Lambda$CalendarWeekIndicator$NIOY77Xts_4jGVNe0ufdcqPFuY */
            public final /* synthetic */ CalendarSetting f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
            public final void onGetSucceed(CalendarSetting calendarSetting) {
                CalendarWeekIndicator.this.m116356a((CalendarWeekIndicator) this.f$1, (CalendarSetting) this.f$2, (boolean) calendarSetting);
            }
        });
    }

    public CalendarWeekIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextPaint textPaint = new TextPaint();
        this.f78771g = textPaint;
        textPaint.setTextSize((float) context.getResources().getDimensionPixelSize(R.dimen.dp_12));
        this.f78771g.setTextAlign(Paint.Align.CENTER);
        this.f78771g.setAntiAlias(true);
        this.f78769e = context.getResources().getColor(R.color.primary_pri_500);
        this.f78770f = context.getResources().getColor(R.color.text_title);
        setWillNotDraw(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m116356a(CalendarSetting calendarSetting, boolean z, CalendarSetting calendarSetting2) {
        if (calendarSetting.getWeekStartDay() != calendarSetting2.getWeekStartDay()) {
            mo112909a(new CalendarDate().getWeeklyDayIndex(calendarSetting2.getWeekStartDay()), z, calendarSetting2.getWeekStartDay());
        }
    }

    /* renamed from: a */
    public void mo112909a(int i, boolean z, CalendarSetting.DayOfWeek dayOfWeek) {
        this.f78767c = i;
        this.f78768d = z;
        int i2 = C311701.f78772a[dayOfWeek.ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            while (i3 < 7) {
                int i4 = i3 + 1;
                this.f78766b[i3] = this.f78765a[i4 % 7];
                i3 = i4;
            }
        } else if (i2 != 2) {
            while (i3 < 7) {
                this.f78766b[i3] = this.f78765a[i3];
                i3++;
            }
        } else {
            while (i3 < 7) {
                this.f78766b[i3] = this.f78765a[(i3 + 6) % 7];
                i3++;
            }
        }
        invalidate();
    }
}
