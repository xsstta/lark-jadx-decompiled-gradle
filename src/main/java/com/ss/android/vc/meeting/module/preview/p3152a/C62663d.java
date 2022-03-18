package com.ss.android.vc.meeting.module.preview.p3152a;

import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.response.JoinMeetingEntity;
import com.ss.android.vc.meeting.module.lobby.AbsJoinLobbyIntercept;
import com.ss.android.vc.meeting.module.preview.AbstractC62650a;
import com.ss.android.vc.meeting.module.preview.AbstractC62712e;
import com.ss.android.vc.meeting.module.preview.AbstractC62746h;
import com.ss.android.vc.meeting.module.preview.p3152a.C62656a;
import com.ss.android.vc.meeting.module.preview.p3152a.C62663d;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.C63603f;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vc.trace.VCLauncherStatistics;

/* renamed from: com.ss.android.vc.meeting.module.preview.a.d */
public class C62663d extends AbstractC62712e<C62656a.AbstractC62657a, C62656a.AbstractC62659b, C62656a.AbstractC62659b.AbstractC62660a, C62656a.AbstractC62657a.AbstractC62658a> {
    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C62656a.AbstractC62659b.AbstractC62660a mo216568e() {
        return new C62666b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C62656a.AbstractC62657a.AbstractC62658a mo216569f() {
        return new C62665a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C62656a.AbstractC62657a mo216567d() {
        return new C62662c();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.preview.a.d$a */
    public class C62665a extends AbstractC62712e.C62713a implements C62656a.AbstractC62657a.AbstractC62658a {
        @Override // com.ss.android.vc.meeting.module.preview.p3152a.C62656a.AbstractC62657a.AbstractC62658a
        /* renamed from: i */
        public String mo216555i() {
            return ((C62656a.AbstractC62659b) C62663d.this.getView()).mo216556a();
        }

        private C62665a() {
            super();
        }
    }

    /* renamed from: p */
    public String mo216573p() {
        return ((C62656a.AbstractC62659b) getView()).mo216556a();
    }

    /* renamed from: q */
    public void mo216574q() {
        ((C62656a.AbstractC62659b) getView()).mo216559b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.preview.a.d$b */
    public class C62666b extends AbstractC62712e.AbstractC62714b implements C62656a.AbstractC62659b.AbstractC62660a {
        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b.AbstractC62654a
        /* renamed from: b */
        public void mo216546b() {
            ((C62656a.AbstractC62659b) C62663d.this.getView()).mo216538k();
            VCLauncherStatistics.m250423a(VCLauncherStatistics.SCENE.NUMBER_JOIN);
            ((C62656a.AbstractC62657a) C62663d.this.getModel()).mo216553a(new AbsJoinLobbyIntercept<JoinMeetingEntity>() {
                /* class com.ss.android.vc.meeting.module.preview.p3152a.C62663d.C62666b.C626671 */

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m245145a() {
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m245146a(VideoChat videoChat) {
                    ((C62656a.AbstractC62657a) C62663d.this.getModel()).mo216506a(videoChat);
                }

                /* renamed from: a */
                public void onLobbySuccess(JoinMeetingEntity joinMeetingEntity) {
                    C63693e.m249689e();
                    ((C62656a.AbstractC62659b) C62663d.this.getView()).mo216528a($$Lambda$d$b$1$SXkI9KZwldIKvLw_tOHDKInxag.INSTANCE);
                    ((C62656a.AbstractC62657a) C62663d.this.getModel()).mo216507a(joinMeetingEntity.f152601b, joinMeetingEntity.f152603d);
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    VCLauncherStatistics.m250426d();
                    C63693e.m249689e();
                    ((C62656a.AbstractC62657a) C62663d.this.getModel()).mo216554e();
                    ((C62656a.AbstractC62659b) C62663d.this.getView()).mo216558a(eVar);
                    VCLauncherStatistics.m250426d();
                    ((C62656a.AbstractC62659b) C62663d.this.getView()).mo216528a((AbstractC62650a.AbstractC62655c) null);
                }

                /* renamed from: b */
                public void onNoLobbySuccess(JoinMeetingEntity joinMeetingEntity) {
                    if (joinMeetingEntity.f152600a != JoinMeetingEntity.Type.SUCCESS) {
                        VCLauncherStatistics.m250426d();
                        C63693e.m249689e();
                        ((C62656a.AbstractC62657a) C62663d.this.getModel()).mo216554e();
                        ((C62656a.AbstractC62659b) C62663d.this.getView()).mo216557a(joinMeetingEntity, C62663d.this.mo216666g());
                    } else if (joinMeetingEntity.f152601b != null) {
                        VCLauncherStatistics.m250424b();
                        C63693e.m249688d();
                        VideoChat videoChat = joinMeetingEntity.f152601b;
                        C63603f.m249427a(joinMeetingEntity);
                        C60700b.m235841a(videoChat, "Entry", "StateEngine", "joinMeetingNumber", "MeetingPreviewMeetingNumberPresenter", "sendJoinMeetingRequest sendVideoChatToStateMachine");
                        ((C62656a.AbstractC62659b) C62663d.this.getView()).mo216528a(new AbstractC62650a.AbstractC62655c(videoChat) {
                            /* class com.ss.android.vc.meeting.module.preview.p3152a.$$Lambda$d$b$1$gfcLWlz1g7xfOMTOvVTSmSxVJI */
                            public final /* synthetic */ VideoChat f$1;

                            {
                                this.f$1 = r2;
                            }

                            @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62655c
                            public final void onPageDismiss() {
                                C62663d.C62666b.C626671.this.m245146a((C62663d.C62666b.C626671) this.f$1);
                            }
                        });
                    } else {
                        VCLauncherStatistics.m250426d();
                        C63693e.m249689e();
                        ((C62656a.AbstractC62657a) C62663d.this.getModel()).mo216554e();
                        C60738ac.m236023a((int) R.string.View_M_FailedToJoinMeeting);
                        ((C62656a.AbstractC62659b) C62663d.this.getView()).mo216528a((AbstractC62650a.AbstractC62655c) null);
                    }
                }
            }, ((C62656a.AbstractC62659b) C62663d.this.getView()).mo216556a());
        }

        private C62666b() {
            super();
        }
    }

    C62663d(BaseFragment baseFragment, AbstractC62746h hVar) {
        super(baseFragment, hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C62668e mo216565a(BaseFragment baseFragment, AbstractC62746h hVar) {
        return new C62668e(baseFragment, hVar);
    }
}
