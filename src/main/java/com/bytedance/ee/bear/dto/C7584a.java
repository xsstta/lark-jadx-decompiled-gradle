package com.bytedance.ee.bear.dto;

import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.doc.entity.Icon;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.dto.a */
public class C7584a {

    /* renamed from: a */
    private String f20578a;

    /* renamed from: b */
    private List<String> f20579b;

    /* renamed from: c */
    private List<String> f20580c;

    /* renamed from: d */
    private DocType f20581d;

    /* renamed from: e */
    private DocType f20582e;

    /* renamed from: f */
    private long f20583f;

    /* renamed from: g */
    private String f20584g;

    /* renamed from: h */
    private String f20585h;

    /* renamed from: i */
    private String f20586i;

    /* renamed from: j */
    private String f20587j;

    /* renamed from: k */
    private int f20588k;

    /* renamed from: l */
    private boolean f20589l;

    /* renamed from: m */
    private Icon f20590m;

    /* renamed from: a */
    public String mo29815a() {
        return this.f20578a;
    }

    /* renamed from: b */
    public List<String> mo29816b() {
        return this.f20579b;
    }

    /* renamed from: c */
    public List<String> mo29817c() {
        return this.f20580c;
    }

    /* renamed from: d */
    public DocType mo29818d() {
        return this.f20581d;
    }

    /* renamed from: e */
    public long mo29819e() {
        return this.f20583f;
    }

    /* renamed from: f */
    public String mo29820f() {
        return this.f20584g;
    }

    /* renamed from: g */
    public String mo29821g() {
        return this.f20585h;
    }

    /* renamed from: h */
    public String mo29822h() {
        return this.f20586i;
    }

    /* renamed from: i */
    public boolean mo29823i() {
        return this.f20589l;
    }

    /* renamed from: j */
    public Icon mo29824j() {
        return this.f20590m;
    }

    /* renamed from: k */
    public DocType mo29825k() {
        return this.f20582e;
    }

    public C7584a(String str, List<String> list, List<String> list2, DocType docType, long j, String str2, String str3, String str4, String str5, int i, boolean z, Icon icon) {
        this(str, list, list2, docType, DocType.UNKNOWN_DOC_TYPE, j, str2, str3, str4, str5, i, z, icon);
    }

    public C7584a(String str, List<String> list, List<String> list2, DocType docType, DocType docType2, long j, String str2, String str3, String str4, String str5, int i, boolean z, Icon icon) {
        this.f20578a = str;
        this.f20579b = list;
        this.f20580c = list2;
        this.f20581d = docType;
        this.f20582e = docType2;
        this.f20583f = j;
        this.f20584g = str2;
        this.f20585h = str3;
        this.f20586i = str4;
        this.f20587j = str5;
        this.f20588k = i;
        this.f20589l = z;
        this.f20590m = icon;
    }
}
