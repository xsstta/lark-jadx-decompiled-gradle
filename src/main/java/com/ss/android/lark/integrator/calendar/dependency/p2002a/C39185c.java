package com.ss.android.lark.integrator.calendar.dependency.p2002a;

import android.content.Context;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.integrator.calendar.dependency.p2002a.p2003a.C39183a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.export.entity.NotificationParam;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.p2908e.C57823a;

/* renamed from: com.ss.android.lark.integrator.calendar.dependency.a.c */
public class C39185c extends AbstractNotification.AbstractNotificationDisplayer<C39183a> {

    /* renamed from: a */
    public Context f100470a = LarkContext.getApplication();

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C39183a> mo31144a() {
        return new AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C39183a>() {
            /* class com.ss.android.lark.integrator.calendar.dependency.p2002a.C39185c.C391861 */

            /* renamed from: a */
            public void mo31149a(C39183a aVar) {
                C57823a.m224448a(C39185c.this.f100470a).mo196171a(new NotificationParam.C48498a(aVar.f122060c, aVar.f122061d).mo169572a(aVar.f122062e).mo169571a(aVar.f122065h).mo169573a(C39185c.this.f100470a, aVar.f122069l).mo169576a(aVar.f122068k).mo169580b(aVar.f122063f).mo169583c(aVar.f122064g).mo169584d(aVar.f100466a).mo169577a(aVar.f122067j).mo169581b(true).mo169575a(aVar.f122066i).mo169582c(aVar.f122070m).mo169586f(aVar.f122071n).mo169578a());
            }
        };
    }

    /* renamed from: b */
    public C39183a mo31147c(Notice notice) {
        return new C39184b(notice).mo143024b();
    }

    /* renamed from: d */
    private boolean m154540d(Notice notice) {
        if (!notice.shouldNotify) {
            return false;
        }
        return !C29410a.m108289c().mo104288b();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public boolean mo31145a(Notice notice) {
        Log.m165389i("CalendarRemindNotification", "[Push notify] :Notice key = " + notice.key + " Notice message Id = " + notice.messageId + " Push notify :" + m154540d(notice) + "; sdk = " + notice.shouldNotify + "; foreground = " + C29410a.m108289c().mo104288b() + "\n setting detail: " + ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getDetail("scheduleCalReminder").toString());
        return m154540d(notice);
    }
}
