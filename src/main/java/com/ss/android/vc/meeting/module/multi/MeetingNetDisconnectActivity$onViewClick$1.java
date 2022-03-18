package com.ss.android.vc.meeting.module.multi;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.thread.C26171w;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.response.RejoinVideoChatEntity;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckData;
import com.ss.android.vc.meeting.utils.meetingcheck.rx.XConsumer;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vcxp.annotation.XMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/multi/MeetingNetDisconnectActivity$onViewClick$1", "Lcom/ss/android/vc/meeting/utils/meetingcheck/rx/XConsumer;", "Lcom/ss/android/vc/meeting/utils/meetingcheck/MeetingCheckData;", "accept", "", "meetingCheckData", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class MeetingNetDisconnectActivity$onViewClick$1 implements XConsumer<MeetingCheckData> {

    /* renamed from: a */
    final /* synthetic */ MeetingNetDisconnectActivity f157159a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/multi/MeetingNetDisconnectActivity$onViewClick$1$accept$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/RejoinVideoChatEntity;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.MeetingNetDisconnectActivity$onViewClick$1$a */
    public static final class C62480a implements AbstractC63598b<RejoinVideoChatEntity> {

        /* renamed from: a */
        final /* synthetic */ MeetingNetDisconnectActivity$onViewClick$1 f157160a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.multi.MeetingNetDisconnectActivity$onViewClick$1$a$a */
        static final class RunnableC62481a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C62480a f157161a;

            RunnableC62481a(C62480a aVar) {
                this.f157161a = aVar;
            }

            public final void run() {
                this.f157161a.f157160a.f157159a.finish();
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.multi.MeetingNetDisconnectActivity$onViewClick$1$a$b */
        public static final class RunnableC62482b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C62480a f157162a;

            RunnableC62482b(C62480a aVar) {
                this.f157162a = aVar;
            }

            public final void run() {
                this.f157162a.f157160a.f157159a.finish();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62480a(MeetingNetDisconnectActivity$onViewClick$1 meetingNetDisconnectActivity$onViewClick$1) {
            this.f157160a = meetingNetDisconnectActivity$onViewClick$1;
        }

        /* renamed from: a */
        public void onSuccess(RejoinVideoChatEntity rejoinVideoChatEntity) {
            C26171w.m94676a(new RunnableC62482b(this), 500);
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            C26171w.m94675a(new RunnableC62481a(this));
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    MeetingNetDisconnectActivity$onViewClick$1(MeetingNetDisconnectActivity meetingNetDisconnectActivity) {
        this.f157159a = meetingNetDisconnectActivity;
    }

    @XMethod
    public void accept(MeetingCheckData bVar) {
        Boolean bool;
        String str = null;
        if (bVar != null) {
            bool = bVar.mo219661a();
        } else {
            bool = null;
        }
        if (Intrinsics.areEqual((Object) bool, (Object) true)) {
            this.f157159a.mo215978a();
            VideoChat videoChat = this.f157159a.f157154b;
            if (videoChat != null) {
                str = videoChat.getId();
            }
            VcBizService.reJoinVideoMeeting(2, str, false, new C62480a(this));
            return;
        }
        this.f157159a.finish();
    }
}
