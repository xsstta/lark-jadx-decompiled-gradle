package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.TimeZone;

public class CurrentTimeLine extends View {

    /* renamed from: a */
    private final int f75205a = 300000;

    /* renamed from: b */
    private int f75206b = 5;

    /* renamed from: c */
    private int f75207c = 1;

    /* renamed from: d */
    private int f75208d;

    /* renamed from: e */
    private Drawable f75209e;

    /* renamed from: f */
    private Drawable f75210f;

    /* renamed from: g */
    private int f75211g;

    /* renamed from: h */
    private Rect f75212h;

    /* renamed from: i */
    private C30167c f75213i;

    /* renamed from: j */
    private CalendarDate f75214j;

    /* renamed from: k */
    private TimeZone f75215k = TimeZone.getDefault();

    /* renamed from: l */
    private Runnable f75216l = new Runnable() {
        /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.CurrentTimeLine.RunnableC301611 */

        public void run() {
            CurrentTimeLine.this.invalidate();
            CurrentTimeLine.this.postDelayed(this, 300000);
        }
    };

    /* renamed from: b */
    private void m111738b() {
        this.f75211g = 0;
        invalidate();
    }

    /* renamed from: d */
    private void m111740d() {
        removeCallbacks(this.f75216l);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m111739c();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m111740d();
    }

    /* renamed from: a */
    private void m111734a() {
        C30022a.f74884c.mo108450a(new C30086b.AbstractC30090a() {
            /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.$$Lambda$CurrentTimeLine$jlyTrxzfDrFQqdJjfovyHqEHQ5o */

            @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
            public final void onGetSucceed(CalendarSetting calendarSetting) {
                CurrentTimeLine.lambda$jlyTrxzfDrFQqdJjfovyHqEHQ5o(CurrentTimeLine.this, calendarSetting);
            }
        });
    }

    /* renamed from: c */
    private void m111739c() {
        removeCallbacks(this.f75216l);
        post(this.f75216l);
    }

    public int getTimeLineTop() {
        if (this.f75212h.isEmpty()) {
            m111741e();
        }
        return this.f75212h.top - this.f75208d;
    }

    /* renamed from: e */
    private void m111741e() {
        int dayMinutes = this.f75214j.setTimeInMillis(System.currentTimeMillis()).getDayMinutes();
        if (m111737a(dayMinutes)) {
            this.f75212h.set(this.f75213i.mo108773a(0, dayMinutes));
            if (!this.f75212h.isEmpty()) {
                int i = this.f75212h.top - this.f75208d;
                Drawable drawable = this.f75209e;
                int i2 = this.f75212h.left;
                int i3 = this.f75212h.left;
                int i4 = this.f75206b;
                drawable.setBounds(i2, i, i3 + i4, i4 + i);
                this.f75210f.setBounds(this.f75212h.left, this.f75212h.top, this.f75212h.left + this.f75212h.width(), this.f75212h.top + this.f75207c);
            }
            this.f75211g = dayMinutes;
        }
    }

    /* renamed from: a */
    public void mo108727a(CalendarDate calendarDate) {
        this.f75214j = calendarDate;
        m111738b();
    }

    public void setEventChipsGridLine(C30167c cVar) {
        this.f75213i = cVar;
        m111738b();
    }

    public void onDraw(Canvas canvas) {
        m111741e();
        this.f75210f.draw(canvas);
        this.f75209e.draw(canvas);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m111736a(CalendarSetting calendarSetting) {
        TimeZone safeMobileNormalViewTimezone = calendarSetting.getSafeMobileNormalViewTimezone();
        this.f75215k = safeMobileNormalViewTimezone;
        mo108729a(safeMobileNormalViewTimezone);
    }

    public CurrentTimeLine(Context context) {
        super(context);
        m111734a();
        m111735a(context);
    }

    /* renamed from: a */
    private boolean m111737a(int i) {
        int i2 = this.f75211g;
        if (i - i2 >= 5 || i2 <= 0 || i < i2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m111735a(Context context) {
        LayerDrawable layerDrawable = (LayerDrawable) context.getResources().getDrawable(R.drawable.current_time_line);
        this.f75209e = layerDrawable.findDrawableByLayerId(R.id.circle);
        this.f75210f = layerDrawable.findDrawableByLayerId(R.id.line);
        this.f75206b = UIUtils.dp2px(context, (float) this.f75206b);
        int dp2px = UIUtils.dp2px(context, (float) this.f75207c);
        this.f75207c = dp2px;
        this.f75208d = (this.f75206b - dp2px) / 2;
        this.f75212h = new Rect();
        this.f75214j = new CalendarDate(this.f75215k);
    }

    /* renamed from: a */
    public void mo108728a(String str) {
        if (C30022a.f74883b.mo112695c()) {
            if (!TextUtils.isEmpty(str)) {
                this.f75215k = TimeZone.getTimeZone(str);
            }
            mo108729a(this.f75215k);
        }
    }

    /* renamed from: a */
    public void mo108729a(TimeZone timeZone) {
        if (timeZone == null) {
            this.f75215k = TimeZone.getDefault();
        }
        this.f75215k = timeZone;
        this.f75214j = new CalendarDate(timeZone);
        m111738b();
    }

    public CurrentTimeLine(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m111734a();
        m111735a(context);
    }
}
