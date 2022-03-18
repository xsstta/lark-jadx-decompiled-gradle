package com.ss.android.vc.meeting.module.preview.calender;

import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.request.JoinCalendarGroupMeetingEntityRequest;
import com.ss.android.vc.entity.response.JoinCalendarGroupMeetingEntity;
import com.ss.android.vc.entity.response.JoinMeetingEntity;
import com.ss.android.vc.meeting.module.lobby.AbsJoinLobbyIntercept;
import com.ss.android.vc.meeting.module.preview.AbstractC62650a;
import com.ss.android.vc.meeting.module.preview.AbstractC62712e;
import com.ss.android.vc.meeting.module.preview.AbstractC62746h;
import com.ss.android.vc.meeting.module.preview.calender.C62697a;
import com.ss.android.vc.meeting.utils.TimeConsumeUtils;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.statistics.event.C63737ag;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vc.trace.VCLauncherStatistics;
import io.reactivex.p3457e.C68296b;

/* renamed from: com.ss.android.vc.meeting.module.preview.calender.c */
public class C62703c extends AbstractC62712e<C62697a.AbstractC62698a, C62697a.AbstractC62700b, C62697a.AbstractC62700b.AbstractC62701a, C62697a.AbstractC62698a.AbstractC62699a> {
    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C62697a.AbstractC62700b.AbstractC62701a mo216568e() {
        return new C62706b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C62697a.AbstractC62698a.AbstractC62699a mo216569f() {
        return new C62705a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C62697a.AbstractC62698a mo216567d() {
        return new C62702b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.preview.calender.c$b */
    public class C62706b extends AbstractC62712e.AbstractC62714b implements C62697a.AbstractC62700b.AbstractC62701a {
        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b.AbstractC62654a
        /* renamed from: b */
        public void mo216546b() {
            ((C62697a.AbstractC62700b) C62703c.this.getView()).mo216538k();
            VCLauncherStatistics.m250423a(VCLauncherStatistics.SCENE.CALENDAR_JOIN);
            if (((C62702b) C62703c.this.getModel()).f157781g == JoinCalendarGroupMeetingEntityRequest.EntrySource.FROM_GROUP) {
                final C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingPreviewCalendarPresenter:clickGoMeetingBtn:[mCalendarSource = from_group]");
                ((C62697a.AbstractC62698a) C62703c.this.getModel()).mo216645b(new AbsJoinLobbyIntercept<JoinMeetingEntity>() {
                    /* class com.ss.android.vc.meeting.module.preview.calender.C62703c.C62706b.C627071 */

                    /* renamed from: b */
                    public void onLobbySuccess(JoinMeetingEntity joinMeetingEntity) {
                        C60700b.m235851b("MeetingPreviewCalendarPresenter", "[clickGoMeetingBtn3]", "[onLobbySuccess]");
                        ((C62697a.AbstractC62700b) C62703c.this.getView()).mo216528a((AbstractC62650a.AbstractC62655c) null);
                        C63693e.m249689e();
                    }

                    /* renamed from: a */
                    public void onNoLobbySuccess(JoinMeetingEntity joinMeetingEntity) {
                        TimeConsumeUtils.m248928a(a);
                        C60700b.m235851b("MeetingPreviewCalendarPresenter", "[clickGoMeetingBtn]", "[onNoLobbySuccess]");
                        if (joinMeetingEntity.f152600a == JoinMeetingEntity.Type.SUCCESS) {
                            VideoChat videoChat = joinMeetingEntity.f152601b;
                            if (videoChat != null) {
                                C60700b.m235851b("MeetingPreviewCalendarPresenter", "[clickGoMeetingBtn2]", "conferenceId = " + videoChat.getId());
                            }
                            ((C62697a.AbstractC62700b) C62703c.this.getView()).mo216528a((AbstractC62650a.AbstractC62655c) null);
                            return;
                        }
                        ((C62697a.AbstractC62700b) C62703c.this.getView()).mo216649a(joinMeetingEntity);
                    }

                    @Override // com.ss.android.vc.net.request.AbstractC63598b
                    public void onError(C63602e eVar) {
                        C60700b.m235864f("MeetingPreviewCalendarPresenter", "[clickGoMeetingBtn4]", "[onError] " + eVar.toString());
                        VCLauncherStatistics.m250426d();
                        C63693e.m249689e();
                        C63737ag.m250005a("unknown", ((C62697a.AbstractC62698a) C62703c.this.getModel()).mo216646e(), C62703c.this.mo216666g());
                        ((C62697a.AbstractC62700b) C62703c.this.getView()).mo216650a(eVar);
                        ((C62697a.AbstractC62700b) C62703c.this.getView()).mo216528a((AbstractC62650a.AbstractC62655c) null);
                    }
                });
                return;
            }
            ((C62697a.AbstractC62698a) C62703c.this.getModel()).mo216644a(new AbsJoinLobbyIntercept<JoinCalendarGroupMeetingEntity>() {
                /* class com.ss.android.vc.meeting.module.preview.calender.C62703c.C62706b.C627082 */

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m245312a() {
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m245313a(VideoChat videoChat) {
                    ((C62697a.AbstractC62698a) C62703c.this.getModel()).mo216506a(videoChat);
                }

                /* renamed from: a */
                public void onLobbySuccess(JoinCalendarGroupMeetingEntity joinCalendarGroupMeetingEntity) {
                    C63693e.m249689e();
                    ((C62697a.AbstractC62698a) C62703c.this.getModel()).mo216507a(joinCalendarGroupMeetingEntity.f152598c, joinCalendarGroupMeetingEntity.f152599d);
                    ((C62697a.AbstractC62700b) C62703c.this.getView()).mo216528a($$Lambda$c$b$2$1DaeAo3AW6hVhf3QBS4h02XBTs.INSTANCE);
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("MeetingPreviewCalendarPresenter", "[sendJoinMeetingRequest2]", "error: " + eVar.toString());
                    VCLauncherStatistics.m250426d();
                    C63693e.m249689e();
                    C63737ag.m250005a("unknown", ((C62697a.AbstractC62698a) C62703c.this.getModel()).mo216646e(), C62703c.this.mo216666g());
                    ((C62697a.AbstractC62700b) C62703c.this.getView()).mo216650a(eVar);
                    ((C62697a.AbstractC62700b) C62703c.this.getView()).mo216528a((AbstractC62650a.AbstractC62655c) null);
                }

                /* JADX WARNING: Removed duplicated region for block: B:13:0x00e8  */
                /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
                /* renamed from: b */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void onNoLobbySuccess(com.ss.android.vc.entity.response.JoinCalendarGroupMeetingEntity r8) {
                    /*
                    // Method dump skipped, instructions count: 253
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.preview.calender.C62703c.C62706b.C627082.onNoLobbySuccess(com.ss.android.vc.entity.response.JoinCalendarGroupMeetingEntity):void");
                }
            });
        }

        private C62706b() {
            super();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.preview.calender.c$a */
    public class C62705a extends AbstractC62712e.C62713a implements C62697a.AbstractC62698a.AbstractC62699a {
        private C62705a() {
            super();
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62712e
    /* renamed from: a */
    public void mo216590a(boolean z) {
        super.mo216590a(z);
        ((C62697a.AbstractC62698a) getModel()).n_(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C62697a.AbstractC62700b mo216565a(BaseFragment baseFragment, AbstractC62746h hVar) {
        return new C62709d(baseFragment, hVar);
    }

    C62703c(BaseFragment baseFragment, AbstractC62746h hVar, String str, String str2, String str3, JoinCalendarGroupMeetingEntityRequest.EntrySource entrySource) {
        super(baseFragment, hVar);
        C62702b bVar = (C62702b) getModel();
        bVar.f157778d = str;
        bVar.f157779e = str2;
        bVar.f157780f = str3;
        bVar.f157781g = entrySource;
    }
}
