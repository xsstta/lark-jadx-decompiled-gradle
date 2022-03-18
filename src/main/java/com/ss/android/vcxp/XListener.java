package com.ss.android.vcxp;

import com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsStateChangedListener;
import com.ss.android.vc.net.push.VideoChatPush;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;

public class XListener {

    @XClass
    public static abstract class MeetingsStateChangedListener implements IMeetingsStateChangedListener {
        @XMethod(isReleaseMethod = true)
        public void release() {
        }
    }

    @XClass
    public static abstract class PushVideoChatStatusListener implements VideoChatPush.AbstractC63584x {
        @XMethod(isReleaseMethod = true)
        public void release() {
        }
    }
}
