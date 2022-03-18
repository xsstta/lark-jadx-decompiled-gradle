package com.ss.lark.android.passport.biz.feature.applink_to_idp.p3220a;

import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterFieldAnno;
import com.ss.lark.android.passport.biz.feature.applink_to_idp.p3220a.C64622d;

/* renamed from: com.ss.lark.android.passport.biz.feature.applink_to_idp.a.a */
public class C64612a extends C49020a implements C64622d.AbstractC64623a {
    @RouterFieldAnno

    /* renamed from: c */
    private JSONObject f163077c;

    @Override // com.ss.lark.android.passport.biz.feature.applink_to_idp.p3220a.C64622d.AbstractC64623a
    /* renamed from: g */
    public JSONObject mo223413g() {
        if (this.f163077c == null) {
            this.f163077c = new JSONObject();
        }
        return this.f163077c;
    }

    public C64612a(Intent intent) {
        C49092f.m193525a(this, intent);
    }
}
