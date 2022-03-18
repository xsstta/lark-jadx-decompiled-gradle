package com.bytedance.sdk.bytebridge.base;

import com.bytedance.sdk.bytebridge.base.context.AbsBridgeContext;
import com.bytedance.sdk.bytebridge.base.context.IBridgeContext;
import com.bytedance.sdk.bytebridge.base.context.IBridgeView;
import com.bytedance.sdk.bytebridge.base.error.BridgeCallSuccess;
import com.bytedance.sdk.bytebridge.base.error.GeneralCallError;
import com.bytedance.sdk.bytebridge.base.model.BridgeInfo;
import com.bytedance.sdk.bytebridge.base.model.BridgeSyncTypeEnum;
import com.bytedance.sdk.bytebridge.base.model.C20685c;
import com.bytedance.sdk.bytebridge.base.model.C20686e;
import com.bytedance.sdk.bytebridge.base.model.SynchronizeType;
import com.bytedance.sdk.bytebridge.base.result.AbsBridgeResult;
import com.bytedance.sdk.bytebridge.base.result.AbstractC20688a;
import com.bytedance.sdk.bytebridge.base.result.BridgeSyncResult;
import com.bytedance.sdk.bytebridge.base.utils.BridgeUtils;
import com.bytedance.sdk.bytebridge.base.utils.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0002¢\u0006\u0002\u0010\u0011J'\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0002¢\u0006\u0002\u0010\u0013J/\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u0017H\u0002¢\u0006\u0002\u0010\u0018J$\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/bytedance/sdk/bytebridge/base/BridgeAgent;", "", "()V", "TAG", "", "actualCall", "Lcom/bytedance/sdk/bytebridge/base/result/AbsBridgeResult;", "bridgeContext", "Lcom/bytedance/sdk/bytebridge/base/context/AbsBridgeContext;", "call", "Lcom/bytedance/sdk/bytebridge/base/result/BridgeSyncResult;", "checkParamsRequired", "", "params", "Lorg/json/JSONObject;", "paramInfoList", "Lcom/bytedance/sdk/bytebridge/base/model/BridgeParamInfo;", "(Lorg/json/JSONObject;[Lcom/bytedance/sdk/bytebridge/base/model/BridgeParamInfo;)[Ljava/lang/String;", "checkRequiredParams", "(Lorg/json/JSONObject;[Lcom/bytedance/sdk/bytebridge/base/model/BridgeParamInfo;)Lcom/bytedance/sdk/bytebridge/base/result/BridgeSyncResult;", "processBridgeParams", "bridgeMethodInfo", "Lcom/bytedance/sdk/bytebridge/base/model/BridgeMethodInfo;", "Lcom/bytedance/sdk/bytebridge/base/context/IBridgeContext;", "(Lcom/bytedance/sdk/bytebridge/base/model/BridgeMethodInfo;Lorg/json/JSONObject;Lcom/bytedance/sdk/bytebridge/base/context/IBridgeContext;)[Ljava/lang/Object;", "runBridgeMethod", "bridgeInfo", "Lcom/bytedance/sdk/bytebridge/base/model/BridgeInfo;", "paramsSrc", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.base.a */
public final class BridgeAgent {

    /* renamed from: a */
    public static final BridgeAgent f50555a = new BridgeAgent();

    private BridgeAgent() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.sdk.bytebridge.base.a$a */
    public static final class RunnableC20680a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbsBridgeContext f50556a;

        /* renamed from: b */
        final /* synthetic */ String f50557b;

        RunnableC20680a(AbsBridgeContext aVar, String str) {
            this.f50556a = aVar;
            this.f50557b = str;
        }

