package com.bytedance.ee.bear.templates.center.list.system;

import android.content.Context;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.AbstractC5082ab;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.TemplatesParser;
import com.bytedance.ee.bear.templates.center.list.Category;
import com.bytedance.ee.bear.templates.center.list.CategoryBean;
import com.bytedance.ee.bear.templates.center.list.CategoryTab;
import com.bytedance.ee.bear.templates.center.list.TemplateGroupTab;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0016J.\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J@\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u001aj\b\u0012\u0004\u0012\u00020\u0011`\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u001e\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0002J.\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000bH\u0002J8\u0010$\u001a\u0012\u0012\u0004\u0012\u00020%0\u001aj\b\u0012\u0004\u0012\u00020%`\u001b2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u001aj\b\u0012\u0004\u0012\u00020\u0011`\u001b2\u0006\u0010'\u001a\u00020\u0011H\u0002J&\u0010(\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\u0017H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/system/SystemTemplateParserV2;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", "context", "Landroid/content/Context;", ShareHitPoint.f121868c, "", "filterType", "cacheKey", "", "needCache", "", "from", "(Landroid/content/Context;IILjava/lang/String;ZLjava/lang/String;)V", "parse", "json", "parseCategory", "Lcom/bytedance/ee/bear/templates/center/list/Category;", "categoryIdArray", "Lorg/json/JSONArray;", "categoryBean", "Lcom/bytedance/ee/bear/templates/center/list/CategoryBean;", "templateMetasMap", "", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "parseCategoryArray", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "templateListObj", "Lorg/json/JSONObject;", "categoryMetasArray", "parseCategoryMetas", "parseTemplateMetas", "locale", "Ljava/util/Locale;", "connected", "produceCategoryTabList", "Lcom/bytedance/ee/bear/templates/center/list/CategoryTab;", "categoryList", "recommendCategory", "produceRecommendCategory", "recommendListArray", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.list.d.f */
public final class SystemTemplateParserV2 implements NetService.AbstractC5074c<TemplateGroupTab> {

    /* renamed from: a */
    public static final Companion f30997a = new Companion(null);

    /* renamed from: b */
    private final Context f30998b;

    /* renamed from: c */
    private final int f30999c;

    /* renamed from: d */
    private final int f31000d;

    /* renamed from: e */
    private final String f31001e;

    /* renamed from: f */
    private final boolean f31002f;

    /* renamed from: g */
    private final String f31003g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/system/SystemTemplateParserV2$Companion;", "", "()V", "TAG", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.d.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public TemplateGroupTab parse(String str) {
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            return new TemplateGroupTab(this.f30999c, new ArrayList(), false, false, null, new Throwable("json is null"), null, 0, TTVideoEngine.PLAYER_OPTION_SET_SUPER_RES_STRENGTH, null);
        }
        Locale d = C4484g.m18494b().mo17253d();
        ConnectionService d2 = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "ConnectionServiceImp.getInstance()");
        ConnectionService.NetworkState b = d2.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.getInstance().networkState");
        boolean b2 = b.mo20041b();
        JSONObject jSONObject = null;
        if (this.f31002f) {
            ((AbstractC5082ab) KoinJavaComponent.m268613a(AbstractC5082ab.class, null, null, 6, null)).mo20178a(this.f31001e, str);
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("category_metas") : null;
            JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject("template_list") : null;
            JSONArray optJSONArray2 = optJSONObject != null ? optJSONObject.optJSONArray("recommend_list") : null;
            if (optJSONObject != null) {
                jSONObject = optJSONObject.optJSONObject("template_metas");
            }
            Intrinsics.checkExpressionValueIsNotNull(d, "locale");
            Map<String, TemplateV4> a = m47951a(jSONObject, d, b2);
            return new TemplateGroupTab(this.f30999c, m47948a(m47949a(optJSONObject2, optJSONArray, a), m47947a(optJSONArray2, a)), false, false, null, null, null, 0, 252, null);
        } catch (Throwable th) {
            C13479a.m54759a("SystemTemplateParserV2", "parse()...err", th);
            return new TemplateGroupTab(this.f30999c, null, false, false, null, th, null, 0, SmEvents.EVENT_FT, null);
        }
    }

    /* renamed from: a */
    private final Map<String, CategoryBean> m47950a(JSONArray jSONArray) {
        HashMap hashMap = new HashMap();
        if (jSONArray == null) {
            return hashMap;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("name");
                long optLong = optJSONObject.optLong("category_id", -1);
                String optString2 = optJSONObject.optString("description");
                String valueOf = String.valueOf(optLong);
                Intrinsics.checkExpressionValueIsNotNull(optString2, "description");
                Intrinsics.checkExpressionValueIsNotNull(optString, "categoryName");
                hashMap.put(valueOf, new CategoryBean(optLong, optString2, optString));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private final Category m47947a(JSONArray jSONArray, Map<String, TemplateV4> map) {
        int i;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                TemplateV4 templateV4 = map.get(jSONArray.optString(i2));
                if (templateV4 != null) {
                    arrayList.add(TemplateV4.copy$default(templateV4, null, null, 0, null, null, null, 0, null, null, null, 0, null, null, null, null, 0, 0, 0, 0, 0, null, null, 0, null, null, null, false, 0, null, null, false, Integer.MAX_VALUE, null));
                }
            }
        }
        if (Intrinsics.areEqual("create_new", this.f31003g) && (i = this.f31000d) != -1) {
            arrayList.add(0, new TemplateV4(null, null, i, null, null, null, 0, null, null, null, 0, null, null, null, null, 0, 0, 0, 0, 0, null, null, 0, null, null, null, false, 0, null, null, true, 1073741819, null));
        }
        String string = this.f30998b.getString(R.string.Doc_List_Frequently_Used);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…Doc_List_Frequently_Used)");
        return new Category(string, false, arrayList, 0, false, null, null, SmEvents.EVENT_NW, null);
    }

    /* renamed from: a */
    private final ArrayList<CategoryTab> m47948a(ArrayList<Category> arrayList, Category category) {
        ArrayList<CategoryTab> arrayList2 = new ArrayList<>();
        String string = this.f30998b.getString(R.string.Doc_List_All);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.Doc_List_All)");
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(category);
        arrayList3.addAll(arrayList);
        arrayList2.add(new CategoryTab(string, arrayList3, 0, 0, 12, null));
        Iterator<Category> it = arrayList.iterator();
        while (it.hasNext()) {
            Category next = it.next();
            Category category2 = new Category(next.getName(), next.getHasMore(), new ArrayList(next.getTemplates()), next.getCategoryId(), false, null, null, 96, null);
            arrayList2.add(new CategoryTab(next.getName(), CollectionsKt.arrayListOf(category2), next.getCategoryId(), 1));
        }
        return arrayList2;
    }

    /* renamed from: a */
    private final ArrayList<Category> m47949a(JSONObject jSONObject, JSONArray jSONArray, Map<String, TemplateV4> map) {
        ArrayList<Category> arrayList = new ArrayList<>();
        if (jSONObject == null) {
            return arrayList;
        }
        Map<String, CategoryBean> a = m47950a(jSONArray);
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkExpressionValueIsNotNull(keys, "templateListObj.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            JSONArray optJSONArray = jSONObject.optJSONArray(next);
            if (optJSONArray != null) {
                arrayList.add(m47946a(optJSONArray, a.get(next), map));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final Category m47946a(JSONArray jSONArray, CategoryBean aVar, Map<String, TemplateV4> map) {
        String str;
        long j;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            TemplateV4 templateV4 = map.get(jSONArray.optString(i));
            if (templateV4 != null) {
                arrayList.add(templateV4);
            }
        }
        if (aVar == null || (str = aVar.mo44125b()) == null) {
            str = "";
        }
        String str2 = str;
        ArrayList arrayList2 = arrayList;
        if (aVar != null) {
            j = aVar.mo44124a();
        } else {
            j = -1;
        }
        return new Category(str2, true, arrayList2, j, false, null, null, SmEvents.EVENT_NE_RR, null);
    }

    /* renamed from: a */
    private final Map<String, TemplateV4> m47951a(JSONObject jSONObject, Locale locale, boolean z) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkExpressionValueIsNotNull(keys, "templateListObj.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject.optJSONObject(next);
            if (optJSONObject != null) {
                Intrinsics.checkExpressionValueIsNotNull(next, "templateId");
                hashMap.put(next, TemplatesParser.f31104a.mo44286a(optJSONObject, (JSONObject) null, locale, z));
            }
        }
        return hashMap;
    }

    public SystemTemplateParserV2(Context context, int i, int i2, String str, boolean z, String str2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "cacheKey");
        Intrinsics.checkParameterIsNotNull(str2, "from");
        this.f30998b = context;
        this.f30999c = i;
        this.f31000d = i2;
        this.f31001e = str;
        this.f31002f = z;
        this.f31003g = str2;
    }
}
