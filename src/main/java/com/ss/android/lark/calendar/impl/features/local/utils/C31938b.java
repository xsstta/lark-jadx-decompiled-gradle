package com.ss.android.lark.calendar.impl.features.local.utils;

import android.text.format.Time;
import com.ss.android.lark.calendar.impl.utils.EventRecurrence;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: com.ss.android.lark.calendar.impl.features.local.utils.b */
public class C31938b {

    /* renamed from: f */
    private static final int[] f81587f = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* renamed from: g */
    private static final int[] f81588g = {0, 31, 59, 90, SmEvents.EVENT_NW, 151, 180, TTVideoEngine.PLAYER_OPTION_SET_SUPER_RES_STRENGTH, 243, 273, 304, 334};

    /* renamed from: a */
    private Time f81589a = new Time("UTC");

    /* renamed from: b */
    private Time f81590b = new Time("UTC");

    /* renamed from: c */
    private StringBuilder f81591c = new StringBuilder();

    /* renamed from: d */
    private Time f81592d = new Time("UTC");

    /* renamed from: e */
    private C31939a f81593e = new C31939a(false);

    /* renamed from: c */
    private static boolean m121530c(int i, int i2, int i3) {
        return i > i2 && i3 > 0;
    }

    /* renamed from: a */
    public long[] mo116567a(Time time, C31940c cVar, long j, long j2) throws DateException {
        long j3;
        String str = time.timezone;
        this.f81589a.clear(str);
        this.f81592d.clear(str);
        this.f81589a.set(j);
        long b = m121528b(this.f81589a);
        if (j2 != -1) {
            this.f81589a.set(j2);
            j3 = m121528b(this.f81589a);
        } else {
            j3 = Long.MAX_VALUE;
        }
        TreeSet<Long> treeSet = new TreeSet<>();
        if (cVar.f81599a != null) {
            EventRecurrence[] eventRecurrenceArr = cVar.f81599a;
            int i = 0;
            for (int length = eventRecurrenceArr.length; i < length; length = length) {
                mo116566a(time, eventRecurrenceArr[i], b, j3, true, treeSet);
                i++;
                eventRecurrenceArr = eventRecurrenceArr;
            }
        }
        if (cVar.f81600b != null) {
            for (long j4 : cVar.f81600b) {
                this.f81589a.set(j4);
                treeSet.add(Long.valueOf(m121528b(this.f81589a)));
            }
        }
        if (cVar.f81601c != null) {
            EventRecurrence[] eventRecurrenceArr2 = cVar.f81601c;
            int length2 = eventRecurrenceArr2.length;
            int i2 = 0;
            while (i2 < length2) {
                mo116566a(time, eventRecurrenceArr2[i2], b, j3, false, treeSet);
                i2++;
                length2 = length2;
                eventRecurrenceArr2 = eventRecurrenceArr2;
            }
        }
        if (cVar.f81602d != null) {
            for (long j5 : cVar.f81602d) {
                this.f81589a.set(j5);
                treeSet.remove(Long.valueOf(m121528b(this.f81589a)));
            }
        }
        if (treeSet.isEmpty()) {
            return new long[0];
        }
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            m121522a(this.f81589a, it.next().longValue());
            jArr[i3] = this.f81589a.toMillis(true);
            i3++;
        }
        return jArr;
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.local.utils.b$a */
    public static class C31939a {

        /* renamed from: a */
        private EventRecurrence f81594a;

        /* renamed from: b */
        private int f81595b;

        /* renamed from: c */
        private Time f81596c = new Time("UTC");

        /* renamed from: d */
        private int f81597d;

        /* renamed from: e */
        private int f81598e;

