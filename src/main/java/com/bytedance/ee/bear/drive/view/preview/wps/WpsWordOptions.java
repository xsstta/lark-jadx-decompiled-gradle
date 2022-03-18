package com.bytedance.ee.bear.drive.view.preview.wps;

import com.bytedance.ee.util.io.NonProguard;

public class WpsWordOptions implements NonProguard {
    public Boolean isBestScale;
    public Boolean isShowBottomStatusBar;
    public Boolean isShowDocMap;
    public Mobile mobile;

    public static class Mobile implements NonProguard {
        public Boolean isOpenIntoEdit;
        public Boolean isShowHoverToolbars;
        public Boolean isVoiceCommentEnabled;
    }
}
