package com.bytedance.ee.bear.atfinder;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.ee.bear.at.AbstractC4241h;
import com.bytedance.ee.bear.at.AtObject;
import com.bytedance.ee.bear.atfinder.AtFinderResultList;
import com.bytedance.ee.bear.bean.C4520c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.chad.library.adapter.base.BaseQuickAdapter;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.atfinder.a */
public class View$OnKeyListenerC4262a implements View.OnKeyListener, BaseQuickAdapter.AbstractC20911a {

    /* renamed from: a */
    public AbstractC4269d f12823a;

    /* renamed from: b */
    public AbstractC4241h f12824b;

    /* renamed from: c */
    private AbstractC4265a f12825c;

    /* renamed from: d */
    private boolean f12826d;

    /* renamed from: e */
    private String f12827e;

    /* renamed from: f */
    private String f12828f;

    /* renamed from: g */
    private int f12829g;

    /* renamed from: h */
    private String f12830h;

    /* renamed from: i */
    private String f12831i;

    /* renamed from: j */
    private C4266b f12832j;

    /* renamed from: k */
    private boolean f12833k = true;

    /* renamed from: com.bytedance.ee.bear.atfinder.a$a */
    public interface AbstractC4265a {
        /* renamed from: a */
        void mo16798a();

        /* renamed from: b */
        void mo16799b();

        /* renamed from: c */
        void mo16800c();
    }

    /* renamed from: a */
    public String mo16781a() {
        return this.f12828f;
    }

    /* renamed from: d */
    public boolean mo16792d() {
        return this.f12833k;
    }

    /* renamed from: e */
    public C4266b mo16793e() {
        return this.f12832j;
    }

    /* renamed from: f */
    private void m17719f() {
        this.f12824b.mo16675b();
    }

    /* renamed from: g */
    private void m17720g() {
        if ("default".equals(this.f12830h)) {
            C13479a.m54764b("AtFinderController", "reportOpenMention(): mZone is default ,not report");
            return;
        }
        this.f12824b.mo16674a(mo16792d());
        this.f12824b.mo16669a();
    }

    /* renamed from: b */
    public void mo16787b() {
        if (this.f12825c != null) {
            C13479a.m54772d("AtFinderController", "search: showLoading");
            this.f12825c.mo16800c();
            return;
        }
        C13479a.m54764b("AtFinderController", "search: showLoading mSearchViewModel is null");
    }

    /* renamed from: c */
    public void mo16790c() {
        C13479a.m54772d("AtFinderController", "AtFinderController.closeAtFinder ");
        try {
            C13479a.m54772d("AtFinderController", "accept: ");
            if (!this.f12826d) {
                C13479a.m54764b("AtFinderController", "closeAtFinder: is showing is false");
                return;
            }
            this.f12825c.mo16799b();
            this.f12826d = false;
            AbstractC4269d dVar = this.f12823a;
            if (dVar != null) {
                dVar.mo16703a();
            } else {
                C13479a.m54764b("AtFinderController", "closeAtFinder: mAtFinderDataCallback is null");
            }
        } catch (Exception e) {
            C13479a.m54759a("AtFinderController", "accept: exception", e);
        }
    }

    /* renamed from: b */
    public void mo16789b(boolean z) {
        this.f12833k = z;
    }

    /* renamed from: a */
    public void mo16782a(AbstractC4269d dVar) {
        this.f12823a = dVar;
    }

    /* renamed from: a */
    public void mo16784a(String str) {
        AbstractC4269d dVar = this.f12823a;
        if (dVar != null) {
            dVar.mo16705a(str);
        } else {
            C13479a.m54764b("AtFinderController", "sendEmptyResult: mAtFinderDataCallback is null");
        }
    }

    /* renamed from: b */
    public void mo16788b(String str) {
        AbstractC4269d dVar = this.f12823a;
        if (dVar != null) {
            dVar.mo16706b(str);
        } else {
            C13479a.m54764b("AtFinderController", "sendExistResult: mAtFinderDataCallback is null");
        }
    }

    /* renamed from: a */
    private AtFinderResultList m17716a(AtObject atObject) {
        AtFinderResultList atFinderResultList = new AtFinderResultList();
        AtFinderResultList.DATA data = new AtFinderResultList.DATA();
        ArrayList arrayList = new ArrayList();
        arrayList.add(atObject);
        data.setResult_list(arrayList);
        atFinderResultList.setData(data);
        return atFinderResultList;
    }

    /* renamed from: b */
    private void m17718b(C4520c cVar) {
        if (!TextUtils.isEmpty(cVar.mo17419g())) {
            mo16789b(TextUtils.equals(cVar.mo17419g(), "toolbar"));
        }
    }

