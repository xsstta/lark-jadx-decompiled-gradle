package com.tt.miniapp.audio.background;

import android.text.TextUtils;

public enum BgAudioCommand {
    OBTAIN_MANAGER("obtainManager"),
    PLAY("play"),
    PAUSE("pause"),
    STOP("stop"),
    SEEK("seek"),
    SET_AUDIO_MODEL("setAudioModel"),
    GET_AUDIO_STATE("getAudioState"),
    NEED_KEEP_ALIVE("needKeepAlive");
    
    private String mCommand;

    public String getCommand() {
        return this.mCommand;
    }

    public static BgAudioCommand fromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        BgAudioCommand[] values = values();
        for (BgAudioCommand bgAudioCommand : values) {
            if (bgAudioCommand.mCommand.equalsIgnoreCase(str)) {
                return bgAudioCommand;
            }
        }
        return null;
    }

    private BgAudioCommand(String str) {
        this.mCommand = str;
    }
}
