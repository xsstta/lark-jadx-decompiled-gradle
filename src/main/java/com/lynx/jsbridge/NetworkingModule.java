package com.lynx.jsbridge;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.lynx.jsbridge.HandlerC26510e;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.provider.AbstractC26936c;
import com.lynx.tasm.provider.AbstractC26942i;
import com.lynx.tasm.provider.C26937d;
import com.lynx.tasm.provider.C26938e;
import com.lynx.tasm.utils.C26956j;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public final class NetworkingModule extends LynxModule implements HandlerC26510e.AbstractC26511a {
    private WeakReference<Handler> mHandler = new WeakReference<>(new HandlerC26510e(Looper.getMainLooper(), this));

    @Override // com.lynx.jsbridge.HandlerC26510e.AbstractC26511a
    public void handleMsg(Message message) {
    }

    public NetworkingModule(Context context) {
        super(context);
    }

    @LynxMethod
    public void request(final ReadableMap readableMap, final Callback callback) {
        if (this.mHandler.get() != null) {
            this.mHandler.get().post(new Runnable() {
                /* class com.lynx.jsbridge.NetworkingModule.RunnableC265041 */

                public void run() {
                    try {
                        AbstractC26942i h = LynxEnv.m96123e().mo94101h();
                        C26937d dVar = new C26937d(readableMap.getString("url"));
                        if (readableMap.hasKey("method")) {
                            dVar.mo95783a(readableMap.getString("method"));
                        }
                        if (readableMap.hasKey("dataType")) {
                            dVar.mo95785b(readableMap.getString("dataType"));
                        }
                        if (readableMap.hasKey("responseType")) {
                            dVar.mo95786c(readableMap.getString("responseType"));
                        }
                        if (readableMap.hasKey(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                            dVar.mo95787d(readableMap.getDynamic(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).mo94069e());
                        }
                        if (readableMap.hasKey("header")) {
                            try {
                                HashMap hashMap = new HashMap();
                                JSONObject jSONObject = new JSONObject(readableMap.getString("header"));
                                Iterator<String> keys = jSONObject.keys();
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    hashMap.put(next, jSONObject.getString(next));
                                }
                                dVar.mo95784a(hashMap);
                            } catch (Throwable unused) {
                            }
                        }
                        h.mo50297a(dVar, new AbstractC26936c() {
                            /* class com.lynx.jsbridge.NetworkingModule.RunnableC265041.C265051 */

                            @Override // com.lynx.tasm.provider.AbstractC26936c
                            /* renamed from: b */
                            public void mo50300b(C26938e eVar) {
                                callback.invoke(eVar.mo95795c());
                            }

                            @Override // com.lynx.tasm.provider.AbstractC26936c
                            /* renamed from: a */
                            public void mo50299a(C26938e eVar) {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, eVar.mo95793b());
                                    jSONObject.put("header", eVar.mo95796d().toString());
                                    jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, C26956j.m97955a(eVar.mo95797e()));
                                    callback.invoke(jSONObject.toString());
                                } catch (Exception e) {
                                    callback.invoke(e.toString());
                                }
                            }
                        });
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
