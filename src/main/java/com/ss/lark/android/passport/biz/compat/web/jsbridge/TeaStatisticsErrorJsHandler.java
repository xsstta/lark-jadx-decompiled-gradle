package com.ss.lark.android.passport.biz.compat.web.jsbridge;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.jsbridge.AbstractC40669e;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.android.lark.passport.infra.log.PassportLog;

public class TeaStatisticsErrorJsHandler extends AbstractC64564a {

    public static class Model extends BaseJSModel {
        @JSONField(name = "tea_key")
        public String teaKey;
    }

    @Override // com.ss.lark.android.passport.biz.compat.web.jsbridge.AbstractC64564a
    /* renamed from: a */
    public String mo223288a() {
        return "biz.account.teaStatisticsError";
    }

    @Override // com.ss.lark.android.passport.biz.compat.web.jsbridge.AbstractC64564a, com.ss.android.lark.jsbridge.AbstractC40665a
    /* renamed from: a */
    public void mo146778a(String str, AbstractC40669e eVar) {
        PassportLog a = PassportLog.f123351c.mo171474a();
        a.mo171465b("Bridge", "TeaStatisticsErrorJsHandler:" + str);
        Model model = (Model) C38760a.m153056a(str, Model.class);
        if (model != null && !TextUtils.isEmpty(model.teaKey)) {
            C49096b.m193575a(model.teaKey);
        }
    }
}
