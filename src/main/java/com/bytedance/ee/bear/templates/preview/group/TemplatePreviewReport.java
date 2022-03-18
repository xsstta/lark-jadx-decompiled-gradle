package com.bytedance.ee.bear.templates.preview.group;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u000f\u001a\u00020\u000bJ\u001a\u0010\u0010\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rR#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/group/TemplatePreviewReport;", "", "()V", "AnalyticService", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "kotlin.jvm.PlatformType", "getAnalyticService", "()Lcom/bytedance/ee/bear/contract/AnalyticService;", "AnalyticService$delegate", "Lkotlin/Lazy;", "reportClickTemplateButton", "", "token", "", "name", "reportClickTemplatePreview", "reportTemplateExposure", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.preview.group.a */
public final class TemplatePreviewReport {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31168a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(TemplatePreviewReport.class), "AnalyticService", "getAnalyticService()Lcom/bytedance/ee/bear/contract/AnalyticService;"))};

    /* renamed from: b */
    public static final TemplatePreviewReport f31169b = new TemplatePreviewReport();

    /* renamed from: c */
    private static final Lazy f31170c = LazyKt.lazy(C11571a.INSTANCE);

    /* renamed from: a */
    public final AbstractC5233x mo44482a() {
        Lazy lazy = f31170c;
        KProperty kProperty = f31168a[0];
        return (AbstractC5233x) lazy.getValue();
    }

    private TemplatePreviewReport() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.group.a$a */
    static final class C11571a extends Lambda implements Function0<AbstractC5233x> {
        public static final C11571a INSTANCE = new C11571a();

        C11571a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC5233x invoke() {
            return C5234y.m21391b();
        }
    }

    /* renamed from: b */
    public final void mo44484b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ShareHitPoint.f121868c, (Object) "  from_picture");
        jSONObject.put("click_source", (Object) "from_set");
        mo44482a().mo21079a("click_template_preview", jSONObject);
    }

    /* renamed from: a */
    public final void mo44483a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_new", (Object) str);
        jSONObject.put("template_name", (Object) str2);
        jSONObject.put("exposure_type", (Object) "from_preview");
        jSONObject.put("template_type", (Object) "set");
        mo44482a().mo21079a("singletemplate_exposure", jSONObject);
    }

    /* renamed from: b */
    public final void mo44485b(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("template_token", (Object) str);
        jSONObject.put("template_name", (Object) str2);
        jSONObject.put(ShareHitPoint.f121868c, (Object) "from_preview");
        mo44482a().mo21079a("click_template_button", jSONObject);
    }
}
