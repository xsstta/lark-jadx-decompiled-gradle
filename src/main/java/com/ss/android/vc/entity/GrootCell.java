package com.ss.android.vc.entity;

import com.ss.android.vc.entity.follow.FollowGrootCellPayload;
import com.ss.android.vc.entity.tab.VCTabListGrootCellPayload;
import com.ss.android.vc.entity.tab.VCTabMeetingGrootCellPayload;
import com.ss.android.vc.entity.tab.VCTabUserGrootCellPayload;
import java.io.Serializable;
import okio.ByteString;

public class GrootCell implements Serializable {
    private static final long serialVersionUID = 1;
    public Action action;
    public FollowGrootCellPayload followGrootCellPayload;
    public ByteString payload;
    public C60941k sketchGrootCellPayload;
    public VCTabListGrootCellPayload vcTabListHistoryChangeInfo;
    public VCTabMeetingGrootCellPayload vcTabMeetingGrootCellPayload;
    public VCTabUserGrootCellPayload vcTabUserGrootCellPayload;

    public enum Action {
        CLIENT_REQ(1),
        SERVER_SET(3),
        TRIGGER(4);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            if (i == 1) {
                return CLIENT_REQ;
            }
            if (i == 3) {
                return SERVER_SET;
            }
            if (i != 4) {
                return null;
            }
            return TRIGGER;
        }

        private Action(int i) {
            this.value = i;
        }
    }

    public String toString() {
        return "GrootCell{action=" + this.action + ", payload=" + this.payload + ", sketchGrootCellPayload=" + this.sketchGrootCellPayload + ", followGrootCellPayload=" + this.followGrootCellPayload + ", vcTabMeetingGrootCellPayload=" + this.vcTabMeetingGrootCellPayload + ", vcTabUserGrootCellPayload=" + this.vcTabUserGrootCellPayload + ", vcTabListHistoryChangeInfo=" + this.vcTabListHistoryChangeInfo + '}';
    }
}
