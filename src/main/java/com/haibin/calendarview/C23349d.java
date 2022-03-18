package com.haibin.calendarview;

import android.content.Context;
import com.ss.ttm.player.MediaPlayer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.haibin.calendarview.d */
public final class C23349d {
    /* renamed from: a */
    static boolean m84785a(int i, int i2, int i3, int i4, int i5, int i6) {
        return i >= i3 && i <= i5 && (i != i3 || i2 >= i4) && (i != i5 || i2 <= i6);
    }

    /* renamed from: a */
    static int m84780a(String str, Date date) {
        return Integer.parseInt(new SimpleDateFormat(str).format(date));
    }

    /* renamed from: a */
    static boolean m84786a(Calendar calendar) {
        int b = m84791b(calendar);
        return b == 0 || b == 6;
    }

    /* renamed from: a */
    static boolean m84784a(int i) {
        return (i % 4 == 0 && i % 100 != 0) || i % MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL == 0;
    }

    /* renamed from: a */
    static boolean m84787a(Calendar calendar, int i, int i2, int i3, int i4, int i5, int i6) {
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2 - 1, i3);
        long timeInMillis = instance.getTimeInMillis();
        instance.set(i4, i5 - 1, i6);
        long timeInMillis2 = instance.getTimeInMillis();
        instance.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay());
        long timeInMillis3 = instance.getTimeInMillis();
        if (timeInMillis3 < timeInMillis || timeInMillis3 > timeInMillis2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static boolean m84788a(Calendar calendar, C23350e eVar) {
        return m84787a(calendar, eVar.mo81183y(), eVar.mo81109D(), eVar.ah(), eVar.mo81184z(), eVar.mo81110E(), eVar.ai());
    }

    /* renamed from: a */
    static int m84779a(Calendar calendar, Calendar calendar2) {
        if (calendar == null) {
            return Integer.MIN_VALUE;
        }
        if (calendar2 == null) {
            return Integer.MAX_VALUE;
        }
        Calendar instance = Calendar.getInstance();
        instance.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay());
        long timeInMillis = instance.getTimeInMillis();
        instance.set(calendar2.getYear(), calendar2.getMonth() - 1, calendar2.getDay());
        return (int) ((timeInMillis - instance.getTimeInMillis()) / 86400000);
    }

    /* renamed from: a */
    static List<Calendar> m84782a(int i, int i2, Calendar calendar, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = i2 - 1;
        Calendar.getInstance().set(i, i11, 1);
        int a = m84772a(i, i2, i3);
        int a2 = m84771a(i, i2);
        ArrayList arrayList = new ArrayList();
        int i12 = 12;
        if (i2 == 1) {
            i7 = i - 1;
            int i13 = i2 + 1;
            if (a == 0) {
                i10 = 0;
            } else {
                i10 = m84771a(i7, 12);
            }
            i4 = i10;
            i5 = i13;
            i6 = i;
        } else if (i2 == 12) {
            int i14 = i + 1;
            if (a == 0) {
                i9 = 0;
            } else {
                i9 = m84771a(i, i11);
            }
            i6 = i14;
            i4 = i9;
            i5 = 1;
            i12 = i11;
            i7 = i;
        } else {
            int i15 = i2 + 1;
            if (a == 0) {
                i8 = 0;
            } else {
                i8 = m84771a(i, i11);
            }
            i12 = i11;
            i4 = i8;
            i7 = i;
            i5 = i15;
            i6 = i7;
        }
        int i16 = 1;
        for (int i17 = 0; i17 < 42; i17++) {
            Calendar calendar2 = new Calendar();
            if (i17 < a) {
                calendar2.setYear(i7);
                calendar2.setMonth(i12);
                calendar2.setDay((i4 - a) + i17 + 1);
            } else if (i17 >= a2 + a) {
                calendar2.setYear(i6);
                calendar2.setMonth(i5);
                calendar2.setDay(i16);
                i16++;
            } else {
                calendar2.setYear(i);
                calendar2.setMonth(i2);
                calendar2.setCurrentMonth(true);
                calendar2.setDay((i17 - a) + 1);
            }
            if (calendar2.equals(calendar)) {
                calendar2.setCurrentDay(true);
            }
            C23354i.m84878a(calendar2);
            arrayList.add(calendar2);
        }
        return arrayList;
    }

    /* renamed from: a */
    static List<Calendar> m84783a(Calendar calendar, C23350e eVar, int i) {
        Calendar instance = Calendar.getInstance();
        instance.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay());
        long timeInMillis = instance.getTimeInMillis();
        int d = m84798d(calendar.getYear(), calendar.getMonth(), calendar.getDay(), i);
        ArrayList arrayList = new ArrayList();
        instance.setTimeInMillis(timeInMillis);
        Calendar calendar2 = new Calendar();
        calendar2.setYear(instance.get(1));
        calendar2.setMonth(instance.get(2) + 1);
        calendar2.setDay(instance.get(5));
        if (calendar2.equals(eVar.ad())) {
            calendar2.setCurrentDay(true);
        }
        C23354i.m84878a(calendar2);
        calendar2.setCurrentMonth(true);
        arrayList.add(calendar2);
        for (int i2 = 1; i2 <= d; i2++) {
            instance.setTimeInMillis((((long) i2) * 86400000) + timeInMillis);
            Calendar calendar3 = new Calendar();
            calendar3.setYear(instance.get(1));
            calendar3.setMonth(instance.get(2) + 1);
            calendar3.setDay(instance.get(5));
            if (calendar3.equals(eVar.ad())) {
                calendar3.setCurrentDay(true);
            }
            C23354i.m84878a(calendar3);
            calendar3.setCurrentMonth(true);
            arrayList.add(calendar3);
        }
        return arrayList;
    }

    /* renamed from: a */
    static Calendar m84781a(int i, C23350e eVar) {
        Calendar calendar = new Calendar();
        boolean z = true;
        calendar.setYear((((eVar.mo81109D() + i) - 1) / 12) + eVar.mo81183y());
        calendar.setMonth((((i + eVar.mo81109D()) - 1) % 12) + 1);
        calendar.setDay(1);
        if (!m84788a(calendar, eVar)) {
            if (m84799d(calendar, eVar)) {
                calendar = eVar.am();
            } else {
                calendar = eVar.an();
            }
        }
        if (!(calendar.getYear() == eVar.ad().getYear() && calendar.getMonth() == eVar.ad().getMonth())) {
            z = false;
        }
        calendar.setCurrentMonth(z);
        calendar.setCurrentDay(calendar.equals(eVar.ad()));
        C23354i.m84878a(calendar);
        return calendar;
    }

    /* renamed from: b */
    static int m84791b(Calendar calendar) {
        Calendar instance = Calendar.getInstance();
        instance.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay());
        return instance.get(7) - 1;
    }

    /* renamed from: a */
    static int m84771a(int i, int i2) {
        int i3;
        if (i2 == 1 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 8 || i2 == 10 || i2 == 12) {
            i3 = 31;
        } else {
            i3 = 0;
        }
        if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = 30;
        }
        if (i2 != 2) {
            return i3;
        }
        if (m84784a(i)) {
            return 29;
        }
        return 28;
    }

    /* renamed from: c */
    static int m84796c(Calendar calendar, int i) {
        return m84795c(calendar.getYear(), calendar.getMonth(), calendar.getDay(), i);
    }

    /* renamed from: b */
    static int m84792b(Calendar calendar, int i) {
        Calendar instance = Calendar.getInstance();
        instance.set(calendar.getYear(), calendar.getMonth() - 1, 1);
        int i2 = instance.get(7);
        if (i == 1) {
            return i2 - 1;
        }
        if (i == 2) {
            if (i2 == 1) {
                return 6;
            }
            return i2 - i;
        } else if (i2 == 7) {
            return 0;
        } else {
            return i2;
        }
    }

    /* renamed from: c */
    static Calendar m84797c(Calendar calendar, C23350e eVar) {
        if (m84788a(eVar.ad(), eVar)) {
            return eVar.al();
        }
        if (m84788a(calendar, eVar)) {
            return calendar;
        }
        if (eVar.am().isSameMonth(calendar)) {
            return eVar.am();
        }
        return eVar.an();
    }

    /* renamed from: d */
    private static boolean m84799d(Calendar calendar, C23350e eVar) {
        Calendar instance = Calendar.getInstance();
        instance.set(eVar.mo81183y(), eVar.mo81109D() - 1, eVar.ah());
        long timeInMillis = instance.getTimeInMillis();
        instance.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay());
        if (instance.getTimeInMillis() < timeInMillis) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static int m84776a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    static List<Calendar> m84794b(Calendar calendar, C23350e eVar) {
        long timeInMillis = calendar.getTimeInMillis();
        Calendar instance = Calendar.getInstance();
        instance.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay());
        int i = instance.get(7);
        if (eVar.mo81129X() == 1) {
            i--;
        } else if (eVar.mo81129X() == 2) {
            if (i == 1) {
                i = 6;
            } else {
                i -= eVar.mo81129X();
            }
        } else if (i == 7) {
            i = 0;
        }
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(timeInMillis - (((long) i) * 86400000));
        Calendar calendar2 = new Calendar();
        calendar2.setYear(instance2.get(1));
        calendar2.setMonth(instance2.get(2) + 1);
        calendar2.setDay(instance2.get(5));
        return m84783a(calendar2, eVar, eVar.mo81129X());
    }

    /* renamed from: a */
    static int m84777a(Calendar calendar, int i) {
        Calendar.getInstance().set(calendar.getYear(), calendar.getMonth() - 1, 1);
        return (((calendar.getDay() + m84792b(calendar, i)) - 1) / 7) + 1;
    }

    /* renamed from: b */
    static int m84789b(int i, int i2, int i3) {
        return m84790b(i, i2, m84771a(i, i2), i3);
    }

    /* renamed from: a */
    static int m84772a(int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2 - 1, 1);
        int i4 = instance.get(7);
        if (i3 == 1) {
            return i4 - 1;
        }
        if (i3 == 2) {
            if (i4 == 1) {
                return 6;
            }
            return i4 - i3;
        } else if (i4 == 7) {
            return 0;
        } else {
            return i4;
        }
    }

    /* renamed from: c */
    private static int m84795c(int i, int i2, int i3, int i4) {
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2 - 1, i3);
        int i5 = instance.get(7);
        if (i4 == 1) {
            return i5 - 1;
        }
        if (i4 == 2) {
            if (i5 == 1) {
                return 6;
            }
            return i5 - i4;
        } else if (i5 == 7) {
            return 0;
        } else {
            return i5;
        }
    }

    /* renamed from: b */
    private static int m84790b(int i, int i2, int i3, int i4) {
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2 - 1, i3);
        int i5 = instance.get(7);
        if (i4 == 1) {
            return 7 - i5;
        }
        if (i4 == 2) {
            if (i5 == 1) {
                return 0;
            }
            return (7 - i5) + 1;
        } else if (i5 == 7) {
            return 6;
        } else {
            return (7 - i5) - 1;
        }
    }

    /* renamed from: d */
    private static int m84798d(int i, int i2, int i3, int i4) {
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2 - 1, i3);
        int i5 = instance.get(7);
        if (i4 == 1) {
            return 7 - i5;
        }
        if (i4 == 2) {
            if (i5 == 1) {
                return 0;
            }
            return (7 - i5) + 1;
        } else if (i5 == 7) {
            return 6;
        } else {
            return (7 - i5) - 1;
        }
    }

    /* renamed from: a */
    static int m84773a(int i, int i2, int i3, int i4) {
        Calendar.getInstance().set(i, i2 - 1, 1);
        int a = m84772a(i, i2, i4);
        int a2 = m84771a(i, i2);
        return (((a + a2) + m84790b(i, i2, a2, i4)) / 7) * i3;
    }

    /* renamed from: a */
    static int m84774a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return i3 * 6;
        }
        return m84773a(i, i2, i3, i4);
    }

    /* renamed from: b */
    static Calendar m84793b(int i, int i2, int i3, int i4, int i5) {
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2 - 1, i3);
        long timeInMillis = (((long) ((i4 - 1) * 7)) * 86400000) + instance.getTimeInMillis();
        instance.setTimeInMillis(timeInMillis);
        instance.setTimeInMillis(timeInMillis - (((long) m84795c(instance.get(1), instance.get(2) + 1, instance.get(5), i5)) * 86400000));
        Calendar calendar = new Calendar();
        calendar.setYear(instance.get(1));
        calendar.setMonth(instance.get(2) + 1);
        calendar.setDay(instance.get(5));
        return calendar;
    }

    /* renamed from: a */
    static int m84778a(Calendar calendar, int i, int i2, int i3, int i4) {
        int i5;
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2 - 1, i3);
        long timeInMillis = instance.getTimeInMillis();
        int c = m84795c(i, i2, i3, i4);
        int c2 = m84795c(calendar.getYear(), calendar.getMonth(), calendar.getDay(), i4);
        int year = calendar.getYear();
        int month = calendar.getMonth() - 1;
        if (c2 == 0) {
            i5 = calendar.getDay() + 1;
        } else {
            i5 = calendar.getDay();
        }
        instance.set(year, month, i5);
        return ((c + ((int) ((instance.getTimeInMillis() - timeInMillis) / 86400000))) / 7) + 1;
    }

    /* renamed from: a */
    static int m84775a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2 - 1, i3);
        long timeInMillis = instance.getTimeInMillis();
        int c = m84795c(i, i2, i3, i7);
        instance.set(i4, i5 - 1, i6);
        return ((c + m84798d(i4, i5, i6, i7)) + (((int) ((instance.getTimeInMillis() - timeInMillis) / 86400000)) + 1)) / 7;
    }
}
