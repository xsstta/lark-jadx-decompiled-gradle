package com.ss.android.lark.threadwindow.p2760a.p2764d;

import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;
import java.util.List;

/* renamed from: com.ss.android.lark.threadwindow.a.d.g */
public class C56036g extends AbstractC34432b.AbstractC34435c<AbstractC34006a> {

    /* renamed from: a */
    private final ThreadTopic f138556a;

    /* renamed from: b */
    private final List<MessageInfo> f138557b;

    /* renamed from: c */
    private final List<MessageInfo> f138558c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC34006a mo122917a(AbstractC34006a aVar) {
        if (aVar instanceof ThreadInfo) {
            ThreadInfo threadInfo = (ThreadInfo) aVar;
            threadInfo.mo126012a(this.f138556a);
            threadInfo.mo126016a(this.f138557b);
            threadInfo.mo126019b(this.f138558c);
        }
        return aVar;
    }

    public C56036g(ThreadTopic threadTopic, List<MessageInfo> list, List<MessageInfo> list2) {
        this.f138556a = threadTopic;
        this.f138557b = list;
        this.f138558c = list2;
    }
}
