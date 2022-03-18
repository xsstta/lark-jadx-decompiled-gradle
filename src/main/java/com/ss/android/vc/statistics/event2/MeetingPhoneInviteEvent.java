package com.ss.android.vc.statistics.event2;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3183d.C63728b;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingPhoneInviteEvent;", "", "()V", "sendViewEvent", "", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.s */
public final class MeetingPhoneInviteEvent {

    /* renamed from: a */
    public static final Lazy f160851a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C63718b.INSTANCE);

    /* renamed from: b */
    public static final Companion f160852b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MeetingPhoneInviteEvent$Companion;", "", "()V", "instance", "Lcom/ss/android/vc/statistics/event2/MeetingPhoneInviteEvent;", "instance$annotations", "getInstance", "()Lcom/ss/android/vc/statistics/event2/MeetingPhoneInviteEvent;", "instance$delegate", "Lkotlin/Lazy;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.s$a */
    public static final class Companion {
        /* renamed from: a */
        public final MeetingPhoneInviteEvent mo220314a() {
            Lazy lazy = MeetingPhoneInviteEvent.f160851a;
            Companion aVar = MeetingPhoneInviteEvent.f160852b;
            return (MeetingPhoneInviteEvent) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/statistics/event2/MeetingPhoneInviteEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.s$b */
    static final class C63718b extends Lambda implements Function0<MeetingPhoneInviteEvent> {
        public static final C63718b INSTANCE = new C63718b();

        C63718b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MeetingPhoneInviteEvent invoke() {
            return new MeetingPhoneInviteEvent();
        }
    }

    /* renamed from: a */
    public final void mo220313a(VideoChat videoChat) {
        C63728b.m249928a("vc_meeting_phone_invite_view", null, videoChat);
    }
}
