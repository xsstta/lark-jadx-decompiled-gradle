package com.ss.android.lark.live.webview.bridgev2.entity;

import com.huawei.hms.android.HwBuildEx;
import java.io.Serializable;

public enum CallNativeEvent implements Serializable {
    UNKNOWN(0),
    READY(1),
    PLAY(2),
    PAUSE(3),
    END(4),
    ERROR(5),
    MUTED(6),
    STREAM_CHANGE(7),
    DANMAKU_CHANGE(8),
    JSREADY(9),
    LIVE_CAN_PLAY(10),
    LIVE_LOADED_DATA(11),
    PLAYER_LAYOUT_CHANGE(12),
    MORE_DRAWER_VISIBLE_CHANGE(13),
    WEBVIEW_LOADED(14),
    NATIVE_TOAST_VISIBLE_CHANGE(15);
    
    private int value;

    public int getValue(CallNativeEvent callNativeEvent) {
        return callNativeEvent.value;
    }

    public static CallNativeEvent valueOf(int i) {
        switch (i) {
            case 1:
                return READY;
            case 2:
                return PLAY;
            case 3:
                return PAUSE;
            case 4:
                return END;
            case 5:
                return ERROR;
            case 6:
                return MUTED;
            case 7:
                return STREAM_CHANGE;
            case 8:
                return DANMAKU_CHANGE;
            case 9:
                return JSREADY;
            case 10:
                return LIVE_CAN_PLAY;
            case 11:
                return LIVE_LOADED_DATA;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return PLAYER_LAYOUT_CHANGE;
            case 13:
                return MORE_DRAWER_VISIBLE_CHANGE;
            case 14:
                return WEBVIEW_LOADED;
            case 15:
                return NATIVE_TOAST_VISIBLE_CHANGE;
            default:
                return UNKNOWN;
        }
    }

    private CallNativeEvent(int i) {
        this.value = i;
    }
}
