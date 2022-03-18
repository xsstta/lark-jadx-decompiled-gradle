package com.ss.android.vc.meeting.module.preview.launch;

import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.response.JoinMeetingEntity;
import com.ss.android.vc.meeting.module.lobby.AbsJoinLobbyIntercept;
import com.ss.android.vc.meeting.module.preview.AbstractC62650a;
import com.ss.android.vc.meeting.module.preview.AbstractC62712e;
import com.ss.android.vc.meeting.module.preview.AbstractC62746h;
import com.ss.android.vc.meeting.module.preview.launch.C62760a;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vc.trace.C63784a;
import com.ss.android.vc.trace.VCLauncherStatistics;

/* renamed from: com.ss.android.vc.meeting.module.preview.launch.c */
public class C62766c extends AbstractC62712e<C62760a.AbstractC62761a, C62760a.AbstractC62763b, C62760a.AbstractC62763b.AbstractC62764a, C62760a.AbstractC62761a.AbstractC62762a> {
    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C62760a.AbstractC62763b.AbstractC62764a mo216568e() {
        return new C62769b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C62760a.AbstractC62761a.AbstractC62762a mo216569f() {
        return new C62768a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C62760a.AbstractC62761a mo216567d() {
        return new MeetingPreviewLaunchModel();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.preview.launch.c$a */
    public class C62768a extends AbstractC62712e.C62713a implements C62760a.AbstractC62761a.AbstractC62762a {
        @Override // com.ss.android.vc.meeting.module.preview.launch.C62760a.AbstractC62761a.AbstractC62762a
        /* renamed from: i */
        public String mo216764i() {
            return ((C62760a.AbstractC62763b) C62766c.this.getView()).mo216765a();
        }

        private C62768a() {
            super();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.preview.launch.c$b */
    public class C62769b extends AbstractC62712e.AbstractC62714b implements C62760a.AbstractC62763b.AbstractC62764a {
        @Override // com.ss.android.vc.meeting.module.preview.launch.C62760a.AbstractC62763b.AbstractC62764a
        /* renamed from: e */
        public String mo216769e() {
            return ((C62760a.AbstractC62761a) C62766c.this.getModel()).mo216761e();
        }

        @Override // com.ss.android.vc.meeting.module.preview.launch.C62760a.AbstractC62763b.AbstractC62764a
        /* renamed from: f */
        public String mo216770f() {
            return ((MeetingPreviewLaunchModel) C62766c.this.getModel()).f157898d;
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b.AbstractC62654a
        /* renamed from: b */
        public void mo216546b() {
            ((C62760a.AbstractC62763b) C62766c.this.getView()).mo216538k();
            VCLauncherStatistics.m250423a(VCLauncherStatistics.SCENE.LAUNCH);
            ((C62760a.AbstractC62761a) C62766c.this.getModel()).mo216759a(new AbsJoinLobbyIntercept<JoinMeetingEntity>() {
                /* class com.ss.android.vc.meeting.module.preview.launch.C62766c.C62769b.C627701 */

                /* renamed from: a */
                public void onLobbySuccess(JoinMeetingEntity joinMeetingEntity) {
                    C60700b.m235851b("MeetingPreviewLaunchPre", "[goMeeting]", "[onLobbySuccess]");
                    C63784a.m250431d("[VideoChat_MessagePreAssembler_handleCreateVideoChat]");
                    ((C62760a.AbstractC62761a) C62766c.this.getModel()).mo216509a(true);
                    ((C62760a.AbstractC62763b) C62766c.this.getView()).mo216528a((AbstractC62650a.AbstractC62655c) null);
                    C63693e.m249689e();
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("MeetingPreviewLaunchPre", "[goMeeting4]", "error=" + eVar);
                    VCLauncherStatistics.m250426d();
                    C63693e.m249689e();
                    ((C62760a.AbstractC62763b) C62766c.this.getView()).mo216767a(eVar);
                    ((C62760a.AbstractC62763b) C62766c.this.getView()).mo216528a((AbstractC62650a.AbstractC62655c) null);
                }

                /* renamed from: b */
                public void onNoLobbySuccess(JoinMeetingEntity joinMeetingEntity) {
                    C60700b.m235851b("MeetingPreviewLaunchPre", "[goMeeting2]", "[onNoLobbySuccess]");
                    if (joinMeetingEntity != null) {
                        C63784a.m250431d("[VideoChat_MessagePreAssembler_handleCreateVideoChat]");
                        ((C62760a.AbstractC62761a) C62766c.this.getModel()).mo216509a(true);
                        if (joinMeetingEntity.f152600a == JoinMeetingEntity.Type.SUCCESS) {
                            VideoChat videoChat = joinMeetingEntity.f152601b;
                            if (videoChat != null) {
                                C60700b.m235851b("MeetingPreviewLaunchPre", "[goMeeting3]", "onCreateVideoChatSuccess: conferenceId = " + videoChat.getId());
                            }
                            ((C62760a.AbstractC62763b) C62766c.this.getView()).mo216528a((AbstractC62650a.AbstractC62655c) null);
                            return;
                        }
                        ((C62760a.AbstractC62763b) C62766c.this.getView()).mo216766a(joinMeetingEntity);
                        C63693e.m249689e();
                    }
                }
            });
        }

        private C62769b() {
            super();
        }
    }

    /* renamed from: p */
    public void mo216777p() {
        ((C62760a.AbstractC62763b) getView()).mo216768b();
    }

    /* renamed from: b */
    public void mo216773b(String str) {
        ((C62760a.AbstractC62761a) getModel()).mo216760a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C62771d mo216565a(BaseFragment baseFragment, AbstractC62746h hVar) {
        return new C62771d(baseFragment, hVar);
    }

    C62766c(BaseFragment baseFragment, AbstractC62746h hVar, String str, String str2) {
        super(baseFragment, hVar);
        ((MeetingPreviewLaunchModel) getModel()).f157898d = str;
        ((MeetingPreviewLaunchModel) getModel()).f157899e = str2;
    }
}
