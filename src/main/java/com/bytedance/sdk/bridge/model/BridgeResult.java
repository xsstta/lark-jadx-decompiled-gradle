package com.bytedance.sdk.bridge.model;

import android.text.TextUtils;
import com.bytedance.sdk.bridge.Logger;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

public final class BridgeResult {

    /* renamed from: a */
    public static final Companion f50535a = new Companion(null);

    /* renamed from: b */
    private int f50536b = CODE.ERROR.getValue();

    /* renamed from: c */
    private String f50537c;

    /* renamed from: d */
    private JSONObject f50538d;

    public enum CODE {
        SUCCESS(1),
        ERROR(0),
        NOT_FOUND(-2),
        NO_PRIVILEGE(-1),
        PARAMS_ERROR(-3);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        private CODE(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.sdk.bridge.model.BridgeResult$a */
    public static final class Companion {
        /* renamed from: a */
        public final BridgeResult mo69762a(JSONObject jSONObject) {
            return m75333a(this, jSONObject, (String) null, 2, (Object) null);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final BridgeResult mo69761a(String str, JSONObject jSONObject) {
            Logger lVar = Logger.f50514b;
            lVar.mo69733a("BridgeResult", "createErrorResult " + String.valueOf(jSONObject) + " " + str);
            BridgeResult bridgeResult = new BridgeResult();
            bridgeResult.mo69754a(CODE.ERROR.getValue());
            if (!TextUtils.isEmpty(str)) {
                bridgeResult.mo69755a(str);
            }
            if (jSONObject != null) {
                bridgeResult.mo69756a(jSONObject);
            }
            return bridgeResult;
        }

        /* renamed from: b */
        public final BridgeResult mo69764b(String str, JSONObject jSONObject) {
            Logger lVar = Logger.f50514b;
            lVar.mo69733a("BridgeResult", "createMethodNotFoundResult " + String.valueOf(jSONObject) + " " + str);
            BridgeResult bridgeResult = new BridgeResult();
            bridgeResult.mo69754a(CODE.NOT_FOUND.getValue());
            if (TextUtils.isEmpty(str)) {
                bridgeResult.mo69755a("the bridge is not found, are u register?");
            } else {
                bridgeResult.mo69755a(str);
            }
            if (jSONObject != null) {
                bridgeResult.mo69756a(jSONObject);
            }
            return bridgeResult;
        }

        /* renamed from: c */
        public final BridgeResult mo69765c(String str, JSONObject jSONObject) {
            Logger lVar = Logger.f50514b;
            lVar.mo69733a("BridgeResult", "createNoPrivilegeResult " + String.valueOf(jSONObject) + " " + str);
            BridgeResult bridgeResult = new BridgeResult();
            bridgeResult.mo69754a(CODE.NO_PRIVILEGE.getValue());
            if (TextUtils.isEmpty(str)) {
                bridgeResult.mo69755a("the bridge is no privilege, please check again.");
            } else {
                bridgeResult.mo69755a(str);
            }
            if (jSONObject != null) {
                bridgeResult.mo69756a(jSONObject);
            }
            return bridgeResult;
        }

        /* renamed from: d */
        public final BridgeResult mo69766d(String str, JSONObject jSONObject) {
            Logger lVar = Logger.f50514b;
            lVar.mo69733a("BridgeResult", "createParamsErrorResult " + String.valueOf(jSONObject) + " " + str);
            BridgeResult bridgeResult = new BridgeResult();
            bridgeResult.mo69754a(CODE.PARAMS_ERROR.getValue());
            if (TextUtils.isEmpty(str)) {
                bridgeResult.mo69755a("the bridge's params is error, please check again.");
            } else {
                bridgeResult.mo69755a(str);
            }
            if (jSONObject != null) {
                bridgeResult.mo69756a(jSONObject);
            }
            return bridgeResult;
        }

        /* renamed from: a */
        public final BridgeResult mo69763a(JSONObject jSONObject, String str) {
            Logger lVar = Logger.f50514b;
            lVar.mo69733a("BridgeResult", "createSuccessResult " + String.valueOf(jSONObject) + " " + str);
            BridgeResult bridgeResult = new BridgeResult();
            bridgeResult.mo69754a(CODE.SUCCESS.getValue());
            if (!TextUtils.isEmpty(str)) {
                bridgeResult.mo69755a(str);
            }
            if (jSONObject != null) {
                bridgeResult.mo69756a(jSONObject);
            }
            return bridgeResult;
        }

        /* renamed from: a */
        public static /* synthetic */ BridgeResult m75332a(Companion aVar, String str, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                jSONObject = null;
            }
            return aVar.mo69761a(str, jSONObject);
        }

        /* renamed from: b */
        public static /* synthetic */ BridgeResult m75334b(Companion aVar, String str, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                jSONObject = null;
            }
            return aVar.mo69764b(str, jSONObject);
        }

        /* renamed from: c */
        public static /* synthetic */ BridgeResult m75335c(Companion aVar, String str, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                jSONObject = null;
            }
            return aVar.mo69765c(str, jSONObject);
        }

        /* renamed from: a */
        public static /* synthetic */ BridgeResult m75333a(Companion aVar, JSONObject jSONObject, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                jSONObject = null;
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return aVar.mo69763a(jSONObject, str);
        }
    }

    /* renamed from: a */
    public final int mo69753a() {
        return this.f50536b;
    }

    /* renamed from: b */
    public final String mo69757b() {
        return this.f50537c;
    }

    /* renamed from: c */
    public final JSONObject mo69758c() {
        return this.f50538d;
    }

    /* renamed from: d */
    public final JSONObject mo69759d() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", this.f50536b);
        String str = this.f50537c;
        if (str != null) {
            jSONObject.put(UpdateKey.STATUS, str);
        }
        JSONObject jSONObject2 = this.f50538d;
        if (jSONObject2 != null) {
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo69754a(int i) {
        this.f50536b = i;
    }

    /* renamed from: a */
    public final void mo69755a(String str) {
        this.f50537c = str;
    }

    /* renamed from: a */
    public final void mo69756a(JSONObject jSONObject) {
        this.f50538d = jSONObject;
    }
}
