package com.bytedance.ee.bear.middleground.drive.export;

public class DrivePriority {

    public enum DownloadPriority {
        USER_INTERACTION(10),
        PREVIEW(5),
        DEFAULT(0),
        MANUAL_OFFLINE(-5),
        PRELOAD(-10);
        
        private int priority;

        public int getPriority() {
            return this.priority;
        }

        private DownloadPriority(int i) {
            this.priority = i;
        }
    }

    public enum UploadPriority {
        USER_INTERACTION(10),
        DEFAULT_HEIGHT(5),
        DEFAULT(0),
        DEFAULT_LOW(-5),
        BACKGROUND(-10);
        
        private int priority;

        public int getPriority() {
            return this.priority;
        }

        public static UploadPriority getUploadPriority(int i) {
            if (i == 10) {
                return USER_INTERACTION;
            }
            if (i == 5) {
                return DEFAULT_HEIGHT;
            }
            if (i == 0) {
                return DEFAULT;
            }
            if (i == -5) {
                return DEFAULT_LOW;
            }
            if (i == -10) {
                return BACKGROUND;
            }
            return DEFAULT;
        }

        private UploadPriority(int i) {
            this.priority = i;
        }
    }
}
