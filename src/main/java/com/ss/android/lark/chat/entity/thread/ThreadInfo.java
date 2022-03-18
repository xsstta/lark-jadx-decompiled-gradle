package com.ss.android.lark.chat.entity.thread;

import android.text.TextUtils;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.Pin;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.chat.entity.translate.TranslateInfo;
import com.ss.android.lark.chat.export.entity.message.Content;
import java.util.List;
import java.util.Objects;

public class ThreadInfo implements AbstractC26248b<ThreadInfo>, AbstractC34006a {

    /* renamed from: a */
    private ChatChatter f87929a;

    /* renamed from: b */
    private ThreadTopic f87930b;

    /* renamed from: c */
    private Message f87931c;

    /* renamed from: d */
    private List<ReactionInfo> f87932d;

    /* renamed from: e */
    private List<MessageInfo> f87933e;

    /* renamed from: f */
    private List<MessageInfo> f87934f;

    /* renamed from: g */
    private Pin f87935g;

    /* renamed from: h */
    private TranslateInfo f87936h;

    /* renamed from: i */
    private ChatChatter f87937i;

    /* renamed from: j */
    private String f87938j;

    /* renamed from: k */
    private boolean f87939k = true;

    /* renamed from: l */
    private Boolean f87940l;

    /* renamed from: m */
    private String f87941m;

    /* renamed from: n */
    private RecommendationType f87942n;

    /* renamed from: o */
    private Chat f87943o;

    /* renamed from: p */
    private boolean f87944p;

    /* renamed from: q */
    private List<RecommendTopicGroup> f87945q;

    /* renamed from: r */
    private boolean f87946r;

    /* renamed from: s */
    private TopicGroup.Type f87947s;

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public String getParentId() {
        return "";
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public boolean isIntermediateMessage() {
        return false;
    }

    public enum RecommendationType {
        UNKNOWN_RECOMMENDATION_TYPE(0),
        THREAD(1),
        GROUPS(2),
        QUASI_THREAD(10);
        
        private final int value;

        public int getValue() {
            return this.value;
        }

        public static RecommendationType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_RECOMMENDATION_TYPE;
            }
            if (i == 1) {
                return THREAD;
            }
            if (i == 2) {
                return GROUPS;
            }
            if (i != 10) {
                return UNKNOWN_RECOMMENDATION_TYPE;
            }
            return QUASI_THREAD;
        }

