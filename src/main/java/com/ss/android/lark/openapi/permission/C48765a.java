package com.ss.android.lark.openapi.permission;

import android.text.TextUtils;
import com.ss.android.lark.http.model.ErrorResult;
import com.ss.android.lark.http.model.http.AbstractC38765a;
import com.ss.android.lark.http.p1953b.C38763d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.permission.bean.C48768a;
import com.ss.android.lark.openapi.permission.bean.PermissionModel;
import com.ss.android.lark.openapi.permission.http.verify.C48772b;
import com.ss.android.lark.openapi.permission.http.verify.VerifyHttpRequest;
import com.ss.android.lark.openapi.permission.http.verify.VerifyResponse;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.openapi.permission.a */
public class C48765a {

    /* renamed from: a */
    public PermissionModel f122530a;

    /* renamed from: b */
    public String f122531b;

    /* renamed from: b */
    public void mo170324b() {
        this.f122530a = null;
        this.f122531b = null;
        Log.m165389i("OpenApiAuthorization", "clear auth date");
    }

    /* renamed from: a */
    public String mo170322a() {
        PermissionModel permissionModel = this.f122530a;
        if (permissionModel != null) {
            return permissionModel.getApiSession();
        }
        Log.m165389i("OpenApiAuthorization", "fetch js sdk session but is empty");
        return null;
    }

    /* renamed from: a */
    public static String m192097a(String str) {
        int indexOf;
        if (!TextUtils.isEmpty(str) && (indexOf = str.indexOf("#")) != -1) {
            return str.substring(0, indexOf);
        }
        return str;
    }

    /* renamed from: a */
    public PermissionModel mo170321a(C48772b bVar, VerifyResponse verifyResponse) {
        if (bVar == null || verifyResponse == null) {
            return null;
        }
        PermissionModel permissionModel = new PermissionModel();
        permissionModel.setAppId(bVar.mo170349a());
        permissionModel.setTenantId(bVar.mo170353e());
        permissionModel.setSignature(bVar.mo170352d());
        permissionModel.setNonceStr(bVar.mo170351c());
        permissionModel.setUrl(C38763d.m153060a(bVar.mo170354f()));
        permissionModel.setTimestamp(bVar.mo170350b());
        permissionModel.setJsApiList((ArrayList) bVar.mo170355g());
        if (verifyResponse.mDataNode != null) {
            permissionModel.setExpireTime(verifyResponse.mDataNode.getExpireTime());
            permissionModel.setApiSession(verifyResponse.mDataNode.mJsSDKSession);
        }
        return permissionModel;
    }

    /* renamed from: a */
    public void mo170323a(String str, String str2, final C48772b bVar, final AbstractC48767b bVar2) {
        this.f122531b = m192097a(bVar.mo170354f());
        new VerifyHttpRequest(str, str2, bVar).request(new AbstractC38765a<VerifyResponse>() {
            /* class com.ss.android.lark.openapi.permission.C48765a.C487661 */

            /* renamed from: a */
            public void mo50782a(VerifyResponse verifyResponse) {
                if (!TextUtils.equals(C48765a.this.f122531b, C48765a.m192097a(bVar.mo170354f()))) {
                    Log.m165389i("OpenApiAuthorization", "request onSuccess but the url has already changed");
                    return;
                }
                C48765a.this.f122530a = C48765a.this.mo170321a(bVar, verifyResponse);
                AbstractC48767b bVar = bVar2;
                if (bVar != null) {
                    bVar.mo50795a(bVar, verifyResponse);
                }
            }

            @Override // com.ss.android.lark.http.model.http.AbstractC38765a
            /* renamed from: a */
            public void mo50780a(ErrorResult errorResult) {
                if (!TextUtils.equals(C48765a.this.f122531b, C48765a.m192097a(bVar.mo170354f()))) {
                    Log.m165389i("OpenApiAuthorization", "request onError but the url has already changed");
                } else if (bVar2 != null) {
                    int i = 333441;
                    String str = "invalid signature";
                    if (errorResult.getErrorType() == -3 && errorResult.getResponseModel() != null) {
                        i = errorResult.getResponseModel().getErrorCode();
                        if (errorResult.getResponseModel() instanceof VerifyResponse) {
                            String str2 = i + "";
                            if (str2.startsWith("20")) {
                                try {
                                    i = Integer.valueOf("333" + str2.substring(2)).intValue();
                                } catch (Exception e) {
                                    Log.m165391i("OpenApiAuthorization", e);
                                }
                            }
                            str = ((VerifyResponse) errorResult.getResponseModel()).mErrorMsg;
                        }
                    }
                    bVar2.mo50796a(bVar, C48768a.m192108a(i, str).mo51069b());
                }
            }
        });
    }
}
