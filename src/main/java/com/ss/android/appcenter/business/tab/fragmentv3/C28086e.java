package com.ss.android.appcenter.business.tab.fragmentv3;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ss.android.appcenter.business.dto.C27694b;
import com.ss.android.appcenter.business.dto.C27695c;
import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.net.templatedata.C27754a;
import com.ss.android.appcenter.business.net.templatedata.C27759b;
import com.ss.android.appcenter.business.net.templatedata.C27760c;
import com.ss.android.appcenter.business.net.templatedata.C27761d;
import com.ss.android.appcenter.business.net.templatedata.C27762e;
import com.ss.android.appcenter.business.net.templatedata.C27763f;
import com.ss.android.appcenter.business.net.templatedata.C27764g;
import com.ss.android.appcenter.business.p1265a.C27579g;
import com.ss.android.appcenter.business.tab.fragmentv3.p1283a.C28030a;
import com.ss.android.appcenter.business.tab.fragmentv3.p1283a.C28037d;
import com.ss.android.appcenter.common.util.C28182f;
import com.ss.android.appcenter.common.util.C28183g;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28186i;
import com.ss.android.appcenter.common.util.C28187j;
import com.ss.android.appcenter.engine.model.DataSource;
import com.ss.android.appcenter.engine.model.NodeParams;
import com.ss.android.appcenter.engine.model.Scene;
import com.ss.android.appcenter.engine.p1299a.AbstractC28238b;
import com.ss.android.appcenter.engine.p1299a.C28237a;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.tt.miniapp.util.ACache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.e */
public class C28086e implements AbstractC28238b {

    /* renamed from: a */
    public HashSet<String> f70327a = new HashSet<>();

    /* renamed from: b */
    public HashMap<String, String> f70328b;

    /* renamed from: c */
    public HandlerC28088a f70329c;

    /* renamed from: d */
    public C1177w<Boolean> f70330d = new C1177w<>();

    /* renamed from: e */
    public String f70331e;

    /* renamed from: f */
    public String f70332f;

    /* renamed from: g */
    public ACache f70333g;

    /* renamed from: h */
    private HashMap<String, C1177w<C28237a>> f70334h = new HashMap<>();

    /* renamed from: i */
    private C27754a f70335i;

    /* renamed from: j */
    private List<C27762e> f70336j;

    /* renamed from: k */
    private List<C27763f> f70337k;

    /* renamed from: l */
    private Context f70338l;

    /* renamed from: m */
    private boolean f70339m;

    /* renamed from: n */
    private OPTrace f70340n;

    @Override // com.ss.android.appcenter.engine.p1299a.AbstractC28238b
    /* renamed from: a */
    public void mo99988a(String str, LifecycleOwner lifecycleOwner, AbstractC1178x<C28237a> xVar, C28237a aVar) {
        C28184h.m103250d("WorkplaceDataService", "registerLiveDataObserver>>> key:" + str);
        C1177w<C28237a> b = m102690b(str);
        if (b.mo5927b() == null) {
            b.mo5929b(aVar);
        }
        b.mo5923a(lifecycleOwner, xVar);
    }

    @Override // com.ss.android.appcenter.engine.p1299a.AbstractC28238b
    /* renamed from: a */
    public void mo99986a(NodeParams nodeParams) {
        m102691b(nodeParams);
        C28184h.m103250d("WorkplaceDataService", "asyncLoadAll>>> id:" + this.f70331e + " md5:" + this.f70332f);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m102688a(nodeParams, arrayList, arrayList2);
        C28184h.m103250d("WorkplaceDataService", "asyncLoadAll>>> end addComponentRequestToList. platformList size:" + arrayList.size() + " externalList size:" + arrayList2.size());
        m102696d();
        if (!C28182f.m103238c(arrayList) || !C28182f.m103238c(arrayList2)) {
            m102689a(arrayList);
            this.f70337k = arrayList;
            m102693b(arrayList2);
            this.f70336j = arrayList2;
            return;
        }
        this.f70330d.mo5926a((Boolean) true);
    }

