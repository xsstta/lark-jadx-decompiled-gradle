package com.ss.android.lark.mail.p2158b;

import android.content.Context;
import android.os.PowerManager;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.mail.C41724a;
import com.ss.android.lark.mail.p2157a.AbstractC41740a;
import com.ss.android.lark.mail.p2158b.p2159a.C41762a;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.export.entity.NotificationParam;
import com.ss.android.lark.utils.p2908e.C57823a;

/* renamed from: com.ss.android.lark.mail.b.d */
public class C41765d extends AbstractNotification.AbstractNotificationDisplayer<C41762a> {

    /* renamed from: b */
    private static AbstractC41740a f106042b = C41724a.m165678a();

    /* renamed from: a */
    public Context f106043a;

    /* renamed from: c */
    private AbstractC41740a.AbstractC41757p f106044c = C41724a.m165678a().getNotificationDependency();

    /* renamed from: d */
    private AbstractC41740a.AbstractC41744c f106045d = C41724a.m165678a().getBadgeDependency();

    /* renamed from: e */
    private boolean f106046e;

    /* renamed from: f */
    private PowerManager f106047f;

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C41762a> mo31144a() {
        return new AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C41762a>() {
            /* class com.ss.android.lark.mail.p2158b.C41765d.C417661 */

            /* renamed from: a */
            public void mo31149a(C41762a aVar) {
                C13479a.m54764b("MailNotification", "showNotification data:" + aVar.f122063f);
                C57823a.m224448a(C41765d.this.f106043a).mo196171a(new NotificationParam.C48498a(aVar.f122060c, aVar.f122061d).mo169572a(aVar.f122062e).mo169571a(aVar.f122065h).mo169573a(C41765d.this.f106043a, aVar.f122069l).mo169576a(aVar.f122068k).mo169580b(aVar.f122063f).mo169583c(aVar.f122064g).mo169577a(aVar.f122067j).mo169581b(true).mo169575a(aVar.f122066i).mo169582c(aVar.f122070m).mo169586f(aVar.f122071n).mo169578a());
            }
        };
    }

    public C41765d() {
        Context appContext = C41724a.m165678a().getAppContext();
        this.f106043a = appContext;
        this.f106047f = (PowerManager) appContext.getSystemService("power");
        this.f106046e = C41724a.m165682h();
    }

    /* renamed from: b */
    public C41762a mo31147c(Notice notice) {
        return new C41763b(notice).mo150208b();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public boolean mo31145a(Notice notice) {
        boolean z;
        boolean isAppRealForeground = f106042b.isAppRealForeground();
        boolean z2 = true;
        try {
            z = this.f106047f.isScreenOn();
        } catch (Throwable th) {
            th.printStackTrace();
            z = true;
        }
        C13479a.m54764b("MailNotification", "[Push notify] : shouldDisplay mIsMailTabEnable:" + this.f106046e + " notice.shouldNotify:" + notice.shouldNotify + " isAppRealForeground:" + isAppRealForeground + " isScreenOn:" + z + "\n setting detail: " + this.f106044c.mo144443a(7));
        if (!this.f106046e || !notice.shouldNotify || (isAppRealForeground && z)) {
            z2 = false;
        }
        C13479a.m54764b("MailNotification", "[Push notify] : shouldDisplay = " + z2);
        return z2;
    }
}
