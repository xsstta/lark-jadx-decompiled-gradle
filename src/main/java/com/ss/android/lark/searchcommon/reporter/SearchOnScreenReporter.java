package com.ss.android.lark.searchcommon.reporter;

import android.text.TextUtils;
import com.huawei.hms.actions.SearchIntents;
import com.ss.android.lark.searchcommon.reporter.IReporter;
import com.ss.android.lark.searchcommon.utils.SessionManager;
import com.ss.android.lark.utils.C57859q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tJ\b\u0010\u0010\u001a\u00020\u0003H\u0002J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J=\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u001bJG\u0010\u001c\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, d2 = {"Lcom/ss/android/lark/searchcommon/reporter/SearchOnScreenReporter;", "Lcom/ss/android/lark/searchcommon/reporter/IReporter;", "searchLocation", "", "(Ljava/lang/String;)V", "limit", "", "onScreenList", "Ljava/util/LinkedHashSet;", "Lcom/ss/android/lark/searchcommon/reporter/NewOnScreenItem;", "Lkotlin/collections/LinkedHashSet;", "getSearchLocation", "()Ljava/lang/String;", "addOnScreenItem", "", "onScreenItem", "packFeature", "report", "args", "Lorg/json/JSONObject;", "reportChatInsideOnScreen", SearchIntents.EXTRA_QUERY, "filterStatus", "imprId", "isResult", "", "page", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)V", "reportOnScreen", "sceneType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;)V", "reset", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.d.g */
public final class SearchOnScreenReporter implements IReporter {

    /* renamed from: a */
    private final int f133159a = 60;

    /* renamed from: b */
    private LinkedHashSet<NewOnScreenItem> f133160b = new LinkedHashSet<>();

    /* renamed from: c */
    private final String f133161c;

    /* renamed from: a */
    public void mo183823a() {
        this.f133160b = new LinkedHashSet<>();
    }

    /* renamed from: b */
    private final String m208855b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<NewOnScreenItem> it = this.f133160b.iterator();
        while (it.hasNext()) {
            String c = it.next().mo183809c();
            if (c != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : StringsKt.split$default((CharSequence) c, new String[]{","}, false, 0, 6, (Object) null)) {
                    if (!StringsKt.isBlank((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                linkedHashSet.addAll(arrayList);
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            sb.append(((String) it2.next()) + ',');
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "feature.toString()");
        return sb2;
    }

    /* renamed from: a */
    public Object mo183822a(Object obj) {
        return IReporter.C53888a.m208826a(this, obj);
    }

    public SearchOnScreenReporter(String str) {
        Intrinsics.checkParameterIsNotNull(str, "searchLocation");
        this.f133161c = str;
    }

    /* renamed from: a */
    public final void mo183824a(NewOnScreenItem cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "onScreenItem");
        if (this.f133160b.size() <= this.f133159a) {
            this.f133160b.add(cVar);
        }
    }

    /* renamed from: a */
    public void mo183827a(JSONObject jSONObject) {
        if (jSONObject != null) {
            jSONObject.put("search_session_id", SessionManager.m209245a());
            jSONObject.put("request_timestamp", System.currentTimeMillis());
            if (ChatInSideContext.f133144a.mo183805d()) {
                if (!TextUtils.isEmpty(ChatInSideContext.m208818a()) && (!StringsKt.isBlank(ChatInSideContext.m208818a()))) {
                    jSONObject.put("chat_id", ChatInSideContext.m208818a());
                }
                if (!TextUtils.isEmpty(ChatInSideContext.m208820b()) && (!StringsKt.isBlank(ChatInSideContext.m208820b()))) {
                    jSONObject.put("chat_type", ChatInSideContext.m208820b());
                }
            }
            SafeReporter.f133151a.mo183813a("asl_search_show", jSONObject);
        }
    }

    @Override // com.ss.android.lark.searchcommon.reporter.IReporter
    /* renamed from: a */
    public void mo183806a(JSONObject jSONObject, String str, String str2) {
        IReporter.C53888a.m208827a(this, jSONObject, str, str2);
    }

    /* renamed from: a */
    public final void mo183825a(String str, String str2, String str3, boolean z, Integer num) {
        String str4;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("search_location", mo183822a(this.f133161c));
        mo183806a(jSONObject, str, str2);
        jSONObject.put("impr_id", mo183822a(str3));
        if (z) {
            str4 = "True";
        } else {
            str4 = "False";
        }
        jSONObject.put("is_result", str4);
        jSONObject.put("offset", mo183822a(num));
        jSONObject.put("scene_type", "chat");
        mo183827a(jSONObject);
    }

    /* renamed from: a */
    public final void mo183826a(String str, String str2, String str3, boolean z, Integer num, String str4) {
        int i;
        Object obj;
        if (!this.f133160b.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("search_location", mo183822a(this.f133161c));
            mo183806a(jSONObject, str, str2);
            if (str != null) {
                i = str.length();
            } else {
                i = 0;
            }
            if (i > 0) {
                jSONObject.put("impr_id", mo183822a(str3));
            } else {
                jSONObject.put("impr_id", "");
            }
            if (z) {
                obj = "True";
            } else {
                obj = "False";
            }
            jSONObject.put("is_result", obj);
            JSONArray jSONArray = new JSONArray();
            Iterator<NewOnScreenItem> it = this.f133160b.iterator();
            while (it.hasNext()) {
                NewOnScreenItem next = it.next();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("entity_id", C57859q.m224565a(next.mo183807a()));
                jSONObject2.put("result_type", mo183822a(next.mo183808b()));
                jSONObject2.put("tag", mo183822a(next.mo183809c()));
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("id_list", jSONArray);
            jSONObject.put("offset", mo183822a(num));
            jSONObject.put("scene_type", mo183822a(str4));
            jSONObject.put("feature", mo183822a(m208855b()));
            mo183827a(jSONObject);
            mo183823a();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m208854a(SearchOnScreenReporter gVar, String str, String str2, String str3, boolean z, Integer num, String str4, int i, Object obj) {
        boolean z2;
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        gVar.mo183826a(str, str2, str3, z2, num, str4);
    }
}
