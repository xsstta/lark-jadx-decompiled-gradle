package com.ss.android.lark.core.p1772j.p1773a;

import android.view.View;
import com.ss.android.lark.biz.core.api.AbstractC29561h;
import com.ss.android.lark.biz.im.api.AbstractC29623p;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterCustomStatus;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.ding.helper.AbstractC36654g;
import com.ss.android.lark.ding.helper.C36653f;
import com.ss.android.lark.main.interfaces.AbstractC44499a;
import com.ss.android.lark.main.interfaces.AbstractC44500b;
import com.ss.android.lark.main.interfaces.AbstractC44501d;
import com.ss.android.lark.main.interfaces.IChatterPushListener;
import com.ss.android.lark.main.p2231a.AbstractC44177c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.platform.lifecycle.ComponentCallbacks2C51833b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.core.j.a.c */
public class C36172c implements AbstractC44177c {

    /* renamed from: a */
    public final Map<AbstractC44500b, AbstractC29561h> f93389a = new ConcurrentHashMap();

    /* renamed from: b */
    public final Map<AbstractC44501d, AbstractC36654g.AbstractC36656b> f93390b = new ConcurrentHashMap();

    /* renamed from: c */
    public final Map<AbstractC44499a, AbstractC49379a> f93391c = new ConcurrentHashMap();

    /* renamed from: d */
    public final Map<IChatterPushListener, AbstractC29623p> f93392d = new ConcurrentHashMap();

    @Override // com.ss.android.lark.main.p2231a.AbstractC44177c
    /* renamed from: a */
    public void mo133383a(AbstractC44499a aVar) {
        if (aVar != null) {
            $$Lambda$c$8Vm7S4WkbkkurDkky3JVKurs818 r0 = new AbstractC49379a() {
                /* class com.ss.android.lark.core.p1772j.p1773a.$$Lambda$c$8Vm7S4WkbkkurDkky3JVKurs818 */

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
                    C36172c.lambda$8Vm7S4WkbkkurDkky3JVKurs818(AbstractC44499a.this, dVar);
                }
            };
            this.f93391c.put(aVar, r0);
            C36083a.m141486a().getPassportDependency().mo133064a(r0);
        }
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44177c
    /* renamed from: b */
    public void mo133387b(AbstractC44499a aVar) {
        AbstractC49379a remove;
        if (aVar != null && (remove = this.f93391c.remove(aVar)) != null) {
            C36083a.m141486a().getPassportDependency().mo133076b(remove);
        }
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44177c
    /* renamed from: a */
    public void mo133384a(final AbstractC44500b bVar) {
        if (bVar != null) {
            C361742 r0 = new AbstractC29561h() {
                /* class com.ss.android.lark.core.p1772j.p1773a.C36172c.C361742 */

                @Override // com.ss.android.lark.biz.core.api.AbstractC29561h
                /* renamed from: a */
                public void mo102523a(Class cls) {
                    bVar.mo157410a(cls);
                }
            };
            this.f93389a.put(bVar, r0);
            ComponentCallbacks2C51833b.m200969a(r0);
        }
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44177c
    /* renamed from: b */
    public void mo133388b(AbstractC44500b bVar) {
        AbstractC29561h remove;
        if (bVar != null && (remove = this.f93389a.remove(bVar)) != null) {
            ComponentCallbacks2C51833b.m200973b(remove);
        }
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44177c
    /* renamed from: a */
    public void mo133385a(IChatterPushListener cVar) {
        $$Lambda$c$PHLlGBswCyCg2Q1KQKy99bTH24c r0 = new AbstractC29623p() {
            /* class com.ss.android.lark.core.p1772j.p1773a.$$Lambda$c$PHLlGBswCyCg2Q1KQKy99bTH24c */

            @Override // com.ss.android.lark.biz.im.api.AbstractC29623p
            public final void onPushChatter(Chatter chatter) {
                C36172c.lambda$PHLlGBswCyCg2Q1KQKy99bTH24c(IChatterPushListener.this, chatter);
            }
        };
        this.f93392d.put(cVar, r0);
        C36083a.m141486a().getIMDependency().mo132846a(r0);
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44177c
    /* renamed from: b */
    public void mo133389b(IChatterPushListener cVar) {
        AbstractC29623p remove = this.f93392d.remove(cVar);
        if (remove != null) {
            C36083a.m141486a().getIMDependency().mo132894b(remove);
        }
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44177c
    /* renamed from: a */
    public void mo133386a(final AbstractC44501d dVar) {
        if (dVar != null) {
            C361731 r0 = new AbstractC36654g.AbstractC36656b() {
                /* class com.ss.android.lark.core.p1772j.p1773a.C36172c.C361731 */

                @Override // com.ss.android.lark.ding.helper.AbstractC36654g.AbstractC36656b
                /* renamed from: a */
                public void mo133391a(View view, boolean z) {
                    dVar.mo157419a(view, z);
                }
            };
            this.f93390b.put(dVar, r0);
            C36653f.m144655a(r0);
        }
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44177c
    /* renamed from: b */
    public void mo133390b(AbstractC44501d dVar) {
        if (dVar != null) {
            AbstractC36654g.AbstractC36656b remove = this.f93390b.remove(dVar);
            if (dVar != null) {
                C36653f.m144656b(remove);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m142378a(IChatterPushListener cVar, Chatter chatter) {
        cVar.mo157411a(chatter.getId(), ChatterCustomStatus.toPB(chatter.getCustomStatus()));
    }
}
