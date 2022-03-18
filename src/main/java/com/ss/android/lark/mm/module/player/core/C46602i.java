package com.ss.android.lark.mm.module.player.core;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.live.settings.C41524a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.module.highlight.timeline.HightlightTimeLine;
import com.ss.android.lark.mm.module.player.core.C46684m;
import com.ss.android.lark.mm.module.player.core.layer.AbstractC46619b;
import com.ss.android.lark.mm.module.player.core.layer.C46613a;
import com.ss.android.lark.mm.module.player.core.layer.p2310a.C46614a;
import com.ss.android.lark.mm.module.player.core.layer.p2312c.AbstractC46626a;
import com.ss.android.lark.mm.module.player.core.layer.p2312c.C46627b;
import com.ss.android.lark.mm.module.player.core.layer.p2313d.C46633b;
import com.ss.android.lark.mm.module.player.core.layer.p2314e.C46639b;
import com.ss.android.lark.mm.module.player.core.layer.p2315f.C46644b;
import com.ss.android.lark.mm.module.player.core.layer.p2317h.C46651b;
import com.ss.android.lark.mm.module.player.core.layer.p2318i.C46659b;
import com.ss.android.lark.mm.module.player.core.layer.p2319j.C46665b;
import com.ss.android.lark.mm.module.player.core.layer.p2320k.C46672b;
import com.ss.android.lark.mm.module.player.core.p2309a.C46594a;
import com.ss.android.lark.mm.module.player.p2308a.C46587a;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.settings.MmFeatureSettingConfig;
import com.ss.android.lark.mm.settings.MmTTDNSServerHostConfig;
import com.ss.android.lark.mm.settings.MmVideoEngineConfig;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.videoshop.api.AbstractC64092a;
import com.ss.android.videoshop.context.VideoContext;
import com.ss.android.videoshop.mediaview.SimpleMediaView;
import com.ss.android.videoshop.p3195b.C64116b;
import com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a;
import com.ss.android.videoshop.p3199e.C64159a;
import com.ss.android.videoshop.p3200f.C64161a;
import com.ss.android.videoshop.p3202h.C64169a;
import com.ss.ttvideoengine.DataLoaderListener;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.VideoEventListener;
import com.ss.ttvideoengine.log.VideoEventManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.codec.p3491a.C69743a;
import org.apache.commons.codec.p3492b.C69745a;

/* renamed from: com.ss.android.lark.mm.module.player.core.i */
public class C46602i implements AbstractC46595b {

    /* renamed from: l */
    private static boolean f117247l;

    /* renamed from: a */
    private AbstractC46598e f117248a;

    /* renamed from: b */
    private AbstractC46597d f117249b;

    /* renamed from: c */
    private SimpleMediaView f117250c;

    /* renamed from: d */
    private C46691q f117251d;

    /* renamed from: e */
    private C64116b f117252e;

    /* renamed from: f */
    private AbstractC46626a f117253f;

    /* renamed from: g */
    private C64161a f117254g;

    /* renamed from: h */
    private boolean f117255h;

    /* renamed from: i */
    private boolean f117256i;

    /* renamed from: j */
    private float f117257j = 1.0f;

    /* renamed from: k */
    private int f117258k;

    /* renamed from: m */
    private String f117259m;

    /* renamed from: n */
    private boolean f117260n = true;

    /* renamed from: o */
    private List<AbstractC46596c> f117261o = new CopyOnWriteArrayList();

    /* renamed from: p */
    private final VideoEventListener f117262p = new MmTTVideoEventListener();

    /* renamed from: q */
    private final DataLoaderListener f117263q = new C46600g();

