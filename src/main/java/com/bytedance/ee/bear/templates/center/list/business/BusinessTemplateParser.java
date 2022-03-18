package com.bytedance.ee.bear.templates.center.list.business;

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
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016J2\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0002JD\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0016j\b\u0012\u0004\u0012\u00020\r`\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0002J0\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u0016j\b\u0012\u0004\u0012\u00020\u001b`\u00172\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0016j\b\u0012\u0004\u0012\u00020\r`\u0017H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/business/BusinessTemplateParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", ShareHitPoint.f121868c, "", "cacheKey", "", "needCache", "", "(ILjava/lang/String;Z)V", "parse", "json", "parseCategory", "Lcom/bytedance/ee/bear/templates/center/list/Category;", "categoryObj", "Lorg/json/JSONObject;", "usersObj", "locale", "Ljava/util/Locale;", "isConnected", "hasMore", "parseCategoryArray", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "categoryArray", "Lorg/json/JSONArray;", "produceCategoryTabList", "Lcom/bytedance/ee/bear/templates/center/list/CategoryTab;", "categoryList", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.list.b.d */
public final class BusinessTemplateParser implements NetService.AbstractC5074c<TemplateGroupTab> {

    /* renamed from: a */
    public static final Companion f30942a = new Companion(null);

    /* renamed from: b */
    private final int f30943b;

    /* renamed from: c */
    private final String f30944c;

    /* renamed from: d */
    private final boolean f30945d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/business/BusinessTemplateParser$Companion;", "", "()V", "TAG", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.b.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final ArrayList<CategoryTab> m47875a(ArrayList<Category> arrayList) {
        ArrayList<CategoryTab> arrayList2 = new ArrayList<>();
        Iterator<Category> it = arrayList.iterator();
        while (it.hasNext()) {
            Category next = it.next();
            CharSequence name = next.getName();
            Intrinsics.checkExpressionValueIsNotNull(next, "category");
            arrayList2.add(new CategoryTab(name, CollectionsKt.arrayListOf(next), 0, 0, 12, null));
        }
        return arrayList2;
    }

    /* renamed from: a */
    public TemplateGroupTab parse(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        String str2;
        JSONObject jSONObject;
        JSONArray jSONArray;
        String str3 = str;
        if (str3 == null || StringsKt.isBlank(str3)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new TemplateGroupTab(this.f30943b, new ArrayList(), false, false, null, new Throwable("json is null"), null, 0, TTVideoEngine.PLAYER_OPTION_SET_SUPER_RES_STRENGTH, null);
        }
        new C10917c(new C10929e());
        Locale d = C4484g.m18494b().mo17253d();
        ConnectionService d2 = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "ConnectionServiceImp.getInstance()");
        ConnectionService.NetworkState b = d2.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.get…            .networkState");
        boolean b2 = b.mo20041b();
        if (this.f30945d) {
            ((AbstractC5082ab) KoinJavaComponent.m268613a(AbstractC5082ab.class, null, null, 6, null)).mo20178a(this.f30944c, str);
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
                jSONArray = optJSONObject.optJSONArray("categories");
            } else {
                jSONArray = null;
            }
            Intrinsics.checkExpressionValueIsNotNull(d, "locale");
            return new TemplateGroupTab(this.f30943b, m47875a(m47876a(jSONArray, jSONObject, d, b2, z3)), z3, z2, str2, null, null, 0, 192, null);
        } catch (Throwable th) {
            C13479a.m54759a("BusinessTemplateParser", "parse()...err", th);
            return new TemplateGroupTab(this.f30943b, null, false, false, null, th, null, 0, SmEvents.EVENT_FT, null);
        }
    }

    public BusinessTemplateParser(int i, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "cacheKey");
        this.f30943b = i;
        this.f30944c = str;
        this.f30945d = z;
    }

    /* renamed from: a */
    private final Category m47874a(JSONObject jSONObject, JSONObject jSONObject2, Locale locale, boolean z, boolean z2) {
        String optString = jSONObject.optString("name");
        long optLong = jSONObject.optLong("category_id", -1);
        ArrayList<TemplateV4> a = TemplatesParser.f31104a.mo44287a(jSONObject.optJSONArray("templates"), jSONObject2, locale, z);
        Intrinsics.checkExpressionValueIsNotNull(optString, "categoryName");
        return new Category(optString, z2, a, optLong, false, null, null, SmEvents.EVENT_NE_RR, null);
    }

    /* renamed from: a */
    private final ArrayList<Category> m47876a(JSONArray jSONArray, JSONObject jSONObject, Locale locale, boolean z, boolean z2) {
        ArrayList<Category> arrayList = new ArrayList<>();
        if (jSONArray == null) {
            return arrayList;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            Intrinsics.checkExpressionValueIsNotNull(optJSONObject, "categoryObj");
            arrayList.add(m47874a(optJSONObject, jSONObject, locale, z, z2));
        }
        return arrayList;
    }
}
