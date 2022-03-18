package com.ss.android.appcenter.business.activity.appdetail;

import android.text.TextUtils;
import androidx.lifecycle.C1174u;
import androidx.lifecycle.LiveData;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.bytedance.lark.pb.openplatform.v1.GetAppDetailRequest;
import com.bytedance.lark.pb.openplatform.v1.GetAppDetailResponse;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.appcenter.C27528a;
import com.ss.android.appcenter.business.dto.AppDetailInfo;
import com.ss.android.appcenter.business.dto.C27698e;
import com.ss.android.appcenter.business.net.p1270a.C27714b;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28186i;
import com.ss.android.appcenter.common.util.C28196n;
import com.ss.android.appcenter.p1262a.AbstractC27532a;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.tt.miniapp.util.ACache;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: com.ss.android.appcenter.business.activity.appdetail.b */
public class C27637b {

    /* renamed from: a */
    public C1174u<AppDetailInfo> f68988a;

    /* renamed from: com.ss.android.appcenter.business.activity.appdetail.b$a */
    private static class C27644a {

        /* renamed from: a */
        static final C27637b f69005a = new C27637b();
    }

    /* renamed from: a */
    public static C27637b m100906a() {
        return C27644a.f69005a;
    }

    /* renamed from: b */
    public C1174u<AppDetailInfo> mo98431b() {
        return this.f68988a;
    }

    private C27637b() {
        this.f68988a = new C1174u<>();
    }