    /* renamed from: r */
    private List<Integer> f117264r = new ArrayList();

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46595b
    /* renamed from: a */
    public AbstractC46598e mo163685a() {
        return this.f117248a;
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46595b
    /* renamed from: b */
    public AbstractC46597d mo163686b() {
        return this.f117249b;
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46595b
    /* renamed from: c */
    public AbstractC46626a mo163687c() {
        return this.f117253f;
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46595b
    /* renamed from: d */
    public SimpleMediaView mo163688d() {
        return this.f117250c;
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46595b
    /* renamed from: e */
    public C64161a mo163689e() {
        return this.f117254g;
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46595b
    /* renamed from: g */
    public float mo163691g() {
        return this.f117257j;
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46595b
    /* renamed from: h */
    public boolean mo163692h() {
        return this.f117260n;
    }

    /* renamed from: i */
    public void mo163736i() {
        C46691q qVar = this.f117251d;
        if (qVar != null) {
            qVar.mo163959a();
        }
        SimpleMediaView simpleMediaView = this.f117250c;
        if (simpleMediaView != null) {
            simpleMediaView.mo222424l();
            return;
        }
        C64161a aVar = this.f117254g;
        if (aVar != null) {
            aVar.mo222268d();
        }
    }

    /* renamed from: j */
    public boolean mo163737j() {
        SimpleMediaView simpleMediaView = this.f117250c;
        if (simpleMediaView == null) {
            C45855f.m181666e("MmPlayerAdapter", "[isToolBarLayerVisible] mMediaView is null");
            return false;
        }
        AbstractC64153a a = simpleMediaView.mo222388a(C46613a.f117305h);
        if (a instanceof C46672b) {
            return ((C46672b) a).mo163922l();
        }
        return false;
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46596c
    /* renamed from: l */
    public void mo163694l() {
        for (AbstractC46596c cVar : this.f117261o) {
            cVar.mo163694l();
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46596c
    /* renamed from: m */
    public void mo163695m() {
        for (AbstractC46596c cVar : this.f117261o) {
            cVar.mo163695m();
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46596c
    /* renamed from: n */
    public void mo163696n() {
        for (AbstractC46596c cVar : this.f117261o) {
            cVar.mo163696n();
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46596c
    /* renamed from: o */
    public void mo163697o() {
        for (AbstractC46596c cVar : this.f117261o) {
            cVar.mo163697o();
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46596c
    /* renamed from: p */
    public void mo163698p() {
        for (AbstractC46596c cVar : this.f117261o) {
            cVar.mo163698p();
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46596c
    /* renamed from: q */
    public void mo163699q() {
        for (AbstractC46596c cVar : this.f117261o) {
            cVar.mo163699q();
        }
    }

    /* renamed from: r */
    private void m184336r() {
        if (!f117247l) {
            f117247l = true;
            try {
                TTVideoEngine.setDataLoaderListener(this.f117263q);
                TTVideoEngine.startDataLoader(C45899c.m181859a().getContextDepend().mo144557a());
            } catch (Exception e) {
                Log.m165383e("MmPlayerAdapter", "start data load error: " + e.getMessage());
            }
        }
    }

    /* renamed from: k */
    private void m184335k() {
        boolean z;
        VideoEventManager.instance.setListener(this.f117262p);
        VideoEventManager.instance.setLoggerVersion(2);
        MmTTDNSServerHostConfig e = new C41524a().mo149417e();
        if (e.getUseCache() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f117260n = z;
        String h = C45899c.m181859a().getDomainDepend().mo144623h();
        TTVideoEngine.setTTDNSServerHost(h);
        TTVideoEngine.setIntValue(7, 1);
        TTVideoEngine.setIntValue(8, 1);
        TTVideoEngine.setIntValue(90, e.getMainParseType());
        TTVideoEngine.setIntValue(91, e.getBackupParseType());
        TTVideoEngine.setIntValue(92, e.getSwitchTime());
        TTVideoEngine.setStringValue(ActivityIdentificationData.WALKING, h);
        TTVideoEngine.setStringValue(0, C57881t.m224646r(C45899c.m181859a().getContextDepend().mo144557a()));
        TTVideoEngine.setIntValue(1, e.getMaxCacheSize());
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46595b
    /* renamed from: f */
    public C64116b mo163690f() {
        boolean z;
        if (this.f117252e == null) {
            C64116b bVar = new C64116b();
            this.f117252e = bVar;
            bVar.mo221927a(new Bundle());
            C64169a.C64171a aVar = new C64169a.C64171a();
            aVar.mo222322a(LocationRequest.PRIORITY_HD_ACCURACY);
            this.f117252e.mo221928a(aVar.mo222323a());
            this.f117252e.mo221936c("normalvideo");
            if (this.f117256i) {
                this.f117252e.mo221938d("vc_minutes_podcast");
            } else if (this.f117255h) {
                this.f117252e.mo221938d("vc_minutes_record");
            } else {
                this.f117252e.mo221938d("vc_minutes");
            }
            this.f117252e.mo221932a(C47057a.m186234a().headersMap);
            if (this.f117260n && this.f117259m.startsWith("http")) {
                this.f117252e.mo221947h(new String(C69743a.m267688a(C69745a.m267697b(this.f117259m))));
                this.f117252e.mo221945g(this.f117259m);
            }
            this.f117252e.mo221930a(true);
            C41524a aVar2 = new C41524a();
            MmFeatureSettingConfig d = aVar2.mo149415d();
            C46684m.C46686a a = new C46684m.C46686a().mo163946a(true).mo163944a(aVar2.mo149417e().getSingleLimitSize());
            if (!this.f117255h) {
                a = a.mo163947a(d.isPlayerEnableHardwareDecode(), this.f117258k);
            }
            if (!this.f117255h && !this.f117256i) {
                MmVideoEngineConfig f = aVar2.mo149419f();
                if (f.getEnableNearestSample() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                a = a.mo163949b(z).mo163945a(f.getNearestMaxPosOffset(), f.getCacheMaxSeconds());
            }
            SimpleMediaView simpleMediaView = this.f117250c;
            if (simpleMediaView != null) {
                simpleMediaView.setVideoEngineFactory(a.mo163948a());
                this.f117250c.mo222391a(this.f117252e, true);
            } else {
                this.f117254g.mo222262a(a.mo163948a());
                this.f117254g.mo222264a(this.f117252e);
            }
        }
        return this.f117252e;
    }

    /* renamed from: a */
    public void mo163730a(AbstractC46599f fVar) {
        this.f117251d.mo163961a(fVar);
    }

    /* renamed from: b */
    public void mo163733b(AbstractC46596c cVar) {
        this.f117261o.remove(cVar);
    }

    /* renamed from: a */
    private void m184331a(SimpleMediaView simpleMediaView) {
        if (simpleMediaView != null) {
            simpleMediaView.setAttachListener(new AbstractC64092a() {
                /* class com.ss.android.lark.mm.module.player.core.C46602i.C466031 */

                @Override // com.ss.android.videoshop.api.AbstractC64092a
                /* renamed from: a */
                public void mo163738a(SimpleMediaView simpleMediaView) {
                }

                @Override // com.ss.android.videoshop.api.AbstractC64092a
                /* renamed from: a */
                public void mo163739a(SimpleMediaView simpleMediaView, boolean z) {
                }

                @Override // com.ss.android.videoshop.api.AbstractC64092a
                /* renamed from: b */
                public void mo163740b(SimpleMediaView simpleMediaView) {
                    if (!simpleMediaView.mo222425m()) {
                        simpleMediaView.mo222424l();
                        C64159a.m252080a("MmPlayerAdapter", "detachCurrent release simpleMediaView:" + hashCode());
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void mo163732b(float f) {
        this.f117257j = f;
        this.f117251d.mo163960a(f);
        this.f117249b.mo163701a(f);
    }

    /* renamed from: b */
    private void m184333b(C46605j jVar) {
        if (jVar.mo163747c()) {
            this.f117259m = jVar.mo163743a();
        } else {
            this.f117259m = jVar.mo163746b();
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46596c
    /* renamed from: a */
    public void mo163693a(float f) {
        for (AbstractC46596c cVar : this.f117261o) {
            cVar.mo163693a(f);
        }
    }

    /* renamed from: c */
    private void m184334c(C46605j jVar) {
        if (jVar.mo163750f() == null) {
            if (jVar.mo163749e() != null) {
                jVar.mo163744a(jVar.mo163749e().getContext());
            } else {
                jVar.mo163744a(C45851c.m181646a());
            }
        }
        if (jVar.mo163749e() == null) {
            jVar.mo163745a(new MmSimpleMediaView(jVar.mo163750f()));
        }
    }

    /* renamed from: b */
    public void mo163734b(AbstractC46599f fVar) {
        this.f117251d.mo163969b(fVar);
    }

    /* renamed from: a */
    private void m184330a(C46605j jVar) {
        if (jVar.mo163747c()) {
            this.f117249b.mo163709c(jVar.mo163748d());
            this.f117249b.mo163705a(jVar.mo163743a());
            this.f117249b.mo163704a((long) C46587a.m184214a(jVar.mo163751g()), jVar.mo163753i());
            if (jVar.f117283l != null) {
                m184332a(this.f117250c, jVar.f117283l.f117286b, jVar.f117283l.f117285a, jVar.mo163752h());
                return;
            }
            return;
        }
        this.f117249b.mo163707b(jVar.mo163746b());
    }

    /* renamed from: b */
    public void mo163735b(boolean z) {
        if (this.f117250c == null) {
            C45855f.m181666e("MmPlayerAdapter", "[editModeChange] mMediaView is null");
            return;
        }
        ArrayList<AbstractC64153a> arrayList = new ArrayList();
        arrayList.add(this.f117250c.mo222388a(C46613a.f117299b));
        arrayList.add(this.f117250c.mo222388a(C46613a.f117301d));
        arrayList.add(this.f117250c.mo222388a(C46613a.f117309l));
        arrayList.add(this.f117250c.mo222388a(C46613a.f117305h));
        for (AbstractC64153a aVar : arrayList) {
            if (aVar instanceof AbstractC46619b) {
                AbstractC46619b bVar = (AbstractC46619b) aVar;
                if (bVar.bh_() != null) {
                    bVar.mo163781a(z);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo163728a(HightlightTimeLine hightlightTimeLine) {
        if (this.f117250c == null) {
            C45855f.m181666e("MmPlayerAdapter", "[updateCommentList] mMediaView is null");
            return;
        }
        ArrayList<AbstractC64153a> arrayList = new ArrayList();
        arrayList.add(this.f117250c.mo222388a(C46613a.f117305h));
        arrayList.add(this.f117250c.mo222388a(C46613a.f117299b));
        for (AbstractC64153a aVar : arrayList) {
            if (aVar instanceof AbstractC46619b) {
                AbstractC46619b bVar = (AbstractC46619b) aVar;
                if (bVar.bh_() != null) {
                    bVar.mo163780a(hightlightTimeLine);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo163729a(AbstractC46596c cVar) {
        if (!this.f117261o.contains(cVar)) {
            this.f117261o.add(cVar);
        }
    }

    /* renamed from: a */
    public void mo163731a(boolean z) {
        if (this.f117250c == null) {
            C45855f.m181666e("MmPlayerAdapter", "[setCommentSwitchState] mMediaView is null");
            return;
        }
        ArrayList<AbstractC64153a> arrayList = new ArrayList();
        arrayList.add(this.f117250c.mo222388a(C46613a.f117299b));
        arrayList.add(this.f117250c.mo222388a(C46613a.f117305h));
        for (AbstractC64153a aVar : arrayList) {
            if (aVar instanceof AbstractC46619b) {
                AbstractC46619b bVar = (AbstractC46619b) aVar;
                if (bVar.bh_() != null) {
                    bVar.mo163784b(z);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo163727a(int i, int i2) {
        SimpleMediaView simpleMediaView = this.f117250c;
        if (simpleMediaView == null) {
            C45855f.m181666e("MmPlayerAdapter", "[updateStartTime] mMediaView is null");
            return;
        }
        AbstractC64153a a = simpleMediaView.mo222388a(C46613a.f117299b);
        if (a instanceof C46614a) {
            C46614a aVar = (C46614a) a;
            if (aVar.bh_() != null) {
                aVar.mo163779a(i, i2);
            }
        }
        AbstractC64153a a2 = this.f117250c.mo222388a(C46613a.f117305h);
        if (a2 instanceof C46672b) {
            ((C46672b) a2).mo163921a((long) i, (long) i2);
        }
    }

    public C46602i(C46605j jVar, boolean z) {
        this.f117255h = z;
        this.f117256i = jVar.f117282k;
        m184335k();
        m184336r();
        m184333b(jVar);
        if (!jVar.f117282k) {
            m184334c(jVar);
            SimpleMediaView e = jVar.mo163749e();
            this.f117250c = e;
            if (e != null) {
                VideoContext a = VideoContext.m251724a(e.getContext());
                if (this.f117250c.getContext() instanceof FragmentActivity) {
                    a.mo222015a(((FragmentActivity) this.f117250c.getContext()).getLifecycle(), new C46594a(a));
                }
            }
            if (!this.f117255h) {
                this.f117258k = jVar.mo163754j();
            }
            this.f117249b = new C46689o(this);
            this.f117248a = new C46690p(this, this.f117250c.getVideoStateInquirer());
            VideoContext a2 = VideoContext.m251724a(this.f117250c.getContext());
            a2.mo222034b(this.f117250c.getLayerHostMediaLayout());
            C46691q qVar = new C46691q(this);
            this.f117251d = qVar;
            a2.mo222017a(qVar);
            m184331a(this.f117250c);
        } else {
            this.f117254g = new C64161a();
            this.f117249b = new C46689o(this);
            this.f117248a = new C46690p(this, this.f117254g.mo222269e());
            C46692r rVar = new C46692r(this);
            this.f117251d = rVar;
            rVar.mo163968a(true);
            this.f117254g.mo222263a(this.f117251d);
        }
        m184330a(jVar);
    }

    /* renamed from: a */
    private void m184332a(SimpleMediaView simpleMediaView, String str, String str2, String str3) {
        if (simpleMediaView != null) {
            C46627b bVar = new C46627b(str, str2);
            bVar.mo163824a(str3);
            this.f117253f = new C46601h(this, bVar);
            List<AbstractC64153a> arrayList = new ArrayList<>();
            final C46614a aVar = new C46614a(this.f117253f);
            final C46644b bVar2 = new C46644b(this.f117253f);
            final C46639b bVar3 = new C46639b(this.f117253f);
            final C46672b bVar4 = new C46672b(this.f117253f);
            arrayList.add(bVar4);
            arrayList.add(bVar3);
            arrayList.add(bVar2);
            arrayList.add(new C46633b(this.f117253f));
            arrayList.add(aVar);
            final C46665b bVar5 = new C46665b(this.f117253f);
            bVar.mo163823a(new C46627b.AbstractC46628a() {
                /* class com.ss.android.lark.mm.module.player.core.C46602i.C466042 */

                @Override // com.ss.android.lark.mm.module.player.core.layer.p2312c.C46627b.AbstractC46628a
                /* renamed from: a */
                public void mo163741a() {
                    bVar5.mo163885e();
                }

                @Override // com.ss.android.lark.mm.module.player.core.layer.p2312c.C46627b.AbstractC46628a
                /* renamed from: a */
                public void mo163742a(float f) {
                    aVar.mo163778a(f);
                    bVar2.mo163853a(f);
                    bVar3.mo163849a(f);
                    bVar4.mo163920a(f);
                }
            });
            arrayList.add(bVar5);
            arrayList.add(new C46651b(this.f117253f));
            arrayList.add(new C46659b(this.f117253f));
            simpleMediaView.mo222393a(arrayList);
            for (AbstractC64153a aVar2 : arrayList) {
                this.f117264r.add(Integer.valueOf(aVar2.mo163783b()));
            }
        }
    }
}
