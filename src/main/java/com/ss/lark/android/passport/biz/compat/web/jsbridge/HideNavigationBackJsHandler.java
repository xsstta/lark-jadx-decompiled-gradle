package com.ss.lark.android.passport.biz.compat.web.jsbridge;

import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.jsbridge.AbstractC40669e;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.lark.android.passport.biz.compat.web.AbstractC64547a;

public class HideNavigationBackJsHandler extends AbstractC64564a {

    /* renamed from: a */
    private final AbstractC64547a f162996a;

    public static class Model extends BaseJSModel {
        public int show;
    }

    @Override // com.ss.lark.android.passport.biz.compat.web.jsbridge.AbstractC64564a
    /* renamed from: a */
    public String mo223288a() {
        return "biz.account.hideNavigationBack";
    }

    public HideNavigationBackJsHandler(AbstractC64547a aVar) {
        this.f162996a = aVar;
    }

    @Override // com.ss.lark.android.passport.biz.compat.web.jsbridge.AbstractC64564a, com.ss.android.lark.jsbridge.AbstractC40665a
    /* renamed from: a */
    public void mo146778a(String str, AbstractC40669e eVar) {
        PassportLog a = PassportLog.f123351c.mo171474a();
        a.mo171465b("Bridge", "HideNavigationBackJsHandler: " + str);
        Model model = (Model) C38760a.m153056a(str, Model.class);
        AbstractC64547a aVar = this.f162996a;
        if (aVar != null) {
            boolean z = true;
            if (model.show != 1) {
                z = false;
            }
            aVar.mo223246a(z);
        }
    }
}
