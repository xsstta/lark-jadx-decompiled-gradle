package com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.plugin;

import android.content.Context;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.IKeyboardViewModel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin;
import com.ss.android.lark.keyboard.plugin.input.richtextinput.OnSendRichTextCallBack;
import com.ss.android.lark.statistics.chat.C54948d;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/plugin/RichTextInputExpandPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "pluginContext", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "(Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;)V", "item", "getItem", "()Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "setItem", "(Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;)V", "getPluginContext", "()Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "createPluginImpl", "Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/RichTextInputExpandPlugin;", "getName", "", "getPlugin", "isEnable", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.a.f */
public final class RichTextInputExpandPlugin implements IKeyboardCreator.IPlugin<IInputSupportPlugin> {

    /* renamed from: a */
    private IInputSupportPlugin f86418a;

    /* renamed from: b */
    private final IKeyboardCreator.PluginContext f86419b;

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
    /* renamed from: a */
    public String mo122012a() {
        return "input_richtext_expand";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/plugin/RichTextInputExpandPlugin$createPluginImpl$2", "Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/BaseRichTextInputPlugin$LifeCycleCallback;", "onResume", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.a.f$b */
    public static final class C33542b implements BaseRichTextInputPlugin.LifeCycleCallback {

        /* renamed from: a */
        final /* synthetic */ Chat f86423a;

        @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin.LifeCycleCallback
        /* renamed from: b */
        public void mo123225b() {
            BaseRichTextInputPlugin.LifeCycleCallback.C40698a.m161059a(this);
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin.LifeCycleCallback
        /* renamed from: a */
        public void mo123224a() {
            ChatHitPointNew.Companion.m213105a(ChatHitPointNew.f135660c, this.f86423a, "post", "im_chat_post_view", (Map) null, 8, (Object) null);
        }

        C33542b(Chat chat) {
            this.f86423a = chat;
        }
    }

    /* renamed from: e */
    public final IKeyboardCreator.PluginContext mo123241e() {
        return this.f86419b;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
    /* renamed from: d */
    public boolean mo122015d() {
        return ChatKBPluginUtil.f86409a.mo123237a();
    }

    /* renamed from: b */
    public IInputSupportPlugin mo122014c() {
        if (this.f86418a == null) {
            this.f86418a = m129986f();
        }
        return this.f86418a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J(\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/plugin/RichTextInputExpandPlugin$createPluginImpl$1", "Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/OnSendRichTextCallBack;", "onSendInterrupted", "", "onSendRichText", "title", "", "content", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "triggeredBySendButton", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.a.f$a */
    public static final class C33541a implements OnSendRichTextCallBack {

        /* renamed from: a */
        final /* synthetic */ RichTextInputExpandPlugin f86420a;

        /* renamed from: b */
        final /* synthetic */ Chat f86421b;

        /* renamed from: c */
        final /* synthetic */ Context f86422c;

        @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.OnSendRichTextCallBack
        /* renamed from: a */
        public void mo123222a() {
            LKUIToast.show(this.f86422c, UIHelper.mustacheFormat((int) R.string.Lark_Group_MsgRestriction_SendFail_Content, "group_name", this.f86421b.getName()));
        }

        C33541a(RichTextInputExpandPlugin fVar, Chat chat, Context context) {
            this.f86420a = fVar;
            this.f86421b = chat;
            this.f86422c = context;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.OnSendRichTextCallBack
        /* renamed from: a */
        public void mo123223a(String str, String str2, RichText richText, boolean z) {
            IKeyboardViewModel e;
            Intrinsics.checkParameterIsNotNull(str, "title");
            Intrinsics.checkParameterIsNotNull(str2, "content");
            Intrinsics.checkParameterIsNotNull(richText, "richText");
            C54948d.m213138a(z, true, false, 4, null);
            KeyBoard b = this.f86420a.mo123241e().mo122077b();
            if (b != null && (e = this.f86420a.mo123241e().mo122080e()) != null) {
                e.sendPostMsg(str, str2, richText, b.mo146836q(), b.mo146837r());
            }
        }
    }

    /* renamed from: f */
    private final com.ss.android.lark.keyboard.plugin.input.richtextinput.RichTextInputExpandPlugin m129986f() {
        Chat c = this.f86419b.mo122078c();
        ChatChatter d = this.f86419b.mo122079d();
        Context requireContext = this.f86419b.mo122076a().requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "pluginContext.host.requireContext()");
        return new com.ss.android.lark.keyboard.plugin.input.richtextinput.RichTextInputExpandPlugin(ChatKBPluginUtil.f86409a.mo123236a(requireContext, c, d), new C33541a(this, c, requireContext), new C33542b(c));
    }

    public RichTextInputExpandPlugin(IKeyboardCreator.PluginContext cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "pluginContext");
        this.f86419b = cVar;
    }
}
