package com.ss.android.vc.meeting.module.tab.p3168a;

import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.dependency.AbstractC60894j;
import com.ss.android.vc.entity.tab.VCTabTotalMissedCallInfoEntity;
import com.ss.android.vc.meeting.module.foregroundservice.C61869a;
import com.ss.android.vc.meeting.module.tab.detail.VcTabDetailActivity;
import com.ss.android.vc.meeting.module.tab.p3168a.AbstractC63217a;
import com.ss.android.vc.meeting.module.tab3.detail.VcTab3DetailActivity;
import com.ss.android.vc.net.push.VideoChatPush;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.vc.meeting.module.tab.a.b */
public class C63219b implements AbstractC63217a, VideoChatPush.AbstractC63577q {

    /* renamed from: a */
    ConcurrentHashMap<AbstractC63217a.AbstractC63218a, Integer> f159396a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private volatile boolean f159397b;

    /* renamed from: c */
    private int f159398c = 0;

    /* renamed from: d */
    private int f159399d;

    /* renamed from: e */
    private int f159400e = 0;

    /* renamed from: f */
    private boolean f159401f = false;

    /* renamed from: g */
    private AbstractC60894j f159402g = new AbstractC60894j() {
        /* class com.ss.android.vc.meeting.module.tab.p3168a.$$Lambda$b$wIk__7JPkVdC_jZvexWgHkbKY */

        @Override // com.ss.android.vc.dependency.AbstractC60894j
        public final void onConnStateChanged(boolean z) {
            C63219b.this.m247576a((C63219b) z);
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.tab.a.b$a */
    public static class C63223a {

        /* renamed from: a */
        static C63219b f159406a = new C63219b();
    }

    /* renamed from: a */
    public static C63219b m247574a() {
        return C63223a.f159406a;
    }

    /* renamed from: c */
    public boolean mo218812c() {
        if (this.f159398c > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo218813d() {
        VcBizSender.m249246b(new AbstractC63598b<Object>() {
            /* class com.ss.android.vc.meeting.module.tab.p3168a.C63219b.C632212 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VideoChatTab_VideoChatTabManager", "[getMissedRedDotCountRequest2]", "error= " + eVar.toString());
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                if (obj != null) {
                    VCTabTotalMissedCallInfoEntity vCTabTotalMissedCallInfoEntity = (VCTabTotalMissedCallInfoEntity) obj;
                    int i = (int) vCTabTotalMissedCallInfoEntity.mconfirmed_missed_calls;
                    int i2 = (int) vCTabTotalMissedCallInfoEntity.mtotal_missed_calls;
                    C60700b.m235851b("VideoChatTab_VideoChatTabManager", "[getMissedRedDotCountRequest]", "onSuccess confirmed= " + i + " totalMissed= " + i2);
                    C63219b.this.mo218808a(i, i2);
                }
            }
        });
    }

    /* renamed from: f */
    private synchronized void m247579f() {
        if (!this.f159397b) {
            this.f159397b = true;
            VideoChatModule.m235665i().mo208191a(this.f159402g);
        }
    }

    /* renamed from: b */
    public void mo218811b() {
        C60700b.m235851b("VideoChatTab_VideoChatTabManager", "[reload]", "reload");
        C61869a.m241680a().mo214246a(new C61869a.AbstractC61872b() {
            /* class com.ss.android.vc.meeting.module.tab.p3168a.C63219b.C632201 */

            @Override // com.ss.android.vc.meeting.module.foregroundservice.C61869a.AbstractC61872b
            /* renamed from: c */
            public boolean mo214251c() {
                return false;
            }

            @Override // com.ss.android.vc.meeting.module.foregroundservice.C61869a.AbstractC61872b
            /* renamed from: a */
            public void mo212169a(boolean z, long j) {
                C60700b.m235851b("VideoChatTab_VideoChatTabManager", "[getMissedRedDotCountRequest]", "timeOut = [" + z + "], taskTime = [" + j + "]");
                C63219b.this.mo218813d();
            }
        });
    }

    /* renamed from: e */
    public void mo218814e() {
        if (VCAppLifeCycle.m236256c() != null && ((VCAppLifeCycle.m236256c() instanceof VcTabDetailActivity) || (VCAppLifeCycle.m236256c() instanceof VcTab3DetailActivity))) {
            C60700b.m235851b("VideoChatTab_VideoChatTabManager", "[confirmMissedCall]", "topActivity is VcTabDetailActivity.");
        } else if (this.f159398c > 0) {
            C60700b.m235851b("VideoChatTab_VideoChatTabManager", "[confirmMissedCall2]", "confirmed= " + this.f159400e + " red count= " + this.f159398c);
            VcBizSender.m249212a((long) this.f159400e, new AbstractC63598b<Object>() {
                /* class com.ss.android.vc.meeting.module.tab.p3168a.C63219b.C632223 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onSuccess(Object obj) {
                    C60700b.m235851b("VideoChatTab_VideoChatTabManager", "[confirmVCTabMissedCall3]", "success");
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("VideoChatTab_VideoChatTabManager", "[confirmVCTabMissedCall4]", "error: " + eVar.toString());
                }
            });
        }
    }

    /* renamed from: a */
    private void m247575a(int i) {
        this.f159398c = i;
        m247577b(i);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m247576a(boolean z) {
        C60735ab.m236001a(new Runnable(z) {
            /* class com.ss.android.vc.meeting.module.tab.p3168a.$$Lambda$b$ojxwD3I_sjDhfFUlOpD1GW2NqGI */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C63219b.this.m247578b((C63219b) this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m247578b(boolean z) {
        C60700b.m235851b("VideoChatTab_VideoChatTabManager", "[onConnectStateChanged]", "isConnected= " + z);
        if (z) {
            mo218813d();
        }
    }

    /* renamed from: a */
    public void mo218810a(String str) {
        C60700b.m235851b("VideoChatTab_VideoChatTabManager", "[onAccountChanged]", "userId= " + str);
        mo218811b();
        this.f159401f = true;
    }

    /* renamed from: b */
    private void m247577b(int i) {
        C60700b.m235851b("VideoChatTab_VideoChatTabManager", "[notifyBadgeChanged]", "count=" + i);
        for (AbstractC63217a.AbstractC63218a aVar : this.f159396a.keySet()) {
            if (aVar != null) {
                aVar.mo218807a(i);
            }
        }
    }

    @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63577q
    /* renamed from: a */
    public void mo218809a(VCTabTotalMissedCallInfoEntity vCTabTotalMissedCallInfoEntity) {
        if (vCTabTotalMissedCallInfoEntity != null) {
            C60700b.m235851b("VideoChatTab_VideoChatTabManager", "[onPush UserChannel]", "MissEntity = " + vCTabTotalMissedCallInfoEntity.toString());
            m247574a().mo218808a((int) vCTabTotalMissedCallInfoEntity.mconfirmed_missed_calls, (int) vCTabTotalMissedCallInfoEntity.mtotal_missed_calls);
        }
    }

    @Override // com.ss.android.vc.meeting.module.tab.p3168a.AbstractC63217a
    /* renamed from: a */
    public void mo218805a(AbstractC63217a.AbstractC63218a aVar) {
        this.f159396a.put(aVar, 0);
        if (!this.f159397b) {
            m247579f();
            mo218811b();
        } else if (this.f159401f) {
            m247577b(0);
            this.f159401f = false;
        } else {
            m247577b(this.f159398c);
        }
        VideoChatPush.m249004a().mo219722a(this);
    }

    @Override // com.ss.android.vc.meeting.module.tab.p3168a.AbstractC63217a
    /* renamed from: b */
    public void mo218806b(AbstractC63217a.AbstractC63218a aVar) {
        C60700b.m235851b("VideoChatTab_VideoChatTabManager", "[unRegister]", "unRegister");
        this.f159396a.remove(aVar);
        VideoChatPush.m249004a().mo219745b(this);
    }

    /* renamed from: a */
    public void mo218808a(int i, int i2) {
        boolean z;
        Object[] objArr = new Object[3];
        boolean z2 = false;
        if (i >= this.f159399d) {
            z = true;
        } else {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        if (i2 >= this.f159400e) {
            z2 = true;
        }
        objArr[1] = Boolean.valueOf(z2);
        objArr[2] = Boolean.valueOf(this.f159401f);
        C60700b.m235851b("VideoChatTab_VideoChatTabManager", "[setMissedCallInfo]", String.format("confirm is bigger? %b total_miss is bigger? %b isAccountChanged? %b", objArr));
        if (i >= this.f159399d || i2 >= this.f159400e || this.f159401f) {
            m247575a(i2 - i);
            this.f159399d = i;
            this.f159400e = i2;
        }
    }
}
