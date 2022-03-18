package com.ss.android.lark.notification.offline;

import android.app.Notification;
import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.dto.C48443b;
import com.ss.android.lark.notification.dto.OfflineNotice;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.export.entity.NotificationParam;
import com.ss.android.lark.notification.p2378b.AbstractC48407a;
import com.ss.android.lark.notification.p2382e.C48468k;
import com.ss.android.lark.utils.p2908e.C57823a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.notification.offline.f */
public class C48549f extends AbstractNotification.AbstractNotificationDisplayer<C48443b> {

    /* renamed from: a */
    public Context f122149a = C48398a.m190922a().mo169335a();

    /* renamed from: b */
    public AbstractC48407a.AbstractC48410b f122150b = C48398a.m190922a().mo169356s();

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C48443b> mo31144a() {
        return new AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C48443b>() {
            /* class com.ss.android.lark.notification.offline.C48549f.C485501 */

            /* renamed from: a */
            public void mo31149a(C48443b bVar) {
                if (bVar == null || bVar.f122062e == null || TextUtils.isEmpty(bVar.f122064g)) {
                    Log.m165383e("OfflinePushNotification", "offline push notification intent is invalid");
                    return;
                }
                Notification a = C57823a.m224448a(C48549f.this.f122149a).mo196171a(new NotificationParam.C48498a(bVar.f122060c, String.valueOf(bVar.f122060c)).mo169572a(bVar.f122062e).mo169571a(bVar.f122065h).mo169586f(bVar.f122071n).mo169573a(C48549f.this.f122149a, bVar.f122069l).mo169576a(bVar.f122068k).mo169580b(bVar.f122063f).mo169583c(bVar.f122064g).mo169577a(bVar.f122067j).mo169581b(true).mo169575a(bVar.f122066i).mo169578a());
                if (!C48398a.m190922a().mo169352o().mo169386a("lark.badge.odex") || (!RomUtils.m94948e() && !RomUtils.m94940b())) {
                    C48549f.this.f122150b.mo169361a(a, 1);
                    C48549f.this.f122150b.mo169362a(C48549f.this.f122149a, C48549f.this.f122150b.mo169360a());
                }
            }
        };
    }

    /* renamed from: b */
    public C48443b mo31147c(Notice notice) {
        return new C48548e((OfflineNotice) notice).mo169632b();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public boolean mo31145a(Notice notice) {
        OfflineNotice offlineNotice = (OfflineNotice) notice;
        if (TextUtils.isEmpty(offlineNotice.content)) {
            Log.m165383e("OfflinePushNotification", "offline push has no title and content -- sid = " + offlineNotice.getMsgSid());
            return false;
        } else if (!offlineNotice.isExistBusinessInfo()) {
            return true;
        } else {
            long sendTimeStamp = offlineNotice.getSendTimeStamp();
            Log.m165378d("packet = " + offlineNotice.getPacketStr());
            if (sendTimeStamp == 0 || C26279i.m95159b() - sendTimeStamp <= 1800) {
                Log.m165389i("OfflinePushNotification", "[Push notify] : Sid:" + offlineNotice.getMsgSid() + " Rid:" + offlineNotice.getRuleId() + " Time:" + offlineNotice.getSendTimeStamp() + "\n setting detail: " + C48468k.m191156a().mo105560a("normal_v2"));
                return true;
            }
            Log.m165383e("OfflinePushNotification", "offline push too late -- sid = " + offlineNotice.getMsgSid());
            return false;
        }
    }
}
