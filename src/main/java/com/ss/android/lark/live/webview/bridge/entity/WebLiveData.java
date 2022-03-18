package com.ss.android.lark.live.webview.bridge.entity;

import android.text.TextUtils;
import java.io.Serializable;

public class WebLiveData implements Serializable {
    public boolean danmaku_active;
    public WebLiveAction live_action;
    public String live_host;
    public String live_id;
    public boolean muted;
    public String stream_link;

    public String toString() {
        return "live action=" + this.live_action + ", live host is empty: " + TextUtils.isEmpty(this.live_host) + ", stream link is empty: " + TextUtils.isEmpty(this.stream_link) + ", live id is empty: " + TextUtils.isEmpty(this.live_id) + ", muted=" + this.muted + ", danmaku enable=" + this.danmaku_active;
    }

    public enum WebLiveAction {
        UNKNOWN(0),
        READY(1),
        PLAY(2),
        PAUSE(3),
        END(4),
        ERROR(5),
        MUTED(6),
        STREAM_CHANGE(7),
        DANMAKU_CHANGE(8),
        JSREADY(9);
        
        private int value;

        public int getValue(WebLiveAction webLiveAction) {
            return webLiveAction.value;
        }

        public static WebLiveAction valueOf(int i) {
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
                default:
                    return UNKNOWN;
            }
        }

        private WebLiveAction(int i) {
            this.value = i;
        }
    }
}
