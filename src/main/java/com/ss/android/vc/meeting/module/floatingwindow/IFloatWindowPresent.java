package com.ss.android.vc.meeting.module.floatingwindow;

import android.widget.FrameLayout;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.net.service.VideoChatUser;

public interface IFloatWindowPresent extends AbstractC61734g {

    public enum FloatWindowType {
        BUBBLE,
        FAST_ENTRY
    }

    VideoChatUser getLocalUser();

    VideoChatUser getRemoteUser();

    /* renamed from: m */
    C61303k mo213668m();

    /* renamed from: o */
    FrameLayout mo213670o();
}
