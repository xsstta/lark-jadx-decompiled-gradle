package com.ss.android.vc.meeting.framework.manager.interfaces;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.statemachine.StatusNode;
import com.ss.android.vcxp.annotation.XClass;

@XClass
public interface IMeetingsStateChangedListener {
    void stateChanged(String str, StatusNode statusNode, VideoChat videoChat);
}
