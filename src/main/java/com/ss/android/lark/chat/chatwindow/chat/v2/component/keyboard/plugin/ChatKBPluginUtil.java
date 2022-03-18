package com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.plugin;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.larksuite.framework.utils.C26325y;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterCustomStatus;
import com.ss.android.lark.chat.text.ChatterStatusEmojiSpan;
import com.ss.android.lark.chat.text.TextWithEmojiHintSpan;
import com.ss.android.lark.chat.utils.C34340h;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/plugin/ChatKBPluginUtil;", "", "()V", "getKeyboardHint", "", "context", "Landroid/content/Context;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "getKeyboardHintColor", "", "getP2PKeyboardHint", "isRichTextEditorEnable", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.a.b */
public final class ChatKBPluginUtil {

    /* renamed from: a */
    public static final ChatKBPluginUtil f86409a = new ChatKBPluginUtil();

    private ChatKBPluginUtil() {
    }

    /* renamed from: a */
    public final boolean mo123237a() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        return b.mo134586n().mo134685a("messenger.message_inputbox_redesign");
    }

    /* renamed from: a */
    public final int mo123235a(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        if (chat.isAllowPost()) {
            return UIHelper.getColor(R.color.text_placeholder);
        }
        return UIHelper.getColor(R.color.ud_N300);
    }

    /* renamed from: a */
    public final CharSequence mo123236a(Context context, Chat chat, Chatter chatter) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        if (chat.isAllowPost()) {
            Chat.Type type = chat.getType();
            if (type != null) {
                int i = C33537c.f86410a[type.ordinal()];
                if (i == 1) {
                    return m129970b(context, chat, chatter);
                }
                if (i == 2) {
                    TextWithEmojiHintSpan.Companion aVar = TextWithEmojiHintSpan.f87592a;
                    String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_SendTip, "name", chat.getName());
                    Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…  \"name\", chat.getName())");
                    return aVar.mo124139a(mustacheFormat);
                }
            }
            TextWithEmojiHintSpan.Companion aVar2 = TextWithEmojiHintSpan.f87592a;
            String mustacheFormat2 = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_SendTip, "name", C34340h.m133174a(chatter, ChatterNameDisplayRule.ALIAS_NAME));
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat2, "UIHelper.mustacheFormat(…ame(chatter, ALIAS_NAME))");
            return aVar2.mo124139a(mustacheFormat2);
        }
        TextWithEmojiHintSpan.Companion aVar3 = TextWithEmojiHintSpan.f87592a;
        String string = UIHelper.getString(R.string.Lark_Group_GroupSettings_MsgRestriction_YouAreBanned_InputHint);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…n_YouAreBanned_InputHint)");
        return aVar3.mo124139a(string);
    }

    /* renamed from: b */
    private final CharSequence m129970b(Context context, Chat chat, Chatter chatter) {
        String str;
        List<ChatterCustomStatus> customStatus;
        Chatter.ChatterCustomStatus chatterCustomStatus = null;
        if (chatter != null) {
            str = chatter.getId();
        } else {
            str = null;
        }
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36450aa N = b.mo134515N();
        Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
        if (C26325y.m95336b(str, N.mo134394a())) {
            TextWithEmojiHintSpan.Companion aVar = TextWithEmojiHintSpan.f87592a;
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_MessageToYourself);
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…Legacy_MessageToYourself)");
            return aVar.mo124139a(mustacheFormat);
        }
        String mustacheFormat2 = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_SendTip, "name", C34340h.m133174a(chatter, ChatterNameDisplayRule.ALIAS_NAME));
        AbstractC36474h b2 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
        if (!b2.ax()) {
            Log.m165389i("ChatterStatusEmojiSpan", "getP2PKeyboardHint FG false");
            TextWithEmojiHintSpan.Companion aVar2 = TextWithEmojiHintSpan.f87592a;
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat2, "sendTip");
            return aVar2.mo124139a(mustacheFormat2);
        }
        if (!(chatter == null || (customStatus = chatter.getCustomStatus()) == null)) {
            chatterCustomStatus = C29990c.m110930b().mo134529a(ChatterCustomStatus.Companion.mo124851b(customStatus));
        }
        if (chatterCustomStatus == null) {
            Log.m165389i("ChatterStatusEmojiSpan", "getP2PKeyboardHint status=null");
            TextWithEmojiHintSpan.Companion aVar3 = TextWithEmojiHintSpan.f87592a;
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat2, "sendTip");
            return aVar3.mo124139a(mustacheFormat2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(mustacheFormat2, new TextWithEmojiHintSpan(), 33);
        ChatterStatusEmojiSpan.Companion aVar4 = ChatterStatusEmojiSpan.f87587a;
        String str2 = chatterCustomStatus.icon_key;
        Intrinsics.checkExpressionValueIsNotNull(str2, "status.icon_key");
        aVar4.mo124137a(spannableStringBuilder, context, str2);
        spannableStringBuilder.append(chatterCustomStatus.title, new TextWithEmojiHintSpan(), 33);
        return spannableStringBuilder;
    }
}
