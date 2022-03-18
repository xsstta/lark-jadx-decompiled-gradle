package com.ss.android.lark.search.impl.hitpoint.onscreen;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.statistics.Statistics;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007J\u0006\u0010\u000f\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\rJ(\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0002J\b\u0010\u0014\u001a\u00020\rH\u0002R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/search/impl/hitpoint/onscreen/OnScreenReporter;", "", "searchPage", "", "(Ljava/lang/String;)V", "onScreenByScrollList", "Ljava/util/LinkedHashSet;", "Lcom/ss/android/lark/search/impl/hitpoint/onscreen/OnScreenItem;", "Lkotlin/collections/LinkedHashSet;", "onScreenList", "scrollReport", "", "addOnScreenItem", "", "onScreenItem", "hasScroll", "report", "reportOnScreenList", "action", "", "reset", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.impl.c.b.b */
public final class OnScreenReporter {

    /* renamed from: a */
    public static final Companion f131900a = new Companion(null);

    /* renamed from: b */
    private boolean f131901b;

    /* renamed from: c */
    private LinkedHashSet<OnScreenItem> f131902c = new LinkedHashSet<>();

    /* renamed from: d */
    private LinkedHashSet<OnScreenItem> f131903d = new LinkedHashSet<>();

    /* renamed from: e */
    private final String f131904e;

    /* renamed from: a */
    public final void mo182045a() {
        this.f131901b = true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/search/impl/hitpoint/onscreen/OnScreenReporter$Companion;", "", "()V", "ABS_DATA_SHOW_POSITION", "", "ACTION", "DATA", "ENTITY_ID", "ENTITY_TYPE", "IMPR_ID", "NORMAL", "", "OPEN_SEARCH_TAB_ID", "PAGE", "REL_DATA_SHOW_POSITION", "REQUEST_ID", "SCENE", "SCROLL", "SESSION", "TAG", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.c.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo182047b() {
        m206577a(0, this.f131902c);
        m206577a(1, this.f131903d);
        m206578c();
    }

    /* renamed from: c */
    private final void m206578c() {
        Log.m165379d("LarkSearch.Search.OnScreenReporter", "reset!!!");
        this.f131901b = false;
        this.f131902c.clear();
        this.f131903d.clear();
    }

    public OnScreenReporter(String str) {
        Intrinsics.checkParameterIsNotNull(str, "searchPage");
        this.f131904e = str;
    }

    /* renamed from: a */
    public final void mo182046a(OnScreenItem aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "onScreenItem");
        if (this.f131901b) {
            this.f131903d.add(aVar);
        } else {
            this.f131902c.add(aVar);
        }
    }

    /* renamed from: a */
    private final void m206577a(int i, LinkedHashSet<OnScreenItem> linkedHashSet) {
        Integer num;
        Log.m165379d("LarkSearch.Search.OnScreenReporter", "reportOnScreenList, action: " + i);
        if (linkedHashSet.isEmpty()) {
            Log.m165379d("LarkSearch.Search.OnScreenReporter", "list is empty!!!");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        Object obj = (String) null;
        jSONObject.put("action", i);
        jSONObject.put("search_location", this.f131904e);
        JSONArray jSONArray = new JSONArray();
        Iterator<OnScreenItem> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            OnScreenItem next = it.next();
            Object c = next.mo182035c();
            JSONObject jSONObject2 = new JSONObject();
            Scene.Type a = next.mo182033a();
            if (a != null) {
                num = Integer.valueOf(a.getNumber());
            } else {
                num = null;
            }
            jSONObject2.put("scene_type", num);
            jSONObject2.put("impr_id", next.mo182034b());
            jSONObject2.put("search_id", next.mo182036d());
            jSONObject2.put("entity_id", next.mo182037e());
            jSONObject2.put("entity_type", next.mo182039f());
            jSONObject2.put("result_location", next.mo182040g());
            jSONObject2.put("position", next.mo182041h());
            jSONObject2.put("open_search_tab_id", next.mo182043i());
            jSONArray.put(jSONObject2);
            obj = c;
        }
        jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONArray);
        if (obj == null) {
            obj = "";
        }
        jSONObject.put("search_session_ID", obj);
        Log.m165379d("LarkSearch.Search.OnScreenReporter", "data: " + jSONObject);
        Statistics.sendEvent("search_on_screen", jSONObject);
    }
}
