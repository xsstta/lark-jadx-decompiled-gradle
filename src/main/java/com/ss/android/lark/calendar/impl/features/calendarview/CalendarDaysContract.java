package com.ss.android.lark.calendar.impl.features.calendarview;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;

public interface CalendarDaysContract {

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract$a */
    public interface AbstractC30655a {
        /* renamed from: a */
        void mo108701a();

        /* renamed from: a */
        void mo108702a(int i, int i2, int i3);

        /* renamed from: b */
        void mo108703b();
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract$b */
    public interface AbstractC30656b {
        /* renamed from: a */
        void mo108688a();

        /* renamed from: a */
        void mo108689a(int i, int i2, int i3);
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract$c */
    public interface AbstractC30657c {
        /* renamed from: a */
        void mo110674a(CalendarEventInstance calendarEventInstance, long j, long j2);
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract$d */
    public interface AbstractC30658d {
        /* renamed from: a */
        void mo108515a(Intent intent, boolean z);

        /* renamed from: a */
        void mo108516a(CalendarDate calendarDate, Context context, boolean z);

        /* renamed from: a */
        void mo108517a(EventChipViewData eventChipViewData, boolean z);

        /* renamed from: a */
        void mo108518a(Object obj, View view);
    }

    public enum CalendarViewMode {
        MODE_THREE_DAYS_VIEW(3),
        MODE_DAY_VIEW(1),
        MODE_LIST_VIEW(31),
        MODE_MONTH_VIEW(4);
        
        private int mNumDays;

        public static CalendarViewMode forNumDays(int i) {
            if (i == 1) {
                return MODE_DAY_VIEW;
            }
            if (i == 31) {
                return MODE_LIST_VIEW;
            }
            if (i == 3) {
                return MODE_THREE_DAYS_VIEW;
            }
            if (i != 4) {
                return MODE_THREE_DAYS_VIEW;
            }
            return MODE_MONTH_VIEW;
        }

        private CalendarViewMode(int i) {
            this.mNumDays = i;
        }
    }
}
