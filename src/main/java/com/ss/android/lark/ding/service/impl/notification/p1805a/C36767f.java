package com.ss.android.lark.ding.service.impl.notification.p1805a;

import com.ss.android.lark.ding.C36618a;
import com.ss.android.lark.ding.dependency.IDingModuleDependency;
import com.ss.android.lark.ding.service.impl.notification.C36759a;
import com.ss.android.lark.ding.service.impl.notification.entity.C36774a;
import com.ss.android.lark.ding.service.impl.notification.entity.UrgentNotice;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;

/* renamed from: com.ss.android.lark.ding.service.impl.notification.a.f */
public class C36767f extends AbstractNotification.AbstractNotificationDisplayer<C36774a> {

    /* renamed from: a */
    private IDingModuleDependency.AbstractC36634k f94477a = C36618a.m144492a().mo135105j();

    /* renamed from: a */
    public int mo131697a(C36774a aVar) {
        return 0;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C36774a> mo31144a() {
        return new C36759a();
    }

    /* renamed from: b */
    public C36774a mo31147c(Notice notice) {
        return new C36764c((UrgentNotice) notice).mo135454b();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public boolean mo31145a(Notice notice) {
        Log.m165389i("UrgentNotification", "[Push notify] : Notice key = " + notice.key + " Notice message Id = " + notice.messageId + " Notice urgent Id = " + notice.extra.f122003b + " Notice Id" + notice.key + " Push notify : " + notice.shouldNotify + "\n setting detail: " + this.f94477a.mo135163c(3));
        return notice.shouldNotify;
    }
}
