package com.bytedance.ee.appstrategy;

public class AppState {

    public enum Notice {
        ERROR(-1),
        HINT_NONE(1),
        HINT_POPUP_WINDOW(2);
        
        int mCode;

        public int getCode() {
            return this.mCode;
        }

        public static Notice fromCode(int i) {
            if (i == 1) {
                return HINT_NONE;
            }
            if (i != 2) {
                return ERROR;
            }
            return HINT_POPUP_WINDOW;
        }

        private Notice(int i) {
            this.mCode = i;
        }
    }

    public enum State {
        ERROR(-1),
        APP_USEABLE(1),
        APP_PLATFORM_FORBIDDEN(2),
        APP_DEVELOPER_FORBIDDEN(3);
        
        int mCode;

        public int getCode() {
            return this.mCode;
        }

        public static State fromCode(int i) {
            if (i == 1) {
                return APP_USEABLE;
            }
            if (i == 2) {
                return APP_PLATFORM_FORBIDDEN;
            }
            if (i != 3) {
                return ERROR;
            }
            return APP_DEVELOPER_FORBIDDEN;
        }

        private State(int i) {
            this.mCode = i;
        }
    }
}
