package com.bytedance.ee.bear.lark.p415c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.lark.C7983b;
import com.bytedance.ee.bear.list.homepage.p432a.C8460a;
import com.bytedance.ee.bear.list.preload.C8664a;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.lark.c.c */
public class C8017c implements AbstractC8020e {

    /* renamed from: a */
    private final Map<AbstractC8019d, Integer> f21489a;

    /* renamed from: b */
    private C8664a.AbstractC8665a f21490b;

    /* renamed from: c */
    private Context f21491c;

    /* renamed from: d */
    private LiveData<ConnectionService.NetworkState> f21492d;

    /* renamed from: a */
    private void m32010a() {
        if (this.f21491c instanceof LifecycleOwner) {
            LiveData<ConnectionService.NetworkState> a = C5084ad.m20847d().mo20037a();
            this.f21492d = a;
            a.mo5923a((LifecycleOwner) this.f21491c, new AbstractC1178x() {
                /* class com.bytedance.ee.bear.lark.p415c.$$Lambda$c$tY12vpj407OPuNCdJRy1GkdVRxc */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    C8017c.this.m32011a((C8017c) ((ConnectionService.NetworkState) obj));
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8021f
    /* renamed from: c */
    public void mo31033c() {
        LiveData<ConnectionService.NetworkState> liveData;
        C13479a.m54764b("HomePageHeaderManager", "destroy()...");
        for (AbstractC8019d dVar : this.f21489a.keySet()) {
            dVar.mo31033c();
        }
        this.f21489a.clear();
        Context context = this.f21491c;
        if ((context instanceof LifecycleOwner) && (liveData = this.f21492d) != null) {
            liveData.mo5922a((LifecycleOwner) context);
        }
        C8664a.m36219b(this.f21490b);
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8021f
    /* renamed from: d */
    public void mo31034d() {
        C13479a.m54764b("HomePageHeaderManager", "reload()...");
        for (AbstractC8019d dVar : this.f21489a.keySet()) {
            dVar.mo31034d();
        }
    }

    /* renamed from: b */
    private void m32014b(ViewGroup viewGroup) {
        this.f21491c = viewGroup.getContext();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m32011a(ConnectionService.NetworkState networkState) {
        if (networkState != null) {
            for (AbstractC8019d dVar : this.f21489a.keySet()) {
                dVar.mo31027a(networkState);
            }
        }
    }

    public C8017c(final C7983b bVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(6);
        this.f21489a = linkedHashMap;
        C13479a.m54764b("HomePageHeaderManager", "HomePageHeaderManager()...");
        linkedHashMap.put(new C8015a(), 0);
        linkedHashMap.put(new C8024i(), 1);
        linkedHashMap.put(new C8023h(new C8460a.AbstractC8461a() {
            /* class com.bytedance.ee.bear.lark.p415c.C8017c.C80181 */

            @Override // com.bytedance.ee.bear.list.homepage.p432a.C8460a.AbstractC8461a
            /* renamed from: a */
            public String mo31037a() {
                return "home";
            }

            @Override // com.bytedance.ee.bear.list.homepage.p432a.C8460a.AbstractC8461a
            /* renamed from: b */
            public String mo31038b() {
                return bVar.mo30967e();
            }
        }), 2);
        linkedHashMap.put(new C8026k(bVar), 3);
        linkedHashMap.put(new C8022g(bVar.getChildFragmentManager()), 4);
        linkedHashMap.put(new C8016b(), 5);
        linkedHashMap.put(new C8025j(), 6);
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8020e
    /* renamed from: a */
    public <T extends AbstractC8019d> T mo31035a(Class<T> cls) {
        Iterator<AbstractC8019d> it = this.f21489a.keySet().iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass().getName().equals(cls.getName())) {
                return t;
            }
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8020e
    /* renamed from: a */
    public void mo31036a(ViewGroup viewGroup) {
        C13479a.m54764b("HomePageHeaderManager", "init()...");
        m32014b(viewGroup);
        ArrayList arrayList = new ArrayList(this.f21489a.size());
        for (AbstractC8019d dVar : this.f21489a.keySet()) {
            if (dVar.mo31030a()) {
                m32012a(dVar, viewGroup);
            } else {
                arrayList.add(dVar);
            }
        }
        $$Lambda$c$9AKMsiZuGYql5TEBmjz070pnOig r1 = new C8664a.AbstractC8665a(arrayList, viewGroup) {
            /* class com.bytedance.ee.bear.lark.p415c.$$Lambda$c$9AKMsiZuGYql5TEBmjz070pnOig */
            public final /* synthetic */ List f$1;
            public final /* synthetic */ ViewGroup f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.bytedance.ee.bear.list.preload.C8664a.AbstractC8665a
            public final void onFirstContentDraw() {
                C8017c.this.m32013a((C8017c) this.f$1, (List) this.f$2);
            }
        };
        this.f21490b = r1;
        C8664a.m36218a(r1);
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8021f
    /* renamed from: a */
    public void mo31029a(boolean z) {
        for (AbstractC8019d dVar : this.f21489a.keySet()) {
            dVar.mo31029a(z);
        }
    }

    /* renamed from: a */
    private void m32012a(AbstractC8019d dVar, ViewGroup viewGroup) {
        C13479a.m54764b("HomePageHeaderManager", "addHeaderAndInitData()...header = " + dVar);
        if (dVar == null || dVar.mo31032b()) {
            C13479a.m54764b("HomePageHeaderManager", "header already added, return");
            return;
        }
        Integer num = this.f21489a.get(dVar);
        View a = dVar.mo31026a(viewGroup.getContext());
        if (a != null) {
            if (num == null || num.intValue() > viewGroup.getChildCount()) {
                num = Integer.valueOf(viewGroup.getChildCount());
            }
            viewGroup.addView(a, num.intValue());
            dVar.mo31031b(viewGroup.getContext());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m32013a(List list, ViewGroup viewGroup) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m32012a((AbstractC8019d) it.next(), viewGroup);
        }
        m32010a();
    }
}
