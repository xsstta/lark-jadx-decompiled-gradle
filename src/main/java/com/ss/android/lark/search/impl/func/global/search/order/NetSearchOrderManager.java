package com.ss.android.lark.search.impl.func.global.search.order;

import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.C53329a;
import com.ss.android.lark.search.impl.C53339b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0005H\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/search/impl/func/global/search/order/NetSearchOrderManager;", "", "()V", "mDefaultOrderList", "", "", "getMDefaultOrderList", "()Ljava/util/List;", "mDefaultOrderList$delegate", "Lkotlin/Lazy;", "getNetDefaultOrderList", "getNetOrderList", "searchFromTab", "getNetSearchContactOrderList", "getOldNetSearchContactOrderList", "getTargetNetOrderList", "resultType", "needQACardSearch", "", "needServiceCardSearch", "needSmartSearch", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.impl.func.global.search.b.a */
public final class NetSearchOrderManager {

    /* renamed from: a */
    private final Lazy f132391a = LazyKt.lazy(C53629a.INSTANCE);

    /* renamed from: a */
    private final List<Integer> m207605a() {
        return (List) this.f132391a.getValue();
    }

    /* renamed from: d */
    private final boolean m207611d(int i) {
        return i == 1 || i == 12;
    }

    /* renamed from: d */
    private final List<Integer> m207610d() {
        return m207605a();
    }

    /* renamed from: b */
    private final List<Integer> m207606b() {
        ISearchModuleDependency a = C53258a.m205939a();
        if (a == null || !a.mo181749b()) {
            return m207608c();
        }
        return m207610d();
    }

    /* renamed from: c */
    private final List<Integer> m207608c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(10);
        return arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.global.search.b.a$a */
    static final class C53629a extends Lambda implements Function0<List<Integer>> {
        public static final C53629a INSTANCE = new C53629a();

        C53629a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<Integer> invoke() {
            List<Integer> mutableListOf = CollectionsKt.mutableListOf(1, 2);
            if (!C53329a.m206412b()) {
                if (C53339b.m206449i()) {
                    mutableListOf.add(10);
                }
                mutableListOf.add(3);
                mutableListOf.add(8);
                mutableListOf.add(6);
                mutableListOf.add(12);
                mutableListOf.add(10000004);
            }
            return mutableListOf;
        }
    }

    /* renamed from: c */
    private final boolean m207609c(int i) {
        if (!C53258a.m205939a().mo181745a("lark.search.main.smart") || (i != 1 && i != 12)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private final boolean m207612e(int i) {
        if (!C53258a.m205939a().mo181745a("lark.search.mobile.service.card") || (i != 1 && i != 12)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final List<Integer> m207607b(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m207605a());
        if (arrayList.contains(Integer.valueOf(i))) {
            arrayList.remove(Integer.valueOf(i));
            arrayList.add(0, Integer.valueOf(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List<Integer> mo182933a(int i) {
        List<Integer> list;
        switch (i) {
            case 1:
                list = m207610d();
                break;
            case 2:
                list = m207606b();
                break;
            case 3:
                list = m207610d();
                break;
            case 4:
                list = m207610d();
                break;
            case 5:
                list = m207607b(10000004);
                break;
            case 6:
                list = m207607b(12);
                break;
            case 7:
                list = m207607b(6);
                break;
            case 8:
                list = m207607b(15);
                break;
            case 9:
                list = m207607b(8);
                break;
            default:
                list = m207610d();
                break;
        }
        boolean c = m207609c(i);
        boolean d = m207611d(i);
        boolean e = m207612e(i);
        if (!c && !d && !e) {
            return CollectionsKt.toMutableList((Collection) list);
        }
        List<Integer> mutableList = CollectionsKt.toMutableList((Collection) list);
        LinkedList linkedList = new LinkedList();
        if (d) {
            linkedList.add(100000015);
        }
        if (c) {
            linkedList.add(100000012);
        }
        if (e) {
            linkedList.add(100000014);
        }
        mutableList.addAll(0, linkedList);
        return mutableList;
    }
}
