package com.ss.android.lark.integrator.todo.p2047a.p2048a;

import android.content.Context;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.integrator.todo.p2047a.p2048a.p2049a.C40047a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.export.entity.NotificationParam;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.p2908e.C57823a;

/* renamed from: com.ss.android.lark.integrator.todo.a.a.c */
public class C40049c extends AbstractNotification.AbstractNotificationDisplayer<C40047a> {

    /* renamed from: a */
    public Context f101789a = LarkContext.getApplication();

    /* renamed from: b */
    private ICoreApi f101790b = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C40047a> mo31144a() {
        return new AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C40047a>() {
            /* class com.ss.android.lark.integrator.todo.p2047a.p2048a.C40049c.C400501 */

            /* renamed from: a */
            public void mo31149a(C40047a aVar) {
                C57823a.m224448a(C40049c.this.f101789a).mo196171a(new NotificationParam.C48498a(aVar.f122060c, aVar.f122061d).mo169572a(aVar.f122062e).mo169571a(aVar.f122065h).mo169573a(C40049c.this.f101789a, aVar.f122069l).mo169576a(aVar.f122068k).mo169580b(aVar.f122063f).mo169583c(aVar.f122064g).mo169584d(aVar.f101785a).mo169577a(aVar.f122067j).mo169581b(true).mo169575a(aVar.f122066i).mo169582c(aVar.f122070m).mo169586f(aVar.f122071n).mo169578a());
            }
        };
    }

    /* renamed from: d */
    private boolean m158714d(Notice notice) {
        if (!notice.shouldNotify) {
            return false;
        }
        return !this.f101790b.isAppRealForeground();
    }

    /* renamed from: b */
    public C40047a mo31147c(Notice notice) {
        return new C40048b(notice).mo145360b();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public boolean mo31145a(Notice notice) {
        Log.m165389i("TodoRemindNotificationDisplayer", "[Push notify] :Notice key = " + notice.key + " Notice message Id = " + notice.messageId + " Push notify :" + m158714d(notice) + "; sdk = " + notice.shouldNotify + "; foreground = " + this.f101790b.isAppRealForeground() + "\n setting detail: " + this.f101790b.getDetail("scheduleCalReminder").toString());
        return m158714d(notice);
    }
}
