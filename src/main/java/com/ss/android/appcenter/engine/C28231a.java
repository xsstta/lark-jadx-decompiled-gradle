package com.ss.android.appcenter.engine;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.monitor.p1269a.C27702b;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.net.p1272c.C27733c;
import com.ss.android.appcenter.business.tab.business.p1273a.C27800k;
import com.ss.android.appcenter.business.tab.fragmentv3.C28082d;
import com.ss.android.appcenter.business.tab.fragmentv3.C28091f;
import com.ss.android.appcenter.business.tab.fragmentv3.p1283a.C28037d;
import com.ss.android.appcenter.business.view.StatusController;
import com.ss.android.appcenter.common.util.C28177b;
import com.ss.android.appcenter.common.util.C28182f;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.view.BannerRecyclerView;
import com.ss.android.appcenter.engine.model.NodeParams;
import com.ss.android.appcenter.engine.p1299a.AbstractC28238b;
import com.ss.android.appcenter.engine.p1299a.AbstractC28239c;
import com.ss.android.appcenter.engine.p1300b.AbstractC28241a;
import com.ss.android.appcenter.engine.p1300b.C28243c;
import com.ss.android.appcenter.engine.vlayout.C28277b;
import com.ss.android.appcenter.engine.vlayout.VirtualLayoutManager;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.util.share_preference.UserSP;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.appcenter.engine.a */
public class C28231a implements C27800k.AbstractC27804b, AbstractC28246e {

    /* renamed from: f */
    public static HashMap<String, Integer> f70849f = new HashMap<>();

    /* renamed from: g */
    public static int f70850g = 1000;

    /* renamed from: a */
    public AbstractC28247f f70851a;

    /* renamed from: b */
    public Context f70852b;

    /* renamed from: c */
    public AbstractC28241a f70853c;

    /* renamed from: d */
    public C27800k f70854d;

    /* renamed from: e */
    public boolean f70855e;

    /* renamed from: h */
    private NodeParams f70856h;

    /* renamed from: i */
    private AbstractC28244c f70857i;

    /* renamed from: j */
    private BannerRecyclerView f70858j;

    /* renamed from: k */
    private VirtualLayoutManager f70859k;

    /* renamed from: l */
    private C28277b f70860l;

    /* renamed from: m */
    private AbstractC28245d f70861m;

    /* renamed from: n */
    private Fragment f70862n;

    /* renamed from: o */
    private AbstractC28238b f70863o;

    /* renamed from: p */
    private AbstractC28239c f70864p;

    /* renamed from: q */
    private StatusController f70865q;

    /* renamed from: r */
    private OPTrace f70866r;

    /* renamed from: s */
    private long f70867s = System.currentTimeMillis();

    /* renamed from: t */
    private Boolean f70868t;

    @Override // com.ss.android.appcenter.engine.AbstractC28246e
    /* renamed from: c */
    public AbstractC28244c mo100597c() {
        return this.f70857i;
    }

    @Override // com.ss.android.appcenter.engine.AbstractC28246e
    /* renamed from: d */
    public AbstractC28238b mo100598d() {
        return this.f70863o;
    }

    @Override // com.ss.android.appcenter.engine.AbstractC28246e
    /* renamed from: e */
    public AbstractC28241a mo100599e() {
        return this.f70853c;
    }

    @Override // com.ss.android.appcenter.engine.AbstractC28246e
    /* renamed from: f */
    public AbstractC28245d mo100600f() {
        return this.f70861m;
    }

    @Override // com.ss.android.appcenter.engine.AbstractC28246e
    /* renamed from: g */
    public LifecycleOwner mo100601g() {
        return this.f70862n;
    }

    @Override // com.ss.android.appcenter.engine.AbstractC28246e
    /* renamed from: h */
    public Fragment mo100602h() {
        return this.f70862n;
    }

    @Override // com.ss.android.appcenter.engine.AbstractC28246e
    /* renamed from: i */
    public RecyclerView mo100603i() {
        return this.f70858j;
    }

    @Override // com.ss.android.appcenter.engine.AbstractC28246e
    /* renamed from: j */
    public VirtualLayoutManager mo100604j() {
        return this.f70859k;
    }

