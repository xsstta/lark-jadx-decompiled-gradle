package com.ss.android.lark.calendar.impl.utils;

import android.text.format.Time;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RepeatMode implements Serializable {
    private static final long serialVersionUID = 1;
    private List<Integer> mCustomerByMonthDay;
    private String mCustomerByMonthWeekDay;
    private String mCustomerByMonthWeekNo;
    private List<Integer> mCustomerByWeek;
    private int mFrequency;
    private int mInterval;
    private boolean mIsMonthDaySingle;
    private String[] mMonthlyDay;
    private int mRepeatType;
    private CalendarDate mUntilDate;
    private String[] mWeekNo;
    private String[] mWeeks;

    private int getWeekDayValue(int i) {
        switch (i) {
            case 0:
                return 65536;
            case 1:
                return 131072;
            case 2:
                return 262144;
            case 3:
                return 524288;
            case 4:
                return 1048576;
            case 5:
                return 2097152;
            case 6:
                return 4194304;
            default:
                return -1;
        }
    }

    private int setWeekDayValue(int i) {
        if (i == 65536) {
            return 0;
        }
        if (i == 131072) {
            return 1;
        }
        if (i == 262144) {
            return 2;
        }
        if (i == 524288) {
            return 3;
        }
        if (i == 1048576) {
            return 4;
        }
        if (i != 2097152) {
            return i != 4194304 ? -1 : 6;
        }
        return 5;
    }

    public List<Integer> getCustomerByMonthDayList() {
        return this.mCustomerByMonthDay;
    }

    public List<Integer> getCustomerByWeekList() {
        return this.mCustomerByWeek;
    }

    public boolean getMonthDaySingle() {
        return this.mIsMonthDaySingle;
    }

    public int getRepeatType() {
        return this.mRepeatType;
    }

    public RepeatMode() {
        initData();
    }

    private void initData() {
        this.mWeeks = C32634ae.m125183c(R.array.weekly);
        this.mWeekNo = C32634ae.m125183c(R.array.week_no);
        this.mMonthlyDay = C32634ae.m125183c(R.array.custom_repeat_days);
    }

    public void clearRule() {
        this.mRepeatType = 0;
        this.mFrequency = 0;
        this.mInterval = 0;
        this.mCustomerByWeek = null;
        this.mCustomerByMonthDay = null;
        this.mCustomerByMonthWeekDay = "";
        this.mCustomerByMonthWeekNo = "";
    }

    public String toString() {
        return "repeatType: " + this.mRepeatType + " mFrequency: " + this.mFrequency + " mInterval: " + this.mInterval;
    }

    public EventRecurrence toER() {
        int i;
        int i2;
        EventRecurrence eventRecurrence = new EventRecurrence();
        eventRecurrence.f83696e = this.mFrequency;
        eventRecurrence.f83699h = this.mInterval;
        switch (this.mRepeatType) {
            case 6:
            case 8:
                if (CollectionUtils.isNotEmpty(this.mCustomerByWeek)) {
                    i = this.mCustomerByWeek.size();
                } else {
                    i = 0;
                }
                eventRecurrence.f83709r = i;
                eventRecurrence.f83707p = new int[eventRecurrence.f83709r];
                eventRecurrence.f83708q = new int[eventRecurrence.f83709r];
                for (int i3 = 0; i3 < eventRecurrence.f83709r; i3++) {
                    eventRecurrence.f83708q[i3] = 0;
                    eventRecurrence.f83707p[i3] = getWeekDayValue(this.mCustomerByWeek.get(i3).intValue());
                }
                break;
            case 9:
                if (CollectionUtils.isNotEmpty(this.mCustomerByMonthDay)) {
                    i2 = this.mCustomerByMonthDay.size();
                } else {
                    i2 = 0;
                }
                eventRecurrence.f83711t = i2;
                eventRecurrence.f83710s = new int[eventRecurrence.f83711t];
                for (int i4 = 0; i4 < eventRecurrence.f83711t; i4++) {
                    eventRecurrence.f83710s[i4] = this.mCustomerByMonthDay.get(i4).intValue();
                }
                break;
            case 10:
                eventRecurrence.f83709r = 1;
                eventRecurrence.f83707p = new int[1];
                eventRecurrence.f83708q = new int[1];
                eventRecurrence.f83708q[0] = getDayNum(this.mCustomerByMonthWeekNo);
                eventRecurrence.f83707p[0] = getWeekDayValue(this.mCustomerByMonthWeekDay);
                break;
        }
        if (this.mUntilDate != null) {
            Time time = new Time();
            time.set(this.mUntilDate.getMonthDay(), this.mUntilDate.getMonth() - 1, this.mUntilDate.getYear());
            eventRecurrence.f83697f = time.format2445();
        }
        return eventRecurrence;
    }

    public void setCustomerByMonthWeekDay(String str) {
        this.mCustomerByMonthWeekDay = str;
    }

    public void setCustomerByMonthWeekNo(String str) {
        this.mCustomerByMonthWeekNo = str;
    }

    public void setInterval(int i) {
        this.mInterval = i;
    }

    public void setMonthDaySingle(boolean z) {
        this.mIsMonthDaySingle = z;
    }

    public String getWeekDay(int i) {
        if (i < 0) {
            return "";
        }
        String[] strArr = this.mWeeks;
        if (i >= strArr.length) {
            return "";
        }
        return strArr[i];
    }

    public String getWeekNo(int i) {
        if (i < 0) {
            return "";
        }
        String[] strArr = this.mWeekNo;
        if (i >= strArr.length) {
            return "";
        }
        return strArr[i];
    }

    public void removeMonthList(int i) {
        List<Integer> list = this.mCustomerByMonthDay;
        if (list != null) {
            list.remove(new Integer(i));
        }
    }

    public void removeWeekList(int i) {
        List<Integer> list = this.mCustomerByWeek;
        if (list != null) {
            list.remove(new Integer(i));
        }
    }

    private int getDayNum(String str) {
        int i = 0;
        while (true) {
            String[] strArr = this.mWeekNo;
            if (i >= strArr.length) {
                return -1;
            }
            if (strArr[i].equals(str)) {
                return i + 1;
            }
            i++;
        }
    }

    private int getWeekDayValue(String str) {
        int i = 0;
        while (true) {
            String[] strArr = this.mWeeks;
            if (i >= strArr.length) {
                return -1;
            }
            if (strArr[i].equals(str)) {
                return getWeekDayValue(i);
            }
            i++;
        }
    }

    public boolean containsMonthDay(int i) {
        if (CollectionUtils.isEmpty(this.mCustomerByMonthDay)) {
            return false;
        }
        return this.mCustomerByMonthDay.contains(Integer.valueOf(i));
    }

    public boolean containsWeekDay(int i) {
        if (CollectionUtils.isEmpty(this.mCustomerByWeek)) {
            return false;
        }
        return this.mCustomerByWeek.contains(Integer.valueOf(i));
    }

    public void addMonthList(int i) {
        if (this.mCustomerByMonthDay == null) {
            this.mCustomerByMonthDay = new ArrayList();
        }
        if (!this.mCustomerByMonthDay.contains(Integer.valueOf(i))) {
            this.mCustomerByMonthDay.add(Integer.valueOf(i));
            Collections.sort(this.mCustomerByMonthDay);
        }
    }

    public void addWeekList(int i) {
        if (this.mCustomerByWeek == null) {
            this.mCustomerByWeek = new ArrayList();
        }
        if (!this.mCustomerByWeek.contains(Integer.valueOf(i))) {
            this.mCustomerByWeek.add(Integer.valueOf(i));
            Collections.sort(this.mCustomerByWeek);
        }
    }

    public void setRepeatType(int i) {
        this.mRepeatType = i;
        switch (i) {
            case 1:
                this.mFrequency = 4;
                return;
            case 2:
                this.mFrequency = 5;
                return;
            case 3:
                this.mFrequency = 5;
                return;
            case 4:
                this.mFrequency = 6;
                return;
            case 5:
                this.mFrequency = 7;
                return;
            case 6:
                this.mFrequency = 5;
                this.mCustomerByWeek = new ArrayList();
                for (int i2 = 1; i2 < 6; i2++) {
                    this.mCustomerByWeek.add(Integer.valueOf(i2));
                }
                return;
            case 7:
                this.mFrequency = 4;
                return;
            case 8:
                this.mFrequency = 5;
                return;
            case 9:
                this.mFrequency = 6;
                return;
            case 10:
                this.mFrequency = 6;
                return;
            case 11:
                this.mFrequency = 7;
                return;
            default:
                return;
        }
    }

    public RepeatMode(EventRecurrence eventRecurrence) {
        initData();
        this.mFrequency = eventRecurrence.f83696e;
        int i = eventRecurrence.f83699h;
        this.mInterval = i;
        int i2 = this.mFrequency;
        if (i2 != 4) {
            int i3 = 0;
            if (i2 == 5) {
                if (eventRecurrence.f83709r > 0) {
                    this.mRepeatType = 8;
                    this.mCustomerByWeek = new ArrayList();
                    for (int i4 = 0; i4 < eventRecurrence.f83709r; i4++) {
                        this.mCustomerByWeek.add(Integer.valueOf(setWeekDayValue(eventRecurrence.f83707p[i4])));
                    }
                    if (this.mCustomerByWeek.size() == 5) {
                        Collections.sort(this.mCustomerByWeek);
                        while (i3 < 5) {
                            int i5 = i3 + 1;
                            if (this.mCustomerByWeek.get(i3).intValue() != i5) {
                                break;
                            }
                            i3 = i5;
                        }
                        if (i3 == 5) {
                            this.mRepeatType = 6;
                        }
                    }
                } else {
                    int i6 = this.mInterval;
                    if (i6 <= 1) {
                        this.mRepeatType = 2;
                    } else if (i6 == 2) {
                        this.mRepeatType = 3;
                    } else {
                        this.mRepeatType = 8;
                    }
                }
            } else if (i2 == 6) {
                if (eventRecurrence.f83709r > 0) {
                    this.mRepeatType = 10;
                    int i7 = eventRecurrence.f83708q[0] - 1;
                    this.mCustomerByMonthWeekNo = this.mWeekNo[i7 < 0 ? 0 : i7];
                    this.mCustomerByMonthWeekDay = this.mWeeks[setWeekDayValue(eventRecurrence.f83707p[0])];
                } else if (eventRecurrence.f83711t > 0) {
                    this.mRepeatType = 9;
                    this.mCustomerByMonthDay = new ArrayList();
                    while (i3 < eventRecurrence.f83711t) {
                        this.mCustomerByMonthDay.add(Integer.valueOf(eventRecurrence.f83710s[i3]));
                        i3++;
                    }
                } else {
                    this.mRepeatType = 4;
                }
            } else if (i2 == 7) {
                if (i <= 1) {
                    this.mRepeatType = 5;
                } else {
                    this.mRepeatType = 11;
                }
            }
        } else if (i <= 1) {
            this.mRepeatType = 1;
        } else {
            this.mRepeatType = 7;
        }
        if (eventRecurrence.f83697f != null) {
            Time time = new Time();
            time.parse(eventRecurrence.f83697f);
            this.mUntilDate = new CalendarDate(time.year, time.month + 1, time.monthDay, time.hour, time.minute, 0);
        }
    }
}
