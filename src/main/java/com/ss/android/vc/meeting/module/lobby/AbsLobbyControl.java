package com.ss.android.vc.meeting.module.lobby;

import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61420b;
import com.ss.android.vc.meeting.module.lobby.pb.C62149b;
import com.ss.android.vc.meeting.module.lobby.pb.VCLobbyParticipant;
import com.ss.android.vc.meeting.module.lobby.pb.VCManageResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0012H&J\u0018\u0010\u0014\u001a\u00020\f2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H&J\u0012\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&J\u0012\u0010\u001b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0012H&R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/ss/android/vc/meeting/module/lobby/AbsLobbyControl;", "Lcom/ss/android/vc/meeting/module/base/BaseControl;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "joinMeetingLobby", "Lcom/ss/android/vc/meeting/module/lobby/pb/JoinMeetingLobby;", "getJoinMeetingLobby", "()Lcom/ss/android/vc/meeting/module/lobby/pb/JoinMeetingLobby;", "setJoinMeetingLobby", "(Lcom/ss/android/vc/meeting/module/lobby/pb/JoinMeetingLobby;)V", "addLobbyListener", "", "listener", "Lcom/ss/android/vc/meeting/module/lobby/ILobbyListener;", "getInteractiveId", "", "isInLobby", "", "isTipShowing", "onPushLobbyNotify", "lobbyParticipants", "", "Lcom/ss/android/vc/meeting/module/lobby/pb/VCLobbyParticipant;", "onPushLobbyResult", "result", "Lcom/ss/android/vc/meeting/module/lobby/pb/VCManageResult;", "removeLobbyListener", "setTipShowing", "isShowing", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.lobby.a */
public abstract class AbsLobbyControl extends AbstractC61420b {

    /* renamed from: a */
    private C62149b f156050a;

    /* renamed from: a */
    public abstract void mo214934a(AbstractC62119b bVar);

    /* renamed from: a */
    public abstract void mo214935a(VCManageResult vCManageResult);

    /* renamed from: a */
    public abstract void mo214937a(List<VCLobbyParticipant> list);

    /* renamed from: a */
    public abstract void mo214938a(boolean z);

    /* renamed from: b */
    public abstract void mo214939b(AbstractC62119b bVar);

    /* renamed from: b */
    public abstract boolean mo214940b();

    /* renamed from: c */
    public abstract String mo214941c();

    /* renamed from: d */
    public abstract boolean mo214942d();

    /* renamed from: a */
    public final C62149b mo214933a() {
        return this.f156050a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbsLobbyControl(C61303k kVar) {
        super(kVar);
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
    }

    /* renamed from: a */
    public final void mo214936a(C62149b bVar) {
        this.f156050a = bVar;
    }
}
