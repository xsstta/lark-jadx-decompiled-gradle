package com.bytedance.ee.bear.notification.p512a;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.notification.bean.Notification;
import com.bytedance.ee.bear.notification.bean.NotificationCloseStatus;
import com.bytedance.ee.bear.notification.bean.NotificationPushData;
import com.bytedance.ee.bear.rn.RnPushProtocol;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13722d;
import io.reactivex.functions.Consumer;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.notification.a.a */
public class C10302a implements RnPushProtocol.AbstractC10622a {

    /* renamed from: a */
    public AbstractC10306b f27803a;

    /* renamed from: b */
    private NetService f27804b;

    /* renamed from: com.bytedance.ee.bear.notification.a.a$b */
    public interface AbstractC10306b {
        /* renamed from: a */
        void mo39357a(Notification notification, boolean z);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.notification.a.a$a */
    public class C10305a extends TypeReference<NetService.Result<NotificationCloseStatus>> {
        private C10305a() {
        }
    }

    /* renamed from: c */
    private boolean m42940c(Notification notification) {
        boolean z;
        if (System.currentTimeMillis() <= notification.getEnd_time() * 1000) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C13479a.m54764b("NotificationPushObserve", "notification invalid");
        }
        return z;
    }

    /* renamed from: a */
    private Notification m42937a(String str) {
        NotificationPushData notificationPushData;
        if (str == null || (notificationPushData = (NotificationPushData) JSONObject.parseObject(str, NotificationPushData.class)) == null || notificationPushData.getData() == null || notificationPushData.getData().getBody() == null) {
            return null;
        }
        return (Notification) JSONObject.parseObject(notificationPushData.getData().getBody().getData(), Notification.class);
    }

    @Override // com.bytedance.ee.bear.rn.RnPushProtocol.AbstractC10622a
    public void didReceivePush(String str) {
        Notification a = m42937a(str);
        if (a != null && m42939b(a) && m42940c(a)) {
            if (a.getStatus() != 0) {
                this.f27803a.mo39357a(a, true);
            } else {
                m42938a(a);
            }
        }
    }

    /* renamed from: a */
    private void m42938a(final Notification notification) {
        NetService.AbstractC5075d a = this.f27804b.mo20118a(new C10305a().getType());
        NetService.C5077f fVar = new NetService.C5077f("/api/bulletin/close_status/");
        fVar.mo20145a("id", notification.getId());
        a.mo20141a(fVar).mo238001b(new Consumer<NetService.Result<NotificationCloseStatus>>() {
            /* class com.bytedance.ee.bear.notification.p512a.C10302a.C103031 */

            /* renamed from: a */
            public void accept(NetService.Result<NotificationCloseStatus> result) throws Exception {
                C10302a.this.f27803a.mo39357a(notification, result.getData().isClose());
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.notification.p512a.C10302a.C103042 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C13479a.m54759a("NotificationPushObserve", "checkCloseStatus fail", th);
            }
        });
    }

    /* renamed from: b */
    private boolean m42939b(Notification notification) {
        List<Notification.VersionBean> version = notification.getVersion();
        if (version == null) {
            C13479a.m54758a("NotificationPushObserve", "checkVersion, version is null!");
            return true;
        } else if (version.isEmpty()) {
            return true;
        } else {
            for (Notification.VersionBean versionBean : version) {
                if (C13722d.m55651a("", versionBean.getStart()) >= 0 && C13722d.m55651a("", versionBean.getEnd()) <= 0) {
                    return true;
                }
            }
            C13479a.m54764b("NotificationPushObserve", "no version-matched notification");
            return false;
        }
    }

    public C10302a(NetService netService, AbstractC10306b bVar) {
        this.f27804b = netService;
        this.f27803a = bVar;
    }
}
