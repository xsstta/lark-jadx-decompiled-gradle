package com.ss.android.lark.mail.impl.badge;

import androidx.lifecycle.C1177w;
import com.bytedance.ee.log.C13479a;
import com.bytedance.lark.pb.email.client.v1.MailGetUnreadCountResponse;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.BadgeCountState;
import com.ss.android.lark.mail.impl.entity.C42089c;
import com.ss.android.lark.mail.impl.p2161a.C41772a;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.service.p2215a.C43306j;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43314aa;
import com.ss.android.lark.mail.impl.utils.C43849u;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.mail.impl.badge.a */
public class C41832a implements AbstractC43314aa {

    /* renamed from: a */
    public C1177w<C42089c> f106192a;

    /* renamed from: b */
    public C42089c.C42091a f106193b;

    /* renamed from: c */
    private C43849u.C43850a f106194c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.badge.a$a */
    public static class C41836a {

        /* renamed from: a */
        public static final C41832a f106198a = new C41832a();
    }

    /* renamed from: a */
    public static C41832a m166157a() {
        return C41836a.f106198a;
    }

    /* renamed from: d */
    public C1177w<C42089c> mo150418d() {
        return this.f106192a;
    }

    /* renamed from: f */
    private void m166158f() {
        C13479a.m54764b("MailBadgeMgr", "reset badge");
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.badge.C41832a.RunnableC418342 */

            public void run() {
                synchronized (C41832a.this.f106193b) {
                    C41832a.this.f106193b.mo151836a(0).mo151837a(BadgeCountState.RED).mo151840b(new HashMap()).mo151838a(new HashMap());
                }
                C41832a.this.mo150419e();
            }
        });
    }

    /* renamed from: e */
    public void mo150419e() {
        C43849u.m173823a(this.f106194c, new Runnable() {
            /* class com.ss.android.lark.mail.impl.badge.C41832a.RunnableC418353 */

            public void run() {
                C13479a.m54764b("MailBadgeMgr", "apply mail badge change");
                C41832a.this.f106192a.mo5926a(C41832a.this.f106193b.mo151839a());
            }
        });
    }

    private C41832a() {
        this.f106192a = new C41772a();
        this.f106193b = new C42089c.C42091a();
        this.f106194c = new C43849u.C43850a("BadgeMgr_Limit", LocationRequest.PRIORITY_HD_ACCURACY);
        Watchers.m167206a(this);
    }

    /* renamed from: b */
    public void mo150416b() {
        C13479a.m54764b("MailBadgeMgr", "clearCache, reset mail badge");
        m166158f();
        this.f106194c.mo156222a(false);
    }

    /* renamed from: c */
    public void mo150417c() {
        C13479a.m54764b("MailBadgeMgr", "reload mail badge");
        C42176e.m168344a().mo152245c(true, (IGetDataCallback<MailGetUnreadCountResponse>) new IGetDataCallback<MailGetUnreadCountResponse>() {
            /* class com.ss.android.lark.mail.impl.badge.C41832a.C418331 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(MailGetUnreadCountResponse mailGetUnreadCountResponse) {
                int i;
                C13479a.m54764b("MailBadgeMgr", "reload mail badge, onSuccess " + mailGetUnreadCountResponse.unread_count);
                if (mailGetUnreadCountResponse.unread_count != null) {
                    i = mailGetUnreadCountResponse.unread_count.intValue();
                } else {
                    i = 0;
                }
                HashMap hashMap = new HashMap();
                if (mailGetUnreadCountResponse.unread_count_map != null) {
                    for (String str : mailGetUnreadCountResponse.unread_count_map.keySet()) {
                        hashMap.put(str, Integer.valueOf(mailGetUnreadCountResponse.unread_count_map.get(str).intValue()));
                    }
                }
                BadgeCountState a = C43306j.m172026a(mailGetUnreadCountResponse.tab_unread_color);
                HashMap hashMap2 = new HashMap();
                if (mailGetUnreadCountResponse.color_map != null) {
                    for (String str2 : mailGetUnreadCountResponse.color_map.keySet()) {
                        hashMap2.put(str2, C43306j.m172026a(mailGetUnreadCountResponse.color_map.get(str2)));
                    }
                }
                synchronized (C41832a.this.f106193b) {
                    C41832a.this.f106193b.mo151836a(i).mo151837a(a).mo151840b(hashMap).mo151838a(hashMap2);
                }
                C41832a.this.mo150419e();
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43314aa
    /* renamed from: a */
    public void mo150415a(int i, BadgeCountState badgeCountState, Map<String, Integer> map, Map<String, BadgeCountState> map2) {
        C13479a.m54764b("MailBadgeMgr", "onUnReadCountChange, update mail badge unread count, count=" + i + ", state = " + badgeCountState);
        synchronized (this.f106193b) {
            this.f106193b.mo151836a(i).mo151837a(badgeCountState).mo151840b(map).mo151838a(map2);
        }
        mo150419e();
    }
}
