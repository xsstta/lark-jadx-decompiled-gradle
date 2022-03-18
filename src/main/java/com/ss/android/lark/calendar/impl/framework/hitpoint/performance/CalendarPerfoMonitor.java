package com.ss.android.lark.calendar.impl.framework.hitpoint.performance;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class CalendarPerfoMonitor {

    /* renamed from: a */
    private static Map<String, C32505a> f83373a = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfoMonitor$1 */
    public static /* synthetic */ class C325041 {

        /* renamed from: a */
        static final /* synthetic */ int[] f83374a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent$Span[] r0 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent.Span.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfoMonitor.C325041.f83374a = r0
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent$Span r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent.Span.THIS_EVENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfoMonitor.C325041.f83374a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent$Span r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent.Span.FUTURE_EVENTS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfoMonitor.C325041.f83374a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent$Span r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent.Span.ALL_EVENTS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfoMonitor.C325041.f83374a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent$Span r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent.Span.NONE_SPAN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfoMonitor.C325041.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfoMonitor$a */
    public static class C32505a {

        /* renamed from: a */
        public Long f83375a;

        /* renamed from: b */
        public Long f83376b;

        /* renamed from: c */
        public Long f83377c;

        /* renamed from: d */
        public boolean f83378d;

        /* renamed from: e */
        public String f83379e;

        /* renamed from: f */
        public String f83380f;

        public String toString() {
            return "PerfoTracker{startTime=" + this.f83375a + ", endTime=" + this.f83376b + ", duration=" + this.f83377c + ", keyType='" + this.f83379e + '\'' + ", trackerType='" + this.f83380f + '\'' + '}';
        }

        C32505a(TrackerType trackerType) {
            this.f83375a = 0L;
            this.f83376b = 0L;
            this.f83377c = 0L;
            this.f83378d = false;
            this.f83379e = null;
            this.f83380f = null;
            this.f83375a = Long.valueOf(System.currentTimeMillis());
            this.f83380f = trackerType.value;
        }
    }

    /* renamed from: a */
    public static void m124404a(EventType eventType) {
        C32505a aVar;
        if (eventType != null && (aVar = f83373a.get(eventType.value)) != null) {
            f83373a.remove(eventType.value);
            aVar.f83376b = Long.valueOf(System.currentTimeMillis());
            aVar.f83377c = Long.valueOf(aVar.f83376b.longValue() - aVar.f83375a.longValue());
            m124407a(aVar);
        }
    }

    /* renamed from: a */
    private static void m124407a(C32505a aVar) {
        if (aVar != null && aVar.f83377c.longValue() > 0 && aVar.f83377c.longValue() <= 120000) {
            try {
                C30022a.f74882a.statisticsDependency().mo108186a(aVar.f83379e, new JSONObject().put(aVar.f83380f, aVar.f83377c));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m124405a(EventType eventType, TrackerType trackerType) {
        if (eventType != null && trackerType != null) {
            C32505a aVar = new C32505a(trackerType);
            aVar.f83379e = eventType.value;
            f83373a.put(eventType.value, aVar);
        }
    }

    /* renamed from: a */
    public static void m124406a(EventType eventType, CalendarEvent.Span span) {
        TrackerType trackerType;
        TrackerType trackerType2;
        TrackerType trackerType3;
        TrackerType trackerType4;
        TrackerType trackerType5;
        if (eventType != null && span != null) {
            if (EventType.PERF_CAL_DELETE.value.equals(eventType.value)) {
                int i = C325041.f83374a[span.ordinal()];
                if (i == 1) {
                    trackerType5 = TrackerType.DEL_REPT_CUR;
                } else if (i == 2) {
                    trackerType5 = TrackerType.DEL_REPT_FUT;
                } else if (i != 3) {
                    trackerType5 = TrackerType.DEL_REPT_NOT;
                } else {
                    trackerType5 = TrackerType.DEL_REPT_ALL;
                }
                m124405a(eventType, trackerType5);
            } else if (EventType.PERF_CAL_UPDATE.value.equals(eventType.value)) {
                int i2 = C325041.f83374a[span.ordinal()];
                if (i2 == 1) {
                    trackerType4 = TrackerType.UPD_REPT_CUR;
                } else if (i2 == 2) {
                    trackerType4 = TrackerType.UPD_REPT_FUT;
                } else if (i2 != 3) {
                    trackerType4 = TrackerType.UPD_REPT_NOT;
                } else {
                    trackerType4 = TrackerType.UPD_REPT_ALL;
                }
                m124405a(eventType, trackerType4);
            } else if (EventType.PERF_CAL_UPD_INV.value.equals(eventType.value)) {
                if (C325041.f83374a[span.ordinal()] != 3) {
                    trackerType3 = TrackerType.UPD_INV_REPT_NOT;
                } else {
                    trackerType3 = TrackerType.UPD_INV_REPT_ALL;
                }
                m124405a(eventType, trackerType3);
            } else if (EventType.PERF_CAL_DEL_INV.value.equals(eventType.value)) {
                int i3 = C325041.f83374a[span.ordinal()];
                if (i3 == 1) {
                    trackerType2 = TrackerType.DEL_INV_REPT_CUR;
                } else if (i3 != 3) {
                    trackerType2 = TrackerType.DEL_INV_REPT_NOT;
                } else {
                    trackerType2 = TrackerType.DEL_INV_REPT_ALL;
                }
                m124405a(eventType, trackerType2);
            } else if (EventType.PERF_CAL_REPLY.value.equals(eventType.value)) {
                int i4 = C325041.f83374a[span.ordinal()];
                if (i4 == 1) {
                    trackerType = TrackerType.RPL_INV_REPT_CUR;
                } else if (i4 != 3) {
                    trackerType = TrackerType.RPL_INV_REPT_NOT;
                } else {
                    trackerType = TrackerType.RPL_INV_REPT_ALL;
                }
                m124405a(eventType, trackerType);
            }
        }
    }

    public enum EventType {
        PERF_CAL_GET_INS("perf_cal_get_ins"),
        PERF_CAL_DETAIL("perf_cal_detail"),
        PERF_CAL_UPDATE("perf_cal_update"),
        PERF_CAL_DELETE("perf_cal_delete"),
        PERF_CAL_UPD_INV("perf_cal_upd_inv"),
        PERF_CAL_DEL_INV("perf_cal_del_inv"),
        PERF_CAL_REPLY("perf_cal_reply"),
        PERF_CAL_LANUCH("perf_cal_launch");
        
        String value;

        private EventType(String str) {
            this.value = str;
        }
    }

    public enum TrackerType {
        INSTANCE("get_instance"),
        CHIP("event_to_detail"),
        BOT("bot_to_detail"),
        SHARE("share_event_to_detail"),
        CHAT("chat_to_detail"),
        REMINDER("reminder_to_detail"),
        APPEND("append_to_detail"),
        UPD_REPT_NOT("update_rept_not"),
        UPD_REPT_CUR("update_rept_current"),
        UPD_REPT_FUT("update_rept_future"),
        UPD_REPT_ALL("update_rept_all"),
        DEL_REPT_NOT("delete_rept_not"),
        DEL_REPT_CUR("delete_rept_current"),
        DEL_REPT_FUT("delete_rept_future"),
        DEL_REPT_ALL("delete_rept_all"),
        UPD_INV_REPT_NOT("update_inv_rept_not"),
        UPD_INV_REPT_ALL("update_inv_rept_all"),
        DEL_INV_REPT_NOT("delete_inv_rept_not"),
        DEL_INV_REPT_CUR("delete_inv_rept_current"),
        DEL_INV_REPT_ALL("delete_inv_rept_all"),
        RPL_INV_REPT_NOT("reply_inv_rept_not"),
        RPL_INV_REPT_CUR("reply_inv_rept_current"),
        RPL_INV_REPT_ALL("reply_inv_rept_all"),
        LAUNCH_ONE("launch_one"),
        LAUNCH_THREE("launch_three"),
        LAUNCH_LIST("launch_list");
        
        String value;

        private TrackerType(String str) {
            this.value = str;
        }
    }
}
