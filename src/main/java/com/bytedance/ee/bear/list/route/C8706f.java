package com.bytedance.ee.bear.list.route;

import android.content.Context;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.route.RouteBean;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.route.f */
public class C8706f {

    /* renamed from: a */
    private final Context f23542a;

    /* renamed from: b */
    private final Document f23543b;

    /* renamed from: c */
    private final String f23544c;

    /* renamed from: d */
    private final String f23545d;

    /* renamed from: e */
    private final String f23546e;

    /* renamed from: f */
    private final int f23547f;

    /* renamed from: g */
    private final String f23548g;

    /* renamed from: h */
    private final List<Document> f23549h;

    /* renamed from: a */
    public RouteBean mo33741a() {
        return m36434b().mo33720a(this.f23543b);
    }

    /* renamed from: b */
    private AbstractC8705e m36434b() {
        if (this.f23543b.mo32483t() == C8275a.f22370c.mo32555b()) {
            return new C8696c(this.f23542a, this.f23544c, this.f23547f, this.f23548g);
        }
        if (this.f23543b.mo32483t() == C8275a.f22375h.mo32555b()) {
            return new C8695b(this.f23542a, this.f23549h, this.f23544c, this.f23545d, this.f23546e, this.f23548g);
        }
        return new C8694a(this.f23542a);
    }

    public C8706f(Context context, Document document, String str, List<Document> list, String str2, String str3) {
        this(context, document, str, list, str2, str3, 1, "");
    }

    public C8706f(Context context, Document document, String str, List<Document> list, String str2, String str3, int i, String str4) {
        this.f23542a = context;
        this.f23543b = document;
        this.f23544c = str;
        this.f23549h = list;
        this.f23547f = i;
        this.f23548g = str4;
        this.f23545d = str2;
        this.f23546e = str3;
    }
}
