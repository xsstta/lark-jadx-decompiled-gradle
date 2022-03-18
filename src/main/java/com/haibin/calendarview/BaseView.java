package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;

public abstract class BaseView extends View implements View.OnClickListener, View.OnLongClickListener {
    boolean isClick;
    protected Paint mCurDayLunarTextPaint;
    protected Paint mCurDayTextPaint;
    protected Paint mCurMonthLunarTextPaint;
    protected Paint mCurMonthTextPaint;
    int mCurrentItem;
    C23350e mDelegate;
    protected int mItemHeight;
    protected int mItemWidth;
    List<Calendar> mItems;
    protected Paint mOtherMonthLunarTextPaint;
    protected Paint mOtherMonthTextPaint;
    CalendarLayout mParentLayout;
    protected Paint mSchemeLunarTextPaint;
    protected Paint mSchemePaint;
    protected Paint mSchemeTextPaint;
    protected Paint mSelectTextPaint;
    protected Paint mSelectedLunarTextPaint;
    protected Paint mSelectedPaint;
    protected float mTextBaseLine;
    float mX;
    float mY;

    /* access modifiers changed from: protected */
    public void initPaint() {
    }

    /* access modifiers changed from: protected */
    public abstract void onDestroy();

    /* access modifiers changed from: protected */
    public void onPreviewHook() {
    }

    /* access modifiers changed from: package-private */
    public abstract void updateCurrentDate();

    /* access modifiers changed from: package-private */
    public final void update() {
        if (this.mDelegate.f57622c == null || this.mDelegate.f57622c.size() == 0) {
            removeSchemes();
            invalidate();
            return;
        }
        addSchemesFromMap();
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public final void removeSchemes() {
        for (Calendar calendar : this.mItems) {
            calendar.setScheme("");
            calendar.setSchemeColor(0);
            calendar.setSchemes(null);
        }
    }

    /* access modifiers changed from: package-private */
    public void updateItemHeight() {
        this.mItemHeight = this.mDelegate.mo81108C();
        Paint.FontMetrics fontMetrics = this.mCurMonthTextPaint.getFontMetrics();
        this.mTextBaseLine = (((float) (this.mItemHeight / 2)) - fontMetrics.descent) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f);
    }

    /* access modifiers changed from: package-private */
    public final void addSchemesFromMap() {
        String str;
        if (!(this.mDelegate.f57622c == null || this.mDelegate.f57622c.size() == 0)) {
            for (Calendar calendar : this.mItems) {
                if (this.mDelegate.f57622c.containsKey(calendar.toString())) {
                    Calendar calendar2 = this.mDelegate.f57622c.get(calendar.toString());
                    if (TextUtils.isEmpty(calendar2.getScheme())) {
                        str = this.mDelegate.mo81132a();
                    } else {
                        str = calendar2.getScheme();
                    }
                    calendar.setScheme(str);
                    calendar.setSchemeColor(calendar2.getSchemeColor());
                    calendar.setSchemes(calendar2.getSchemes());
                } else {
                    calendar.setScheme("");
                    calendar.setSchemeColor(0);
                    calendar.setSchemes(null);
                }
            }
        }
    }