        private RecommendationType(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public ChatChatter mo126011a() {
        return this.f87929a;
    }

    /* renamed from: b */
    public ThreadTopic mo126018b() {
        return this.f87930b;
    }

    /* renamed from: c */
    public Message mo126021c() {
        return this.f87931c;
    }

    /* renamed from: d */
    public boolean mo126022d() {
        return this.f87939k;
    }

    /* renamed from: e */
    public List<MessageInfo> mo126023e() {
        return this.f87933e;
    }

    /* renamed from: f */
    public List<MessageInfo> mo126024f() {
        return this.f87934f;
    }

    /* renamed from: g */
    public ChatChatter getOriginalSender() {
        return this.f87937i;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.OpenMessageInfo, com.ss.android.lark.chat.entity.message.AbstractC34006a
    public Message getMessage() {
        return this.f87931c;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.OpenMessageInfo, com.ss.android.lark.chat.entity.message.AbstractC34006a
    public ChatChatter getMessageSender() {
        return this.f87929a;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public Pin getPin() {
        return this.f87935g;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public List<ReactionInfo> getReactionInfoList() {
        return this.f87932d;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public TranslateInfo getTranslateInfo() {
        return this.f87936h;
    }

    /* renamed from: h */
    public String mo126026h() {
        return this.f87941m;
    }

    /* renamed from: i */
    public RecommendationType mo126027i() {
        return this.f87942n;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public boolean isNeedToAutoTranslate() {
        return this.f87939k;
    }

    /* renamed from: j */
    public Chat mo126028j() {
        return this.f87943o;
    }

    /* renamed from: k */
    public String mo126029k() {
        return this.f87938j;
    }

    public ThreadInfo() {
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public boolean canShow() {
        return this.f87931c.canShow();
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public AbstractC34006a doCopy() {
        return new ThreadInfo(this);
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public String getId() {
        return this.f87930b.getId();
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public long getUpdateTime() {
        return this.f87930b.getUpdateTime();
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public String getcId() {
        return this.f87931c.getcId();
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public boolean isPreMessage() {
        return this.f87931c.isPreMessage();
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public boolean isTranslatingInited() {
        if (this.f87940l != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a, java.lang.Object
    public AbstractC34006a clone() {
        try {
            return (AbstractC34006a) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public boolean isTranslating() {
        Boolean bool = this.f87940l;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public boolean isNoTraceDelete() {
        if (this.f87930b.isNoTraceDelete() || this.f87931c.isNoTraceDelete()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public boolean isShowMessageOriginContent() {
        String translateLanguage = getMessage().getTranslateLanguage();
        TranslateInfo translateInfo = getTranslateInfo();
        if (TextUtils.isEmpty(translateLanguage) || translateInfo == null || !translateLanguage.equals(translateInfo.getLanguage()) || getMessage().getStatus() == Message.Status.DELETED) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (mo126027i() == RecommendationType.GROUPS) {
            return "";
        }
        return "id:" + this.f87930b.getId() + ", position:" + this.f87930b.getPosition() + ", badgeCount:" + this.f87930b.getBadgeCount() + ", messageType:" + this.f87931c.getType();
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public void setForceUpdate(boolean z) {
        this.f87946r = z;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public void setMessage(Message message) {
        this.f87931c = message;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public void setMessageSender(ChatChatter chatChatter) {
        this.f87929a = chatChatter;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public void setNeedToAutoTranslate(boolean z) {
        this.f87939k = z;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public void setPin(Pin pin) {
        this.f87935g = pin;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public void setReactionInfoList(List<ReactionInfo> list) {
        this.f87932d = list;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public void setTranslateInfo(TranslateInfo translateInfo) {
        this.f87936h = translateInfo;
    }

    /* renamed from: a */
    public void mo126012a(ThreadTopic threadTopic) {
        this.f87930b = threadTopic;
    }

    /* renamed from: b */
    public void mo126019b(List<MessageInfo> list) {
        this.f87934f = list;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public void setFollow(boolean z) {
        this.f87930b.setFollow(z);
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public void setIsTranslating(boolean z) {
        this.f87940l = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public void mo126013a(Chat chat) {
        this.f87943o = chat;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public void setNoTraceDelete(boolean z) {
        this.f87931c.setNoTraceDelete(z);
        this.f87930b.setNoTraceDelete(z);
    }

    /* renamed from: a */
    public void mo126014a(ChatChatter chatChatter) {
        this.f87937i = chatChatter;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public Content getTranslateContent(boolean z) {
        if (z) {
            return getMessage().getContent();
        }
        return getTranslateInfo().getTranslateContent();
    }

    /* renamed from: a */
    public void mo126015a(String str) {
        this.f87938j = str;
    }

    public ThreadInfo(ThreadInfo threadInfo) {
        this.f87929a = threadInfo.f87929a;
        this.f87930b = threadInfo.f87930b;
        this.f87931c = threadInfo.f87931c;
        this.f87932d = threadInfo.f87932d;
        this.f87933e = threadInfo.f87933e;
        this.f87935g = threadInfo.f87935g;
        this.f87936h = threadInfo.f87936h;
        this.f87939k = threadInfo.f87939k;
        this.f87940l = threadInfo.f87940l;
        this.f87941m = threadInfo.f87941m;
        this.f87942n = threadInfo.f87942n;
        this.f87944p = threadInfo.f87944p;
        this.f87947s = threadInfo.f87947s;
        this.f87943o = threadInfo.f87943o;
        this.f87945q = threadInfo.f87945q;
        this.f87937i = threadInfo.f87937i;
        this.f87934f = threadInfo.f87934f;
        this.f87938j = threadInfo.f87938j;
        this.f87946r = threadInfo.f87946r;
    }

    /* renamed from: a */
    public void mo126016a(List<MessageInfo> list) {
        this.f87933e = list;
    }

    /* renamed from: a */
    public boolean isItemSame(ThreadInfo threadInfo) {
        if (this.f87942n == RecommendationType.GROUPS && threadInfo.mo126027i() == RecommendationType.GROUPS) {
            return true;
        }
        return Objects.equals(this.f87930b.getId(), threadInfo.mo126018b().getId());
    }

    /* renamed from: b */
    public boolean isContentSame(ThreadInfo threadInfo) {
        TranslateInfo translateInfo;
        if (threadInfo.mo126027i() == RecommendationType.GROUPS) {
            if (C26247a.m94982a((List) this.f87945q, (List) threadInfo.f87945q) && this.f87944p == threadInfo.f87944p) {
                return true;
            }
            return false;
        } else if (!C26247a.m94983b(this.f87929a, threadInfo.f87929a) || !C26247a.m94983b(this.f87931c, threadInfo.f87931c) || !C26247a.m94983b(this.f87930b, threadInfo.f87930b) || !C26247a.m94982a((List) this.f87933e, (List) threadInfo.f87933e) || !C26247a.m94982a((List) this.f87934f, (List) threadInfo.f87934f) || !C26247a.m94983b(this.f87937i, threadInfo.f87937i)) {
            return false;
        } else {
            TranslateInfo translateInfo2 = this.f87936h;
            if ((translateInfo2 == null || (translateInfo = threadInfo.f87936h) == null || translateInfo2.equals(translateInfo)) && this.f87939k == threadInfo.f87939k && this.f87940l.equals(threadInfo.f87940l) && this.f87938j.equals(threadInfo.f87938j)) {
                return true;
            }
            return false;
        }
    }

    public ThreadInfo(ChatChatter chatChatter, ThreadTopic threadTopic, Message message) {
        this.f87929a = chatChatter;
        this.f87930b = threadTopic;
        this.f87931c = message;
    }
}
