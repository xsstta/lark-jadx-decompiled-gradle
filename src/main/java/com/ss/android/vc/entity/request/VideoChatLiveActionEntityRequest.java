package com.ss.android.vc.entity.request;

public class VideoChatLiveActionEntityRequest {

    public enum Action {
        UNKNOWN(0),
        START(1),
        STOP(2),
        HOST_ACCEPT(3),
        HOST_REFUSE(4),
        PARTICIPANT_REQUEST_START(5),
        VOTE_ACCEPT(6),
        VOTE_REFUSE(7),
        LIVE_SETTING(8);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Action fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return START;
                case 2:
                    return STOP;
                case 3:
                    return HOST_ACCEPT;
                case 4:
                    return HOST_REFUSE;
                case 5:
                    return PARTICIPANT_REQUEST_START;
                case 6:
                    return VOTE_ACCEPT;
                case 7:
                    return VOTE_REFUSE;
                case 8:
                    return LIVE_SETTING;
                default:
                    return null;
            }
        }

        private Action(int i) {
            this.value = i;
        }
    }
}
