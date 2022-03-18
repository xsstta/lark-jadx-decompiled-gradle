package com.ss.android.lark.threaddetail.p2750b;

import android.content.Context;
import com.ss.android.lark.biz.im.api.ThreadStateInfo;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.TextLayoutProcessor;
import com.ss.android.lark.chat.core.model.C33958d;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.BaseTextContent;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

/* renamed from: com.ss.android.lark.threaddetail.b.a */
public class C55777a extends AbstractC34417b<MessageInfo, C55781c> {

    /* renamed from: a */
    private ThreadTopic f137604a;

    /* renamed from: i */
    private MessageInfo f137605i;

    /* renamed from: j */
    private boolean f137606j = true;

    /* renamed from: k */
    private final Context f137607k;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.AbstractC34417b
    /* renamed from: c */
    public String mo122942c() {
        return "ThreadDetailDataStore";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo122944c(MessageInfo messageInfo) {
        return false;
    }

    /* renamed from: n */
    public ThreadTopic mo190288n() {
        return this.f137604a;
    }

    /* renamed from: p */
    public MessageInfo mo190290p() {
        return this.f137605i;
    }

    /* renamed from: q */
    public int mo190291q() {
        return this.f137604a.getLastMsgPos();
    }

    /* renamed from: r */
    public String mo190292r() {
        return this.f137604a.getTopic();
    }

    /* renamed from: s */
    public boolean mo190293s() {
        return this.f137604a.isFollow();
    }

    /* renamed from: u */
    public String mo190295u() {
        return this.f137604a.getSubTitle();
    }

    /* renamed from: w */
    private boolean m216249w() {
        return !DesktopUtil.m144301a(UIHelper.getContext());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.AbstractC34417b
    /* renamed from: a */
    public void mo122933a() {
        this.f88887g = new AbstractC34417b.AbstractC34420b<MessageInfo, C55781c>() {
            /* class com.ss.android.lark.threaddetail.p2750b.C55777a.C557781 */

            /* renamed from: a */
            public void mo122953a(MessageInfo messageInfo) {
            }

            /* renamed from: a */
            public void mo122955a(List<MessageInfo> list, C55781c cVar) {
                if (cVar != null) {
                    C55777a.this.mo190279a(cVar.mo190303a());
                }
            }
        };
    }

    /* renamed from: b */
    public String mo122940b() {
        return this.f137604a.getChannel().getId();
    }

    /* renamed from: t */
    public Chatter mo190294t() {
        MessageInfo messageInfo = this.f137605i;
        if (messageInfo == null) {
            return null;
        }
        return messageInfo.getMessageSender();
    }

    /* renamed from: v */
    public boolean mo190296v() {
        ThreadTopic threadTopic = this.f137604a;
        if (threadTopic == null || threadTopic.getStateInfo() == null || this.f137604a.getStateInfo().getState() != ThreadStateInfo.ThreadState.CLOSED) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public void mo190289o() {
        mo127141m();
        MessageInfo messageInfo = this.f137605i;
        if (!(messageInfo == null || messageInfo.getMessage() == null)) {
            if (this.f88882b.getItemByKey(this.f137605i.getMessage().getId()) != null) {
                Log.m165383e("ThreadDetailDataStore", "addTopicMessageInfo topic messageinfo already added");
                return;
            }
        }
        this.f88882b.beginUpdate();
        this.f88882b.add(0, this.f137605i);
        this.f88882b.finishUpdate();
    }

    /* renamed from: a */
    public void mo190280a(boolean z) {
        this.f137606j = z;
    }

    /* renamed from: b */
    public void mo190282b(MessageInfo messageInfo) {
        this.f137605i = messageInfo;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo122939b(MessageInfo messageInfo) {
        return messageInfo.getMessage().getThreadPosition();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo122932a(MessageInfo messageInfo) {
        return messageInfo.getMessage().getThreadBadgeCount();
    }

    /* renamed from: c */
    private boolean m216248c(ThreadInfo threadInfo) {
        if (threadInfo == null || threadInfo.mo126021c() == null || threadInfo.mo126011a() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo190278a(ThreadTopic threadTopic) {
        mo127141m();
        if (threadTopic != null) {
            this.f137604a = threadTopic;
        }
    }

    /* renamed from: b */
    public void mo190283b(ThreadInfo threadInfo) {
        mo127141m();
        if (m216248c(threadInfo)) {
            mo190279a(threadInfo);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo122946d(MessageInfo messageInfo) {
        if (messageInfo.isPreMessage()) {
            return true;
        }
        int d = mo122939b(messageInfo);
        if (this.f88883c == Integer.MAX_VALUE && this.f88884d == Integer.MIN_VALUE) {
            if (this.f88885e.get() < d) {
                return true;
            }
            return false;
        } else if (d < this.f88883c) {
            return false;
        } else {
            if (this.f88884d != -1 && d > this.f88884d + 1) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo190279a(ThreadInfo threadInfo) {
        if (m216248c(threadInfo)) {
            MessageInfo messageInfo = new MessageInfo(threadInfo.mo126021c(), threadInfo.mo126011a());
            this.f137605i = messageInfo;
            messageInfo.setReactionInfoList(threadInfo.getReactionInfoList());
            this.f137605i.setPin(threadInfo.getPin());
            this.f137605i.setTranslateInfo(threadInfo.getTranslateInfo());
            this.f137605i.setIsTranslating(threadInfo.isTranslating());
            this.f137605i.setNeedToAutoTranslate(threadInfo.mo126022d());
            this.f137605i.setOriginalSender(threadInfo.getOriginalSender());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo122949f(MessageInfo messageInfo) {
        super.mo122949f((AbstractC34006a) messageInfo);
        if (m216249w() && this.f137606j) {
            if (messageInfo.getMessage().getType() == Message.Type.TEXT || messageInfo.getMessage().getType() == Message.Type.POST) {
                ((BaseTextContent) messageInfo.getMessage().getContent()).setContentLayout(TextLayoutProcessor.m128385a(messageInfo, TextLayoutProcessor.m128387a().mo122463a(18), this.f137607k));
                if (messageInfo.getTranslateInfo() != null) {
                    ((BaseTextContent) messageInfo.getTranslateInfo().getTranslateContent()).setContentLayout(TextLayoutProcessor.m128385a(messageInfo, TextLayoutProcessor.m128387a().mo122483i(true).mo122463a(18), this.f137607k));
                }
            }
        }
    }

    public C55777a(C33958d dVar, ThreadTopic threadTopic, AbstractC34417b.AbstractC34423e eVar, Context context) {
        super(dVar, eVar);
        this.f137604a = threadTopic;
        this.f137607k = context;
        mo127101a(threadTopic.getLastMsgPos());
    }
}
