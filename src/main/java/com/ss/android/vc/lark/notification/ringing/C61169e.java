package com.ss.android.vc.lark.notification.ringing;

import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.export.entity.NotificationParam;
import com.ss.android.lark.utils.p2908e.C57823a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.C60997u;

/* renamed from: com.ss.android.vc.lark.notification.ringing.e */
public class C61169e extends AbstractNotification.AbstractNotificationDisplayer<C60997u> {
    /* renamed from: a */
    public int mo131697a(C60997u uVar) {
        return 0;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public boolean mo31145a(Notice notice) {
        return true;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C60997u> mo31144a() {
        return new AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C60997u>() {
            /* class com.ss.android.vc.lark.notification.ringing.C61169e.C611701 */

            /* renamed from: a */
            public void mo31149a(C60997u uVar) {
                if (uVar != null) {
                    C60700b.m235851b("VCRingNotificationDisplayer", "[showNotification]", "content = " + uVar.f122064g);
                    C57823a.m224448a(ar.m236694a()).mo196171a(new NotificationParam.C48498a(uVar.f122060c, uVar.f122061d).mo169572a(uVar.f122062e).mo169571a(uVar.f122065h).mo169574a(uVar.f152835a).mo169576a(uVar.f122068k).mo169580b(uVar.f122063f).mo169583c(uVar.f122064g).mo169577a(uVar.f122067j).mo169581b(true).mo169575a(uVar.f122066i).mo169586f(uVar.f122071n).mo169582c(uVar.f122070m).mo169578a());
                }
            }
        };
    }

    /* renamed from: b */
    public C60997u mo31147c(Notice notice) {
        C60700b.m235851b("VCRingNotificationDisplayer", "[packDisplayData]", "notice.key = " + notice.key);
        return new C61167c(notice).mo211468b();
    }
}
