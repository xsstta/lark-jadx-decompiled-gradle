package com.bytedance.ee.bear.list.cache;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.list.dto.Document;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.cache.k */
public class C8202k {

    /* renamed from: a */
    private String f22092a;

    /* renamed from: b */
    private String f22093b;

    /* renamed from: c */
    private String f22094c;

    /* renamed from: d */
    private String f22095d;

    /* renamed from: e */
    private String f22096e;

    /* renamed from: f */
    private String f22097f;

    /* renamed from: g */
    private String f22098g;

    /* renamed from: h */
    private String f22099h;

    /* renamed from: i */
    private String f22100i;

    /* renamed from: j */
    private String f22101j;

    /* renamed from: k */
    private String f22102k;

    /* renamed from: l */
    private String f22103l;

    /* renamed from: m */
    private int f22104m;

    /* renamed from: n */
    private int f22105n;

    /* renamed from: a */
    public String mo32136a() {
        return this.f22092a;
    }

    /* renamed from: b */
    public String mo32139b() {
        return this.f22093b;
    }

    /* renamed from: c */
    public String mo32142c() {
        return this.f22094c;
    }

    /* renamed from: d */
    public String mo32144d() {
        return this.f22095d;
    }

    /* renamed from: e */
    public String mo32146e() {
        return this.f22096e;
    }

    /* renamed from: f */
    public String mo32149f() {
        return this.f22097f;
    }

    /* renamed from: g */
    public String mo32151g() {
        return this.f22098g;
    }

    /* renamed from: h */
    public String mo32153h() {
        return this.f22099h;
    }

    /* renamed from: i */
    public String mo32155i() {
        return this.f22100i;
    }

    /* renamed from: j */
    public String mo32157j() {
        return this.f22101j;
    }

    /* renamed from: k */
    public String mo32159k() {
        return this.f22102k;
    }

    /* renamed from: l */
    public String mo32161l() {
        return this.f22103l;
    }

    /* renamed from: m */
    public int mo32163m() {
        return this.f22104m;
    }

    /* renamed from: n */
    public int mo32164n() {
        return this.f22105n;
    }

    public String toString() {
        return "RecentDoc{, wiki_token='" + this.f22092a + '\'' + ", space_id='" + this.f22093b + '\'' + ", title='" + this.f22096e + '\'' + ", cacheStatus='" + this.f22105n + '\'' + '}';
    }

    /* renamed from: a */
    public void mo32137a(int i) {
        this.f22104m = i;
    }

    /* renamed from: b */
    public void mo32140b(int i) {
        this.f22105n = i;
    }

    /* renamed from: c */
    public void mo32143c(String str) {
        this.f22094c = str;
    }

    /* renamed from: d */
    public void mo32145d(String str) {
        this.f22095d = str;
    }

    /* renamed from: e */
    public void mo32147e(String str) {
        this.f22096e = str;
    }

    /* renamed from: f */
    public void mo32150f(String str) {
        this.f22097f = str;
    }

    /* renamed from: g */
    public void mo32152g(String str) {
        this.f22098g = str;
    }

    /* renamed from: h */
    public void mo32154h(String str) {
        this.f22099h = str;
    }

    /* renamed from: i */
    public void mo32156i(String str) {
        this.f22100i = str;
    }

    /* renamed from: j */
    public void mo32158j(String str) {
        this.f22101j = str;
    }

    /* renamed from: k */
    public void mo32160k(String str) {
        this.f22102k = str;
    }

    /* renamed from: l */
    public void mo32162l(String str) {
        this.f22103l = str;
    }

    /* renamed from: a */
    public void mo32138a(String str) {
        this.f22092a = str;
    }

    /* renamed from: b */
    public void mo32141b(String str) {
        this.f22093b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.f22092a, ((C8202k) obj).f22092a);
    }

    /* renamed from: a */
    public static ArrayList<C8202k> m33599a(ArrayList<WikiDocument> arrayList) {
        ArrayList<C8202k> arrayList2 = new ArrayList<>();
        if (CollectionUtils.isEmpty(arrayList)) {
            return arrayList2;
        }
        Iterator<WikiDocument> it = arrayList.iterator();
        while (it.hasNext()) {
            WikiDocument next = it.next();
            if (next != null) {
                arrayList2.add(m33598a(next));
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    public static WikiDocument m33597a(C8202k kVar) {
        WikiDocument wikiDocument = new WikiDocument();
        wikiDocument.mo32443g(kVar.mo32146e());
        wikiDocument.mo32433d(kVar.mo32163m());
        wikiDocument.mo32434d(kVar.mo32149f());
        wikiDocument.mo32470n(kVar.mo32151g());
        wikiDocument.mo32473o(kVar.mo32153h());
        wikiDocument.mo32459k(kVar.mo32155i());
        wikiDocument.mo32462l(kVar.mo32157j());
        wikiDocument.mo21010b(kVar.mo32136a());
        wikiDocument.mo32451i(kVar.mo32161l());
        wikiDocument.mo32476p(kVar.mo32142c());
        wikiDocument.mo32467m(kVar.mo32159k());
        wikiDocument.mo32431b(C8212n.m33653a(kVar.mo32164n()));
        wikiDocument.mo21013c(kVar.mo32139b());
        wikiDocument.mo21009b(kVar.mo32164n());
        return wikiDocument;
    }

    /* renamed from: a */
    public static C8202k m33598a(WikiDocument wikiDocument) {
        if (wikiDocument == null) {
            return null;
        }
        C8202k kVar = new C8202k();
        kVar.mo32138a(wikiDocument.mo21011c());
        kVar.mo32162l(wikiDocument.mo32472o());
        kVar.mo32137a(wikiDocument.mo32483t());
        kVar.mo32141b(wikiDocument.mo32399O());
        kVar.mo32143c(wikiDocument.mo32492x());
        kVar.mo32145d("");
        kVar.mo32147e(wikiDocument.mo32469n());
        kVar.mo32150f(wikiDocument.mo32457k());
        kVar.mo32152g(wikiDocument.mo32488v());
        kVar.mo32154h(wikiDocument.mo32490w());
        kVar.mo32156i(wikiDocument.mo32477q());
        kVar.mo32158j(wikiDocument.mo32479r());
        kVar.mo32160k(wikiDocument.mo32481s());
        kVar.mo32141b(wikiDocument.mo21016e());
        kVar.mo32140b(wikiDocument.mo21018f());
        return kVar;
    }

    /* renamed from: a */
    public static ArrayList<Document> m33600a(List<C8202k> list) {
        ArrayList<Document> arrayList = new ArrayList<>();
        if (list != null && !list.isEmpty()) {
            for (C8202k kVar : list) {
                if (kVar != null) {
                    arrayList.add(m33597a(kVar));
                }
            }
        }
        return arrayList;
    }
}
