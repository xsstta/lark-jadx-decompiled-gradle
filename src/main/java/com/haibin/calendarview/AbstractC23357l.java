package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* renamed from: com.haibin.calendarview.l */
public abstract class AbstractC23357l extends AbstractC23343a {
    /* access modifiers changed from: protected */
    public abstract void onDrawScheme(Canvas canvas, Calendar calendar, int i, int i2);

    /* access modifiers changed from: protected */
    public abstract boolean onDrawSelected(Canvas canvas, Calendar calendar, int i, int i2, boolean z);

    /* access modifiers changed from: protected */
    public abstract void onDrawText(Canvas canvas, Calendar calendar, int i, int i2, boolean z, boolean z2);

    public AbstractC23357l(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.mLineCount != 0) {
            this.mItemWidth = (getWidth() - (this.mDelegate.ae() * 2)) / 7;
            onPreviewHook();
            int i = this.mLineCount * 7;
            int i2 = 0;
            int i3 = 0;
            while (i3 < this.mLineCount) {
                int i4 = i2;
                for (int i5 = 0; i5 < 7; i5++) {
                    Calendar calendar = (Calendar) this.mItems.get(i4);
                    if (this.mDelegate.mo81125T() == 1) {
                        if (i4 > this.mItems.size() - this.mNextDiff) {
                            return;
                        }
                        if (!calendar.isCurrentMonth()) {
                            i4++;
                        }
                    } else if (this.mDelegate.mo81125T() == 2 && i4 >= i) {
                        return;
                    }
                    draw(canvas, calendar, i3, i5, i4);
                    i4++;
                }
                i3++;
                i2 = i4;
            }
        }
    }

    public void onClick(View view) {
        Calendar index;
        int i;
        if (!this.isClick || (index = getIndex()) == null) {
            return;
        }
        if (this.mDelegate.mo81125T() == 1 && !index.isCurrentMonth()) {
            return;
        }
        if (onCalendarIntercept(index)) {
            this.mDelegate.f57623d.mo81029a(index, true);
        } else if (isInRange(index)) {
            this.mCurrentItem = this.mItems.indexOf(index);
            if (!index.isCurrentMonth() && this.mMonthViewPager != null) {
                int currentItem = this.mMonthViewPager.getCurrentItem();
                if (this.mCurrentItem < 7) {
                    i = currentItem - 1;
                } else {
                    i = currentItem + 1;
                }
                this.mMonthViewPager.setCurrentItem(i);
            }
            if (this.mDelegate.f57628i != null) {
                this.mDelegate.f57628i.mo81024a(index, true);
            }
            if (this.mParentLayout != null) {
                if (index.isCurrentMonth()) {
                    this.mParentLayout.mo80942a(this.mItems.indexOf(index));
                } else {
                    this.mParentLayout.mo80945b(C23349d.m84777a(index, this.mDelegate.mo81129X()));
                }
            }
            if (this.mDelegate.f57624e != null) {
                this.mDelegate.f57624e.mo40118a(index, true);
            }
        } else if (this.mDelegate.f57624e != null) {
            this.mDelegate.f57624e.mo40117a(index);
        }
    }

    public boolean onLongClick(View view) {
        Calendar index;
        int i;
        if (this.mDelegate.f57627h == null || !this.isClick || (index = getIndex()) == null) {
            return false;
        }
        if (this.mDelegate.mo81125T() == 1 && !index.isCurrentMonth()) {
            return false;
        }
        if (onCalendarIntercept(index)) {
            this.mDelegate.f57623d.mo81029a(index, true);
            return false;
        } else if (!isInRange(index)) {
            if (this.mDelegate.f57627h != null) {
                this.mDelegate.f57627h.mo81031a(index);
            }
            return true;
        } else if (this.mDelegate.af()) {
            if (this.mDelegate.f57627h != null) {
                this.mDelegate.f57627h.mo81032b(index);
            }
            return true;
        } else {
            this.mCurrentItem = this.mItems.indexOf(index);
            if (!index.isCurrentMonth() && this.mMonthViewPager != null) {
                int currentItem = this.mMonthViewPager.getCurrentItem();
                if (this.mCurrentItem < 7) {
                    i = currentItem - 1;
                } else {
                    i = currentItem + 1;
                }
                this.mMonthViewPager.setCurrentItem(i);
            }
            if (this.mDelegate.f57628i != null) {
                this.mDelegate.f57628i.mo81024a(index, true);
            }
            if (this.mParentLayout != null) {
                if (index.isCurrentMonth()) {
                    this.mParentLayout.mo80942a(this.mItems.indexOf(index));
                } else {
                    this.mParentLayout.mo80945b(C23349d.m84777a(index, this.mDelegate.mo81129X()));
                }
            }
            if (this.mDelegate.f57624e != null) {
                this.mDelegate.f57624e.mo40118a(index, true);
            }
            if (this.mDelegate.f57627h != null) {
                this.mDelegate.f57627h.mo81032b(index);
            }
            invalidate();
            return true;
        }
    }

    private void draw(Canvas canvas, Calendar calendar, int i, int i2, int i3) {
        boolean z;
        int i4;
        int ae = (i2 * this.mItemWidth) + this.mDelegate.ae();
        int i5 = i * this.mItemHeight;
        onLoopStart(ae, i5);
        boolean z2 = false;
        if (i3 == this.mCurrentItem) {
            z = true;
        } else {
            z = false;
        }
        boolean hasScheme = calendar.hasScheme();
        if (hasScheme) {
            if (z) {
                z2 = onDrawSelected(canvas, calendar, ae, i5, true);
            }
            if (z2 || !z) {
                Paint paint = this.mSchemePaint;
                if (calendar.getSchemeColor() != 0) {
                    i4 = calendar.getSchemeColor();
                } else {
                    i4 = this.mDelegate.mo81171m();
                }
                paint.setColor(i4);
                onDrawScheme(canvas, calendar, ae, i5);
            }
        } else if (z) {
            onDrawSelected(canvas, calendar, ae, i5, false);
        }
        onDrawText(canvas, calendar, ae, i5, hasScheme, z);
    }
}
