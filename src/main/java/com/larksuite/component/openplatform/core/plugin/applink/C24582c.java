package com.larksuite.component.openplatform.core.plugin.applink;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import java.util.Collections;
import java.util.List;

@ApiSupportType(apiName = {"openSchema"}, support = {AppType.CardAPP, AppType.WebAPP, AppType.GadgetAPP, AppType.WebGadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.applink.c */
public class C24582c extends AbstractC65797c {
    public C24582c() {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.applink.c$a */
    public static class C24583a {

        /* renamed from: a */
        private static long f60565a;

        /* renamed from: b */
        public static void m89623b() {
            f60565a = 0;
        }

        /* renamed from: a */
        public static boolean m89622a() {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f60565a < 500) {
                return true;
            }
            f60565a = currentTimeMillis;
            return false;
        }
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("openSchema");
    }

    /* renamed from: b */
    private void m89619b(ApiCode apiCode) {
        C24583a.m89623b();
        mo230481a(apiCode);
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        AppBrandLogger.m52828d("ApiHandler", "openSchema mArgs:", bVar.mo234988d());
        if (C24583a.m89622a()) {
            mo230493c("invoke openSchema too fast");
            return;
        }
        Activity f = mo230475h().mo235051f();
        if (f == null) {
            m89619b(ApiCode.GENERAL_UNKONW_ERROR);
            return;
        }
        String str = (String) bVar.mo234984a("schema");
        boolean booleanValue = ((Boolean) bVar.mo234985a("external", false)).booleanValue();
        if (TextUtils.isEmpty(str)) {
            m89619b(ApiCode.OPENSCHEMA_EMPTY_SCHEMA);
        } else if (!mo230475h().mo235037a("schema_host", str)) {
            m89619b(ApiCode.OPENSCHEMA_NOT_WHITE);
        } else if (TextUtils.equals("microapp", Uri.parse(str).getHost())) {
            ((AbstractC67724a) mo230473f().findServiceByInterface(AbstractC67724a.class)).mo50436a("inner_open_miniapp", CrossProcessDataEntity.C67574a.m263013a().mo234760a("inner_open_miniapp_fromid", (Object) mo230473f().getAppId()).mo234760a("inner_open_miniapp_schema", (Object) str).mo234763b());
            mo230475h().mo235062m();
            mo230494j();
        } else if (m89618a(f, str, booleanValue)) {
            mo230494j();
        } else {
            m89619b(ApiCode.OPENSCHEMA_OPEN_FAILED);
        }
    }

    public C24582c(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    /* renamed from: a */
    private boolean m89618a(Context context, String str, boolean z) {
        AbstractC67724a aVar = (AbstractC67724a) mo230473f().findServiceByInterface(AbstractC67724a.class);
        Uri parse = Uri.parse(str);
        if (aVar.mo50464f(str)) {
            aVar.mo50442a(context, str);
            return true;
        } else if (z) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            try {
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e) {
                AppBrandLogger.eWithThrowable("ApiHandler", "openSchema", e);
                return false;
            }
        } else {
            aVar.mo50440a((Activity) context, str, (String) null);
            return true;
        }
    }
}
