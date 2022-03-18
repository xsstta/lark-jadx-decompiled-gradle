package com.bytedance.ee.bear.bitable.card.model.stmodel;

import android.text.TextUtils;
import com.bytedance.ee.bear.bitable.card.model.enums.ECardType;
import com.bytedance.ee.bear.bitable.card.model.enums.ETableType;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4533g;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.bitable.card.model.stmodel.b */
public class C4535b {

    /* renamed from: a */
    private String f13335a;

    /* renamed from: b */
    private String f13336b;

    /* renamed from: c */
    private String f13337c;

    /* renamed from: d */
    private ECardType f13338d;

    /* renamed from: e */
    private C4536c f13339e;

    /* renamed from: f */
    private Map<String, C4533g> f13340f;

    /* renamed from: g */
    private String f13341g;

    /* renamed from: h */
    private String f13342h;

    /* renamed from: i */
    private List<C4525a> f13343i;

    /* renamed from: j */
    private String f13344j;

    /* renamed from: k */
    private int f13345k;

    /* renamed from: l */
    private boolean f13346l;

    /* renamed from: m */
    private boolean f13347m;

    /* renamed from: n */
    private boolean f13348n;

    /* renamed from: o */
    private ETableType f13349o = ETableType.NORMAL;

    /* renamed from: a */
    public String mo17757a() {
        return this.f13335a;
    }

    /* renamed from: b */
    public String mo17767b() {
        return this.f13336b;
    }

    /* renamed from: c */
    public String mo17770c() {
        return this.f13337c;
    }

    /* renamed from: d */
    public ECardType mo17773d() {
        return this.f13338d;
    }

    /* renamed from: e */
    public C4536c mo17775e() {
        return this.f13339e;
    }

    /* renamed from: f */
    public Map<String, C4533g> mo17777f() {
        return this.f13340f;
    }

    /* renamed from: g */
    public String mo17780g() {
        return this.f13341g;
    }

    /* renamed from: h */
    public String mo17782h() {
        return this.f13342h;
    }

    /* renamed from: i */
    public List<C4525a> mo17784i() {
        return this.f13343i;
    }

    /* renamed from: j */
    public String mo17785j() {
        return this.f13344j;
    }

    /* renamed from: k */
    public int mo17786k() {
        return this.f13345k;
    }

    /* renamed from: l */
    public boolean mo17787l() {
        return this.f13346l;
    }

    /* renamed from: m */
    public ETableType mo17788m() {
        return this.f13349o;
    }

    /* renamed from: n */
    public boolean mo17789n() {
        return this.f13348n;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (mo17757a() != null) {
            i = mo17757a().hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        if (mo17767b() != null) {
            i2 = mo17767b().hashCode();
        }
        return i3 + i2;
    }

    /* renamed from: o */
    public int mo17790o() {
        if (this.f13343i != null) {
            for (int i = 0; i < this.f13343i.size(); i++) {
                if (TextUtils.equals(this.f13344j, this.f13343i.get(i).mo17707b())) {
                    return i;
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    public void mo17758a(int i) {
        this.f13345k = i;
    }

    /* renamed from: b */
    public void mo17768b(String str) {
        this.f13336b = str;
    }

    /* renamed from: c */
    public void mo17771c(String str) {
        this.f13337c = str;
    }

    /* renamed from: d */
    public void mo17774d(String str) {
        this.f13341g = str;
    }

    /* renamed from: e */
    public void mo17776e(String str) {
        this.f13342h = str;
    }

    /* renamed from: f */
    public void mo17778f(String str) {
        this.f13344j = str;
    }

    /* renamed from: a */
    public void mo17759a(ECardType eCardType) {
        this.f13338d = eCardType;
    }

    /* renamed from: b */
    public void mo17769b(boolean z) {
        this.f13347m = z;
    }

    /* renamed from: c */
    public void mo17772c(boolean z) {
        this.f13348n = z;
    }

    /* renamed from: g */
    public C4533g mo17779g(String str) {
        Map<String, C4533g> map = this.f13340f;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public void mo17760a(ETableType eTableType) {
        this.f13349o = eTableType;
    }

    /* renamed from: a */
    public void mo17762a(C4536c cVar) {
        this.f13339e = cVar;
    }

    /* renamed from: h */
    public C4525a mo17781h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (C4525a aVar : this.f13343i) {
            if (TextUtils.equals(aVar.mo17707b(), str)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo17761a(C4535b bVar) {
        mo17763a(bVar.f13335a);
        mo17768b(bVar.f13336b);
        mo17771c(bVar.f13337c);
        mo17759a(bVar.f13338d);
        mo17762a(bVar.f13339e);
        mo17765a(bVar.f13340f);
        mo17774d(bVar.f13341g);
        mo17776e(bVar.f13342h);
        mo17764a(bVar.f13343i);
        mo17778f(bVar.f13344j);
        mo17758a(bVar.f13345k);
        mo17766a(bVar.f13346l);
        mo17760a(bVar.f13349o);
    }

    /* renamed from: a */
    public void mo17763a(String str) {
        this.f13335a = str;
    }

    /* renamed from: a */
    public void mo17764a(List<C4525a> list) {
        this.f13343i = list;
    }

    /* renamed from: a */
    public void mo17765a(Map<String, C4533g> map) {
        this.f13340f = map;
    }

    /* renamed from: a */
    public void mo17766a(boolean z) {
        this.f13346l = z;
    }

    public C4535b(String str, String str2) {
        this.f13335a = str;
        this.f13336b = str2;
    }
}