    @Override // com.ss.android.appcenter.engine.p1299a.AbstractC28238b
    /* renamed from: a */
    public void mo99987a(String str) {
        C28184h.m103250d("WorkplaceDataService", "refresh>>> key:" + str);
        String componentName = NodeParams.getComponentName(str);
        if (m102697d(componentName)) {
            for (int i = 0; i < this.f70337k.size(); i++) {
                C27763f fVar = this.f70337k.get(i);
                if (TextUtils.equals(NodeParams.getId(str), fVar.f69363b)) {
                    m102689a(Arrays.asList(fVar));
                }
            }
        }
        if (m102695c(componentName)) {
            for (int i2 = 0; i2 < this.f70336j.size(); i2++) {
                C27762e eVar = this.f70336j.get(i2);
                if (TextUtils.equals(str, eVar.f69359c)) {
                    m102693b(Arrays.asList(eVar));
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo99989a(C1177w<C28237a> wVar, C28237a aVar) {
        if (wVar.mo5927b() != null) {
            if (wVar.mo5927b().mo100615b() && aVar.mo100616c()) {
                C28184h.m103250d("WorkplaceDataService", "postData>>> return error data.");
                return false;
            } else if (wVar.mo5927b().mo100617d() && aVar.mo100618e()) {
                C28184h.m103250d("WorkplaceDataService", "postData>>> return cache data.");
                return false;
            }
        }
        wVar.mo5926a(aVar);
        return true;
    }

    /* renamed from: d */
    private void m102696d() {
        if (this.f70339m) {
            C28187j.m103257a().mo100400a(new Runnable() {
                /* class com.ss.android.appcenter.business.tab.fragmentv3.$$Lambda$e$QGmQd02TSG6yqpVypuQlJh3U4 */

                public final void run() {
                    C28086e.this.m102699f();
                }
            });
        }
    }

    /* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.e$a */
    static class HandlerC28088a extends Handler {

        /* renamed from: a */
        private final WeakReference<C28086e> f70342a;

        /* renamed from: a */
        public void mo99991a() {
            if (this.f70342a.get() == null || this.f70342a.get().f70333g == null) {
                C28184h.m103250d("WorkplaceDataService", "sendSetCacheMessage>>> no cache");
                return;
            }
            removeMessages(1);
            sendEmptyMessageDelayed(1, 2000);
        }

        /* renamed from: b */
        public synchronized void mo99992b() {
            C28086e eVar = this.f70342a.get();
            if (eVar != null) {
                if (eVar.f70333g != null) {
                    C28184h.m103250d("WorkplaceDataService", String.format("saveCache>>> data size:%d. md5:%s. id:%s", Integer.valueOf(eVar.f70328b.size()), eVar.f70332f, eVar.f70331e));
                    C27760c cVar = new C27760c();
                    cVar.f69352a = eVar.f70331e;
                    cVar.f69353b = eVar.f70332f;
                    cVar.f69354c = eVar.f70328b;
                    eVar.f70333g.mo233095a(eVar.mo99990b(), C27579g.f68797a.toJson(cVar));
                    return;
                }
            }
            C28184h.m103250d("WorkplaceDataService", "saveCache>>> no cache");
        }

        public HandlerC28088a(C28086e eVar) {
            this.f70342a = new WeakReference<>(eVar);
        }

        public void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            if (message.what == 1) {
                C28187j.m103257a().mo100400a(new Runnable() {
                    /* class com.ss.android.appcenter.business.tab.fragmentv3.C28086e.HandlerC28088a.RunnableC280891 */

                    public void run() {
                        HandlerC28088a.this.mo99992b();
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.e$b */
    public class C28090b implements C27754a.AbstractC27757a {

        /* renamed from: b */
        private String f70345b;

        /* renamed from: c */
        private String f70346c;

        /* renamed from: d */
        private C1177w f70347d;

        @Override // com.ss.android.appcenter.business.net.templatedata.C27754a.AbstractC27757a
        /* renamed from: a */
        public void mo99063a() {
            C28184h.m103248b("WorkplaceDataService", "ExternalComponentResult>>> post error. key:" + this.f70346c + " msg:" + m102714b("onError callback"));
            C28086e.this.mo99989a(this.f70347d, new C28237a(2, Scene.NET));
        }

        /* renamed from: b */
        private String m102714b(String str) {
            return String.format("ExternalComponentResult{componentName=%s, key=%s, jsonBody=%s}", this.f70345b, this.f70346c, str);
        }

        @Override // com.ss.android.appcenter.business.net.templatedata.C27754a.AbstractC27757a
        /* renamed from: a */
        public void mo99064a(String str) {
            Object a = C28086e.this.mo99981a(this.f70345b, str);
            if (a != null) {
                C28184h.m103250d("WorkplaceDataService", "ExternalComponentResult>>> post success. key:" + this.f70346c);
                if (C28086e.this.mo99989a(this.f70347d, new C28237a(1, a, Scene.NET)) && C28086e.this.f70327a.contains(this.f70346c)) {
                    C28086e.this.f70328b.put(this.f70346c, str);
                }
                C28086e.this.f70329c.mo99991a();
                return;
            }
            C28086e.this.mo99989a(this.f70347d, new C28237a(2, Scene.NET));
            C28184h.m103248b("WorkplaceDataService", "ExternalComponentResult>>> post error. key:" + this.f70346c + " msg:" + m102714b(str));
        }

        public C28090b(String str, C1177w wVar) {
            this.f70346c = str;
            this.f70347d = wVar;
            this.f70345b = NodeParams.getComponentName(str);
        }
    }

    /* renamed from: c */
    private void m102694c() {
        try {
            this.f70333g = ACache.m261150a(this.f70338l, "CacheKeyTemplateData");
            this.f70339m = C27548m.m100547m().mo98225i().mo98187a("lark.workplace.template.cache");
            C28184h.m103250d("WorkplaceDataService", "initCache>>> fg:" + this.f70339m);
        } catch (ACache.CacheException e) {
            C27700a.m101236a("WorkplaceTemplateService#initCache", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m102699f() {
        try {
            C27760c cVar = (C27760c) C27579g.f68797a.fromJson(this.f70333g.mo233093a(mo99990b()), C27760c.class);
            if (cVar == null || cVar.f69354c == null) {
                C28184h.m103250d("WorkplaceDataService", "loadCache>>> no cache");
            } else if (!TextUtils.equals(cVar.f69353b, this.f70332f) || !TextUtils.equals(cVar.f69352a, this.f70331e)) {
                C28184h.m103250d("WorkplaceDataService", "loadCache>>> invalid cache.");
            } else {
                for (String str : cVar.f69354c.keySet()) {
                    String str2 = cVar.f69354c.get(str);
                    Object a = mo99981a(NodeParams.getComponentName(str), str2);
                    if (a != null) {
                        C28184h.m103250d("WorkplaceDataService", "loadCache>>> load key:" + str);
                        if (mo99989a(m102690b(str), new C28237a(1, a, Scene.CACHE)) && this.f70327a.contains(str)) {
                            this.f70328b.put(str, str2);
                        }
                    }
                }
                C28184h.m103250d("WorkplaceDataService", "loadCache>>> use cache. data ready.");
                this.f70330d.mo5926a((Boolean) true);
            }
        } catch (Exception e) {
            C27700a.m101236a("WorkplaceDataService#loadCache", e);
        }
    }

    /* renamed from: b */
    public String mo99990b() {
        return C28186i.m103256a(C27548m.m100547m().mo98221e().mo98213b() + C28183g.m103240a());
    }

    @Override // com.ss.android.appcenter.engine.p1299a.AbstractC28238b
    /* renamed from: a */
    public void mo99982a() {
        C28184h.m103250d("WorkplaceDataService", "refresh>>>");
        if (!C28182f.m103238c(this.f70337k)) {
            m102689a(this.f70337k);
        }
        if (!C28182f.m103238c(this.f70336j)) {
            m102693b(this.f70336j);
        }
    }

    @Override // com.ss.android.appcenter.engine.p1299a.AbstractC28238b
    /* renamed from: a */
    public void mo99983a(LifecycleOwner lifecycleOwner) {
        this.f70330d.mo5922a(lifecycleOwner);
    }

    /* renamed from: b */
    private C1177w<C28237a> m102690b(String str) {
        if (this.f70334h.get(str) != null) {
            return this.f70334h.get(str);
        }
        C1177w<C28237a> wVar = new C1177w<>();
        this.f70334h.put(str, wVar);
        return wVar;
    }

    /* renamed from: c */
    private boolean m102695c(String str) {
        if (TextUtils.equals(str, "FeedSwiper") || TextUtils.equals(str, "FeedList")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m102691b(NodeParams nodeParams) {
        this.f70331e = nodeParams.templateId;
        this.f70332f = nodeParams.md5;
        this.f70328b.clear();
        this.f70327a.clear();
    }

    /* renamed from: d */
    private boolean m102697d(String str) {
        if (TextUtils.equals(str, "CommonAndRecommend") || TextUtils.equals(str, "Block")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m102689a(List<C27763f> list) {
        C28184h.m103250d("WorkplaceDataService", "requestPlatformComponentData>>>" + list);
        this.f70335i.mo99062a(list, new C27754a.AbstractC27758b() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.C28086e.C280871 */

            @Override // com.ss.android.appcenter.business.net.templatedata.C27754a.AbstractC27758b
            /* renamed from: a */
            public void mo99065a() {
                C28184h.m103248b("WorkplaceDataService", "requestPlatformComponentData>>> onError.");
                C28086e.this.f70330d.mo5926a((Boolean) false);
            }

            @Override // com.ss.android.appcenter.business.net.templatedata.C27754a.AbstractC27758b
            /* renamed from: a */
            public void mo99066a(List<C27764g> list) {
                C28184h.m103250d("WorkplaceDataService", "requestPlatformComponentData>>> resultSize:" + list.size());
                for (int i = 0; i < list.size(); i++) {
                    C28086e.this.mo99985a(list.get(i));
                }
                C28086e.this.f70330d.mo5926a((Boolean) true);
                C28086e.this.f70329c.mo99991a();
            }
        });
    }

    /* renamed from: b */
    private void m102693b(List<C27762e> list) {
        C28184h.m103250d("WorkplaceDataService", "requestExternalComponentData>>> list:" + list);
        for (int i = 0; i < list.size(); i++) {
            C27762e eVar = list.get(i);
            this.f70335i.mo99061a(eVar.f69357a, eVar.f69358b, eVar.f69361e, eVar.f69360d, new C28090b(eVar.f69359c, m102690b(eVar.f69359c)));
        }
    }

    /* renamed from: a */
    public void mo99985a(C27764g gVar) {
        String a = C28030a.m102447a(gVar.f69366b);
        String key = NodeParams.getKey(a, gVar.f69367c);
        String str = gVar.f69368d;
        Object a2 = mo99981a(a, str);
        C1177w<C28237a> b = m102690b(key);
        if (gVar.f69365a != 0 || a2 == null) {
            C28184h.m103248b("WorkplaceDataService", "IPlatformComponentResult post error. response:" + gVar);
            mo99989a(b, new C28237a(2, Scene.NET));
            return;
        }
        C28184h.m103250d("WorkplaceDataService", "IPlatformComponentResult post success. key:" + key);
        if (mo99989a(b, new C28237a(1, a2, Scene.NET)) && this.f70327a.contains(key)) {
            this.f70328b.put(key, str);
        }
    }

    @Override // com.ss.android.appcenter.engine.p1299a.AbstractC28238b
    /* renamed from: a */
    public void mo99984a(LifecycleOwner lifecycleOwner, AbstractC1178x<Boolean> xVar) {
        this.f70330d.mo5923a(lifecycleOwner, xVar);
    }

    public C28086e(Context context, OPTrace oPTrace) {
        this.f70338l = context;
        this.f70340n = oPTrace;
        this.f70335i = new C27754a(oPTrace);
        this.f70328b = new HashMap<>();
        this.f70329c = new HandlerC28088a(this);
        m102694c();
    }

    /* renamed from: a */
    private void m102687a(NodeParams nodeParams, List<C27763f> list) {
        this.f70327a.add(nodeParams.getKey());
        String componentName = nodeParams.getComponentName();
        componentName.hashCode();
        if (componentName.equals("Block")) {
            JsonObject jsonObject = new JsonObject();
            String f = C28037d.m102477f(nodeParams);
            String g = C28037d.m102478g(nodeParams);
            if (!TextUtils.isEmpty(f)) {
                jsonObject.addProperty("blockId", f);
            }
            if (!TextUtils.isEmpty(g)) {
                jsonObject.addProperty("itemId", g);
            }
            list.add(new C27763f(C28030a.m102446a(nodeParams.getComponentName()), nodeParams.getId(), jsonObject.toString()));
        } else if (componentName.equals("CommonAndRecommend")) {
            list.add(new C27763f(C28030a.m102446a(nodeParams.getComponentName()), nodeParams.getId(), ""));
        }
    }

    /* renamed from: b */
    private void m102692b(NodeParams nodeParams, List<C27762e> list) {
        C28184h.m103250d("WorkplaceDataService", "addExternalComponentRequest>>> node:" + nodeParams);
        this.f70327a.add(nodeParams.getKey());
        DataSource dataSource = nodeParams.getDataSource();
        if (dataSource != null) {
            C27762e eVar = new C27762e(dataSource.method, dataSource.url, nodeParams.getKey(), dataSource.withAuth);
            if (dataSource.params != null) {
                eVar.f69360d = C27579g.f68797a.toJson((JsonElement) dataSource.params);
            }
            list.add(eVar);
            return;
        }
        C27700a.m101238b("WorkplaceDataService#addExternalComponentRequest");
    }

    /* renamed from: a */
    public Object mo99981a(String str, String str2) {
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -2059720746:
                    if (str.equals("FeedSwiper")) {
                        c = 2;
                        break;
                    }
                    break;
                case -127504516:
                    if (str.equals("FeedList")) {
                        c = 3;
                        break;
                    }
                    break;
                case 64279661:
                    if (str.equals("Block")) {
                        c = 1;
                        break;
                    }
                    break;
                case 843876944:
                    if (str.equals("CommonAndRecommend")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                C27761d dVar = (C27761d) C27579g.f68797a.fromJson(str2, C27761d.class);
                if (dVar != null) {
                    return dVar;
                }
                return null;
            } else if (c == 1) {
                C27759b bVar = (C27759b) C27579g.f68797a.fromJson(str2, C27759b.class);
                if (bVar == null || bVar.f69351a == null) {
                    return null;
                }
                return bVar;
            } else if (c == 2) {
                C27694b bVar2 = (C27694b) C27579g.f68797a.fromJson(str2, C27694b.class);
                if (bVar2 == null || bVar2.f69186a == null) {
                    return null;
                }
                return bVar2;
            } else if (c != 3) {
                return null;
            } else {
                C27695c cVar = (C27695c) C27579g.f68797a.fromJson(str2, C27695c.class);
                if (cVar == null || cVar.f69187a == null) {
                    return null;
                }
                return cVar;
            }
        } catch (Exception e) {
            C27700a.m101236a("WorkplaceData#parseJsonByComponent", e);
            return null;
        }
    }

    /* renamed from: a */
    private void m102688a(NodeParams nodeParams, List<C27763f> list, List<C27762e> list2) {
        String componentName = nodeParams.getComponentName();
        if (m102697d(componentName)) {
            m102687a(nodeParams, list);
        } else if (m102695c(componentName)) {
            m102692b(nodeParams, list2);
        }
        List<NodeParams> children = nodeParams.getChildren();
        if (!C28182f.m103238c(children)) {
            for (int i = 0; i < children.size(); i++) {
                m102688a(children.get(i), list, list2);
            }
        }
    }
}
