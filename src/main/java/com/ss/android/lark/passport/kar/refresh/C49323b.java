package com.ss.android.lark.passport.kar.refresh;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49159b;
import com.ss.android.lark.passport.infra.util.C49194j;
import com.ss.android.lark.passport.infra.util.p2440b.C49160a;
import com.ss.android.lark.passport.ka.model.ExtraIdentify;
import com.ss.android.lark.passport.ka.model.KaIdentity;
import com.ss.android.lark.passport.ka.p2452a.C49296c;
import com.ss.android.lark.passport.kar.model.KaConfig;
import com.ss.android.lark.passport.kar.refresh.KaTokenChecker;
import com.ss.android.lark.passport.kar.refresh.KaTokenRefreshResponse;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.idp.IGetIdpTokenCallback;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e;
import com.ss.lark.android.passport.biz.compat.v2.http.base.V2ResponseModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.passport.kar.refresh.b */
public class C49323b {

    /* renamed from: b */
    public static final PassportLog f123801b = PassportLog.f123351c.mo171474a();

    /* renamed from: d */
    private static final Object f123802d = new Object();

    /* renamed from: a */
    public final Context f123803a;

    /* renamed from: c */
    private final C49326a f123804c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.passport.kar.refresh.b$a */
    public static class C49326a implements AbstractC49352d<KaTokenRefreshResponse> {

        /* renamed from: a */
        public final List<IGetIdpTokenCallback> f123808a = new ArrayList();

        /* renamed from: b */
        public final List<IGetIdpTokenCallback> f123809b = new ArrayList();

        /* renamed from: c */
        private final Context f123810c;

        /* renamed from: a */
        private synchronized List<IGetIdpTokenCallback> m194333a() {
            ArrayList arrayList;
            arrayList = new ArrayList();
            arrayList.addAll(this.f123809b);
            arrayList.addAll(this.f123808a);
            return arrayList;
        }

        public C49326a(Context context) {
            this.f123810c = context;
        }

        /* renamed from: a */
        public void mo145179a(KaTokenRefreshResponse kaTokenRefreshResponse) {
            KaIdentity b = m194334b(kaTokenRefreshResponse);
            for (IGetIdpTokenCallback iGetIdpTokenCallback : m194333a()) {
                if (iGetIdpTokenCallback != null) {
                    if (b != null) {
                        C49296c.m194232a().mo171908a(b);
                        iGetIdpTokenCallback.mo145132a(b, 1, "refresh success");
                    } else {
                        iGetIdpTokenCallback.mo145132a(null, 2, "refresh failed");
                    }
                }
            }
            this.f123809b.clear();
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
        /* renamed from: a */
        public void mo145178a(NetworkErrorResult networkErrorResult) {
            PassportLog passportLog = C49323b.f123801b;
            passportLog.mo171471d("KaTokenRefreshManager", "update token error: " + networkErrorResult.toString());
            KaIdentity b = C49296c.m194232a().mo171912b();
            for (IGetIdpTokenCallback iGetIdpTokenCallback : m194333a()) {
                if (iGetIdpTokenCallback != null) {
                    iGetIdpTokenCallback.mo145132a(b, 2, "refresh failed");
                }
            }
            this.f123809b.clear();
        }

        /* renamed from: b */
        private KaIdentity m194334b(KaTokenRefreshResponse kaTokenRefreshResponse) {
            if (kaTokenRefreshResponse == null || kaTokenRefreshResponse.response == null) {
                C49323b.f123801b.mo171471d("KaTokenRefreshManager", "parse response data error. data or response is null");
                return null;
            }
            String str = kaTokenRefreshResponse.response.returnCode;
            if (!KaTokenRefreshResponse.C49321a.m194321a(str)) {
                PassportLog passportLog = C49323b.f123801b;
                passportLog.mo171471d("KaTokenRefreshManager", "parse response data error. returnCode error=" + str);
                if (str != null && !str.startsWith("S") && !str.startsWith("s")) {
                    PassportLog passportLog2 = C49323b.f123801b;
                    passportLog2.mo171471d("KaTokenRefreshManager", "parse response data error. response=" + C38760a.m153057a(kaTokenRefreshResponse));
                }
                return null;
            }
            KaTokenRefreshResponse.ReturnData returnData = kaTokenRefreshResponse.response.returnData;
            if (returnData == null) {
                C49323b.f123801b.mo171471d("KaTokenRefreshManager", "parse response data error. response.returnData is null");
                return null;
            }
            ExtraIdentify b = C49296c.m194232a().mo171912b();
            if (b == null) {
                b = new ExtraIdentify();
            }
            PassportLog passportLog3 = C49323b.f123801b;
            passportLog3.mo171465b("KaTokenRefreshManager", "updateToken parseReturnData newToken:" + C49160a.m193857b(returnData.newToken));
            b.externalToken = returnData.newToken;
            PassportLog passportLog4 = C49323b.f123801b;
            passportLog4.mo171465b("KaTokenRefreshManager", "updateToken parseReturnData tokenExpires:" + returnData.tokenExpires);
            b.tokenExpires = Long.toString(returnData.tokenExpires);
            b.refreshToken = returnData.refreshKey;
            b.refreshTokenExpires = Long.toString(returnData.refreshKeyExpires);
            return KaIdentity.from(b);
        }
    }

