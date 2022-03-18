package com.bytedance.ee.bear.reminder.calendar;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ee.util.io.NonProguard;
import com.haibin.calendarview.C23363o;
import com.haibin.calendarview.Calendar;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

public class ReminderWeekBar extends C23363o implements NonProguard {
    private int mPreSelectedIndex;
    private List<Integer> mWeeks = new ArrayList();

    private void initWeeks() {
        this.mWeeks.add(Integer.valueOf((int) R.string.Doc_Reminder_Sunday));
        this.mWeeks.add(Integer.valueOf((int) R.string.Doc_Reminder_Monday));
        this.mWeeks.add(Integer.valueOf((int) R.string.Doc_Reminder_Tuesday));
        this.mWeeks.add(Integer.valueOf((int) R.string.Doc_Reminder_Wedsday));
        this.mWeeks.add(Integer.valueOf((int) R.string.Doc_Reminder_Thursday));
        this.mWeeks.add(Integer.valueOf((int) R.string.Doc_Reminder_Friday));
        this.mWeeks.add(Integer.valueOf((int) R.string.Doc_Reminder_Saturday));
    }

    public ReminderWeekBar(Context context) {
        super(context);
        initWeeks();
        LayoutInflater.from(context).inflate(R.layout.weekbar_layout, (ViewGroup) this, true);
    }

    /* access modifiers changed from: protected */
    @Override // com.haibin.calendarview.C23363o
    public void onWeekStartChange(int i) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((TextView) getChildAt(i2)).setText(getWeekString(i2, i));
        }
    }

    private String getWeekString(int i, int i2) {
        int i3;
        if (i2 == 1) {
            return getResources().getString(this.mWeeks.get(i).intValue());
        }
        if (i2 == 2) {
            return getResources().getString(this.mWeeks.get(i + 1).intValue());
        }
        if (i2 != 7) {
            return getResources().getString(this.mWeeks.get(i).intValue());
        }
        Resources resources = getResources();
        if (i == 0) {
            i3 = 6;
        } else {
            i3 = i - 1;
        }
        return resources.getString(i3);
    }

    /* access modifiers changed from: protected */
    @Override // com.haibin.calendarview.C23363o
    public void onDateSelected(Calendar calendar, int i, boolean z) {
        getChildAt(this.mPreSelectedIndex).setSelected(false);
        int viewIndexByCalendar = getViewIndexByCalendar(calendar, i);
        getChildAt(viewIndexByCalendar).setSelected(true);
        this.mPreSelectedIndex = viewIndexByCalendar;
    }
}
