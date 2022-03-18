package com.ss.android.lark.chatsetting.impl.group.ownership.v2.calendar;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/calendar/CalendarHitPoint;", "", "()V", "Companion", "Param", "Value", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.calendar.a */
public final class CalendarHitPoint {

    /* renamed from: a */
    public static final Companion f90049a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/calendar/CalendarHitPoint$Companion;", "", "()V", "sendClickMeeting2Group", "", "createText", "", "chatId", "sendOnClickMeeting2Chat", "sendOnMeeting2ChatCancel", "sendOnMeeting2ChatConfirm", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.calendar.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo128683a() {
            Statistics.sendEvent("cal_transform");
        }

        /* renamed from: b */
        public final void mo128685b() {
            Statistics.sendEvent("cal_transform_popup", new JSONObject().put(ShareHitPoint.f121868c, "setting").put("action_type", "yes"));
        }

        /* renamed from: c */
        public final void mo128686c() {
            Statistics.sendEvent("cal_transform_popup", new JSONObject().put(ShareHitPoint.f121868c, "setting").put("action_type", "no"));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo128684a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "createText");
            Intrinsics.checkParameterIsNotNull(str2, "chatId");
            Statistics.sendEvent("im_chat_manage_convert_to_standard_group_click", new JSONObject().put("time_lapse_since_group_created", String.valueOf((int) (((System.currentTimeMillis() / ((long) 1000)) - Long.parseLong(str)) / ((long) 3600)))).put("chat_id", str2));
        }
    }
}
