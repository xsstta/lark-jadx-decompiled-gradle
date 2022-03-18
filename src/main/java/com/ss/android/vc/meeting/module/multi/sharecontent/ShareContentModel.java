package com.ss.android.vc.meeting.module.multi.sharecontent;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/sharecontent/ShareContentModel;", "", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "participant", "Lcom/ss/android/vc/entity/Participant;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/entity/Participant;)V", "getMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "getParticipant", "()Lcom/ss/android/vc/entity/Participant;", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.multi.b.e */
public final class ShareContentModel {

    /* renamed from: a */
    public static final Companion f157217a = new Companion(null);

    /* renamed from: b */
    private final C61303k f157218b;

    /* renamed from: c */
    private final Participant f157219c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/sharecontent/ShareContentModel$Companion;", "", "()V", "TAG", "", "newShareModel", "Lcom/ss/android/vc/meeting/module/multi/sharecontent/ShareContentModel;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "deviceId", "uid", ShareHitPoint.f121869d, "Lcom/ss/android/vc/entity/ParticipantType;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.b.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final ShareContentModel mo216090a(C61303k kVar, String str, String str2, ParticipantType participantType) {
            Intrinsics.checkParameterIsNotNull(kVar, "meeting");
            Intrinsics.checkParameterIsNotNull(str, "deviceId");
            Intrinsics.checkParameterIsNotNull(str2, "uid");
            Intrinsics.checkParameterIsNotNull(participantType, ShareHitPoint.f121869d);
            C60700b.m235851b("ShareContentModel@", "[newShareModel]", "imitate");
            Participant participant = new Participant();
            participant.setDeviceId(str);
            participant.setId(str2);
            participant.setParticipantType(participantType);
            return new ShareContentModel(kVar, participant);
        }
    }

    /* renamed from: a */
    public final Participant mo216089a() {
        return this.f157219c;
    }

    public ShareContentModel(C61303k kVar, Participant participant) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(participant, "participant");
        this.f157218b = kVar;
        this.f157219c = participant;
    }
}
