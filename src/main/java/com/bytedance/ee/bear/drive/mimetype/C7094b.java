package com.bytedance.ee.bear.drive.mimetype;

import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.mimetype.b */
public class C7094b {

    /* renamed from: a */
    private MimeTypeCategory f19114a;

    /* renamed from: b */
    private String f19115b;

    /* renamed from: c */
    private final int f19116c;

    /* renamed from: d */
    private final int f19117d;

    /* renamed from: e */
    private final int f19118e;

    /* renamed from: f */
    private final int f19119f;

    /* renamed from: g */
    private final List<Integer> f19120g;

    /* renamed from: a */
    public MimeTypeCategory mo27726a() {
        return this.f19114a;
    }

    /* renamed from: b */
    public String mo27727b() {
        return this.f19115b;
    }

    /* renamed from: c */
    public int mo27728c() {
        return this.f19116c;
    }

    /* renamed from: d */
    public int mo27729d() {
        return this.f19117d;
    }

    /* renamed from: e */
    public int mo27730e() {
        return this.f19118e;
    }

    /* renamed from: f */
    public List<Integer> mo27731f() {
        return this.f19120g;
    }

    public C7094b(MimeTypeCategory mimeTypeCategory, String str, int i, int i2, int i3, int i4, List<Integer> list) {
        this.f19114a = mimeTypeCategory;
        this.f19115b = str;
        this.f19116c = i;
        this.f19117d = i2;
        this.f19118e = i3;
        this.f19119f = i4;
        this.f19120g = Collections.unmodifiableList(list);
    }
}
