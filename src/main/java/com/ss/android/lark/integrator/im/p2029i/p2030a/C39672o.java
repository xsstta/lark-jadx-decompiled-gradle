package com.ss.android.lark.integrator.im.p2029i.p2030a;

import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.biz.core.api.AbstractC29561h;
import com.ss.android.lark.biz.core.api.AbstractC29562i;
import com.ss.android.lark.biz.core.api.AbstractC29589z;
import com.ss.android.lark.biz.core.api.BadgeStyle;
import com.ss.android.lark.biz.core.api.NetworkLevelListener;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.biz.core.api.WSConnState;
import com.ss.android.lark.biz.core.api.ao;
import com.ss.android.lark.biz.core.api.ar;
import com.ss.android.lark.biz.core.api.az;
import com.ss.android.lark.ding.service.AbstractC36675c;
import com.ss.android.lark.feed.dto.NetworkLevel;
import com.ss.android.lark.feed.interfaces.AbstractC38085a;
import com.ss.android.lark.feed.interfaces.AbstractC38087ab;
import com.ss.android.lark.feed.interfaces.AbstractC38088ac;
import com.ss.android.lark.feed.interfaces.AbstractC38089ad;
import com.ss.android.lark.feed.interfaces.AbstractC38090ae;
import com.ss.android.lark.feed.interfaces.AbstractC38092c;
import com.ss.android.lark.feed.interfaces.AbstractC38096g;
import com.ss.android.lark.feed.interfaces.AbstractC38097h;
import com.ss.android.lark.feed.interfaces.AbstractC38101j;
import com.ss.android.lark.feed.interfaces.AbstractC38102k;
import com.ss.android.lark.feed.interfaces.AbstractC38103l;
import com.ss.android.lark.feed.interfaces.AbstractC38104m;
import com.ss.android.lark.feed.interfaces.ITimeFormatSettingObserver;
import com.ss.android.lark.feed.p1871b.AbstractC38067b;
import com.ss.android.lark.feed.p1871b.C38068c;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.p2026f.C39587a;
import com.ss.android.lark.passport.signinsdk_api.entity.DevicesStatus;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49399l;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49400m;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.integrator.im.i.a.o */
public class C39672o implements AbstractC38067b {

    /* renamed from: a */
    public final Map<AbstractC38085a, AbstractC49379a> f101176a = new ConcurrentHashMap();

    /* renamed from: b */
    private Map<AbstractC38092c, AbstractC29561h> f101177b = new ConcurrentHashMap();

    /* renamed from: c */
    private Map<AbstractC38102k, C38068c.AbstractC38069a> f101178c = new ConcurrentHashMap();

    /* renamed from: d */
    private Map<AbstractC38104m, AbstractC49400m> f101179d = new ConcurrentHashMap();

    /* renamed from: e */
    private Map<AbstractC38103l, AbstractC49399l> f101180e = new ConcurrentHashMap();

    /* renamed from: f */
    private Map<AbstractC38096g, WSConnState.AbstractC29537a> f101181f = new ConcurrentHashMap();

    /* renamed from: g */
    private Map<AbstractC38090ae, az> f101182g = new ConcurrentHashMap();

    /* renamed from: h */
    private Map<AbstractC38087ab, AbstractC29562i> f101183h = new ConcurrentHashMap();

    /* renamed from: i */
    private Map<AbstractC38087ab, AbstractC29589z> f101184i = new ConcurrentHashMap();

    /* renamed from: j */
    private Map<ITimeFormatSettingObserver, ao> f101185j = new ConcurrentHashMap();

    /* renamed from: k */
    private Map<AbstractC38088ac, ar> f101186k = new ConcurrentHashMap();

    /* renamed from: l */
    private Map<AbstractC38097h, AbstractC36675c.AbstractC36676a> f101187l = new ConcurrentHashMap();

    /* renamed from: m */
    private Map<AbstractC38089ad, NetworkLevelListener> f101188m = new ConcurrentHashMap();

