package com.ss.android.lark.contact.impl.p1754d;

import android.content.Context;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.p1754d.p1755a.C35788a;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.export.entity.NotificationParam;
import com.ss.android.lark.utils.p2908e.C57823a;

/* renamed from: com.ss.android.lark.contact.impl.d.c */
public class C35790c extends AbstractNotification.AbstractNotificationDisplayer<C35788a> {

    /* renamed from: a */
    public Context f92526a = C35358a.m138143a().mo130143a();

    /* renamed from: b */
    private AbstractC35361b.AbstractC35363b f92527b = C35358a.m138143a().mo130169n();

    /* renamed from: c */
    private AbstractC35361b.AbstractC35377p f92528c = C35358a.m138143a().mo130170o();

    /* renamed from: a */
    public int mo131697a(C35788a aVar) {
        return 0;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C35788a> mo31144a() {
        return new AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C35788a>() {
            /* class com.ss.android.lark.contact.impl.p1754d.C35790c.C357911 */

            /* renamed from: a */
            public void mo31149a(C35788a aVar) {
                C57823a.m224448a(C35790c.this.f92526a).mo196171a(new NotificationParam.C48498a(aVar.f122060c, aVar.f122061d).mo169572a(aVar.f122062e).mo169571a(aVar.f122065h).mo169573a(C35790c.this.f92526a, aVar.f122069l).mo169576a(aVar.f122068k).mo169580b(aVar.f122063f).mo169583c(aVar.f122064g).mo169577a(aVar.f122067j).mo169581b(true).mo169575a(aVar.f122066i).mo169582c(aVar.f122070m).mo169586f(aVar.f122071n).mo169578a());
            }
        };
    }

    /* renamed from: b */
    public C35788a mo31147c(Notice notice) {
        return new C35789b(notice).mo131695b();
    }

    /* renamed from: d */
    private boolean m140072d(Notice notice) {
        if (notice.shouldNotify && !this.f92527b.mo130184a()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public boolean mo31145a(Notice notice) {
        Log.m165389i("NewContactNotification", "[Push notify] : show = ; sdk = " + notice.shouldNotify + "; foreground = " + this.f92527b.mo130184a() + "\n setting detail: " + this.f92528c.mo130239c(notice.type));
        return m140072d(notice);
    }
}
