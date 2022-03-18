package com.lynx.tasm.animation;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.lynx.tasm.base.LLog;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;

/* renamed from: com.lynx.tasm.animation.c */
public final class C26584c {
    /* renamed from: a */
    public static final String m96385a(int i) {
        if (i == 1) {
            return "opacity";
        }
        if (i == 2) {
            return "scaleX";
        }
        switch (i) {
            case 4:
                return "scaleY";
            case 8:
                return "scaleXY";
            case 16:
                return "width";
            case 32:
                return "height";
            case 64:
                return "background-color";
            case SmActions.ACTION_ONTHECALL_EXIT /*{ENCODED_INT: 128}*/:
                return "visibility";
            case DynamicModule.f58006b:
                return "left";
            case MediaPlayer.MEDIA_PLAYER_OPTION_APPID /*{ENCODED_INT: 512}*/:
                return "top";
            case 1024:
                return "right";
            case 2048:
                return "bottom";
            case 4096:
                return "transform";
            default:
                LLog.m96418a(new IllegalArgumentException("Unsupported animated property: " + i));
                return "none";
        }
    }
}
