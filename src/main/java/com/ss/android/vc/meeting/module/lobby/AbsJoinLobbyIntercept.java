package com.ss.android.vc.meeting.module.lobby;

import com.ss.android.vc.entity.response.C60956ac;
import com.ss.android.vc.entity.response.JoinCalendarGroupMeetingEntity;
import com.ss.android.vc.entity.response.JoinMeetingEntity;
import com.ss.android.vc.entity.response.RejoinVideoChatEntity;
import com.ss.android.vc.entity.response.ax;
import com.ss.android.vc.net.request.AbstractC63598b;

public abstract class AbsJoinLobbyIntercept<T> implements AbstractC63598b<T> {
    public abstract void onLobbySuccess(T t);

    public abstract void onNoLobbySuccess(T t);

    public enum LobbyJoinType {
        UNKNOWN(0),
        JoinMeetingResponse(1),
        JoinCalendarGroupMeetingResponse(2),
        UpdateVideoChatResponse(3),
        JoinInterviewGroupMeetingResponse(4),
        PreJoinMeetingResponse(5),
        PreJoinCalendarGroupMeetingResponse(6),
        PreUpdateVideoChatResponse(7),
        PreJoinInterviewGroupMeetingResponse(8),
        RejoinVideoChatResponse(9);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public int getValue() {
            return this.value;
        }

        private LobbyJoinType(int i) {
            this.value = i;
        }
    }

    @Override // com.ss.android.vc.net.request.AbstractC63598b
    public final void onSuccess(T t) {
        if (processIntercept(t) == LobbyJoinType.UNKNOWN) {
            onNoLobbySuccess(t);
        } else {
            onLobbySuccess(t);
        }
    }

    public static <T> LobbyJoinType processIntercept(T t) {
        if (t == null) {
            return LobbyJoinType.UNKNOWN;
        }
        if (t instanceof JoinMeetingEntity) {
            if (t.f152603d != null) {
                return LobbyJoinType.JoinMeetingResponse;
            }
            return LobbyJoinType.UNKNOWN;
        } else if (t instanceof JoinCalendarGroupMeetingEntity) {
            if (t.f152599d != null) {
                return LobbyJoinType.JoinCalendarGroupMeetingResponse;
            }
            return LobbyJoinType.UNKNOWN;
        } else if (t instanceof ax) {
            if (t.f152664b != null) {
                return LobbyJoinType.UpdateVideoChatResponse;
            }
            return LobbyJoinType.UNKNOWN;
        } else if (t instanceof C60956ac) {
            if (t.f152636b != null) {
                return LobbyJoinType.JoinInterviewGroupMeetingResponse;
            }
            return LobbyJoinType.UNKNOWN;
        } else if (!(t instanceof RejoinVideoChatEntity)) {
            return LobbyJoinType.UNKNOWN;
        } else {
            if (t.f152613c != null) {
                return LobbyJoinType.RejoinVideoChatResponse;
            }
            return LobbyJoinType.UNKNOWN;
        }
    }
}
