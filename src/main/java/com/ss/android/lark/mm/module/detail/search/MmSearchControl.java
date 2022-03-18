package com.ss.android.lark.mm.module.detail.search;

import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.actions.SearchIntents;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.module.detail.search.model.FindHighlight;
import com.ss.android.lark.mm.module.detail.search.model.FindResponse;
import com.ss.android.lark.mm.module.detail.search.model.FindResults;
import com.ss.android.lark.mm.module.detail.search.model.FindSentence;
import com.ss.android.lark.mm.module.detail.search.model.FindSubtitle;
import com.ss.android.lark.mm.module.detail.search.model.FindTimeline;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.MmBaseControl;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45857i;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002JZ\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132:\u0010\u0014\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0015J\u0014\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/search/MmSearchControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseControl;", "host", "", "token", "(Ljava/lang/String;Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "getToken", "countFindResult", "", "findRes", "Lcom/ss/android/lark/mm/module/detail/search/model/FindResponse;", "find", "", SearchIntents.EXTRA_QUERY, "isFindKeyword", "", "translateLangType", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "onResponse", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "total", "parseFindResponse", "json", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.search.g */
public final class MmSearchControl extends MmBaseControl {

    /* renamed from: a */
    private final String f116250a;

    /* renamed from: b */
    private final String f116251b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/ss/android/lark/mm/module/detail/search/MmSearchControl$parseFindResponse$1$3", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/ss/android/lark/mm/module/detail/search/model/FindTimeline;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.search.g$e */
    public static final class C46132e extends TypeToken<List<? extends FindTimeline>> {
        C46132e() {
        }
    }

    /* renamed from: a */
    public final String mo162044a() {
        return this.f116251b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/search/MmSearchControl$find$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.search.g$d */
    public static final class C46129d extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ MmSearchControl f116252a;

        /* renamed from: b */
        final /* synthetic */ Function2 f116253b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.search.g$d$a */
        public static final class RunnableC46130a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C46129d f116254a;

            /* renamed from: b */
            final /* synthetic */ String f116255b;

            RunnableC46130a(C46129d dVar, String str) {
                this.f116254a = dVar;
                this.f116255b = str;
            }

            public final void run() {
                final FindResponse a = this.f116254a.f116252a.mo162043a(this.f116255b);
                final int a2 = this.f116254a.f116252a.mo162042a(a);
                C45859k.m181685a(new Runnable(this) {
                    /* class com.ss.android.lark.mm.module.detail.search.MmSearchControl.C46129d.RunnableC46130a.RunnableC461311 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC46130a f116256a;

                    {
                        this.f116256a = r1;
                    }

                    public final void run() {
                        Function2 kVar = this.f116256a.f116254a.f116253b;
                        if (kVar != null) {
                            Unit unit = (Unit) kVar.invoke(a, Integer.valueOf(a2));
                        }
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo161289a(String str) {
            C45857i.m181676a(new RunnableC46130a(this, str));
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            C45855f.m181666e("MmSearchControl", "find error: " + aVar);
            Function2 kVar = this.f116253b;
            if (kVar != null) {
                Unit unit = (Unit) kVar.invoke(null, 0);
            }
        }

        C46129d(MmSearchControl gVar, Function2 kVar) {
            this.f116252a = gVar;
            this.f116253b = kVar;
        }
    }

    /* renamed from: a */
    public final int mo162042a(FindResponse findResponse) {
        FindResults results;
        List<FindSubtitle> subtitles;
        int i = 0;
        if (!(findResponse == null || (results = findResponse.getResults()) == null || (subtitles = results.getSubtitles()) == null)) {
            Iterator<T> it = subtitles.iterator();
            while (it.hasNext()) {
                List<FindSentence> sentences = it.next().getSentences();
                if (sentences != null) {
                    Iterator<T> it2 = sentences.iterator();
                    while (it2.hasNext()) {
                        List<FindHighlight> highlight = it2.next().getHighlight();
                        if (highlight != null) {
                            for (T t : highlight) {
                                i++;
                            }
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public final FindResponse mo162043a(String str) {
        Set<Map.Entry<String, JsonElement>> set;
        String str2;
        JsonElement jsonElement;
        JsonObject asJsonObject;
        FindResponse findResponse = new FindResponse(null, null, null, null, 15, null);
        try {
            JsonElement parse = new JsonParser().parse(str);
            Intrinsics.checkExpressionValueIsNotNull(parse, "JsonParser().parse(json)");
            JsonObject asJsonObject2 = parse.getAsJsonObject();
            if (asJsonObject2 != null) {
                JsonElement jsonElement2 = asJsonObject2.get(SearchIntents.EXTRA_QUERY);
                Intrinsics.checkExpressionValueIsNotNull(jsonElement2, "dataResponse.get(\"query\")");
                findResponse.setQuery(jsonElement2.getAsString());
                JsonElement jsonElement3 = asJsonObject2.get(ShareHitPoint.f121869d);
                Intrinsics.checkExpressionValueIsNotNull(jsonElement3, "dataResponse.get(\"type\")");
                findResponse.setType(Integer.valueOf(jsonElement3.getAsInt()));
                ArrayList arrayList = new ArrayList();
                findResponse.setResults(new FindResults(arrayList));
                JsonElement jsonElement4 = asJsonObject2.get("results");
                Intrinsics.checkExpressionValueIsNotNull(jsonElement4, "dataResponse.get(\"results\")");
                JsonObject asJsonObject3 = jsonElement4.getAsJsonObject();
                if (asJsonObject3 == null || (jsonElement = asJsonObject3.get("subtitles")) == null || (asJsonObject = jsonElement.getAsJsonObject()) == null) {
                    set = null;
                } else {
                    set = asJsonObject.entrySet();
                }
                if (set != null) {
                    Iterator<T> it = set.iterator();
                    while (it.hasNext()) {
                        FindSubtitle findSubtitle = (FindSubtitle) new Gson().fromJson(((JsonElement) it.next().getValue()).toString(), FindSubtitle.class);
                        List<FindSentence> sentences = findSubtitle.getSentences();
                        if (sentences != null && sentences.size() > 1) {
                            CollectionsKt.sortWith(sentences, new C46126a());
                        }
                        List<FindSentence> sentences2 = findSubtitle.getSentences();
                        if (sentences2 != null) {
                            Iterator<T> it2 = sentences2.iterator();
                            while (it2.hasNext()) {
                                List<FindHighlight> highlight = it2.next().getHighlight();
                                if (highlight != null && highlight.size() > 1) {
                                    CollectionsKt.sortWith(highlight, new C46127b());
                                }
                            }
                        }
                        Intrinsics.checkExpressionValueIsNotNull(findSubtitle, "findSubtitle");
                        arrayList.add(findSubtitle);
                    }
                }
                if (arrayList.size() > 1) {
                    CollectionsKt.sortWith(arrayList, new C46128c());
                }
                Gson gson = new Gson();
                JsonElement jsonElement5 = asJsonObject2.get("timeline");
                if (jsonElement5 != null) {
                    str2 = jsonElement5.toString();
                } else {
                    str2 = null;
                }
                findResponse.setTimeline((List) gson.fromJson(str2, new C46132e().getType()));
                return findResponse;
            }
        } catch (Exception e) {
            C45855f.m181666e("MmSearchControl", "parseFindResponse failed, " + e);
        }
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.search.g$a */
    public static final class C46126a<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(t.getSid(), t2.getSid());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.search.g$b */
    public static final class C46127b<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(t.getOffset(), t2.getOffset());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.search.g$c */
    public static final class C46128c<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(t.getPid(), t2.getPid());
        }
    }

    public MmSearchControl(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "host");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        this.f116250a = str;
        this.f116251b = str2;
    }

    /* renamed from: a */
    public final void mo162045a(String str, boolean z, MmTranslateLangType mmTranslateLangType, Function2<? super FindResponse, ? super Integer, Unit> kVar) {
        boolean z2;
        Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
        Intrinsics.checkParameterIsNotNull(mmTranslateLangType, "translateLangType");
        if (str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            C47057a.m186259a(this.f116250a, this.f116251b, str, mmTranslateLangType.getValue(), z, new C46129d(this, kVar));
        } else if (kVar != null) {
            kVar.invoke(null, -1);
        }
    }
}
