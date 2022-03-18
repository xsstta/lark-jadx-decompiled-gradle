package com.bytedance.ee.bear.drive.view.preview.wps;

import com.bytedance.ee.util.io.NonProguard;

public class WpsPPTOptions implements NonProguard {
    public Boolean isShowBottomStatusBar;
    public Boolean isShowInsertMedia;
    public Boolean isShowRemarkView;
    public Mobile mobile;

    public static class Mobile implements NonProguard {
        public Boolean isOpenIntoEdit;
        public Boolean isShowReviewLogo;
        public Boolean showPrevTipWhilePlay;
    }
}
