package com.larksuite.component.dybrid.h5core.core.impl;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.larksuite.component.dybrid.h5api.api.AbstractC24163f;
import com.larksuite.component.dybrid.h5api.api.AbstractC24166i;
import com.larksuite.component.dybrid.h5api.api.AbstractC24168k;
import com.larksuite.component.dybrid.h5api.api.AbstractC24169l;
import com.larksuite.component.dybrid.h5api.api.AbstractC24171m;
import com.larksuite.component.dybrid.h5api.api.AbstractC24172n;
import com.larksuite.component.dybrid.h5api.api.C24160c;
import com.larksuite.component.dybrid.h5api.api.C24162e;
import com.larksuite.component.dybrid.h5api.api.H5PluginConfig;
import com.larksuite.component.dybrid.h5api.p1070a.AbstractC24153a;
import com.larksuite.component.dybrid.h5api.p1070a.AbstractC24154b;
import com.larksuite.component.dybrid.h5api.p1071b.C24173a;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5api.p1071b.C24177d;
import com.larksuite.component.dybrid.h5core.core.AbstractC24198a;
import com.larksuite.component.dybrid.h5core.core.C24203c;
import com.larksuite.component.dybrid.h5core.core.p1075a.AbstractC24200a;
import com.larksuite.component.dybrid.h5core.p1073b.C24189a;
import com.larksuite.component.dybrid.h5core.p1074c.C24195a;
import com.larksuite.component.dybrid.h5core.p1076d.C24212a;
import com.larksuite.component.dybrid.h5core.p1079g.C24218a;
import com.larksuite.component.dybrid.h5core.p1079g.C24244e;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.AbstractC48759a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* renamed from: com.larksuite.component.dybrid.h5core.core.impl.e */
public class C24210e extends AbstractC24198a implements AbstractC24200a {

    /* renamed from: c */
    private static C24210e f59842c;

    /* renamed from: d */
    private AbstractC24153a f59843d;

    /* renamed from: e */
    private AbstractC24154b f59844e;

    /* renamed from: f */
    private final Stack<AbstractC24172n> f59845f = new Stack<>();

    /* renamed from: g */
    private boolean f59846g;

    /* renamed from: h */
    public AbstractC24154b mo86847h() {
        if (this.f59844e == null) {
            this.f59844e = new AbstractC24154b() {
                /* class com.larksuite.component.dybrid.h5core.core.impl.C24210e.C242111 */

                @Override // com.larksuite.component.dybrid.h5api.p1070a.AbstractC24154b
                /* renamed from: a */
                public void mo86699a(int i, String str) {
                }
            };
        }
        return this.f59844e;
    }

    private C24210e() {
        this.f59812a = new C24195a();
    }

    /* renamed from: g */
    public static C24210e m88437g() {
        if (f59842c == null) {
            synchronized (C24210e.class) {
                if (f59842c == null) {
                    f59842c = new C24210e();
                }
            }
        }
        return f59842c;
    }

    @Override // com.larksuite.component.dybrid.h5core.core.p1075a.AbstractC24200a
    /* renamed from: e */
    public boolean mo86826e() {
        Iterator<AbstractC24172n> it = this.f59845f.iterator();
        while (it.hasNext()) {
            it.next().mo86767f();
        }
        return true;
    }

    @Override // com.larksuite.component.dybrid.h5core.core.p1075a.AbstractC24200a
    /* renamed from: f */
    public AbstractC24172n mo86827f() {
        synchronized (this.f59845f) {
            if (this.f59845f.isEmpty()) {
                return null;
            }
            return this.f59845f.peek();
        }
    }

    /* renamed from: i */
    private void m88438i() {
        AbstractC24171m n = mo86816n();
        n.mo86762a(new C24244e());
        n.mo86762a(new C24218a());
        AbstractC24169l a = C24189a.m88341a().mo86795a(H5PluginConfig.Scope.SERVICE, n);
        if (a != null) {
            n.mo86762a(a);
        }
    }

    @Override // com.larksuite.component.dybrid.h5core.core.p1075a.AbstractC24200a
    /* renamed from: a */
    public void mo86821a(AbstractC24153a aVar) {
        this.f59843d = aVar;
    }

    @Override // com.larksuite.component.dybrid.h5core.core.p1075a.AbstractC24200a
    /* renamed from: a */
    public void mo86822a(AbstractC24154b bVar) {
        this.f59844e = bVar;
    }

    @Override // com.larksuite.component.dybrid.h5core.core.p1075a.AbstractC24200a
    /* renamed from: a */
    public Map<String, AbstractC48759a<String>> mo86819a(AbstractC24168k kVar) {
        return C24189a.m88341a().mo86796a(kVar);
    }

