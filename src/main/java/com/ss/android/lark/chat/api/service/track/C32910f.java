package com.ss.android.lark.chat.api.service.track;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.secretchat.data.decrypt.SecretContentResolver;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.BaseTextContent;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.entity.reaction.Reaction;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.chat.utils.C34352r;
import com.ss.android.lark.widget.richtext.C59031e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.api.service.track.f */
public class C32910f {

    /* renamed from: a */
    private final List<MessageInfo> f84516a;

    /* renamed from: b */
    private MessageInfo f84517b;

    /* renamed from: c */
    private List<String> f84518c;

    /* renamed from: d */
    private List<String> f84519d;

    /* renamed from: e */
    private List<String> f84520e;

    /* renamed from: c */
    public List<MessageInfo> mo121425c() {
        return new ArrayList(this.f84516a);
    }

    /* renamed from: a */
    public boolean mo121423a() {
        List<MessageInfo> list = this.f84516a;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public MessageInfo mo121424b() {
        if (this.f84517b == null) {
            this.f84517b = this.f84516a.get(0);
        }
        return this.f84517b;
    }

    /* renamed from: e */
    public List<String> mo121427e() {
        if (this.f84519d == null) {
            this.f84519d = m126687b(mo121424b());
        }
        return this.f84519d;
    }

    /* renamed from: f */
    public List<String> mo121428f() {
        if (this.f84520e == null) {
            this.f84520e = m126686a(mo121424b());
        }
        return this.f84520e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public List<String> mo121426d() {
        if (this.f84518c == null) {
            MessageInfo b = mo121424b();
            HashSet hashSet = new HashSet();
            if (C34352r.m133235b(b)) {
                for (ReactionInfo reactionInfo : b.getReactionInfoList()) {
                    Reaction reaction = reactionInfo.getReaction();
                    if (!(reaction == null || reaction.getChatterIds() == null)) {
                        hashSet.addAll(reaction.getChatterIds());
                    }
                }
            }
            hashSet.remove(C29990c.m110930b().mo134515N().mo134394a());
            this.f84518c = new ArrayList(hashSet);
        }
        return this.f84518c;
    }

    public C32910f(List<MessageInfo> list) {
        this.f84516a = list;
    }

    /* renamed from: a */
    public static List<String> m126686a(MessageInfo messageInfo) {
        ArrayList arrayList = new ArrayList(messageInfo.getMessage().getReadAtChatterIds());
        arrayList.remove(C29990c.m110930b().mo134515N().mo134394a());
        arrayList.remove("1");
        return arrayList;
    }

    /* renamed from: b */
    public static List<String> m126687b(MessageInfo messageInfo) {
        BaseTextContent baseTextContent;
        ArrayList arrayList = new ArrayList();
        Message.Type type = messageInfo.getMessage().getType();
        if (type == Message.Type.TEXT || type == Message.Type.POST) {
            if (type == Message.Type.TEXT) {
                baseTextContent = (TextContent) SecretContentResolver.m131240a().mo123955b(messageInfo.getMessage());
            } else {
                baseTextContent = (PostContent) messageInfo.getMessage().getContent();
            }
            if (baseTextContent != null) {
                arrayList.addAll(C59031e.m229178a(baseTextContent.getRichText(), false));
                arrayList.remove(C29990c.m110930b().mo134515N().mo134394a());
                arrayList.remove("1");
            }
        }
        return arrayList;
    }
}
