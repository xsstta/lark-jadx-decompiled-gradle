package com.ss.android.lark.notification.reaction;

import android.app.Activity;
import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chatthread.ChatThreadActivity;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.export.entity.NotificationParam;
import com.ss.android.lark.notification.reaction.entity.C48564a;
import com.ss.android.lark.notification.reaction.entity.ReactionNotice;
import com.ss.android.lark.p2392o.AbstractC48702k;
import com.ss.android.lark.utils.p2908e.C57823a;

/* renamed from: com.ss.android.lark.notification.reaction.e */
public class C48562e extends AbstractNotification.AbstractNotificationDisplayer<C48564a> {

    /* renamed from: a */
    public Context f122204a = C29990c.m110930b().mo134528a();

    /* renamed from: b */
    private AbstractC36474h.AbstractC36486l f122205b = C29990c.m110930b().ad();

    /* renamed from: c */
    private AbstractC36474h.AbstractC36476b f122206c = C29990c.m110930b().aa();

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C48564a> mo31144a() {
        return new AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<C48564a>() {
            /* class com.ss.android.lark.notification.reaction.C48562e.C485631 */

            /* renamed from: a */
            public void mo31149a(C48564a aVar) {
                NotificationParam.C48498a f = new NotificationParam.C48498a(aVar.f122060c, aVar.f122061d).mo169572a(aVar.f122062e).mo169571a(aVar.f122065h).mo169583c(aVar.f122064g).mo169580b(aVar.f122063f).mo169576a(aVar.f122068k).mo169577a(aVar.f122067j).mo169581b(true).mo169575a(aVar.f122066i).mo169582c(aVar.f122070m).mo169586f(aVar.f122071n);
                if (aVar.f122208a != null) {
                    C57823a.m224448a(C48562e.this.f122204a).mo196171a(f.mo169574a(aVar.f122208a).mo169578a());
                    return;
                }
                C57823a.m224448a(C48562e.this.f122204a).mo196171a(f.mo169573a(C48562e.this.f122204a, R.drawable.ic_launcher).mo169578a());
            }
        };
    }

    /* renamed from: a */
    public int mo131697a(C48564a aVar) {
        if (aVar.f122070m == 0) {
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    public C48564a mo31147c(Notice notice) {
        return new C48560c((ReactionNotice) notice).mo169639b();
    }

    /* renamed from: d */
    private boolean m191448d(Notice notice) {
        if (!notice.shouldNotify) {
            return false;
        }
        if (!this.f122206c.mo134606a()) {
            return true;
        }
        return m191449e(notice);
    }

    /* renamed from: e */
    private boolean m191449e(Notice notice) {
        Activity b = this.f122206c.mo134607b();
        if (b == null) {
            return true;
        }
        if (b instanceof ChatThreadActivity) {
            Log.m165389i("ReactionNotice", "in ChatThreadActivity");
            return false;
        } else if (!(b instanceof AbstractC48702k)) {
            return true;
        } else {
            Log.m165389i("ReactionNotice", "in the current chat");
            return ((AbstractC48702k) b).mo129676a(notice.extra.f122004c);
        }
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractNotificationDisplayer
    /* renamed from: a */
    public boolean mo31145a(Notice notice) {
        Log.m165389i("ReactionNotice", "[Push notify] : Notice key = " + notice.key + " Notice message Id = " + notice.messageId + " Push notify :" + m191448d(notice) + "; sdk = " + notice.shouldNotify + "; foreground = " + this.f122206c.mo134606a() + "; is current notifiable = " + m191449e(notice) + "\n setting detail: " + this.f122205b.mo134635c(notice.type));
        return m191448d(notice);
    }
}
