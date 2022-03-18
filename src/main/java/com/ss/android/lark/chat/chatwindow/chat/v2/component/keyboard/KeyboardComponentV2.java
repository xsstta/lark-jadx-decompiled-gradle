package com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.EditText;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.BaseKeyboardComponentV2;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardDependenceViewModel;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardComponentDependency;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.plugin.ChatKBPluginUtil;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.plugin.input.richtextinput.RichTextInputShrinkPlugin;
import com.ss.android.lark.keyboard.plugin.input.textinput.TextInputSupportPlugin;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ&\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u001a\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponentV2;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/BaseKeyboardComponentV2;", "mContext", "Landroid/app/Activity;", "hostVM", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardDependenceViewModel;", "mDependency", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardComponentDependency;", "(Landroid/app/Activity;Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardDependenceViewModel;Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardComponentDependency;)V", "appendText", "", "text", "Lcom/ss/android/lark/widget/richtext/RichText;", "title", "", "postText", "createKeyboardPluginFactory", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IKeyboardPluginFactory;", "pluginContext", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "enterReplyMode", "replyInfo", "Lcom/ss/android/lark/chatwindow/model/data/ReplyInfo;", "isReEdit", "", "resetOnStart", "setupKeyboardEnable", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "chatChatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class KeyboardComponentV2 extends BaseKeyboardComponentV2 {

    /* renamed from: g */
    private final Activity f86404g;

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.BaseKeyboardComponentV2
    /* renamed from: a */
    public IKeyboardCreator.IKeyboardPluginFactory mo121966a(IKeyboardCreator.PluginContext cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "pluginContext");
        return new ChatKeyboardPluginFactory(cVar, mo121968a());
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.BaseKeyboardComponentV2
    /* renamed from: a */
    public void mo121973a(Chat chat, ChatChatter chatChatter) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        KeyBoard b = mo121982b();
        if (b != null) {
            if (ChatKBPluginUtil.f86409a.mo123237a()) {
                RichTextInputShrinkPlugin dVar = (RichTextInputShrinkPlugin) b.mo146821d("input_richtext_shrink");
                if (dVar != null) {
                    dVar.mo147111a(ChatKBPluginUtil.f86409a.mo123236a(this.f86404g, chat, chatChatter), ChatKBPluginUtil.f86409a.mo123235a(chat));
                }
            } else {
                TextInputSupportPlugin cVar = (TextInputSupportPlugin) b.mo146821d("text");
                if (cVar != null) {
                    cVar.mo147252a(ChatKBPluginUtil.f86409a.mo123236a(this.f86404g, chat, chatChatter), ChatKBPluginUtil.f86409a.mo123235a(chat));
                }
            }
            b.mo146810a(chat.isAllowPost());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyboardComponentV2(Activity activity, IKeyboardDependenceViewModel eVar, KeyboardComponentDependency fVar) {
        super(activity, eVar, fVar);
        Intrinsics.checkParameterIsNotNull(activity, "mContext");
        Intrinsics.checkParameterIsNotNull(eVar, "hostVM");
        Intrinsics.checkParameterIsNotNull(fVar, "mDependency");
        this.f86404g = activity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (r9 != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        if (com.ss.android.lark.widget.richtext.C59035h.m229210a(r4) == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        r9 = false;
     */
    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo122063a(com.ss.android.lark.chatwindow.p1720a.p1721a.C35221d r18, boolean r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 248
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponentV2.mo122063a(com.ss.android.lark.chatwindow.a.a.d, boolean, boolean):void");
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: a */
    public void mo122064a(RichText richText, String str, RichText richText2) {
        boolean a = ChatKBPluginUtil.f86409a.mo123237a();
        KeyBoard b = mo121982b();
        if (b != null) {
            if (a) {
                if (richText2 != null) {
                    richText = richText2;
                }
                b.mo146802a(null, str, richText, true);
            } else {
                b.mo146802a(richText, str, richText2, true);
            }
            if (a || (TextUtils.isEmpty(str) && C59035h.m229210a(richText2))) {
                EditText l = b.mo146827h().mo146904l();
                if (l != null) {
                    l.requestFocus();
                }
                b.mo146829j();
                return;
            }
            b.mo146803a("post");
        }
    }
}