    /* renamed from: c */
    public void mo98432c() {
        if (C27528a.m100471a().mo98143b() != null) {
            try {
                ACache.m261150a(C27528a.m100471a().mo98143b(), "appdetail").mo233094a();
            } catch (ACache.CacheException e) {
                C28184h.m103250d("AppCenter_Common", "ACache exception：" + e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AppDetailInfo m100907a(byte[] bArr) throws IOException {
        GetAppDetailResponse decode = GetAppDetailResponse.ADAPTER.decode(bArr);
        try {
            JSONObject jSONObject = new JSONObject(decode.json_resp);
            int i = jSONObject.getInt("code");
            String string = jSONObject.getString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("AppDetailRemoteDataSour", "getAppDetailInfoNetWork: " + decode.json_resp);
            if (i != 0 || TextUtils.isEmpty(string)) {
                return null;
            }
            return (AppDetailInfo) new Gson().fromJson(string, AppDetailInfo.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private void m100908a(final String str, final AbstractC27532a<AppDetailInfo> aVar) {
        if (aVar != null) {
            if (TextUtils.isEmpty(str) || C27528a.m100471a().mo98143b() == null) {
                aVar.mo98151a(new ErrorResult(0));
            }
            C28196n.m103272a((C28196n.AbstractRunnableC28201b) new C28196n.AbstractC28200a<AppDetailInfo>() {
                /* class com.ss.android.appcenter.business.activity.appdetail.C27637b.C276412 */

                /* renamed from: a */
                public AppDetailInfo mo98233b() throws Throwable {
                    try {
                        return (AppDetailInfo) new Gson().fromJson(ACache.m261150a(C27528a.m100471a().mo98143b(), "appdetail").mo233093a(C28186i.m103256a(str)), AppDetailInfo.class);
                    } catch (ACache.CacheException e) {
                        C28184h.m103250d("AppCenter_Common", "ACache exception：" + e);
                        return null;
                    } catch (Exception unused) {
                        return null;
                    }
                }

                /* renamed from: a */
                public void mo98231a(AppDetailInfo appDetailInfo) {
                    if (appDetailInfo != null) {
                        aVar.mo98152a(appDetailInfo);
                    } else {
                        aVar.mo98151a(new ErrorResult(0));
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public LiveData<AppDetailInfo> mo98428a(final String str, final boolean z, final String str2) {
        if (TextUtils.isEmpty(str) || C27528a.m100471a().mo98143b() == null) {
            this.f68988a.mo5926a((AppDetailInfo) null);
            return this.f68988a;
        }
        m100908a(str, new AbstractC27532a<AppDetailInfo>() {
            /* class com.ss.android.appcenter.business.activity.appdetail.C27637b.C276381 */

            /* renamed from: a */
            public void mo98152a(AppDetailInfo appDetailInfo) {
                C27637b.this.f68988a.mo5926a(appDetailInfo);
                C27637b.this.mo98430a(str, z, str2, new AbstractC27532a<AppDetailInfo>() {
                    /* class com.ss.android.appcenter.business.activity.appdetail.C27637b.C276381.C276391 */

                    /* renamed from: a */
                    public void mo98152a(AppDetailInfo appDetailInfo) {
                        C27637b.this.f68988a.mo5926a(appDetailInfo);
                    }

                    @Override // com.ss.android.appcenter.p1262a.AbstractC27532a
                    /* renamed from: a */
                    public void mo98151a(ErrorResult errorResult) {
                        C28184h.m103248b("AppDetailRemoteDataSour", "get app detail from network fail! " + errorResult.getErrorMsg());
                    }
                });
            }

            @Override // com.ss.android.appcenter.p1262a.AbstractC27532a
            /* renamed from: a */
            public void mo98151a(ErrorResult errorResult) {
                C28184h.m103249c("AppDetailRemoteDataSour", "get app detail info not hit! " + str);
                C27637b.this.mo98430a(str, z, str2, new AbstractC27532a<AppDetailInfo>() {
                    /* class com.ss.android.appcenter.business.activity.appdetail.C27637b.C276381.C276402 */

                    /* renamed from: a */
                    public void mo98152a(AppDetailInfo appDetailInfo) {
                        C27637b.this.f68988a.mo5926a(appDetailInfo);
                    }

                    @Override // com.ss.android.appcenter.p1262a.AbstractC27532a
                    /* renamed from: a */
                    public void mo98151a(ErrorResult errorResult) {
                        C27637b.this.f68988a.mo5926a((AppDetailInfo) null);
                        C28184h.m103248b("AppDetailRemoteDataSour", "get app detail from network fail! " + errorResult.getErrorMsg());
                    }
                });
            }
        });
        return this.f68988a;
    }

    /* renamed from: a */
    public void mo98429a(final String str, final AppDetailInfo appDetailInfo, String str2, final int i) {
        C27645c.m100930a(str2, i, new C27714b.AbstractC27716a() {
            /* class com.ss.android.appcenter.business.activity.appdetail.C27637b.C276434 */

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
                C28184h.m103250d("AppDetailRemoteDataSour", "notification setting update onError:" + errorResult);
            }

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
                C28184h.m103250d("AppDetailRemoteDataSour", "notification setting update response:" + sendHttpResponse);
                C27698e eVar = (C27698e) new Gson().fromJson(sendHttpResponse.json_body, C27698e.class);
                if (sendHttpResponse.http_status_code.intValue() == 200 && eVar != null && eVar.mo98853a() == 0) {
                    appDetailInfo.setmNotificationType(i);
                    try {
                        ACache.m261150a(C27528a.m100471a().mo98143b(), "appdetail").mo233095a(C28186i.m103256a(str), new Gson().toJson(appDetailInfo));
                    } catch (ACache.CacheException e) {
                        C28184h.m103250d("AppCenter_Common", "ACache exception：" + e);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo98430a(final String str, boolean z, String str2, final AbstractC27532a<AppDetailInfo> aVar) {
        if (aVar != null) {
            if (TextUtils.isEmpty(str) || C27528a.m100471a().mo98143b() == null || C27548m.m100547m().mo98221e() == null) {
                aVar.mo98151a(new ErrorResult(0));
            }
            GetAppDetailRequest.C18649a aVar2 = new GetAppDetailRequest.C18649a();
            if (z) {
                aVar2.mo64215a(str);
            } else {
                aVar2.mo64217b(str);
            }
            aVar2.mo64218c(str2);
            aVar2.build();
            SdkSender.asynSendRequestNonWrap(Command.GET_APP_DETAIL, aVar2, new IGetDataCallback<AppDetailInfo>() {
                /* class com.ss.android.appcenter.business.activity.appdetail.C27637b.C276423 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    aVar.mo98151a(errorResult);
                    C28184h.m103248b("AppDetailRemoteDataSour", "onError: " + errorResult.getErrorMsg());
                }

                /* renamed from: a */
                public void onSuccess(AppDetailInfo appDetailInfo) {
                    if (appDetailInfo != null) {
                        aVar.mo98152a(appDetailInfo);
                        try {
                            ACache.m261150a(C27528a.m100471a().mo98143b(), "appdetail").mo233095a(C28186i.m103256a(str), new Gson().toJson(appDetailInfo));
                        } catch (ACache.CacheException e) {
                            C28184h.m103250d("AppCenter_Common", "ACache异常：" + e);
                        }
                    } else {
                        aVar.mo98151a(new ErrorResult(0));
                    }
                }
            }, $$Lambda$b$mk3_uBh3tNG5jOBCf0XktCOGmBk.INSTANCE);
        }
    }
}
