package com.bytedance.ee.bear.document.offline.sync;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.google.firebase.messaging.Constants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0014J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0014J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J \u0010\u0016\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R(\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ee/bear/document/offline/sync/SheetPreloadStrategy;", "Lcom/bytedance/ee/bear/document/offline/sync/CommonRNPreloadStrategy;", "()V", "mClientVarKey", "", "mInnerSheetMap", "", "Landroid/util/Pair;", "executeRNLoadCompletedData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getCachedData", "Lcom/bytedance/ee/bear/document/offline/offlinestorage/ResourceData;", "objToken", "getJSONObject", "Lcom/alibaba/fastjson/JSONObject;", "sheetToken", "docToken", "getRNLoadCompletedBinderName", "init", "account", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "preload", "docResKey", "updateResultAsSubblock", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.offline.sync.n */
public final class SheetPreloadStrategy extends CommonRNPreloadStrategy {

    /* renamed from: k */
    public static final Companion f16816k = new Companion(null);

    /* renamed from: m */
    private String f16817m;

    /* renamed from: n */
    private final Map<String, Pair<String, String>> f16818n = new ConcurrentHashMap();

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.offline.sync.CommonRNPreloadStrategy
    /* renamed from: a */
    public String mo24226a() {
        return "biz.sheet.loadComplete";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/document/offline/sync/SheetPreloadStrategy$Companion;", "", "()V", "SHEET_CLIENT_VARS_KEY_SUFFIX", "", "SHEET_DATA_COMPLETE_KEY_SUFFIX", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.offline.sync.n$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.offline.sync.n$b */
    static final class RunnableC6008b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SheetPreloadStrategy f16819a;

        /* renamed from: b */
        final /* synthetic */ String f16820b;

        RunnableC6008b(SheetPreloadStrategy nVar, String str) {
            this.f16819a = nVar;
            this.f16820b = str;
        }

        public final void run() {
            SheetPreloadStrategy nVar = this.f16819a;
            String str = this.f16820b;
            Intrinsics.checkExpressionValueIsNotNull(str, "sheetToken");
            nVar.mo24274e(str);
        }
    }

    public SheetPreloadStrategy() {
        this.f16764a = "SheetPreloadStrategy";
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public JSONObject mo24216a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "sheetToken");
        return m24317b(str, "");
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.CommonRNPreloadStrategy, com.bytedance.ee.bear.document.offline.sync.AbstractC5982a, com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: a */
    public void mo24217a(AccountService.Account account) {
        Intrinsics.checkParameterIsNotNull(account, "account");
        super.mo24217a(account);
        this.f16770g = account.f14592i + "_" + account.f14584a + "_SHEET_DATA_COMPLETE";
        this.f16817m = account.f14592i + "_" + account.f14584a + "_SHEET_CLIENT_VARS";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.offline.sync.CommonRNPreloadStrategy, com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: b */
    public void mo24227b(String str) {
        Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            String optString = jSONObject.optString("sheetToken");
            int optInt = jSONObject.optInt("code");
            String str2 = this.f16764a;
            C13479a.m54764b(str2, "executeRNLoadCompletedData()... sheetToken = " + C13598b.m55197d(optString) + ", code = " + optInt);
            mo24228a(optString, optInt);
            C11678b.m48479c().scheduleDirect(new RunnableC6008b(this, optString));
        } catch (JSONException e) {
            C13479a.m54759a(this.f16764a, "executeRNLoadCompletedData()... error = ", e);
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: c */
    public C5968f mo24219c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "objToken");
        if (TextUtils.isEmpty(this.f16770g)) {
            return new C5968f();
        }
        C5968f d = C5955d.m24025b().mo24098d(this.f16770g, str);
        if (d == null || !TextUtils.equals(d.mo24137d(), "true")) {
            return null;
        }
        C5968f d2 = C5955d.m24025b().mo24098d(this.f16817m, str);
        AbstractC5990h hVar = this.f16773j;
        if (hVar == null) {
            return d2;
        }
        Intrinsics.checkExpressionValueIsNotNull(d2, "resourceData");
        Long e = d2.mo24139e();
        Intrinsics.checkExpressionValueIsNotNull(e, "resourceData.update_time");
        hVar.mo24233a(str, e.longValue());
        return d2;
    }

    /* renamed from: e */
    public final void mo24274e(String str) {
        Pair<String, String> pair;
        if (this.f16818n.containsKey(str) && (pair = this.f16818n.get(str)) != null) {
            C5968f c = C5955d.m24025b().mo24091c((String) pair.second, (String) pair.first);
            if (!(c == null || c.mo24152l() == null)) {
                c.mo24152l().mo24331a(192);
                C5955d.m24025b().mo24083b(c);
            }
            this.f16818n.remove(str);
        }
    }

    /* renamed from: b */
    private final JSONObject m24317b(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) "operation", (Object) "sheet.fetchData");
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((Object) "sheetToken", (Object) str);
        jSONObject4.put((Object) "docToken", (Object) str2);
        jSONObject2.put((Object) "body", (Object) jSONObject3);
        return jSONObject;
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a, com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: a */
    public void mo24223a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "sheetToken");
        Intrinsics.checkParameterIsNotNull(str2, "docToken");
        Intrinsics.checkParameterIsNotNull(str3, "docResKey");
        String str4 = this.f16764a;
        C13479a.m54764b(str4, "preload()... sheetToken = " + C13598b.m55197d(str) + ", docToken = " + C13598b.m55197d(str2));
        this.f16818n.put(str, new Pair<>(str2, str3));
        String jSONString = m24317b(str, str2).toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "getJSONObject(sheetToken, docToken).toJSONString()");
        mo24229d(jSONString);
    }
}
