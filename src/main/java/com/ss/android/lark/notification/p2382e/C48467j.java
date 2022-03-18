package com.ss.android.lark.notification.p2382e;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.dto.NotificationSettingItem;
import com.ss.android.lark.notification.p2378b.AbstractC48407a;
import com.ss.android.lark.utils.p2908e.C57823a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.notification.e.j */
public class C48467j {

    /* renamed from: a */
    private static Map<String, C48451d> f121947a = new HashMap();

    /* renamed from: a */
    private static void m191155a(String str) {
        AbstractC48407a.AbstractC48427o d = C48398a.m190922a().mo169341d();
        if (d.mo169400a(str) == null) {
            NotificationSettingItem notificationSettingItem = new NotificationSettingItem();
            boolean b = d.mo169418b();
            boolean d2 = d.mo169423d();
            boolean c = d.mo169421c();
            notificationSettingItem.setNotificationOn(b);
            notificationSettingItem.setSoundOn(d2);
            notificationSettingItem.setVibrateOn(c);
            d.mo169408a(str, notificationSettingItem);
        }
    }

    /* renamed from: a */
    public static void m191153a(Context context) {
        m191151a(context, new C48451d("normal_v2", UIUtils.getString(context, R.string.Lark_Notification_MessageNormal), UIUtils.getString(context, R.string.Lark_Notification_MessageNormalDescription), m191150a(context, (int) R.raw.notification), true));
        m191151a(context, new C48451d("at_v2", UIUtils.getString(context, R.string.Lark_Notification_MessageAt), UIUtils.getString(context, R.string.Lark_Notification_MessageAtDescription), m191150a(context, (int) R.raw.notification_at), true));
        m191151a(context, new C48451d("ding_v2", UIUtils.getString(context, R.string.Lark_Notification_MessageDing), UIUtils.getString(context, R.string.Lark_Notification_MessageDingDescription), m191150a(context, (int) R.raw.notification_ding), true));
        m191151a(context, new C48451d("scheduleCalReminder", UIUtils.getString(context, R.string.Lark_Notification_MessageScheduleReminder), UIUtils.getString(context, R.string.Lark_Notification_MessageScheduleReminderDescription), m191150a(context, (int) R.raw.notification_calendar), true));
        m191152a(context, new C48451d("progress", UIUtils.getString(context, R.string.Lark_Notification_MessageProgress), UIUtils.getString(context, R.string.Lark_Notification_MessageProgressDescription), null, false), false);
        m191152a(context, new C48451d("newMail", UIUtils.getString(context, R.string.Lark_Notification_Mail), UIUtils.getString(context, R.string.Lark_Notification_MailDescription), null, false), false);
        m191152a(context, new C48451d("vc_foreground", UIUtils.getString(context, R.string.Lark_Notification_MessageOngoingCalls), null, null, false), false);
        m191154a(context, "normal");
        m191154a(context, "at");
        m191154a(context, "ding");
        m191154a(context, "scheduleReminder");
        m191155a("normal_v2");
        m191155a("at_v2");
        m191155a("ding_v2");
        m191155a("scheduleCalReminder");
        m191155a("newMail");
        m191155a("vc_foreground");
    }

    /* renamed from: a */
    private static C48451d m191151a(Context context, C48451d dVar) {
        return m191152a(context, dVar, true);
    }

    /* renamed from: a */
    private static void m191154a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            C57823a.m224448a(context).mo196177b(str);
        }
    }

    /* renamed from: a */
    private static Uri m191150a(Context context, int i) {
        return Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + context.getResources().getResourceEntryName(i));
    }

    /* renamed from: a */
    private static C48451d m191152a(Context context, C48451d dVar, boolean z) {
        if (Build.VERSION.SDK_INT >= 26 && C57823a.m224448a(context).mo196172a(dVar.mo169514a()) == null) {
            boolean e = dVar.mo169518e();
            if (z && !dVar.mo169514a().equals("progress")) {
                AbstractC48407a.AbstractC48427o d = C48398a.m190922a().mo169341d();
                e = d.mo169418b() && d.mo169421c();
            }
            C57823a.m224448a(context).mo196175a(dVar.mo169514a(), dVar.mo169515b(), dVar.mo169516c(), dVar.mo169517d(), e);
        }
        f121947a.put(dVar.mo169514a(), dVar);
        return dVar;
    }
}
