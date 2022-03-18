package com.ss.android.lark.biz.im.api;

import android.text.TextUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.thread.TopicGroup;

/* renamed from: com.ss.android.lark.biz.im.api.af */
public class C29607af {

    /* renamed from: a */
    private Chat f74208a;

    /* renamed from: b */
    private TopicGroup f74209b;

    /* renamed from: a */
    public Chat mo106680a() {
        return this.f74208a;
    }

    /* renamed from: b */
    public TopicGroup mo106681b() {
        return this.f74209b;
    }

    public int hashCode() {
        return this.f74208a.getId().hashCode();
    }

    public String toString() {
        return "TopicGroupChat:chatId=" + this.f74208a.getId() + ";topicGroupId=" + this.f74209b.getId();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29607af)) {
            return false;
        }
        return TextUtils.equals(this.f74208a.getId(), ((C29607af) obj).f74208a.getId());
    }

    public C29607af(Chat chat, TopicGroup topicGroup) {
        this.f74208a = chat;
        this.f74209b = topicGroup;
    }
}
