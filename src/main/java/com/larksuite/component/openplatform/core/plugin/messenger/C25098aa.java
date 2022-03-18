package com.larksuite.component.openplatform.core.plugin.messenger;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.android.gms.common.ConnectionResult;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;

@ApiSupportType(apiName = {"showToast"}, support = {AppType.WebAPP}, testSupport = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.aa */
public class C25098aa extends AbstractC65797c {

    /* renamed from: a */
    protected long f61336a;

    /* renamed from: b */
    protected String f61337b;

    /* renamed from: c */
    protected String f61338c;

    public C25098aa() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("showToast");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        AppBrandLogger.m52830i("ShowToastHandler", "show toast:" + bVar.mo234988d());
        this.f61336a = (long) ((Integer) this.f165820j.mo234985a("duration", Integer.valueOf((int) ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED))).intValue();
        this.f61337b = (String) this.f165820j.mo234985a("title", "");
        this.f61338c = (String) this.f165820j.mo234985a("icon", "");
        if (this.f61336a <= 0) {
            this.f61336a = 1500;
        }
        if (TextUtils.isEmpty(this.f61337b)) {
            mo230481a(ApiCode.SHOWTOAST_INVALID_TITLE);
            AppBrandLogger.m52829e("ShowToastHandler", "title is empty");
            return;
        }
        new Handler(mo230473f().getApplicationContext().getMainLooper()).post(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.C25098aa.RunnableC250991 */

            public void run() {
                Context f = C25098aa.this.mo230475h().mo235051f();
                if (f == null) {
                    f = C25098aa.this.mo230473f().getApplicationContext();
                }
                if (f != null) {
                    C25098aa.this.mo230475h().mo235024a(f, C25098aa.this.f165820j.mo234988d(), C25098aa.this.f61337b, C25098aa.this.f61336a, C25098aa.this.f61338c);
                    C25098aa.this.mo230494j();
                    return;
                }
                C25098aa.this.mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
                AppBrandLogger.m52830i("ShowToastHandler", "context is null");
            }
        });
    }

    public C25098aa(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
