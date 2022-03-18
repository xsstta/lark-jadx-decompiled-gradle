package com.bytedance.ee.bear.document.offline.sync;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0014J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/document/offline/sync/BitablePreloadStrategy;", "Lcom/bytedance/ee/bear/document/offline/sync/CommonRNPreloadStrategy;", "()V", "executeRNLoadCompletedData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "getCachedData", "Lcom/bytedance/ee/bear/document/offline/offlinestorage/ResourceData;", "objToken", "getJSONObject", "Lcom/alibaba/fastjson/JSONObject;", "getRNLoadCompletedBinderName", "init", "account", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.offline.sync.b */
public final class BitablePreloadStrategy extends CommonRNPreloadStrategy {

    /* renamed from: k */
    public static final Companion f16776k = new Companion(null);

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.offline.sync.CommonRNPreloadStrategy
    /* renamed from: a */
    public String mo24226a() {
        return "biz.bitable.loadComplete";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/document/offline/sync/BitablePreloadStrategy$Companion;", "", "()V", "BITABLE_CLIENT_VARS_KEY_SUFFIX", "", "BIZ_BITABLE_LOAD_COMPLETE", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.offline.sync.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BitablePreloadStrategy() {
        this.f16764a = "BitablePreloadStrategy";
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public JSONObject mo24216a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "objToken");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) "operation", (Object) "preloadData");
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((Object) "dataType", (Object) "PRELOAD_BITABLE_CLIENT_VARS");
        jSONObject4.put((Object) "bitableToken", (Object) str);
        jSONObject2.put((Object) "body", (Object) jSONObject3);
        return jSONObject;
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: c */
    public C5968f mo24219c(String str) {
        AbstractC5990h hVar;
        Intrinsics.checkParameterIsNotNull(str, "objToken");
        if (TextUtils.isEmpty(this.f16770g)) {
            return new C5968f();
        }
        C5968f d = C5955d.m24025b().mo24098d(this.f16770g, str);
        if (!(d == null || (hVar = this.f16773j) == null)) {
            Long e = d.mo24139e();
            Intrinsics.checkExpressionValueIsNotNull(e, "it.update_time");
            hVar.mo24233a(str, e.longValue());
        }
        return d;
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.CommonRNPreloadStrategy, com.bytedance.ee.bear.document.offline.sync.AbstractC5982a, com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: a */
    public void mo24217a(AccountService.Account account) {
        Intrinsics.checkParameterIsNotNull(account, "account");
        super.mo24217a(account);
        this.f16770g = account.f14592i + "_" + account.f14584a + "_BITABLE_CLIENT_VARS";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.offline.sync.CommonRNPreloadStrategy
    /* renamed from: b */
    public void mo24227b(String str) {
        Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            String optString = jSONObject.optString("bitableToken");
            int optInt = jSONObject.optInt("code");
            String str2 = this.f16764a;
            C13479a.m54764b(str2, "executeRNLoadCompletedData()... bitableToken = " + C13598b.m55197d(optString) + ", code = " + optInt);
            mo24228a(optString, optInt);
        } catch (JSONException e) {
            C13479a.m54759a(this.f16764a, "executeRNLoadCompletedData()... error = ", e);
        }
    }
}
