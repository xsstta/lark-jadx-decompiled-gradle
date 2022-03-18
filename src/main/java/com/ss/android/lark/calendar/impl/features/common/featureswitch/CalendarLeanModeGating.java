package com.ss.android.lark.calendar.impl.features.common.featureswitch;

import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/featureswitch/CalendarLeanModeGating;", "", "()V", "isEventAttachmentEnable", "", "isEventChatEnable", "isEventDescriptionEnable", "isEventMinutesEnable", "isEventReminderEnable", "isEventVideoEnable", "isLeanMode", "isSearchEventEnable", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.b.c */
public final class CalendarLeanModeGating {

    /* renamed from: a */
    public static final HashMap<String, Boolean> f78607a;

    /* renamed from: b */
    public static final Companion f78608b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000ej\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f`\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/featureswitch/CalendarLeanModeGating$Companion;", "", "()V", "LEAN_MODE", "", "LEAN_MODE_KEY_EVENT_ATTACHMENT", "LEAN_MODE_KEY_EVENT_CHAT", "LEAN_MODE_KEY_EVENT_DESCRIPTION", "LEAN_MODE_KEY_EVENT_MINUTES", "LEAN_MODE_KEY_EVENT_REMINDER", "LEAN_MODE_KEY_EVENT_VIDEO", "LEAN_MODE_KEY_SEARCH_EVENT", "TAG", "sLeanModeGatingMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getLeanModeGatingMap", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.b.c$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final Map<String, Boolean> mo112725a() {
            return CalendarLeanModeGating.f78607a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo112721a() {
        boolean a = C30022a.f74882a.leanModeGatingDependency().mo108266a("event.video");
        Log.m165389i("CalendarLeanModeGating", C32673y.m125378d("event.video: " + a));
        return a;
    }

    /* renamed from: b */
    public final boolean mo112722b() {
        boolean a = C30022a.f74882a.leanModeGatingDependency().mo108266a("event.description");
        Log.m165389i("CalendarLeanModeGating", C32673y.m125378d("event.description: " + a));
        return a;
    }

    /* renamed from: c */
    public final boolean mo112723c() {
        boolean a = C30022a.f74882a.leanModeGatingDependency().mo108266a("event.attachment");
        Log.m165389i("CalendarLeanModeGating", C32673y.m125378d("event.attachment: " + a));
        return a;
    }

    /* renamed from: d */
    public final boolean mo112724d() {
        boolean a = C30022a.f74882a.leanModeGatingDependency().mo108266a("leanMode");
        Log.m165389i("CalendarLeanModeGating", C32673y.m125378d("leanMode: " + a));
        return a;
    }

    static {
        HashMap<String, Boolean> hashMap = new HashMap<>();
        f78607a = hashMap;
        hashMap.put("event.minutes", true);
        hashMap.put("event.chat", true);
        hashMap.put("event.video", true);
        hashMap.put("event.description", true);
        hashMap.put("event.attachment", true);
        hashMap.put("event.reminder", true);
        hashMap.put("search.event", true);
    }
}
