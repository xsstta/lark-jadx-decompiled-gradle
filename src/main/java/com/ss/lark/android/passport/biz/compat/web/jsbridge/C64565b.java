package com.ss.lark.android.passport.biz.compat.web.jsbridge;

import com.ss.android.lark.jsbridge.AbstractC40669e;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.lark.android.passport.biz.compat.web.AbstractC64547a;

/* renamed from: com.ss.lark.android.passport.biz.compat.web.jsbridge.b */
public class C64565b extends AbstractC64564a {

    /* renamed from: a */
    private final AbstractC64547a f162998a;

    @Override // com.ss.lark.android.passport.biz.compat.web.jsbridge.AbstractC64564a
    /* renamed from: a */
    public String mo223288a() {
        return "biz.account.appInfo";
    }

    public C64565b(AbstractC64547a aVar) {
        this.f162998a = aVar;
    }

    @Override // com.ss.lark.android.passport.biz.compat.web.jsbridge.AbstractC64564a, com.ss.android.lark.jsbridge.AbstractC40665a
    /* renamed from: a */
    public void mo146778a(String str, AbstractC40669e eVar) {
        PassportLog a = PassportLog.f123351c.mo171474a();
        a.mo171465b("Bridge", "GetAppInfoJsHandler: " + str);
        AbstractC64547a aVar = this.f162998a;
        if (aVar != null) {
            aVar.mo170969b();
        }
    }
}
