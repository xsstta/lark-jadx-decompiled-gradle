package com.ss.android.lark.notification.statistics;

import com.ss.android.lark.biz.core.api.INotificationHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0002\r\u000eB\u0005¢\u0006\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/notification/statistics/NoticeHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/biz/core/api/INotificationHitPoint;", "()V", "sendNotificationShowEvent", "", "chatId", "", "messageId", "showTime", "", "chatType", "noticeType", "Companion", "SingletonHolder", "core_notification_notification_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.notification.h.b */
public final class NoticeHitPoint extends BaseHitPoint implements INotificationHitPoint {

    /* renamed from: a */
    public static final NoticeHitPoint f122124a = SingletonHolder.f122126a.mo169609a();

    /* renamed from: b */
    public static final Companion f122125b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/notification/statistics/NoticeHitPoint$Companion;", "", "()V", "instance", "Lcom/ss/android/lark/notification/statistics/NoticeHitPoint;", "getInstance", "()Lcom/ss/android/lark/notification/statistics/NoticeHitPoint;", "sendEnterNotificationSetting", "", "core_notification_notification_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.notification.h.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final NoticeHitPoint mo169607a() {
            return NoticeHitPoint.f122124a;
        }

        /* renamed from: b */
        public final void mo169608b() {
            try {
                Statistics.sendEvent("setting_notification_title");
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/notification/statistics/NoticeHitPoint$SingletonHolder;", "", "()V", "holder", "Lcom/ss/android/lark/notification/statistics/NoticeHitPoint;", "getHolder", "()Lcom/ss/android/lark/notification/statistics/NoticeHitPoint;", "core_notification_notification_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.notification.h.b$b */
    private static final class SingletonHolder {

        /* renamed from: a */
        public static final SingletonHolder f122126a = new SingletonHolder();

        /* renamed from: b */
        private static final NoticeHitPoint f122127b = new NoticeHitPoint();

        private SingletonHolder() {
        }

        /* renamed from: a */
        public final NoticeHitPoint mo169609a() {
            return f122127b;
        }
    }

    @Override // com.ss.android.lark.biz.core.api.INotificationHitPoint
    /* renamed from: a */
    public void mo105364a(String str, String str2, long j, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str4, "noticeType");
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "";
        }
        JSONObject put = jSONObject.put("chat_id", str);
        if (str2 == null) {
            str2 = "";
        }
        JSONObject put2 = put.put("message_id", str2).put("show_time", j);
        if (str3 == null) {
            str3 = "";
        }
        Statistics.sendEvent("push_show", put2.put("chat_type", str3).put("notice_type", str4));
    }
}
