package com.ss.android.vc.lark.notification.prompt;

import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.prompt.VCPromptManager;

/* renamed from: com.ss.android.vc.lark.notification.prompt.d */
public class C61162d implements AbstractNotification.AbstractC48495b<CalendarPromptNotice> {
    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48495b
    /* renamed from: b */
    public int mo31139b(Notice notice) {
        if (notice == null || notice.extra == null || notice.state != 3) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a */
    public CalendarPromptNotice mo31140c(Notice notice) {
        if (notice == null) {
            return null;
        }
        C60700b.m235851b("PromptLog_CalendarPromptNotificationDataPacker", "[prepareData]", "notice.key = " + notice.key);
        return new CalendarPromptNotice(notice, VCPromptManager.m245671a().mo216814a(notice.key));
    }
}
