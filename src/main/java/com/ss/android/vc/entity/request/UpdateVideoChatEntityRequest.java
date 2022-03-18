package com.ss.android.vc.entity.request;

import com.huawei.hms.android.HwBuildEx;

public class UpdateVideoChatEntityRequest {

    public enum Action {
        UNKOWN(0),
        ACCEPT(1),
        REFUSE(2),
        CANCEL(3),
        LEAVE(4),
        END(5),
        RECEIVED_INVITATION(6),
        SDK_EXCEPTION(7),
        TERMINATE(8),
        TRIAL_TIMEOUT(9),
        LEAVE_LOBBY(10),
        MUTE_PUSH_ACK(11),
        AUTO_END(12);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKOWN;
                case 1:
                    return ACCEPT;
                case 2:
                    return REFUSE;
                case 3:
                    return CANCEL;
                case 4:
                    return LEAVE;
                case 5:
                    return END;
                case 6:
                    return RECEIVED_INVITATION;
                case 7:
                    return SDK_EXCEPTION;
                case 8:
                    return TERMINATE;
                case 9:
                    return TRIAL_TIMEOUT;
                case 10:
                    return LEAVE_LOBBY;
                case 11:
                    return MUTE_PUSH_ACK;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return AUTO_END;
                default:
                    return null;
            }
        }

        private Action(int i) {
            this.value = i;
        }
    }
}
