package com.bytedance.ee.bear.browser.plugin;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ak;
import com.bytedance.ee.bear.browser.AbstractC4928g;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4956d;
import com.bytedance.ee.bear.browser.plugin.lazy.C4953b;
import com.bytedance.ee.bear.facade.common.AbstractC7664b;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.log.C13479a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.ee.bear.browser.plugin.e */
public class C4943e implements ViewModelStoreOwner {

    /* renamed from: a */
    protected final String f14505a = ("PluginHost#" + Integer.toHexString(hashCode()));

    /* renamed from: b */
    private WeakReference<AbstractC4944a> f14506b;

    /* renamed from: c */
    private FragmentActivity f14507c;

    /* renamed from: d */
    private AbstractC4958n f14508d;

    /* renamed from: e */
    private C4960o f14509e;

    /* renamed from: f */
    private C4946h f14510f;

    /* renamed from: g */
    private AbstractC4956d f14511g;

    /* renamed from: h */
    private final List<AbstractC4941c> f14512h = new CopyOnWriteArrayList();

    /* renamed from: i */
    private final ak f14513i = new ak();

    /* renamed from: j */
    private final List<PluginHostAbility> f14514j = new ArrayList();

    /* renamed from: k */
    private boolean f14515k;

    /* renamed from: com.bytedance.ee.bear.browser.plugin.e$a */
    public interface AbstractC4944a {
        /* renamed from: a */
        LifecycleOwner mo19324a();

        /* renamed from: a */
        <T> T mo19325a(Class<T> cls);

        /* renamed from: b */
        AbstractC4948i mo19326b();

        FragmentActivity getActivity();
    }

    /* renamed from: com.bytedance.ee.bear.browser.plugin.e$b */
    public interface AbstractC4945b {
        C4943e createPluginHost();
    }

    /* renamed from: a */
    private void mo19354a() {
    }

    /* renamed from: f */
    public FragmentActivity mo19564f() {
        return this.f14507c;
    }

    /* renamed from: g */
    public AbstractC4958n mo19565g() {
        return this.f14508d;
    }

    /* renamed from: k */
    public boolean mo19569k() {
        return this.f14515k;
    }

    /* renamed from: a */
    public final void mo19546a(C4946h hVar) {
        this.f14510f = C4946h.m20451a(this.f14510f, hVar);
        AbstractC4958n nVar = this.f14508d;
        if (nVar != null) {
            nVar.mo19604i().mo19533a(this.f14510f);
        }
        mo19557c().mo19611a(this.f14510f);
    }

