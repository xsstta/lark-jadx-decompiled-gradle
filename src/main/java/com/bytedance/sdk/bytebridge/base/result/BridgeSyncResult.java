package com.bytedance.sdk.bytebridge.base.result;

import com.bytedance.sdk.bytebridge.base.error.BridgeErrorType;
import com.bytedance.sdk.bytebridge.base.error.GeneralCallError;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B/\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0013\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u0001\u0002\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/bytedance/sdk/bytebridge/base/result/BridgeSyncResult;", "Lcom/bytedance/sdk/bytebridge/base/result/AbsSyncResult;", "code", "", "errorType", "Lcom/bytedance/sdk/bytebridge/base/error/BridgeErrorType;", "message", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lorg/json/JSONObject;", "(ILcom/bytedance/sdk/bytebridge/base/error/BridgeErrorType;Ljava/lang/String;Lorg/json/JSONObject;)V", "getCode", "()I", "getData", "()Lorg/json/JSONObject;", "getErrorType", "()Lcom/bytedance/sdk/bytebridge/base/error/BridgeErrorType;", "getMessage", "()Ljava/lang/String;", "toJSON", "Companion", "Lcom/bytedance/sdk/bytebridge/base/result/BridgeSuccessResult;", "Lcom/bytedance/sdk/bytebridge/base/result/BridgeErrorResult;", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.base.result.f */
public abstract class BridgeSyncResult extends AbstractC20689c {

    /* renamed from: a */
    public static final BridgeSyncResult f50624a = new BridgeSuccessResult("", null);

    /* renamed from: b */
    public static final Companion f50625b = new Companion(null);

    /* renamed from: c */
    private final int f50626c;

    /* renamed from: d */
    private final BridgeErrorType f50627d;

    /* renamed from: e */
    private final String f50628e;

    /* renamed from: f */
    private final JSONObject f50629f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0007J(\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000e2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u001a\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J \u0010\u0011\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/bytedance/sdk/bytebridge/base/result/BridgeSyncResult$Companion;", "", "()V", "TAG", "", "fakeAsyncResult", "Lcom/bytedance/sdk/bytebridge/base/result/BridgeSyncResult;", "getFakeAsyncResult", "()Lcom/bytedance/sdk/bytebridge/base/result/BridgeSyncResult;", "createCustomErrorResult", "errorType", "Lcom/bytedance/sdk/bytebridge/base/error/CustomBridgeError;", "message", "createErrorResult", "Lcom/bytedance/sdk/bytebridge/base/error/GeneralCallError;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lorg/json/JSONObject;", "createSuccessResult", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.sdk.bytebridge.base.result.f$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final BridgeSyncResult mo69857a() {
            return BridgeSyncResult.f50624a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final BridgeSyncResult mo69858a(GeneralCallError generalCallError, String str, JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(generalCallError, "errorType");
            int code = generalCallError.getCode();
            GeneralCallError generalCallError2 = generalCallError;
            if (str == null) {
                str = generalCallError.getMessage();
            }
            return new BridgeErrorResult(code, generalCallError2, str, jSONObject);
        }

        /* renamed from: a */
        public static /* synthetic */ BridgeSyncResult m75435a(Companion aVar, GeneralCallError generalCallError, String str, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                jSONObject = null;
            }
            return aVar.mo69858a(generalCallError, str, jSONObject);
        }
    }

    /* renamed from: b */
    public final int mo69853b() {
        return this.f50626c;
    }

    /* renamed from: c */
    public final BridgeErrorType mo69854c() {
        return this.f50627d;
    }

    /* renamed from: d */
    public final String mo69855d() {
        return this.f50628e;
    }

    /* renamed from: e */
    public final JSONObject mo69856e() {
        return this.f50629f;
    }

    /* renamed from: a */
    public final JSONObject mo69852a() {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", this.f50626c);
        String str = this.f50628e;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            jSONObject.put(UpdateKey.STATUS, this.f50628e);
        }
        JSONObject jSONObject2 = this.f50629f;
        if (jSONObject2 != null) {
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
        }
        return jSONObject;
    }

    private BridgeSyncResult(int i, BridgeErrorType bVar, String str, JSONObject jSONObject) {
        this.f50626c = i;
        this.f50627d = bVar;
        this.f50628e = str;
        this.f50629f = jSONObject;
    }

    public /* synthetic */ BridgeSyncResult(int i, BridgeErrorType bVar, String str, JSONObject jSONObject, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bVar, str, jSONObject);
    }
}
