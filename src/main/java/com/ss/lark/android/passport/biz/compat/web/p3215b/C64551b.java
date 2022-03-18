package com.ss.lark.android.passport.biz.compat.web.p3215b;

import android.text.TextUtils;
import android.view.View;
import com.ss.android.lark.passport.infra.log.PassportLog;

/* renamed from: com.ss.lark.android.passport.biz.compat.web.b.b */
public class C64551b extends AbstractC64550a {

    /* renamed from: a */
    String f162959a = "hide_navigator";

    /* renamed from: b */
    String f162960b = "show_navigator";

    /* renamed from: c */
    private final View f162961c;

    @Override // com.ss.lark.android.passport.biz.compat.web.p3215b.AbstractC64550a
    /* renamed from: a */
    public String mo223258a() {
        return "op_platform_service";
    }

    public C64551b(View view) {
        this.f162961c = view;
    }

    @Override // com.ss.lark.android.passport.biz.compat.web.p3215b.AbstractC64550a
    /* renamed from: a */
    public void mo223260a(String str) {
        String[] split = str.split(",");
        for (String str2 : split) {
            if (TextUtils.equals(this.f162959a, str2)) {
                PassportLog.f123351c.mo171474a().mo171465b("TitleBarUrlParamHandler", "login h5 hide_navigator");
                this.f162961c.setVisibility(8);
            } else if (TextUtils.equals(this.f162960b, str2)) {
                this.f162961c.setVisibility(0);
                PassportLog.f123351c.mo171474a().mo171465b("TitleBarUrlParamHandler", "login h5 show_navigator");
            }
        }
    }
}
