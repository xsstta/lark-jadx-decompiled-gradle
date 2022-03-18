package com.ss.android.lark.mail.impl.message.recall.sender;

import android.content.Context;
import com.bytedance.lark.pb.email.client.v1.MailRecallMessageResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.C42097j;
import com.ss.android.lark.mail.impl.entity.EngagementSettings;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.service.C43362e;
import com.ss.android.lark.mail.impl.service.p2217b.p2219b.AbstractC43341c;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.message.recall.sender.a */
public class C42984a {

    /* renamed from: a */
    public final List<String> f109457a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.message.recall.sender.a$a */
    public static final class C42989a {

        /* renamed from: a */
        static C42984a f109464a = new C42984a();
    }

    /* renamed from: a */
    public static C42984a m171086a() {
        return C42989a.f109464a;
    }

    private C42984a() {
        this.f109457a = new ArrayList();
    }

    /* renamed from: com.ss.android.lark.mail.impl.message.recall.sender.a$2 */
    static /* synthetic */ class C429882 {

        /* renamed from: a */
        static final /* synthetic */ int[] f109463a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.mail.impl.message.recall.sender.a$b[] r0 = com.ss.android.lark.mail.impl.message.recall.sender.C42984a.EnumC42990b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.message.recall.sender.C42984a.C429882.f109463a = r0
                com.ss.android.lark.mail.impl.message.recall.sender.a$b r1 = com.ss.android.lark.mail.impl.message.recall.sender.C42984a.EnumC42990b.MAIL_MESSAGE_SENT_LONG_TIME_AGO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.message.recall.sender.C42984a.C429882.f109463a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.message.recall.sender.a$b r1 = com.ss.android.lark.mail.impl.message.recall.sender.C42984a.EnumC42990b.MAIL_MESSAGE_NOT_IN_SENT_STATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.message.recall.sender.C42984a.C429882.f109463a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.mail.impl.message.recall.sender.a$b r1 = com.ss.android.lark.mail.impl.message.recall.sender.C42984a.EnumC42990b.MAIL_MESSAGE_HAS_BEEN_RECALLED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.mail.impl.message.recall.sender.C42984a.C429882.f109463a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.mail.impl.message.recall.sender.a$b r1 = com.ss.android.lark.mail.impl.message.recall.sender.C42984a.EnumC42990b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.message.recall.sender.C42984a.C429882.<clinit>():void");
        }
    }

    /* renamed from: c */
    public boolean mo154141c(MailMessage mailMessage) {
        if (mailMessage.mo151551D().mo151640a() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.lark.mail.impl.message.recall.sender.a$b */
    enum EnumC42990b {
        MAIL_MESSAGE_SENT_LONG_TIME_AGO(480),
        MAIL_MESSAGE_NOT_IN_SENT_STATE(481),
        MAIL_MESSAGE_HAS_BEEN_RECALLED(482),
        UNKNOWN(0);
        
        int errorCode;

        public static EnumC42990b valueOf(int i) {
            EnumC42990b[] values = values();
            for (EnumC42990b bVar : values) {
                if (bVar.errorCode == i) {
                    return bVar;
                }
            }
            return UNKNOWN;
        }

        private EnumC42990b(int i) {
            this.errorCode = i;
        }
    }

    /* renamed from: e */
    public boolean mo154143e(MailMessage mailMessage) {
        if (!mo154140b(mailMessage) && !mo154138a(mailMessage) && !mo154141c(mailMessage)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public String mo154136a(int i) {
        if (i == 2) {
            return C43819s.m173684a((int) R.string.Mail_Recall_BannerRecalled);
        }
        if (i == 3) {
            return C43819s.m173684a((int) R.string.Mail_Recall_EmailRecalled);
        }
        if (i == 4) {
            return C43819s.m173684a((int) R.string.Mail_Recall_FailedToRecallEmail);
        }
        if (i != 5) {
            return C43819s.m173684a((int) R.string.Mail_Recall_BannerRecalling);
        }
        return C43819s.m173684a((int) R.string.Mail_Recall_SomeEmailsRecalled);
    }

    /* renamed from: b */
    public String mo154139b(int i) {
        if (i == 3) {
            return C43819s.m173684a((int) R.string.Mail_Recall_EmailRecalled);
        }
        if (i == 4) {
            return C43819s.m173684a((int) R.string.Mail_Recall_FailedToRecallEmail);
        }
        if (i != 5) {
            return C43819s.m173684a((int) R.string.Mail_Recall_BannerRecalled);
        }
        return C43819s.m173684a((int) R.string.Mail_Recall_SomeEmailsRecalled);
    }

    /* renamed from: d */
    public boolean mo154142d(MailMessage mailMessage) {
        EngagementSettings b = C43362e.m172201a().mo155089d().mo5927b();
        if (b == null || !b.mo151916g() || !C43350d.m172098a().mo155058x() || !mailMessage.mo151621u()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo154140b(MailMessage mailMessage) {
        if (mailMessage.mo151551D().mo151640a() == 2 || mailMessage.mo151551D().mo151640a() == 3 || mailMessage.mo151551D().mo151640a() == 4 || mailMessage.mo151551D().mo151640a() == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo154138a(MailMessage mailMessage) {
        boolean contains;
        if (mo154141c(mailMessage) || mo154140b(mailMessage)) {
            return false;
        }
        synchronized (this.f109457a) {
            contains = this.f109457a.contains(mailMessage.mo151581b());
        }
        return contains;
    }

    /* renamed from: a */
    public void mo154137a(Context context, C42097j jVar) {
        final String b = jVar.mo151964g().mo151581b();
        synchronized (this.f109457a) {
            if (!this.f109457a.contains(b)) {
                this.f109457a.add(b);
            }
        }
        ((AbstractC43341c) Watchers.m167205a(AbstractC43341c.class)).mo154468h(b);
        C42176e.m168344a().mo152263l(jVar.mo151964g().mo151581b(), new IGetDataCallback<MailRecallMessageResponse>() {
            /* class com.ss.android.lark.mail.impl.message.recall.sender.C42984a.C429851 */

            /* renamed from: a */
            public void onSuccess(MailRecallMessageResponse mailRecallMessageResponse) {
                C43849u.m173826a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.message.recall.sender.C42984a.C429851.RunnableC429861 */

                    public void run() {
                        C42984a.this.f109457a.remove(b);
                    }
                });
                ((AbstractC43341c) Watchers.m167205a(AbstractC43341c.class)).mo154469i(b);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(final ErrorResult errorResult) {
                synchronized (C42984a.this.f109457a) {
                    C42984a.this.f109457a.remove(b);
                }
                ((AbstractC43341c) Watchers.m167205a(AbstractC43341c.class)).mo154449a(b, errorResult);
                C43849u.m173826a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.message.recall.sender.C42984a.C429851.RunnableC429872 */

                    public void run() {
                        String str;
                        int i = C429882.f109463a[EnumC42990b.valueOf(errorResult.getErrorCode()).ordinal()];
                        if (i == 1) {
                            str = C43819s.m173684a((int) R.string.Mail_Recall_FailTimeout);
                            C42209j.m168612a("recall_mail_fail_timeout", "toast");
                        } else if (i == 2) {
                            str = C43819s.m173684a((int) R.string.Mail_Recall_FailNotSent);
                            C42209j.m168612a("recall_mail_fail_not_sent", "toast");
                        } else if (i != 3) {
                            str = C43819s.m173684a((int) R.string.Mail_Recall_FailDefault);
                        } else {
                            str = C43819s.m173684a((int) R.string.Mail_Recall_FailRecalled);
                            C42209j.m168612a("recall_mail_fail_has_been_recall", "toast");
                        }
                        MailToast.m173700a(str);
                    }
                });
            }
        });
    }
}
