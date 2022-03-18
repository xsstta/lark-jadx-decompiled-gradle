package com.bytedance.ee.bear.account;

import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13597a;
import javax.crypto.SecretKey;

/* renamed from: com.bytedance.ee.bear.account.g */
public final class C4193g {

    /* renamed from: a */
    private SecretKey f12665a;

    /* renamed from: a */
    private void m17392a() {
        if (this.f12665a == null) {
            char[] cArr = {'$', '5', '2', '*', 'y', 'l', 'q'};
            this.f12665a = C13597a.m55180a(cArr);
            for (int i = 0; i < 7; i++) {
                cArr[i] = 0;
            }
        }
    }

    /* renamed from: a */
    public String mo16429a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        m17392a();
        return C13597a.m55186d(str, this.f12665a);
    }

    /* renamed from: b */
    public String mo16430b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        m17392a();
        return C13597a.m55187e(str, this.f12665a);
    }

    /* renamed from: a */
    public C4201m mo16428a(C4201m mVar) {
        if (mVar == null) {
            C13479a.m54772d("CipherHelper", "decryptUser: user is null");
            return null;
        }
        C4201m mVar2 = new C4201m(mVar);
        mVar2.mo16477a(mo16430b(mVar.mo16474a()));
        mVar2.mo16480b(mo16430b(mVar.mo16479b()));
        mVar2.mo16483c(mo16430b(mVar.mo16482c()));
        mVar2.mo16486d(mo16430b(mVar.mo16485d()));
        mVar2.mo16489e(mo16430b(mVar.mo16488e()));
        mVar2.mo16492f(mo16430b(mVar.mo16491f()));
        mVar2.mo16494g(mo16430b(mVar.mo16493g()));
        mVar2.mo16496h(mo16430b(mVar.mo16495h()));
        mVar2.mo16499i(mo16430b(mVar.mo16498i()));
        mVar2.mo16501j(mo16430b(mVar.mo16502k()));
        mVar2.mo16505l(mo16430b(mVar.mo16508n()));
        mVar2.mo16503k(mo16430b(mVar.mo16504l()));
        return mVar2;
    }
}
