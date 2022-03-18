package com.bytedance.ee.bear.share.bitableshare;

import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.log.C13479a;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\fJ\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u001a\u001a\u00020\fJ\u0006\u0010\u001b\u001a\u00020\fJ\u0006\u0010\u001c\u001a\u00020\fJ\u0006\u0010\u001d\u001a\u00020\fJ\u0006\u0010\u001e\u001a\u00020\fJ\u0006\u0010\u001f\u001a\u00020\fJ\u0006\u0010 \u001a\u00020\fJ\u0006\u0010!\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/share/bitableshare/ShareBitableShareAnalytic;", "", "()V", "BITABLE_FORM_PERM_COMMON_PARAMS", "", "DOC_COMMON_PARAMS", "EVENT_FORM_PERMISSION_CLICK", "EVENT_FORM_PERMISSION_VIEW", "NATIVE_PERMISSION_COMMON_PARAMS", "TAG", "TARGET_NONE", "appendCommonParams", "", "analyticService", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "params", "Lorg/json/JSONObject;", "reportClick", "click", "target", "reportCollectStateChange", "open", "", "reportCopyLink", "reportEvent", "eventName", "reportShareByteMoments", "reportShareLark", "reportShareMore", "reportShareQQ", "reportShareWechat", "reportShareWechatMoments", "reportShareWeibo", "reportShowSharePanel", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.share.bitableshare.d */
public final class ShareBitableShareAnalytic {

    /* renamed from: a */
    public static final ShareBitableShareAnalytic f29611a = new ShareBitableShareAnalytic();

    private ShareBitableShareAnalytic() {
    }

    /* renamed from: b */
    public final void mo41752b() {
        m45755a("copy_link", "none");
    }

    /* renamed from: c */
    public final void mo41753c() {
        m45755a("share_wechat", "none");
    }

    /* renamed from: d */
    public final void mo41754d() {
        m45755a("share_wechat_moments", "none");
    }

    /* renamed from: e */
    public final void mo41755e() {
        m45755a("share_qq", "none");
    }

    /* renamed from: f */
    public final void mo41756f() {
        m45755a("share_weibo", "none");
    }

    /* renamed from: g */
    public final void mo41757g() {
        m45755a("share_more", "none");
    }

    /* renamed from: h */
    public final void mo41758h() {
        m45755a("share_lark", "ccm_permission_share_lark_view");
    }

    /* renamed from: i */
    public final void mo41759i() {
        m45755a("share_bytedance_moments", "none");
    }

    /* renamed from: a */
    public final void mo41750a() {
        m45756a("ccm_bitable_form_permission_view", new JSONObject());
    }

    /* renamed from: a */
    public final void mo41751a(boolean z) {
        String str;
        if (z) {
            str = "open";
        } else {
            str = "close";
        }
        m45755a(str, "none");
    }

    /* renamed from: a */
    private final void m45755a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", str);
        jSONObject.put("target", str2);
        m45756a("ccm_bitable_form_permission_click", jSONObject);
    }

    /* renamed from: a */
    private final void m45756a(String str, JSONObject jSONObject) {
        AbstractC5233x b = C5234y.m21391b();
        Intrinsics.checkExpressionValueIsNotNull(b, "analyticService");
        m45754a(b, jSONObject);
        b.mo21085b(str, jSONObject);
        C13479a.m54772d("ShareBitableShareAnalytic", "eventName = " + str + ", params = " + jSONObject);
    }

    /* renamed from: a */
    private final void m45754a(AbstractC5233x xVar, JSONObject jSONObject) {
        HashMap<String, Object> c = xVar.mo21086c("docCommonParams");
        Intrinsics.checkExpressionValueIsNotNull(c, "analyticService.getAllCo…DataV2(DOC_COMMON_PARAMS)");
        HashMap<String, Object> c2 = xVar.mo21086c("nativePermissionCommonParams");
        Intrinsics.checkExpressionValueIsNotNull(c2, "analyticService.getAllCo…PERMISSION_COMMON_PARAMS)");
        HashMap<String, Object> c3 = xVar.mo21086c("bitableFormPermCommonParams");
        Intrinsics.checkExpressionValueIsNotNull(c3, "analyticService.getAllCo…_FORM_PERM_COMMON_PARAMS)");
        Set<Map.Entry<String, Object>> entrySet = c.entrySet();
        Intrinsics.checkExpressionValueIsNotNull(entrySet, "docCommonParams.entries");
        for (T t : entrySet) {
            jSONObject.put((String) t.getKey(), t.getValue());
        }
        Set<Map.Entry<String, Object>> entrySet2 = c2.entrySet();
        Intrinsics.checkExpressionValueIsNotNull(entrySet2, "permCommonParams.entries");
        for (T t2 : entrySet2) {
            jSONObject.put((String) t2.getKey(), t2.getValue());
        }
        Set<Map.Entry<String, Object>> entrySet3 = c3.entrySet();
        Intrinsics.checkExpressionValueIsNotNull(entrySet3, "bitableCommonParams.entries");
        for (T t3 : entrySet3) {
            jSONObject.put((String) t3.getKey(), t3.getValue());
        }
    }
}
