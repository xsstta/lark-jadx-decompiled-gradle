package com.ss.android.vc.meeting.module.preview.guest;

import android.content.Context;
import com.larksuite.framework.thread.C26171w;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.response.C60971e;
import com.ss.android.vc.meeting.module.preview.AbstractC62712e;
import com.ss.android.vc.meeting.module.preview.AbstractC62746h;
import com.ss.android.vc.meeting.module.preview.guest.C62733a;
import com.ss.android.vc.meeting.module.preview.guest.C62739c;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.statistics.p3180a.C63693e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.meeting.module.preview.guest.c */
public class C62739c extends AbstractC62712e<C62733a.AbstractC62734a, C62733a.AbstractC62736b, C62733a.AbstractC62736b.AbstractC62737a, C62733a.AbstractC62734a.AbstractC62735a> {
    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C62733a.AbstractC62736b.AbstractC62737a mo216568e() {
        return new C62742b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C62733a.AbstractC62734a.AbstractC62735a mo216569f() {
        return new C62741a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C62733a.AbstractC62734a mo216567d() {
        return new MeetingPreviewGuestModel();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.preview.guest.c$b */
    public class C62742b extends AbstractC62712e.AbstractC62714b implements C62733a.AbstractC62736b.AbstractC62737a {
        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b.AbstractC62654a
        /* renamed from: b */
        public void mo216546b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m245526e() {
            ((C62733a.AbstractC62736b) C62739c.this.getView()).mo216538k();
        }

        private C62742b() {
            super();
        }

        @Override // com.ss.android.vc.meeting.module.preview.guest.C62733a.AbstractC62736b.AbstractC62737a
        /* renamed from: a */
        public void mo216727a(Context context) {
            C26171w.m94675a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.preview.guest.$$Lambda$c$b$2Pm7bB3YSyOaV7WRZRfUwQTtRY */

                public final void run() {
                    C62739c.C62742b.this.m245526e();
                }
            });
            GuestJoinMeetingUtil.f157865c = ((C62733a.AbstractC62734a) C62739c.this.getModel()).mo216718f();
            GuestJoinMeetingUtil.f157864b = ((C62733a.AbstractC62734a) C62739c.this.getModel()).mo216717e();
            GuestJoinMeetingUtil.f157866d = mo216547c().mo212721z();
            GuestJoinMeetingUtil.f157867e = ((C62733a.AbstractC62734a) C62739c.this.getModel()).mo216719g();
            GuestJoinMeetingUtil.f157868f = ((C62733a.AbstractC62734a) C62739c.this.getModel()).mo216721i();
            GuestJoinMeetingUtil.f157869g = ((C62733a.AbstractC62734a) C62739c.this.getModel()).mo216720h();
            C62739c.this.mo216729a(context);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m245510t() {
        ((C62733a.AbstractC62736b) getView()).mo216537j();
    }

    /* renamed from: q */
    public String mo216736q() {
        return ((C62733a.AbstractC62736b) getView()).mo216724a();
    }

    /* renamed from: r */
    public String mo216737r() {
        return ((C62733a.AbstractC62736b) getView()).mo216725b();
    }

    /* renamed from: s */
    public void mo216738s() {
        ((C62733a.AbstractC62736b) getView()).bU_();
    }

    /* renamed from: p */
    public void mo216735p() {
        C26171w.m94675a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.preview.guest.$$Lambda$c$gvPoscqE5HMBUykuQWfSbTRu9XA */

            public final void run() {
                C62739c.this.m245510t();
            }
        });
        GuestJoinMeetingUtil.f157863a = 2;
        VideoChatModuleDependency.getLoginDependency().simplifyLogin(ar.m236694a(), "", mo216736q());
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.preview.guest.c$a */
    public class C62741a extends AbstractC62712e.C62713a implements C62733a.AbstractC62734a.AbstractC62735a {
        private C62741a() {
            super();
        }
    }

    /* renamed from: a */
    public void mo216729a(final Context context) {
        if (GuestJoinMeetingUtil.m245479a()) {
            C63693e.m249686c();
            GuestJoinMeetingUtil.m245477a(mo216736q(), new AbstractC63598b<C60971e>() {
                /* class com.ss.android.vc.meeting.module.preview.guest.C62739c.C627401 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("MeetingPreviewGuestPresenter", "[checkGuestJoinMeeting]", "onError: " + eVar);
                    C63693e.m249688d();
                    C62739c.this.mo216735p();
                }

                /* renamed from: a */
                public void onSuccess(C60971e eVar) {
                    C60700b.m235851b("MeetingPreviewGuestPresenter", "[checkGuestJoinMeeting2]", "onSuccess: " + eVar);
                    C63693e.m249688d();
                    try {
                        boolean z = new JSONObject(eVar.f152685a).getBoolean("CanJoinAsGuest");
                        C60700b.m235851b("MeetingPreviewGuestPresenter", "[checkGuestJoinMeeting3]", "canJoinAsGuest: " + z);
                        if (z) {
                            C62739c.this.mo216731b(context);
                        } else {
                            C62739c.this.mo216735p();
                        }
                    } catch (JSONException e) {
                        C63693e.m249689e();
                        e.printStackTrace();
                    }
                }
            });
            return;
        }
        mo216735p();
    }

    /* renamed from: b */
    public void mo216731b(Context context) {
        GuestJoinMeetingUtil.f157870h = mo216737r();
        GuestJoinMeetingUtil.f157863a = 1;
        VideoChatModuleDependency.getLoginDependency().guestLogin(context, mo216737r(), mo216736q(), new MeetingPreviewGuestPresenter$2(this));
    }

    C62739c(BaseFragment baseFragment, AbstractC62746h hVar) {
        super(baseFragment, hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C62743d mo216565a(BaseFragment baseFragment, AbstractC62746h hVar) {
        return new C62743d(baseFragment, hVar);
    }
}
