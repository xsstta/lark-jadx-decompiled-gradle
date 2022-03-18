package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* renamed from: com.haibin.calendarview.p */
public abstract class AbstractC23364p extends AbstractC23348c {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo81185a(Canvas canvas, Calendar calendar, int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo81186a(Canvas canvas, Calendar calendar, int i, boolean z, boolean z2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo81187a(Canvas canvas, Calendar calendar, int i, boolean z);

    public AbstractC23364p(Context context) {
        super(context);
    }

    public void onClick(View view) {
        Calendar index;
        if (!this.isClick || (index = getIndex()) == null) {
            return;
        }
        if (onCalendarIntercept(index)) {
            this.mDelegate.f57623d.mo81029a(index, true);
        } else if (isInRange(index)) {
            this.mCurrentItem = this.mItems.indexOf(index);
            if (this.mDelegate.f57628i != null) {
                this.mDelegate.f57628i.mo81025b(index, true);
            }
            if (this.mParentLayout != null) {
                this.mParentLayout.mo80945b(C23349d.m84777a(index, this.mDelegate.mo81129X()));
            }
            if (this.mDelegate.f57624e != null) {
                this.mDelegate.f57624e.mo40118a(index, true);
            }
            invalidate();
        } else if (this.mDelegate.f57624e != null) {
            this.mDelegate.f57624e.mo40117a(index);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        int i;
        if (this.mItems.size() != 0) {
            this.mItemWidth = (getWidth() - (this.mDelegate.ae() * 2)) / 7;
            onPreviewHook();
            for (int i2 = 0; i2 < 7; i2++) {
                int ae = (this.mItemWidth * i2) + this.mDelegate.ae();
                mo81097a(ae);
                Calendar calendar = (Calendar) this.mItems.get(i2);
                if (i2 == this.mCurrentItem) {
                    z = true;
                } else {
                    z = false;
                }
                boolean hasScheme = calendar.hasScheme();
                if (hasScheme) {
                    if (z) {
                        z2 = mo81187a(canvas, calendar, ae, true);
                    } else {
                        z2 = false;
                    }
                    if (z2 || !z) {
                        Paint paint = this.mSchemePaint;
                        if (calendar.getSchemeColor() != 0) {
                            i = calendar.getSchemeColor();
                        } else {
                            i = this.mDelegate.mo81171m();
                        }
                        paint.setColor(i);
                        mo81185a(canvas, calendar, ae);
                    }
                } else if (z) {
                    mo81187a(canvas, calendar, ae, false);
                }
                mo81186a(canvas, calendar, ae, hasScheme, z);
            }
        }
    }

    public boolean onLongClick(View view) {
        Calendar index;
        if (this.mDelegate.f57627h == null || !this.isClick || (index = getIndex()) == null) {
            return false;
        }
        if (onCalendarIntercept(index)) {
            this.mDelegate.f57623d.mo81029a(index, true);
            return true;
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
            this.mDelegate.f57635p = this.mDelegate.f57634o;
            if (this.mDelegate.f57628i != null) {
                this.mDelegate.f57628i.mo81025b(index, true);
            }
            if (this.mParentLayout != null) {
                this.mParentLayout.mo80945b(C23349d.m84777a(index, this.mDelegate.mo81129X()));
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
}