    /* renamed from: a */
    public void mo16783a(C4520c cVar) {
        this.f12827e = cVar.mo17414b();
        this.f12829g = cVar.mo17415c();
        this.f12830h = cVar.mo17416d();
        this.f12824b.mo16672a(cVar);
        this.f12831i = cVar.mo17412a();
        m17718b(cVar);
    }

    /* renamed from: c */
    public synchronized void mo16791c(String str) {
        try {
            if (this.f12832j != null) {
                C13479a.m54772d("AtFinderController", "search: search direct");
                this.f12825c.mo16800c();
                this.f12832j.search(this.f12827e, str, this.f12828f, this.f12829g, this.f12831i);
            } else {
                C13479a.m54764b("AtFinderController", "search: mSearchViewModel is null");
            }
        } catch (Exception e) {
            C13479a.m54759a("AtFinderController", "AtFinderController.search ", e);
        }
        return;
    }

    /* renamed from: a */
    public void mo16785a(Map<String, Object> map) {
        this.f12824b.mo16673a(map);
    }

    /* renamed from: a */
    public void mo16786a(boolean z) {
        C13479a.m54772d("AtFinderController", "AtFinderController.showAtFinder ");
        try {
            if (this.f12826d) {
                C13479a.m54772d("AtFinderController", "AtFinderController.showAtFinder is showing");
            } else if (this.f12825c != null) {
                this.f12826d = true;
                m17720g();
                if (z) {
                    mo16791c("");
                }
                this.f12825c.mo16798a();
            } else {
                C13479a.m54764b("AtFinderController", "AtFinderController.showAtFinder:142 mContainer is null");
            }
        } catch (Exception e) {
            C13479a.m54759a("AtFinderController", "accept: exception", e);
        }
    }

    /* renamed from: a */
    private void m17717a(AtFinderResultList atFinderResultList, final AtObject atObject) {
        if (this.f12823a != null) {
            AbstractC68307f.m265083a(atFinderResultList).mo237985a(C11678b.m48481e()).mo238001b(new Consumer<AtFinderResultList>() {
                /* class com.bytedance.ee.bear.atfinder.View$OnKeyListenerC4262a.C42631 */

                /* renamed from: a */
                public void accept(AtFinderResultList atFinderResultList) throws Exception {
                    C13479a.m54772d("AtFinderController", "accept: ");
                    View$OnKeyListenerC4262a.this.f12823a.mo16704a(atFinderResultList);
                    if (atObject != null) {
                        View$OnKeyListenerC4262a.this.f12824b.mo16671a(atObject, View$OnKeyListenerC4262a.this.mo16792d());
                        View$OnKeyListenerC4262a.this.f12824b.mo16670a(atObject);
                    }
                }
            }, new Consumer<Throwable>() {
                /* class com.bytedance.ee.bear.atfinder.View$OnKeyListenerC4262a.C42642 */

                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    C13479a.m54759a("AtFinderController", "accept: exception", th);
                }
            });
            return;
        }
        this.f12824b.mo16671a(atObject, mo16792d());
        this.f12824b.mo16670a(atObject);
        C13479a.m54764b("AtFinderController", "AtFinderController.sendResult:103 mAtFinderDataCallback is null");
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        C13479a.m54772d("AtFinderController", "AtFinderController.onKey:104 ");
        if (keyEvent.getAction() != 1 || i != 4) {
            return false;
        }
        C13479a.m54764b("AtFinderController", "AtFinderController.onKey:106 ");
        mo16790c();
        return true;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.AbstractC20911a
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        m17719f();
        if (baseQuickAdapter.mo70673b().size() <= i) {
            C13479a.m54758a("AtFinderController", "onItemClick(): size" + baseQuickAdapter.mo70673b().size());
            return;
        }
        AtObject atObject = (AtObject) baseQuickAdapter.mo70673b().get(i);
        atObject.setSequenceNum(i);
        m17717a(m17716a(atObject), atObject);
    }

    public View$OnKeyListenerC4262a(C4266b bVar, C4520c cVar, AbstractC4241h hVar, String str, AbstractC4265a aVar) {
        C13479a.m54772d("AtFinderController", "AtFinderController.AtFinderController:52 token=" + C13598b.m55197d(cVar.mo17414b()) + " type=" + str);
        this.f12826d = false;
        this.f12824b = hVar;
        mo16783a(cVar);
        this.f12825c = aVar;
        this.f12832j = bVar;
        this.f12828f = str;
    }
}
