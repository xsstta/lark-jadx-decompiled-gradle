package com.ss.android.bytedcert.p1307e;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.common.utility.Logger;
import com.bytedance.sdk.bridge.BridgeManager;
import com.bytedance.sdk.bridge.C20661b;
import com.bytedance.sdk.bridge.annotation.BridgeContext;
import com.bytedance.sdk.bridge.annotation.BridgeMethod;
import com.bytedance.sdk.bridge.annotation.BridgeParam;
import com.bytedance.sdk.bridge.js.JsBridgeManager;
import com.bytedance.sdk.bridge.js.spec.JsbridgeEventHelper;
import com.bytedance.sdk.bridge.method.AbsAppBridgeModule;
import com.bytedance.sdk.bridge.model.BridgeResult;
import com.bytedance.sdk.bridge.model.IBridgeContext;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.bytedcert.activities.NewPageActivity;
import com.ss.android.bytedcert.activities.SDKWebActivity;
import com.ss.android.bytedcert.callback.AbstractC28334e;
import com.ss.android.bytedcert.callback.AbstractC28335f;
import com.ss.android.bytedcert.callback.AbstractC28336g;
import com.ss.android.bytedcert.callback.SDKCallBack;
import com.ss.android.bytedcert.config.INetWork;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.bytedcert.manager.C28399b;
import com.ss.android.bytedcert.net.BDResponse;
import com.ss.android.bytedcert.net.fetch.FetchJSBRequest;
import com.ss.android.bytedcert.net.fetch.FetchJSBRequestService;
import com.ss.android.bytedcert.net.fetch.FetchJSBResponse;
import com.ss.android.bytedcert.net.p1316a.AbstractC28424c;
import com.ss.android.bytedcert.p1304b.C28317a;
import com.ss.android.bytedcert.p1305c.DialogC28326e;
import com.ss.android.bytedcert.p1306d.C28348a;
import com.ss.android.bytedcert.p1306d.C28349b;
import com.ss.android.bytedcert.p1315h.RunnableC28384a;
import com.ss.android.bytedcert.utils.C28432b;
import com.ss.android.bytedcert.utils.C28435d;
import com.ss.android.bytedcert.utils.C28439e;
import com.ss.android.bytedcert.utils.C28440f;
import com.ss.ttm.player.MediaPlayer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.bytedcert.e.a */
public class C28350a extends AbsAppBridgeModule {

    /* renamed from: a */
    public String f71179a;

    /* renamed from: b */
    public int f71180b;

    /* renamed from: c */
    public int f71181c;

    /* renamed from: d */
    public DialogC28326e f71182d;

    /* renamed from: e */
    private WebView f71183e;

    /* renamed from: f */
    private IBridgeContext f71184f;

    /* renamed from: g */
    private WeakReference<Activity> f71185g;

