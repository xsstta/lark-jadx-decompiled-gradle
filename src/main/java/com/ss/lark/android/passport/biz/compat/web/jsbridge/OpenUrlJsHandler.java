package com.ss.lark.android.passport.biz.compat.web.jsbridge;

import android.content.Context;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.jsbridge.AbstractC40669e;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49157ai;

public class OpenUrlJsHandler extends AbstractC64564a {

    /* renamed from: a */
    private final Context f162997a;

    public static class Model extends BaseJSModel {
        public String url;
    }

    @Override // com.ss.lark.android.passport.biz.compat.web.jsbridge.AbstractC64564a
    /* renamed from: a */
    public String mo223288a() {
        return "biz.account.openLink";
    }

    public OpenUrlJsHandler(Context context) {
        this.f162997a = context;
    }

    @Override // com.ss.lark.android.passport.biz.compat.web.jsbridge.AbstractC64564a, com.ss.android.lark.jsbridge.AbstractC40665a
    /* renamed from: a */
    public void mo146778a(String str, AbstractC40669e eVar) {
        PassportLog a = PassportLog.f123351c.mo171474a();
        a.mo171465b("Bridge", "OpenUrlJsHandler: " + str);
        Model model = (Model) C38760a.m153056a(str, Model.class);
        Context context = this.f162997a;
        if (context == null || model == null) {
            PassportLog a2 = PassportLog.f123351c.mo171474a();
            a2.mo171471d("Bridge", "openLink error params=" + str);
            return;
        }
        C49157ai.m193846a(context, model.url);
    }
}
