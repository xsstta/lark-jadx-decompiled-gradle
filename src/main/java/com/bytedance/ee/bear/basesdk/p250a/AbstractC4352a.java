package com.bytedance.ee.bear.basesdk.p250a;

import com.bytedance.ee.bear.abtest.service.AbstractC4155a;
import com.bytedance.ee.bear.contract.AbstractC5114b;
import com.bytedance.ee.bear.contract.AbstractC5124d;
import com.bytedance.ee.bear.contract.AbstractC5170f;
import com.bytedance.ee.bear.contract.AbstractC5173g;
import com.bytedance.ee.bear.contract.AbstractC5214r;
import com.bytedance.ee.bear.contract.AbstractC5232w;
import com.bytedance.ee.bear.contract.darkmode.AbstractC5126a;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5196a;
import com.bytedance.ee.bear.domain.AbstractC6304b;
import com.bytedance.ee.bear.drive.services.AbstractC7173a;
import com.bytedance.ee.bear.drive.services.AbstractC7174b;
import com.bytedance.ee.bear.drive.services.AbstractC7180h;
import com.bytedance.ee.bear.notification.AbstractC10317b;
import com.bytedance.ee.bear.service.AbstractC10928d;
import com.bytedance.ee.bear.service.base.AbstractC10913a;
import com.bytedance.ee.bear.todocenter.push.AbstractC11708a;
import com.bytedance.ee.bear.wiki.AbstractC11902a;
import com.bytedance.ee.bear.wiki.AbstractC11904b;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.AbstractC12447a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.basesdk.a.a */
public abstract class AbstractC4352a implements AbstractC10928d {
    @Override // com.bytedance.ee.bear.service.AbstractC10928d
    /* renamed from: a */
    public <T extends AbstractC10913a> String mo16985a(Class<T> cls) {
        return null;
    }

    /* renamed from: b */
    public abstract AbstractC6304b mo16987b();

    /* renamed from: c */
    public abstract AbstractC5114b mo16988c();

    /* renamed from: d */
    public abstract AbstractC5214r mo16989d();

    /* renamed from: e */
    public abstract AbstractC5173g mo16990e();

    /* renamed from: f */
    public abstract AbstractC5170f mo16991f();

    /* renamed from: g */
    public abstract AbstractC5124d mo16992g();

    /* renamed from: h */
    public abstract AbstractC5232w mo16993h();

    /* renamed from: i */
    public abstract AbstractC5196a mo16994i();

    /* renamed from: j */
    public abstract AbstractC4155a mo16995j();

    /* renamed from: k */
    public abstract AbstractC11708a mo16996k();

    /* renamed from: l */
    public abstract AbstractC5126a mo16997l();

    /* renamed from: m */
    public abstract AbstractC7180h mo16998m();

    /* renamed from: n */
    public abstract AbstractC7173a mo16999n();

    /* renamed from: o */
    public abstract AbstractC7174b mo17000o();

    /* renamed from: p */
    public abstract AbstractC10317b mo17001p();

    /* renamed from: q */
    public abstract AbstractC11904b mo17002q();

    /* renamed from: r */
    public abstract AbstractC11902a mo17003r();

    /* renamed from: s */
    public abstract AbstractC12447a mo17004s();

    @Override // com.bytedance.ee.bear.service.AbstractC10928d
    /* renamed from: a */
    public List<AbstractC10913a> mo16986a() {
        ArrayList arrayList = new ArrayList();
        AbstractC6304b b = mo16987b();
        if (b != null) {
            arrayList.add(b);
        }
        AbstractC5114b c = mo16988c();
        if (c != null) {
            arrayList.add(c);
        }
        AbstractC5214r d = mo16989d();
        if (d != null) {
            arrayList.add(d);
        }
        AbstractC5173g e = mo16990e();
        if (e != null) {
            arrayList.add(e);
        }
        AbstractC5170f f = mo16991f();
        if (f != null) {
            arrayList.add(f);
        }
        AbstractC5124d g = mo16992g();
        if (g != null) {
            arrayList.add(g);
        }
        AbstractC5232w h = mo16993h();
        if (h != null) {
            arrayList.add(h);
        }
        AbstractC5196a i = mo16994i();
        if (i != null) {
            arrayList.add(i);
        }
        AbstractC4155a j = mo16995j();
        if (j != null) {
            arrayList.add(j);
        }
        AbstractC11708a k = mo16996k();
        if (k != null) {
            arrayList.add(k);
        }
        AbstractC5126a l = mo16997l();
        if (l != null) {
            arrayList.add(l);
        }
        AbstractC7180h m = mo16998m();
        if (m != null) {
            arrayList.add(m);
        }
        AbstractC7173a n = mo16999n();
        if (n != null) {
            arrayList.add(n);
        }
        AbstractC7174b o = mo17000o();
        if (o != null) {
            arrayList.add(o);
        }
        AbstractC10317b p = mo17001p();
        if (p != null) {
            arrayList.add(p);
        }
        AbstractC11904b q = mo17002q();
        if (q != null) {
            arrayList.add(q);
        }
        AbstractC11902a r = mo17003r();
        if (r != null) {
            arrayList.add(r);
        }
        AbstractC12447a s = mo17004s();
        if (s != null) {
            arrayList.add(s);
        }
        return arrayList;
    }
}
