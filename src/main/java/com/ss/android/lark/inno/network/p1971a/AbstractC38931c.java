package com.ss.android.lark.inno.network.p1971a;

import com.larksuite.framework.http.request.AbstractC26011b;
import com.larksuite.framework.http.request.C26010a;
import com.larksuite.framework.http.request.HttpMethod;
import com.larksuite.framework.http.request.HttpParams;
import com.larksuite.framework.http.request.RequestBody;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.mm.depend.C45899c;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.ss.android.lark.inno.network.a.c */
public abstract class AbstractC38931c<T> extends C26010a<T> {

    /* renamed from: a */
    protected String f100023a;

    @Override // com.larksuite.framework.http.request.C26010a
    /* renamed from: b */
    public abstract String mo92478b();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public RequestBody mo142527l() {
        return null;
    }

    /* renamed from: o */
    public abstract HttpMethod mo142530o();

    /* renamed from: m */
    public Map<String, String> mo142528m() {
        return Collections.EMPTY_MAP;
    }

    /* renamed from: n */
    public Map<String, String> mo142529n() {
        return Collections.EMPTY_MAP;
    }

    /* renamed from: p */
    private void m153645p() {
        mo92473a("Cookie", "session=" + C45899c.m181859a().getLoginDepend().mo144652d());
        mo92473a("user-agent", C45899c.m181859a().getHostDepend().mo144638f());
        mo92473a("platform", "android");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public AbstractC38931c<T> mo142526k() {
        HttpMethod httpMethod;
        if (mo142530o() != null) {
            httpMethod = mo142530o();
        } else {
            httpMethod = HttpMethod.GET;
        }
        mo92469a(httpMethod);
        m153645p();
        if (!CollectionUtils.isEmpty(mo142529n())) {
            for (Map.Entry<String, String> entry : mo142529n().entrySet()) {
                mo92473a(entry.getKey(), entry.getValue());
            }
        }
        HttpParams i = mo92487i();
        if (!CollectionUtils.isEmpty(mo142528m())) {
            for (Map.Entry<String, String> entry2 : mo142528m().entrySet()) {
                i.urlParamsMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        mo92470a(i);
        RequestBody l = mo142527l();
        if (l != null) {
            mo92476b(l);
        }
        return this;
    }

    /* renamed from: b */
    public void mo142525b(AbstractC26011b bVar) {
        mo142526k();
        mo92475a(bVar);
    }

    public AbstractC38931c(String str) {
        this.f100023a = str;
        mo92477b(str);
        mo92479c(mo92478b());
    }
}
