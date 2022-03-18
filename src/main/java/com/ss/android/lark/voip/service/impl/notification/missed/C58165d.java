package com.ss.android.lark.voip.service.impl.notification.missed;

import android.content.Context;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.export.entity.NotificationParam;
import com.ss.android.lark.utils.p2908e.C57823a;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.p2911a.AbstractC57987d;
import com.ss.android.lark.voip.service.impl.notification.missed.entity.C58167a;
import com.ss.android.lark.voip.service.impl.notification.missed.entity.VoipNotice;

/* renamed from: com.ss.android.lark.voip.service.impl.notification.missed.d */
public class C58165d extends AbstractNotification.AbstractNotificationDisplayer<C58167a> {

    /* renamed from: a */
    public Context f143082a = C57977a.m224905c().getContext();

    /* renamed from: b */
    private AbstractC57987d.AbstractC57995f f143083b = C57977a.m224905c().getNotificationDependency();

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C58167a> mo31144a() {
        return new AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C58167a>() {
            /* class com.ss.android.lark.voip.service.impl.notification.missed.C58165d.C581661 */

            /* renamed from: a */
            public void mo31149a(C58167a aVar) {
                if (aVar != null) {
                    C57823a.m224448a(C58165d.this.f143082a).mo196171a(new NotificationParam.C48498a(aVar.f122060c, aVar.f122061d).mo169572a(aVar.f122062e).mo169571a(aVar.f122065h).mo169573a(C58165d.this.f143082a, aVar.f122069l).mo169576a(aVar.f122068k).mo169580b(aVar.f122063f).mo169583c(aVar.f122064g).mo169577a(aVar.f122067j).mo169581b(true).mo169575a(aVar.f122066i).mo169586f(aVar.f122071n).mo169578a());
                }
            }
        };
    }

    /* renamed from: b */
    public C58167a mo31147c(Notice notice) {
        return new C58162b((VoipNotice) notice).mo197071b();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public boolean mo31145a(Notice notice) {
        Log.m165389i("VoipNotification", "[Push notify] show: true; callId: " + notice.key + "; \n setting detail: " + this.f143083b.mo145493c(notice.type));
        return true;
    }
}
