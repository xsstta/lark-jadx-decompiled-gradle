package com.bytedance.ee.bear.templates;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0004J\u000e\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\u0004J\u001a\u0010(\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00042\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0004J\u0010\u0010*\u001a\u00020$2\b\u0010+\u001a\u0004\u0018\u00010\u0004J\u0006\u0010,\u001a\u00020$J\u000e\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020/J'\u00100\u001a\u00020$2\b\u00101\u001a\u0004\u0018\u0001022\b\u0010)\u001a\u0004\u0018\u00010\u00042\u0006\u00103\u001a\u00020\u0004¢\u0006\u0002\u00104J \u00105\u001a\u00020$2\u0006\u00106\u001a\u0002022\u0006\u00107\u001a\u00020\u00042\b\u00108\u001a\u0004\u0018\u00010\u0004J \u00109\u001a\u00020$2\u0006\u00106\u001a\u0002022\u0006\u00107\u001a\u00020\u00042\b\u00108\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/bytedance/ee/bear/templates/TemplateReport;", "", "()V", "ACTION_CLICK_DELETE", "", "ACTION_CLICK_SAVE_AS", "ACTION_CLICK_SHARE", "ACTION_DELETE", "ACTION_SAVE", "ACTION_SHARE", "AnalyticService", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "kotlin.jvm.PlatformType", "getAnalyticService", "()Lcom/bytedance/ee/bear/contract/AnalyticService;", "AnalyticService$delegate", "Lkotlin/Lazy;", "BANNER_TYPE_ALBUM", "BANNER_TYPE_LINK", "BANNER_TYPE_SINGLE", "CREATEFORM_SOURCE", "getCREATEFORM_SOURCE", "()Ljava/lang/String;", "setCREATEFORM_SOURCE", "(Ljava/lang/String;)V", "FROM_FIX_BANNER_ALL", "FROM_FIX_BANNER_MORE", "FROM_NEWCRATE_LARKDOCS", "FROM_NEWCREATE_MORE", "FROM_NEW_YEAR_BANNER", "FROM_ONBOARDING", "FROM_SPACE_ICON", "SEARCH_ANCTION_CLICK_EDITTEXT", "SEARCH_ANCTION_CLICK_RECOMMEND", "SEARCH_ANCTION_DISPALY_RECOMMEND", "reportCustomTmpl", "", "action", "reportEnterTemplateCenter", "from", "reportSearch", "name", "reportSearchInput", "searchName", "reportSearchResultClick", "reportSearchResultHasData", "hasData", "", "reportSingleTemlateShow", "objType", "", "token", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "reportTemplateBannerClick", "bannerNumber", "bannerType", "bannerId", "reportTemplateBannerShow", "templates-api_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.e */
public final class TemplateReport {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31010a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(TemplateReport.class), "AnalyticService", "getAnalyticService()Lcom/bytedance/ee/bear/contract/AnalyticService;"))};

    /* renamed from: b */
    public static final TemplateReport f31011b = new TemplateReport();

    /* renamed from: c */
    private static String f31012c = "";

    /* renamed from: d */
    private static final Lazy f31013d = LazyKt.lazy(C11516a.INSTANCE);

    /* renamed from: b */
    public final AbstractC5233x mo44229b() {
        Lazy lazy = f31013d;
        KProperty kProperty = f31010a[0];
        return (AbstractC5233x) lazy.getValue();
    }

    private TemplateReport() {
    }

    /* renamed from: a */
    public final String mo44223a() {
        return f31012c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.e$a */
    static final class C11516a extends Lambda implements Function0<AbstractC5233x> {
        public static final C11516a INSTANCE = new C11516a();

        C11516a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC5233x invoke() {
            return C5234y.m21391b();
        }
    }

    /* renamed from: c */
    public final void mo44232c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((Object) "template_searchresult", (Object) "yes");
        jSONObject.put((Object) "create_from_template", (Object) "yes");
        mo44229b().mo21079a("template_search", jSONObject);
    }

    /* renamed from: a */
    public final void mo44226a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        f31012c = str;
    }

    /* renamed from: a */
    public final void mo44228a(boolean z) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "yes";
        } else {
            str = "no";
        }
        jSONObject.put((Object) "template_searchresult", (Object) str);
        mo44229b().mo21079a("template_search", jSONObject);
    }

    /* renamed from: b */
    public final void mo44231b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "action");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((Object) "action", (Object) str);
        jSONObject.put((Object) "template_type", (Object) "ugc");
        mo44229b().mo21079a("management_template_by_user", jSONObject);
    }

    /* renamed from: d */
    public final void mo44234d(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((Object) "action", (Object) "Input_searchwords");
        jSONObject.put((Object) "searchwords_name", (Object) str);
        mo44229b().mo21079a("template_search", jSONObject);
    }

    /* renamed from: c */
    public final void mo44233c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "from");
        f31012c = str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((Object) ShareHitPoint.f121868c, (Object) str);
        mo44229b().mo21079a("enter_template_center", jSONObject);
    }

    /* renamed from: a */
    public final void mo44227a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "action");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) "action", (Object) str);
        if (str2 != null) {
            jSONObject.put("click_searchrecommendwords_name", (Object) str2);
        }
        mo44229b().mo21079a("template_search", jSONObject2);
    }

    /* renamed from: a */
    public final void mo44224a(int i, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "bannerType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((Object) "banner_number", (Object) String.valueOf(i));
        jSONObject.put((Object) "banner_type", (Object) str);
        jSONObject.put((Object) "banner_id", (Object) str2);
        mo44229b().mo21079a("show_templateinnerbanner", jSONObject);
    }

    /* renamed from: b */
    public final void mo44230b(int i, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "bannerType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((Object) "banner_number", (Object) String.valueOf(i));
        jSONObject.put((Object) "banner_type", (Object) str);
        jSONObject.put((Object) "banner_id", (Object) str2);
        mo44229b().mo21079a("click_templateinnerbanner", jSONObject);
    }

    /* renamed from: a */
    public final void mo44225a(Integer num, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str2, "token");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((Object) "file_type", (Object) String.valueOf(num));
        jSONObject.put((Object) "template_name", (Object) str);
        jSONObject.put((Object) "template_id", (Object) str2);
        mo44229b().mo21079a("singletemplate_exposure", jSONObject);
    }

    /* renamed from: a */
    public static /* synthetic */ void m47953a(TemplateReport eVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        eVar.mo44227a(str, str2);
    }
}
