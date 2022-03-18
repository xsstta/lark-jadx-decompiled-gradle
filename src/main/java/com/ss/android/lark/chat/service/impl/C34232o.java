package com.ss.android.lark.chat.service.impl;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.p1408a.C29597a;
import com.ss.android.lark.chat.api.service.AbstractC32902e;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatterInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.utils.C34349o;
import com.ss.android.lark.chat.utils.C34350p;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.service.impl.o */
public class C34232o implements AbstractC32902e {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.o$a */
    public static final class C34234a {

        /* renamed from: a */
        public static final C34232o f88541a = new C34232o();
    }

    private C34232o() {
    }

    /* renamed from: a */
    public static C34232o m132851a() {
        return C34234a.f88541a;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:31:0x00da */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.text.SpannableStringBuilder */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: android.text.SpannableStringBuilder */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: android.text.SpannableStringBuilder */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.lark.chat.api.service.AbstractC32902e
    /* renamed from: a */
    public C29597a mo121388a(MergeForwardContent mergeForwardContent) {
        SpannableStringBuilder spannableStringBuilder;
        String str = "";
        if (mergeForwardContent != null) {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(mergeForwardContent.getQuasiTitle())) {
                sb.append(mergeForwardContent.getQuasiTitle());
            } else if (mergeForwardContent.getType() == Chat.Type.P2P) {
                String p2pCreatorName = mergeForwardContent.getP2pCreatorName();
                String p2pPartnerName = mergeForwardContent.getP2pPartnerName();
                sb.append(p2pCreatorName);
                if (!TextUtils.isEmpty(p2pPartnerName)) {
                    sb.append(UIHelper.getString(R.string.Lark_Legacy_MergeForwardAnd));
                    sb.append(p2pPartnerName);
                }
                sb.append(UIHelper.getString(R.string.Lark_Legacy_MergeForwardTitleSuffix));
            } else {
                sb.append(UIHelper.getString(R.string.Lark_Legacy_GroupChatHistory));
            }
            str = sb.toString();
            spannableStringBuilder = new SpannableStringBuilder();
            List<Message> messages = mergeForwardContent.getMessages();
            if (!CollectionUtils.isEmpty(messages)) {
                Map<String, ChatterInfo> chatters = mergeForwardContent.getChatters();
                int min = Math.min(messages.size(), 5);
                for (int i = 0; i < min; i++) {
                    Message message = messages.get(i);
                    ChatterInfo chatterInfo = chatters.get(message.getFromId());
                    if (chatterInfo != null) {
                        spannableStringBuilder.append((CharSequence) chatterInfo.getName()).append((CharSequence) ": ");
                    }
                    if (mergeForwardContent.isTranslated() && C34350p.m133219b(message)) {
                        spannableStringBuilder.append((CharSequence) UIHelper.getString(R.string.Lark_Legacy_TranslateInChat));
                    }
                    spannableStringBuilder.append(C34349o.m133201a(C29990c.m110930b().mo134528a(), message, true, C52990a.m205239c(C29990c.m110930b().mo134528a(), R.color.text_caption)));
                    if (i != min - 1) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                }
            }
        } else {
            spannableStringBuilder = str;
        }
        return new C29597a(str, spannableStringBuilder);
    }
}
