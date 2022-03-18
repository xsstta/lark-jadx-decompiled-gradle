package com.ss.android.lark.passport.kar;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.dybrid.h5api.api.H5PluginConfig;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.p2440b.C49160a;
import com.ss.android.lark.passport.ka.C49298b;
import com.ss.android.lark.passport.ka.model.KaIdentity;
import com.ss.android.lark.passport.ka.p2452a.C49296c;
import com.ss.android.lark.passport.kar.model.KaAuthUrlRequest;
import com.ss.android.lark.passport.kar.model.KaAuthUrlResponse;
import com.ss.android.lark.passport.kar.model.KaConfig;
import com.ss.android.lark.passport.kar.refresh.C49323b;
import com.ss.android.lark.passport.kar.refresh.KaTokenChecker;
import com.ss.android.lark.passport.kar.refresh.KaTokenRefreshRequest;
import com.ss.android.lark.passport.kar.web.KarJsPlugin;
import com.ss.android.lark.passport.kar.web.KarLoginPlugin;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.idp.AbstractC49383a;
import com.ss.android.lark.passport.signinsdk_api.idp.IGetIdpTokenCallback;
import com.ss.android.lark.passport.signinsdk_api.idp.IdPSettingResponse;
import com.ss.lark.android.passport.biz.C64340b;
import com.ss.lark.android.passport.biz.compat.v2.http.base.V2ResponseModel;
import com.ss.lark.android.passport.biz.compat.v2.http.common.UnknownCodeHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.passport.kar.a */
public class C49312a implements AbstractC49383a<KaIdentity> {

    /* renamed from: a */
    public final Handler f123778a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final PassportLog f123779b = PassportLog.f123351c.mo171474a();

    /* renamed from: c */
    private C49323b f123780c;

    /* renamed from: d */
    private final List<String> f123781d;

    /* renamed from: e */
    private IGetIdpTokenCallback<KaIdentity> f123782e;

    public C49312a() {
        ArrayList arrayList = new ArrayList();
        this.f123781d = arrayList;
        arrayList.add("modify_pwd");
        arrayList.add("login_device_manage");
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.idp.AbstractC49383a
    /* renamed from: a */
    public void mo171957a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("biz.account.openLink");
        arrayList.add("biz.account.log");
        arrayList.add("biz.account.teaStastics");
        arrayList.add("biz.account.teaStatisticsError");
        arrayList.add("device.base.getSystemInfo");
        arrayList.add("h5PageClosed");
        arrayList.add("h5PageCreated");
        ServiceFinder.m193752g().registerPlugin(new H5PluginConfig(new KarJsPlugin(), arrayList));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("biz.account.h5_login_result");
        arrayList2.add("biz.account.ka_info");
        arrayList2.add("biz.account.switch_idp");
        arrayList2.add("h5PageClosed");
        arrayList2.add("h5PageCreated");
        ServiceFinder.m193752g().registerPlugin(new H5PluginConfig(new KarLoginPlugin(), arrayList2));
    }

