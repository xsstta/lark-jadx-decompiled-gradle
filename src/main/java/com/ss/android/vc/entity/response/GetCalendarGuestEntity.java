package com.ss.android.vc.entity.response;

import com.ss.android.vc.entity.ByteviewUser;
import java.util.List;

public class GetCalendarGuestEntity {

    /* renamed from: a */
    public Status f152576a;

    /* renamed from: b */
    public List<C60950d> f152577b;

    /* renamed from: com.ss.android.vc.entity.response.GetCalendarGuestEntity$a */
    public static class C60947a {

        /* renamed from: a */
        public long f152578a;

        /* renamed from: b */
        public String f152579b;

        /* renamed from: c */
        public boolean f152580c;

        /* renamed from: d */
        public long f152581d;

        /* renamed from: e */
        public String f152582e;
    }

    /* renamed from: com.ss.android.vc.entity.response.GetCalendarGuestEntity$b */
    public static class C60948b {

        /* renamed from: a */
        public String f152583a;

        /* renamed from: b */
        public boolean f152584b;

        /* renamed from: c */
        public String f152585c;

        /* renamed from: d */
        public String f152586d;
    }

    /* renamed from: com.ss.android.vc.entity.response.GetCalendarGuestEntity$c */
    public static class C60949c {

        /* renamed from: a */
        public String f152587a;

        /* renamed from: b */
        public String f152588b;
    }

    /* renamed from: com.ss.android.vc.entity.response.GetCalendarGuestEntity$d */
    public static class C60950d {

        /* renamed from: a */
        public ByteviewUser f152589a;

        /* renamed from: b */
        public C60948b f152590b;

        /* renamed from: c */
        public C60951e f152591c;

        /* renamed from: d */
        public C60947a f152592d;
    }

    /* renamed from: com.ss.android.vc.entity.response.GetCalendarGuestEntity$e */
    public static class C60951e {

        /* renamed from: a */
        public String f152593a;

        /* renamed from: b */
        public C60949c f152594b;

        /* renamed from: c */
        public String f152595c;
    }

    public enum Status {
        UNKNOWN(0),
        SUCCESS(1),
        NOT_IN_CALENDAR(2),
        NO_PERMISSION(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Status forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return SUCCESS;
            }
            if (i == 2) {
                return NOT_IN_CALENDAR;
            }
            if (i != 3) {
                return null;
            }
            return NO_PERMISSION;
        }

        private Status(int i) {
            this.value = i;
        }
    }
}
