package com.ss.android.lark.notification.p2376a;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.export.entity.NotificationParam;
import com.ss.android.lark.notification.p2376a.p2377a.C48400a;
import com.ss.android.lark.p2392o.AbstractC48702k;
import com.ss.android.lark.utils.p2908e.C57823a;

/* renamed from: com.ss.android.lark.notification.a.c */
public class C48403c extends AbstractNotification.AbstractNotificationDisplayer<C48400a> {

    /* renamed from: a */
    public Context f121879a = C29990c.m110930b().mo134528a();

    /* renamed from: b */
    private AbstractC36474h.AbstractC36476b f121880b = C29990c.m110930b().aa();

    /* renamed from: c */
    private AbstractC36474h.AbstractC36486l f121881c = C29990c.m110930b().ad();

    /* renamed from: a */
    public int mo131697a(C48400a aVar) {
        return 0;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C48400a> mo31144a() {
        return new AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C48400a>() {
            /* class com.ss.android.lark.notification.p2376a.C48403c.C484041 */

            /* renamed from: a */
            public void mo31149a(C48400a aVar) {
                C57823a.m224448a(C48403c.this.f121879a).mo196171a(new NotificationParam.C48498a(aVar.f122060c, aVar.f122061d).mo169572a(aVar.f122062e).mo169571a(aVar.f122065h).mo169573a(C48403c.this.f121879a, aVar.f122069l).mo169576a(aVar.f122068k).mo169580b(aVar.f122063f).mo169583c(aVar.f122064g).mo169577a(aVar.f122067j).mo169581b(true).mo169575a(aVar.f122066i).mo169582c(aVar.f122070m).mo169586f(aVar.f122071n).mo169578a());
            }
        };
    }

    /* renamed from: b */
    public C48400a mo31147c(Notice notice) {
        return new C48401b(notice).mo169330b();
    }

    /* renamed from: d */
    private boolean m190956d(Notice notice) {
        if (!notice.shouldNotify) {
            return false;
        }
        if (!this.f121880b.mo134606a()) {
            return true;
        }
        return m190957e(notice);
    }

    /* renamed from: e */
    private boolean m190957e(Notice notice) {
        Activity b = this.f121880b.mo134607b();
        if (b == null || !(b instanceof AbstractC48702k)) {
            return true;
        }
        return ((AbstractC48702k) b).mo129676a(notice.extra.f122004c);
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public boolean mo31145a(Notice notice) {
        Log.m165389i("ChatApplyNotification", "[Push notify] : Notice key = " + notice.key + " Notice chat Id = " + notice.extra.f122004c + " should show: " + m190956d(notice) + "; sdk = " + notice.shouldNotify + "; foreground = " + this.f121880b.mo134606a() + "; isCurrentNotifiable = " + m190957e(notice) + "\n setting detail: " + this.f121881c.mo134635c(notice.type));
        return m190956d(notice);
    }
}
