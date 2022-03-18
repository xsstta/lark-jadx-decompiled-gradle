package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.lark.p414b.AbstractC7993f;
import com.bytedance.ee.bear.middleground.permission.p484d.AbstractC9901d;
import com.bytedance.ee.bear.middleground.permission.p484d.C9899b;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.audit.AbstractC29324f;
import com.ss.android.lark.audit.C29304b;
import com.ss.android.lark.audit_provider.C29381a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.ccm.dependency.p2015a.C39301e;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountChangeObserver;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.e */
class C39301e {
    /* renamed from: a */
    public static AbstractC9901d m155011a() {
        return new C9899b(new C9899b.AbstractC9900a() {
            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.C39301e.C393021 */

            @Override // com.bytedance.ee.bear.middleground.permission.p484d.C9899b.AbstractC9900a
            /* renamed from: a */
            public C29304b mo37707a() {
                return C29304b.m107713a();
            }

            @Override // com.bytedance.ee.bear.middleground.permission.p484d.C9899b.AbstractC9900a
            /* renamed from: b */
            public void mo37708b() {
                C29381a.m107986a(LarkContext.getApplication(), new AbstractC29324f() {
                    /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.C39301e.C393021.C393031 */

                    @Override // com.ss.android.lark.audit.AbstractC29324f
                    /* renamed from: a */
                    public /* synthetic */ AbstractC29324f.AbstractC29326b mo103859a(Context context) {
                        return AbstractC29324f.CC.$default$a(this, context);
                    }

                    @Override // com.ss.android.lark.audit.AbstractC29324f
                    /* renamed from: a */
                    public /* synthetic */ String mo103861a(String str) {
                        return AbstractC29324f.CC.$default$a(this, str);
                    }

                    @Override // com.ss.android.lark.audit.AbstractC29324f
                    /* renamed from: a */
                    public /* synthetic */ void mo103864a(AbstractC29324f.AbstractC29329e eVar) {
                        AbstractC29324f.CC.$default$a(this, eVar);
                    }

                    @Override // com.ss.android.lark.audit.AbstractC29324f
                    /* renamed from: a */
                    public /* synthetic */ void mo103865a(String str, String str2, AbstractC29324f.AbstractC29330f fVar) {
                        AbstractC29324f.CC.$default$a(this, str, str2, fVar);
                    }

                    @Override // com.ss.android.lark.audit.AbstractC29324f
                    /* renamed from: a */
                    public /* synthetic */ void mo103866a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
                        AbstractC29324f.CC.$default$a(this, str, jSONObject, jSONObject2, jSONObject3);
                    }

                    @Override // com.ss.android.lark.audit.AbstractC29324f
                    /* renamed from: b */
                    public /* synthetic */ AbstractC29324f.AbstractC29325a mo103868b(Context context) {
                        return AbstractC29324f.CC.$default$b(this, context);
                    }

                    @Override // com.ss.android.lark.audit.AbstractC29324f
                    /* renamed from: c */
                    public /* synthetic */ boolean mo103870c() {
                        return AbstractC29324f.CC.$default$c(this);
                    }

                    @Override // com.ss.android.lark.audit.AbstractC29324f
                    /* renamed from: a */
                    public boolean mo103867a(String str, boolean z) {
                        return C37239a.m146648b().mo136952a(str, z);
                    }

                    @Override // com.ss.android.lark.audit.AbstractC29324f
                    /* renamed from: b */
                    public String mo103869b() {
                        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getSession();
                    }

                    @Override // com.ss.android.lark.audit.AbstractC29324f
                    /* renamed from: d */
                    public String mo103871d() {
                        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserId();
                    }

                    @Override // com.ss.android.lark.audit.AbstractC29324f
                    /* renamed from: e */
                    public int mo103872e() {
                        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getLoginAppId();
                    }

                    @Override // com.ss.android.lark.audit.AbstractC29324f
                    /* renamed from: a */
                    public String mo103860a() {
                        return "https://www." + ((AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class)).mo30988b();
                    }

                    @Override // com.ss.android.lark.audit.AbstractC29324f
                    /* renamed from: a */
                    public void mo103862a(AbstractC29324f.AbstractC29327c cVar) {
                        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).registerChangeObserver(new IAccountChangeObserver.AbstractC49385a() {
                            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.$$Lambda$e$1$1$QT2fQdixM_jDUQ9QTZEhzpeMrlk */

                            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountChangeObserver.AbstractC49385a
                            public final void onAccountChange(LoginInfo loginInfo) {
                                C39301e.C393021.C393031.lambda$QT2fQdixM_jDUQ9QTZEhzpeMrlk(AbstractC29324f.AbstractC29327c.this, loginInfo);
                            }
                        });
                    }

                    @Override // com.ss.android.lark.audit.AbstractC29324f
                    /* renamed from: a */
                    public void mo103863a(AbstractC29324f.AbstractC29328d dVar) {
                        C28513a.m104512a(new C28513a.AbstractC28514a() {
                            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.$$Lambda$e$1$1$g4jXynbxqvmJa5czX5mkzMPQpk */

                            @Override // com.ss.android.lark.account_provider.integrator.C28513a.AbstractC28514a
                            public final void onLoginStatusChanged(int i) {
                                C39301e.C393021.C393031.m270611lambda$g4jXynbxqvmJa5czX5mkzMPQpk(AbstractC29324f.AbstractC29328d.this, i);
                            }
                        });
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public static /* synthetic */ void m155014a(AbstractC29324f.AbstractC29327c cVar, LoginInfo loginInfo) {
                        if (cVar != null) {
                            JSONObject jSONObject = null;
                            if (loginInfo != null) {
                                try {
                                    jSONObject = new JSONObject(JSON.toJSONString(loginInfo));
                                } catch (JSONException e) {
                                    Log.m165384e("AuditAgentImpl", "parse loginInfo failed", e);
                                }
                            }
                            cVar.mo103832a(jSONObject);
                        }
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public static /* synthetic */ void m155015a(AbstractC29324f.AbstractC29328d dVar, int i) {
                        if (dVar != null) {
                            JSONObject jSONObject = null;
                            if (i == 1) {
                                try {
                                    LoginInfo a = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getAccountManager().mo172419a();
                                    if (a != null) {
                                        jSONObject = new JSONObject(JSON.toJSONString(a));
                                    }
                                } catch (Throwable th) {
                                    Log.m165384e("AuditAgentImpl", "parse loginType failed", th);
                                }
                            }
                            dVar.mo103836b(jSONObject);
                        }
                    }
                });
            }
        });
    }
}
