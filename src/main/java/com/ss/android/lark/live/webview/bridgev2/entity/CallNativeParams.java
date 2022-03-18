package com.ss.android.lark.live.webview.bridgev2.entity;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CallNativeParams implements Serializable {
    public String content;
    public boolean danmaku_active;
    public long delay;
    public String from;
    public String layout;
    public String live_host;
    public String live_id;
    public boolean muted;
    public String player_type;
    public String stream_link;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayerLayoutEmit {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayerLayoutType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayerType {
    }

    public String toString() {
        return "CallNativeParams{live_host='" + this.live_host + '\'' + ", live_id='" + this.live_id + '\'' + ", stream_link='" + this.stream_link + '\'' + ", muted=" + this.muted + ", danmaku_active=" + this.danmaku_active + ", type='" + this.player_type + '\'' + ", layout='" + this.layout + '\'' + ", from='" + this.from + '\'' + '}';
    }
}
