package com.ss.android.lark.ai.smartreply.dto;

import com.ss.android.lark.chat.entity.message.MessageInfo;
import java.util.Objects;

public class SmartReplyRequest {

    /* renamed from: a */
    private MessageInfo f72014a;

    /* renamed from: b */
    private Scene f72015b;

    /* renamed from: c */
    private String f72016c;

    /* renamed from: d */
    private String f72017d;

    /* renamed from: e */
    private String f72018e;

    public enum Scene {
        MESSENGER(0),
        MESSENGER_REPLY(1),
        MESSENGER_THREAD(2);
        
        private final int value;

        public int getValue() {
            return this.value;
        }

        private Scene(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public MessageInfo mo101850a() {
        return this.f72014a;
    }

    /* renamed from: b */
    public Scene mo101851b() {
        return this.f72015b;
    }

    /* renamed from: c */
    public String mo101852c() {
        return this.f72016c;
    }

    /* renamed from: d */
    public String mo101853d() {
        return this.f72017d;
    }

    /* renamed from: e */
    public String mo101854e() {
        return this.f72018e;
    }

    public int hashCode() {
        return Objects.hash(this.f72015b, this.f72016c, this.f72017d, this.f72018e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartReplyRequest smartReplyRequest = (SmartReplyRequest) obj;
        if (this.f72015b != smartReplyRequest.f72015b || !Objects.equals(this.f72016c, smartReplyRequest.f72016c) || !Objects.equals(this.f72017d, smartReplyRequest.f72017d) || !Objects.equals(this.f72018e, smartReplyRequest.f72018e)) {
            return false;
        }
        return true;
    }

    public SmartReplyRequest(MessageInfo messageInfo, Scene scene) {
        this.f72014a = messageInfo;
        this.f72015b = scene;
        this.f72016c = messageInfo.getMessage().getChatId();
        this.f72017d = messageInfo.getMessage().getId();
        this.f72018e = messageInfo.getMessage().getFromId();
    }
}
