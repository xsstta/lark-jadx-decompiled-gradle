package com.ss.android.lark.notification.p2380d;

import android.content.Context;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.export.entity.NotificationParam;
import com.ss.android.lark.notification.p2380d.p2381a.C48437a;
import com.ss.android.lark.utils.p2908e.C57823a;

/* renamed from: com.ss.android.lark.notification.d.c */
public class C48439c extends AbstractNotification.AbstractNotificationDisplayer<C48437a> {

    /* renamed from: a */
    public Context f121906a = C29990c.m110930b().mo134528a();

    /* renamed from: b */
    private AbstractC36474h.AbstractC36486l f121907b = C29990c.m110930b().ad();

    /* renamed from: a */
    public int mo131697a(C48437a aVar) {
        return 0;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C48437a> mo31144a() {
        return new AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C48437a>() {
            /* class com.ss.android.lark.notification.p2380d.C48439c.C484401 */

            /* renamed from: a */
            public void mo31149a(C48437a aVar) {
                C57823a.m224448a(C48439c.this.f121906a).mo196171a(new NotificationParam.C48498a(aVar.f122060c, aVar.f122061d).mo169572a(aVar.f122062e).mo169571a(aVar.f122065h).mo169573a(C48439c.this.f121906a, aVar.f122069l).mo169576a(aVar.f122068k).mo169580b(aVar.f122063f).mo169583c(aVar.f122064g).mo169577a(aVar.f122067j).mo169581b(true).mo169575a(aVar.f122066i).mo169582c(aVar.f122070m).mo169586f(aVar.f122071n).mo169578a());
            }
        };
    }

    /* renamed from: b */
    public C48437a mo31147c(Notice notice) {
        return new C48438b(notice).mo169445b();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public boolean mo31145a(Notice notice) {
        Log.m165389i("FailedNotification", "[Push notify] : Notice key = " + notice.key + " Notice message Id = " + notice.messageId + " show: true \n setting detail: " + this.f121907b.mo134635c(notice.type));
        return true;
    }
}
