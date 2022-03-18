package com.ss.android.lark.voip.service.impl.notification.p2917a;

import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.export.entity.NotificationParam;
import com.ss.android.lark.utils.p2908e.C57823a;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.p2911a.AbstractC57987d;
import com.ss.android.lark.voip.service.impl.notification.p2917a.p2918a.C58155a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.ar;

/* renamed from: com.ss.android.lark.voip.service.impl.notification.a.e */
public class C58159e extends AbstractNotification.AbstractNotificationDisplayer<C58155a> {

    /* renamed from: a */
    private AbstractC57987d.AbstractC57995f f143068a = C57977a.m224905c().getNotificationDependency();

    /* renamed from: a */
    public int mo131697a(C58155a aVar) {
        return 0;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C58155a> mo31144a() {
        return new AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C58155a>() {
            /* class com.ss.android.lark.voip.service.impl.notification.p2917a.C58159e.C581601 */

            /* renamed from: a */
            public void mo31149a(C58155a aVar) {
                if (aVar != null) {
                    C60700b.m235851b("VoipRingNotification", "[showNotification]", "content = " + aVar.f122064g);
                    C57823a.m224448a(ar.m236694a()).mo196171a(new NotificationParam.C48498a(aVar.f122060c, aVar.f122061d).mo169572a(aVar.f122062e).mo169571a(aVar.f122065h).mo169574a(aVar.f143060a).mo169576a(aVar.f122068k).mo169580b(aVar.f122063f).mo169583c(aVar.f122064g).mo169577a(aVar.f122067j).mo169581b(true).mo169575a(aVar.f122066i).mo169586f(aVar.f122071n).mo169582c(aVar.f122070m).mo169578a());
                }
            }
        };
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public boolean mo31145a(Notice notice) {
        C60700b.m235851b("VoipRingNotification", "[shouldDisplay]", "[Push notify] show : true; \n setting detail:" + this.f143068a.mo145493c(notice.type));
        return true;
    }

    /* renamed from: b */
    public C58155a mo31147c(Notice notice) {
        C60700b.m235851b("VoipRingNotification", "[packDisplayData]", "notice.key = " + notice.key);
        return new C58157c(notice).mo197067b();
    }
}
