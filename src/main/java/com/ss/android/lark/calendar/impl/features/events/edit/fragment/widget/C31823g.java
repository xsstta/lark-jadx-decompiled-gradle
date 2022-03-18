package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.Arrays;

/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.g */
public class C31823g extends AbstractC31820d {

    /* renamed from: d */
    private final int f81054d = 7;

    /* renamed from: e */
    private final int f81055e = 8;

    /* renamed from: f */
    private String[] f81056f;

    /* renamed from: g */
    private int[] f81057g = new int[5];

    /* renamed from: h */
    private int[] f81058h = new int[2];

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.g$1 */
    public static /* synthetic */ class C318241 {

        /* renamed from: a */
        static final /* synthetic */ int[] f81059a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting$DayOfWeek[] r0 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting.DayOfWeek.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.C31823g.C318241.f81059a = r0
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting$DayOfWeek r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting.DayOfWeek.MONDAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.C31823g.C318241.f81059a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting$DayOfWeek r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting.DayOfWeek.SATURDAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.C31823g.C318241.<clinit>():void");
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.AbstractC31820d
    public int getCount() {
        if (this.f81056f == null) {
            int i = C318241.f81059a[C30022a.f74884c.mo108456c().getWeekStartDay().ordinal()];
            if (i == 1) {
                this.f81056f = this.f81047b.getResources().getStringArray(R.array.custom_repeat_weekly);
            } else if (i != 2) {
                this.f81056f = this.f81047b.getResources().getStringArray(R.array.sunday_first_repeat_weekly);
            } else {
                this.f81056f = this.f81047b.getResources().getStringArray(R.array.saturday_first_repeat_weekly);
            }
        }
        return this.f81056f.length;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.AbstractC31820d
    /* renamed from: a */
    public String getItem(int i) {
        if (i < 0) {
            return "";
        }
        String[] strArr = this.f81056f;
        if (i < strArr.length) {
            return strArr[i];
        }
        return "";
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.AbstractC31820d
    /* renamed from: c */
    public boolean mo116030c(int i) {
        if (i < 0 || i >= 7) {
            return false;
        }
        return this.f81046a[i];
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.AbstractC31820d
    /* renamed from: b */
    public void mo116028b(int i) {
        if (i >= 0 && i < this.f81046a.length) {
            this.f81046a[i] = !this.f81046a[i];
            m120797e(i);
            mo116029c();
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private boolean m120796a(int[] iArr) {
        for (int i : iArr) {
            if (!this.f81046a[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private void m120797e(int i) {
        if (i == 7) {
            m120795a(this.f81046a[i], this.f81057g, this.f81048c);
        } else if (i == 8) {
            m120795a(this.f81046a[i], this.f81058h, this.f81048c);
        } else {
            this.f81046a[7] = m120796a(this.f81057g);
            this.f81046a[8] = m120796a(this.f81058h);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m120794a(CalendarSetting calendarSetting) {
        int i = C318241.f81059a[calendarSetting.getWeekStartDay().ordinal()];
        if (i == 1) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f81057g;
                if (i2 < iArr.length) {
                    iArr[i2] = i2;
                    i2++;
                } else {
                    int[] iArr2 = this.f81058h;
                    iArr2[0] = 5;
                    iArr2[1] = 6;
                    return;
                }
            }
        } else if (i != 2) {
            int i3 = 0;
            while (true) {
                int[] iArr3 = this.f81057g;
                if (i3 < iArr3.length) {
                    int i4 = i3 + 1;
                    iArr3[i3] = i4;
                    i3 = i4;
                } else {
                    int[] iArr4 = this.f81058h;
                    iArr4[0] = 0;
                    iArr4[1] = 6;
                    return;
                }
            }
        } else {
            int i5 = 0;
            while (true) {
                int[] iArr5 = this.f81057g;
                if (i5 < iArr5.length) {
                    iArr5[i5] = i5 + 2;
                    i5++;
                } else {
                    int[] iArr6 = this.f81058h;
                    iArr6[0] = 0;
                    iArr6[1] = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m120795a(boolean z, int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 != i) {
                this.f81046a[i2] = z;
            }
        }
    }

    public C31823g(Context context, int i, int i2) {
        super(context, i, i2);
        this.f81046a = new boolean[this.f81056f.length];
        Arrays.fill(this.f81046a, false);
        C30022a.f74884c.mo108450a(new C30086b.AbstractC30090a() {
            /* class com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.$$Lambda$g$8AbkMqagwcjdwYGvMlaFBO5pQ */

            @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
            public final void onGetSucceed(CalendarSetting calendarSetting) {
                C31823g.this.m120794a((C31823g) calendarSetting);
            }
        });
    }
}
