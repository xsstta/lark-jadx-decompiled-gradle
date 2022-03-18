package com.bytedance.ee.bear.browser.plugin;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.log.C13479a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.browser.plugin.l */
public class C4951l implements AbstractC4958n {

    /* renamed from: a */
    private final String f14527a;

    /* renamed from: b */
    private final Context f14528b;

    /* renamed from: c */
    private final View f14529c;

    /* renamed from: d */
    private final FragmentManager f14530d;

    /* renamed from: e */
    private TitleBar f14531e;

    /* renamed from: f */
    private final LayoutInflater f14532f;

    /* renamed from: g */
    private AbstractC4958n.AbstractC4959a f14533g;

    /* renamed from: h */
    private final Map<String, C4957m> f14534h;

    /* renamed from: i */
    private final Map<String, WeakReference<Fragment>> f14535i;

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n
    /* renamed from: b */
    public Context mo19593b() {
        return this.f14528b;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n
    /* renamed from: f */
    public View mo19601f() {
        return this.f14529c;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n
    /* renamed from: g */
    public FragmentManager mo19602g() {
        return this.f14530d;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n
    /* renamed from: i */
    public AbstractC4958n.AbstractC4959a mo19604i() {
        return this.f14533g;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n
    /* renamed from: c */
    public void mo19596c() {
        Context context = this.f14528b;
        if (context instanceof Activity) {
            ((Activity) context).getWindow().clearFlags(1024);
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n
    /* renamed from: d */
    public void mo19599d() {
        Context context = this.f14528b;
        if (context instanceof Activity) {
            ((Activity) context).getWindow().addFlags(1024);
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n
    /* renamed from: e */
    public TitleBar mo19600e() {
        if (this.f14531e == null) {
            C13479a.m54774d(this.f14527a, new IllegalStateException("No title bar injected !"));
        }
        return this.f14531e;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n
    /* renamed from: h */
    public void mo19603h() {
        View view = new View(mo19593b());
        view.setFitsSystemWindows(true);
        this.f14533g.mo19535b().addView(view, 0);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n
    /* renamed from: a */
    public C4960o mo19587a() {
        return this.f14533g.mo19532a();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n
    /* renamed from: a */
    public void mo19591a(AbstractC4958n.AbstractC4959a aVar) {
        this.f14533g = aVar;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n
    /* renamed from: a */
    public View mo19583a(int i) {
        return this.f14529c.findViewById(i);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n
    /* renamed from: d */
    public ViewGroup mo19598d(AbstractC4941c cVar) {
        return this.f14533g.mo19531a(this, cVar);
    }

    /* renamed from: e */
    private String m20480e(AbstractC4941c cVar) {
        return cVar.getClass().getName();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n
    /* renamed from: b */
    public boolean mo19595b(AbstractC4941c cVar) {
        return !this.f14535i.containsKey(m20480e(cVar));
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n
    /* renamed from: a */
    public View mo19585a(Object obj) {
        return this.f14529c.findViewWithTag(obj);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n
    /* renamed from: a */
    public Fragment mo19586a(AbstractC4941c cVar) {
        Fragment findFragmentByTag = this.f14530d.findFragmentByTag(m20480e(cVar));
        if (findFragmentByTag == null || !findFragmentByTag.isAdded()) {
            return null;
        }
        return findFragmentByTag;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n
    /* renamed from: c */
    public void mo19597c(AbstractC4941c cVar) {
        String e = m20480e(cVar);
        C4957m remove = this.f14534h.remove(e);
        Fragment a = mo19586a(cVar);
        WeakReference<Fragment> remove2 = this.f14535i.remove(e);
        if (a == null && remove2 != null) {
            a = remove2.get();
        }
        if (a != null) {
            FragmentTransaction beginTransaction = this.f14530d.beginTransaction();
            if (remove != null) {
                beginTransaction.setCustomAnimations(remove.f14542a, remove.f14543b, remove.f14544c, remove.f14545d);
            }
            beginTransaction.remove(a).commitAllowingStateLoss();
        }
        if (this.f14530d.isStateSaved()) {
            C13479a.m54775e(this.f14527a, "Can not perform this action after onSaveInstanceState");
            return;
        }
        for (int backStackEntryCount = this.f14530d.getBackStackEntryCount() - 1; backStackEntryCount >= 0; backStackEntryCount--) {
            if (e.equals(this.f14530d.getBackStackEntryAt(backStackEntryCount).mo5399d())) {
                this.f14530d.popBackStack(e, 1);
                return;
            }
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n
    /* renamed from: a */
    public void mo19592a(C4960o oVar) {
        this.f14533g.mo19534a(oVar);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n
    /* renamed from: b */
    public void mo19594b(AbstractC4941c cVar, View view) {
        mo19598d(cVar).removeView(view);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n
    /* renamed from: a */
    public View mo19584a(AbstractC4941c cVar, int i) {
        View inflate = this.f14532f.inflate(i, mo19598d(cVar), false);
        mo19588a(cVar, inflate);
        return inflate;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n
    /* renamed from: a */
    public void mo19588a(AbstractC4941c cVar, View view) {
        mo19598d(cVar).addView(view);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n
    /* renamed from: a */
    public void mo19589a(AbstractC4941c cVar, Fragment fragment) {
        mo19590a(cVar, fragment, null);
    }

    public C4951l(Context context, View view, FragmentManager fragmentManager) {
        this(context, view, fragmentManager, null);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4958n
    /* renamed from: a */
    public void mo19590a(AbstractC4941c cVar, Fragment fragment, C4957m mVar) {
        String e = m20480e(cVar);
        FragmentTransaction beginTransaction = this.f14530d.beginTransaction();
        if (mVar != null) {
            beginTransaction.setCustomAnimations(mVar.f14542a, mVar.f14543b, mVar.f14544c, mVar.f14545d);
            if (mVar.f14546e) {
                beginTransaction.addToBackStack(e);
            }
        }
        this.f14534h.put(e, mVar);
        this.f14535i.put(e, new WeakReference<>(fragment));
        beginTransaction.replace(mo19598d(cVar).getId(), fragment, e);
        beginTransaction.commitAllowingStateLoss();
    }

    public C4951l(Context context, View view, FragmentManager fragmentManager, TitleBar titleBar) {
        this.f14527a = "BaseUIContainer#" + Integer.toHexString(hashCode());
        this.f14528b = context;
        this.f14529c = view;
        this.f14530d = fragmentManager;
        this.f14531e = titleBar;
        this.f14532f = LayoutInflater.from(context);
        this.f14534h = new HashMap();
        this.f14535i = new HashMap();
    }
}
