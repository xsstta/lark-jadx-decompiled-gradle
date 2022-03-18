package com.ss.android.lark.chatsetting.dto;

import com.ss.android.lark.chat.entity.Channel;
import java.io.Serializable;

public class Shortcut implements Serializable {
    private Channel channel;
    private int position;

    public Channel getChannel() {
        return this.channel;
    }

    public int getPosition() {
        return this.position;
    }

    public void setChannel(Channel channel2) {
        this.channel = channel2;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public Shortcut(Channel channel2) {
        this.channel = channel2;
    }

    public Shortcut(int i, String str) {
        this.channel = new Channel(i, str);
    }

    public Shortcut(Channel.Type type, String str) {
        this.channel = new Channel(type, str);
    }
}
