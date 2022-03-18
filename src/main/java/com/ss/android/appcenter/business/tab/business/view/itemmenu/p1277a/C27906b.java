package com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a;

import android.text.TextUtils;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.AbstractC27922b;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27923c;
import com.ss.android.appcenter.common.util.C28182f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.business.view.itemmenu.a.b */
public class C27906b {

    /* renamed from: a */
    public List<AbstractC27922b> f69760a = new ArrayList();

    /* renamed from: b */
    public boolean f69761b;

    /* renamed from: c */
    public List<C27923c> f69762c = new ArrayList();

    /* renamed from: d */
    public List<C27923c> f69763d = new ArrayList();

    /* renamed from: e */
    public String f69764e;

    /* renamed from: f */
    public AbstractC27922b f69765f;

    /* renamed from: g */
    public AbstractC27922b f69766g;

    /* renamed from: d */
    public boolean mo99502d() {
        if (this.f69766g != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo99501c() {
        return !TextUtils.isEmpty(this.f69764e);
    }

    /* renamed from: e */
    public int mo99503e() {
        return C28182f.m103234a(this.f69760a) + C28182f.m103234a(this.f69762c) + C28182f.m103234a(this.f69763d) + (mo99501c() ? 1 : 0) + (mo99502d() ? 1 : 0);
    }

    /* renamed from: a */
    public List<AbstractC27922b> mo99499a() {
        ArrayList arrayList = new ArrayList();
        if (!C28182f.m103238c(this.f69760a)) {
            arrayList.addAll(this.f69760a);
        }
        if (!C28182f.m103238c(this.f69762c)) {
            arrayList.addAll(this.f69762c);
        }
        if (!C28182f.m103238c(this.f69763d)) {
            arrayList.addAll(this.f69763d);
        }
        AbstractC27922b bVar = this.f69765f;
        if (bVar != null) {
            arrayList.add(bVar);
        }
        AbstractC27922b bVar2 = this.f69766g;
        if (bVar2 != null) {
            arrayList.add(bVar2);
        }
        return arrayList;
    }

    /* renamed from: b */
    public boolean mo99500b() {
        if (this.f69761b || !C28182f.m103238c(this.f69762c) || !C28182f.m103238c(this.f69763d) || mo99501c() || mo99502d()) {
            return true;
        }
        return false;
    }
}