    /* renamed from: a */
    public AbstractC24172n mo86844a(String str) {
        AbstractC24172n nVar;
        synchronized (this.f59845f) {
            Iterator<AbstractC24172n> it = this.f59845f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    nVar = null;
                    break;
                }
                nVar = it.next();
                if (str.equals(nVar.mo86766e())) {
                    break;
                }
            }
        }
        if (nVar != null) {
            return nVar;
        }
        C24209d dVar = new C24209d();
        dVar.mo86763a(str);
        mo86845a((AbstractC24172n) dVar);
        return dVar;
    }

    /* renamed from: b */
    public boolean mo86846b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        synchronized (this.f59845f) {
            Iterator<AbstractC24172n> it = this.f59845f.iterator();
            while (it.hasNext()) {
                AbstractC24172n next = it.next();
                if (str.equals(next.mo86766e())) {
                    it.remove();
                    next.mo86735a((AbstractC24163f) null);
                    next.mo86749d();
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.larksuite.component.dybrid.h5core.core.p1075a.AbstractC24200a
    /* renamed from: a */
    public void mo86823a(H5PluginConfig h5PluginConfig) {
        C24189a.m88341a().mo86797a(h5PluginConfig);
    }

    /* renamed from: a */
    public boolean mo86845a(AbstractC24172n nVar) {
        if (nVar == null) {
            return false;
        }
        synchronized (this.f59845f) {
            Iterator<AbstractC24172n> it = this.f59845f.iterator();
            while (it.hasNext()) {
                if (it.next().equals(nVar)) {
                    return false;
                }
            }
            nVar.mo86735a(this);
            this.f59845f.add(nVar);
            return true;
        }
    }

    @Override // com.larksuite.component.dybrid.h5core.core.p1075a.AbstractC24200a
    /* renamed from: a */
    public void mo86820a(Context context, AbstractC24166i iVar) {
        C24212a.m88456a(context, iVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC24169l.C24170a.f59767q);
        arrayList.add(AbstractC24169l.C24170a.f59768r);
        arrayList.add(AbstractC24169l.C24170a.f59769s);
        arrayList.add(AbstractC24169l.C24170a.f59770t);
        arrayList.add(AbstractC24169l.C24170a.f59771u);
        arrayList.add(AbstractC24169l.C24170a.f59761k);
        arrayList.add(AbstractC24169l.C24170a.f59762l);
        arrayList.add(AbstractC24169l.C24170a.f59763m);
        arrayList.add(AbstractC24169l.C24170a.f59764n);
        arrayList.add(AbstractC24169l.C24170a.f59765o);
        arrayList.add(AbstractC24169l.C24170a.f59766p);
        arrayList.add(AbstractC24169l.C24170a.f59772v);
        arrayList.add(AbstractC24169l.C24170a.f59773w);
        arrayList.add(AbstractC24169l.C24170a.f59774x);
        arrayList.add(AbstractC24169l.C24170a.f59760j);
        arrayList.add(AbstractC24169l.C24170a.f59751a);
        arrayList.add(AbstractC24169l.C24170a.f59752b);
        arrayList.add(AbstractC24169l.C24170a.f59759i);
        arrayList.add("h5ExtEvent");
        C24189a.m88341a().mo86798a(arrayList);
    }

    @Override // com.larksuite.component.dybrid.h5core.core.p1075a.AbstractC24200a
    /* renamed from: b */
    public Fragment mo86825b(C24162e eVar, C24160c cVar) {
        if (this.f59843d == null) {
            C24174b.m88301c("LKH5ServiceImpl", "invalid listener!!");
            return null;
        }
        if (!this.f59846g) {
            m88438i();
            this.f59846g = true;
        }
        if (eVar == null || eVar.mo86731a() == null) {
            C24174b.m88301c("LKH5ServiceImpl", "invalid h5 context!");
            return null;
        } else if (!(eVar.mo86731a() instanceof Activity)) {
            C24174b.m88301c("LKH5ServiceImpl", "not activity context!");
            return null;
        } else {
            Bundle a = cVar.mo86729a();
            C24212a.m88457a(a);
            Bundle a2 = C24203c.m88400a().mo86831a(a, true);
            C24174b.m88296a("LKH5ServiceImpl", "params:" + a2.toString());
            return this.f59843d.mo86698b(eVar.mo86731a(), a2);
        }
    }

    @Override // com.larksuite.component.dybrid.h5core.core.p1075a.AbstractC24200a
    /* renamed from: a */
    public WebResourceResponse mo86817a(String str, String str2) {
        String str3;
        Uri parse = Uri.parse(str2);
        if ("YES".equalsIgnoreCase(C24177d.m88307a(parse, "dynamic_hip"))) {
            str3 = parse.getHost() + parse.getPath();
        } else {
            str3 = parse.getPath();
        }
        Log.m165379d("LKH5ServiceImpl", "shouldInterceptRequest fakePath:" + str3);
        String str4 = str + str3;
        C24174b.m88296a("LKH5ServiceImpl", "getOfflineResByPath realFilePath:" + str4);
        if (C24173a.m88292d(str4)) {
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(str4));
                String e = C24173a.m88293e(str4);
                C24174b.m88296a("LKH5ServiceImpl", "getOfflineResByPath fileName:" + e);
                String c = C24173a.m88291c(e);
                C24174b.m88296a("LKH5ServiceImpl", "getOfflineResByPath mimeType:" + c);
                return new WebResourceResponse(c, "UTF-8", fileInputStream);
            } catch (FileNotFoundException e2) {
                mo86847h().mo86699a(-1, e2.getMessage());
                C24174b.m88297a("LKH5ServiceImpl", "FileNotFoundException", e2);
                return null;
            }
        } else {
            mo86847h().mo86699a(-1, "realFilePath is not File");
            return null;
        }
    }

    @Override // com.larksuite.component.dybrid.h5core.core.p1075a.AbstractC24200a
    /* renamed from: a */
    public boolean mo86824a(C24162e eVar, C24160c cVar) {
        if (this.f59843d == null) {
            return false;
        }
        if (!this.f59846g) {
            m88438i();
            this.f59846g = true;
        }
        Bundle a = cVar.mo86729a();
        C24212a.m88457a(a);
        Bundle a2 = C24203c.m88400a().mo86831a(a, true);
        C24174b.m88296a("LKH5ServiceImpl", "params:" + a2.toString());
        this.f59843d.mo86697a(eVar.mo86731a(), a2);
        return true;
    }

    @Override // com.larksuite.component.dybrid.h5core.core.p1075a.AbstractC24200a
    /* renamed from: a */
    public AbstractC24168k mo86818a(C24162e eVar, C24160c cVar, WebView webView) {
        return new C24205b((Activity) eVar.mo86731a(), cVar.mo86729a(), webView);
    }
}
