package com.ss.android.lark.search.impl.func.global.search.order;

import com.ss.android.lark.search.impl.func.global.search.entity.GlobalSearchOrderData;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/search/impl/func/global/search/order/SearchOrderManager;", "", "()V", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.impl.func.global.search.b.b */
public final class SearchOrderManager {

    /* renamed from: a */
    public static final Lazy f132392a = LazyKt.lazy(C53630b.INSTANCE);

    /* renamed from: b */
    public static final Companion f132393b = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final GlobalSearchOrderData m207614a(int i) {
        return f132393b.mo182934a(i);
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<Integer> m207615a() {
        return Companion.m207618b(f132393b, 0, 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\fH\u0007R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/search/impl/func/global/search/order/SearchOrderManager$Companion;", "", "()V", "mNetSearchOrderManager", "Lcom/ss/android/lark/search/impl/func/global/search/order/NetSearchOrderManager;", "getMNetSearchOrderManager", "()Lcom/ss/android/lark/search/impl/func/global/search/order/NetSearchOrderManager;", "mNetSearchOrderManager$delegate", "Lkotlin/Lazy;", "getGlobalSearchOrderData", "Lcom/ss/android/lark/search/impl/func/global/search/entity/GlobalSearchOrderData;", "fromTab", "", "getSearchOrderList", "", "searchFromTab", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.global.search.b.b$a */
    public static final class Companion {
        /* renamed from: a */
        private final NetSearchOrderManager m207616a() {
            Lazy lazy = SearchOrderManager.f132392a;
            Companion aVar = SearchOrderManager.f132393b;
            return (NetSearchOrderManager) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: b */
        public final List<Integer> mo182935b(int i) {
            return m207616a().mo182933a(i);
        }

        @JvmStatic
        /* renamed from: a */
        public final GlobalSearchOrderData mo182934a(int i) {
            GlobalSearchOrderData globalSearchOrderData = new GlobalSearchOrderData();
            globalSearchOrderData.setSearchFromTab(i);
            globalSearchOrderData.setSearchOrderList(SearchOrderManager.f132393b.mo182935b(globalSearchOrderData.getSearchFromTab()));
            return globalSearchOrderData;
        }

        /* renamed from: b */
        public static /* synthetic */ List m207618b(Companion aVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 1;
            }
            return aVar.mo182935b(i);
        }

        /* renamed from: a */
        public static /* synthetic */ GlobalSearchOrderData m207617a(Companion aVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 1;
            }
            return aVar.mo182934a(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/search/impl/func/global/search/order/NetSearchOrderManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.global.search.b.b$b */
    static final class C53630b extends Lambda implements Function0<NetSearchOrderManager> {
        public static final C53630b INSTANCE = new C53630b();

        C53630b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final NetSearchOrderManager invoke() {
            return new NetSearchOrderManager();
        }
    }
}