    /* renamed from: a */
    public void mo171981a(IGetIdpTokenCallback iGetIdpTokenCallback) {
        this.f123804c.f123808a.add(iGetIdpTokenCallback);
    }

    public C49323b(Context context) {
        String str;
        this.f123803a = context;
        this.f123804c = new C49326a(context);
        KaConfig kaConfig = (KaConfig) C49296c.m194232a().mo171905a(KaConfig.class);
        if (kaConfig == null || kaConfig.client == null) {
            str = null;
        } else {
            str = kaConfig.client.refreshUrl;
        }
        if (!TextUtils.isEmpty(str)) {
            KaTokenRefreshRequest.setRefreshUrl(str);
        }
    }

    /* renamed from: b */
    public synchronized void mo171983b(IGetIdpTokenCallback<KaIdentity> iGetIdpTokenCallback) {
        String str;
        final KaIdentity b = C49296c.m194232a().mo171912b();
        KaTokenChecker.C49319a a = KaTokenChecker.m194319a(b);
        if (("checkParams Result " + a) == null) {
            str = "";
        } else {
            str = a.f123800b;
        }
        Log.m165389i("KaTokenRefreshManager", str);
        boolean z = false;
        if (a.f123799a == 0 && !KaTokenChecker.m194320b(b)) {
            f123801b.mo171465b("KaTokenRefreshManager", "before update, token is valid");
            if (iGetIdpTokenCallback != null) {
                iGetIdpTokenCallback.mo145132a(b, 0, "ok");
            }
        } else if (a.f123799a == 2) {
            f123801b.mo171465b("KaTokenRefreshManager", "before update, refresh token is invalid");
            if (iGetIdpTokenCallback != null) {
                iGetIdpTokenCallback.mo145132a(b, 3, "invalid");
            }
        } else {
            if (!this.f123804c.f123809b.isEmpty()) {
                z = true;
            }
            this.f123804c.f123809b.add(iGetIdpTokenCallback);
            if (z) {
                f123801b.mo171465b("KaTokenRefreshManager", "before update, another request is doing");
            } else {
                C49194j.m193951a(true, new AbstractC49392e() {
                    /* class com.ss.android.lark.passport.kar.refresh.C49323b.C493241 */

                    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
                    /* renamed from: b */
                    public void mo171342b(String str) {
                        C49323b.this.mo171980a(null, str);
                    }

                    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
                    /* renamed from: a */
                    public void mo171341a(String str) {
                        KaConfig kaConfig = (KaConfig) C49296c.m194232a().mo171905a(KaConfig.class);
                        String a = C49159b.m193851a(C49323b.this.f123803a);
                        C49323b.this.mo171982a(C49296c.m194232a().mo171918d(), kaConfig, a, b.refreshToken, b.externalToken, str);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo171980a(KaTokenRefreshResponse kaTokenRefreshResponse, String str) {
        boolean z;
        if (kaTokenRefreshResponse != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (kaTokenRefreshResponse.response != null) {
                PassportLog passportLog = f123801b;
                passportLog.mo171465b("KaTokenRefreshManager", "dispatchResult success returnDesc:" + kaTokenRefreshResponse.response.returnDesc);
            } else {
                f123801b.mo171465b("KaTokenRefreshManager", "dispatchResult success data.response is Null:");
            }
            this.f123804c.mo145179a(kaTokenRefreshResponse);
        } else {
            this.f123804c.mo145178a(new NetworkErrorResult(-1, str));
            PassportLog passportLog2 = f123801b;
            passportLog2.mo171471d("KaTokenRefreshManager", "dispatchResult success=" + str);
        }
    }

    /* renamed from: a */
    public void mo171982a(String str, KaConfig kaConfig, String str2, String str3, String str4, String str5) {
        new KaTokenRefreshRequest(str, kaConfig, str2, str3, str4, str5).request2(new AbstractC49342a<V2ResponseModel<KaTokenRefreshResponse>>() {
            /* class com.ss.android.lark.passport.kar.refresh.C49323b.C493252 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a
            /* renamed from: a */
            public void mo171966a(NetworkErrorResult networkErrorResult) {
                C49323b.this.mo171980a(null, networkErrorResult.toString());
            }

            /* renamed from: a */
            public void mo171968a(V2ResponseModel<KaTokenRefreshResponse> v2ResponseModel) {
                KaTokenRefreshResponse kaTokenRefreshResponse;
                if (v2ResponseModel == null) {
                    kaTokenRefreshResponse = null;
                } else {
                    kaTokenRefreshResponse = (KaTokenRefreshResponse) v2ResponseModel.data;
                }
                C49323b.f123801b.mo171465b("KaTokenRefreshManager", "updateToken success token");
                C49323b.this.mo171980a(kaTokenRefreshResponse, "response data is invalid");
            }
        });
    }
}
