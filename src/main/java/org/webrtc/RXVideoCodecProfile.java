package org.webrtc;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* access modifiers changed from: package-private */
public enum RXVideoCodecProfile {
    Unknown(0),
    ProfileConstrainedBaseline(1),
    ProfileBaseline(2),
    ProfileMain(3),
    ProfileConstrainedHigh(4),
    ProfileHigh(5),
    ByteVC1ProfileUnknown(10),
    ByteVC1ProfileMain(11),
    ByteVC1ProfileMain10(12),
    ByteVC1ProfileMain10HDR10(100),
    ByteVC1ProfileMax(SmActions.ACTION_ONTHECALL_EXIT);
    
    private int value;

    public int toInt() {
        return this.value;
    }

    static RXVideoCodecProfile fromValue(int i) {
        if (i == 0) {
            return Unknown;
        }
        if (i == 1) {
            return ProfileConstrainedBaseline;
        }
        if (i == 2) {
            return ProfileBaseline;
        }
        if (i == 3) {
            return ProfileMain;
        }
        if (i == 4) {
            return ProfileConstrainedHigh;
        }
        if (i == 5) {
            return ProfileHigh;
        }
        if (i == 100) {
            return ByteVC1ProfileMain10HDR10;
        }
        if (i == 128) {
            return ByteVC1ProfileMax;
        }
        switch (i) {
            case 10:
                return ByteVC1ProfileUnknown;
            case 11:
                return ByteVC1ProfileMain;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return ByteVC1ProfileMain10;
            default:
                return Unknown;
        }
    }

    private RXVideoCodecProfile(int i) {
        this.value = i;
    }
}
