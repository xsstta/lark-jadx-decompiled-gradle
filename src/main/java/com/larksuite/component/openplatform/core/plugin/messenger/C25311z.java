package com.larksuite.component.openplatform.core.plugin.messenger;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.errorcode.ApiErrorCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.util.C67590h;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"showModal"}, support = {AppType.WebAPP}, testSupport = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.z */
public class C25311z extends AbstractC65797c {

    /* renamed from: a */
    public String f61817a;

    /* renamed from: b */
    public String f61818b;

    /* renamed from: c */
    public String f61819c;

    /* renamed from: d */
    public String f61820d;

    /* renamed from: e */
    public boolean f61821e;

    /* renamed from: f */
    public String f61822f;

    /* renamed from: g */
    public String f61823g;

    public C25311z() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("showModal");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        boolean z;
        AppBrandLogger.m52830i("ShowModalHandler", bVar.mo234988d());
        this.f61817a = (String) this.f165820j.mo234984a("title");
        this.f61818b = (String) this.f165820j.mo234984a("content");
        this.f61819c = (String) this.f165820j.mo234984a("confirmText");
        this.f61820d = (String) this.f165820j.mo234984a("cancelText");
        this.f61821e = true;
        Object a = this.f165820j.mo234984a("showCancel");
        if (a instanceof Integer) {
            if (((Integer) a).intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f61821e = z;
        } else {
            this.f61821e = ((Boolean) this.f165820j.mo234985a("showCancel", true)).booleanValue();
        }
        this.f61822f = (String) this.f165820j.mo234984a("confirmColor");
        this.f61823g = (String) this.f165820j.mo234984a("cancelColor");
        if (!TextUtils.isEmpty(this.f61818b) || !TextUtils.isEmpty(this.f61817a)) {
            if (TextUtils.isEmpty(this.f61820d)) {
                this.f61820d = C67590h.m263073a((int) R.string.microapp_m_map_dialog_cancel);
            }
            if (!this.f61821e) {
                this.f61820d = "";
            }
            new Handler(mo230473f().getApplicationContext().getMainLooper()).post(new Runnable() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.C25311z.RunnableC253121 */

                public void run() {
                    Activity f = C25311z.this.mo230475h().mo235051f();
                    if (f != null) {
                        C25311z.this.mo230475h().mo235025a(f, C25311z.this.f165820j.mo234988d(), C25311z.this.f61817a, C25311z.this.f61818b, C25311z.this.f61821e, C25311z.this.f61820d, C25311z.this.f61823g, C25311z.this.f61819c, C25311z.this.f61822f, !C25311z.this.mo230475h().mo235052f("ecosystem.api.show_modal.disable_mask_click"), new AbstractC67550j.AbstractC67551a<Integer>() {
                            /* class com.larksuite.component.openplatform.core.plugin.messenger.C25311z.RunnableC253121.C253131 */

                            /* renamed from: a */
                            public void onNativeModuleCall(Integer num) {
                                boolean z;
                                boolean z2;
                                AppBrandLogger.m52830i("ShowModalHandler", "native module call , msg: " + num);
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    if (num.intValue() == 1) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    jSONObject.put("confirm", z);
                                    if (num.intValue() != 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    jSONObject.put("cancel", z2);
                                    C25311z.this.mo230492b(jSONObject);
                                } catch (JSONException e) {
                                    C25311z.this.mo230481a(ApiCode.GENERAL_JSON_ERROR);
                                    AppBrandLogger.m52829e("ShowModalHandler", "build resp error", e);
                                }
                            }
                        });
                        return;
                    }
                    C25311z.this.mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
                    AppBrandLogger.m52829e("ShowModalHandler", ApiErrorCode.INNER_CONTEXT_ERROR.msg);
                }
            });
            return;
        }
        mo230481a(ApiCode.SHOWMODAL_INVALID_MODAL);
        AppBrandLogger.m52829e("ShowModalHandler", "title or content is empty");
    }

    public C25311z(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
