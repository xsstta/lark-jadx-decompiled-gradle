package com.bytedance.ee.bear.list.dto;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.bytedance.ee.bear.list.dto.a */
public class C8275a {

    /* renamed from: a */
    public static List<String> f22368a = new ArrayList();

    /* renamed from: b */
    public static final C8275a f22369b = new C8275a(-1, "unknown", "unknown");

    /* renamed from: c */
    public static final C8275a f22370c;

    /* renamed from: d */
    public static final C8275a f22371d;

    /* renamed from: e */
    public static final C8275a f22372e;

    /* renamed from: f */
    public static final C8275a f22373f;

    /* renamed from: g */
    public static final C8275a f22374g;

    /* renamed from: h */
    public static final C8275a f22375h;

    /* renamed from: i */
    public static final C8275a f22376i;

    /* renamed from: j */
    public static final C8275a f22377j;

    /* renamed from: k */
    public static final C8275a f22378k;

    /* renamed from: l */
    public static final C8275a f22379l = new C8275a(28, "minutes", "minutes");

    /* renamed from: m */
    public static final C8275a f22380m = new C8275a(80, "form", "form");

    /* renamed from: n */
    public static int[] f22381n;

    /* renamed from: o */
    private String f22382o;

    /* renamed from: p */
    private int f22383p;

    /* renamed from: q */
    private String f22384q;

    /* renamed from: a */
    public String mo32553a() {
        return this.f22382o;
    }

    /* renamed from: b */
    public int mo32555b() {
        return this.f22383p;
    }

    /* renamed from: c */
    public String mo32556c() {
        return this.f22384q;
    }

    public int hashCode() {
        return Objects.hash(this.f22382o, Integer.valueOf(this.f22383p));
    }

    static {
        C8275a aVar = new C8275a(0, "folder", "folder");
        f22370c = aVar;
        C8275a aVar2 = new C8275a(2, "doc", "doc");
        f22371d = aVar2;
        C8275a aVar3 = new C8275a(3, "sheet", "sheet");
        f22372e = aVar3;
        C8275a aVar4 = new C8275a(8, "bitable", "bitable");
        f22373f = aVar4;
        C8275a aVar5 = new C8275a(11, "mindnote", "mindnote");
        f22374g = aVar5;
        C8275a aVar6 = new C8275a(12, "file", "file");
        f22375h = aVar6;
        C8275a aVar7 = new C8275a(15, "slide", "slide");
        f22376i = aVar7;
        C8275a aVar8 = new C8275a(16, "wiki", "wiki");
        f22377j = aVar8;
        C8275a aVar9 = new C8275a(22, "docx", "docx");
        f22378k = aVar9;
        f22368a.add(aVar2.mo32553a());
        f22368a.add(aVar3.mo32553a());
        f22368a.add(aVar5.mo32553a());
        f22368a.add(aVar7.mo32553a());
        f22368a.add(aVar9.mo32553a());
        f22368a.add(aVar4.mo32553a());
        f22381n = new int[]{aVar2.mo32555b(), aVar3.mo32555b(), aVar4.mo32555b(), aVar5.mo32555b(), aVar6.mo32555b(), aVar7.mo32555b(), aVar8.mo32555b(), aVar.mo32555b(), aVar9.mo32555b()};
    }

    /* renamed from: a */
    public void mo32554a(String str) {
        this.f22384q = str;
    }