    /* renamed from: b */
    private C49323b m194300b(Context context) {
        if (this.f123780c == null) {
            synchronized (this) {
                if (this.f123780c == null) {
                    this.f123780c = new C49323b(context);
                }
            }
        }
        return this.f123780c;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.idp.AbstractC49383a
    /* renamed from: a */
    public boolean mo171962a(Context context) {
        String str;
        KaConfig kaConfig = (KaConfig) C49296c.m194232a().mo171905a(KaConfig.class);
        if (kaConfig == null || kaConfig.client == null) {
            str = null;
        } else {
            str = kaConfig.client.mpwUrl;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C49298b.m194253a().mo171922a(context, str, null, false);
        return true;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.idp.AbstractC49383a
    /* renamed from: a */
    public void mo171961a(final String str, final AbstractC49352d<String> dVar) {
        C64340b.m252955a().mo222860b();
        new KaAuthUrlRequest(str).request(new AbstractC49342a<V2ResponseModel<KaAuthUrlResponse>>() {
            /* class com.ss.android.lark.passport.kar.C49312a.C493175 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a
            /* renamed from: a */
            public void mo171966a(NetworkErrorResult networkErrorResult) {
                PassportLog passportLog = C49312a.this.f123779b;
                passportLog.mo171471d("KaIdp-crc", "getKaPreConfig error=" + networkErrorResult.toString());
                AbstractC49352d dVar = dVar;
                if (dVar != null) {
                    dVar.mo145178a(networkErrorResult);
                }
            }

            /* renamed from: a */
            public void mo171968a(V2ResponseModel<KaAuthUrlResponse> v2ResponseModel) {
                KaAuthUrlResponse kaAuthUrlResponse;
                if (v2ResponseModel == null || !(v2ResponseModel.data instanceof KaAuthUrlResponse)) {
                    kaAuthUrlResponse = null;
                } else {
                    kaAuthUrlResponse = (KaAuthUrlResponse) v2ResponseModel.data;
                }
                if (kaAuthUrlResponse != null) {
                    C49296c.m194232a().mo171915b(str);
                    C49296c.m194232a().mo171910a(C49296c.m194232a().mo171916c(), C38760a.m153057a(kaAuthUrlResponse.preConfig));
                    if (!(kaAuthUrlResponse.preConfig == null || kaAuthUrlResponse.preConfig.client == null)) {
                        KaTokenRefreshRequest.setRefreshUrl(kaAuthUrlResponse.preConfig.client.refreshUrl);
                    }
                    if (dVar != null) {
                        C49312a.this.f123779b.mo171471d("KaIdp-crc", "getKaPreConfig success but data is null");
                        dVar.mo145179a(kaAuthUrlResponse.url);
                        return;
                    }
                    return;
                }
                C49312a.this.f123779b.mo171471d("KaIdp-crc", "getKaPreConfig success but data is null");
                AbstractC49352d dVar = dVar;
                if (dVar != null) {
                    dVar.mo145178a(new NetworkErrorResult(-1, "data is null!"));
                }
            }
        });
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.idp.AbstractC49383a
    /* renamed from: a */
    public void mo171958a(final Activity activity, IdPSettingResponse idPSettingResponse, final AbstractC49352d dVar) {
        String d = C49296c.m194232a().mo171918d();
        if (TextUtils.isEmpty(d)) {
            d = idPSettingResponse.defaultIdpType;
        }
        C49296c.m194232a().mo171909a(d, new AbstractC49352d<String>() {
            /* class com.ss.android.lark.passport.kar.C49312a.C493164 */

            /* renamed from: a */
            public void mo145179a(String str) {
                ServiceFinder.m193752g().onHostEnvClear(null);
                C49298b.m194253a().mo171922a(activity, str, null, false);
                AbstractC49352d dVar = dVar;
                if (dVar != null) {
                    dVar.mo145179a((Object) null);
                    activity.finish();
                }
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                PassportLog passportLog = C49312a.this.f123779b;
                passportLog.mo171465b("KaIdp-crc", "getKaIdpSetting error:" + networkErrorResult.toString());
                UnknownCodeHandler.f162912a.mo223191a(activity, networkErrorResult);
                AbstractC49352d dVar = dVar;
                if (dVar != null) {
                    dVar.mo145178a(new NetworkErrorResult());
                }
            }
        });
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.idp.AbstractC49383a
    /* renamed from: a */
    public void mo171959a(Context context, final IGetIdpTokenCallback<KaIdentity> iGetIdpTokenCallback, final long j) {
        if (this.f123782e == null) {
            KaIdentity b = C49296c.m194232a().mo171912b();
            if (b != null) {
                PassportLog passportLog = this.f123779b;
                passportLog.mo171465b("KaIdp-crc", "open_id=" + C49160a.m193854a(b.openId));
            } else {
                this.f123779b.mo171465b("KaIdp-crc", "no open_id");
            }
            this.f123782e = new IGetIdpTokenCallback<KaIdentity>() {
                /* class com.ss.android.lark.passport.kar.C49312a.C493142 */

                /* renamed from: a */
                public void mo145132a(KaIdentity kaIdentity, int i, String str) {
                    IGetIdpTokenCallback iGetIdpTokenCallback = iGetIdpTokenCallback;
                    if (iGetIdpTokenCallback != null) {
                        iGetIdpTokenCallback.mo145132a(kaIdentity, i, str);
                    }
                }
            };
            final C49323b b2 = m194300b(context);
            b2.mo171981a(this.f123782e);
            this.f123778a.post(new Runnable() {
                /* class com.ss.android.lark.passport.kar.C49312a.RunnableC493153 */

                public void run() {
                    b2.mo171983b(iGetIdpTokenCallback);
                    C49312a.this.f123778a.postDelayed(this, j);
                }
            });
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.idp.AbstractC49383a
    /* renamed from: a */
    public void mo171960a(Context context, boolean z, final IGetIdpTokenCallback<String> iGetIdpTokenCallback) {
        if (iGetIdpTokenCallback == null) {
            this.f123779b.mo171465b("KaIdp-crc", "getIdpIdentity callback is null");
            return;
        }
        C493131 r1 = new IGetIdpTokenCallback() {
            /* class com.ss.android.lark.passport.kar.C49312a.C493131 */

            @Override // com.ss.android.lark.passport.signinsdk_api.idp.IGetIdpTokenCallback
            /* renamed from: a */
            public void mo145132a(Object obj, int i, String str) {
                String str2;
                HashMap hashMap = new HashMap();
                KaConfig kaConfig = (KaConfig) C49296c.m194232a().mo171905a(KaConfig.class);
                if (kaConfig != null) {
                    hashMap.putAll(JSONObject.parseObject(C38760a.m153057a(kaConfig.ext)));
                }
                if (obj != null) {
                    hashMap.putAll(JSONObject.parseObject(C38760a.m153057a(obj)));
                }
                if (obj instanceof KaIdentity) {
                    str2 = ((KaIdentity) obj).externalToken;
                } else {
                    str2 = "";
                }
                PassportLog passportLog = C49312a.this.f123779b;
                passportLog.mo171465b("KaIdp-crc", "getIdpIdentity  onResult externalToken: " + C49160a.m193857b(str2));
                PassportLog passportLog2 = C49312a.this.f123779b;
                passportLog2.mo171465b("KaIdp-crc", "getIdpIdentity code=" + i + "; msg=" + str);
                iGetIdpTokenCallback.mo145132a(C38760a.m153057a(hashMap), i, str);
            }
        };
        KaIdentity b = C49296c.m194232a().mo171912b();
        PassportLog passportLog = this.f123779b;
        passportLog.mo171465b("KaIdp-crc", "getIdpIdentity token: " + C49160a.m193857b(b.externalToken));
        KaTokenChecker.C49319a a = KaTokenChecker.m194319a(b);
        if (a.f123799a == 0) {
            this.f123779b.mo171465b("KaIdp-crc", "ka token valid");
            r1.mo145132a(b, 0, "ok");
        } else if (a.f123799a != 1 || !z) {
            this.f123779b.mo171465b("KaIdp-crc", "ka refresh token invalid");
            r1.mo145132a(b, 3, "ka refresh token invalid");
        } else {
            this.f123779b.mo171465b("KaIdp-crc", "getIdpIdentity update token");
            m194300b(context).mo171983b(r1);
        }
    }
}
