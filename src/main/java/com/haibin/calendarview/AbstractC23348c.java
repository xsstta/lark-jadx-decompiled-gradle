package com.haibin.calendarview;

import android.content.Context;
import android.view.View;
import java.util.Calendar;

/* renamed from: com.haibin.calendarview.c */
public abstract class AbstractC23348c extends BaseView {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81097a(int i) {
    }

    /* access modifiers changed from: protected */
    @Override // com.haibin.calendarview.BaseView
    public void onDestroy() {
    }

    /* access modifiers changed from: protected */
    @Override // com.haibin.calendarview.BaseView
    public void onPreviewHook() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo81096a() {
        invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo81101c() {
        if (!this.mItems.contains(this.mDelegate.f57634o)) {
            this.mCurrentItem = -1;
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo81100b() {
        Calendar b = C23349d.m84793b(this.mDelegate.mo81183y(), this.mDelegate.mo81109D(), this.mDelegate.ah(), ((Integer) getTag()).intValue() + 1, this.mDelegate.mo81129X());
        setSelectedCalendar(this.mDelegate.f57634o);
        setup(b);
    }

    /* access modifiers changed from: protected */
    public Calendar getIndex() {
        int ae = ((int) (this.mX - ((float) this.mDelegate.ae()))) / this.mItemWidth;
        if (ae >= 7) {
            ae = 6;
        }
        int i = ((((int) this.mY) / this.mItemHeight) * 7) + ae;
        if (i < 0 || i >= this.mItems.size()) {
            return null;
        }
        return (Calendar) this.mItems.get(i);
    }

    /* access modifiers changed from: package-private */
    @Override // com.haibin.calendarview.BaseView
    public void updateCurrentDate() {
        if (this.mItems != null) {
            if (this.mItems.contains(this.mDelegate.ad())) {
                for (Calendar calendar : this.mItems) {
                    calendar.setCurrentDay(false);
                }
                ((Calendar) this.mItems.get(this.mItems.indexOf(this.mDelegate.ad()))).setCurrentDay(true);
            }
            invalidate();
        }
    }

    public AbstractC23348c(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    public final void setSelectedCalendar(Calendar calendar) {
        if (this.mDelegate.mo81131Z() != 1 || calendar.equals(this.mDelegate.f57634o)) {
            this.mCurrentItem = this.mItems.indexOf(calendar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void setup(Calendar calendar) {
        this.mItems = C23349d.m84783a(calendar, this.mDelegate, this.mDelegate.mo81129X());
        addSchemesFromMap();
        invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo81095a(boolean z) {
        for (int i = 0; i < this.mItems.size(); i++) {
            boolean isInRange = isInRange((Calendar) this.mItems.get(i));
            if (z && isInRange) {
                return i;
            }
            if (!(z || isInRange)) {
                return i - 1;
            }
        }
        if (z) {
            return 6;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo81099a(Calendar calendar) {
        Calendar instance = Calendar.getInstance();
        instance.set(this.mDelegate.mo81183y(), this.mDelegate.mo81109D() - 1, this.mDelegate.ah());
        long timeInMillis = instance.getTimeInMillis();
        instance.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay());
        if (instance.getTimeInMillis() < timeInMillis) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.mItemHeight, 1073741824));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo81098a(Calendar calendar, boolean z) {
        if (this.mParentLayout != null && this.mDelegate.f57628i != null && this.mItems != null && this.mItems.size() != 0) {
            int c = C23349d.m84796c(calendar, this.mDelegate.mo81129X());
            if (this.mItems.contains(this.mDelegate.ad())) {
                c = C23349d.m84796c(this.mDelegate.ad(), this.mDelegate.mo81129X());
            }
            Calendar calendar2 = (Calendar) this.mItems.get(c);
            if (this.mDelegate.mo81131Z() != 0) {
                if (this.mItems.contains(this.mDelegate.f57634o)) {
                    calendar2 = this.mDelegate.f57634o;
                } else {
                    this.mCurrentItem = -1;
                }
            }
            if (!isInRange(calendar2)) {
                c = mo81095a(mo81099a(calendar2));
                calendar2 = (Calendar) this.mItems.get(c);
            }
            calendar2.setCurrentDay(calendar2.equals(this.mDelegate.ad()));
            this.mDelegate.f57628i.mo81025b(calendar2, false);
            this.mParentLayout.mo80945b(C23349d.m84777a(calendar2, this.mDelegate.mo81129X()));
            if (this.mDelegate.f57624e != null && z && this.mDelegate.mo81131Z() == 0) {
                this.mDelegate.f57624e.mo40118a(calendar2, false);
            }
            this.mParentLayout.mo80941a();
            if (this.mDelegate.mo81131Z() == 0) {
                this.mCurrentItem = c;
            }
            if (!(this.mDelegate.f57620a || this.mDelegate.f57635p == null || calendar.getYear() == this.mDelegate.f57635p.getYear() || this.mDelegate.f57629j == null)) {
                this.mDelegate.f57629j.mo81037a(this.mDelegate.f57635p.getYear());
            }
            this.mDelegate.f57635p = calendar2;
            invalidate();
        }
    }
}
