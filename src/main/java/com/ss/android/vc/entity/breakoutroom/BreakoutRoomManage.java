package com.ss.android.vc.entity.breakoutroom;

import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import java.io.Serializable;
import java.util.List;

public class BreakoutRoomManage implements Serializable {
    private ManageType manageType;
    private List<VCBreakoutRoomInfo> roomInfos;
    private UserChangedInfo userChangedInfo;

    public enum ManageType {
        UNKNOWN(0),
        UPDATE_SETTINGS(1),
        MOVE_PARTICIPANTS(2),
        BREAKOUT_ROOM_END(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static ManageType forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return UPDATE_SETTINGS;
            }
            if (i == 2) {
                return MOVE_PARTICIPANTS;
            }
            if (i != 3) {
                return null;
            }
            return BREAKOUT_ROOM_END;
        }

        private ManageType(int i) {
            this.value = i;
        }
    }

    public ManageType getManageType() {
        return this.manageType;
    }

    public List<VCBreakoutRoomInfo> getRoomInfos() {
        return this.roomInfos;
    }

    public UserChangedInfo getUserChangedInfo() {
        return this.userChangedInfo;
    }

    public void setManageType(ManageType manageType2) {
        this.manageType = manageType2;
    }

    public void setRoomInfos(List<VCBreakoutRoomInfo> list) {
        this.roomInfos = list;
    }

    public void setUserChangedInfo(UserChangedInfo userChangedInfo2) {
        this.userChangedInfo = userChangedInfo2;
    }
}
