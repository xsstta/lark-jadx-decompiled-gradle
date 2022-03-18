package com.ss.android.lark.search.impl.func.global.search.p2621a;

import com.ss.android.lark.search.C53258a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.global.search.a.a */
public class C53628a {

    /* renamed from: a */
    private List<Integer> f132389a = new ArrayList();

    /* renamed from: b */
    private int f132390b;

    /* renamed from: a */
    public int mo182932a() {
        switch (this.f132390b) {
            case 5:
                return 10000004;
            case 6:
                return 12;
            case 7:
                return 6;
            case 8:
                return 15;
            case 9:
                return 8;
            default:
                return 1;
        }
    }

    /* renamed from: b */
    private void m207603b() {
        if (C53258a.m205939a().mo181749b()) {
            this.f132389a.add(2);
            this.f132389a.add(5);
            this.f132389a.add(7);
            this.f132389a.add(8);
            this.f132389a.add(9);
        }
        this.f132389a.add(6);
    }

    public C53628a(int i) {
        this.f132390b = i;
        m207603b();
    }
}
