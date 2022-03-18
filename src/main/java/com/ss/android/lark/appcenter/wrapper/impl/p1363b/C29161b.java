package com.ss.android.lark.appcenter.wrapper.impl.p1363b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.firebase.messaging.Constants;
import com.google.gson.JsonObject;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.lark.appcenter.wrapper.AppCenterModule;
import com.ss.android.lark.appcenter.wrapper.impl.p1364c.p1365a.C29171a;
import com.ss.android.lark.appcenter.wrapper.impl.p1364c.p1365a.C29173b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.C57826g;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.appcenter.wrapper.impl.b.b */
public class C29161b {
    /* renamed from: a */
    public static ErrorResult m107209a() {
        return new ErrorResult(-1, "something error");
    }

    /* renamed from: a */
    public static void m107214a(String str, final IGetDataCallback<String> iGetDataCallback) {
        HashMap hashMap = new HashMap();
        hashMap.put("Cookie", "session=" + AppCenterModule.m107044a().getLoginDependency().mo103388a());
        String a = C29160a.m107206a();
        SendHttpRequest.C15253a a2 = new SendHttpRequest.C15253a().mo55528a(a).mo55526a(SendHttpRequest.Method.POST).mo55533c(str).mo55529a(hashMap);
        Log.m165389i("AILabManager", "insertAilabThreeElement. invoke url: " + a);
        SdkSender.asynSendRequestNonWrap(Command.SEND_HTTP, a2, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.appcenter.wrapper.impl.p1363b.C29161b.C291621 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165384e("AILabManager", "insertAilabThreeElement. onError.", errorResult);
                iGetDataCallback.onError(C29161b.m107209a());
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                try {
                    Log.m165389i("AILabManager", "insertAilabThreeElement. onSuccess");
                    JSONObject jSONObject = new JSONObject(str);
                    if (!jSONObject.has("code") || jSONObject.getInt("code") != 0) {
                        int i = jSONObject.getInt("code");
                        String optString = jSONObject.optString("msg");
                        Log.m165383e("AILabManager", String.format("insertAilabThreeElement. biz fail. code:%d. msg:%s", Integer.valueOf(i), optString));
                        iGetDataCallback.onError(new ErrorResult(i, optString));
                        return;
                    }
                    jSONObject.put("message", (String) jSONObject.remove("msg"));
                    Log.m165389i("AILabManager", "insertAilabThreeElement. biz success");
                    iGetDataCallback.onSuccess(jSONObject.toString());
                } catch (JSONException unused) {
                    Log.m165383e("AILabManager", "insertAilabThreeElement. JSONException. json:" + str);
                    iGetDataCallback.onError(C29161b.m107209a());
                }
            }
        }, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.appcenter.wrapper.impl.p1363b.C29161b.C291632 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return SendHttpResponse.ADAPTER.decode(bArr).json_body;
            }
        });
    }

    /* renamed from: a */
    public static void m107213a(Context context, String str, IGetDataCallback<String> iGetDataCallback) {
        m107215b(context, str, iGetDataCallback);
    }

    /* renamed from: a */
    public static String m107210a(int i, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put("message", str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("reqNo", str2);
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
            return jSONObject.toString();
        } catch (JSONException unused) {
            Log.m165383e("AILabManager", "make facecheck result json error");
            return null;
        }
    }

    /* renamed from: b */
    private static void m107215b(final Context context, String str, final IGetDataCallback<String> iGetDataCallback) {
        HashMap hashMap = new HashMap();
        hashMap.put("Cookie", "session=" + AppCenterModule.m107044a().getLoginDependency().mo103388a());
        String b = C29160a.m107207b();
        SendHttpRequest.C15253a a = new SendHttpRequest.C15253a().mo55528a(b).mo55526a(SendHttpRequest.Method.POST).mo55533c(str).mo55529a(hashMap);
        Log.m165389i("AILabManager", "hasAuthed. invoke url:" + b);
        SdkSender.asynSendRequestNonWrap(Command.SEND_HTTP, a, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.appcenter.wrapper.impl.p1363b.C29161b.C291643 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165384e("AILabManager", "hasAuthed. onError.", errorResult);
                iGetDataCallback.onError(C29161b.m107209a());
                C29171a.m107226a(C29173b.f73003l).addTag("AILabManager").setErrorMessage(errorResult.getDebugMsg()).flush();
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                try {
                    Log.m165389i("AILabManager", "hasAuthed onSuccess.");
                    JSONObject jSONObject = new JSONObject(str);
                    if (!jSONObject.has("code") || jSONObject.getInt("code") != 0 || !jSONObject.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                        int i = jSONObject.getInt("code");
                        String optString = jSONObject.optString("msg");
                        Log.m165383e("AILabManager", "hasAuthed. result error. json: " + str);
                        iGetDataCallback.onError(new ErrorResult(i, optString));
                        if (i == 10100) {
                            C29171a.m107226a(C29173b.f73005n).addTag("AILabManager").flush();
                        } else if (i == 10301) {
                            C29171a.m107226a(C29173b.f72993b).addTag("AILabManager").flush();
                        } else {
                            C29171a.m107226a(C29173b.f73003l).addTag("AILabManager").setErrorMessage(optString).flush();
                        }
                    } else {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                        int optInt = jSONObject2.optInt("authType", 0);
                        String string = jSONObject2.getString("verifyUid");
                        if (TextUtils.isEmpty(string)) {
                            Log.m165383e("AILabManager", "getTicket. uid is null");
                            iGetDataCallback.onError(C29161b.m107209a());
                            C29171a.m107226a(C29173b.f73003l).addTag("AILabManager").setErrorMessage("uid is null").flush();
                            return;
                        }
                        C29171a.m107226a(C29173b.f72992a).addTag("AILabManager").flush();
                        C29161b.m107211a(context, iGetDataCallback, string, optInt);
                    }
                } catch (JSONException unused) {
                    Log.m165383e("AILabManager", "hasAuthed. JSONException. json: " + str);
                    iGetDataCallback.onError(C29161b.m107209a());
                    C29171a.m107226a(C29173b.f73003l).addTag("AILabManager").setErrorMessage(str).flush();
                }
            }
        }, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.appcenter.wrapper.impl.p1363b.C29161b.C291654 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return SendHttpResponse.ADAPTER.decode(bArr).json_body;
            }
        });
    }

    /* renamed from: a */
    public static void m107211a(final Context context, final IGetDataCallback<String> iGetDataCallback, String str, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("Cookie", "session=" + AppCenterModule.m107044a().getLoginDependency().mo103388a());
        String c = C29160a.m107208c();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("uid", str);
        jsonObject.addProperty("ticketType", "verify");
        Log.m165389i("AILabManager", "getTicket. invoke url:" + c);
        SdkSender.asynSendRequestNonWrap(Command.SEND_HTTP, new SendHttpRequest.C15253a().mo55528a(c).mo55526a(SendHttpRequest.Method.POST).mo55533c(jsonObject.toString()).mo55529a(hashMap), new IGetDataCallback<String>() {
            /* class com.ss.android.lark.appcenter.wrapper.impl.p1363b.C29161b.C291665 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165384e("AILabManager", "getTicket. onError.", errorResult);
                iGetDataCallback.onError(C29161b.m107209a());
                C29171a.m107226a(C29173b.f73004m).addTag("AILabManager").setErrorMessage(errorResult.getDebugMsg()).flush();
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                try {
                    Log.m165389i("AILabManager", "getTicket. onSuccess.");
                    JSONObject jSONObject = new JSONObject(str);
                    if (!jSONObject.has("code") || jSONObject.getInt("code") != 0 || !jSONObject.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                        int i = jSONObject.getInt("code");
                        String optString = jSONObject.optString("msg");
                        Log.m165383e("AILabManager", "getTicket. result error. json: " + str);
                        iGetDataCallback.onError(new ErrorResult(i, optString));
                        C29171a.m107226a(C29173b.f73004m).addTag("AILabManager").setErrorMessage(optString).flush();
                        return;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    String optString2 = jSONObject2.optString("ticket", null);
                    String optString3 = jSONObject2.optString("scene", null);
                    int optInt = jSONObject2.optInt("appId", -1);
                    int optInt2 = jSONObject2.optInt("mode", -1);
                    if (!TextUtils.isEmpty(optString2)) {
                        if (!TextUtils.isEmpty(optString3)) {
                            C29171a.m107226a(C29173b.f72994c).addTag("AILabManager").flush();
                            C29161b.m107212a(context, iGetDataCallback, optString3, optString2, optInt2, optInt);
                            return;
                        }
                    }
                    Log.m165383e("AILabManager", String.format("getTicket. params error. ticket is null:%b. scene is null:%b", optString2, optString3));
                    iGetDataCallback.onError(C29161b.m107209a());
                    C29171a.m107226a(C29173b.f73004m).addTag("AILabManager").setErrorMessage("getTicket params error").flush();
                } catch (JSONException unused) {
                    Log.m165383e("AILabManager", "getTicket. JSONException. json: " + str);
                    iGetDataCallback.onError(C29161b.m107209a());
                    C29171a.m107226a(C29173b.f73004m).addTag("AILabManager").setErrorMessage(str).flush();
                }
            }
        }, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.appcenter.wrapper.impl.p1363b.C29161b.C291676 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return SendHttpResponse.ADAPTER.decode(bArr).json_body;
            }
        });
    }

    /* renamed from: a */
    public static void m107212a(Context context, final IGetDataCallback<String> iGetDataCallback, String str, final String str2, int i, int i2) {
        Log.m165389i("AILabManager", "doFaceLive. start ticket:" + str2);
        if (BytedCertManager.getInstance().getNetWork() == null) {
            AppCenterModule.m107044a().initBytecertSdk();
        }
        C57826g.m224473a().mo196181a(context, str, str2, i, i2, AppCenterModule.m107044a().getDeviceId(), null, new IGetDataCallback<Void>() {
            /* class com.ss.android.lark.appcenter.wrapper.impl.p1363b.C29161b.C291687 */

            /* renamed from: a */
            public void onSuccess(Void r4) {
                iGetDataCallback.onSuccess(C29161b.m107210a(0, "ok", str2));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                int errorCode = errorResult.getErrorCode();
                iGetDataCallback.onError(new ErrorResult(errorCode, errorResult.getDebugMsg() + " ticket:" + str2));
            }
        });
    }
}
