package com.bytedance.ee.bear.templates.search.base;

import android.app.Application;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.templates.TemplatesParser;
import com.bytedance.ee.bear.templates.center.list.Category;
import com.bytedance.ee.bear.templates.center.list.CategoryTab;
import com.bytedance.ee.bear.templates.center.list.TemplateGroupTab;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016JL\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\r0\tj\b\u0012\u0004\u0012\u00020\r`\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/templates/search/base/BaseSearchParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", "searchKey", "", "(Ljava/lang/String;)V", "parse", "json", "produceCategoryTabList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/templates/center/list/CategoryTab;", "Lkotlin/collections/ArrayList;", "categoryList", "Lcom/bytedance/ee/bear/templates/center/list/Category;", "hasMore", "", "sizeBlock", "Lkotlin/Function1;", "", "", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.search.a.d */
public final class BaseSearchParser implements NetService.AbstractC5074c<TemplateGroupTab> {

    /* renamed from: a */
    public static final Companion f31345a = new Companion(null);

    /* renamed from: b */
    private final String f31346b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/search/base/BaseSearchParser$Companion;", "", "()V", "TAG", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.d$b */
    public static final class C11643b extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ Ref.IntRef $size;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11643b(Ref.IntRef intRef) {
            super(1);
            this.$size = intRef;
        }

        public final void invoke(int i) {
            this.$size.element = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }
    }

    public BaseSearchParser(String str) {
        Intrinsics.checkParameterIsNotNull(str, "searchKey");
        this.f31346b = str;
    }

    /* renamed from: a */
    public TemplateGroupTab parse(String str) {
        boolean z;
        Throwable th;
        boolean z2;
        boolean z3;
        String str2;
        JSONObject jSONObject;
        String str3;
        String optString;
        String str4 = str;
        if (str4 == null || StringsKt.isBlank(str4)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new TemplateGroupTab(2, new ArrayList(), false, false, null, new Throwable("json is null"), null, 0, TTVideoEngine.PLAYER_OPTION_SET_SUPER_RES_STRENGTH, null);
        }
        Locale d = C4484g.m18494b().mo17253d();
        ConnectionService d2 = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "ConnectionServiceImp.getInstance()");
        ConnectionService.NetworkState b = d2.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.getInstance().networkState");
        boolean b2 = b.mo20041b();
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
            JSONArray jSONArray = null;
            if (optJSONObject != null) {
                jSONObject = optJSONObject.optJSONObject("authors");
            } else {
                jSONObject = null;
            }
            if (optJSONObject == null || (optString = optJSONObject.optString("buffer")) == null) {
                str3 = "";
            } else {
                str3 = optString;
            }
            if (optJSONObject != null) {
                jSONArray = optJSONObject.optJSONArray(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            }
            TemplatesParser mVar = TemplatesParser.f31104a;
            Intrinsics.checkExpressionValueIsNotNull(d, "locale");
            Category category = new Category("", false, mVar.mo44287a(jSONArray, jSONObject, d, b2), 5, false, null, null, SmEvents.EVENT_NE_RR, null);
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = 0;
            try {
                return new TemplateGroupTab(2, m48308a(CollectionsKt.arrayListOf(category), z3, new C11643b(intRef)), z3, z2, str2, null, str3, intRef.element);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            C13479a.m54759a("BaseSearchParser", "parse()...err", th);
            return new TemplateGroupTab(2, null, false, false, null, th, null, 0, SmEvents.EVENT_FT, null);
        }
    }

    /* renamed from: a */
    private final ArrayList<CategoryTab> m48308a(ArrayList<Category> arrayList, boolean z, Function1<? super Integer, Unit> function1) {
        ArrayList<CategoryTab> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        Iterator<Category> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.addAll(it.next().getTemplates());
        }
        function1.invoke(Integer.valueOf(arrayList3.size()));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C10539a.m43639a(C13615c.f35773a, R.string.Doc_List_TemplateSearchResult, "SearchKeyWord", this.f31346b));
        Application application = C13615c.f35773a;
        Intrinsics.checkExpressionValueIsNotNull(application, "ContextUtils.baseApplication");
        spannableStringBuilder.setSpan(new ForegroundColorSpan(application.getResources().getColor(R.color.space_kit_b500)), 0, this.f31346b.length(), 33);
        Category category = new Category(spannableStringBuilder, z, arrayList3, 0, false, null, null, SmEvents.EVENT_NW, null);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(category);
        arrayList2.add(new CategoryTab("", arrayList4, 0, 0, 12, null));
        return arrayList2;
    }
}
