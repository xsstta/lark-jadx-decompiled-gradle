package com.ss.android.lark.chatthread;

import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.MessageInfo;

/* renamed from: com.ss.android.lark.chatthread.c */
public class C35095c {

    /* renamed from: a */
    public final Chat f90625a;

    /* renamed from: b */
    public final ChatChatter f90626b;

    /* renamed from: c */
    public final ChatChatter f90627c;

    /* renamed from: d */
    public final MessageInfo f90628d;

    /* renamed from: e */
    public final OpenApp f90629e;

    /* renamed from: com.ss.android.lark.chatthread.c$a */
    public static final class C35097a {

        /* renamed from: a */
        public Chat f90630a;

        /* renamed from: b */
        public ChatChatter f90631b;

        /* renamed from: c */
        public ChatChatter f90632c;

        /* renamed from: d */
        public MessageInfo f90633d;

        /* renamed from: e */
        public OpenApp f90634e;

        private C35097a() {
        }

        /* renamed from: a */
        public C35095c mo129408a() {
            return new C35095c(this);
        }

        /* renamed from: a */
        public C35097a mo129404a(OpenApp openApp) {
            this.f90634e = openApp;
            return this;
        }

        /* renamed from: b */
        public C35097a mo129409b(ChatChatter chatChatter) {
            this.f90632c = chatChatter;
            return this;
        }

        /* renamed from: a */
        public C35097a mo129405a(Chat chat) {
            this.f90630a = chat;
            return this;
        }

        /* renamed from: a */
        public C35097a mo129406a(ChatChatter chatChatter) {
            this.f90631b = chatChatter;
            return this;
        }

        /* renamed from: a */
        public C35097a mo129407a(MessageInfo messageInfo) {
            this.f90633d = messageInfo;
            return this;
        }
    }

    /* renamed from: a */
    public static C35097a m136924a() {
        return new C35097a();
    }

    private C35095c(C35097a aVar) {
        this.f90625a = aVar.f90630a;
        this.f90626b = aVar.f90631b;
        this.f90627c = aVar.f90632c;
        this.f90628d = aVar.f90633d;
        this.f90629e = aVar.f90634e;
    }
}
