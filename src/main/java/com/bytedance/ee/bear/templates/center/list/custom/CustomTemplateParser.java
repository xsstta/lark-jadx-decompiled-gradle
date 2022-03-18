package com.bytedance.ee.bear.templates.center.list.custom;

import android.content.Context;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.AbstractC5082ab;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.TemplatesParser;
import com.bytedance.ee.bear.templates.center.list.Category;
import com.bytedance.ee.bear.templates.center.list.CategoryTab;
import com.bytedance.ee.bear.templates.center.list.TemplateGroupTab;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/custom/CustomTemplateParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", "context", "Landroid/content/Context;", ShareHitPoint.f121868c, "", "cacheKey", "", "needCache", "", "isLoadMore", "hasFilter", "(Landroid/content/Context;ILjava/lang/String;ZZZ)V", "parse", "json", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.list.c.e */
public final class CustomTemplateParser implements NetService.AbstractC5074c<TemplateGroupTab> {

    /* renamed from: a */
    public static final Companion f30963a = new Companion(null);

    /* renamed from: b */
    private final Context f30964b;

    /* renamed from: c */
    private final int f30965c;

    /* renamed from: d */
    private final String f30966d;

    /* renamed from: e */
    private final boolean f30967e;

    /* renamed from: f */
    private final boolean f30968f;

    /* renamed from: g */
    private final boolean f30969g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/custom/CustomTemplateParser$Companion;", "", "()V", "TAG", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.c.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public TemplateGroupTab parse(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        String str2;
        JSONObject jSONObject;
        JSONArray jSONArray;
        ArrayList arrayList;
        String str3 = str;
        if (str3 == null || StringsKt.isBlank(str3)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new TemplateGroupTab(this.f30965c, new ArrayList(), false, false, null, new Throwable("json is null"), null, 0, TTVideoEngine.PLAYER_OPTION_SET_SUPER_RES_STRENGTH, null);
        }
        new C10917c(new C10929e());
        Locale d = C4484g.m18494b().mo17253d();
        ConnectionService d2 = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "ConnectionServiceImp.getInstance()");
        ConnectionService.NetworkState b = d2.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.get…            .networkState");
        boolean b2 = b.mo20041b();
        JSONArray jSONArray2 = null;
        if (this.f30967e) {
            ((AbstractC5082ab) KoinJavaComponent.m268613a(AbstractC5082ab.class, null, null, 6, null)).mo20178a(this.f30966d, str);
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject != null) {
                z2 = optJSONObject.optBoolean("has_data", true);
            } else {
                z2 = true;
            }
            if (optJSONObject != null) {
                z3 = optJSONObject.optBoolean("has_more");
            } else {
                z3 = false;
            }
            if (optJSONObject == null || (str2 = optJSONObject.optString("share_index")) == null) {
                str2 = "0";
            }
            if (optJSONObject != null) {
                jSONObject = optJSONObject.optJSONObject("users");
            } else {
                jSONObject = null;
            }
            if (optJSONObject != null) {
                jSONArray = optJSONObject.optJSONArray("own");
            } else {
                jSONArray = null;
            }
            TemplatesParser mVar = TemplatesParser.f31104a;
            Intrinsics.checkExpressionValueIsNotNull(d, "locale");
            ArrayList<TemplateV4> a = mVar.mo44287a(jSONArray, jSONObject, d, b2);
            String string = this.f30964b.getString(R.string.Doc_List_My_Template);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.Doc_List_My_Template)");
            Category category = new Category(string, false, a, 5, false, null, null, SmEvents.EVENT_NE_RR, null);
            CategoryTab categoryTab = new CategoryTab(string, CollectionsKt.arrayListOf(category), 0, 0, 12, null);
            if (optJSONObject != null) {
                jSONArray2 = optJSONObject.optJSONArray("share");
            }
            ArrayList<TemplateV4> a2 = TemplatesParser.f31104a.mo44287a(jSONArray2, jSONObject, d, b2);
            String string2 = this.f30964b.getString(R.string.Doc_List_Share_With_Me);
            Intrinsics.checkExpressionValueIsNotNull(string2, "context.getString(R.string.Doc_List_Share_With_Me)");
            Category category2 = new Category(string2, z3, a2, 6, false, null, null, SmEvents.EVENT_NE_RR, null);
            CategoryTab categoryTab2 = new CategoryTab(string2, CollectionsKt.arrayListOf(category2), 0, 0, 12, null);
            String string3 = this.f30964b.getString(R.string.Doc_List_All);
            Intrinsics.checkExpressionValueIsNotNull(string3, "context.getString(R.string.Doc_List_All)");
            CategoryTab categoryTab3 = new CategoryTab(string3, CollectionsKt.arrayListOf(category, category2), 0, 0, 12, null);
            if (a.isEmpty() && a2.isEmpty() && !this.f30969g) {
                arrayList = new ArrayList();
            } else if (this.f30968f) {
                arrayList = CollectionsKt.arrayListOf(categoryTab2);
            } else {
                arrayList = CollectionsKt.arrayListOf(categoryTab3, categoryTab, categoryTab2);
            }
            return new TemplateGroupTab(this.f30965c, arrayList, z3, z2, str2, null, null, 0, 192, null);
        } catch (Throwable th) {
            C13479a.m54759a("CustomTemplateParser", "parse()...err", th);
            return new TemplateGroupTab(this.f30965c, null, false, false, null, th, null, 0, SmEvents.EVENT_FT, null);
        }
    }

    public CustomTemplateParser(Context context, int i, String str, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "cacheKey");
        this.f30964b = context;
        this.f30965c = i;
        this.f30966d = str;
        this.f30967e = z;
        this.f30968f = z2;
        this.f30969g = z3;
    }
}
