package com.ss.android.lark.mail.impl.service;

import android.content.Context;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.mulprocess.C43213b;
import com.ss.android.lark.mail.impl.service.p2215a.C43298e;

/* renamed from: com.ss.android.lark.mail.impl.service.g */
public class C43380g {

    /* renamed from: a */
    private volatile boolean f110265a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.service.g$a */
    public static class C43382a {

        /* renamed from: a */
        public static final C43380g f110266a = new C43380g();
    }

    private C43380g() {
    }

    /* renamed from: a */
    public static final C43380g m172308a() {
        return C43382a.f110266a;
    }

    /* renamed from: b */
    private void m172309b() {
        Log.m165388i("MailService tryToRegisterPush");
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            for (int i = 0; i < C43298e.m172008a().mo154976c().size(); i++) {
                C43298e.m172008a().mo154976c().get(i).mo154968a();
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo155142a(Context context) {
        if (!this.f110265a) {
            this.f110265a = true;
            C43298e.m172008a().mo154975b();
            m172309b();
        }
    }
}
