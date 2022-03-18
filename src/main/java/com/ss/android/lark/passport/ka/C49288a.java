package com.ss.android.lark.passport.ka;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.dybrid.h5api.api.H5PluginConfig;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.ka.model.ExtraIdentify;
import com.ss.android.lark.passport.ka.p2452a.C49289a;
import com.ss.android.lark.passport.ka.web.KaJsPlugin;
import com.ss.android.lark.passport.kar.C49312a;
import com.ss.android.lark.passport.signinsdk_api.idp.AbstractC49383a;
import com.ss.android.lark.passport.signinsdk_api.idp.AbstractC49384b;
import com.ss.android.lark.utils.LarkContext;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.passport.ka.a */
public class C49288a implements AbstractC49384b<ExtraIdentify> {

    /* renamed from: b */
    private static C49288a f123736b;

    /* renamed from: a */
    private AbstractC49383a f123737a;

    @Override // com.ss.android.lark.passport.signinsdk_api.idp.AbstractC49384b
    /* renamed from: d */
    public AbstractC49383a mo171895d() {
        return this.f123737a;
    }

    /* renamed from: a */
    public static C49288a m194203a() {
        if (f123736b == null) {
            synchronized (C49288a.class) {
                if (f123736b == null) {
                    C49288a aVar = new C49288a();
                    f123736b = aVar;
                    aVar.mo171892b();
                }
            }
        }
        return f123736b;
    }

    /* renamed from: b */
    public void mo171892b() {
        this.f123737a = null;
        String buildPackageChannel = ServiceFinder.m193752g().getBuildPackageChannel(LarkContext.getApplication());
        if (ServiceFinder.m193752g().isPrivateKaPkg() && !TextUtils.isEmpty(buildPackageChannel) && buildPackageChannel.contains("crc")) {
            this.f123737a = new C49312a();
        }
        mo171894c();
    }

    /* renamed from: c */
    public void mo171894c() {
        AbstractC49383a aVar = this.f123737a;
        if (aVar != null) {
            aVar.mo171957a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("biz.account.h5_login_result");
        arrayList.add("biz.account.ka_info");
        arrayList.add("biz.account.switch_idp");
        arrayList.add("biz.account.vpn_auth_user");
        arrayList.add("h5PageClosed");
        arrayList.add("h5PageCreated");
        ServiceFinder.m193752g().registerPlugin(new H5PluginConfig(new KaJsPlugin(), arrayList));
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.idp.AbstractC49384b
    /* renamed from: a */
    public void mo171889a(Context context) {
        C49289a.m194212a().mo171896a(context);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.idp.AbstractC49384b
    /* renamed from: b */
    public void mo171893b(Context context) {
        C49289a.m194212a().mo171899b(context);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.idp.AbstractC49384b
    /* renamed from: a */
    public void mo171890a(Context context, JSONObject jSONObject) {
        C49289a.m194212a().mo171897a(context, jSONObject);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.idp.AbstractC49384b
    /* renamed from: a */
    public boolean mo171891a(Context context, boolean z) {
        return C49289a.m194212a().mo171898a(context, z);
    }
}