    /* renamed from: a */
    public void mo19547a(AbstractC4956d dVar) {
        String str = this.f14505a;
        C13479a.m54764b(str, "setPluginMounter:" + dVar);
        this.f14511g = dVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.ee.bear.browser.plugin.d<P extends com.bytedance.ee.bear.browser.plugin.c<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public <P extends AbstractC4941c<?>> void mo19549a(Class<P> cls, AbstractC4942d<P> dVar) {
        AbstractC4941c a = mo19540a(cls);
        if (a != null && dVar != 0) {
            dVar.onPluginFound(a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19548a(AbstractC4958n nVar) {
        C13479a.m54764b(this.f14505a, "onDispatchUIAttach");
        this.f14508d = nVar;
        nVar.mo19592a(this.f14509e);
        nVar.mo19604i().mo19533a(this.f14510f);
        for (AbstractC4941c cVar : this.f14512h) {
            mo19558c(cVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19550a(boolean z) {
        String str = this.f14505a;
        C13479a.m54764b(str, "onDispatchUserVisibleHint:" + z);
        for (AbstractC4941c cVar : this.f14512h) {
            cVar.setUserVisibleHint(z);
        }
    }

    /* renamed from: a */
    public void mo19545a(PluginHostAbility fVar) {
        if (!this.f14514j.contains(fVar)) {
            this.f14514j.add(fVar);
        }
    }

    /* renamed from: e */
    public Context mo19562e() {
        return mo19564f();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ak getViewModelStore() {
        mo19354a();
        return this.f14513i;
    }

    /* renamed from: c */
    public AbstractC4956d mo19557c() {
        AbstractC4956d dVar = this.f14511g;
        if (dVar == null) {
            return new C4953b(this);
        }
        return dVar;
    }

    /* renamed from: h */
    public LifecycleOwner mo19566h() {
        AbstractC4944a aVar = this.f14506b.get();
        if (aVar != null) {
            return aVar.mo19324a();
        }
        return null;
    }

    /* renamed from: i */
    public AbstractC4928g mo19567i() {
        AbstractC4944a aVar = this.f14506b.get();
        if (aVar == null) {
            return null;
        }
        aVar.getClass();
        return new AbstractC4928g() {
            /* class com.bytedance.ee.bear.browser.plugin.$$Lambda$jJua8ooRfDAudYPTaVUYCw9VlSo */

            public final Object getService(Class cls) {
                return C4943e.AbstractC4944a.this.mo19325a(cls);
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo19568j() {
        C13479a.m54764b(this.f14505a, "onDestroy");
        while (!this.f14512h.isEmpty()) {
            mo19560d(this.f14512h.get(0));
        }
        getViewModelStore().mo6010b();
        mo19557c().mo19608a();
        this.f14515k = true;
    }

    /* renamed from: d */
    public boolean mo19561d() {
        C13479a.m54764b(this.f14505a, "onDispatchBackPressed");
        for (AbstractC4941c cVar : this.f14512h) {
            if ((cVar instanceof AbstractC7666d) && ((AbstractC7666d) cVar).onBackPressed()) {
                String str = this.f14505a;
                C13479a.m54764b(str, "Back press consumed by plugin:" + cVar);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo19552b(AbstractC4944a aVar) {
        this.f14506b = new WeakReference<>(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo19558c(AbstractC4941c cVar) {
        cVar.onAttachToUIContainer(this, this.f14508d);
    }

    /* renamed from: b */
    public void mo19553b(PluginHostAbility fVar) {
        this.f14514j.remove(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo19563e(AbstractC4941c cVar) {
        cVar.onDetachFromUIContainer(this, this.f14508d);
    }

    /* renamed from: b */
    public <T extends PluginHostAbility> T mo19551b(Class<T> cls) {
        T t = (T) mo19556c(cls);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("No host ability:" + cls);
    }

    /* renamed from: d */
    public <T> T mo19559d(Class<T> cls) {
        AbstractC4944a aVar = this.f14506b.get();
        if (aVar != null) {
            return (T) aVar.mo19325a(cls);
        }
        return null;
    }

    /* renamed from: a */
    public <P extends AbstractC4941c<?>> P mo19540a(Class<P> cls) {
        P p = cls != null ? (P) this.f14510f.mo19570a(cls) : null;
        if (p != null) {
            mo19557c().mo19609a(p);
        } else {
            String str = this.f14505a;
            C13479a.m54775e(str, "Plugin not found with type:" + cls);
        }
        return p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo19554b(AbstractC4958n nVar) {
        C13479a.m54764b(this.f14505a, "onDispatchUIDetach");
        this.f14509e = nVar.mo19587a();
        for (AbstractC4941c cVar : this.f14512h) {
            mo19563e(cVar);
        }
        this.f14508d = null;
    }

    /* renamed from: c */
    public <T extends PluginHostAbility> T mo19556c(Class<T> cls) {
        Iterator<PluginHostAbility> it = this.f14514j.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (cls.isInstance(t)) {
                return t;
            }
        }
        if (cls.isInstance(this)) {
            return (T) ((PluginHostAbility) this);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo19560d(AbstractC4941c cVar) {
        if (this.f14512h.contains(cVar)) {
            this.f14512h.remove(cVar);
            if (this.f14508d != null) {
                mo19563e(cVar);
            }
            cVar.onDetachFromHost(this);
        }
    }

    /* renamed from: a */
    public static C4943e m20402a(Fragment fragment) throws PluginInfoExtractException {
        int i;
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            i = arguments.getInt("Browser#PluginHostHash", Integer.MIN_VALUE);
        } else {
            i = Integer.MIN_VALUE;
        }
        if (i != Integer.MIN_VALUE) {
            for (C4943e eVar : C4949j.m20465a().mo19581b()) {
                if (eVar.hashCode() == i) {
                    return eVar;
                }
            }
            throw new PluginInfoExtractException("No matched plugin host found :" + i + "," + fragment);
        }
        throw new PluginInfoExtractException("No plugin info found :" + i + "," + fragment);
    }

    /* renamed from: b */
    public boolean mo19555b(AbstractC4941c cVar) {
        if (cVar == null || !this.f14512h.contains(cVar)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19542a(Configuration configuration) {
        C13479a.m54764b(this.f14505a, "onDispatchConfigurationChanged");
        for (AbstractC4941c cVar : this.f14512h) {
            cVar.onConfigurationChanged(configuration);
        }
    }

    /* renamed from: a */
    public void mo19543a(AbstractC4941c cVar) {
        if (!mo19555b(cVar)) {
            this.f14512h.add(cVar);
            cVar.onAttachToHost(this);
            if (this.f14508d != null) {
                mo19558c(cVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19544a(AbstractC4944a aVar) {
        C13479a.m54764b(this.f14505a, "onCreate");
        mo19552b(aVar);
        this.f14507c = aVar.getActivity();
        this.f14515k = false;
        this.f14510f = C4946h.m20453a(new C4946h.C4947a[0]);
    }

    /* renamed from: a */
    static void m20404a(Bundle bundle, AbstractC4941c cVar) {
        m20405a(bundle, cVar.getHost());
    }

    /* renamed from: a */
    private static void m20405a(Bundle bundle, C4943e eVar) {
        bundle.putInt("Browser#PluginHostHash", eVar.hashCode());
    }

    /* renamed from: a */
    public static void m20406a(Fragment fragment, Bundle bundle) {
        try {
            m20405a(bundle, m20402a(fragment));
        } catch (PluginInfoExtractException e) {
            C13479a.m54761a("PluginHost", e);
        }
    }

    /* renamed from: a */
    public void mo19541a(int i, int i2, Intent intent) {
        String str = this.f14505a;
        C13479a.m54764b(str, "onDispatchActivityResult:" + i + "," + i2);
        for (AbstractC4941c cVar : this.f14512h) {
            if (cVar instanceof AbstractC7664b) {
                ((AbstractC7664b) cVar).onActivityResult(i, i2, intent);
            }
        }
    }
}
