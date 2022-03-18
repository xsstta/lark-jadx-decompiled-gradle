package com.ss.android.lark.search.impl.func.global.p2620b;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.search.impl.func.C53389a;
import com.ss.android.lark.searchcommon.constant.C53887a;

/* renamed from: com.ss.android.lark.search.impl.func.global.b.a */
public class C53627a {

    /* renamed from: a */
    private final SparseArray<C53887a> f132386a = new SparseArray<>();

    /* renamed from: b */
    private final SparseIntArray f132387b = new SparseIntArray();

    /* renamed from: c */
    private final C53389a f132388c = new C53389a();

    public C53627a() {
        m207599a();
        m207600b();
    }

    /* renamed from: a */
    private void m207599a() {
        this.f132387b.put(1, 161);
        this.f132387b.put(2, 162);
        this.f132387b.put(10, 163);
        this.f132387b.put(3, 164);
        this.f132387b.put(8, 165);
        this.f132387b.put(100000011, 165);
        this.f132387b.put(6, 166);
        this.f132387b.put(12, 167);
        this.f132387b.put(15, 170);
        this.f132387b.put(10000004, 171);
        this.f132387b.put(100000012, 173);
    }

    /* renamed from: b */
    private void m207600b() {
        this.f132386a.put(this.f132387b.get(1), this.f132388c.mo182358a(1));
        this.f132386a.put(this.f132387b.get(2), this.f132388c.mo182358a(2));
        this.f132386a.put(this.f132387b.get(10), this.f132388c.mo182358a(10));
        this.f132386a.put(this.f132387b.get(3), this.f132388c.mo182358a(3));
        this.f132386a.put(this.f132387b.get(8), this.f132388c.mo182358a(8));
        this.f132386a.put(this.f132387b.get(6), this.f132388c.mo182358a(6));
        this.f132386a.put(this.f132387b.get(12), this.f132388c.mo182358a(12));
        this.f132386a.put(this.f132387b.get(15), this.f132388c.mo182358a(15));
        this.f132386a.put(this.f132387b.get(10000004), this.f132388c.mo182358a(10000004));
        this.f132386a.put(this.f132387b.get(100000012), this.f132388c.mo182358a(100000012));
    }

    /* renamed from: a */
    public int mo182930a(int i) {
        int i2 = this.f132387b.get(i);
        if (i2 != 0) {
            return i2;
        }
        C53241h.m205894a("LarkSearch.Search.SearchResultDataGenerator", "result type is unknown: resultType is " + i);
        return -1;
    }

    /* renamed from: b */
    public String mo182931b(int i) {
        C53887a aVar = this.f132386a.get(i);
        if (aVar != null) {
            return aVar.mo183803a();
        }
        C53241h.m205894a("LarkSearch.Search.SearchResultDataGenerator", "header id is unknown: headerId is " + i);
        return "";
    }
}
