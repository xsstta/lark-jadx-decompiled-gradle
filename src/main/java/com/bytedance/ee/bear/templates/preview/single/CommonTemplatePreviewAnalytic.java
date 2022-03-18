package com.bytedance.ee.bear.templates.preview.single;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.templates.C11515d;
import com.bytedance.ee.bear.templates.preview.data.CommonPreviewTemplateData;
import com.bytedance.ee.bear.templates.preview.data.Item;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0019\u001a\u00020\u000eJ\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/single/CommonTemplatePreviewAnalytic;", "", "()V", "CCM_TEMPLATE_PREVIEW_VIEW", "", "CCM_TEMPLATE_PREVIEW_VIEW_CLICK", "analyticService", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "kotlin.jvm.PlatformType", "getAnalyticService", "()Lcom/bytedance/ee/bear/contract/AnalyticService;", "analyticService$delegate", "Lkotlin/Lazy;", "reportTemplatePreviewCreateSuccess", "", "item", "Lcom/bytedance/ee/bear/templates/preview/data/Item;", "token", "commonPreviewTemplateData", "Lcom/bytedance/ee/bear/templates/preview/data/CommonPreviewTemplateData;", "reportTemplatePreviewDelete", "reportTemplatePreviewLast", "reportTemplatePreviewMore", "reportTemplatePreviewNext", "reportTemplatePreviewShare", "reportTemplatePreviewShow", "reportTemplatePreviewUseClick", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.preview.single.b */
public final class CommonTemplatePreviewAnalytic {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31206a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CommonTemplatePreviewAnalytic.class), "analyticService", "getAnalyticService()Lcom/bytedance/ee/bear/contract/AnalyticService;"))};

    /* renamed from: b */
    public static final CommonTemplatePreviewAnalytic f31207b = new CommonTemplatePreviewAnalytic();

    /* renamed from: c */
    private static final Lazy f31208c = LazyKt.lazy(C11586a.INSTANCE);

    /* renamed from: c */
    private final AbstractC5233x m48148c() {
        Lazy lazy = f31208c;
        KProperty kProperty = f31206a[0];
        return (AbstractC5233x) lazy.getValue();
    }

    private CommonTemplatePreviewAnalytic() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.single.b$a */
    static final class C11586a extends Lambda implements Function0<AbstractC5233x> {
        public static final C11586a INSTANCE = new C11586a();

        C11586a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC5233x invoke() {
            return C5234y.m21391b();
        }
    }

    /* renamed from: a */
    public final void mo44508a() {
        m48148c().mo21084b("ccm_template_preview_view", new JSONObject());
    }

    /* renamed from: b */
    public final void mo44512b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "more");
        m48148c().mo21084b("ccm_template_preview_view_click", jSONObject);
    }

    /* renamed from: a */
    public final void mo44509a(Item item) {
        Intrinsics.checkParameterIsNotNull(item, "item");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "share_button");
        jSONObject.put("template_token", (Object) item.getReportToken());
        jSONObject.put("target", (Object) "ccm_template_share_view");
        m48148c().mo21084b("ccm_template_preview_view_click", jSONObject);
    }

    /* renamed from: b */
    public final void mo44513b(Item item) {
        Intrinsics.checkParameterIsNotNull(item, "item");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "delete_button");
        jSONObject.put("template_token", (Object) item.getReportToken());
        jSONObject.put("target", (Object) "ccm_template_usercenter_view");
        m48148c().mo21084b("ccm_template_preview_view_click", jSONObject);
    }

    /* renamed from: c */
    public final void mo44514c(Item item) {
        Intrinsics.checkParameterIsNotNull(item, "item");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "next");
        jSONObject.put("template_token", (Object) item.getReportToken());
        jSONObject.put("template_name", (Object) item.getReportName());
        jSONObject.put("target", (Object) "ccm_template_preview_view");
        m48148c().mo21084b("ccm_template_preview_view_click", jSONObject);
    }

    /* renamed from: d */
    public final void mo44515d(Item item) {
        Intrinsics.checkParameterIsNotNull(item, "item");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "last");
        jSONObject.put("template_token", (Object) item.getReportToken());
        jSONObject.put("template_name", (Object) item.getReportName());
        jSONObject.put("target", (Object) "ccm_template_preview_view");
        m48148c().mo21084b("ccm_template_preview_view_click", jSONObject);
    }

    /* renamed from: a */
    public final void mo44510a(Item item, CommonPreviewTemplateData commonPreviewTemplateData) {
        Intrinsics.checkParameterIsNotNull(item, "item");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "use_click");
        jSONObject.put("template_token", (Object) item.getReportToken());
        jSONObject.put("template_name", (Object) item.getReportName());
        jSONObject.put(C11515d.f31007d, (Object) C11515d.f31008e);
        if (commonPreviewTemplateData != null) {
            jSONObject.put(C11515d.f31005b, (Object) commonPreviewTemplateData.getTemplateSource());
            jSONObject.put(C11515d.f31006c, (Object) commonPreviewTemplateData.getTemplateCenterSource());
            jSONObject.put("template_sort", (Object) commonPreviewTemplateData.getTemplateSort());
        }
        jSONObject.put("create_file_type", (Object) C8275a.m34050a(item.getObjType()));
        jSONObject.put("target", (Object) "ccm_docs_page_view");
        m48148c().mo21084b("ccm_template_preview_view_click", jSONObject);
    }

    /* renamed from: a */
    public final void mo44511a(Item item, String str, CommonPreviewTemplateData commonPreviewTemplateData) {
        Intrinsics.checkParameterIsNotNull(item, "item");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "create_template_objs");
        jSONObject.put("template_token", (Object) item.getReportToken());
        jSONObject.put("template_name", (Object) item.getReportName());
        jSONObject.put(C11515d.f31007d, (Object) C11515d.f31008e);
        if (commonPreviewTemplateData != null) {
            jSONObject.put(C11515d.f31005b, (Object) commonPreviewTemplateData.getTemplateSource());
            jSONObject.put("template_sort", (Object) commonPreviewTemplateData.getTemplateSort());
        }
        jSONObject.put("create_file_type", (Object) C8275a.m34050a(item.getObjType()));
        jSONObject.put("file_id", (Object) str);
        jSONObject.put("target", (Object) "ccm_docs_page_view");
        m48148c().mo21084b("ccm_template_preview_view_click", jSONObject);
    }
}
