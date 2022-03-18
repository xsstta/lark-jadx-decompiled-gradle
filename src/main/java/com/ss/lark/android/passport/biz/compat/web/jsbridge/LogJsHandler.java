package com.ss.lark.android.passport.biz.compat.web.jsbridge;

import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.jsbridge.AbstractC40669e;
import com.ss.android.lark.passport.infra.log.PassportLog;

public class LogJsHandler extends AbstractC64564a {

    public static class Model extends BaseJSModel {
        public String level;
        public String msg;
    }

    @Override // com.ss.lark.android.passport.biz.compat.web.jsbridge.AbstractC64564a
    /* renamed from: a */
    public String mo223288a() {
        return "biz.account.log";
    }

    @Override // com.ss.lark.android.passport.biz.compat.web.jsbridge.AbstractC64564a, com.ss.android.lark.jsbridge.AbstractC40665a
    /* renamed from: a */
    public void mo146778a(String str, AbstractC40669e eVar) {
        Model model = (Model) C38760a.m153056a(str, Model.class);
        if (model != null) {
            PassportLog.f123351c.mo171474a().mo171473e(model.level, model.msg);
        }
    }
}
