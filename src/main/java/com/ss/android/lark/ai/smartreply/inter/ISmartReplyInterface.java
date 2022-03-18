package com.ss.android.lark.ai.smartreply.inter;

import com.ss.android.lark.chat.entity.message.MessageInfo;

public interface ISmartReplyInterface extends AbstractC28618a {

    /* renamed from: com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface$a */
    public interface AbstractC28617a {
        void onSuccess(boolean z, MessageInfo messageInfo);
    }

    /* renamed from: a */
    void mo101862a(AbstractC28617a aVar);

    /* renamed from: c */
    void mo101863c();

    /* renamed from: d */
    ReplyAction mo101864d();

    /* renamed from: e */
    boolean mo101865e();

    public enum ReplyAction {
        CHAT_REPLY("longPress"),
        INPUT_DIRECT("direct"),
        THREAD_REPLY("thread");
        
        private String value;

        public String getValue() {
            return this.value;
        }

        private ReplyAction(String str) {
            this.value = str;
        }
    }
}
