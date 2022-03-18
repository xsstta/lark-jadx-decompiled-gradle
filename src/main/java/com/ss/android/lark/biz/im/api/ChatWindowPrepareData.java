package com.ss.android.lark.biz.im.api;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import java.io.Serializable;

public class ChatWindowPrepareData implements Serializable {
    private static final long serialVersionUID = 3065827187997616533L;
    public final Chat chat;
    public final OpenApp openApp;
    public final ChatChatter p2pChatter;
    public final ChatChatter self;
    public final TopicGroup topicGroup;

    public ChatWindowPrepareData(Chat chat2, ChatChatter chatChatter, ChatChatter chatChatter2, OpenApp openApp2, TopicGroup topicGroup2) {
        this.chat = chat2;
        this.p2pChatter = chatChatter;
        this.self = chatChatter2;
        this.openApp = openApp2;
        this.topicGroup = topicGroup2;
    }
}
