package com.ss.android.lark.notification.p2383f;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.export.entity.NotificationParam;
import com.ss.android.lark.notification.p2383f.p2384a.C48502a;
import com.ss.android.lark.p2392o.AbstractC48702k;
import com.ss.android.lark.utils.p2908e.C57823a;

/* renamed from: com.ss.android.lark.notification.f.e */
public class C48508e extends AbstractNotification.AbstractNotificationDisplayer<C48502a> {

    /* renamed from: a */
    public AbstractC36474h.AbstractC36476b f122098a = C29990c.m110930b().aa();

    /* renamed from: b */
    public AbstractC36474h.AbstractC36477c f122099b = C29990c.m110930b().ac();

    /* renamed from: c */
    public Context f122100c = C29990c.m110930b().mo134528a();

    /* renamed from: d */
    private AbstractC36474h.AbstractC36486l f122101d = C29990c.m110930b().ad();

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C48502a> mo31144a() {
        return new AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C48502a>() {
            /* class com.ss.android.lark.notification.p2383f.C48508e.C485091 */

            /* renamed from: a */
            public void mo31149a(C48502a aVar) {
                C48508e.this.f122099b.mo134609a(C57823a.m224448a(C48508e.this.f122100c).mo196171a(new NotificationParam.C48498a(aVar.f122060c, aVar.f122061d).mo169572a(aVar.f122062e).mo169571a(aVar.f122065h).mo169574a(aVar.f122073a).mo169576a(aVar.f122068k).mo169580b(aVar.f122063f).mo169583c(aVar.f122064g).mo169585e(aVar.f122078r).mo169577a(aVar.f122067j).mo169581b(true).mo169575a(aVar.f122066i).mo169582c(aVar.f122070m).mo169586f(aVar.f122071n).mo169578a()), aVar.f122074b);
                if (!C48508e.this.f122098a.mo134606a()) {
                    C48508e.this.f122099b.mo134610a(C48508e.this.f122100c, C48508e.this.f122099b.mo134608a() + 1);
                }
            }
        };
    }

    /* renamed from: a */
    public int mo131697a(C48502a aVar) {
        if (aVar.f122070m == 0) {
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    public C48502a mo31147c(Notice notice) {
        return new C48504c(notice).mo169589b();
    }

    /* renamed from: e */
    private boolean m191288e(Notice notice) {
        Activity b = this.f122098a.mo134607b();
        if (b == null || !(b instanceof AbstractC48702k)) {
            return true;
        }
        Log.m165389i("MessageNotification", "in the current chat");
        return ((AbstractC48702k) b).mo129676a(notice.extra.f122004c);
    }

    /* renamed from: d */
    private boolean m191287d(Notice notice) {
        if (!notice.shouldNotify) {
            return false;
        }
        if (!this.f122098a.mo134606a()) {
            return true;
        }
        Activity b = this.f122098a.mo134607b();
        if (b == null || !(b instanceof AbstractC48702k)) {
            return m191288e(notice);
        }
        Log.m165389i("MessageNotification", "in the current chat");
        return ((AbstractC48702k) b).mo129676a(notice.extra.f122004c);
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public boolean mo31145a(Notice notice) {
        Log.m165389i("MessageNotification", "[Push notify] : Notice key = " + notice.key + "Notice message Id = " + notice.messageId + " Push notify :" + m191287d(notice) + "; sdk = " + notice.shouldNotify + "; foreground = " + this.f122098a.mo134606a() + "; is current notifiable = " + m191288e(notice) + "\n setting detail: " + this.f122101d.mo134635c(notice.type));
        return m191287d(notice);
    }
}