        public C31939a(boolean z) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo116568a(EventRecurrence eventRecurrence) {
            this.f81597d = 0;
            this.f81598e = -1;
            this.f81594a = eventRecurrence;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo116569a(Time time, int i) {
            Time time2;
            int i2 = time.year;
            int i3 = time.month;
            if (i < 1 || i > 28) {
                time2 = this.f81596c;
                time2.set(i, i3, i2);
                C31938b.m121521a(time2);
                i2 = time2.year;
                i3 = time2.month;
                i = time2.monthDay;
            } else {
                time2 = null;
            }
            if (!(i2 == this.f81597d && i3 == this.f81598e)) {
                if (time2 == null) {
                    time2 = this.f81596c;
                    time2.set(i, i3, i2);
                    C31938b.m121521a(time2);
                }
                this.f81597d = i2;
                this.f81598e = i3;
                this.f81595b = m121533a(time2, this.f81594a);
            }
            if ((this.f81595b & (1 << i)) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private static int m121533a(Time time, EventRecurrence eventRecurrence) {
            int i;
            int i2;
            int i3;
            int i4;
            int actualMaximum = time.getActualMaximum(4);
            int i5 = eventRecurrence.f83709r;
            if (i5 > 0) {
                int i6 = time.monthDay;
                while (i6 >= 8) {
                    i6 -= 7;
                }
                int i7 = time.weekDay;
                if (i7 >= i6) {
                    i3 = (i7 - i6) + 1;
                } else {
                    i3 = (i7 - i6) + 8;
                }
                int[] iArr = eventRecurrence.f83707p;
                int[] iArr2 = eventRecurrence.f83708q;
                i = 0;
                for (int i8 = 0; i8 < i5; i8++) {
                    int i9 = iArr2[i8];
                    int b = (EventRecurrence.m125135b(iArr[i8]) - i3) + 1;
                    if (b <= 0) {
                        b += 7;
                    }
                    if (i9 == 0) {
                        while (b <= actualMaximum) {
                            i |= 1 << b;
                            b += 7;
                        }
                    } else {
                        if (i9 > 0) {
                            i4 = b + ((i9 - 1) * 7);
                            if (i4 > actualMaximum) {
                            }
                        } else {
                            while (b <= actualMaximum) {
                                b += 7;
                            }
                            i4 = b + (i9 * 7);
                            if (i4 < 1) {
                            }
                        }
                        i |= 1 << i4;
                    }
                }
            } else {
                i = 0;
            }
            if (eventRecurrence.f83696e > 5 && (i2 = eventRecurrence.f83711t) != 0) {
                int[] iArr3 = eventRecurrence.f83710s;
                if (eventRecurrence.f83709r == 0) {
                    for (int i10 = 0; i10 < i2; i10++) {
                        int i11 = iArr3[i10];
                        if (i11 >= 0 || ((i11 = i11 + actualMaximum + 1) >= 1 && i11 <= actualMaximum)) {
                            i |= 1 << i11;
                        }
                    }
                } else {
                    for (int i12 = 1; i12 <= actualMaximum; i12++) {
                        int i13 = 1 << i12;
                        if ((i & i13) != 0) {
                            int i14 = 0;
                            while (true) {
                                if (i14 >= i2) {
                                    i &= ~i13;
                                    break;
                                } else if (iArr3[i14] == i12) {
                                    break;
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                }
            }
            return i;
        }
    }

    /* renamed from: a */
    static boolean m121523a(int i) {
        if (i % 4 != 0 || (i % 100 == 0 && i % MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL != 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    static int m121526b(int i) {
        if (m121523a(i)) {
            return 366;
        }
        return 365;
    }

    /* renamed from: b */
    private static final long m121528b(Time time) {
        return (((long) time.year) << 26) + ((long) (time.month << 22)) + ((long) (time.monthDay << 17)) + ((long) (time.hour << 12)) + ((long) (time.minute << 6)) + ((long) time.second);
    }

    /* renamed from: a */
    static void m121521a(Time time) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = time.second;
        int i6 = time.minute;
        int i7 = time.hour;
        int i8 = time.monthDay;
        int i9 = time.month;
        int i10 = time.year;
        if (i5 < 0) {
            i = i5 - 59;
        } else {
            i = i5;
        }
        int i11 = i / 60;
        int i12 = i5 - (i11 * 60);
        int i13 = i6 + i11;
        if (i13 < 0) {
            i2 = i13 - 59;
        } else {
            i2 = i13;
        }
        int i14 = i2 / 60;
        int i15 = i13 - (i14 * 60);
        int i16 = i7 + i14;
        if (i16 < 0) {
            i3 = i16 - 23;
        } else {
            i3 = i16;
        }
        int i17 = i3 / 24;
        int i18 = i16 - (i17 * 24);
        int i19 = i8 + i17;
        while (i19 <= 0) {
            if (i9 > 1) {
                i4 = m121526b(i10);
            } else {
                i4 = m121526b(i10 - 1);
            }
            i19 += i4;
            i10--;
        }
        if (i9 < 0) {
            int i20 = ((i9 + 1) / 12) - 1;
            i10 += i20;
            i9 -= i20 * 12;
        } else if (i9 >= 12) {
            int i21 = i9 / 12;
            i10 += i21;
            i9 -= i21 * 12;
        }
        while (true) {
            if (i9 == 0) {
                int b = m121526b(i10);
                if (i19 > b) {
                    i10++;
                    i19 -= b;
                }
            }
            int a = m121518a(i10, i9);
            if (i19 > a) {
                i19 -= a;
                i9++;
                if (i9 >= 12) {
                    i9 -= 12;
                    i10++;
                }
            } else {
                time.second = i12;
                time.minute = i15;
                time.hour = i18;
                time.monthDay = i19;
                time.month = i9;
                time.year = i10;
                time.weekDay = m121519a(i10, i9, i19);
                time.yearDay = m121527b(i10, i9, i19);
                return;
            }
        }
    }

    /* renamed from: a */
    static int m121518a(int i, int i2) {
        int i3 = f81587f[i2];
        if (i3 != 28) {
            return i3;
        }
        if (m121523a(i)) {
            return 29;
        }
        return 28;
    }

    /* renamed from: a */
    private static final void m121522a(Time time, long j) {
        time.year = (int) (j >> 26);
        time.month = ((int) (j >> 22)) & 15;
        time.monthDay = ((int) (j >> 17)) & 31;
        time.hour = ((int) (j >> 12)) & 31;
        time.minute = ((int) (j >> 6)) & 63;
        time.second = (int) (j & 63);
    }

    /* renamed from: b */
    private static boolean m121529b(EventRecurrence eventRecurrence, Time time) {
        int i = ((time.weekDay - time.monthDay) + 36) % 7;
        int i2 = 0;
        for (int i3 = 0; i3 < eventRecurrence.f83709r; i3++) {
            i2 |= eventRecurrence.f83707p[i3];
        }
        int actualMaximum = time.getActualMaximum(4);
        int[] iArr = new int[actualMaximum];
        int i4 = 0;
        for (int i5 = 1; i5 <= actualMaximum; i5++) {
            if (((65536 << i) & i2) != 0) {
                iArr[i4] = i5;
                i4++;
            }
            i++;
            if (i == 7) {
                i = 0;
            }
        }
        for (int i6 = eventRecurrence.f83694B - 1; i6 >= 0; i6--) {
            int i7 = eventRecurrence.f83693A[i6];
            if (i7 > 0) {
                if (i7 <= i4 && iArr[i7 - 1] == time.monthDay) {
                    return true;
                }
            } else if (i7 < 0) {
                int i8 = i7 + i4;
                if (i8 >= 0 && iArr[i8] == time.monthDay) {
                    return true;
                }
            } else {
                throw new RuntimeException("invalid bysetpos value");
            }
        }
        return false;
    }

    /* renamed from: a */
    private static int m121520a(EventRecurrence eventRecurrence, Time time) {
        int i = eventRecurrence.f83696e;
        if (6 >= i && eventRecurrence.f83717z > 0 && !m121524a(eventRecurrence.f83716y, eventRecurrence.f83717z, time.month + 1)) {
            return 1;
        }
        if (5 >= i && eventRecurrence.f83715x > 0 && !m121525a(eventRecurrence.f83714w, eventRecurrence.f83715x, time.getWeekNumber(), time.getActualMaximum(9))) {
            return 2;
        }
        if (4 >= i) {
            if (eventRecurrence.f83713v > 0 && !m121525a(eventRecurrence.f83712u, eventRecurrence.f83713v, time.yearDay, time.getActualMaximum(8))) {
                return 3;
            }
            if (eventRecurrence.f83711t > 0 && !m121525a(eventRecurrence.f83710s, eventRecurrence.f83711t, time.monthDay, time.getActualMaximum(4))) {
                return 4;
            }
            if (eventRecurrence.f83709r > 0) {
                int[] iArr = eventRecurrence.f83707p;
                int i2 = eventRecurrence.f83709r;
                int a = EventRecurrence.m125130a(time.weekDay);
                for (int i3 = 0; i3 < i2; i3++) {
                    if (iArr[i3] != a) {
                    }
                }
                return 5;
            }
        }
        if (3 >= i && !m121525a(eventRecurrence.f83705n, eventRecurrence.f83706o, time.hour, time.getActualMaximum(3))) {
            return 6;
        }
        if (2 >= i && !m121525a(eventRecurrence.f83703l, eventRecurrence.f83704m, time.minute, time.getActualMaximum(2))) {
            return 7;
        }
        if (1 >= i && !m121525a(eventRecurrence.f83701j, eventRecurrence.f83702k, time.second, time.getActualMaximum(1))) {
            return 8;
        }
        if (eventRecurrence.f83694B > 0) {
            if (i != 6 || eventRecurrence.f83709r <= 0) {
                Log.m165397w("RecurrenceProcessor", "BYSETPOS not supported with these rules: " + eventRecurrence);
            } else {
                int i4 = eventRecurrence.f83709r - 1;
                while (true) {
                    if (i4 >= 0) {
                        if (eventRecurrence.f83708q[i4] != 0) {
                            Log.m165397w("RecurrenceProcessor", "BYSETPOS not supported with these rules: " + eventRecurrence);
                            break;
                        }
                        i4--;
                    } else if (!m121529b(eventRecurrence, time)) {
                        return 9;
                    }
                }
            }
        }
        return 0;
    }

    /* renamed from: b */
    static int m121527b(int i, int i2, int i3) {
        int i4 = (f81588g[i2] + i3) - 1;
        if (i2 < 2 || !m121523a(i)) {
            return i4;
        }
        return i4 + 1;
    }

    /* renamed from: a */
    static int m121519a(int i, int i2, int i3) {
        if (i2 <= 1) {
            i2 += 12;
            i--;
        }
        return (((((i3 + (((i2 * 13) - 14) / 5)) + i) + (i / 4)) - (i / 100)) + (i / MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL)) % 7;
    }

    /* renamed from: a */
    private static boolean m121524a(int[] iArr, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m121525a(int[] iArr, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = iArr[i4];
            if (i5 <= 0) {
                i3 += i5;
                if (i3 == i2) {
                    return true;
                }
            } else if (i5 == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01ff, code lost:
        if (r11 >= r13) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03e6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03e7, code lost:
        r26 = " rangeStart=";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03f3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03f4, code lost:
        r26 = " rangeStart=";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03f6, code lost:
        r8 = r54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0080, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        r8 = r54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a9, code lost:
        r5 = r56;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01bb A[Catch:{ DateException -> 0x03c7, RuntimeException -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01c4 A[Catch:{ DateException -> 0x03c7, RuntimeException -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x026b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02cd A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02eb A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03f3 A[ExcHandler: RuntimeException (e java.lang.RuntimeException), Splitter:B:9:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03a6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x030a A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x02c7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0282 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007d A[ExcHandler: RuntimeException (e java.lang.RuntimeException), Splitter:B:28:0x0070] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009c A[SYNTHETIC, Splitter:B:48:0x009c] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00dd A[Catch:{ DateException -> 0x03c7, RuntimeException -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0105 A[Catch:{ DateException -> 0x03c7, RuntimeException -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0118 A[Catch:{ DateException -> 0x03c7, RuntimeException -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0174 A[Catch:{ DateException -> 0x03c7, RuntimeException -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0199 A[Catch:{ DateException -> 0x03c7, RuntimeException -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x019f A[Catch:{ DateException -> 0x03c7, RuntimeException -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01a4 A[Catch:{ DateException -> 0x03c7, RuntimeException -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01aa A[Catch:{ DateException -> 0x03c7, RuntimeException -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b1 A[Catch:{ DateException -> 0x03c7, RuntimeException -> 0x03c3 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo116566a(android.text.format.Time r52, com.ss.android.lark.calendar.impl.utils.EventRecurrence r53, long r54, long r56, boolean r58, java.util.TreeSet<java.lang.Long> r59) throws com.ss.android.lark.calendar.impl.features.local.utils.DateException {
        /*
        // Method dump skipped, instructions count: 1138
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.local.utils.C31938b.mo116566a(android.text.format.Time, com.ss.android.lark.calendar.impl.utils.EventRecurrence, long, long, boolean, java.util.TreeSet):void");
    }
}
