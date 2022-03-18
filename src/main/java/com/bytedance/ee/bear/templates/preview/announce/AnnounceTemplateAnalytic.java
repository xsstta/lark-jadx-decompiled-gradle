package com.bytedance.ee.bear.templates.preview.announce;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateAnalytic;", "", "()V", "CCM_TEMPLATE_CENTER_SHOW", "", "DOC_CLICK_TEMPLATE_PREVIEW", "DOC_COMMON_PARAMS", "analyticService", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "kotlin.jvm.PlatformType", "getAnalyticService", "()Lcom/bytedance/ee/bear/contract/AnalyticService;", "analyticService$delegate", "Lkotlin/Lazy;", "commonParams", "Lcom/alibaba/fastjson/JSONObject;", "reportClickTemplatePreview", "", "reportSingleTemplateExposure", "name", "token", "reportTemplateCenterShow", "reportToggleAttribute", "action", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.preview.announce.b */
public final class AnnounceTemplateAnalytic {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31126a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AnnounceTemplateAnalytic.class), "analyticService", "getAnalyticService()Lcom/bytedance/ee/bear/contract/AnalyticService;"))};

    /* renamed from: b */
    public static final AnnounceTemplateAnalytic f31127b;

    /* renamed from: c */
    private static final Lazy f31128c = LazyKt.lazy(C11551a.INSTANCE);

    /* renamed from: d */
    private static final JSONObject f31129d = new JSONObject();

    /* renamed from: c */
    private final AbstractC5233x m48079c() {
        Lazy lazy = f31128c;
        KProperty kProperty = f31126a[0];
        return (AbstractC5233x) lazy.getValue();
    }

    private AnnounceTemplateAnalytic() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.b$a */
    static final class C11551a extends Lambda implements Function0<AbstractC5233x> {
        public static final C11551a INSTANCE = new C11551a();

        C11551a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC5233x invoke() {
            return C5234y.m21391b();
        }
    }

    /* renamed from: a */
    public final void mo44376a() {
        JSONObject jSONObject = f31129d;
        jSONObject.put((Object) ShareHitPoint.f121868c, (Object) "from_im_chat_announcement");
        m48079c().mo21084b("ccm_groupchat_template_center_show", jSONObject);
    }

    /* renamed from: b */
    public final void mo44379b() {
        JSONObject jSONObject = f31129d;
        jSONObject.put((Object) ShareHitPoint.f121868c, (Object) "from_im_chat_announcement");
        jSONObject.put((Object) "click_source", (Object) "from_set");
        m48079c().mo21084b("docs_click_template_preview", jSONObject);
    }

    static {
        AnnounceTemplateAnalytic bVar = new AnnounceTemplateAnalytic();
        f31127b = bVar;
        HashMap<String, Object> c = bVar.m48079c().mo21086c("docCommonParams");
        Intrinsics.checkExpressionValueIsNotNull(c, "analyticService.getAllCo…DataV2(DOC_COMMON_PARAMS)");
        HashMap<String, Object> hashMap = c;
        if (true ^ hashMap.isEmpty()) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                Object value = entry.getValue();
                f31129d.put((Object) entry.getKey(), value);
            }
        }
    }

    /* renamed from: a */
    public final void mo44377a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "action");
        JSONObject jSONObject = f31129d;
        jSONObject.put((Object) "action", (Object) str);
        jSONObject.put((Object) ShareHitPoint.f121868c, (Object) "from_im_chat_announcement");
        m48079c().mo21084b("docs_toggle_attribute", jSONObject);
    }

    /* renamed from: a */
    public final void mo44378a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str2, "token");
        JSONObject jSONObject = f31129d;
        jSONObject.put((Object) "token_new", (Object) str2);
        jSONObject.put((Object) "template_name", (Object) str);
        jSONObject.put((Object) "template_type", (Object) "set");
        jSONObject.put((Object) "exposure_type", (Object) "from_im_chat_announcement");
        m48079c().mo21084b("docs_singletemplate_exposure", jSONObject);
    }
}
