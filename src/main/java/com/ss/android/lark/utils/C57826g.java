package com.ss.android.lark.utils;

import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.bytedcert.callback.AbstractC28331b;
import com.ss.android.bytedcert.callback.SDKCallBack;
import com.ss.android.bytedcert.config.AbstractC28343c;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.bytedcert.net.BDResponse;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.utils.g */
public class C57826g {

    /* renamed from: a */
    private static C57826g f142433a = new C57826g();

    /* renamed from: com.ss.android.lark.utils.g$a */
    public interface AbstractC57831a {
        /* renamed from: a */
        boolean mo149194a();
    }

    private C57826g() {
    }

    /* renamed from: a */
    public static C57826g m224473a() {
        return f142433a;
    }

    /* renamed from: a */
    public AbstractC28343c mo196179a(final int i, final String str) {
        return new AbstractC28343c() {
            /* class com.ss.android.lark.utils.C57826g.C578302 */

            @Override // com.ss.android.bytedcert.config.AbstractC28343c
            /* renamed from: a */
            public int mo100948a() {
                return i;
            }

            @Override // com.ss.android.bytedcert.config.AbstractC28343c
            /* renamed from: b */
            public String mo100950b() {
                return str;
            }

            @Override // com.ss.android.bytedcert.config.AbstractC28343c
            /* renamed from: a */
            public void mo100949a(String str, JSONObject jSONObject) {
                Log.m165389i("CertSDKHelper", "onEvent: " + str + " params: " + jSONObject.toString());
                Statistics.sendEvent(str, jSONObject);
            }
        };
    }

    /* renamed from: a */
    public HashMap<String, String> mo196180a(String str, String str2, int i, int i2) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("scene", str);
        hashMap.put("ticket", str2);
        hashMap.put("cert_app_id", String.valueOf(i));
        hashMap.put("mode", String.valueOf(i2));
        return hashMap;
    }

    /* renamed from: a */
    public void mo196181a(final Context context, final String str, final String str2, final int i, final int i2, final String str3, final AbstractC57831a aVar, final IGetDataCallback<Void> iGetDataCallback) {
        if (context == null) {
            Log.m165383e("CertSDKHelper", "context is null");
            return;
        }
        Log.m165389i("CertSDKHelper", "start doFaceLiveness. scene:" + str + " ticket:" + str2 + " mode:" + i + " aid:" + i2);
        UICallbackExecutor.post(new Runnable() {
            /* class com.ss.android.lark.utils.C57826g.RunnableC578271 */

            public void run() {
                BytedCertManager.getInstance().setFaceLiveInterruptListener(new AbstractC28331b() {
                    /* class com.ss.android.lark.utils.C57826g.RunnableC578271.C578281 */

                    @Override // com.ss.android.bytedcert.callback.AbstractC28331b
                    /* renamed from: a */
                    public boolean mo100935a() {
                        boolean z;
                        if (aVar != null) {
                            z = aVar.mo149194a();
                        } else {
                            z = false;
                        }
                        Log.m165389i("CertSDKHelper", "shouldInterrupt open facelive:" + z);
                        return z;
                    }
                });
                BytedCertManager.getInstance().setCertInfo(C57826g.this.mo196180a(str, str2, i2, i));
                BytedCertManager.getInstance().setCertMonitorConfig(C57826g.this.mo196179a(i2, str3));
                BytedCertManager.getInstance().doFaceLive(context, null, "", "", new SDKCallBack.FaceLiveCallback() {
                    /* class com.ss.android.lark.utils.C57826g.RunnableC578271.C578292 */

                    @Override // com.ss.android.bytedcert.callback.SDKCallBack.FaceLiveCallback
                    public void onFaceLiveFinish(BDResponse bDResponse) {
                        Log.m165389i("CertSDKHelper", String.format("doFaceLiveness callback errCode : %d detailErrorCode : %d err_msg : %s detailErrorMsg : %s success : %s", Integer.valueOf(bDResponse.errorCode), Integer.valueOf(bDResponse.detailErrorCode), bDResponse.errorMsg, bDResponse.detailErrorMsg, Boolean.valueOf(bDResponse.success)));
                        if (bDResponse.success) {
                            iGetDataCallback.onSuccess(null);
                            Log.m165389i("CertSDKHelper", "doFaceLive. success");
                            return;
                        }
                        iGetDataCallback.onError(new ErrorResult(bDResponse.errorCode, bDResponse.errorMsg));
                        Log.m165383e("CertSDKHelper", String.format("doFaceLive. fail. errCode:%d. errMsg:%s", Integer.valueOf(bDResponse.errorCode), bDResponse.errorMsg));
                    }
                });
            }
        });
    }
}