    @Override // com.bytedance.sdk.bridge.method.AbsAppBridgeModule
    public void alert(IBridgeContext dVar, String str, String str2, String str3, String str4, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.bridge.method.AbsAppBridgeModule
    public BridgeResult checkLoginSatusSync(IBridgeContext dVar) {
        return null;
    }

    @Override // com.bytedance.sdk.bridge.method.AbsAppBridgeModule
    public void login(IBridgeContext dVar) {
    }

    @BridgeMethod(privilege = "public", value = "bytedcert.onBackPressed")
    public void onBackPressed(@BridgeContext IBridgeContext dVar) {
    }

    @Override // com.bytedance.sdk.bridge.method.AbsAppBridgeModule
    public void toast(IBridgeContext dVar, String str, String str2, JSONObject jSONObject) {
    }

    /* renamed from: a */
    public void mo100992a(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("camera_permit", z ? "has_permission" : "no_permission");
            C28432b.m104209a("face_detection_start_camera_permit", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo100991a(String str, JSONObject jSONObject) {
        if (this.f71183e != null) {
            JsbridgeEventHelper.f50506a.mo69658a(str, jSONObject, this.f71183e);
        }
    }

    /* renamed from: b */
    public void mo100993b() {
        mo100991a("bytedcert.onBackPressed", (JSONObject) null);
    }

    /* renamed from: a */
    public void mo100981a() {
        C28435d.m104222a(mo100996c(), new AbstractC28335f() {
            /* class com.ss.android.bytedcert.p1307e.C28350a.AnonymousClass24 */

            @Override // com.ss.android.bytedcert.callback.AbstractC28335f
            /* renamed from: b */
            public void mo100838b() {
                C28350a.this.mo100985a(C28317a.C28318a.f71147k);
            }

            @Override // com.ss.android.bytedcert.callback.AbstractC28335f
            /* renamed from: a */
            public void mo100837a() {
                if (C28350a.this.f71182d != null) {
                    C28350a.this.f71182d.show();
                } else {
                    C28350a.this.mo100985a(C28317a.C28318a.f71138b);
                }
            }
        });
    }

    /* renamed from: d */
    public void mo100998d() {
        this.f71185g = null;
        if (this.f71183e != null) {
            JsBridgeManager.f50485a.mo69636b(this, this.f71183e);
        }
    }

    /* renamed from: c */
    public Activity mo100996c() {
        WeakReference<Activity> weakReference = this.f71185g;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f71185g.get();
    }

    /* renamed from: e */
    private void m103990e() {
        final Activity c = mo100996c();
        if (c != null) {
            DialogC28326e eVar = new DialogC28326e(c);
            this.f71182d = eVar;
            eVar.mo100927a(new View.OnClickListener() {
                /* class com.ss.android.bytedcert.p1307e.C28350a.AnonymousClass12 */

                public void onClick(View view) {
                    BytedCertManager.getInstance().mImgType = "take_photo";
                    C28350a.this.mo100990a("take_photo");
                    C28349b.m103987a(c, C28350a.this.f71179a, 1);
                    C28350a.this.f71182d.dismiss();
                }
            });
            this.f71182d.mo100928b(new View.OnClickListener() {
                /* class com.ss.android.bytedcert.p1307e.C28350a.AnonymousClass20 */

                public void onClick(View view) {
                    BytedCertManager.getInstance().mImgType = "from_album";
                    C28350a.this.mo100990a("from_album");
                    C28349b.m103986a(c, 2, BytedCertManager.getInstance().mPickCallbackImp, new AbstractC28336g.AbstractC28338b() {
                        /* class com.ss.android.bytedcert.p1307e.C28350a.AnonymousClass20.C283531 */
                    });
                    C28350a.this.f71182d.dismiss();
                }
            });
            this.f71182d.mo100929c(new View.OnClickListener() {
                /* class com.ss.android.bytedcert.p1307e.C28350a.AnonymousClass21 */

                public void onClick(View view) {
                    C28350a.this.mo100990a("upload_cancel");
                    C28350a.this.f71182d.dismiss();
                    C28350a.this.mo100985a(C28317a.C28318a.f71144h);
                }
            });
            this.f71182d.setOnCancelListener(new DialogInterface.OnCancelListener() {
                /* class com.ss.android.bytedcert.p1307e.C28350a.AnonymousClass22 */

                public void onCancel(DialogInterface dialogInterface) {
                    C28350a.this.mo100990a("upload_cancel");
                    C28350a.this.f71182d.dismiss();
                    C28350a.this.mo100985a(C28317a.C28318a.f71144h);
                }
            });
        }
    }

    @BridgeMethod(privilege = "public", sync = "ASYNC", value = "bytedcert.doOCR")
    public void doOCR(@BridgeContext final IBridgeContext dVar) {
        C28399b.m104133a().mo101176a(new SDKCallBack.AbstractC28328a() {
            /* class com.ss.android.bytedcert.p1307e.C28350a.C283565 */

            @Override // com.ss.android.bytedcert.callback.SDKCallBack.AbstractC28328a
            /* renamed from: a */
            public void mo100863a(BDResponse bDResponse) {
                C28350a.this.mo100988a(dVar, bDResponse);
            }
        }, 0, (Map<String, String>) null);
    }

    @BridgeMethod(privilege = "public", value = "bytedcert.openLoginPage")
    public void openLoginPage(@BridgeContext IBridgeContext dVar) {
        BytedCertManager.getInstance().executeInMainThread(new Runnable() {
            /* class com.ss.android.bytedcert.p1307e.C28350a.AnonymousClass10 */

            public void run() {
                BytedCertManager instance = BytedCertManager.getInstance();
                if (instance.mCertConflictCallback != null) {
                    instance.mCertConflictCallback.mo100934a();
                    Logger.m15167d("#h5callback", "onOpenLoginPage");
                }
            }
        });
    }

    /* renamed from: b */
    public void mo100995b(String str) {
        C28349b.m103989a(this.f71179a, str);
        mo100985a((Pair<Integer, String>) null);
    }

    @BridgeMethod(privilege = "public", sync = "ASYNC", value = "bytedcert.setPageLoaded")
    public void setPageLoaded(@BridgeContext IBridgeContext dVar) {
        Activity c;
        if (BytedCertManager.getInstance().getCertConfig().mo100947a() && (c = mo100996c()) != null) {
            c.runOnUiThread(new Runnable() {
                /* class com.ss.android.bytedcert.p1307e.C28350a.AnonymousClass19 */

                public void run() {
                    Activity c = C28350a.this.mo100996c();
                    if (c != null) {
                        ((SDKWebActivity) c).mo100907a(true);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo100985a(Pair<Integer, String> pair) {
        if (pair == null) {
            try {
                mo100986a((Pair<Integer, String>) null, C28349b.m103985a(this.f71179a, this.f71180b, this.f71181c));
            } catch (Exception e) {
                mo100986a(C28317a.C28318a.f71138b, "");
                C28432b.m104210a(e, C28317a.m103908b(e));
            }
        } else {
            mo100986a(pair, "");
        }
    }

    /* renamed from: a */
    public void mo100990a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("click_upload_type", str);
        C28432b.m104208a("id_card_photo_upload_alert_click", hashMap);
    }

    @BridgeMethod(privilege = "public", sync = "SYNC", value = "bytedcert.closePage")
    public void closePage(@BridgeContext IBridgeContext dVar, @BridgeParam("data") final JSONObject jSONObject) {
        BytedCertManager.getInstance().executeInMainThread(new Runnable() {
            /* class com.ss.android.bytedcert.p1307e.C28350a.RunnableC283587 */

            public void run() {
                JSONObject jSONObject;
                BytedCertManager instance = BytedCertManager.getInstance();
                if (instance.mH5CallBack != null && jSONObject != null) {
                    instance.mH5CallBack.mo100936a(jSONObject);
                    Logger.m15167d("#h5callback", "data:" + jSONObject.toString());
                } else if (instance.mH5CallBack == null) {
                    Logger.m15167d("#h5callback", "call back is null");
                } else if (jSONObject == null) {
                    Logger.m15167d("#h5callback", "data is null");
                }
                if (instance.mProgressCallback != null && (jSONObject = jSONObject) != null) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("ext_data");
                    if (optJSONObject != null) {
                        instance.mProgressCallback.mo100940a(optJSONObject.optInt("mode"), jSONObject);
                        return;
                    }
                    int i = 0;
                    if (BytedCertManager.getInstance().getCertInfo() != null) {
                        i = Integer.parseInt(BytedCertManager.getInstance().getCertInfo().f71353c);
                    }
                    instance.mProgressCallback.mo100940a(i, jSONObject);
                }
            }
        });
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("status_code", 0);
            dVar.mo69666a(BridgeResult.f50535a.mo69762a(jSONObject2));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Activity c = mo100996c();
        if (c != null) {
            c.finish();
        }
    }

    public C28350a(WebView webView, Activity activity) {
        if (webView != null) {
            this.f71183e = webView;
            if (activity != null) {
                this.f71185g = new WeakReference<>(activity);
            }
            BridgeManager.f50421a.mo69561a(new C20661b.C20663a().mo69551a((Boolean) true).mo69554b(false).mo69553a());
            JsBridgeManager.f50485a.mo69629a(this.f71183e);
            this.f71183e.setWebViewClient(new WebViewClient() {
                /* class com.ss.android.bytedcert.p1307e.C28350a.C283511 */

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (str == null || !JsBridgeManager.f50485a.mo69634a(str)) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    if (webView == null) {
                        return true;
                    }
                    JsBridgeManager.f50485a.mo69632a(webView, str);
                    return true;
                }
            });
            JsBridgeManager.f50485a.mo69631a(this, this.f71183e);
            m103990e();
        }
    }

    /* renamed from: a */
    public void mo100986a(Pair<Integer, String> pair, String str) {
        String str2;
        int i;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (pair != null) {
            i = ((Integer) pair.first).intValue();
            str2 = (String) pair.second;
        } else {
            i = 0;
            str2 = "";
        }
        try {
            jSONObject.put("status_code", i);
            jSONObject.put("description", str2);
            Activity c = mo100996c();
            if (c != null) {
                jSONObject2.put("camera_valid", C28440f.m104232a(c));
            }
            if (i == 0) {
                BytedCertManager instance = BytedCertManager.getInstance();
                jSONObject2.put("image_b64", str);
                jSONObject2.put("stay_inner_time", instance.mImgTimeDelta + "");
                jSONObject2.put("upload_type", instance.mImgType);
            }
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
            IBridgeContext dVar = this.f71184f;
            if (dVar != null) {
                dVar.mo69666a(BridgeResult.f50535a.mo69762a(jSONObject));
            }
        } catch (Exception e) {
            e.printStackTrace();
            C28432b.m104210a(e, C28317a.m103908b(e));
        }
    }

    /* renamed from: a */
    public void mo100987a(IBridgeContext dVar, int i) {
        if (dVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("key_id", i);
                jSONObject.put("status_code", 0);
                jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
                dVar.mo69666a(BridgeResult.f50535a.mo69762a(jSONObject));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo100988a(IBridgeContext dVar, BDResponse bDResponse) {
        if (dVar != null) {
            JSONObject jSONObject = bDResponse.jsonBody;
            if (jSONObject == null) {
                try {
                    jSONObject = new JSONObject();
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            jSONObject.put("status_code", bDResponse.errorCode);
            jSONObject.put("description", bDResponse.errorMsg);
            jSONObject.put("detail_error_code", bDResponse.detailErrorCode);
            jSONObject.put("detail_error_message", bDResponse.detailErrorMsg);
            dVar.mo69666a(BridgeResult.f50535a.mo69762a(jSONObject));
        }
    }

    /* renamed from: a */
    public void mo100984a(int i, String[] strArr, int[] iArr) {
        C28435d.m104221a(mo100996c(), i, strArr, iArr);
    }

    /* renamed from: b */
    public void mo100994b(final IBridgeContext dVar, final String str, final String str2) {
        C28435d.m104222a(mo100996c(), new AbstractC28335f() {
            /* class com.ss.android.bytedcert.p1307e.C28350a.C283522 */

            @Override // com.ss.android.bytedcert.callback.AbstractC28335f
            /* renamed from: a */
            public void mo100837a() {
                C28350a.this.mo100992a(true);
                C28350a.this.mo100989a(dVar, str, str2);
            }

            @Override // com.ss.android.bytedcert.callback.AbstractC28335f
            /* renamed from: b */
            public void mo100838b() {
                C28350a.this.mo100992a(false);
                C28350a.this.mo100988a(dVar, new BDResponse(C28317a.C28318a.f71147k));
            }
        });
    }

    @BridgeMethod(privilege = "public", sync = "ASYNC", value = "bytedcert.webEvent")
    public void receiveWebEvent(@BridgeContext IBridgeContext dVar, @BridgeParam("event") String str, @BridgeParam("data") JSONObject jSONObject) {
        AbstractC28334e webEventCallback = BytedCertManager.getInstance().getWebEventCallback();
        if (webEventCallback != null) {
            webEventCallback.mo100938a(str, jSONObject);
        }
    }

    @BridgeMethod(privilege = "public", sync = "ASYNC", value = "bytedcert.uploadPhoto")
    public void uploadPhoto(@BridgeContext final IBridgeContext dVar, @BridgeParam("type") String str, @BridgeParam(defaultInt = 85, value = "compress_ratio_net_android") int i) {
        BytedCertManager.getInstance().doOCRInternal(str, i, null, new SDKCallBack.AbstractC28328a() {
            /* class com.ss.android.bytedcert.p1307e.C28350a.C283543 */

            @Override // com.ss.android.bytedcert.callback.SDKCallBack.AbstractC28328a
            /* renamed from: a */
            public void mo100863a(BDResponse bDResponse) {
                C28350a.this.mo100988a(dVar, bDResponse);
            }
        });
    }

    /* renamed from: a */
    public void mo100989a(final IBridgeContext dVar, String str, String str2) {
        BytedCertManager.getInstance().doFaceLiveInternal(mo100996c(), str, str2, new SDKCallBack.FaceLiveCallback() {
            /* class com.ss.android.bytedcert.p1307e.C28350a.AnonymousClass26 */

            @Override // com.ss.android.bytedcert.callback.SDKCallBack.FaceLiveCallback
            public void onFaceLiveFinish(BDResponse bDResponse) {
                C28350a.this.mo100988a(dVar, bDResponse);
            }
        });
    }

    @BridgeMethod(privilege = "public", sync = "ASYNC", value = "bytedcert.openLiveCert")
    public void faceLive(@BridgeContext final IBridgeContext dVar, @BridgeParam("identity_code") final String str, @BridgeParam("identity_name") final String str2) {
        C28432b.m104209a("face_detection_start_check", new JSONObject());
        BytedCertManager.getInstance().executeInMainThread(new Runnable() {
            /* class com.ss.android.bytedcert.p1307e.C28350a.AnonymousClass25 */

            public void run() {
                C28350a.this.mo100994b(dVar, str, str2);
            }
        });
    }

    @BridgeMethod(privilege = "public", sync = "SYNC", value = "bytedcert.uploadEvent")
    public void uploadEvent(@BridgeContext IBridgeContext dVar, @BridgeParam("event") String str, @BridgeParam("message") String str2) {
        C28432b.m104207a(str, str2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status_code", 0);
            dVar.mo69666a(BridgeResult.f50535a.mo69762a(jSONObject));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo100982a(int i, int i2, Intent intent) {
        if (i == 1) {
            if (intent == null || intent.getExtras() == null) {
                mo100985a(C28317a.C28318a.f71153q);
            } else if (intent.getExtras().getInt(UpdateKey.STATUS) == 0) {
                mo100985a((Pair<Integer, String>) null);
            } else {
                mo100985a(C28317a.C28318a.f71153q);
            }
        } else if (i == 2) {
            Activity c = mo100996c();
            if (intent == null || intent.getData() == null || c == null) {
                mo100985a(C28317a.C28318a.f71152p);
                return;
            }
            C28432b.m104209a("id_card_photo_upload_select_finish", new JSONObject());
            String a = C28439e.m104225a(c, intent.getData());
            if (!TextUtils.isEmpty(a)) {
                mo100995b(a);
            } else {
                mo100985a(C28317a.C28318a.f71152p);
            }
        }
    }

    @BridgeMethod(privilege = "public", sync = "ASYNC", value = "bytedcert.doRequest")
    public void doRequest(@BridgeContext final IBridgeContext dVar, @BridgeParam("method") String str, @BridgeParam("path") String str2, @BridgeParam("data") JSONObject jSONObject) {
        BytedCertManager.getInstance().doRequest(str, str2, jSONObject, new SDKCallBack.AbstractC28328a() {
            /* class com.ss.android.bytedcert.p1307e.C28350a.AnonymousClass14 */

            @Override // com.ss.android.bytedcert.callback.SDKCallBack.AbstractC28328a
            /* renamed from: a */
            public void mo100863a(BDResponse bDResponse) {
                C28350a.this.mo100988a(dVar, bDResponse);
            }
        });
    }

    @BridgeMethod(privilege = "public", sync = "ASYNC", value = "bytedcert.takePhoto")
    public void takePhoto(@BridgeContext IBridgeContext dVar, @BridgeParam("max_side") int i, @BridgeParam("type") String str, @BridgeParam(defaultInt = 85, value = "compress_ratio_web_android") int i2) {
        if (i == 0) {
            i = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
        }
        this.f71184f = dVar;
        this.f71179a = str;
        this.f71180b = i;
        this.f71181c = i2;
        BytedCertManager.getInstance().executeInMainThread(new Runnable() {
            /* class com.ss.android.bytedcert.p1307e.C28350a.AnonymousClass23 */

            public void run() {
                C28350a.this.mo100981a();
            }
        });
    }

    @BridgeMethod(privilege = "public", sync = "ASYNC", value = "bytedcert.upload")
    public void upload(@BridgeContext final IBridgeContext dVar, @BridgeParam("type") String str, @BridgeParam("url") String str2, @BridgeParam("params") String str3) {
        C28399b.m104133a().mo101178a(new SDKCallBack.AbstractC28328a() {
            /* class com.ss.android.bytedcert.p1307e.C28350a.C283554 */

            @Override // com.ss.android.bytedcert.callback.SDKCallBack.AbstractC28328a
            /* renamed from: a */
            public void mo100863a(BDResponse bDResponse) {
                C28350a.this.mo100988a(dVar, bDResponse);
            }
        }, str, str2, 0, FetchJSBRequestService.f71499a.mo101218a(str3));
    }

    @BridgeMethod(privilege = "public", sync = "ASYNC", value = "bytedcert.manualVerify")
    public void getManuallyVerify(@BridgeContext final IBridgeContext dVar, @BridgeParam("identity_code") String str, @BridgeParam("identity_name") String str2, @BridgeParam("identity_type") String str3, @BridgeParam(defaultInt = 85, value = "compress_ratio_net_android") int i) {
        BytedCertManager.getInstance().doManualCheck(str, str2, str3, i, null, new SDKCallBack.AbstractC28328a() {
            /* class com.ss.android.bytedcert.p1307e.C28350a.C283576 */

            @Override // com.ss.android.bytedcert.callback.SDKCallBack.AbstractC28328a
            /* renamed from: a */
            public void mo100863a(BDResponse bDResponse) {
                C28350a.this.mo100988a(dVar, bDResponse);
            }
        });
    }

    @BridgeMethod(privilege = "public", sync = "SYNC", value = "bytedcert.openPage")
    public void openPage(@BridgeContext IBridgeContext dVar, @BridgeParam("type") String str, @BridgeParam("title") final String str2, @BridgeParam("url") final String str3, @BridgeParam("hide_nav_bar") int i) {
        BytedCertManager.getInstance().executeInMainThread(new Runnable() {
            /* class com.ss.android.bytedcert.p1307e.C28350a.RunnableC283598 */

            public void run() {
                Activity c = C28350a.this.mo100996c();
                if (c != null) {
                    Intent intent = new Intent(c, NewPageActivity.class);
                    intent.putExtra("web_url", str3);
                    intent.putExtra("web_title", str2);
                    c.startActivity(intent);
                }
            }
        });
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status_code", 0);
            dVar.mo69666a(BridgeResult.f50535a.mo69762a(jSONObject));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @BridgeMethod(privilege = "public", value = "bytedcert.dialogShow")
    public void dialogShow(@BridgeContext final IBridgeContext dVar, @BridgeParam("type") final int i, @BridgeParam("scene_id") final int i2, @BridgeParam("key_1") final String str, @BridgeParam("key_2") final String str2, @BridgeParam("title") final String str3, @BridgeParam("message") final String str4) {
        BytedCertManager.getInstance().executeInMainThread(new Runnable() {
            /* class com.ss.android.bytedcert.p1307e.C28350a.RunnableC283609 */

            public void run() {
                C28350a.this.mo100983a(i, i2, str, str2, str3, str4, dVar);
            }
        });
    }

    /* renamed from: a */
    public void mo100983a(int i, int i2, String str, String str2, String str3, String str4, final IBridgeContext dVar) {
        if (i == 2) {
            C28348a.m103981a(mo100996c());
        } else if (i == 0 || i == 1) {
            if (i == 0) {
                str2 = "";
            }
            C28348a.m103982a(mo100996c(), str, str2, str3, str4, new DialogInterface.OnClickListener() {
                /* class com.ss.android.bytedcert.p1307e.C28350a.AnonymousClass11 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    C28350a.this.mo100987a(dVar, 1);
                }
            }, new DialogInterface.OnClickListener() {
                /* class com.ss.android.bytedcert.p1307e.C28350a.AnonymousClass13 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    C28350a.this.mo100987a(dVar, 2);
                }
            });
        }
    }

    @BridgeMethod(privilege = "public", sync = "ASYNC", value = "fetch")
    public void fetch(@BridgeContext final IBridgeContext dVar, @BridgeParam(required = true, value = "url") String str, @BridgeParam(defaultString = "get", value = "method") String str2, @BridgeParam(defaultString = "form", value = "requestType") String str3, @BridgeParam("header") String str4, @BridgeParam("params") String str5, @BridgeParam("data") String str6, @BridgeParam("needCommonParams") boolean z, @BridgeParam("recvJsFirstTime") final long j, @BridgeParam(defaultLong = -1, value = "timeout") long j2, @BridgeParam("ignorePrefetch") boolean z2) {
        final long currentTimeMillis = System.currentTimeMillis();
        final JSONObject jSONObject = new JSONObject();
        final FetchJSBRequest dVar2 = new FetchJSBRequest(str, Boolean.valueOf(z2), str2, str3, str4, str5, str6, Boolean.valueOf(z), Long.valueOf(j2));
        final AnonymousClass15 r8 = new AbstractC28424c<FetchJSBRequest, FetchJSBResponse>() {
            /* class com.ss.android.bytedcert.p1307e.C28350a.AnonymousClass15 */

            /* renamed from: a */
            public void mo101020a(FetchJSBRequest dVar, FetchJSBResponse fVar) {
                try {
                    jSONObject.put("code", 0);
                    Throwable c = fVar.mo101221c();
                    INetWork netWork = BytedCertManager.getInstance().getNetWork();
                    if (!(c == null || netWork == null)) {
                        int exceptionStatusCode = netWork.getExceptionStatusCode(c);
                        if (exceptionStatusCode != 0) {
                            jSONObject.put(UpdateKey.STATUS, exceptionStatusCode);
                        }
                        int checkResponseException = netWork.checkResponseException(c);
                        JSONObject jSONObject = jSONObject;
                        int i = -106;
                        if (checkResponseException != -106) {
                            i = CommonCode.StatusCode.API_CLIENT_EXPIRED;
                        }
                        jSONObject.put("error_code", i);
                    }
                    dVar.mo69666a(BridgeResult.f50535a.mo69763a(jSONObject, fVar.mo101222d()));
                } catch (Exception e) {
                    Logger.m15182w("JSModule", "onFailure", e);
                }
            }

            /* renamed from: a */
            public void mo101021a(FetchJSBRequest dVar, FetchJSBResponse fVar, boolean z) {
                try {
                    int a = fVar.mo101204a();
                    String b = fVar.mo101205b();
                    int i = 1;
                    jSONObject.put("code", 1);
                    jSONObject.put(UpdateKey.STATUS, a);
                    jSONObject.put("response", b);
                    JSONObject jSONObject = jSONObject;
                    if (!z) {
                        i = 0;
                    }
                    jSONObject.put("hitPrefetch", i);
                    long currentTimeMillis = System.currentTimeMillis();
                    jSONObject.put("recvJsCallTime", currentTimeMillis);
                    jSONObject.put("respJsTime", currentTimeMillis);
                    jSONObject.put("recvJsFirstTime", j);
                    dVar.mo69666a(BridgeResult.f50535a.mo69763a(jSONObject, fVar.mo101222d()));
                } catch (Exception e) {
                    Logger.m15182w("JSModule", "onResponse", e);
                }
            }
        };
        new RunnableC28384a() {
            /* class com.ss.android.bytedcert.p1307e.C28350a.AnonymousClass16 */

            @Override // com.ss.android.bytedcert.p1315h.RunnableC28384a
            public void run() {
                FetchJSBRequestService.m104165a(dVar2, r8);
            }
        }.mo101095a();
    }

    @BridgeMethod(privilege = "public", sync = "ASYNC", value = "bytedcert.fetch")
    public void fetch2(@BridgeContext final IBridgeContext dVar, @BridgeParam(required = true, value = "url") String str, @BridgeParam(defaultString = "get", value = "method") String str2, @BridgeParam(defaultString = "form", value = "requestType") String str3, @BridgeParam("header") String str4, @BridgeParam("params") String str5, @BridgeParam("data") String str6, @BridgeParam("needCommonParams") boolean z, @BridgeParam("recvJsFirstTime") long j, @BridgeParam(defaultLong = -1, value = "timeout") long j2, @BridgeParam("ignorePrefetch") boolean z2) {
        System.currentTimeMillis();
        new JSONObject();
        final FetchJSBRequest dVar2 = new FetchJSBRequest(str, Boolean.valueOf(z2), str2, str3, str4, str5, str6, Boolean.valueOf(z), Long.valueOf(j2));
        dVar2.mo101206a(true);
        final AnonymousClass17 r2 = new AbstractC28424c<FetchJSBRequest, FetchJSBResponse>() {
            /* class com.ss.android.bytedcert.p1307e.C28350a.AnonymousClass17 */

            /* renamed from: a */
            public void mo101020a(FetchJSBRequest dVar, FetchJSBResponse fVar) {
                try {
                    C28350a.this.mo100988a(dVar, fVar.mo101223e());
                } catch (Exception e) {
                    Logger.m15182w("JSModule", "onFailure", e);
                }
            }

            /* renamed from: a */
            public void mo101021a(FetchJSBRequest dVar, FetchJSBResponse fVar, boolean z) {
                try {
                    C28350a.this.mo100988a(dVar, fVar.mo101223e());
                } catch (Exception e) {
                    Logger.m15182w("JSModule", "onResponse", e);
                }
            }
        };
        new RunnableC28384a() {
            /* class com.ss.android.bytedcert.p1307e.C28350a.AnonymousClass18 */

            @Override // com.ss.android.bytedcert.p1315h.RunnableC28384a
            public void run() {
                FetchJSBRequestService.m104165a(dVar2, r2);
            }
        }.mo101095a();
    }
}
