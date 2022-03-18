package com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.plugin;

import android.content.Context;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.IKeyboardViewModel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin;
import com.ss.android.lark.keyboard.plugin.input.richtextinput.OnSendRichTextCallBack;
import com.ss.android.lark.statistics.chat.C54948d;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/plugin/RichTextInputShrinkPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "pluginContext", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "callbacks", "", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "(Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;Ljava/util/List;)V", "getCallbacks", "()Ljava/util/List;", "item", "getItem", "()Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "setItem", "(Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;)V", "getPluginContext", "()Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "createPluginImpl", "Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/RichTextInputShrinkPlugin;", "getName", "", "getPlugin", "isEnable", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.a.g */
public final class RichTextInputShrinkPlugin implements IKeyboardCreator.IPlugin<IInputSupportPlugin> {

    /* renamed from: a */
    private IInputSupportPlugin f86424a;

    /* renamed from: b */
    private final IKeyboardCreator.PluginContext f86425b;

    /* renamed from: c */
    private final List<IKeyboardComponent.IKeyboardComponentCallbacks> f86426c;

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
    /* renamed from: a */
    public String mo122012a() {
        return "input_richtext_shrink";
    }

    /* renamed from: e */
    public final IKeyboardCreator.PluginContext mo123243e() {
        return this.f86425b;
    }

    /* renamed from: f */
    public final List<IKeyboardComponent.IKeyboardComponentCallbacks> mo123244f() {
        return this.f86426c;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
    /* renamed from: d */
    public boolean mo122015d() {
        return ChatKBPluginUtil.f86409a.mo123237a();
    }

    /* renamed from: b */
    public IInputSupportPlugin mo122014c() {
        if (this.f86424a == null) {
            this.f86424a = m129996g();
        }
        return this.f86424a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/plugin/RichTextInputShrinkPlugin$createPluginImpl$lifeCycleCallback$1", "Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/BaseRichTextInputPlugin$LifeCycleCallback;", "onResume", "", "onStop", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.a.g$a */
    public static final class C33543a implements BaseRichTextInputPlugin.LifeCycleCallback {

        /* renamed from: a */
        final /* synthetic */ RichTextInputShrinkPlugin f86427a;

        @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin.LifeCycleCallback
        /* renamed from: a */
        public void mo123224a() {
            for (IKeyboardComponent.IKeyboardComponentCallbacks bVar : this.f86427a.mo123244f()) {
                bVar.mo122067b();
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin.LifeCycleCallback
        /* renamed from: b */
        public void mo123225b() {
            for (IKeyboardComponent.IKeyboardComponentCallbacks bVar : this.f86427a.mo123244f()) {
                bVar.mo122065a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33543a(RichTextInputShrinkPlugin gVar) {
            this.f86427a = gVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J(\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/plugin/RichTextInputShrinkPlugin$createPluginImpl$onSendPostCallback$1", "Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/OnSendRichTextCallBack;", "onSendInterrupted", "", "onSendRichText", "title", "", "content", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "triggeredBySendButton", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.a.g$b */
    public static final class C33544b implements OnSendRichTextCallBack {

        /* renamed from: a */
        final /* synthetic */ RichTextInputShrinkPlugin f86428a;

        /* renamed from: b */
        final /* synthetic */ Chat f86429b;

        /* renamed from: c */
        final /* synthetic */ Context f86430c;

        @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.OnSendRichTextCallBack
        /* renamed from: a */
        public void mo123222a() {
            LKUIToast.show(this.f86430c, UIHelper.mustacheFormat((int) R.string.Lark_Group_MsgRestriction_SendFail_Content, "group_name", this.f86429b.getName()));
        }

        C33544b(RichTextInputShrinkPlugin gVar, Chat chat, Context context) {
            this.f86428a = gVar;
            this.f86429b = chat;
            this.f86430c = context;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.OnSendRichTextCallBack
        /* renamed from: a */
        public void mo123223a(String str, String str2, RichText richText, boolean z) {
            IKeyboardViewModel e;
            Intrinsics.checkParameterIsNotNull(str, "title");
            Intrinsics.checkParameterIsNotNull(str2, "content");
            Intrinsics.checkParameterIsNotNull(richText, "richText");
            C54948d.m213138a(z, false, false, 4, null);
            KeyBoard b = this.f86428a.mo123243e().mo122077b();
            if (b != null && (e = this.f86428a.mo123243e().mo122080e()) != null) {
                e.sendPostMsg(str, str2, richText, b.mo146836q(), b.mo146837r());
            }
        }
    }

    /* renamed from: g */
    private final com.ss.android.lark.keyboard.plugin.input.richtextinput.RichTextInputShrinkPlugin m129996g() {
        Chat c = this.f86425b.mo122078c();
        ChatChatter d = this.f86425b.mo122079d();
        Context requireContext = this.f86425b.mo122076a().requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "pluginContext.host.requireContext()");
        return new com.ss.android.lark.keyboard.plugin.input.richtextinput.RichTextInputShrinkPlugin(ChatKBPluginUtil.f86409a.mo123236a(requireContext, c, d), ChatKBPluginUtil.f86409a.mo123235a(c), new C33544b(this, c, requireContext), new C33543a(this), false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.lark.chat.chatwindow.biz.component.keyboard.c$b> */
    /* JADX WARN: Multi-variable type inference failed */
    public RichTextInputShrinkPlugin(IKeyboardCreator.PluginContext cVar, List<? extends IKeyboardComponent.IKeyboardComponentCallbacks> list) {
        Intrinsics.checkParameterIsNotNull(cVar, "pluginContext");
        Intrinsics.checkParameterIsNotNull(list, "callbacks");
        this.f86425b = cVar;
        this.f86426c = list;
    }
}
