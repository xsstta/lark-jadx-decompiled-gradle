package com.ss.lark.android.passport.biz.link_handler;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;

/* renamed from: com.ss.lark.android.passport.biz.link_handler.g */
public class C65166g extends PassportAppLinkHandler {
    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return true;
    }

    @Override // com.ss.android.lark.applink.AbstractC29186b
    /* renamed from: a */
    public boolean mo103460a(Context context, AppLink appLink) {
        return false;
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, AppLink appLink) {
        if (appLink == null || TextUtils.isEmpty(appLink.mo103435a())) {
            mo224384b().mo171471d("SsoLoginLinkHandler", "Applink Url is null");
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("applink_url", (Object) appLink.mo103435a());
        C49092f.m193532a(context, "applink_to_idp", jSONObject, RouterScene.ALL.value, UniContext.CONTEXT_GLOBAL, mo224384b(), new AbstractC49336a() {
            /* class com.ss.lark.android.passport.biz.link_handler.C65166g.C651671 */

            @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
            public void onRouterResult(int i, Object obj) {
                C65166g.this.mo224384b().mo171465b("SsoLoginLinkHandler", "jump To PAGE_APPLINK_TO_IDP");
            }
        });
        return true;
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        mo224384b().mo171465b("SsoLoginLinkHandler", "canOpen");
        if (context != null && appLink != null && !TextUtils.isEmpty(appLink.mo103435a())) {
            return true;
        }
        mo224384b().mo171471d("SsoLoginLinkHandler", "canOpen invalid parameter");
        return false;
    }
}
