package com.bytedance.ee.bear.list.cache;

import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.list.dto.Document;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.cache.o */
public class C8213o {

    /* renamed from: a */
    private String f22121a;

    /* renamed from: b */
    private String f22122b;

    /* renamed from: c */
    private String f22123c;

    /* renamed from: d */
    private String f22124d;

    /* renamed from: e */
    private int f22125e;

    /* renamed from: f */
    private String f22126f;

    /* renamed from: g */
    private boolean f22127g;

    /* renamed from: h */
    private String f22128h;

    /* renamed from: i */
    private String f22129i;

    /* renamed from: j */
    private int f22130j;

    /* renamed from: k */
    private String f22131k;

    /* renamed from: l */
    private String f22132l;

    /* renamed from: m */
    private String f22133m;

    /* renamed from: n */
    private String f22134n;

    /* renamed from: o */
    private boolean f22135o;

    /* renamed from: p */
    private String f22136p;

    /* renamed from: q */
    private int f22137q;

    /* renamed from: r */
    private int f22138r;

    /* renamed from: a */
    public String mo32176a() {
        return this.f22121a;
    }

    /* renamed from: b */
    public String mo32180b() {
        return this.f22122b;
    }

    /* renamed from: c */
    public String mo32184c() {
        return this.f22123c;
    }

    /* renamed from: d */
    public String mo32187d() {
        return this.f22124d;
    }

    /* renamed from: e */
    public int mo32190e() {
        return this.f22125e;
    }

    /* renamed from: f */
    public String mo32192f() {
        return this.f22126f;
    }

    /* renamed from: h */
    public String mo32196h() {
        return this.f22128h;
    }

    /* renamed from: i */
    public String mo32198i() {
        return this.f22129i;
    }

    /* renamed from: j */
    public int mo32200j() {
        return this.f22130j;
    }

    /* renamed from: k */
    public String mo32202k() {
        return this.f22131k;
    }

    /* renamed from: l */
    public String mo32204l() {
        return this.f22132l;
    }

    /* renamed from: m */
    public String mo32206m() {
        return this.f22133m;
    }

    /* renamed from: n */
    public String mo32207n() {
        return this.f22134n;
    }

    /* renamed from: o */
    public boolean mo32208o() {
        return this.f22135o;
    }

    /* renamed from: p */
    public String mo32209p() {
        return this.f22136p;
    }

    /* renamed from: q */
    public int mo32210q() {
        return this.f22137q;
    }

    /* renamed from: r */
    public int mo32211r() {
        return this.f22138r;
    }

    /* renamed from: g */
    public boolean mo32195g() {
        return this.f22127g;
    }

    /* renamed from: g */
    public void mo32194g(String str) {
        this.f22129i = str;
    }

    /* renamed from: a */
    public void mo32177a(int i) {
        this.f22125e = i;
    }

    /* renamed from: b */
    public void mo32181b(int i) {
        this.f22130j = i;
    }

    /* renamed from: c */
    public void mo32185c(int i) {
        this.f22137q = i;
    }

    /* renamed from: d */
    public void mo32188d(int i) {
        this.f22138r = i;
    }

    /* renamed from: e */
    public void mo32191e(String str) {
        this.f22126f = str;
    }

    /* renamed from: f */
    public void mo32193f(String str) {
        this.f22128h = str;
    }

    /* renamed from: h */
    public void mo32197h(String str) {
        this.f22131k = str;
    }

    /* renamed from: i */
    public void mo32199i(String str) {
        this.f22132l = str;
    }

    /* renamed from: j */
    public void mo32201j(String str) {
        this.f22133m = str;
    }

    /* renamed from: k */
    public void mo32203k(String str) {
        this.f22134n = str;
    }

    /* renamed from: l */
    public void mo32205l(String str) {
        this.f22136p = str;
    }

    /* renamed from: a */
    public void mo32178a(String str) {
        this.f22121a = str;
    }

    /* renamed from: b */
    public void mo32182b(String str) {
        this.f22122b = str;
    }

    /* renamed from: c */
    public void mo32186c(String str) {
        this.f22123c = str;
    }

    /* renamed from: d */
    public void mo32189d(String str) {
        this.f22124d = str;
    }

    /* renamed from: a */
    public void mo32179a(boolean z) {
        this.f22127g = z;
    }

    /* renamed from: b */
    public void mo32183b(boolean z) {
        this.f22135o = z;
    }

    /* renamed from: a */
    public static ArrayList<Document> m33656a(List<C8213o> list) {
        ArrayList<Document> arrayList = new ArrayList<>();
        if (list == null) {
            return arrayList;
        }
        for (C8213o oVar : list) {
            if (oVar != null) {
                arrayList.add(m33654a(oVar));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static ArrayList<C8213o> m33657b(List<Document> list) {
        ArrayList<C8213o> arrayList = new ArrayList<>();
        if (list == null) {
            return arrayList;
        }
        for (Document document : list) {
            if (document != null) {
                arrayList.add(m33655a((WikiDocument) document));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static WikiDocument m33654a(C8213o oVar) {
        if (oVar == null) {
            return null;
        }
        WikiDocument wikiDocument = new WikiDocument();
        wikiDocument.mo32376B(oVar.mo32176a());
        wikiDocument.mo21005a(oVar.mo32190e());
        wikiDocument.mo32443g(oVar.mo32184c());
        wikiDocument.mo32380D(oVar.mo32187d());
        wikiDocument.mo21007a(oVar.mo32192f());
        wikiDocument.mo32412a(oVar.mo32195g());
        wikiDocument.mo32476p(oVar.mo32196h());
        wikiDocument.mo21010b(oVar.mo32198i());
        wikiDocument.mo32451i(oVar.mo32202k());
        wikiDocument.mo32433d(oVar.mo32200j());
        wikiDocument.mo21012c(oVar.f22137q);
        WikiDocument.SpaceCover spaceCover = new WikiDocument.SpaceCover();
        spaceCover.mo21027a(oVar.mo32204l());
        spaceCover.mo21030b(oVar.mo32206m());
        spaceCover.mo21033d(oVar.mo32209p());
        spaceCover.mo21028a(oVar.mo32208o());
        spaceCover.mo21032c(oVar.mo32207n());
        wikiDocument.mo21006a(spaceCover);
        return wikiDocument;
    }

    /* renamed from: a */
    private static C8213o m33655a(WikiDocument wikiDocument) {
        if (wikiDocument == null) {
            return null;
        }
        C8213o oVar = new C8213o();
        oVar.mo32178a(wikiDocument.mo32399O());
        oVar.mo32177a(wikiDocument.mo21004a());
        oVar.mo32186c(wikiDocument.mo32469n());
        oVar.mo32189d(wikiDocument.mo32403S());
        oVar.mo32179a(wikiDocument.mo32456j());
        oVar.mo32193f(wikiDocument.mo32492x());
        oVar.mo32194g(wikiDocument.mo21011c());
        oVar.mo32197h(wikiDocument.mo32472o());
        oVar.mo32191e(wikiDocument.mo21008b());
        oVar.mo32181b(wikiDocument.mo32483t());
        oVar.mo32185c(wikiDocument.mo21019g());
        if (wikiDocument.mo21014d() != null) {
            oVar.mo32199i(wikiDocument.mo21014d().mo21026a());
            oVar.mo32201j(wikiDocument.mo21014d().mo21029b());
            oVar.mo32205l(wikiDocument.mo21014d().mo21036e());
            oVar.mo32183b(wikiDocument.mo21014d().mo21034d());
            oVar.mo32203k(wikiDocument.mo21014d().mo21031c());
        }
        return oVar;
    }
}
