package com.ss.android.vc.entity.request;

public class ShareFollowEntityRequest {

    public enum Action {
        UNKNOWN(0),
        START(1),
        STOP(2),
        UPDATE_OPTIONS(3),
        TRANS_PRESENTER(4),
        TAKE_OVER(5),
        REACTIVATE(6);
        
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
                    return UPDATE_OPTIONS;
                case 4:
                    return TRANS_PRESENTER;
                case 5:
                    return TAKE_OVER;
                case 6:
                    return REACTIVATE;
                default:
                    return null;
            }
        }

        private Action(int i) {
            this.value = i;
        }
    }

    public enum AuthorityMask {
        GRANT_INTERNAL_READ(1),
        GRANT_INTERNAL_EDIT(2),
        GRANT_EXTERNAL_READ(16),
        GRANT_EXTERNAL_EDIT(32),
        GRANT_EXTERNAL_COMMENT(64);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public int getValue() {
            return this.value;
        }

        public static AuthorityMask fromValue(int i) {
            if (i == 1) {
                return GRANT_INTERNAL_READ;
            }
            if (i == 2) {
                return GRANT_INTERNAL_EDIT;
            }
            if (i == 16) {
                return GRANT_EXTERNAL_READ;
            }
            if (i == 32) {
                return GRANT_EXTERNAL_EDIT;
            }
            if (i != 64) {
                return null;
            }
            return GRANT_EXTERNAL_COMMENT;
        }

        private AuthorityMask(int i) {
            this.value = i;
        }
    }
}
