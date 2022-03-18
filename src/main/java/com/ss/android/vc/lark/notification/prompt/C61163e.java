package com.ss.android.vc.lark.notification.prompt;

import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.export.entity.NotificationParam;
import com.ss.android.lark.utils.p2908e.C57823a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.C60928a;

/* renamed from: com.ss.android.vc.lark.notification.prompt.e */
public class C61163e extends AbstractNotification.AbstractNotificationDisplayer<C60928a> {
    /* renamed from: a */
    public int mo131697a(C60928a aVar) {
        return 0;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public boolean mo31145a(Notice notice) {
        return true;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C60928a> mo31144a() {
        return new AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C60928a>() {
            /* class com.ss.android.vc.lark.notification.prompt.C61163e.C611641 */

            /* renamed from: a */
            public void mo31149a(C60928a aVar) {
                if (aVar != null) {
                    C60700b.m235851b("PromptLog_CalendarPromptNotificationDisplayer", "[showNotification]", "content = " + aVar.f122064g);
                    C57823a.m224448a(ar.m236694a()).mo196171a(new NotificationParam.C48498a(aVar.f122060c, aVar.f122061d).mo169572a(aVar.f122062e).mo169571a(aVar.f122065h).mo169574a(aVar.f152475a).mo169576a(aVar.f122068k).mo169580b(aVar.f122063f).mo169583c(aVar.f122064g).mo169577a(aVar.f122067j).mo169581b(true).mo169575a(aVar.f122066i).mo169586f(aVar.f122071n).mo169582c(aVar.f122070m).mo169578a());
                }
            }
        };
    }

    /* renamed from: b */
    public C60928a mo31147c(Notice notice) {
        C60700b.m235851b("PromptLog_CalendarPromptNotificationDisplayer", "[packDisplayData]", "notice.key = " + notice.key);
        return new C61161c((CalendarPromptNotice) notice).mo211463b();
    }
}
