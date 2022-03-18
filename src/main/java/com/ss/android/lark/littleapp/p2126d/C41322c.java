package com.ss.android.lark.littleapp.p2126d;

import android.content.Context;
import com.ss.android.lark.littleapp.C41354g;
import com.ss.android.lark.littleapp.p2124b.AbstractC41301a;
import com.ss.android.lark.littleapp.p2126d.p2127a.C41320a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.export.entity.NotificationParam;
import com.ss.android.lark.utils.p2908e.C57823a;

/* renamed from: com.ss.android.lark.littleapp.d.c */
public class C41322c extends AbstractNotification.AbstractNotificationDisplayer<C41320a> {

    /* renamed from: a */
    public final Context f105108a = C41354g.m163939a().getContext();

    /* renamed from: b */
    private final AbstractC41301a.AbstractC41304c f105109b = C41354g.m163939a().getAppStateDependency();

    /* renamed from: c */
    private final AbstractC41301a.AbstractC41308g f105110c = C41354g.m163939a().getNotificationDependency();

    /* renamed from: a */
    public int mo131697a(C41320a aVar) {
        return 0;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C41320a> mo31144a() {
        return new AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C41320a>() {
            /* class com.ss.android.lark.littleapp.p2126d.C41322c.C413231 */

            /* renamed from: a */
            public void mo31149a(C41320a aVar) {
                C57823a.m224448a(C41322c.this.f105108a).mo196171a(new NotificationParam.C48498a(aVar.f122060c, aVar.f122061d).mo169572a(aVar.f122062e).mo169571a(aVar.f122065h).mo169574a(aVar.f105101a).mo169576a(aVar.f122068k).mo169580b(aVar.f122063f).mo169583c(aVar.f122064g).mo169577a(aVar.f122067j).mo169581b(true).mo169575a(aVar.f122066i).mo169582c(aVar.f122070m).mo169586f(aVar.f122071n).mo169578a());
            }
        };
    }

    /* renamed from: d */
    private boolean m163802d(Notice notice) {
        if (!notice.shouldNotify) {
            return false;
        }
        return !this.f105109b.mo144237a();
    }

    /* renamed from: b */
    public C41320a mo31147c(Notice notice) {
        return new C41321b(notice).mo148762b();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public boolean mo31145a(Notice notice) {
        Log.m165389i("LittleAppNotification", "[Push notify] :Notice key = " + notice.key + "Notice app Id = " + notice.messageId + "; sdk = " + notice.shouldNotify + "; foreground = " + this.f105109b.mo144237a() + "\n setting detail: " + this.f105110c.mo144235c(10));
        return m163802d(notice);
    }
}
