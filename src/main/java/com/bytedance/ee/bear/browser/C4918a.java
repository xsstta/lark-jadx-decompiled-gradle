package com.bytedance.ee.bear.browser;

import android.content.Context;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.log.C13479a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.ee.bear.browser.a */
public class C4918a implements AbstractC4934l {

    /* renamed from: a */
    private AbstractC4931i f14466a;

    /* renamed from: b */
    private boolean f14467b;

    /* renamed from: c */
    private AbstractC4928g f14468c;

    /* renamed from: d */
    private Set<String> f14469d = new HashSet();

    /* renamed from: c */
    public boolean mo19347c() {
        return this.f14467b;
    }

    /* renamed from: b */
    public Context mo19345b() {
        AbstractC4931i a = mo19339a();
        if (a != null) {
            return a.mo19421a();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC4931i mo19339a() {
        if (this.f14466a == null) {
            C13479a.m54759a("BaseWebService", "", new IllegalStateException("Web not attached or detached !"));
        }
        return this.f14466a;
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4934l
    /* renamed from: a */
    public void mo19341a(AbstractC4931i iVar) {
        for (String str : this.f14469d) {
            mo19343a(str);
        }
        this.f14469d.clear();
        this.f14466a = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19343a(String str) {
        AbstractC4931i a = mo19339a();
        if (a != null) {
            a.mo19441c(str);
        } else {
            C13479a.m54758a("BaseWebService", "unbindBridgeHandler while web null");
        }
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4934l
    /* renamed from: a */
    public void mo19342a(AbstractC4931i iVar, boolean z) {
        this.f14467b = z;
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4934l
    /* renamed from: a */
    public void mo19340a(AbstractC4928g gVar, AbstractC4931i iVar) {
        this.f14468c = gVar;
        this.f14466a = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19344a(String str, AbstractC7945d dVar) {
        if (mo19346b(str, dVar)) {
            this.f14469d.add(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo19346b(String str, AbstractC7945d dVar) {
        AbstractC4931i a = mo19339a();
        if (a != null) {
            a.mo19431a(str, dVar);
            return true;
        }
        C13479a.m54758a("BaseWebService", "bindBridgeHandler while web null");
        return false;
    }
}