    /* renamed from: m */
    public View mo100607m() {
        return this.f70858j;
    }

    @Override // com.ss.android.appcenter.business.tab.business.p1273a.C27800k.AbstractC27804b
    /* renamed from: a */
    public C27733c mo99211a() {
        return this.f70853c.mo100005d();
    }

    @Override // com.ss.android.appcenter.engine.AbstractC28246e
    /* renamed from: b */
    public Context mo100596b() {
        return this.f70852b;
    }

    /* renamed from: q */
    private boolean m103455q() {
        if (this.f70867s != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private void m103456r() {
        VirtualLayoutManager virtualLayoutManager = new VirtualLayoutManager(this.f70852b);
        this.f70859k = virtualLayoutManager;
        this.f70860l = new C28277b(virtualLayoutManager, true);
        mo100608n();
    }

    /* renamed from: s */
    private void m103457s() {
        this.f70860l.mo100769b(mo100609o());
        this.f70858j.setAdapter(this.f70860l);
    }

    /* renamed from: k */
    public void mo100605k() {
        C28184h.m103250d("Engine", "refresh");
        if (!m103455q()) {
            this.f70853c.mo100002b();
            AbstractC28238b bVar = this.f70863o;
            if (bVar != null) {
                bVar.mo99982a();
            }
        }
    }

    /* renamed from: p */
    private void m103454p() {
        if (!this.f70865q.mo100038b()) {
            C28082d.m102671g().mo99980f();
            this.f70867s = -1;
            C27700a.m101234a(C27702b.f69223T, this.f70866r);
            this.f70865q.mo100033a(StatusController.Status.ERROR);
        }
    }

    /* renamed from: n */
    public void mo100608n() {
        BannerRecyclerView bannerRecyclerView = new BannerRecyclerView(this.f70852b);
        this.f70858j = bannerRecyclerView;
        bannerRecyclerView.setLayoutManager(this.f70859k);
        this.f70858j.setItemAnimator(null);
        this.f70858j.setFocusableInTouchMode(false);
        this.f70858j.setClipChildren(false);
        this.f70858j.setOverScrollMode(2);
    }

    /* renamed from: o */
    public List<C28277b.AbstractC28278a> mo100609o() {
        LinkedList linkedList = new LinkedList();
        List<NodeParams> children = this.f70856h.getChildren();
        if (children == null) {
            return Collections.emptyList();
        }
        for (int i = 0; i < children.size(); i++) {
            NodeParams nodeParams = children.get(i);
            if (TextUtils.equals(nodeParams.getComponentName(), "Header")) {
                m103451a(nodeParams);
            } else {
                linkedList.addAll(this.f70861m.mo99879a(nodeParams));
            }
        }
        return linkedList;
    }

    /* renamed from: l */
    public void mo100606l() {
        long j;
        int i;
        if (!this.f70865q.mo100040d()) {
            C28082d.m102671g().mo99978d();
            if (m103455q()) {
                j = System.currentTimeMillis() - this.f70867s;
            } else {
                j = 0;
            }
            this.f70867s = -1;
            OPMonitor monitorCode = C27700a.m101232a("op_workplace_event").setMonitorCode(C27702b.f69222S);
            Boolean bool = this.f70868t;
            if (bool == null || !bool.booleanValue()) {
                i = 0;
            } else {
                i = 1;
            }
            monitorCode.addCategoryValue("use_cache", Integer.valueOf(i)).setDuration(j).setResultTypeSuccess().tracing(this.f70866r).flush();
            this.f70865q.mo100033a(StatusController.Status.CONTENT);
        }
    }

    /* renamed from: a */
    private void m103451a(NodeParams nodeParams) {
        C28184h.m103250d("Engine", "convertHeaderComponent>>> header:" + nodeParams);
        boolean j = C28037d.m102481j(nodeParams);
        this.f70854d.mo99202a(j);
        this.f70854d.mo99200a(this.f70852b, C28037d.m102483l(nodeParams));
        C27710b.m101248A("header");
        UserSP.getInstance().putBoolean("workplace_show_title", j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m103452a(Boolean bool) {
        C28184h.m103250d("Engine", "onChange>>>" + bool);
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            C28184h.m103250d("Engine", "onChange>>> receive dataReady. change to content");
            if (m103455q()) {
                this.f70858j.setVisibility(0);
            } else {
                mo100606l();
            }
        } else if (this.f70865q.mo100040d()) {
            C28184h.m103250d("Engine", "onChange>>> receive dataError. current is content. return.");
        } else {
            C28184h.m103250d("Engine", "onChange>>> receive dataError. current is not content. change to error");
            m103454p();
        }
    }

    @Override // com.ss.android.appcenter.engine.AbstractC28246e
    /* renamed from: a */
    public int mo100591a(String str) {
        C28184h.m103250d("Engine", "getUniqueInt>>> key:" + str);
        Integer num = f70849f.get(str);
        if (num != null) {
            return num.intValue();
        }
        int i = f70850g;
        f70850g = i + 1;
        Integer valueOf = Integer.valueOf(i);
        f70849f.put(str, valueOf);
        C28184h.m103250d("Engine", "getUniqueInt>>> value:" + valueOf);
        return valueOf.intValue();
    }

    @Override // com.ss.android.appcenter.business.tab.business.p1273a.C27800k.AbstractC27804b
    /* renamed from: a */
    public void mo99212a(C27733c cVar) {
        this.f70853c.mo99997a(this.f70862n);
        AbstractC28238b bVar = this.f70863o;
        if (bVar != null) {
            bVar.mo99983a(this.f70862n);
        }
        this.f70854d.mo99201a(cVar.f69305c);
        this.f70865q.mo100033a(StatusController.Status.LOADING);
        m103450a((AbstractC28241a) new C28091f(this.f70852b, this.f70866r, cVar), false);
    }

    /* renamed from: a */
    public void m103453b(C28243c cVar) {
        C28184h.m103250d("Engine", "bindTemplate>>>");
        if (!this.f70855e) {
            this.f70855e = true;
            this.f70854d.mo99201a(cVar.f70880b);
        }
        if (this.f70863o != null) {
            C28184h.m103250d("Engine", "bindTemplate>>> destory old dataService");
            this.f70863o.mo99983a(this.f70862n);
        }
        if (cVar.mo100631g()) {
            C28184h.m103250d("Engine", "bindTemplate>>> chango to ClientUpdate.");
            this.f70865q.mo100033a(StatusController.Status.UPGRADE);
            this.f70867s = -1;
            C28082d.m102671g().mo99980f();
        } else if (cVar.mo100628d()) {
            C28184h.m103250d("Engine", "bindTemplate>>> chango to error.");
            m103454p();
        } else {
            C28082d.m102671g().mo99973a(cVar.mo100629e());
            if (this.f70868t == null) {
                this.f70868t = Boolean.valueOf(cVar.mo100629e());
            }
            C28184h.m103250d("Engine", "bindTemplate>>> update Template. bind new DataService.");
            if (this.f70856h != null) {
                C28184h.m103250d("Engine", "bindTemplate>>> current root is not null. chango to Loading");
                this.f70865q.mo100033a(StatusController.Status.LOADING);
            }
            this.f70856h = cVar.mo100623a();
            mo100593a(this.f70864p.mo99868a(), this.f70856h);
            m103457s();
        }
    }

    /* renamed from: a */
    public void mo100595a(AbstractC28244c cVar, AbstractC28245d dVar) {
        this.f70857i = cVar;
        this.f70861m = dVar;
    }

    public C28231a(Context context, OPTrace oPTrace) {
        this.f70852b = context;
        this.f70866r = oPTrace;
        m103456r();
    }

    /* renamed from: a */
    private void m103450a(AbstractC28241a aVar, boolean z) {
        this.f70853c = aVar;
        aVar.mo99998a(this.f70862n, new AbstractC1178x() {
            /* class com.ss.android.appcenter.engine.$$Lambda$a$V9_jQUCWXG0xnp35lYNb9Dptng */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C28231a.this.m103453b((C28243c) obj);
            }
        });
        this.f70853c.mo100003b(this.f70862n, new AbstractC1178x<List<C27733c>>() {
            /* class com.ss.android.appcenter.engine.C28231a.C282332 */

            /* renamed from: a */
            public void onChanged(List<C27733c> list) {
                C28184h.m103250d("Engine", "onChanged>>> templateInfoList:" + list);
                C27733c cVar = (C27733c) C28182f.m103235a(list, 0, null);
                if (!C28231a.this.f70855e && cVar != null) {
                    C28231a.this.f70855e = true;
                    C28231a.this.f70854d.mo99201a(cVar.f69305c);
                }
                C28231a.this.f70854d.mo99199a(C28231a.this.f70852b, C28231a.this, list);
            }
        });
        this.f70853c.mo100001a(new C28091f.AbstractC28094a() {
            /* class com.ss.android.appcenter.engine.C28231a.C282343 */

            @Override // com.ss.android.appcenter.business.tab.fragmentv3.C28091f.AbstractC28094a
            /* renamed from: a */
            public boolean mo100006a() {
                if (!C28231a.this.f70851a.mo99867f()) {
                    return false;
                }
                C28177b.m103225b(C28231a.this.f70852b, C28231a.this.f70852b.getString(R.string.OpenPlatform_Workplace_NewUpdatesTtl), C28231a.this.f70852b.getString(R.string.OpenPlatform_Workplace_NewUpdatesMsg), C28231a.this.f70852b.getString(R.string.OpenPlatform_Workplace_UpdateNowBttn), C28231a.this.f70852b.getString(R.string.OpenPlatform_Workplace_NewUpdatesLaterBttn), new DialogInterface.OnClickListener() {
                    /* class com.ss.android.appcenter.engine.C28231a.C282343.DialogInterface$OnClickListenerC282351 */

                    public void onClick(DialogInterface dialogInterface, int i) {
                        C28231a.this.f70853c.mo100004c();
                        C28231a.this.f70853c.mo100002b();
                        C28184h.m103250d("Engine", "bindTemplate>>> click confirm");
                    }
                }, new DialogInterface.OnClickListener() {
                    /* class com.ss.android.appcenter.engine.C28231a.C282343.DialogInterface$OnClickListenerC282362 */

                    public void onClick(DialogInterface dialogInterface, int i) {
                        C28184h.m103250d("Engine", "bindTemplate>>> click cancel");
                        C28231a.this.f70853c.mo100004c();
                    }
                });
                return true;
            }
        });
        if (z) {
            this.f70853c.mo99996a();
        } else {
            this.f70853c.mo100002b();
        }
    }

    /* renamed from: a */
    public void mo100593a(AbstractC28238b bVar, NodeParams nodeParams) {
        AbstractC28238b bVar2 = this.f70863o;
        if (bVar2 != null) {
            bVar2.mo99983a(this.f70862n);
        }
        this.f70863o = bVar;
        bVar.mo99984a(this.f70862n, new AbstractC1178x() {
            /* class com.ss.android.appcenter.engine.$$Lambda$a$iXjr1cRS8CIaOuT08eRpfFweXbg */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C28231a.this.m103452a((C28231a) ((Boolean) obj));
            }
        });
        this.f70863o.mo99986a(nodeParams);
    }

    /* renamed from: a */
    public void mo100592a(Fragment fragment, AbstractC28247f fVar, AbstractC28241a aVar, AbstractC28239c cVar, StatusController statusController, C27800k kVar) {
        this.f70862n = fragment;
        this.f70851a = fVar;
        this.f70865q = statusController;
        this.f70854d = kVar;
        this.f70864p = cVar;
        this.f70858j.mo100420a(new BannerRecyclerView.AbstractC28212a() {
            /* class com.ss.android.appcenter.engine.C28231a.C282321 */

            @Override // com.ss.android.appcenter.common.view.BannerRecyclerView.AbstractC28212a
            /* renamed from: b */
            public void mo99722b() {
            }

            @Override // com.ss.android.appcenter.common.view.BannerRecyclerView.AbstractC28212a
            /* renamed from: a */
            public void mo99721a() {
                C28231a.this.mo100606l();
            }
        });
        m103450a(aVar, true);
    }
}
