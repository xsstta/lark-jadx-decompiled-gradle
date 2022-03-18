package com.ss.android.vc.meeting.module.follow.p3121b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.doc.follow.AbstractC5415a;
import com.bytedance.ee.bear.doc.follow.AbstractC5419b;
import com.bytedance.ee.bear.doc.follow.event.AbstractC5430a;
import com.bytedance.ee.bear.doc.follow.event.ContentEvent;
import com.bytedance.ee.bear.doc.follow.event.KeyboardStateChangedEvent;
import com.bytedance.ee.bear.doc.follow.event.LoadStateChangedEvent;
import com.bytedance.ee.bear.doc.follow.event.OpenLinkEvent;
import com.bytedance.ee.bear.doc.follow.event.PositionKeeperApiCreatedEvent;
import com.bytedance.ee.bear.doc.follow.event.PresenterLocationChangedEvent;
import com.bytedance.ee.bear.doc.follow.event.TitleChangedEvent;
import com.bytedance.ee.bear.doc.follow.impl.rn.AbstractC5440a;
import com.bytedance.ee.bear.doc.follow.impl.rn.RNFollowEvent;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.entity.follow.FollowDataType;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.entity.follow.FollowPatch;
import com.ss.android.vc.entity.follow.FollowState;
import com.ss.android.vc.entity.follow.FollowStrategy;
import com.ss.android.vc.entity.follow.FollowWebData;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.follow.base.AbstractC61785c;
import com.ss.android.vc.meeting.module.follow.base.BaseFollowRuntime;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.statistics.event.C63769r;
import com.ss.android.vc.statistics.event.C63770s;
import com.ss.android.vc.statistics.event.C63774v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ss.android.vc.meeting.module.follow.b.a */
public class C61773a extends BaseFollowRuntime implements AbstractC5419b.AbstractC5420a, AbstractC5430a {

    /* renamed from: d */
    protected volatile boolean f155027d;

    /* renamed from: e */
    protected AbstractC5419b f155028e;

    /* renamed from: f */
    protected Fragment f155029f;

    /* renamed from: g */
    public Handler f155030g;

    /* renamed from: h */
    private C61303k f155031h;

