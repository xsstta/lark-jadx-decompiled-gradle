package com.bytedance.ee.bear.templates;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.util.p701d.C13615c;
import com.larksuite.suite.R;
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
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0002J\u0012\u0010#\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020'H\u0002J\u0012\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020)J\u0010\u0010+\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010\u0004J\u0006\u0010-\u001a\u00020)J\u000e\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u000200J\u000e\u00101\u001a\u00020)2\u0006\u0010/\u001a\u000200J\u0018\u00102\u001a\u00020)2\b\u00103\u001a\u0004\u0018\u00010\u00042\u0006\u00104\u001a\u00020\u0019J\u000e\u00105\u001a\u00020)2\u0006\u00106\u001a\u00020\u0004J\u0006\u00107\u001a\u00020)J\u0006\u00108\u001a\u00020)J\u000e\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020\u0004J\u000e\u0010;\u001a\u00020)2\u0006\u0010/\u001a\u000200J$\u0010<\u001a\u00020)2\b\u0010=\u001a\u0004\u0018\u00010>2\u0006\u0010?\u001a\u00020\u00192\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0004J\u0006\u0010A\u001a\u00020)J\u0010\u0010B\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010\u0004J\u0018\u0010C\u001a\u00020)2\b\u0010D\u001a\u0004\u0018\u00010\u00042\u0006\u0010/\u001a\u000200J\u001a\u0010E\u001a\u00020)2\u0006\u0010&\u001a\u00020'2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0004J\u001a\u0010E\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u00042\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0004J\u000e\u0010G\u001a\u00020)2\u0006\u0010/\u001a\u000200J\u000e\u0010H\u001a\u00020)2\u0006\u0010/\u001a\u000200J\u0018\u0010I\u001a\u00020)2\u0006\u0010/\u001a\u0002002\b\u0010:\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014¨\u0006J"}, d2 = {"Lcom/bytedance/ee/bear/templates/TemplateReportV2;", "", "()V", "TAB_BUSINESS", "", "TAB_CUSTOM", "TAB_SEARCH", "TAB_SYSTEM", "TAB_TOPIC", "analyticService", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "kotlin.jvm.PlatformType", "getAnalyticService", "()Lcom/bytedance/ee/bear/contract/AnalyticService;", "analyticService$delegate", "Lkotlin/Lazy;", "currentSortName", "getCurrentSortName", "()Ljava/lang/String;", "setCurrentSortName", "(Ljava/lang/String;)V", "currentTab", "getCurrentTab", "setCurrentTab", "searchFromRecommend", "", "getSearchFromRecommend", "()Z", "setSearchFromRecommend", "(Z)V", "templateSource", "getTemplateSource", "setTemplateSource", "getTargetView", "event", "getUseOrShowTemplateClick", "tab", "getUseOrShowTemplateTarget", "initIndex", "", "reportCancel", "", "reportClearSearchKeywords", "reportClickBanner", "bannerId", "reportClickBusinessTemplate", "reportClickCreateBlank", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "reportClickPreviewTemplate", "reportClickSearchInput", "keyWords", "hasResult", "reportClickSort", "name", "reportClickSystemTemplate", "reportClickUserTemplate", "reportCustomDelete", "token", "reportCustomShared", "reportFilterResult", ShareHitPoint.f121869d, "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "hasData", "from", "reportSearchClick", "reportShowBanner", "reportShowTemplate", "form", "reportTemplatePageShow", "enterSource", "reportTopicUseTemplate", "reportUseTemplate", "reportUseTemplateSuccess", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.f */
public final class TemplateReportV2 {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31014a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(TemplateReportV2.class), "analyticService", "getAnalyticService()Lcom/bytedance/ee/bear/contract/AnalyticService;"))};

    /* renamed from: b */
    public static final TemplateReportV2 f31015b = new TemplateReportV2();

    /* renamed from: c */
    private static String f31016c = "ccm_template_systemcenter_view_click";

    /* renamed from: d */
    private static String f31017d = "";

    /* renamed from: e */
    private static boolean f31018e;

    /* renamed from: f */
    private static String f31019f;

    /* renamed from: g */
    private static final Lazy f31020g = LazyKt.lazy(C11517a.INSTANCE);

    /* renamed from: a */
    private final String m47966a(int i) {
        return i != 1 ? i != 2 ? "ccm_template_systemcenter_view" : "ccm_template_enterprisecenter_view" : "ccm_template_usercenter_view";
    }

    /* renamed from: i */
    private final AbstractC5233x m47971i() {
        Lazy lazy = f31020g;
        KProperty kProperty = f31014a[0];
        return (AbstractC5233x) lazy.getValue();
    }

    private TemplateReportV2() {
    }

    /* renamed from: a */
    public final String mo44235a() {
        return f31017d;
    }

    /* renamed from: b */
    public final String mo44245b() {
        return f31019f;
    }

    /* renamed from: a */
    public final void mo44244a(boolean z) {
        f31018e = z;
    }

    /* renamed from: a */
    public final void mo44243a(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "search_input_result");
        jSONObject.put("target", (Object) "ccm_template_search_result_view");
        jSONObject.put("keywords", (Object) str);
        jSONObject.put("keywords_type", (Object) (f31018e ? "recommend" : "search"));
        jSONObject.put("result", (Object) String.valueOf(z));
        f31018e = false;
        m47971i().mo21084b(f31016c, jSONObject);
    }

    /* renamed from: a */
    public final void mo44242a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "event");
        JSONObject jSONObject = new JSONObject();
        String str3 = str2;
        if (!(str3 == null || str3.length() == 0)) {
            jSONObject.put((Object) "enterSource", (Object) str2);
        }
        m47971i().mo21084b(str, jSONObject);
    }

    /* renamed from: a */
    public final void mo44241a(String str, TemplateV4 templateV4) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        if (((!Intrinsics.areEqual(f31016c, "ccm_template_search_result_view_click")) || (!Intrinsics.areEqual(f31016c, "ccm_template_banner_view_click"))) && str == null) {
            if (templateV4.isBusinessTemplate()) {
                str = "ccm_template_enterprisecenter_view_click";
            } else {
                str = templateV4.isCustomTemplate() ? "ccm_template_usercenter_view_click" : "ccm_template_systemcenter_view_click";
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "single_template_show");
        jSONObject.put("template_token", (Object) templateV4.getReportToken());
        jSONObject.put("template_name", (Object) templateV4.getReportName());
        if (Intrinsics.areEqual(f31016c, "ccm_template_systemcenter_view_click") || Intrinsics.areEqual(f31016c, "ccm_template_usercenter_view_click")) {
            jSONObject.put("template_sort", (Object) f31019f);
        }
        jSONObject.put(C11515d.f31005b, (Object) f31017d);
        jSONObject.put("target", (Object) f31015b.m47970h(str));
        m47971i().mo21084b(m47972i(str), jSONObject);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.f$a */
    static final class C11517a extends Lambda implements Function0<AbstractC5233x> {
        public static final C11517a INSTANCE = new C11517a();

        C11517a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC5233x invoke() {
            return C5234y.m21391b();
        }
    }

    /* renamed from: c */
    public final void mo44248c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "search_input_click");
        jSONObject.put("target", (Object) "none");
        m47971i().mo21084b(f31016c, jSONObject);
    }

    /* renamed from: d */
    public final void mo44251d() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "system_template_click");
        jSONObject.put("target", (Object) "ccm_template_systemcenter_view");
        m47971i().mo21084b(f31016c, jSONObject);
    }

    /* renamed from: e */
    public final void mo44254e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "user_template_click");
        jSONObject.put("target", (Object) "ccm_template_usercenter_view");
        m47971i().mo21084b(f31016c, jSONObject);
    }

    /* renamed from: f */
    public final void mo44257f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "enterprise_template_click");
        jSONObject.put("target", (Object) "ccm_template_enterprisecenter_view");
        m47971i().mo21084b(f31016c, jSONObject);
    }

    /* renamed from: g */
    public final void mo44259g() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "cancel");
        m47971i().mo21084b(f31016c, jSONObject);
    }

    /* renamed from: h */
    public final void mo44261h() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "clear_keywords");
        jSONObject.put("target", (Object) "none");
        m47971i().mo21084b("ccm_template_search_result_view_click", jSONObject);
    }

    static {
        String string = C13615c.f35773a.getString(R.string.Doc_List_All);
        Intrinsics.checkExpressionValueIsNotNull(string, "ContextUtils.baseApplica…ng(R.string.Doc_List_All)");
        f31019f = string;
    }

    /* renamed from: i */
    private final String m47972i(String str) {
        if (str != null) {
            return str;
        }
        return f31016c;
    }

    /* renamed from: b */
    public final void mo44247b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        f31017d = str;
    }

    /* renamed from: c */
    public final void mo44250c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        f31019f = str;
    }

    /* renamed from: j */
    private final String m47973j(String str) {
        return StringsKt.replace$default(str, "_click", "", false, 4, (Object) null);
    }

    /* renamed from: c */
    public final void mo44249c(TemplateV4 templateV4) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "create_blank_objs");
        jSONObject.put(C11515d.f31005b, (Object) f31017d);
        jSONObject.put("create_file_type", (Object) C8275a.m34050a(templateV4.getObjType()));
        jSONObject.put("target", (Object) "ccm_docs_page_view");
        m47971i().mo21084b(f31016c, jSONObject);
    }

    /* renamed from: d */
    public final void mo44252d(TemplateV4 templateV4) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "share_button");
        jSONObject.put("template_token", (Object) templateV4.getReportToken());
        jSONObject.put("target", (Object) "ccm_template_share_view");
        String str = "ccm_template_search_result_view_click";
        if (!Intrinsics.areEqual(f31016c, str)) {
            str = "ccm_template_usercenter_view_click";
        }
        m47971i().mo21084b(str, jSONObject);
    }

    /* renamed from: e */
    public final void mo44256e(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "show_banner");
        jSONObject.put("target", (Object) "ccm_template_center_view");
        jSONObject.put("banner_id", (Object) str);
        m47971i().mo21084b("ccm_template_systemcenter_view_click", jSONObject);
    }

    /* renamed from: f */
    public final void mo44258f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "sort_click");
        jSONObject.put("sort_name", (Object) str);
        jSONObject.put("target", (Object) "ccm_template_systemcenter_view");
        m47971i().mo21084b(f31016c, jSONObject);
    }

    /* renamed from: g */
    public final void mo44260g(String str) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "delete_button");
        jSONObject.put("template_token", (Object) str);
        jSONObject.put("target", (Object) "ccm_template_usercenter_view");
        String str2 = "ccm_template_search_result_view_click";
        if (!Intrinsics.areEqual(f31016c, str2)) {
            str2 = "ccm_template_usercenter_view_click";
        }
        m47971i().mo21084b(str2, jSONObject);
    }

    /* renamed from: h */
    private final String m47970h(String str) {
        if (str != null) {
            return str;
        }
        String str2 = f31016c;
        switch (str2.hashCode()) {
            case -1849299558:
                if (str2.equals("ccm_template_usercenter_view_click")) {
                    return "ccm_template_usercenter_view";
                }
                break;
            case -1801240828:
                if (str2.equals("ccm_template_enterprisecenter_view_click")) {
                    return "ccm_template_enterprisecenter_view";
                }
                break;
            case -875800242:
                if (str2.equals("ccm_template_banner_view_click")) {
                    return "ccm_template_enterprisecenter_view";
                }
                break;
            case 242842220:
                if (str2.equals("ccm_template_search_result_view_click")) {
                    return "ccm_template_enterprisecenter_view";
                }
                break;
        }
        return "ccm_template_systemcenter_view";
    }

    /* renamed from: b */
    public final void mo44246b(TemplateV4 templateV4) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "preview_click");
        jSONObject.put("template_token", (Object) templateV4.getReportToken());
        jSONObject.put("template_name", (Object) templateV4.getReportName());
        jSONObject.put("template_sort", (Object) f31019f);
        jSONObject.put(C11515d.f31007d, (Object) C11515d.f31008e);
        jSONObject.put("is_set", (Object) Boolean.valueOf(templateV4.isSceneTemplate()));
        jSONObject.put(C11515d.f31005b, (Object) f31017d);
        jSONObject.put("create_file_type", (Object) C8275a.m34050a(templateV4.getObjType()));
        jSONObject.put("target", (Object) "ccm_template_preview_view");
        m47971i().mo21084b(f31016c, jSONObject);
    }

    /* renamed from: d */
    public final void mo44253d(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "click_banner");
        jSONObject.put("target", (Object) "ccm_template_banner_view");
        jSONObject.put("banner_id", (Object) str);
        m47971i().mo21084b(f31016c, jSONObject);
    }

    /* renamed from: e */
    public final void mo44255e(TemplateV4 templateV4) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "use_click");
        jSONObject.put("template_token", (Object) templateV4.getReportToken());
        jSONObject.put("template_name", (Object) templateV4.getReportName());
        jSONObject.put(C11515d.f31007d, (Object) C11515d.f31008e);
        jSONObject.put("create_file_type", (Object) C8275a.m34050a(templateV4.getObjType()));
        jSONObject.put("target", (Object) "ccm_docs_page_view");
        m47971i().mo21084b("ccm_template_banner_view_click", jSONObject);
    }

    /* renamed from: a */
    public final void mo44238a(TemplateV4 templateV4) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "use_click");
        jSONObject.put("template_token", (Object) templateV4.getReportToken());
        jSONObject.put("template_name", (Object) templateV4.getReportName());
        if (Intrinsics.areEqual(f31016c, "ccm_template_systemcenter_view_click") || Intrinsics.areEqual(f31016c, "ccm_template_usercenter_view_click")) {
            jSONObject.put("template_sort", (Object) f31019f);
        }
        jSONObject.put(C11515d.f31007d, (Object) C11515d.f31008e);
        jSONObject.put(C11515d.f31005b, (Object) f31017d);
        jSONObject.put("create_file_type", (Object) C8275a.m34050a(templateV4.getObjType()));
        jSONObject.put("target", (Object) "ccm_docs_page_view");
        m47971i().mo21084b(f31016c, jSONObject);
    }

    /* renamed from: a */
    public final void mo44240a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        f31016c = str;
    }

    /* renamed from: a */
    public final void mo44236a(int i, String str) {
        mo44242a(m47966a(i), str);
    }

    /* renamed from: a */
    public final void mo44239a(TemplateV4 templateV4, String str) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11515d.f31004a, (Object) "create_template_objs");
        jSONObject.put("template_token", (Object) templateV4.getReportToken());
        jSONObject.put("template_name", (Object) templateV4.getReportName());
        if (Intrinsics.areEqual(f31016c, "ccm_template_systemcenter_view_click") || Intrinsics.areEqual(f31016c, "ccm_template_usercenter_view_click")) {
            jSONObject.put("template_sort", (Object) f31019f);
        }
        jSONObject.put(C11515d.f31007d, (Object) C11515d.f31008e);
        jSONObject.put(C11515d.f31005b, (Object) f31017d);
        jSONObject.put("create_file_type", (Object) C8275a.m34050a(templateV4.getObjType()));
        jSONObject.put("file_id", (Object) str);
        jSONObject.put("target", (Object) "ccm_docs_page_view");
        m47971i().mo21084b(f31016c, jSONObject);
    }

    /* renamed from: a */
    public final void mo44237a(C8275a aVar, boolean z, String str) {
        String str2;
        String str3;
        if (!Intrinsics.areEqual(f31016c, "ccm_template_enterprisecenter_view_click")) {
            String i = m47972i(str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C11515d.f31004a, (Object) "filter");
            if (aVar != null) {
                str2 = aVar.mo32553a();
            } else {
                str2 = null;
            }
            if (str2 == null || Intrinsics.areEqual(aVar.mo32553a(), "unknown")) {
                str3 = "all";
            } else {
                str3 = aVar.mo32553a();
            }
            jSONObject.put("file_type", (Object) str3);
            jSONObject.put("filter_result", (Object) String.valueOf(z));
            jSONObject.put("target", (Object) f31015b.m47973j(i));
            m47971i().mo21084b(i, jSONObject);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m47967a(TemplateReportV2 fVar, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        fVar.mo44236a(i, str);
    }

    /* renamed from: a */
    public static /* synthetic */ void m47969a(TemplateReportV2 fVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        fVar.mo44242a(str, str2);
    }

    /* renamed from: a */
    public static /* synthetic */ void m47968a(TemplateReportV2 fVar, C8275a aVar, boolean z, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        fVar.mo44237a(aVar, z, str);
    }
}
