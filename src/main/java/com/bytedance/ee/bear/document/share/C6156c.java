package com.bytedance.ee.bear.document.share;

import com.bytedance.ee.util.p700c.C13598b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.document.share.c */
public class C6156c {

    /* renamed from: a */
    private String f17152a;

    /* renamed from: b */
    private String f17153b;

    /* renamed from: c */
    private String f17154c;

    /* renamed from: d */
    private String f17155d;

    /* renamed from: e */
    private String f17156e;

    /* renamed from: f */
    private ArrayList<Integer> f17157f = new ArrayList<>();

    /* renamed from: g */
    private ArrayList<Integer> f17158g = new ArrayList<>();

    /* renamed from: h */
    private C6154a f17159h;

    /* renamed from: a */
    public String mo24850a() {
        return this.f17153b;
    }

    /* renamed from: b */
    public String mo24854b() {
        return this.f17154c;
    }

    /* renamed from: c */
    public String mo24857c() {
        return this.f17155d;
    }

    /* renamed from: d */
    public String mo24859d() {
        return this.f17156e;
    }

    /* renamed from: e */
    public C6154a mo24861e() {
        return this.f17159h;
    }

    /* renamed from: f */
    public ArrayList<Integer> mo24862f() {
        return this.f17157f;
    }

    /* renamed from: g */
    public ArrayList<Integer> mo24863g() {
        return this.f17158g;
    }

    public String toString() {
        return "ShareItemModel{id='" + C13598b.m55197d(this.f17152a) + '\'' + ", title='" + C13598b.m55197d(this.f17153b) + '\'' + ", url='" + C13598b.m55197d(this.f17154c) + '\'' + ", content='" + C13598b.m55197d(this.f17155d) + '\'' + ", topic='" + C13598b.m55197d(this.f17156e) + '\'' + ", disabledShareTypes=" + this.f17157f + ", badgeShareTypes=" + this.f17158g + ", menuCallback=" + this.f17159h + '}';
    }

    /* renamed from: a */
    public void mo24851a(C6154a aVar) {
        this.f17159h = aVar;
    }

    /* renamed from: b */
    public void mo24855b(String str) {
        this.f17154c = str;
    }

    /* renamed from: c */
    public void mo24858c(String str) {
        this.f17155d = str;
    }

    /* renamed from: d */
    public void mo24860d(String str) {
        this.f17156e = str;
    }

    /* renamed from: a */
    public void mo24852a(String str) {
        this.f17153b = str;
    }

    /* renamed from: b */
    public void mo24856b(List<Integer> list) {
        if (list != null && list.size() > 0) {
            this.f17158g.addAll(list);
        }
    }

    /* renamed from: a */
    public void mo24853a(List<Integer> list) {
        if (list != null && list.size() > 0) {
            this.f17157f.addAll(list);
        }
    }
}
