package com.ss.android.vc.dto;

import com.ss.android.lark.chat.entity.chatter.ChatterCustomStatus;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.UserWorkStatusType;
import com.ss.android.vc.meeting.module.lobby.pb.VCLobbyParticipant;
import java.util.List;

public class SearchParticipantInfo extends BaseSearchInfo {
    private ByteviewUser byteviewUser;
    private ChatterDescription chatterDescription;
    private CollaborationType collaborationType;
    private List<ChatterCustomStatus> customStatuses;
    private boolean isCrossTenant;
    private boolean isExecutive;
    private VCLobbyParticipant lobbyParticipant;
    private UserStatus mUserStatus;
    private Participant participant;
    private ParticipantType participantType;
    private String sipMainAddress;
    private UserWorkStatusType workStatusType;
    private long zenModeEndTime;

    public enum CollaborationType {
        DEFAULT(0),
        BLOCKED(1),
        REQUEST_NEEDED(2),
        EXECUTIVE_MODE(3),
        BE_BLOCKED(4);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static CollaborationType valueOf(int i) {
            if (i == 0) {
                return DEFAULT;
            }
            if (i == 1) {
                return BLOCKED;
            }
            if (i == 2) {
                return REQUEST_NEEDED;
            }
            if (i == 3) {
                return EXECUTIVE_MODE;
            }
            if (i != 4) {
                return null;
            }
            return BE_BLOCKED;
        }

        private CollaborationType(int i) {
            this.value = i;
        }
    }

    public enum UserStatus {
        UNKNOWN(0),
        IN_MEETING(1),
        IN_LOBBY(2),
        NOT_IN_MEETING(3);
        
        private int value;

        public int getValue() {
            return this.value;
        }

        public static UserStatus fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return IN_MEETING;
            }
            if (i == 2) {
                return IN_LOBBY;
            }
            if (i != 3) {
                return null;
            }
            return NOT_IN_MEETING;
        }

        private UserStatus(int i) {
            this.value = i;
        }
    }

    public ByteviewUser getByteviewUser() {
        return this.byteviewUser;
    }

    public ChatterDescription getChatterDescription() {
        return this.chatterDescription;
    }

    public CollaborationType getCollaborationType() {
        return this.collaborationType;
    }

    public List<ChatterCustomStatus> getCustomStatuses() {
        return this.customStatuses;
    }

    public VCLobbyParticipant getLobbyParticipant() {
        return this.lobbyParticipant;
    }

    public Participant getParticipant() {
        return this.participant;
    }

    public ParticipantType getParticipantType() {
        return this.participantType;
    }

    public String getSipMainAddress() {
        return this.sipMainAddress;
    }

    public UserStatus getUserStatus() {
        return this.mUserStatus;
    }

    public UserWorkStatusType getWorkStatusType() {
        return this.workStatusType;
    }

    public long getZenModeEndTime() {
        return this.zenModeEndTime;
    }

    public UserStatus getmUserStatus() {
        return this.mUserStatus;
    }

    public boolean isCrossTenant() {
        return this.isCrossTenant;
    }

    public boolean isExecutive() {
        return this.isExecutive;
    }

    public void setByteviewUser(ByteviewUser byteviewUser2) {
        this.byteviewUser = byteviewUser2;
    }

    public void setChatterDescription(ChatterDescription chatterDescription2) {
        this.chatterDescription = chatterDescription2;
    }

    public void setCollaborationType(CollaborationType collaborationType2) {
        this.collaborationType = collaborationType2;
    }

    public void setCrossTenant(boolean z) {
        this.isCrossTenant = z;
    }

    public void setCustomStatuses(List<ChatterCustomStatus> list) {
        this.customStatuses = list;
    }

    public void setExecutive(boolean z) {
        this.isExecutive = z;
    }

    public void setLobbyParticipant(VCLobbyParticipant vCLobbyParticipant) {
        this.lobbyParticipant = vCLobbyParticipant;
    }

    public void setParticipant(Participant participant2) {
        this.participant = participant2;
    }

    public void setParticipantType(ParticipantType participantType2) {
        this.participantType = participantType2;
    }

    public void setSipMainAddress(String str) {
        this.sipMainAddress = str;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.mUserStatus = userStatus;
    }

    public void setWorkStatusType(UserWorkStatusType userWorkStatusType) {
        this.workStatusType = userWorkStatusType;
    }

    public void setZenModeEndTime(long j) {
        this.zenModeEndTime = j;
    }

    public void setmUserStatus(UserStatus userStatus) {
        this.mUserStatus = userStatus;
    }
}
