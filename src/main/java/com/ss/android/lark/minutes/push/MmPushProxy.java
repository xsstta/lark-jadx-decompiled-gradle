package com.ss.android.lark.minutes.push;

import com.ss.android.lark.mm.module.detail.comment.model.MmComment;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingParagraph;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.push.MmPush;
import com.ss.android.lark.mm.service.MmService;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.pb.meeting_object.BaseInfo;
import com.ss.android.lark.pb.meeting_object.HighlightTimeLineItem;
import com.ss.android.lark.pb.meeting_object.MeetingObject;
import com.ss.android.lark.pb.meeting_object.Reaction;
import com.ss.android.lark.pb.meeting_object.RealTimeSubtitleSentence;
import com.ss.android.lark.sdk.C53248k;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/minutes/push/MmPushProxy;", "", "()V", "registerPush", "", "minutes_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.q.b.b */
public final class MmPushProxy {

    /* renamed from: a */
    public static final MmPushProxy f130788a = new MmPushProxy();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/minutes/push/MmPushProxy$registerPush$1", "Lcom/ss/android/lark/sdk/PushDispatcher$ISdkPushListener;", "onPush", "", "request", "", "sid", "", "fromServerPipe", "", "offlinePush", "minutes_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.q.b.b$a */
    public static final class C52931a implements C53248k.AbstractC53250a {
        C52931a() {
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            C45855f.m181663b("MmPushProxy", "onPush!!");
            try {
                MeetingObject decode = MeetingObject.ADAPTER.decode(bArr);
                Reaction reaction = decode.mreaction;
                if (reaction != null) {
                    String str2 = decode.mbase_info.mobject_token;
                    HashMap<String, MmMeetingParagraph> a = MmModelParseAdapter.f130787a.mo180835a(reaction.msubtitles);
                    HashMap<String, MmComment.MmCommentInfo> a2 = MmModelParseAdapter.m204928a(reaction);
                    List<HighlightTimeLineItem> list = reaction.mtimeline;
                    Intrinsics.checkExpressionValueIsNotNull(list, "it.mtimeline");
                    List<com.ss.android.lark.mm.module.highlight.timeline.HighlightTimeLineItem> a3 = MmModelParseAdapter.m204929a(list);
                    MmPush a4 = MmService.f115717a.mo161228a().mo161224a();
                    Intrinsics.checkExpressionValueIsNotNull(str2, "objectToken");
                    a4.mo161199a(str2, a, a2);
                    if (a3 != null) {
                        MmService.f115717a.mo161228a().mo161224a().mo161200a(str2, a3);
                    }
                }
            } catch (Exception e) {
                C45855f.m181666e("MmPushProxy", "[MmPushProxy] registerPush error: " + e);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/minutes/push/MmPushProxy$registerPush$2", "Lcom/ss/android/lark/sdk/PushDispatcher$ISdkPushListener;", "onPush", "", "request", "", "sid", "", "fromServerPipe", "", "offlinePush", "minutes_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.q.b.b$b */
    public static final class C52932b implements C53248k.AbstractC53250a {
        C52932b() {
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            C45855f.m181663b("MmPushProxy", "onPush Realtime subtitle!");
            try {
                RealTimeSubtitleSentence decode = RealTimeSubtitleSentence.ADAPTER.decode(bArr);
                if (decode != null) {
                    C45855f.m181663b("MmPushProxy", "realTimeSubtitleSentence: " + decode);
                    MmService.f115717a.mo161228a().mo161224a().mo161197a(MmModelParseAdapter.m204927a(decode));
                }
            } catch (Exception e) {
                C45855f.m181666e("MmPushProxy", "MmPushProxy [MM_PUSH_REALTIME_SUBTITLE_SENTENCE] error :" + e);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/minutes/push/MmPushProxy$registerPush$3", "Lcom/ss/android/lark/sdk/PushDispatcher$ISdkPushListener;", "onPush", "", "request", "", "sid", "", "fromServerPipe", "", "offlinePush", "minutes_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.q.b.b$c */
    public static final class C52933c implements C53248k.AbstractC53250a {
        C52933c() {
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            String str2;
            BaseInfo baseInfo;
            C45855f.m181663b("MmPushProxy", "onPush Summary status!");
            MeetingObject decode = MeetingObject.ADAPTER.decode(bArr);
            MmPush a = MmService.f115717a.mo161228a().mo161224a();
            if (decode == null || (baseInfo = decode.mbase_info) == null) {
                str2 = null;
            } else {
                str2 = baseInfo.mobject_token;
            }
            a.mo161198a(str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/minutes/push/MmPushProxy$registerPush$4", "Lcom/ss/android/lark/sdk/PushDispatcher$ISdkPushListener;", "onPush", "", "request", "", "sid", "", "fromServerPipe", "", "offlinePush", "minutes_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.q.b.b$d */
    public static final class C52934d implements C53248k.AbstractC53250a {
        C52934d() {
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            String str2;
            BaseInfo baseInfo;
            C45855f.m181663b("MmPushProxy", "onPush Summary change!");
            MeetingObject decode = MeetingObject.ADAPTER.decode(bArr);
            MmPush a = MmService.f115717a.mo161228a().mo161224a();
            if (decode == null || (baseInfo = decode.mbase_info) == null) {
                str2 = null;
            } else {
                str2 = baseInfo.mobject_token;
            }
            a.mo161198a(str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/minutes/push/MmPushProxy$registerPush$5", "Lcom/ss/android/lark/sdk/PushDispatcher$ISdkPushListener;", "onPush", "", "request", "", "sid", "", "fromServerPipe", "", "offlinePush", "minutes_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.q.b.b$e */
    public static final class C52935e implements C53248k.AbstractC53250a {
        C52935e() {
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            String str2;
            BaseInfo baseInfo;
            C45855f.m181663b("MmPushProxy", "onPush Summary check!");
            MeetingObject decode = MeetingObject.ADAPTER.decode(bArr);
            MmPush a = MmService.f115717a.mo161228a().mo161224a();
            if (decode == null || (baseInfo = decode.mbase_info) == null) {
                str2 = null;
            } else {
                str2 = baseInfo.mobject_token;
            }
            a.mo161198a(str2);
        }
    }

    private MmPushProxy() {
    }

    /* renamed from: a */
    public final void mo180836a() {
        C45855f.m181663b("MmPushProxy", "registerPush");
        C53248k.m205912a().mo181700a(Command.MM_PUSH_REACTION_INFO, new C52931a());
        C53248k.m205912a().mo181700a(Command.MM_PUSH_REALTIME_SUBTITLE_SENTENCE, new C52932b());
        C53248k.m205912a().mo181700a(Command.MM_PUSH_SUMMARY_STATUS, new C52933c());
        C53248k.m205912a().mo181700a(Command.MM_PUSH_SUMMARY_CHANGE, new C52934d());
        C53248k.m205912a().mo181700a(Command.MM_PUSH_SUMMARY_CHECK, new C52935e());
    }
}
