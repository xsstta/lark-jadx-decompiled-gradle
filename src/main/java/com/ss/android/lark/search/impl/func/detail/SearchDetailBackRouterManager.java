package com.ss.android.lark.search.impl.func.detail;

import android.app.Activity;
import com.ss.android.lark.search.C53258a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/search/impl/func/detail/SearchDetailBackRouterManager;", "", "()V", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.impl.func.detail.b */
public final class SearchDetailBackRouterManager {

    /* renamed from: a */
    public static final Companion f132285a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/search/impl/func/detail/SearchDetailBackRouterManager$Companion;", "", "()V", "handleBackRouter", "", "activity", "Landroid/app/Activity;", "searchFromTab", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.detail.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo182808a(Activity activity, int i) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            if (i == 4) {
                activity.finish();
            } else {
                C53258a.m205939a().mo181737a(activity, SearchDetailTabManager.f132384b.mo182917a(i));
            }
        }
    }
}