    /* renamed from: c */
    public static boolean m34054c(int i) {
        if (i == f22371d.f22383p || i == f22378k.f22383p || i == f22372e.f22383p || i == f22374g.f22383p || i == f22373f.f22383p || i == f22375h.f22383p) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8275a aVar = (C8275a) obj;
        if (this.f22383p != aVar.f22383p || !Objects.equals(this.f22382o, aVar.f22382o)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static C8275a m34052b(int i) {
        C8275a aVar = f22371d;
        if (i == aVar.mo32555b()) {
            return aVar;
        }
        C8275a aVar2 = f22370c;
        if (i == aVar2.mo32555b()) {
            return aVar2;
        }
        C8275a aVar3 = f22372e;
        if (i == aVar3.mo32555b()) {
            return aVar3;
        }
        C8275a aVar4 = f22373f;
        if (i == aVar4.mo32555b()) {
            return aVar4;
        }
        C8275a aVar5 = f22374g;
        if (i == aVar5.mo32555b()) {
            return aVar5;
        }
        C8275a aVar6 = f22375h;
        if (i == aVar6.mo32555b()) {
            return aVar6;
        }
        C8275a aVar7 = f22376i;
        if (i == aVar7.mo32555b()) {
            return aVar7;
        }
        C8275a aVar8 = f22377j;
        if (i == aVar8.mo32555b()) {
            return aVar8;
        }
        C8275a aVar9 = f22378k;
        if (i == aVar9.mo32555b()) {
            return aVar9;
        }
        C8275a aVar10 = f22379l;
        if (i == aVar10.mo32555b()) {
            return aVar10;
        }
        C8275a aVar11 = f22380m;
        if (i == aVar11.mo32555b()) {
            return aVar11;
        }
        return f22369b;
    }

    /* renamed from: c */
    public static String m34053c(String str) {
        if (TextUtils.equals(str, f22371d.mo32553a())) {
            return "_CLIENT_VARS";
        }
        if (TextUtils.equals(str, f22372e.mo32553a())) {
            return "_SHEET_CLIENT_VARS";
        }
        if (TextUtils.equals(str, f22374g.mo32553a())) {
            return "_MINDNOTE_CLIENT_VARS";
        }
        if (TextUtils.equals(str, f22376i.mo32553a())) {
            return "_SLIDE_CLIENT_VARS";
        }
        if (TextUtils.equals(str, f22373f.mo32553a())) {
            return "_BITABLE_CLIENT_VARS";
        }
        if (TextUtils.equals(str, f22377j.mo32553a())) {
            return "_WIKI_INFO";
        }
        return "_CLIENT_VARS";
    }

    /* renamed from: a */
    public static String m34050a(int i) {
        C8275a aVar = f22371d;
        if (i == aVar.mo32555b()) {
            return aVar.mo32553a();
        }
        C8275a aVar2 = f22370c;
        if (i == aVar2.mo32555b()) {
            return aVar2.mo32553a();
        }
        C8275a aVar3 = f22372e;
        if (i == aVar3.mo32555b()) {
            return aVar3.mo32553a();
        }
        C8275a aVar4 = f22373f;
        if (i == aVar4.mo32555b()) {
            return aVar4.mo32553a();
        }
        C8275a aVar5 = f22374g;
        if (i == aVar5.mo32555b()) {
            return aVar5.mo32553a();
        }
        C8275a aVar6 = f22375h;
        if (i == aVar6.mo32555b()) {
            return aVar6.mo32553a();
        }
        C8275a aVar7 = f22376i;
        if (i == aVar7.mo32555b()) {
            return aVar7.mo32553a();
        }
        C8275a aVar8 = f22377j;
        if (i == aVar8.mo32555b()) {
            return aVar8.mo32553a();
        }
        C8275a aVar9 = f22378k;
        if (i == aVar9.mo32555b()) {
            return aVar9.mo32553a();
        }
        C8275a aVar10 = f22379l;
        if (i == aVar10.mo32555b()) {
            return aVar10.mo32553a();
        }
        C8275a aVar11 = f22380m;
        if (i == aVar11.mo32555b()) {
            return aVar11.mo32553a();
        }
        return f22369b.mo32553a();
    }

    /* renamed from: b */
    public static int m34051b(String str) {
        int b = f22369b.mo32555b();
        C8275a aVar = f22371d;
        if (TextUtils.equals(str, aVar.mo32553a())) {
            return aVar.mo32555b();
        }
        C8275a aVar2 = f22372e;
        if (TextUtils.equals(str, aVar2.mo32553a())) {
            return aVar2.mo32555b();
        }
        C8275a aVar3 = f22374g;
        if (TextUtils.equals(str, aVar3.mo32553a())) {
            return aVar3.mo32555b();
        }
        C8275a aVar4 = f22373f;
        if (TextUtils.equals(str, aVar4.mo32553a())) {
            return aVar4.mo32555b();
        }
        C8275a aVar5 = f22375h;
        if (TextUtils.equals(str, aVar5.mo32553a())) {
            return aVar5.mo32555b();
        }
        C8275a aVar6 = f22376i;
        if (TextUtils.equals(str, aVar6.mo32553a())) {
            return aVar6.mo32555b();
        }
        C8275a aVar7 = f22370c;
        if (TextUtils.equals(str, aVar7.mo32553a())) {
            return aVar7.mo32555b();
        }
        C8275a aVar8 = f22377j;
        if (TextUtils.equals(str, aVar8.mo32553a())) {
            return aVar8.mo32555b();
        }
        C8275a aVar9 = f22378k;
        if (TextUtils.equals(str, aVar9.mo32553a())) {
            return aVar9.mo32555b();
        }
        C8275a aVar10 = f22379l;
        if (TextUtils.equals(str, aVar10.mo32553a())) {
            return aVar10.mo32555b();
        }
        C8275a aVar11 = f22380m;
        if (TextUtils.equals(str, aVar11.mo32553a())) {
            return aVar11.mo32555b();
        }
        return b;
    }

    /* renamed from: d */
    public static C8275a m34055d(String str) {
        C8275a aVar = f22369b;
        C8275a aVar2 = f22371d;
        if (!TextUtils.equals(str, aVar2.mo32553a())) {
            aVar2 = f22372e;
            if (!TextUtils.equals(str, aVar2.mo32553a())) {
                aVar2 = f22374g;
                if (!TextUtils.equals(str, aVar2.mo32553a())) {
                    aVar2 = f22373f;
                    if (!TextUtils.equals(str, aVar2.mo32553a())) {
                        aVar2 = f22375h;
                        if (!TextUtils.equals(str, aVar2.mo32553a())) {
                            aVar2 = f22376i;
                            if (!TextUtils.equals(str, aVar2.mo32553a())) {
                                aVar2 = f22370c;
                                if (!TextUtils.equals(str, aVar2.mo32553a())) {
                                    aVar2 = f22377j;
                                    if (!TextUtils.equals(str, aVar2.mo32553a())) {
                                        aVar2 = f22378k;
                                        if (!TextUtils.equals(str, aVar2.mo32553a())) {
                                            aVar2 = f22379l;
                                            if (!TextUtils.equals(str, aVar2.mo32553a())) {
                                                aVar2 = f22380m;
                                                if (!TextUtils.equals(str, aVar2.mo32553a())) {
                                                    return aVar;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return aVar2;
    }

    /* renamed from: e */
    public static String m34056e(String str) {
        String c = f22369b.mo32556c();
        C8275a aVar = f22371d;
        if (TextUtils.equals(str, aVar.mo32553a()) || TextUtils.equals(str, aVar.mo32556c())) {
            return aVar.mo32556c();
        }
        C8275a aVar2 = f22372e;
        if (TextUtils.equals(str, aVar2.mo32553a()) || TextUtils.equals(str, aVar2.mo32556c())) {
            return aVar2.mo32556c();
        }
        C8275a aVar3 = f22374g;
        if (TextUtils.equals(str, aVar3.mo32553a()) || TextUtils.equals(str, aVar3.mo32556c())) {
            return aVar3.mo32556c();
        }
        C8275a aVar4 = f22373f;
        if (TextUtils.equals(str, aVar4.mo32553a()) || TextUtils.equals(str, aVar4.mo32556c())) {
            return aVar4.mo32556c();
        }
        C8275a aVar5 = f22375h;
        if (TextUtils.equals(str, aVar5.mo32553a()) || TextUtils.equals(str, aVar5.mo32556c())) {
            return aVar5.mo32556c();
        }
        C8275a aVar6 = f22376i;
        if (TextUtils.equals(str, aVar6.mo32553a()) || TextUtils.equals(str, aVar6.mo32556c())) {
            return aVar6.mo32556c();
        }
        C8275a aVar7 = f22370c;
        if (TextUtils.equals(str, aVar7.mo32553a()) || TextUtils.equals(str, aVar7.mo32556c())) {
            return aVar7.mo32556c();
        }
        C8275a aVar8 = f22377j;
        if (TextUtils.equals(str, aVar8.mo32553a()) || TextUtils.equals(str, aVar8.mo32556c())) {
            return aVar8.mo32556c();
        }
        C8275a aVar9 = f22378k;
        if (TextUtils.equals(str, aVar9.mo32553a()) || TextUtils.equals(str, aVar9.mo32556c())) {
            return aVar9.mo32556c();
        }
        C8275a aVar10 = f22379l;
        if (TextUtils.equals(str, aVar10.mo32553a()) || TextUtils.equals(str, aVar10.mo32556c())) {
            return aVar10.mo32556c();
        }
        return c;
    }

    public C8275a(int i, String str, String str2) {
        this.f22383p = i;
        this.f22382o = str;
        this.f22384q = str2;
    }
}
