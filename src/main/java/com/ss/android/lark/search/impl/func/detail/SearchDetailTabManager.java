package com.ss.android.lark.search.impl.func.detail;

import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/search/impl/func/detail/SearchDetailTabManager;", "", "()V", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.impl.func.detail.g */
public final class SearchDetailTabManager {

    /* renamed from: a */
    public static final SparseArray<String> f132383a = new SparseArray<>();

    /* renamed from: b */
    public static final Companion f132384b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/search/impl/func/detail/SearchDetailTabManager$Companion;", "", "()V", "TAG", "", "tabNameArray", "Landroid/util/SparseArray;", "getTabName", "searchFromTab", "", "initTabNameArray", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.detail.g$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo182918a() {
            SearchDetailTabManager.f132383a.put(1, "conversation");
            SearchDetailTabManager.f132383a.put(5, "calendar");
            SearchDetailTabManager.f132383a.put(6, "appCenter");
            SearchDetailTabManager.f132383a.put(7, "space");
            SearchDetailTabManager.f132383a.put(2, "contact");
            SearchDetailTabManager.f132383a.put(8, "wiki");
            SearchDetailTabManager.f132383a.put(9, "group");
            SearchDetailTabManager.f132383a.put(3, "pin");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo182917a(int i) {
            String str = SearchDetailTabManager.f132383a.get(i);
            if (TextUtils.isEmpty(str)) {
                Log.m165383e("SearchTabManager", "getTabName failed: search from tab is unknown");
                return "conversation";
            }
            Intrinsics.checkExpressionValueIsNotNull(str, "tabName");
            return str;
        }
    }

    static {
        Companion aVar = new Companion(null);
        f132384b = aVar;
        aVar.mo182918a();
    }
}