    /* renamed from: n */
    private Map<AbstractC38101j, C28513a.AbstractC28515b> f101189n = new ConcurrentHashMap();

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: a */
    public void mo139338a(final AbstractC38102k kVar) {
        if (kVar != null) {
            C396775 r0 = new C38068c.AbstractC38069a() {
                /* class com.ss.android.lark.integrator.im.p2029i.p2030a.C39672o.C396775 */

                @Override // com.ss.android.lark.feed.p1871b.C38068c.AbstractC38069a
                /* renamed from: a */
                public void mo139353a() {
                    kVar.mo138080a();
                }
            };
            this.f101178c.put(kVar, r0);
            C38068c.m149768a(r0);
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: a */
    public void mo139340a(final AbstractC38104m mVar) {
        if (mVar != null) {
            C396786 r0 = new AbstractC49400m() {
                /* class com.ss.android.lark.integrator.im.p2029i.p2030a.C39672o.C396786 */

                @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49400m
                /* renamed from: a */
                public void mo133520a(DevicesStatus.DeviceStatus deviceStatus) {
                    mVar.mo138559a();
                }
            };
            this.f101179d.put(mVar, r0);
            C39603g.m157159a().getPassportDependency().mo143664a(r0);
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: b */
    public void mo139352b(AbstractC38104m mVar) {
        if (mVar != null) {
            C39603g.m157159a().getPassportDependency().mo143671b(this.f101179d.remove(mVar));
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: a */
    public void mo139339a(final AbstractC38103l lVar) {
        if (lVar != null) {
            C396797 r0 = new AbstractC49399l() {
                /* class com.ss.android.lark.integrator.im.p2029i.p2030a.C39672o.C396797 */

                @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49399l
                /* renamed from: a */
                public void mo143847a(boolean z) {
                    lVar.mo138560a(z);
                }
            };
            this.f101180e.put(lVar, r0);
            C39603g.m157159a().getPassportDependency().mo143663a(r0);
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: b */
    public void mo139351b(AbstractC38103l lVar) {
        if (lVar != null) {
            C39603g.m157159a().getPassportDependency().mo143670b(this.f101180e.remove(lVar));
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: a */
    public void mo139336a(final AbstractC38097h hVar) {
        if (hVar != null) {
            C396753 r0 = new AbstractC36675c.AbstractC36676a() {
                /* class com.ss.android.lark.integrator.im.p2029i.p2030a.C39672o.C396753 */

                @Override // com.ss.android.lark.ding.service.AbstractC36675c.AbstractC36676a
                /* renamed from: a */
                public void mo135279a(int i) {
                    hVar.mo138471a(i);
                }
            };
            this.f101187l.put(hVar, r0);
            C39587a.m157080a().mo135089c().mo135272a(r0);
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: b */
    public void mo139349b(AbstractC38097h hVar) {
        if (hVar != null) {
            C39587a.m157080a().mo135089c().mo135274b(this.f101187l.remove(hVar));
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: a */
    public void mo139337a(final AbstractC38101j jVar) {
        if (jVar != null) {
            C28513a.m104513a(new C28513a.AbstractC28515b() {
                /* class com.ss.android.lark.integrator.im.p2029i.p2030a.C39672o.C396764 */

                @Override // com.ss.android.lark.account_provider.integrator.C28513a.AbstractC28515b
                public void onLoginStatusChanged(boolean z) {
                    jVar.mo138441a(z);
                }
            });
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: b */
    public void mo139350b(AbstractC38102k kVar) {
        if (kVar != null) {
            C38068c.m149769b(this.f101178c.remove(kVar));
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: a */
    public void mo139328a(final ITimeFormatSettingObserver iTimeFormatSettingObserver) {
        if (iTimeFormatSettingObserver != null) {
            AnonymousClass12 r0 = new ao() {
                /* class com.ss.android.lark.integrator.im.p2029i.p2030a.C39672o.AnonymousClass12 */

                @Override // com.ss.android.lark.biz.core.api.ao
                public void onTimeFormatChange(TimeFormatSetting timeFormatSetting) {
                    iTimeFormatSettingObserver.mo137403a(timeFormatSetting.mo105510a().getNumber());
                }
            };
            this.f101185j.put(iTimeFormatSettingObserver, r0);
            C39603g.m157159a().getCoreDependency().mo143470a(r0);
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: b */
    public void mo139341b(ITimeFormatSettingObserver iTimeFormatSettingObserver) {
        if (iTimeFormatSettingObserver != null) {
            C39603g.m157159a().getCoreDependency().mo143540b(this.f101185j.remove(iTimeFormatSettingObserver));
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: a */
    public void mo139329a(AbstractC38085a aVar) {
        if (aVar != null) {
            $$Lambda$o$TFeFpggTyEVaNLhSKJo3lmteee8 r0 = new AbstractC49379a() {
                /* class com.ss.android.lark.integrator.im.p2029i.p2030a.$$Lambda$o$TFeFpggTyEVaNLhSKJo3lmteee8 */

                @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                /* renamed from: a */
                public /* synthetic */ void mo102549a(C49380b bVar) {
                    AbstractC49379a.CC.$default$a(this, bVar);
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                /* renamed from: a */
                public /* synthetic */ void mo102550a(C49381c cVar) {
                    AbstractC49379a.CC.$default$a(this, cVar);
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                public final void onUserSwitchSuccess(C49382d dVar) {
                    C39672o.lambda$TFeFpggTyEVaNLhSKJo3lmteee8(AbstractC38085a.this, dVar);
                }
            };
            this.f101176a.put(aVar, r0);
            C39603g.m157159a().getPassportDependency().mo143662a(r0);
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: b */
    public void mo139342b(AbstractC38085a aVar) {
        AbstractC49379a remove;
        if (aVar != null && (remove = this.f101176a.remove(aVar)) != null) {
            C39603g.m157159a().getPassportDependency().mo143669b(remove);
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: a */
    public void mo139330a(final AbstractC38087ab abVar) {
        if (abVar != null) {
            AnonymousClass11 r0 = new AbstractC29562i() {
                /* class com.ss.android.lark.integrator.im.p2029i.p2030a.C39672o.AnonymousClass11 */

                @Override // com.ss.android.lark.biz.core.api.AbstractC29562i
                /* renamed from: a */
                public void mo105758a(BadgeStyle badgeStyle) {
                    abVar.mo137282a();
                }
            };
            $$Lambda$o$cBvxxz5RHHT9ueoObncaY3bhbd8 r1 = new AbstractC29589z() {
                /* class com.ss.android.lark.integrator.im.p2029i.p2030a.$$Lambda$o$cBvxxz5RHHT9ueoObncaY3bhbd8 */

                @Override // com.ss.android.lark.biz.core.api.AbstractC29589z
                public final void onMuteBadgeShowStateChanged(boolean z) {
                    C39672o.lambda$cBvxxz5RHHT9ueoObncaY3bhbd8(AbstractC38087ab.this, z);
                }
            };
            this.f101183h.put(abVar, r0);
            this.f101184i.put(abVar, r1);
            C39603g.m157159a().getCoreDependency().mo143474a(r0);
            C39603g.m157159a().getCoreDependency().mo143480a(r1);
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: b */
    public void mo139343b(AbstractC38087ab abVar) {
        if (abVar != null) {
            C39603g.m157159a().getCoreDependency().mo143544b(this.f101183h.remove(abVar));
            C39603g.m157159a().getCoreDependency().mo143548b(this.f101184i.remove(abVar));
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: a */
    public void mo139331a(final AbstractC38088ac acVar) {
        if (acVar != null) {
            C396742 r0 = new ar() {
                /* class com.ss.android.lark.integrator.im.p2029i.p2030a.C39672o.C396742 */

                @Override // com.ss.android.lark.biz.core.api.ar
                /* renamed from: a */
                public void mo105603a(boolean z) {
                    acVar.mo138485a(z);
                }
            };
            this.f101186k.put(acVar, r0);
            C39603g.m157159a().getCoreDependency().mo143471a(r0);
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: b */
    public void mo139344b(AbstractC38088ac acVar) {
        if (acVar != null) {
            C39603g.m157159a().getCoreDependency().mo143541b(this.f101186k.remove(acVar));
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: a */
    public void mo139332a(final AbstractC38089ad adVar) {
        if (adVar != null) {
            C396819 r0 = new NetworkLevelListener() {
                /* class com.ss.android.lark.integrator.im.p2029i.p2030a.C39672o.C396819 */

                @Override // com.ss.android.lark.biz.core.api.NetworkLevelListener
                public void onNetworkLevelChanged(NetworkLevelListener.NetworkLevel networkLevel) {
                    adVar.mo138499a(NetworkLevel.forNumber(networkLevel.getValue()));
                }
            };
            this.f101188m.put(adVar, r0);
            C39603g.m157159a().getCoreDependency().mo143463a(r0);
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: b */
    public void mo139345b(AbstractC38089ad adVar) {
        if (adVar != null) {
            C39603g.m157159a().getCoreDependency().mo143533b(this.f101188m.remove(adVar));
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: a */
    public void mo139333a(final AbstractC38090ae aeVar) {
        if (aeVar != null) {
            AnonymousClass10 r0 = new az() {
                /* class com.ss.android.lark.integrator.im.p2029i.p2030a.C39672o.AnonymousClass10 */

                @Override // com.ss.android.lark.biz.core.api.az
                /* renamed from: a */
                public void mo105622a(boolean z) {
                    aeVar.mo138483a(z);
                }

                @Override // com.ss.android.lark.biz.core.api.az
                /* renamed from: b */
                public void mo105623b(boolean z) {
                    aeVar.mo138484b(z);
                }
            };
            this.f101182g.put(aeVar, r0);
            C39603g.m157159a().getCoreDependency().mo143472a(r0);
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: b */
    public void mo139346b(AbstractC38090ae aeVar) {
        if (aeVar != null) {
            C39603g.m157159a().getCoreDependency().mo143542b(this.f101182g.remove(aeVar));
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: a */
    public void mo139334a(final AbstractC38092c cVar) {
        if (cVar != null) {
            C396731 r0 = new AbstractC29561h() {
                /* class com.ss.android.lark.integrator.im.p2029i.p2030a.C39672o.C396731 */

                @Override // com.ss.android.lark.biz.core.api.AbstractC29561h
                /* renamed from: a */
                public void mo102523a(Class cls) {
                    cVar.mo138472a(cls);
                }
            };
            this.f101177b.put(cVar, r0);
            C39603g.m157159a().getCoreDependency().mo143473a(r0);
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: b */
    public void mo139347b(AbstractC38092c cVar) {
        if (cVar != null) {
            C39603g.m157159a().getCoreDependency().mo143543b(this.f101177b.remove(cVar));
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: a */
    public void mo139335a(final AbstractC38096g gVar) {
        if (gVar != null) {
            C396808 r0 = new WSConnState.AbstractC29537a() {
                /* class com.ss.android.lark.integrator.im.p2029i.p2030a.C39672o.C396808 */

                @Override // com.ss.android.lark.biz.core.api.WSConnState.AbstractC29537a
                /* renamed from: a */
                public void mo102563a(WSConnState.ConnState connState) {
                    boolean z;
                    AbstractC38096g gVar = gVar;
                    if (connState == WSConnState.ConnState.Connected) {
                        z = true;
                    } else {
                        z = false;
                    }
                    gVar.mo138502a(z);
                }
            };
            this.f101181f.put(gVar, r0);
            C39603g.m157159a().getCoreDependency().mo143464a(r0);
        }
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38067b
    /* renamed from: b */
    public void mo139348b(AbstractC38096g gVar) {
        if (gVar != null) {
            C39603g.m157159a().getCoreDependency().mo143534b(this.f101181f.remove(gVar));
        }
    }
}
