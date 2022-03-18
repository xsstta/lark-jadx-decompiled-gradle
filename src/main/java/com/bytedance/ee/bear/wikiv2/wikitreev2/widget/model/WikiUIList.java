package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB'\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\tJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\tJ\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\tJ\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\tJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\tR\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00130\bX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiUIList;", "", "wikiTreeList", "", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/UITreeNode;", "favoriteList", "(Ljava/util/List;Ljava/util/List;)V", "indexmap", "", "", "", "<set-?>", "maxLevel", "getMaxLevel", "()I", "mergeList", "getMergeList", "()Ljava/util/List;", "tokenmap", "", "contain", "", "uid", "containToken", "wikiToken", "get", "getPosition", "getTokenPosition", "updateTitle", "", "newTitle", "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.k */
public final class WikiUIList {

    /* renamed from: a */
    public static final WikiUIList f33505a = new WikiUIList(new ArrayList(0), null);

    /* renamed from: b */
    public static final Companion f33506b = new Companion(null);

    /* renamed from: c */
    private final List<C12478g> f33507c;

    /* renamed from: d */
    private int f33508d;

    /* renamed from: e */
    private final Map<String, Integer> f33509e;

    /* renamed from: f */
    private final Map<String, List<Integer>> f33510f;

    public WikiUIList(List<C12478g> list) {
        this(list, null, 2, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiUIList$Companion;", "", "()V", "EMPTY", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiUIList;", "getEMPTY", "()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiUIList;", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.k$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final WikiUIList mo47600a() {
            return WikiUIList.f33505a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final List<C12478g> mo47593a() {
        return this.f33507c;
    }

    /* renamed from: b */
    public final int mo47595b() {
        return this.f33508d;
    }

    /* renamed from: e */
    public final List<Integer> mo47599e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "wikiToken");
        return this.f33510f.get(str);
    }

    /* renamed from: a */
    public final C12478g mo47592a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        int c = mo47597c(str);
        if (c != -1) {
            return this.f33507c.get(c);
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo47596b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        if (TextUtils.isEmpty(str) || !this.f33509e.containsKey(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final int mo47597c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Integer num = this.f33509e.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* renamed from: d */
    public final boolean mo47598d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "wikiToken");
        if (TextUtils.isEmpty(str) || !this.f33510f.containsKey(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo47594a(String str, String str2) {
        String str3;
        Intrinsics.checkParameterIsNotNull(str, "wikiToken");
        List<Integer> e = mo47599e(str);
        if (e != null) {
            for (Integer num : e) {
                C12478g gVar = this.f33507c.get(num.intValue());
                if (str2 != null) {
                    str3 = str2;
                } else {
                    str3 = "";
                }
                gVar.f33443e = str3;
            }
        }
    }

    public WikiUIList(List<C12478g> list, List<C12478g> list2) {
        List<C12478g> plus;
        Intrinsics.checkParameterIsNotNull(list, "wikiTreeList");
        if (!(list2 == null || (plus = CollectionsKt.plus((Collection) list2, (Iterable) list)) == null)) {
            list = plus;
        }
        this.f33507c = list;
        this.f33509e = new LinkedHashMap();
        this.f33510f = new LinkedHashMap();
        int i = 0;
        for (T t : list) {
            Map<String, Integer> map = this.f33509e;
            String str = t.f33450l;
            Intrinsics.checkExpressionValueIsNotNull(str, "node.uid");
            map.put(str, Integer.valueOf(i));
            ArrayList arrayList = this.f33510f.get(t.f33440b);
            if (arrayList == null) {
                arrayList = new ArrayList();
                Map<String, List<Integer>> map2 = this.f33510f;
                String str2 = t.f33440b;
                Intrinsics.checkExpressionValueIsNotNull(str2, "node.wiki_token");
                map2.put(str2, arrayList);
            }
            arrayList.add(Integer.valueOf(i));
            if (t.f33451m > this.f33508d) {
                this.f33508d = t.f33451m;
            }
            i++;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WikiUIList(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : list2);
    }
}
