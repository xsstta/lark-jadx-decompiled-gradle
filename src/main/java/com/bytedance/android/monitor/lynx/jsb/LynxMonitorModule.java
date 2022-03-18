package com.bytedance.android.monitor.lynx.jsb;

import android.content.Context;
import com.bytedance.android.monitor.lynx.LynxMonitor;
import com.bytedance.android.monitor.lynx.data.entity.LynxNativeErrorData;
import com.bytedance.android.monitor.p112i.C2655c;
import com.google.gson.Gson;
import com.lynx.jsbridge.C26506a;
import com.lynx.jsbridge.LynxMethod;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableMap;
import com.lynx.tasm.LynxView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u001c\u0010\r\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u001c\u0010\u0013\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/android/monitor/lynx/jsb/LynxMonitorModule;", "Lcom/lynx/jsbridge/LynxModule;", "context", "Landroid/content/Context;", "param", "", "(Landroid/content/Context;Ljava/lang/Object;)V", "gson", "Lcom/google/gson/Gson;", "convertJson", "Lorg/json/JSONObject;", "dataMap", "Lcom/lynx/react/bridge/ReadableMap;", "customReport", "", "callback", "Lcom/lynx/react/bridge/Callback;", "getError", "Lcom/bytedance/android/monitor/lynx/data/entity/LynxNativeErrorData;", "reportJSError", "Companion", "lynx_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class LynxMonitorModule extends LynxModule {
    public static final Companion Companion = new Companion(null);
    private final Gson gson = new Gson();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/android/monitor/lynx/jsb/LynxMonitorModule$Companion;", "", "()V", "ERROR_CODE", "", "ERROR_MESSAGE", "FAIL", "", "NAME", "SUCCESS", "lynx_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.android.monitor.lynx.jsb.LynxMonitorModule$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final JSONObject convertJson(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        JSONObject jSONObject = null;
        try {
            return new JSONObject(this.gson.toJson(readableMap));
        } catch (Throwable th) {
            C2655c.m11159a(th);
            return jSONObject;
        }
    }

    private final LynxNativeErrorData getError(ReadableMap readableMap) {
        LynxNativeErrorData dVar = new LynxNativeErrorData();
        try {
            dVar.mo11517a("lynx_error_custom");
            dVar.mo11516a(201);
            dVar.mo11519b(String.valueOf(convertJson(readableMap)));
            return dVar;
        } catch (Exception e) {
            C2655c.m11159a(e);
            return dVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxMonitorModule(Context context, Object obj) {
        super(context, obj);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(obj, "param");
    }

    @LynxMethod
    public final void reportJSError(ReadableMap readableMap, Callback callback) {
        if (readableMap != null && this.mParam != null) {
            WritableMap a = C26506a.m96074a();
            a.putInt("errorCode", -1);
            if (this.mParam instanceof MonitorViewProvider) {
                Object obj = this.mParam;
                if (obj != null) {
                    LynxView a2 = ((MonitorViewProvider) obj).mo11545a();
                    if (a2 != null) {
                        LynxMonitor.f8455b.mo11508a().mo11498a(a2, getError(readableMap));
                        a.putInt("errorCode", 0);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.android.monitor.lynx.jsb.MonitorViewProvider");
                }
            }
            if (callback != null) {
                callback.invoke(a);
            }
        }
    }

    @LynxMethod
    public final void customReport(ReadableMap readableMap, Callback callback) {
        boolean z;
        if (readableMap != null && this.mParam != null) {
            WritableMap a = C26506a.m96074a();
            a.putInt("errorCode", -1);
            if (this.mParam instanceof MonitorViewProvider) {
                Object obj = this.mParam;
                if (obj != null) {
                    LynxView a2 = ((MonitorViewProvider) obj).mo11545a();
                    if (a2 != null) {
                        try {
                            String string = readableMap.getString("eventName", "");
                            ReadableMap map = readableMap.getMap("category");
                            ReadableMap map2 = readableMap.getMap("metrics");
                            int i = readableMap.getInt("canSample", 1);
                            LynxMonitor a3 = LynxMonitor.f8455b.mo11508a();
                            String templateUrl = a2.getTemplateUrl();
                            JSONObject convertJson = convertJson(map);
                            JSONObject convertJson2 = convertJson(map2);
                            if (i == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            a3.mo11501a(a2, string, templateUrl, convertJson, convertJson2, null, null, z);
                            a.putInt("errorCode", 0);
                        } catch (Exception e) {
                            a.putString("errorMessage", "cause: " + e.getMessage());
                            C2655c.m11159a(e);
                        }
                    } else {
                        a.putString("errorMessage", "view is empty.");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.android.monitor.lynx.jsb.MonitorViewProvider");
                }
            } else {
                a.putString("errorMessage", "mParam is not MonitorViewProvider.");
            }
            if (callback != null) {
                callback.invoke(a);
            }
        }
    }
}
