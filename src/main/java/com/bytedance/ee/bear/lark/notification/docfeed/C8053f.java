package com.bytedance.ee.bear.lark.notification.docfeed;

import android.content.Context;
import com.bytedance.ee.bear.lark.notification.docfeed.entity.C8052a;
import com.bytedance.ee.bear.lark.notification.docfeed.entity.DocFeedNotice;
import com.bytedance.ee.bear.lark.p414b.AbstractC7989b;
import com.bytedance.ee.bear.lark.p414b.AbstractC8001l;
import com.bytedance.ee.bear.lark.p414b.AbstractC8007p;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.ss.android.lark.chat.entity.chat.ChatSetting;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.export.entity.NotificationParam;
import com.ss.android.lark.utils.p2908e.C57823a;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.lark.notification.docfeed.f */
public class C8053f extends AbstractNotification.AbstractNotificationDisplayer<C8052a> {

    /* renamed from: a */
    public Context f21574a;

    /* renamed from: b */
    private AbstractC8001l f21575b;

    /* renamed from: c */
    private AbstractC8007p f21576c;

    /* renamed from: d */
    private AbstractC7989b f21577d;

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C8052a> mo31144a() {
        return new AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C8052a>() {
            /* class com.bytedance.ee.bear.lark.notification.docfeed.C8053f.C80541 */

            /* renamed from: a */
            public void mo31149a(C8052a aVar) {
                C57823a.m224448a(C8053f.this.f21574a).mo196171a(new NotificationParam.C48498a(aVar.f122060c, aVar.f122061d).mo169572a(aVar.f122062e).mo169571a(aVar.f122065h).mo169573a(C8053f.this.f21574a, aVar.f122069l).mo169576a(aVar.f122068k).mo169580b(aVar.f122063f).mo169583c(aVar.f122064g).mo169577a(aVar.f122067j).mo169581b(true).mo169575a(aVar.f122066i).mo169582c(aVar.f122070m).mo169586f(aVar.f122071n).mo169578a());
            }
        };
    }

    public C8053f() {
        try {
            this.f21575b = (AbstractC8001l) KoinJavaComponent.m268610a(AbstractC8001l.class);
            this.f21576c = (AbstractC8007p) KoinJavaComponent.m268610a(AbstractC8007p.class);
            this.f21577d = (AbstractC7989b) KoinJavaComponent.m268610a(AbstractC7989b.class);
        } catch (Exception unused) {
            C13479a.m54758a("DocNotification", "DocNotificationDisplayer() koin error");
        }
        this.f21574a = C13615c.f35773a;
    }

    /* renamed from: b */
    public C8052a mo31147c(Notice notice) {
        return new C8049d((DocFeedNotice) notice).mo31125b();
    }

    /* renamed from: d */
    private boolean m32182d(Notice notice) {
        if (!notice.shouldNotify || this.f21577d == null || this.f21575b == null) {
            C13479a.m54764b("DocNotification", "shouldNotifyDocFeed(), mAppStateDependency=" + this.f21577d + " mMessagingDependency=" + this.f21575b);
            return false;
        }
        String str = notice.extra.f122014m;
        if (str == null) {
            return !this.f21577d.mo30981a();
        }
        ChatSetting b = this.f21575b.mo31012b(str);
        if ((b == null || b.isRemind()) && !this.f21577d.mo30981a()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public boolean mo31145a(Notice notice) {
        String str;
        boolean z = false;
        if (notice.extra.f122013l == 3) {
            StringBuilder sb = new StringBuilder();
            sb.append("[Push notify] : Notice key = ");
            sb.append(notice.key);
            sb.append("Notice message Id = ");
            sb.append(notice.messageId);
            sb.append(" Push notify :");
            sb.append(m32182d(notice));
            sb.append("; sdk = ");
            sb.append(notice.shouldNotify);
            sb.append("; foreground = ");
            AbstractC7989b bVar = this.f21577d;
            if (bVar != null && bVar.mo30981a()) {
                z = true;
            }
            sb.append(z);
            sb.append("\n setting detail: ");
            AbstractC8007p pVar = this.f21576c;
            if (pVar != null) {
                str = pVar.mo31021c(notice.type);
            } else {
                str = "koinerror";
            }
            sb.append(str);
            C13479a.m54764b("DocNotification", sb.toString());
            return m32182d(notice);
        }
        C13479a.m54758a("DocNotification", "docId is null!");
        return false;
    }
}
