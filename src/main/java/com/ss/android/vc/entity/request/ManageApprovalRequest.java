package com.ss.android.vc.entity.request;

import com.ss.android.vc.entity.ByteviewUser;
import java.io.Serializable;
import java.util.List;

public class ManageApprovalRequest implements Serializable {
    private ApprovalAction mApprovalAction;
    private ApprovalType mApprovalType;
    private List<ByteviewUser> mByteviewUsers;
    private String mMeetingId;

    public enum ApprovalAction {
        UNKNOWN(0),
        PASS(1),
        REJECT(2),
        ALL_PASS(3),
        ALL_REJECT(4);
        
        int value;

        public int getNumber() {
            return this.value;
        }

        public static ApprovalAction forNumber(int i) {
            if (i == 1) {
                return PASS;
            }
            if (i == 2) {
                return REJECT;
            }
            if (i == 3) {
                return ALL_PASS;
            }
            if (i != 4) {
                return UNKNOWN;
            }
            return ALL_REJECT;
        }

        private ApprovalAction(int i) {
            this.value = i;
        }
    }

    public enum ApprovalType {
        UNKNOWN(0),
        MEETING_LOBBY(1),
        PUT_UP_HANDS(2);
        
        int value;

        public int getNumber() {
            return this.value;
        }

        public static ApprovalType forNumber(int i) {
            if (i == 1) {
                return MEETING_LOBBY;
            }
            if (i == 2) {
                return PUT_UP_HANDS;
            }
            return UNKNOWN;
        }

        private ApprovalType(int i) {
            this.value = i;
        }
    }

    public ApprovalAction getApprovalAction() {
        return this.mApprovalAction;
    }

    public ApprovalType getApprovalType() {
        return this.mApprovalType;
    }

    public List<ByteviewUser> getByteviewUsers() {
        return this.mByteviewUsers;
    }

    public String getMeetingId() {
        return this.mMeetingId;
    }

    public String toString() {
        return "ManageApprovalRequest{mMeetingId='" + this.mMeetingId + '\'' + ", mApprovalType=" + this.mApprovalType + ", mApprovalAction=" + this.mApprovalAction + ", mByteviewUsers=" + this.mByteviewUsers + '}';
    }

    public void setApprovalAction(ApprovalAction approvalAction) {
        this.mApprovalAction = approvalAction;
    }

    public void setApprovalType(ApprovalType approvalType) {
        this.mApprovalType = approvalType;
    }

    public void setByteviewUsers(List<ByteviewUser> list) {
        this.mByteviewUsers = list;
    }

    public void setMeetingId(String str) {
        this.mMeetingId = str;
    }
}
