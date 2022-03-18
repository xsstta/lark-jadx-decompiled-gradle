package com.haibin.calendarview;

import android.content.Context;
import android.view.View;

/* renamed from: com.haibin.calendarview.a */
public abstract class AbstractC23343a extends BaseView {
    protected int mHeight;
    protected int mLineCount;
    protected int mMonth;
    MonthViewPager mMonthViewPager;
    protected int mNextDiff;
    protected int mYear;

    /* access modifiers changed from: protected */
    @Override // com.haibin.calendarview.BaseView
    public void onDestroy() {
    }

    /* access modifiers changed from: protected */
    public void onLoopStart(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    @Override // com.haibin.calendarview.BaseView
    public void onPreviewHook() {
    }

    /* access modifiers changed from: protected */
    public Calendar getIndex() {
        if (!(this.mItemWidth == 0 || this.mItemHeight == 0)) {
            int ae = ((int) (this.mX - ((float) this.mDelegate.ae()))) / this.mItemWidth;
            if (ae >= 7) {
                ae = 6;
            }
            int i = ((((int) this.mY) / this.mItemHeight) * 7) + ae;
            if (i >= 0 && i < this.mItems.size()) {
                return (Calendar) this.mItems.get(i);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @Override // com.haibin.calendarview.BaseView
    public void updateItemHeight() {
        super.updateItemHeight();
        if (this.mDelegate.mo81125T() == 0) {
            this.mHeight = this.mItemHeight * this.mLineCount;
        } else {
            this.mHeight = C23349d.m84773a(this.mYear, this.mMonth, this.mItemHeight, this.mDelegate.mo81129X());
        }
    }

    /* access modifiers changed from: package-private */
    public final void updateShowMode() {
        if (this.mDelegate.mo81125T() == 0) {
            this.mLineCount = 6;
            this.mHeight = this.mItemHeight * this.mLineCount;
        } else {
            this.mHeight = C23349d.m84773a(this.mYear, this.mMonth, this.mItemHeight, this.mDelegate.mo81129X());
        }
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public final void updateWeekStart() {
        initCalendar();
        if (this.mDelegate.mo81125T() == 0) {
            this.mHeight = this.mItemHeight * this.mLineCount;
        } else {
            this.mHeight = C23349d.m84773a(this.mYear, this.mMonth, this.mItemHeight, this.mDelegate.mo81129X());
        }
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

    private void initCalendar() {
        this.mNextDiff = C23349d.m84789b(this.mYear, this.mMonth, this.mDelegate.mo81129X());
        int a = C23349d.m84772a(this.mYear, this.mMonth, this.mDelegate.mo81129X());
        int a2 = C23349d.m84771a(this.mYear, this.mMonth);
        this.mItems = C23349d.m84782a(this.mYear, this.mMonth, this.mDelegate.ad(), this.mDelegate.mo81129X());
        if (this.mItems.contains(this.mDelegate.ad())) {
            this.mCurrentItem = this.mItems.indexOf(this.mDelegate.ad());
        } else {
            this.mCurrentItem = this.mItems.indexOf(this.mDelegate.f57634o);
        }
        if (this.mCurrentItem > 0 && this.mDelegate.f57623d != null && this.mDelegate.f57623d.mo81030a(this.mDelegate.f57634o)) {
            this.mCurrentItem = -1;
        }
        if (this.mDelegate.mo81125T() == 0) {
            this.mLineCount = 6;
        } else {
            this.mLineCount = ((a + a2) + this.mNextDiff) / 7;
        }
        addSchemesFromMap();
        invalidate();
    }

    public AbstractC23343a(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final int getSelectedIndex(Calendar calendar) {
        return this.mItems.indexOf(calendar);
    }

    /* access modifiers changed from: package-private */
    public final void setSelectedCalendar(Calendar calendar) {
        this.mCurrentItem = this.mItems.indexOf(calendar);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.mLineCount != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.mHeight, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: package-private */
    public final void initMonthWithDate(int i, int i2) {
        this.mYear = i;
        this.mMonth = i2;
        initCalendar();
        if (this.mDelegate.mo81125T() == 0) {
            this.mHeight = this.mItemHeight * this.mLineCount;
        } else {
            this.mHeight = C23349d.m84773a(i, i2, this.mItemHeight, this.mDelegate.mo81129X());
        }
    }
}
