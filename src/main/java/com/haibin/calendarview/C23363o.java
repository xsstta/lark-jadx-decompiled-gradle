package com.haibin.calendarview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;

/* renamed from: com.haibin.calendarview.o */
public class C23363o extends LinearLayout {
    private C23350e mDelegate;

    /* access modifiers changed from: protected */
    public void onDateSelected(Calendar calendar, int i, boolean z) {
    }

    public C23363o(Context context) {
        super(context);
        if ("com.haibin.calendarview.WeekBar".equals(getClass().getName())) {
            LayoutInflater.from(context).inflate(R.layout.cv_week_bar, (ViewGroup) this, true);
        }
    }

    /* access modifiers changed from: protected */
    public void setTextColor(int i) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((TextView) getChildAt(i2)).setTextColor(i);
        }
    }

    /* access modifiers changed from: protected */
    public void setTextSize(int i) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((TextView) getChildAt(i2)).setTextSize(0, (float) i);
        }
    }

    /* access modifiers changed from: protected */
    public void onWeekStartChange(int i) {
        if ("com.haibin.calendarview.WeekBar".equalsIgnoreCase(getClass().getName())) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                ((TextView) getChildAt(i2)).setText(getWeekString(i2, i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setup(C23350e eVar) {
        this.mDelegate = eVar;
        if ("com.haibin.calendarview.WeekBar".equalsIgnoreCase(getClass().getName())) {
            setTextSize(this.mDelegate.mo81130Y());
            setTextColor(eVar.mo81161d());
            setBackgroundColor(eVar.mo81173o());
            setPadding(eVar.ae(), 0, eVar.ae(), 0);
        }
    }

    /* access modifiers changed from: protected */
    public int getViewIndexByCalendar(Calendar calendar, int i) {
        int week = calendar.getWeek() + 1;
        if (i == 1) {
            return week - 1;
        }
        if (i == 2) {
            if (week == 1) {
                return 6;
            }
            return week - 2;
        } else if (week == 7) {
            return 0;
        } else {
            return week;
        }
    }

    private String getWeekString(int i, int i2) {
        int i3;
        String[] stringArray = getContext().getResources().getStringArray(R.array.week_string_array);
        if (i2 == 1) {
            return stringArray[i];
        }
        int i4 = 6;
        if (i2 == 2) {
            if (i == 6) {
                i3 = 0;
            } else {
                i3 = i + 1;
            }
            return stringArray[i3];
        }
        if (i != 0) {
            i4 = i - 1;
        }
        return stringArray[i4];
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        C23350e eVar = this.mDelegate;
        if (eVar != null) {
            i3 = View.MeasureSpec.makeMeasureSpec(eVar.mo81182x(), 1073741824);
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(C23349d.m84776a(getContext(), 40.0f), 1073741824);
        }
        super.onMeasure(i, i3);
    }
}
