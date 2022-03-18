package com.ss.android.vc.meeting.module.preview.p3153b;

import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.response.JoinMeetingEntity;
import com.ss.android.vc.meeting.module.lobby.AbsJoinLobbyIntercept;
import com.ss.android.vc.meeting.module.preview.AbstractC62650a;
import com.ss.android.vc.meeting.module.preview.AbstractC62712e;
import com.ss.android.vc.meeting.module.preview.AbstractC62746h;
import com.ss.android.vc.meeting.module.preview.p3153b.C62670a;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vc.trace.VCLauncherStatistics;

/* renamed from: com.ss.android.vc.meeting.module.preview.b.d */
public class C62678d extends AbstractC62712e<C62670a.AbstractC62671a, C62670a.AbstractC62673b, C62670a.AbstractC62673b.AbstractC62674a, C62670a.AbstractC62671a.AbstractC62672a> {
    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C62670a.AbstractC62673b.AbstractC62674a mo216568e() {
        return new C62681b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C62670a.AbstractC62671a.AbstractC62672a mo216569f() {
        return new C62680a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C62670a.AbstractC62671a mo216567d() {
        return new C62676c();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.preview.b.d$b */
    public class C62681b extends AbstractC62712e.AbstractC62714b implements C62670a.AbstractC62673b.AbstractC62674a {
        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b.AbstractC62654a
        /* renamed from: b */
        public void mo216546b() {
            ((C62670a.AbstractC62673b) C62678d.this.getView()).mo216538k();
            VCLauncherStatistics.m250423a(VCLauncherStatistics.SCENE.NORMAL_JOIN);
            ((C62670a.AbstractC62671a) C62678d.this.getModel()).mo216582a(new AbsJoinLobbyIntercept<JoinMeetingEntity>() {
                /* class com.ss.android.vc.meeting.module.preview.p3153b.C62678d.C62681b.C626821 */

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m245197a() {
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m245198a(VideoChat videoChat) {
                    ((C62670a.AbstractC62671a) C62678d.this.getModel()).mo216506a(videoChat);
                }

                /* renamed from: a */
                public void onLobbySuccess(JoinMeetingEntity joinMeetingEntity) {
                    C63693e.m249689e();
                    ((C62670a.AbstractC62671a) C62678d.this.getModel()).mo216507a(joinMeetingEntity.f152601b, joinMeetingEntity.f152603d);
                    ((C62670a.AbstractC62673b) C62678d.this.getView()).mo216528a($$Lambda$d$b$1$03ppqNOyJv1BuYX2EZNP8VisjTo.INSTANCE);
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("MeetingPreviewNormalJoinModel", "[sendJoinMeetingRequest]", "fail");
                    VCLauncherStatistics.m250426d();
                    C63693e.m249689e();
                    ((C62670a.AbstractC62671a) C62678d.this.getModel()).mo216583e();
                    ((C62670a.AbstractC62673b) C62678d.this.getView()).mo216586a(eVar);
                    ((C62670a.AbstractC62673b) C62678d.this.getView()).mo216528a((AbstractC62650a.AbstractC62655c) null);
                }

                /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
                /* JADX WARNING: Removed duplicated region for block: B:9:0x009c  */
                /* renamed from: b */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void onNoLobbySuccess(com.ss.android.vc.entity.response.JoinMeetingEntity r10) {
                    /*
                    // Method dump skipped, instructions count: 170
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.preview.p3153b.C62678d.C62681b.C626821.onNoLobbySuccess(com.ss.android.vc.entity.response.JoinMeetingEntity):void");
                }
            });
        }

        private C62681b() {
            super();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.preview.b.d$a */
    public class C62680a extends AbstractC62712e.C62713a implements C62670a.AbstractC62671a.AbstractC62672a {
        private C62680a() {
            super();
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62712e
    /* renamed from: a */
    public void mo216590a(boolean z) {
        super.mo216590a(z);
        ((C62670a.AbstractC62671a) getModel()).mo216584f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C62683e mo216565a(BaseFragment baseFragment, AbstractC62746h hVar) {
        return new C62683e(baseFragment, hVar);
    }

    C62678d(BaseFragment baseFragment, AbstractC62746h hVar, String str, boolean z) {
        super(baseFragment, hVar);
        ((C62676c) getModel()).f157726d = str;
        ((C62676c) getModel()).f157727e = Boolean.valueOf(z);
    }
}