    public BaseView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public final boolean isInRange(Calendar calendar) {
        C23350e eVar = this.mDelegate;
        if (eVar == null || !C23349d.m84788a(calendar, eVar)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean isSelected(Calendar calendar) {
        List<Calendar> list = this.mItems;
        if (list == null || list.indexOf(calendar) != this.mCurrentItem) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean onCalendarIntercept(Calendar calendar) {
        if (this.mDelegate.f57623d == null || !this.mDelegate.f57623d.mo81030a(calendar)) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mX = motionEvent.getX();
            this.mY = motionEvent.getY();
            this.isClick = true;
        } else if (action == 1) {
            this.mX = motionEvent.getX();
            this.mY = motionEvent.getY();
        } else if (action == 2 && this.isClick) {
            if (Math.abs(motionEvent.getY() - this.mY) <= 50.0f) {
                z = true;
            }
            this.isClick = z;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void setup(C23350e eVar) {
        this.mDelegate = eVar;
        this.mCurDayTextPaint.setColor(eVar.mo81153b());
        this.mCurDayLunarTextPaint.setColor(eVar.mo81157c());
        this.mCurMonthTextPaint.setColor(eVar.mo81166h());
        this.mOtherMonthTextPaint.setColor(eVar.mo81165g());
        this.mCurMonthLunarTextPaint.setColor(eVar.mo81169k());
        this.mSelectedLunarTextPaint.setColor(eVar.mo81168j());
        this.mSelectTextPaint.setColor(eVar.mo81167i());
        this.mOtherMonthLunarTextPaint.setColor(eVar.mo81170l());
        this.mSchemeLunarTextPaint.setColor(eVar.mo81164f());
        this.mSchemePaint.setColor(eVar.mo81171m());
        this.mSchemeTextPaint.setColor(eVar.mo81163e());
        this.mCurMonthTextPaint.setTextSize((float) eVar.mo81106A());
        this.mOtherMonthTextPaint.setTextSize((float) eVar.mo81106A());
        this.mCurDayTextPaint.setTextSize((float) eVar.mo81106A());
        this.mSchemeTextPaint.setTextSize((float) eVar.mo81106A());
        this.mSelectTextPaint.setTextSize((float) eVar.mo81106A());
        this.mCurMonthLunarTextPaint.setTextSize((float) eVar.mo81107B());
        this.mSelectedLunarTextPaint.setTextSize((float) eVar.mo81107B());
        this.mCurDayLunarTextPaint.setTextSize((float) eVar.mo81107B());
        this.mOtherMonthLunarTextPaint.setTextSize((float) eVar.mo81107B());
        this.mSchemeLunarTextPaint.setTextSize((float) eVar.mo81107B());
        this.mSelectedPaint.setStyle(Paint.Style.FILL);
        this.mSelectedPaint.setColor(eVar.mo81172n());
        updateItemHeight();
        initPaint();
    }

    private void initPaint(Context context) {
        this.mCurMonthTextPaint.setAntiAlias(true);
        this.mCurMonthTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mCurMonthTextPaint.setColor(-15658735);
        this.mCurMonthTextPaint.setFakeBoldText(true);
        this.mCurMonthTextPaint.setTextSize((float) C23349d.m84776a(context, 14.0f));
        this.mOtherMonthTextPaint.setAntiAlias(true);
        this.mOtherMonthTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mOtherMonthTextPaint.setColor(-1973791);
        this.mOtherMonthTextPaint.setFakeBoldText(true);
        this.mOtherMonthTextPaint.setTextSize((float) C23349d.m84776a(context, 14.0f));
        this.mCurMonthLunarTextPaint.setAntiAlias(true);
        this.mCurMonthLunarTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mSelectedLunarTextPaint.setAntiAlias(true);
        this.mSelectedLunarTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mOtherMonthLunarTextPaint.setAntiAlias(true);
        this.mOtherMonthLunarTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mSchemeLunarTextPaint.setAntiAlias(true);
        this.mSchemeLunarTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mSchemeTextPaint.setAntiAlias(true);
        this.mSchemeTextPaint.setStyle(Paint.Style.FILL);
        this.mSchemeTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mSchemeTextPaint.setColor(-1223853);
        this.mSchemeTextPaint.setFakeBoldText(true);
        this.mSchemeTextPaint.setTextSize((float) C23349d.m84776a(context, 14.0f));
        this.mSelectTextPaint.setAntiAlias(true);
        this.mSelectTextPaint.setStyle(Paint.Style.FILL);
        this.mSelectTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mSelectTextPaint.setColor(-1223853);
        this.mSelectTextPaint.setFakeBoldText(true);
        this.mSelectTextPaint.setTextSize((float) C23349d.m84776a(context, 14.0f));
        this.mSchemePaint.setAntiAlias(true);
        this.mSchemePaint.setStyle(Paint.Style.FILL);
        this.mSchemePaint.setStrokeWidth(2.0f);
        this.mSchemePaint.setColor(-1052689);
        this.mCurDayTextPaint.setAntiAlias(true);
        this.mCurDayTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mCurDayTextPaint.setColor(-65536);
        this.mCurDayTextPaint.setFakeBoldText(true);
        this.mCurDayTextPaint.setTextSize((float) C23349d.m84776a(context, 14.0f));
        this.mCurDayLunarTextPaint.setAntiAlias(true);
        this.mCurDayLunarTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mCurDayLunarTextPaint.setColor(-65536);
        this.mCurDayLunarTextPaint.setFakeBoldText(true);
        this.mCurDayLunarTextPaint.setTextSize((float) C23349d.m84776a(context, 14.0f));
        this.mSelectedPaint.setAntiAlias(true);
        this.mSelectedPaint.setStyle(Paint.Style.FILL);
        this.mSelectedPaint.setStrokeWidth(2.0f);
        setOnClickListener(this);
        setOnLongClickListener(this);
    }

    public BaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCurMonthTextPaint = new Paint();
        this.mOtherMonthTextPaint = new Paint();
        this.mCurMonthLunarTextPaint = new Paint();
        this.mSelectedLunarTextPaint = new Paint();
        this.mOtherMonthLunarTextPaint = new Paint();
        this.mSchemeLunarTextPaint = new Paint();
        this.mSchemePaint = new Paint();
        this.mSelectedPaint = new Paint();
        this.mSchemeTextPaint = new Paint();
        this.mSelectTextPaint = new Paint();
        this.mCurDayTextPaint = new Paint();
        this.mCurDayLunarTextPaint = new Paint();
        this.isClick = true;
        this.mCurrentItem = -1;
        initPaint(context);
    }
}
