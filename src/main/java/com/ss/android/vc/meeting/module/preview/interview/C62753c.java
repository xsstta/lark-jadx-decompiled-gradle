package com.ss.android.vc.meeting.module.preview.interview;

import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.response.C60956ac;
import com.ss.android.vc.meeting.module.lobby.AbsJoinLobbyIntercept;
import com.ss.android.vc.meeting.module.preview.AbstractC62650a;
import com.ss.android.vc.meeting.module.preview.AbstractC62712e;
import com.ss.android.vc.meeting.module.preview.AbstractC62746h;
import com.ss.android.vc.meeting.module.preview.interview.C62747a;
import com.ss.android.vc.meeting.module.preview.interview.C62753c;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.statistics.event.C63737ag;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vc.trace.VCLauncherStatistics;

/* renamed from: com.ss.android.vc.meeting.module.preview.interview.c */
public class C62753c extends AbstractC62712e<C62747a.AbstractC62748a, C62747a.AbstractC62750b, C62747a.AbstractC62750b.AbstractC62751a, C62747a.AbstractC62748a.AbstractC62749a> {
    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C62747a.AbstractC62750b.AbstractC62751a mo216568e() {
        return new C62756b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C62747a.AbstractC62748a.AbstractC62749a mo216569f() {
        return new C62755a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C62747a.AbstractC62748a mo216567d() {
        return new C62752b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.preview.interview.c$b */
    public class C62756b extends AbstractC62712e.AbstractC62714b implements C62747a.AbstractC62750b.AbstractC62751a {
        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b.AbstractC62654a
        /* renamed from: b */
        public void mo216546b() {
            ((C62747a.AbstractC62750b) C62753c.this.getView()).mo216538k();
            VCLauncherStatistics.m250423a(VCLauncherStatistics.SCENE.NORMAL_JOIN);
            ((C62747a.AbstractC62748a) C62753c.this.getModel()).mo216747a(new AbsJoinLobbyIntercept<C60956ac>() {
                /* class com.ss.android.vc.meeting.module.preview.interview.C62753c.C62756b.C627571 */

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m245580a() {
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m245581a(VideoChat videoChat) {
                    ((C62747a.AbstractC62748a) C62753c.this.getModel()).mo216506a(videoChat);
                }

                /* renamed from: a */
                public void onLobbySuccess(C60956ac acVar) {
                    C63693e.m249689e();
                    ((C62747a.AbstractC62748a) C62753c.this.getModel()).mo216507a(acVar.f152635a, acVar.f152636b);
                    ((C62747a.AbstractC62750b) C62753c.this.getView()).mo216528a($$Lambda$c$b$1$MSIfYqyyLePIWhkJ3lt8NyWimc.INSTANCE);
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("MeetingPreviewInterviewPresenter", "[sendJoinMeetingRequest2]", "error: " + eVar.toString());
                    VCLauncherStatistics.m250426d();
                    C63693e.m249689e();
                    C63737ag.m250007b("unknown", ((C62747a.AbstractC62748a) C62753c.this.getModel()).mo216748e(), C62753c.this.mo216666g());
                    ((C62747a.AbstractC62750b) C62753c.this.getView()).mo216750a(eVar);
                    ((C62747a.AbstractC62750b) C62753c.this.getView()).mo216528a((AbstractC62650a.AbstractC62655c) null);
                }

                /* renamed from: b */
                public void onNoLobbySuccess(C60956ac acVar) {
                    C60700b.m235851b("MeetingPreviewInterviewPresenter", "[sendJoinMeetingRequest]", "success");
                    if (acVar.f152635a != null) {
                        VCLauncherStatistics.m250424b();
                        C63693e.m249688d();
                        VideoChat videoChat = acVar.f152635a;
                        C60700b.m235841a(videoChat, "Entry", "StateEngine", "joinInterviewMeeting", "MeetingPreviewInterviewPresenter", "[sendJoinMeetingRequest] sendVideoChatToStateMachine");
                        MeetingPreviewInterviewFragment.f157889f.put(((C62747a.AbstractC62748a) C62753c.this.getModel()).mo216748e(), videoChat.getId());
                        ((C62747a.AbstractC62750b) C62753c.this.getView()).mo216528a(new AbstractC62650a.AbstractC62655c(videoChat) {
                            /* class com.ss.android.vc.meeting.module.preview.interview.$$Lambda$c$b$1$tRVn757AQ5LZeagYv4HcLNElbyU */
                            public final /* synthetic */ VideoChat f$1;

                            {
                                this.f$1 = r2;
                            }

                            @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62655c
                            public final void onPageDismiss() {
                                C62753c.C62756b.C627571.this.m245581a((C62753c.C62756b.C627571) this.f$1);
                            }
                        });
                        return;
                    }
                    VCLauncherStatistics.m250426d();
                    C63693e.m249689e();
                    C63737ag.m250007b("unknown", ((C62747a.AbstractC62748a) C62753c.this.getModel()).mo216748e(), C62753c.this.mo216666g());
                    C60738ac.m236023a((int) R.string.View_M_FailedToJoinMeeting);
                    ((C62747a.AbstractC62750b) C62753c.this.getView()).mo216528a((AbstractC62650a.AbstractC62655c) null);
                }
            });
        }

        private C62756b() {
            super();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.preview.interview.c$a */
    public class C62755a extends AbstractC62712e.C62713a implements C62747a.AbstractC62748a.AbstractC62749a {
        private C62755a() {
            super();
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62712e
    /* renamed from: a */
    public void mo216590a(boolean z) {
        super.mo216590a(z);
        ((C62747a.AbstractC62748a) getModel()).o_(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C62758d mo216565a(BaseFragment baseFragment, AbstractC62746h hVar) {
        return new C62758d(baseFragment, hVar);
    }

    C62753c(BaseFragment baseFragment, AbstractC62746h hVar, String str, String str2) {
        super(baseFragment, hVar);
        ((C62752b) getModel()).f157892d = str;
        ((C62752b) getModel()).f157893e = str2;
    }
}
