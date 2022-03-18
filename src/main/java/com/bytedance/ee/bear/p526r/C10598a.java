package com.bytedance.ee.bear.p526r;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.larksuite.suite.R;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.bear.r.a */
public class C10598a {

    /* renamed from: a */
    static int[] f28439a = {1, 3, 8, 11, 12, 15};

    /* renamed from: b */
    public static final String[] f28440b = {"0"};

    /* renamed from: c */
    public static final String[] f28441c = {"5"};

    /* renamed from: d */
    static final SparseIntArray f28442d = new SparseIntArray();

    /* renamed from: e */
    static final SparseArray<String> f28443e = new SparseArray<>();

    /* renamed from: f */
    static final HashMap<C8275a, Integer> f28444f = new HashMap<>();

    /* renamed from: g */
    static final HashMap<Integer, C8275a> f28445g = new HashMap<>();

    /* renamed from: h */
    static final HashMap<C8275a, Integer> f28446h = new HashMap<>();

    /* renamed from: i */
    static final SparseArray<C8275a> f28447i = new SparseArray<>();

    /* renamed from: j */
    static final int f28448j = R.drawable.at_file_doc_prefix;

    /* renamed from: f */
    private static void m43897f() {
        SparseIntArray sparseIntArray = f28442d;
        sparseIntArray.put(1, R.drawable.at_file_doc_prefix);
        sparseIntArray.put(3, R.drawable.at_file_sheet_prefix);
        sparseIntArray.put(8, R.drawable.at_file_bitable_prefix);
        sparseIntArray.put(11, R.drawable.at_file_mindnote_prefix);
        sparseIntArray.put(12, R.drawable.at_file_drive_prefix);
        sparseIntArray.put(15, R.drawable.at_file_slide_prefix);
        sparseIntArray.put(22, R.drawable.at_file_docx_prefix);
    }

    static {
        m43897f();
        m43894c();
        m43892a();
        m43893b();
        m43895d();
        m43896e();
    }

    /* renamed from: a */
    private static void m43892a() {
        HashMap<C8275a, Integer> hashMap = f28446h;
        hashMap.put(C8275a.f22371d, 1);
        hashMap.put(C8275a.f22372e, 3);
        hashMap.put(C8275a.f22373f, 5);
        hashMap.put(C8275a.f22375h, 9);
        hashMap.put(C8275a.f22374g, 11);
        hashMap.put(C8275a.f22376i, 13);
        hashMap.put(C8275a.f22378k, 22);
    }

    /* renamed from: b */
    private static void m43893b() {
        SparseArray<C8275a> sparseArray = f28447i;
        sparseArray.put(1, C8275a.f22371d);
        sparseArray.put(0, C8275a.f22371d);
        sparseArray.put(3, C8275a.f22372e);
        sparseArray.put(2, C8275a.f22372e);
        sparseArray.put(5, C8275a.f22373f);
        sparseArray.put(4, C8275a.f22373f);
        sparseArray.put(9, C8275a.f22375h);
        sparseArray.put(8, C8275a.f22375h);
        sparseArray.put(11, C8275a.f22374g);
        sparseArray.put(10, C8275a.f22374g);
        sparseArray.put(13, C8275a.f22376i);
        sparseArray.put(12, C8275a.f22376i);
        sparseArray.put(22, C8275a.f22378k);
    }

    /* renamed from: c */
    private static void m43894c() {
        SparseArray<String> sparseArray = f28443e;
        sparseArray.put(1, C8275a.f22371d.mo32553a());
        sparseArray.put(3, C8275a.f22372e.mo32553a());
        sparseArray.put(11, C8275a.f22374g.mo32553a());
        sparseArray.put(8, C8275a.f22373f.mo32553a());
        sparseArray.put(12, C8275a.f22375h.mo32553a());
        sparseArray.put(15, C8275a.f22376i.mo32553a());
        sparseArray.put(22, C8275a.f22378k.mo32553a());
    }

    /* renamed from: d */
    private static void m43895d() {
        HashMap<C8275a, Integer> hashMap = f28444f;
        hashMap.put(C8275a.f22371d, 1);
        hashMap.put(C8275a.f22372e, 3);
        hashMap.put(C8275a.f22374g, 11);
        hashMap.put(C8275a.f22373f, 8);
        hashMap.put(C8275a.f22375h, 12);
        hashMap.put(C8275a.f22376i, 15);
        hashMap.put(C8275a.f22378k, 22);
    }

    /* renamed from: e */
    private static void m43896e() {
        HashMap<Integer, C8275a> hashMap = f28445g;
        hashMap.put(1, C8275a.f22371d);
        hashMap.put(3, C8275a.f22372e);
        hashMap.put(11, C8275a.f22374g);
        hashMap.put(8, C8275a.f22373f);
        hashMap.put(12, C8275a.f22375h);
        hashMap.put(15, C8275a.f22376i);
        hashMap.put(22, C8275a.f22378k);
    }
}