    /* renamed from: i */
    private Runnable f155032i = new Runnable() {
        /* class com.ss.android.vc.meeting.module.follow.p3121b.C61773a.RunnableC617741 */

        public void run() {
            if (C61773a.this.f155030g != null) {
                C61773a.this.f155030g.postDelayed(this, 2000);
            }
            if (C61773a.this.f155028e != null) {
                C61773a.this.f155028e.getStates(C61773a.this);
            }
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public String mo214011y() {
        return "ccm";
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: w */
    public Fragment mo214009w() {
        return this.f155029f;
    }

    /* renamed from: G */
    private boolean m241290G() {
        return C63634c.m249496b("byteview.callmeeting.android.back_to_last_location");
    }

    /* renamed from: B */
    private void m241285B() {
        C63770s.m250364b();
        this.f155028e.registerRNEventHandler("FOLLOW_ACTION_VERSION_LAG", $$Lambda$buGNYzjUMRkWColnGZZF1HCrXCY.INSTANCE);
    }

    /* renamed from: C */
    private void m241286C() {
        this.f155028e.registerRNEventHandler("FOLLOW_TRACK", $$Lambda$yPsQGssZFlkAm3aVRoESgF77VOY.INSTANCE);
    }

    /* renamed from: D */
    private void m241287D() {
        this.f155028e.registerRNEventHandler("FOLLOW_ACTION_LIFECYCLE_CHANGE", new AbstractC5440a() {
            /* class com.ss.android.vc.meeting.module.follow.p3121b.$$Lambda$a$vmJ_Cu03Y7Oo3vtm2EGV_E881o */

            @Override // com.bytedance.ee.bear.doc.follow.impl.rn.AbstractC5440a
            public final void onEvent(RNFollowEvent rNFollowEvent) {
                C61773a.this.m241295b((C61773a) rNFollowEvent);
            }
        });
    }

    /* renamed from: E */
    private void m241288E() {
        this.f155028e.registerRNEventHandler("FOLLOW_ACTION_CHANGE_LIST", new AbstractC5440a() {
            /* class com.ss.android.vc.meeting.module.follow.p3121b.$$Lambda$a$foSClNqmRkHQ4b3RZnrsWV2p52A */

            @Override // com.bytedance.ee.bear.doc.follow.impl.rn.AbstractC5440a
            public final void onEvent(RNFollowEvent rNFollowEvent) {
                C61773a.this.m241293a((C61773a) rNFollowEvent);
            }
        });
    }

    /* renamed from: F */
    private String m241289F() {
        return "{\"uuid\":\"" + UUID.randomUUID() + "\"}";
    }

    /* renamed from: I */
    private void m241292I() {
        if (this.f155030g != null) {
            C60700b.m235851b("FollowLog_CCMFollowRuntime", "[startSyncFollowActionsTimer]", "startSyncFollowActionsTimer");
            this.f155030g.postDelayed(this.f155032i, 1000);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: u */
    public void mo214007u() {
        mo214012z();
        if (this.f155028e != null) {
            C60700b.m235851b("FollowLog_CCMFollowRuntime", "[startReplay]", "startReplay");
            this.f155028e.startReplay();
            mo214040s().f155056e.set(true);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: x */
    public void mo214010x() {
        C60700b.m235851b("FollowLog_CCMFollowRuntime", "[dealWithTransPresenter]", "isSharing = " + mo214034m());
        mo214000A();
    }

    /* renamed from: H */
    private String m241291H() {
        FollowStrategy followStrategy;
        if (mo214026f() == null || mo214026f().getStrategies() == null || mo214026f().getStrategies().size() <= 0 || (followStrategy = mo214026f().getStrategies().get(0)) == null) {
            return mo214011y();
        }
        return followStrategy.getId();
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: v */
    public void mo214008v() {
        if (this.f155028e != null && mo214040s().f155056e.get()) {
            C60700b.m235851b("FollowLog_CCMFollowRuntime", "[stopReplay]", "stopReplay");
            this.f155028e.stopReplay();
            mo214040s().f155056e.set(false);
        }
    }

    /* renamed from: z */
    public void mo214012z() {
        if (this.f155028e != null && mo214040s().f155055d.get()) {
            C60700b.m235851b("FollowLog_CCMFollowRuntime", "[stopRecord]", "stopRecord");
            this.f155028e.stopRecord();
            mo214040s().f155055d.set(false);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b, com.ss.android.vc.meeting.module.follow.base.BaseFollowRuntime
    /* renamed from: a */
    public void mo214001a() {
        super.mo214001a();
        C60700b.m235851b("FollowLog_CCMFollowRuntime", "[destroy]", "destroy");
        Handler handler = this.f155030g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f155030g = null;
        }
        mo214012z();
        mo214008v();
        AbstractC5419b bVar = this.f155028e;
        if (bVar != null) {
            bVar.unregisterRNEventHandler("FOLLOW_ACTION_VERSION_LAG");
            this.f155028e.unregisterRNEventHandler("FOLLOW_TRACK");
            this.f155028e.unregisterRNEventHandler("FOLLOW_ACTION_LIFECYCLE_CHANGE");
            this.f155028e = null;
        }
        this.f155029f = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo214000A() {
        AbstractC5419b bVar;
        if (this.f155027d) {
            mo214039r().mo213899y();
        }
        String[] strArr = null;
        if (mo214034m()) {
            mo214040s().f155052a = BaseFollowRuntime.RuntimeStatus.PRESENTING;
            Map<String, List<FollowState>> j = mo214030j();
            if (!CollectionUtils.isEmpty(j)) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, List<FollowState>> entry : j.entrySet()) {
                    FollowStrategy a = mo214016a(mo214026f(), entry.getKey());
                    if (a != null && a.isCanBeReactivated()) {
                        List<FollowState> value = entry.getValue();
                        for (int i = 0; i < value.size(); i++) {
                            arrayList.add(value.get(i).getPayload());
                        }
                    }
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            C60700b.m235851b("FollowLog_CCMFollowRuntime", "[dealWithPresenterFollower]", "followStats = " + Arrays.toString(strArr));
            if (m241290G()) {
                mo214005b(new String[0]);
            } else {
                mo214005b(strArr);
            }
            if (!C60742af.m236059a(mo214026f().getStrategies()) && (bVar = this.f155028e) != null) {
                bVar.updateOptions(mo214026f().getStrategies().get(0).getSettings());
            }
            m241292I();
            if (mo214039r() != null) {
                mo214039r().mo213876c(false);
                return;
            }
            return;
        }
        mo214012z();
        mo214021a(mo214038q(), false);
        Handler handler = this.f155030g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m241293a(RNFollowEvent rNFollowEvent) {
        C63769r.m250346b(rNFollowEvent, this);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m241295b(RNFollowEvent rNFollowEvent) {
        C63769r.m250337a(rNFollowEvent, this);
    }

    /* renamed from: b */
    public void mo214005b(String[] strArr) {
        mo214008v();
        if (this.f155028e != null) {
            C60700b.m235851b("FollowLog_CCMFollowRuntime", "[startRecord]", "followStates = " + Arrays.toString(strArr));
            this.f155028e.startRecord(this, strArr);
            mo214040s().f155055d.set(true);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: c */
    public void mo214006c(List<FollowPatch> list) {
        if (this.f155027d) {
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = list.get(i).getPayload();
            }
            C60700b.m235844a("FollowLog_CCMFollowRuntime", "[applyPatch]", Arrays.toString(strArr), 16000);
            AbstractC5419b bVar = this.f155028e;
            if (bVar != null) {
                bVar.setStates(strArr, m241289F());
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: b */
    public void mo214004b(List<FollowState> list) {
        if (this.f155027d) {
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = list.get(i).getPayload();
            }
            C63774v.m250396f();
            C63774v.m250386a((C61303k) MeetingManager.m238341a().mo211906j(), mo214026f(), 0);
            C60700b.m235844a("FollowLog_CCMFollowRuntime", "[applyState]", Arrays.toString(strArr), 16000);
            AbstractC5419b bVar = this.f155028e;
            if (bVar != null) {
                bVar.setStates(strArr, m241289F());
            }
        }
    }

    @Override // com.bytedance.ee.bear.doc.follow.AbstractC5419b.AbstractC5420a
    /* renamed from: a */
    public void mo21678a(String[] strArr) {
        if (!mo214040s().f155054c.get()) {
            C61303k kVar = this.f155031h;
            if ((kVar == null || !kVar.aE().mo208293c() || this.f155031h.aE().mo208292b()) && strArr != null && strArr.length > 0) {
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (!TextUtils.isEmpty(str)) {
                        FollowState followState = new FollowState();
                        FollowWebData followWebData = new FollowWebData();
                        followWebData.setStrategyId(m241291H());
                        followWebData.setPayload(str);
                        followWebData.setId(System.currentTimeMillis());
                        followState.setWebData(followWebData);
                        followState.setDataType(FollowDataType.FOLLOW_WEB_DATA);
                        followState.setSenderId(mo214041t());
                        arrayList.add(followState);
                    }
                }
                mo214019a(arrayList);
            }
        }
    }

    @Override // com.bytedance.ee.bear.doc.follow.event.AbstractC5430a
    /* renamed from: a */
    public boolean mo21709a(ContentEvent contentEvent) {
        if (mo214040s().f155054c.get()) {
            C60700b.m235851b("FollowLog_CCMFollowRuntime", "[onContentEvent]", "isDestroyed: " + contentEvent);
            return false;
        } else if (contentEvent instanceof LoadStateChangedEvent) {
            LoadStateChangedEvent loadStateChangedEvent = (LoadStateChangedEvent) contentEvent;
            C60700b.m235851b("FollowLog_CCMFollowRuntime", "[LoadStateChangedEvent]", "state = " + loadStateChangedEvent.loadState);
            if (loadStateChangedEvent.loadState == LoadStateChangedEvent.LoadState.LoadSuccess) {
                m241285B();
                m241286C();
                m241287D();
                m241288E();
                if (mo214039r() != null) {
                    mo214039r().mo213865a(true, System.currentTimeMillis() - this.f155036a);
                }
                this.f155027d = true;
                mo214000A();
                C63774v.m250392c(MeetingManager.m238341a().mo211906j().mo212056e(), mo214026f());
                C63774v.m250393d();
                C63774v.m250386a((C61303k) MeetingManager.m238341a().mo211906j(), mo214026f(), 0);
            } else if (loadStateChangedEvent.loadState == LoadStateChangedEvent.LoadState.LoadFail) {
                if (mo214039r() != null) {
                    mo214039r().mo213865a(false, 0L);
                }
                C63774v.m250386a((C61303k) MeetingManager.m238341a().mo211906j(), mo214026f(), 2);
            } else if (loadStateChangedEvent.loadState == LoadStateChangedEvent.LoadState.LoadFailAndReplaceDocFragment) {
                if (mo214039r() != null) {
                    mo214039r().mo213849F();
                }
                C63774v.m250386a((C61303k) MeetingManager.m238341a().mo211906j(), mo214026f(), 2);
            } else if (loadStateChangedEvent.loadState == LoadStateChangedEvent.LoadState.LoadWikiToReplaceDoc) {
                this.f155027d = true;
                if (mo214039r() != null) {
                    mo214039r().mo213850G();
                }
            }
            return true;
        } else if (contentEvent instanceof OpenLinkEvent) {
            OpenLinkEvent openLinkEvent = (OpenLinkEvent) contentEvent;
            if (this.f155027d) {
                if (mo214039r() == null || !openLinkEvent.url.startsWith("http")) {
                    C60700b.m235851b("FollowLog_CCMFollowRuntime", "[OpenLinkEvent]", "url = " + openLinkEvent.url);
                } else {
                    mo214039r().mo213870b(openLinkEvent.url, openLinkEvent.title);
                }
                return true;
            } else if (openLinkEvent.url.startsWith("https://accounts.google.com")) {
                C60700b.m235851b("FollowLog_CCMFollowRuntime", "[OpenLinkEvent2]", "can't open google login = " + openLinkEvent.url);
                C60738ac.m236024a(R.drawable.icon_no_support_link_error, R.string.View_VM_UnableToOpenLink, 2000);
                return true;
            } else {
                C60700b.m235851b("FollowLog_CCMFollowRuntime", "[OpenLinkEvent4]", "ccm loading not finish, just return true");
                return true;
            }
        } else if (contentEvent instanceof TitleChangedEvent) {
            TitleChangedEvent titleChangedEvent = (TitleChangedEvent) contentEvent;
            C60700b.m235851b("FollowLog_CCMFollowRuntime", "[TitleChangedEvent]", "");
            if (mo214039r() != null) {
                mo214039r().mo213875c(titleChangedEvent.title);
            }
            return true;
        } else if (contentEvent instanceof KeyboardStateChangedEvent) {
            KeyboardStateChangedEvent keyboardStateChangedEvent = (KeyboardStateChangedEvent) contentEvent;
            C60700b.m235851b("FollowLog_CCMFollowRuntime", "[KeyboardStateChangedEvent]", "isShown = " + keyboardStateChangedEvent.shown);
            if (mo214039r() != null) {
                mo214039r().mo213871b(keyboardStateChangedEvent.shown);
            }
            return true;
        } else if (contentEvent instanceof PresenterLocationChangedEvent) {
            PresenterLocationChangedEvent presenterLocationChangedEvent = (PresenterLocationChangedEvent) contentEvent;
            if (mo214039r() != null) {
                mo214039r().mo213852a(presenterLocationChangedEvent.getFollower(), presenterLocationChangedEvent.getPresenter());
            }
            return true;
        } else if (!(contentEvent instanceof PositionKeeperApiCreatedEvent)) {
            return false;
        } else {
            this.f155037b = ((PositionKeeperApiCreatedEvent) contentEvent).positionKeeperApi;
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m241294a(boolean z, AbstractC5419b bVar) {
        C60700b.m235851b("FollowLog_CCMFollowRuntime", "[onFollowApiCreated]", "isRefresh = " + z + ", " + bVar);
        this.f155028e = bVar;
        bVar.setContentEventHandler(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo214003a(Context context, String str, boolean z) {
        this.f155029f = C61775b.m241311a(context, str, z, new AbstractC5415a(z) {
            /* class com.ss.android.vc.meeting.module.follow.p3121b.$$Lambda$a$DfjQWuzbtAC40sPkXy4_nGw439U */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.bear.doc.follow.AbstractC5415a
            public final void onFollowApiCreated(AbstractC5419b bVar) {
                C61773a.this.m241294a((C61773a) this.f$1, (boolean) bVar);
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.BaseFollowRuntime
    /* renamed from: a */
    public void mo214002a(Context context, FollowInfo followInfo, String str, boolean z) {
        super.mo214002a(context, followInfo, str, z);
        mo214003a(context, followInfo.getUrl(), z);
        this.f155030g = new Handler(Looper.getMainLooper());
        if (!TextUtils.isEmpty(str)) {
            this.f155031h = (C61303k) MeetingManager.m238341a().getMeeting(str);
        }
    }

    public C61773a(Context context, FollowInfo followInfo, String str, AbstractC61785c cVar, boolean z) {
        super(context, followInfo, str, cVar, z);
    }
}