        public final void run() {
            AbsBridgeResult b = BridgeAgent.f50555a.mo69775b(this.f50556a);
            if (b == null) {
                this.f50556a.mo69786a(GeneralCallError.METHOD_RETURN_NULL);
            } else if (b instanceof BridgeSyncResult) {
                this.f50556a.mo69789b((BridgeSyncResult) b);
            } else if (b instanceof AbstractC20688a) {
                AbstractC20688a aVar = (AbstractC20688a) b;
                BridgeRegistry.f50559a.mo69780a(aVar, this.f50557b, this.f50556a.mo69793f());
                aVar.mo69851a();
                this.f50556a.mo69786a(BridgeCallSuccess.f50603a);
            }
        }
    }

    /* renamed from: a */
    public final BridgeSyncResult mo69774a(AbsBridgeContext aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "bridgeContext");
        ByteBridge.f50573b.mo69805c();
        String c = aVar.mo69790c();
        if (aVar.mo69788b() == SynchronizeType.ASYNC) {
            BridgeUtils.f50598a.mo69819b().post(new RunnableC20680a(aVar, c));
            return BridgeSyncResult.f50625b.mo69857a();
        }
        AbsBridgeResult b = mo69775b(aVar);
        if (!(b instanceof BridgeSyncResult)) {
            b = null;
        }
        BridgeSyncResult fVar = (BridgeSyncResult) b;
        if (fVar == null) {
            aVar.mo69786a(GeneralCallError.METHOD_RETURN_NULL);
            return BridgeSyncResult.Companion.m75435a(BridgeSyncResult.f50625b, GeneralCallError.METHOD_RETURN_NULL, null, null, 6, null);
        }
        aVar.mo69786a(BridgeCallSuccess.f50603a);
        return fVar;
    }

    /* renamed from: b */
    public final AbsBridgeResult mo69775b(AbsBridgeContext aVar) {
        IBridgeView f = aVar.mo69793f();
        BridgeInfo a = BridgeRegistry.f50559a.mo69779a(aVar.mo69790c(), f);
        if (a == null) {
            return aVar.mo69791d();
        }
        if (aVar.mo69788b() == SynchronizeType.SYNC && a.mo69833b().mo69839c() == BridgeSyncTypeEnum.ASYNC) {
            return BridgeSyncResult.Companion.m75435a(BridgeSyncResult.f50625b, GeneralCallError.SYNC_CALL_ASYNC, null, null, 6, null);
        }
        C20685c b = a.mo69833b();
        JSONObject c = aVar.mo69797j().mo69816c();
        C20686e[] d = b.mo69840d();
        Intrinsics.checkExpressionValueIsNotNull(d, "bridgeMethodInfo.bridgeParamInfoList");
        if (m75351a(c, d) != null) {
            return BridgeSyncResult.Companion.m75435a(BridgeSyncResult.f50625b, GeneralCallError.PARAMS_INCOMPATIBLE, null, null, 6, null);
        }
        if (!aVar.mo69787a(a)) {
            return BridgeSyncResult.Companion.m75435a(BridgeSyncResult.f50625b, GeneralCallError.AUTH_FILED, null, null, 6, null);
        }
        return m75350a(a, c, aVar);
    }

    /* renamed from: a */
    private final BridgeSyncResult m75351a(JSONObject jSONObject, C20686e[] eVarArr) {
        boolean z;
        String[] b = m75353b(jSONObject, eVarArr);
        if (b.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z)) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (String str : b) {
            jSONArray.put(str);
        }
        jSONObject2.put("params", jSONArray);
        Logger.f50602a.mo69824a("bytebridge-BridgeAgent", "params is error");
        return BridgeSyncResult.f50625b.mo69858a(GeneralCallError.PARAMS_INCOMPATIBLE, null, jSONObject2);
    }

    /* renamed from: b */
    private final String[] m75353b(JSONObject jSONObject, C20686e[] eVarArr) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (eVarArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        for (C20686e eVar : eVarArr) {
            if (eVar.mo69846e()) {
                if (jSONObject == null) {
                    Intrinsics.throwNpe();
                }
                if (jSONObject.opt(eVar.mo69844c()) == null) {
                    String c = eVar.mo69844c();
                    Intrinsics.checkExpressionValueIsNotNull(c, "it.paramName");
                    arrayList.add(c);
                }
            }
        }
        Object[] array2 = arrayList.toArray(new String[0]);
        if (array2 != null) {
            return (String[]) array2;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    private final AbsBridgeResult m75350a(BridgeInfo bVar, JSONObject jSONObject, IBridgeContext cVar) {
        try {
            Object[] a = m75352a(bVar.mo69833b(), jSONObject, cVar);
            Object invoke = bVar.mo69833b().mo69837a().invoke(bVar.mo69832a(), Arrays.copyOf(a, a.length));
            if (!(invoke instanceof AbsBridgeResult)) {
                invoke = null;
            }
            return (AbsBridgeResult) invoke;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cb, code lost:
        if (r5 != null) goto L_0x00d9;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object[] m75352a(com.bytedance.sdk.bytebridge.base.model.C20685c r10, org.json.JSONObject r11, com.bytedance.sdk.bytebridge.base.context.IBridgeContext r12) {
        /*
        // Method dump skipped, instructions count: 369
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.bytebridge.base.BridgeAgent.m75352a(com.bytedance.sdk.bytebridge.base.model.c, org.json.JSONObject, com.bytedance.sdk.bytebridge.base.c.c):java.lang.Object[]");
    }
}
